package t1;

public class GeradorDeCodigo extends LABaseVisitor<String> {
    SaidaParser sp;
    PilhaDeTabelas escopos;
    public GeradorDeCodigo(SaidaParser sp) { this.sp = sp; }

    public String expressao2C (String exp) {
      System.out.println(exp);
      return exp.replaceAll("ou", " || ").replaceAll("e", " && ").replaceAll("nao ", "!").replaceAll("=", "==").replaceAll("<>", "!=").replaceAll(">==", ">=").replaceAll("<==", "<=");
    }

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
          if(!primeiro) sp.print(", ");
          sp.print(id.getText());
          if(string) sp.print("[256]");
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
        sp.println("printf(\"" + strg + " " + arg + "\"" + var + ");");
        return null;
    }

    @Override
    public String visitCmdAtribuicao (LAParser.CmdAtribuicaoContext ctx) {
        /* op_ptr? identificador '<-' expressao   # cmdAtribuicao */
        sp.println(ctx.identificador().getText() + " = " + expressao2C(ctx.expressao().getText()) + ";");
        return null;
    }

    @Override
    public String visitCmdSe (LAParser.CmdSeContext ctx) {
        /* 'se' expressao 'entao' (cmd)* ('senao' (cmd)*)? 'fim_se'    # cmdSe */
        sp.println("if(" + expressao2C(ctx.expressao().getText()) + ") {");
        for (LAParser.CmdContext cmd : ctx.cmd()) {
            visit(cmd);
        }
        sp.println("}");
        return null;
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
    public String visitParcela_logica_atom (LAParser.Parcela_logica_atomContext ctx) {
        /* parcela_logica : ('verdadeiro' | 'falso') */
        return "logico";
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
