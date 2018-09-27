package t1;

import java.util.ArrayList;
import java.util.HashMap;

public class GeradorDeCodigo extends LABaseVisitor<String> {
    SaidaParser sp;
    PilhaDeTabelas escopos;
    HashMap<String, ArrayList<EntradaTabelaDeSimbolos>> tabelaDeRegistros;

    public GeradorDeCodigo(SaidaParser sp) { this.sp = sp; }

    public String expressao2C (String exp) {
      return exp.replaceAll("ou", " || ").replaceAll("e", " && ").replaceAll("nao", "!").replaceAll("=", "==").replaceAll("<>", "!=").replaceAll(">==", ">=").replaceAll("<==", "<=");
    }

    @Override
    public String visitPrograma (LAParser.ProgramaContext ctx) {
        /* programa : declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
        escopos = new PilhaDeTabelas();
        tabelaDeRegistros = new HashMap<>();

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
    public String visitDeclaracao_local_const (LAParser.Declaracao_local_constContext ctx) {
        /* declaracao_local : 'constante'  IDENT ':' tipo_basico '=' valor_constante */
        String id = ctx.IDENT().getText();
        String valor = ctx.valor_constante().getText();
        sp.println("#define " + id + " " + valor);

        return null;
    }

    @Override
    public String visitDeclaracao_local_tipo (LAParser.Declaracao_local_tipoContext ctx) {
        /* declaracao_local : 'tipo' IDENT ':' tipo */
        String id = ctx.IDENT().getText();
        String tipo = "";
        LAEnums.TipoDeDado tpd = LAEnums.TipoDeDado.TIPO;

        if (ctx.tipo().getText().startsWith("registro")) {
             tipo = "struct";
             tpd = LAEnums.TipoDeDado.REGISTRO;
             tabelaDeRegistros.put(id, new ArrayList<>());
        }

        sp.println("typedef " + tipo + " {");
        escopos.topo().adicionarSimbolo(id, (tipo.equals("struct") ? "registro" : "tipo"), tpd);
        visitTipo(ctx.tipo());
        sp.println("} " + id + ";");

        return null;
    }

