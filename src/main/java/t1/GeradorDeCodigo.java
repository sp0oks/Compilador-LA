package t1;

import java.lang.annotation.Documented;

public class GeradorDeCodigo extends LABaseVisitor<String> {
    SaidaParser sp;
    PilhaDeTabelas escopos;
    public GeradorDeCodigo(SaidaParser sp) { this.sp = sp; }

    @Override
    public String visitPrograma (LAParser.ProgramaContext ctx) {
        /* programa: declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
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
    public String visitDeclaracao_local_const (LAParser.Declaracao_local_constContext ctx) {
        /* declaracao_local: 'constante'  IDENT ':' tipo_basico '=' valor_constante */
        String id = ctx.IDENT().getText();
        String valor = ctx.valor_constante().getText();
        sp.println("#define " + id + " " + valor);
        return null;
    }

    @Override
    public String visitDeclaracao_local_tipo (LAParser.Declaracao_local_tipoContext ctx) {
        /* 'tipo'  IDENT ':' tipo # declaracao_local_tipo */
        String id = ctx.IDENT().getText();
        String tipo = ctx.tipo().getText();
        sp.println("typedef " + id + " " + tipo);
        return null;
    }

    @Override
    public String visitVariavel (LAParser.VariavelContext ctx) {
        /* identificador (',' identificador)* ':' tipo */
        String tipo = ctx.tipo().getText();
        boolean primeiro = true;
        boolean string = false;
        boolean ponteiro = false;
        if (tipo.startsWith("^")) {
            ponteiro = true;
            tipo = tipo.substring(tipo.indexOf("^")+1);
        }
        if(tipo != null){
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
            default:
              break;
            }
        }
        for (LAParser.IdentificadorContext id : ctx.identificador()) {
          escopos.topo().adicionarSimbolo(id.getText(), tipo, LAEnums.TipoDeDado.VARIAVEL);
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
        /* 'leia' '(' '^'? identificador (',' identificador)* ')'  # cmdLeia */
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
        /* 'escreva' '(' expressao (',' expressao)* ')'    # cmdEscreva*/
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
        /* op_ptr? identificador '<-' expressao   # cmdAtribuicao */
        String id = (ctx.op_ptr() == null) ? "" : "*";
        id += ctx.identificador().getText();
        sp.println(id + " = " + ctx.expressao().getText() + ";");
        return null;
    }

    @Override
    public String visitCmdSe (LAParser.CmdSeContext ctx) {
        /* 'se' expressao 'entao' (cmdIf+=cmd)* (opElse='senao' (cmdElse+=cmd)*)? 'fim_se'    # cmdSe */
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
        return null;
    }

    @Override
    public String visitCmdPara (LAParser.CmdParaContext ctx) {
        return null;
    }

    @Override
    public String visitExpressao (LAParser.ExpressaoContext ctx) {
        /* t1=termo_logico ('ou' t2+=termo_logico)* */
        String tipo = visitTermo_logico(ctx.t1);
        for (LAParser.Termo_logicoContext trm : ctx.t2) {
            sp.print(" || ");
            visitTermo_logico(trm);
        }
        return tipo;
    }

    @Override
    public String visitTermo_logico (LAParser.Termo_logicoContext ctx) {
        /* f1=fator_logico ('e' f2+=fator_logico)* */
        String tipo = visitFator_logico(ctx.f1);
        for (LAParser.Fator_logicoContext ftr : ctx.f2) {
            sp.print(" && ");
            visitFator_logico(ftr);
        }
        return tipo;
    }

    @Override
    public String visitFator_logico (LAParser.Fator_logicoContext ctx) {
        /* 'nao'? parcela_logica */
        if (ctx.getText().startsWith("nao")) { sp.print("!"); }
        String tipo = visit(ctx.parcela_logica());
        return tipo;
    }

    @Override
    public String visitExp_relacional (LAParser.Exp_relacionalContext ctx) {
        /* exp_aritmetica (op_relacional exp_aritmetica)? */
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
    public String visitParcela_logica_atom (LAParser.Parcela_logica_atomContext ctx) {
        /* parcela_logica : ('verdadeiro' | 'falso') */
        return "logico";
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
