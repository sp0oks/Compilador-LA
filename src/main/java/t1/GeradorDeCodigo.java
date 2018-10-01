package t1;

import java.util.ArrayList;

public class GeradorDeCodigo extends LABaseVisitor<String> {
    SaidaParser sp;
    PilhaDeTabelas escopos;
    EntradaTabelaDeSimbolos registroAtual;

    public GeradorDeCodigo(SaidaParser sp) { this.sp = sp; }

    public String expressao2C (String exp) {
        // Função auxiliar para converter expressões lógicas em LA para expressões lógicas válidas em C
        return exp.replaceAll(" ou ", " || ").replaceAll(" e ", " && ").replaceAll("nao", "!").replaceAll("=", "==").replaceAll("<>", "!=").replaceAll(">==", ">=").replaceAll("<==", "<=");
    }

    public String tipo2C (String tipo) {
        // Função auxiliar para converter tipos em LA para tipos válidos em C
        switch (tipo) {
            case "inteiro":
                tipo = "int";
                break;
            case "real":
                tipo = "double";
                break;
            case "literal":
                tipo = "char*";
                break;
            case "logico":
                tipo = "int";
                break;
            default:
                break;
        }
        return tipo;
    }

    @Override
    public String visitPrograma (LAParser.ProgramaContext ctx) {
        /* programa : declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
        escopos = new PilhaDeTabelas();
        escopos.empilhar(new TabelaDeSimbolos("global"));
        sp.println("#include <stdio.h>");
        sp.println("#include <stdlib.h>");
        sp.println("#include <string.h>");
        sp.println("");
        visitDeclaracoes(ctx.declaracoes());
        sp.println("int main() {");
        visitCorpo(ctx.corpo());
        sp.println("return 0;");
        sp.println("}");
        return null;
    }
   
    @Override 
    public String visitDeclaracao_local_var (LAParser.Declaracao_local_varContext ctx) {
        /* declaracao_local : 'declare'  variavel */
        if (ctx.variavel().tipo().registro() != null) {
            if (!escopos.topo().existeSimbolo(ctx.variavel().tipo().getText())) {
                for (LAParser.IdentificadorContext id : ctx.variavel().identificador()) {
                    String var = id.getText();
                    sp.println("struct {");
                    registroAtual = new EntradaTabelaDeSimbolos(var, "registro", LAEnums.TipoDeDado.REGISTRO);
                    visitTipo(ctx.variavel().tipo());
                    registroAtual = null;
                    sp.println("} " + var + ";");
                    escopos.topo().adicionarSimbolo(var, "registro", LAEnums.TipoDeDado.REGISTRO);
                }
            }
        }
        else if (escopos.topo().existeSimbolo(ctx.variavel().tipo().getText()) && escopos.topo().getTipoSimbolo(ctx.variavel().tipo().getText()).equals("tipo")) {
            for (LAParser.IdentificadorContext id : ctx.variavel().identificador()) {
                String var = id.getText();
                registroAtual = new EntradaTabelaDeSimbolos(var, ctx.variavel().tipo().getText(), LAEnums.TipoDeDado.VARIAVEL);
                visitVariavel(ctx.variavel());
                registroAtual = null;
            }
        } else { visitVariavel(ctx.variavel()); }
        return null;
    }

    @Override
    public String visitDeclaracao_local_const (LAParser.Declaracao_local_constContext ctx) {
        /* declaracao_local : 'constante'  IDENT ':' tipo_basico '=' valor_constante */
        String id = ctx.IDENT().getText();
        String valor = ctx.valor_constante().getText();
        sp.println("#define " + id + " " + valor);
        return null;
    }

    @Override
    public String visitDeclaracao_local_tipo (LAParser.Declaracao_local_tipoContext ctx) {
        /* declaracao_local : 'tipo'  IDENT ':' tipo # declaracao_local_tipo */
        String id = ctx.IDENT().getText();
        String tipo = (ctx.tipo().getText().startsWith("registro")) ? "struct" : "";

        sp.println("typedef " + tipo + " {");
        registroAtual = new EntradaTabelaDeSimbolos(id, "tipo", LAEnums.TipoDeDado.TIPO);
        visitTipo(ctx.tipo());
        registroAtual = null;
        sp.println("} " + id + ";");
        escopos.topo().adicionarSimbolo(id, "tipo", LAEnums.TipoDeDado.TIPO);
        return null;
    }