    @Override
    public String visitVariavel (LAParser.VariavelContext ctx) {
        /* variavel : identificador (',' identificador)* ':' tipo */
//        sp.println(ctx.getText());
        String tipo = ctx.tipo().getText().startsWith("registro") ? "registro" : ctx.tipo().getText();
        LAEnums.TipoDeDado tpd = LAEnums.TipoDeDado.VARIAVEL;
        boolean primeiro = true;
        boolean string = false;
        boolean ponteiro = false;

        if (tipo.startsWith("^")) {
            ponteiro = true;
            tipo = tipo.substring(tipo.indexOf("^") + 1);
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
                visitTipo(ctx.tipo());
                break;
            default:
                sp.print(tipo + " ");
                break;
        }
        for (LAParser.IdentificadorContext id : ctx.identificador()) {
            String var = id.getText();

            if (id.dimensao() != null) {
                var = var.substring(0, var.indexOf("["));
                tpd = LAEnums.TipoDeDado.VETOR;
            }

            // variável é um registro sem nome
            if (tipo.equals("registro")) {
                tpd = LAEnums.TipoDeDado.REGISTRO;
                if (tabelaDeRegistros.get(var) == null) {
                    tabelaDeRegistros.put(var, new ArrayList<>());
                }
            }
            // variável é atributo de um registro
            if (escopos.topo().getNome().startsWith("registro")) {
                String id_reg = escopos.topo().getNome();
                EntradaTabelaDeSimbolos atributo = new EntradaTabelaDeSimbolos(var, tipo, tpd);
                // adicionando variável à lista de atributos do registro
                id_reg = id_reg.substring(id_reg.indexOf("[") + 1, id_reg.indexOf("]"));
                tabelaDeRegistros.get(id_reg).add(atributo);
            }
            escopos.topo().adicionarSimbolo(var, tipo, tpd);
            // variável é de um tipo registro declarado anteriormente
            if (escopos.topo().existeSimbolo(tipo) && escopos.topo().getTipoSimbolo(tipo).equals("registro")) {
                for (int i = 0; i < tabelaDeRegistros.get(tipo).size(); i++) {
                    // adicionamos todos os atributos deste tipo à nova variavel
                    EntradaTabelaDeSimbolos atributo = tabelaDeRegistros.get(tipo).get(i);
                    escopos.topo().adicionarSimbolo(var + "." + atributo.getNome(), atributo.getTipo(), atributo.getTipoDeDado());
                }
            }

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
    public String visitRegistro (LAParser.RegistroContext ctx) {
        /* registro : 'registro' (variavel)* 'fim_registro' */
        String id_reg;

        // registro vem de uma declaração de variável
        if (ctx.getParent().getParent() instanceof LAParser.VariavelContext) {
            for (int i = 0; i < ((LAParser.VariavelContext) ctx.getParent().getParent()).identificador().size(); i++) {
                // identificador de variável a qual este registro foi atribuido
                id_reg = ((LAParser.VariavelContext) ctx.getParent().getParent()).identificador().get(i).getText();
                escopos.empilhar(new TabelaDeSimbolos("registro[" + id_reg + "]"));
                sp.println("struct " + " {");
                for (LAParser.VariavelContext var : ctx.variavel()) { visitVariavel(var); }
                sp.println("} " + id_reg + ";");
                escopos.desempilhar();

                if (tabelaDeRegistros.get(id_reg) != null) {
                    for (EntradaTabelaDeSimbolos atrib : tabelaDeRegistros.get(id_reg)) {
                        String id_atrib = id_reg + "." + atrib.getNome();
                        escopos.topo().adicionarSimbolo(id_atrib, atrib.getTipo(), atrib.getTipoDeDado());
                    }
                }
            }
        }
        // registro vem de uma declaração de tipo
        else if (ctx.getParent().getParent() instanceof LAParser.Declaracao_local_tipoContext){
            id_reg = ((LAParser.Declaracao_local_tipoContext) ctx.getParent().getParent()).IDENT().getText();
            escopos.empilhar(new TabelaDeSimbolos("registro[" + id_reg + "]"));
            for (LAParser.VariavelContext var : ctx.variavel()) {
                visitVariavel(var);
            }
            escopos.desempilhar();
        }
        return "registro";
    }

    @Override
    public String visitIdentificador (LAParser.IdentificadorContext ctx) {
        /* identificador : IDENT ('.'  IDENT)* dimensao; */
        String nome = ctx.IDENT().get(0).getText();
        for(int i = 1; i < ctx.IDENT().size(); i++) nome += "." + ctx.IDENT().get(i).getText();
        return escopos.getTipoSimbolo(nome);
    }

    @Override
    public String visitCmdLeia (LAParser.CmdLeiaContext ctx) {
        /* cmd : 'leia' '(' '^'? identificador (',' identificador)* ')' */
        String arg = "";
        String var = "";
        for (LAParser.IdentificadorContext id : ctx.identificador()) {
          String tipo = escopos.getTipoSimbolo(id.getText());
          if(tipo != null){
                switch (tipo) {
                case "inteiro":
                  arg += "%d ";
                  break;
                case "literal":
                  arg += "%s ";
                  break;
                case "real":
                  arg += "%lf ";
                  break;
                case "logico":
                  arg += "%d ";
                  break;
                default:
                  break;
                }
          }
          var += ",&" + id.getText();
        }
        sp.println("scanf(\"" + arg + "\"" + var + ");");
        return null;
    }

    @Override
    public String visitCmdEscreva (LAParser.CmdEscrevaContext ctx) {
        /* cmd : 'escreva' '(' expressao (',' expressao)* ')' */
        String arg = "";
        String var = "";
        String str = "";
        for (LAParser.ExpressaoContext exp : ctx.expressao()) {
          String tipo = visitExpressao(exp);

          if(exp.getText().startsWith("\"")) {
            str = exp.getText().substring(1, exp.getText().length()-1); //Tira as aspas da string
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
                      arg += str;
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
        id += ctx.identificador().getText();

        String tipo = visitIdentificador(ctx.identificador());
        if (tipo != null) {
        if (tipo.equals("literal")) {
            sp.print("strcpy(" + id + ", " + expressao2C(ctx.expressao().getText()));
            sp.println(");");
        } else {
            sp.print(id + " = " + expressao2C(ctx.expressao().getText()));
            sp.println(";");
        }
        }
        return null;
    }

    @Override
    public String visitCmdSe (LAParser.CmdSeContext ctx) {
        /* cmd : 'se' expressao 'entao' (cmdIf+=cmd)* (opElse='senao' (cmdElse+=cmd)*)? 'fim_se' */
        sp.print("if(");
        visitExpressao(ctx.expressao());
        sp.println(") {");
        for (LAParser.CmdContext cmd : ctx.cmdIf) { visit(cmd); }
        sp.println("}");
        if (ctx.opElse != null) {
            sp.println("else {");
            for (LAParser.CmdContext cmd : ctx.cmdElse) { visit(cmd); }
            sp.println("}");
        }

        return null;
    }

    @Override
    public String visitCmdCaso (LAParser.CmdCasoContext ctx) {
        return null;
    }

    @Override
    public String visitCmdPara (LAParser.CmdParaContext ctx) {
        /* 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para' */
        String id = ctx.IDENT().getText();

        sp.println("for(" + id + " = " + ctx.ex1.getText() + "; " + id + " == " + ctx.ex2.getText() + "; " + id + "++;){");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("}");

        return null;
    }

    @Override
    public String visitCmdEnquanto (LAParser.CmdEnquantoContext ctx) {
        /* 'enquanto' expressao 'faca' (cmd)* 'fim_enquanto' */
        sp.print("while(");
        visitExpressao(ctx.expressao());
        sp.println("){");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("}");

        return null;
    }

    @Override
    public String visitCmdFaca (LAParser.CmdFacaContext ctx) {
        /* 'faca' (cmd)* 'ate' expressao */
        sp.println("do {");
        for (LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
        sp.println("} while " + expressao2C(ctx.expressao().getText()) + ";");

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
        return  visit(ctx.parcela_logica());
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
