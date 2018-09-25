package t1;

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
        if(tipo != null){
          switch (tipo) {
            case "inteiro":
              sp.print("int ");
              break;
          }
        }
        for (LAParser.IdentificadorContext id : ctx.identificador()) {
          if(!primeiro) sp.print(", ");
          sp.print(id.getText());
          primeiro = false;
        }
        sp.println(";");
        return null;
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
        for (LAParser.ExpressaoContext id : ctx.expressao()) {
          String tipo = visitExpressao(id);
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
                default:
                  break;
            }
          }
          var += "," + id.getText();
        }
        sp.println("printf(\"" + arg + "\"" + var + ");");
        return null;
    }

}