    @Override
    public String visitDeclaracao_global_proc (LAParser.Declaracao_global_procContext ctx) {
        /* declaracao_global : 'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento' */
        escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), "vazio", LAEnums.TipoDeDado.FUNCAO);
        escopos.empilhar(new TabelaDeSimbolos("funcao"));
        sp.print("void " + ctx.IDENT().getText() + " (");
        if (ctx.parametros() != null) { visitParametros(ctx.parametros()); }
        sp.println(") {");
        for (LAParser.Declaracao_localContext decl : ctx.declaracao_local()) { visit(decl); }
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        escopos.desempilhar();
        sp.println("}");
        return null;
    }

    @Override
    public String visitDeclaracao_global_func (LAParser.Declaracao_global_funcContext ctx) {
        /* declaracao_global : 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' */
        String tipoRetorno = tipo2C(ctx.tipo_estendido().getText());

        escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), ctx.tipo_estendido().getText(), LAEnums.TipoDeDado.FUNCAO);
        escopos.empilhar(new TabelaDeSimbolos("funcao"));
        sp.print(tipoRetorno + " " + ctx.IDENT().getText() + " (");
        if (ctx.parametros() != null) { visitParametros(ctx.parametros()); }
        sp.println(") {");
        for (LAParser.Declaracao_localContext decl : ctx.declaracao_local()) { visit(decl); }
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        escopos.desempilhar();
        sp.println("}");
        return null;
    }

    @Override
    public String visitParametro (LAParser.ParametroContext ctx) {
        /* parametro : 'var'? identificador (',' identificador)* ':' tipo_estendido */
        String tipoVar = tipo2C(ctx.tipo_estendido().getText());
        boolean primeiro = true;

        for (LAParser.IdentificadorContext id : ctx.identificador()) {
            escopos.topo().adicionarSimbolo(id.getText(), ctx.tipo_estendido().getText(), LAEnums.TipoDeDado.VARIAVEL);
            if (!primeiro) { sp.print(", "); }
            sp.print(tipoVar + " " + id.getText());
            primeiro = false;
        }
        return null;
    }

    @Override
    public String visitVariavel (LAParser.VariavelContext ctx) {
        /* variavel : identificador (',' identificador)* ':' tipo */
        String tipo = ctx.tipo().getText();
        LAEnums.TipoDeDado tpd = LAEnums.TipoDeDado.VARIAVEL;
        boolean primeiro = true;
        boolean string = false;
        boolean ponteiro = false;
        boolean registro = false;

        if (tipo.startsWith("^")) {
            ponteiro = true;
            tipo = tipo.substring(tipo.indexOf("^")+1);
        }
        switch (tipo) {
        case "inteiro":
          sp.print("int ");
          break;
        case "real":
          sp.print("double ");
          break;
        case "literal":
          sp.print("char ");
          string = true;
          break;
        case "logico":
          sp.print("int ");
          break;
        case "registro":
          break;
        default:
          sp.print(tipo + " ");
          registro = true;
          break;
        }
        for (LAParser.IdentificadorContext id : ctx.identificador()) {
            String var = id.getText();
            if (id.dimensao() != null) {
                tpd = LAEnums.TipoDeDado.VETOR;
                var = var.substring(0, var.indexOf("["));
            }
            if (registroAtual != null && !registro) {
                var = registroAtual.getNome() + "." + var;
            }
            if (registro) {
                ArrayList<EntradaTabelaDeSimbolos> atributos = new ArrayList<>();
                for (EntradaTabelaDeSimbolos etd : escopos.topo().getSimbolos()) {
                    if (etd.getNome().startsWith(tipo) && etd.getTipoDeDado() != LAEnums.TipoDeDado.TIPO) {
                        String atr = var + etd.getNome().substring(etd.getNome().indexOf("."));
                        atributos.add(new EntradaTabelaDeSimbolos(atr, etd.getTipo(), etd.getTipoDeDado()));
                    }
                }
                for (EntradaTabelaDeSimbolos atr : atributos) {
                    escopos.topo().adicionarSimbolo(atr.getNome(), atr.getTipo(), atr.getTipoDeDado());
                }
            }
            escopos.topo().adicionarSimbolo(var, tipo, tpd);
            if(!primeiro) { sp.print(", "); }
            if(ponteiro) { sp.print("*"); }
            sp.print(id.getText());
            if(string) { sp.print("[256]"); }
            primeiro = false;
        }
        sp.println(";");
        return null;
    }

    @Override
    public String visitIdentificador (LAParser.IdentificadorContext ctx) {
        /* identificador : IDENT ('.'  IDENT)* dimensao; */
        String nome = ctx.IDENT().get(0).getText();
        for(int i = 1; i < ctx.IDENT().size(); i++) nome += "." + ctx.IDENT().get(i).getText();
        if (ctx.dimensao() != null) { visitDimensao(ctx.dimensao()); }
        return escopos.getTipoSimbolo(nome);
    }

    @Override
    public String visitCmdLeia (LAParser.CmdLeiaContext ctx) {
        /* cmd : 'leia' '(' '^'? identificador (',' identificador)* ')'  # cmdLeia */
        String arg = "";
        String var = "";
        boolean primeiro = true;

        for (LAParser.IdentificadorContext id : ctx.identificador()) {
          String tipo = escopos.getTipoSimbolo(id.getText());
          if (!primeiro) { arg += " "; }
          if(tipo != null){
                switch (tipo) {
                case "inteiro":
                  arg += "%d";
                  break;
                case "literal":
                  arg += "%s";
                  break;
                case "real":
                  arg += "%lf";
                  break;
                case "logico":
                  arg += "%d";
                  break;
                default:
                  break;
                }
          }
          var += ",&" + id.getText();
          primeiro = false;
        }
        sp.println("scanf(\"" + arg + "\"" + var + ");");
        return null;
    }

    @Override
    public String visitCmdEscreva (LAParser.CmdEscrevaContext ctx) {
        /* cmd : 'escreva' '(' expressao (',' expressao)* ')'    # cmdEscreva*/
        String arg = "";
        String var = "";
        String strg = "";
        for (LAParser.ExpressaoContext exp : ctx.expressao()) {
          String tipo = visitExpressao(exp);

          if(exp.getText().startsWith("\"")) {
            strg = exp.getText().substring(1, exp.getText().length()-1); //Tira as aspas da string
          }

          if(tipo != null){
                switch (tipo) {
                case "inteiro":
                  arg += "%d";
                  break;
                case "literal":
                  if(!exp.getText().startsWith("\"")) {
                      arg += "%s";
                  } else {
                      arg += strg;
                  }
                  break;
                case "real":
                  arg += "%lf";
                  break;
                case "logico":
                  arg += "%d";
                  break;
                default:
                  break;
                }
                if(!exp.getText().startsWith("\"")) {
                  var += "," + exp.getText();
                }
          }
        }
        sp.println("printf(\"" + arg + "\"" + var + ");");
        return null;
    }

    @Override
    public String visitCmdAtribuicao (LAParser.CmdAtribuicaoContext ctx) {
        /* cmd : op_ptr? identificador '<-' expressao   # cmdAtribuicao */
        String id = (ctx.op_ptr() == null) ? "" : "*";
        String expr = ctx.expressao().getText();

        id += ctx.identificador().getText();
        if (expr.startsWith("\"")) {
            sp.println("strcpy(" + id + ", " + expr + ");");
        } else {
            sp.println(id + " = " + ctx.expressao().getText() + ";");
        }
        return null;
    }

    @Override
    public String visitCmdChamada (LAParser.CmdChamadaContext ctx) {
        /* cmd : IDENT '(' expressao (';' expressao)? ')' */
        String call = ctx.getText().replaceAll(";", ",");
        sp.println(call + ";");
        return null;
    }

    @Override
    public String visitCmdRetorne (LAParser.CmdRetorneContext ctx) {
        /* cmd : 'retorne'  expressao */
        sp.println("return " + ctx.expressao().getText() + ";");
        return null;
    }

    @Override
    public String visitCmdSe (LAParser.CmdSeContext ctx) {
        /* cmd : 'se' expressao 'entao' (cmdIf+=cmd)* (opElse='senao' (cmdElse+=cmd)*)? 'fim_se'    # cmdSe */
        sp.print("if(");
        visitExpressao(ctx.expressao());
        sp.println(") {");
        for (LAParser.CmdContext cmd : ctx.cmdIf) {
            visit(cmd);
        }
        sp.println("}");
        if (ctx.opElse != null) {
            sp.println("else {");
            for (LAParser.CmdContext cmd : ctx.cmdElse) {
                visit(cmd);
            }
            sp.println("}");
        }
        return null;
    }

    @Override
    public String visitCmdCaso (LAParser.CmdCasoContext ctx) {
    		/* cmd : 'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso'   # cmdCaso */
    		sp.println("switch(" + expressao2C(ctx.exp_aritmetica().getText()) + ") {");
    		for (LAParser.Item_selecaoContext item : ctx.selecao().item_selecao()) {
    			visitItem_selecao(item);
    		}
    		sp.println("default:");
    		for (LAParser.CmdContext cmd : ctx.cmd()) {
    				visit(cmd);
    		}
    		sp.println("}");
    		return null;
    }

    @Override
    public String visitItem_selecao (LAParser.Item_selecaoContext ctx) {
    		/* item_selecao : constantes ':'  (cmd)* */
    		for (LAParser.Numero_intervaloContext cons : ctx.constantes().numero_intervalo()) {
    				visitNumero_intervalo(cons);
    		}

    		for (LAParser.CmdContext cmd : ctx.cmd()) {
    				visit(cmd);
    		}
    		sp.println("break;");
    		return null;
    }

    @Override
    public String visitNumero_intervalo (LAParser.Numero_intervaloContext ctx) {
    	/* numero_intervalo : op_unario? NUM_INT ('..'  op_unario? NUM_INT)? */
    	int a = Integer.parseInt(ctx.NUM_INT().get(0).getText());
    	int b = a;
    	if(ctx.NUM_INT().size() > 1) b = Integer.parseInt(ctx.NUM_INT().get(1).getText());
        while(a <= b){
    		sp.print("case ");
    		sp.println(a + ":");
    		a++;
    	}
    	String num = ctx.NUM_INT().toString();

    	return null;
    }

    @Override
    public String visitCmdPara (LAParser.CmdParaContext ctx) {
        /* cmd : 'para' IDENT '<-' ex1=exp_aritmetica 'ate' ex2=exp_aritmetica 'faca' (cmd)* 'fim_para' */
        String id = ctx.IDENT().getText();
        sp.println("for("+ id + " = " + expressao2C(ctx.ex1.getText()) + "; " + id + " <= " + expressao2C(ctx.ex2.getText()) + "; " + id + "++) {");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("}");

        return null;
    }

    @Override 
    public String visitCmdEnquanto (LAParser.CmdEnquantoContext ctx) {
        /* cmd : 'enquanto' expressao 'faca' (cmd)* 'fim_enquanto' */
        sp.println("while(" + expressao2C(ctx.expressao().getText()) + ") {");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("}");

        return null;
    }

    @Override 
    public String visitCmdFaca (LAParser.CmdFacaContext ctx) {
        /* cmd : 'faca' (cmd)* 'ate' expressao  */
        sp.println("do {");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("} while (" + expressao2C(ctx.expressao().getText()) + ");");
        
        return null;
    }

    @Override
    public String visitExpressao (LAParser.ExpressaoContext ctx) {
        /* expressao : t1=termo_logico ('ou' t2+=termo_logico)* */
        String tipo = visitTermo_logico(ctx.t1);
        for (LAParser.Termo_logicoContext trm : ctx.t2) {
            sp.print(" || ");
            visitTermo_logico(trm);
        }
        return tipo;
    }

    @Override
    public String visitTermo_logico (LAParser.Termo_logicoContext ctx) {
        /* termo_logico : f1=fator_logico ('e' f2+=fator_logico)* */
        String tipo = visitFator_logico(ctx.f1);
        for (LAParser.Fator_logicoContext ftr : ctx.f2) {
            sp.print(" && ");
            visitFator_logico(ftr);
        }
        return tipo;
    }

    @Override
    public String visitFator_logico (LAParser.Fator_logicoContext ctx) {
        /* fator_logico : 'nao'? parcela_logica */
        if (ctx.getText().startsWith("nao")) { sp.print("!"); }
        String tipo = visit(ctx.parcela_logica());
        return tipo;
    }

    @Override
    public String visitExp_relacional (LAParser.Exp_relacionalContext ctx) {
        /* exp_relacional : exp_aritmetica (op_relacional exp_aritmetica)? */
        String tipo = visitExp_aritmetica(ctx.exp_aritmetica(0));
        if (ctx.op_relacional() != null) {
            sp.print(ctx.exp_aritmetica(0).getText());
            String op = ctx.op_relacional().getText();
            if (op.equals("=")) { op = "=="; }
            else if (op.equals("<>")) { op = "!="; }
            sp.print(op);
            visitExp_aritmetica(ctx.exp_aritmetica(1));
            sp.print(ctx.exp_aritmetica(1).getText());
        }
        return tipo;
    }

    @Override
    public String visitTipo_estendido (LAParser.Tipo_estendidoContext ctx) {
        /* tipo_estendido : op_ptr? tipo_basico_ident */
        return ((ctx.op_ptr() != null) ? "^" : "") + visitTipo_basico_ident(ctx.tipo_basico_ident());
    }

    @Override
    public String visitParcela_nao_unario_id (LAParser.Parcela_nao_unario_idContext ctx) {
        /* parcela_nao_unario : '&'  identificador */
        return "&" + visitIdentificador(ctx.identificador());
    }

    @Override
    public String visitParcela_nao_unario_cad (LAParser.Parcela_nao_unario_cadContext ctx) {
        /* parcela_nao_unario : CADEIA */
        return "literal";
    }

    @Override
    public String visitParcela_unario_func (LAParser.Parcela_unario_funcContext ctx) {
        /* parcela_unario : IDENT '(' expressao (','  expressao)* ')' */
        return escopos.getTipoSimbolo(ctx.IDENT().getText());
    }

    @Override
    public String visitParcela_unario_atom_int (LAParser.Parcela_unario_atom_intContext ctx) {
        /* parcela_unario : NUM_INT */
        return "inteiro";
    }

    @Override
    public String visitParcela_unario_atom_real (LAParser.Parcela_unario_atom_realContext ctx) {
        /* parcela_unario : NUM_REAL */
        return "real";
    }
}
