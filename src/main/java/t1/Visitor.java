package t1;

import java.util.ArrayList;

public class Visitor extends LABaseVisitor<String> {

  SaidaParser sp;
  ArrayList<String> tabelaDeSimbolos = new ArrayList<String>();

  public Visitor(SaidaParser sp) {
      this.sp = sp;
  }

  @Override
  public String visitPrograma(LAParser.ProgramaContext ctx) {
    visitDeclaracoes(ctx.declaracoes());
    visitCorpo(ctx.corpo());
    return null;
  }

  @Override
  public String visitDeclaracoes(LAParser.DeclaracoesContext ctx) {
      ;
    return null;
  }

  @Override
  public String visitCorpo(LAParser.CorpoContext ctx) {
    for(LAParser.Declaracao_localContext decl : ctx.declaracao_local()) {
      visitDeclaracao_local(decl);
    }
    return null;
  }

  @Override
  public String visitDeclaracao_local(LAParser.Declaracao_localContext ctx) {
    if (!sp.isModificado()) {
      if(ctx.variavel() != null){
        visitVariavel(ctx.variavel());
        if(tabelaDeSimbolos.contains(ctx.variavel().id1.getText())){
          sp.println("Linhas " + ctx.variavel().id1.start.getLine() + ": identificador " + ctx.variavel().id1.getText() + " nao declarado");
        }
        else{
          tabelaDeSimbolos.add(ctx.variavel().id1.getText());
        }

        for(LAParser.IdentificadorContext id : ctx.variavel().id2){
          if(tabelaDeSimbolos.contains(id.getText())){
            sp.println("Linhas " + id.start.getLine() + ": identificador " + id.getText() + " nao declarado");
          }
          else{
            tabelaDeSimbolos.add(id.getText());
          }
        }
      }
    }
    return null;
  }

  @Override
  public String visitVariavel(LAParser.VariavelContext ctx) {
    ;
    return null;
  }

  @Override
  public String visitIdentificador(LAParser.IdentificadorContext ctx) {
    ;
    return null;
  }

  @Override
  public String visitTipo(LAParser.TipoContext ctx) {
    ;
    return null;
  }


}
