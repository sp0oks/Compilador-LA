package t1;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AnalisadorSemantico extends LABaseVisitor<String> {
  PilhaDeTabelas pdt;
  SaidaParser sp;
  ArrayList<String> tabelaDeSimbolos = new ArrayList<String>();

  public AnalisadorSemantico(SaidaParser sp) { this.sp = sp; }

  public enum tipoOperacao { ARITMETICA, RELACIONAL, LOGICA}

  public boolean isNumerico(String tipo) { return (tipo.equals("inteiro") || tipo.equals("real")); }

  public String getTipoRetorno(tipoOperacao op, String t1, String t2) {
      switch (op) {
          case ARITMETICA:
              if (isNumerico(t1) && isNumerico(t2)) {
                  return (t1.equals("real") || t2.equals("real")) ? "real" : "inteiro";
              } else if (t1.equals("literal") && t2.equals("literal")) {
                  return "literal";
              }
              return "tipo_invalido";
          case RELACIONAL:
              break;
          case LOGICA:
              break;
          default:
              break;
      }
      return null;
  }

  @Override
  public String visitPrograma(LAParser.ProgramaContext ctx) {
      /* programa: declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
      visitDeclaracoes(ctx.declaracoes());
      visitCorpo(ctx.corpo());
      return null;
  }

  @Override
  public String visitDeclaracoes(LAParser.DeclaracoesContext ctx) {
      /* declaracoes: (decl_local_global)* ; */
      for(LAParser.Decl_local_globalContext decl : ctx.decl_local_global()) { visitDecl_local_global(decl); }
      return null;
  }

  @Override
  public String visitDecl_local_global(LAParser.Decl_local_globalContext ctx) {
      /* decl_local_global: declaracao_local | declaracao_global; */
      if(ctx.declaracao_local() != null) { visitDeclaracao_local(ctx.declaracao_local()); }
      else { visitDeclaracao_global(ctx.declaracao_global()); }
      return null;
  }

  @Override
  public String visitCorpo(LAParser.CorpoContext ctx) {
      /* corpo: (declaracao_local)* (cmd)* ; */
      for(LAParser.Declaracao_localContext decl : ctx.declaracao_local()) { visitDeclaracao_local(decl); }
      for(LAParser.CmdContext cmd : ctx.cmd()) { visitCmd(cmd); }
      return null;
  }

  @Override
  public String visitDeclaracao_local(LAParser.Declaracao_localContext ctx) {
      /* declaracao_local: 'declare'  variavel
                         | 'constante'  IDENT ':' tipo_basico '=' valor_constante
                         | 'tipo'  IDENT ':' tipo */
      if (!sp.isModificado()) {
          if(ctx.variavel() != null){
              visitVariavel(ctx.variavel());
              if(tabelaDeSimbolos.contains(ctx.variavel().id1.getText())) {
                  sp.println("Linha " + ctx.variavel().id1.start.getLine() + ": identificador " + ctx.variavel().id1.getText() + " nao declarado");
              } else {
                    tabelaDeSimbolos.add(ctx.variavel().id1.getText());
                }
                for(LAParser.IdentificadorContext id : ctx.variavel().id2) {
                    if(tabelaDeSimbolos.contains(id.getText())){
                        sp.println("Linha " + id.start.getLine() + ": identificador " + id.getText() + " nao declarado");
                    } else {
                        tabelaDeSimbolos.add(id.getText());
                    }
                }
          }
      }
      return null;
  }

  @Override
  public String visitDeclaracao_global(LAParser.Declaracao_globalContext ctx) {
      /* decl_global : 'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
                     | 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' */
      return null;
  }

  @Override
  public String visitCmd(LAParser.CmdContext ctx){
      /* cmd : cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara |
               cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne */
      if (ctx.cmdLeia() != null) { visitCmdLeia(ctx.cmdLeia()); }
      else if (ctx.cmdEscreva() != null) { visitCmdEscreva(ctx.cmdEscreva()); }
      else if (ctx.cmdSe() != null){ visitCmdSe(ctx.cmdSe()); }
      else if (ctx.cmdCaso() != null) { visitCmdCaso(ctx.cmdCaso()); }
      else if (ctx.cmdPara() != null) { visitCmdPara(ctx.cmdPara()); }
      else if (ctx.cmdEnquanto() != null) { visitCmdEnquanto(ctx.cmdEnquanto()); }
      else if (ctx.cmdFaca() != null) { visitCmdFaca(ctx.cmdFaca()); }
      else if (ctx.cmdAtribuicao() != null) { visitCmdAtribuicao(ctx.cmdAtribuicao()); }
      else if (ctx.cmdChamada() != null) { visitCmdChamada(ctx.cmdChamada()); }
      else if (ctx.cmdRetorne() != null) { visitCmdRetorne(ctx.cmdRetorne()); }
      return null;
  }

  @Override
  public String visitVariavel(LAParser.VariavelContext ctx) {
      /* variavel: id1=identificador (',' id2+=identificador)* ':' tipo; */
      return null;
  }

  @Override
  public String visitTipo(LAParser.TipoContext ctx) {
      /* tipo: registro | tipo_estendido; */
      if (ctx.registro() != null) { visitRegistro(ctx.registro()); }
      else if (ctx.tipo_estendido() != null) { visitTipo_estendido(ctx.tipo_estendido()); }
      return null;
  }

  @Override
  public String visitRegistro(LAParser.RegistroContext ctx) {
      /* registro: 'registro' (variavel)* 'fim_registro'; */
      for (LAParser.VariavelContext var : ctx.variavel()) { visitVariavel(var); }
      return null;
  }

  @Override
  public String visitTipo_estendido(LAParser.Tipo_estendidoContext ctx) {
      /* tipo_estendido: ('^')? tipo_basico_ident */
      if (ctx.tipo_basico_ident() != null ) { return visitTipo_basico_ident(ctx.tipo_basico_ident()); }
      return null;
  }

  @Override
  public String visitTipo_basico_ident(LAParser.Tipo_basico_identContext ctx) {
      /* tipo_basico_ident: tipo_basico | IDENT */
      if (ctx.tipo_basico() != null) { return ctx.tipo_basico().getText(); }
      else return ctx.IDENT().getText();
  }

  @Override
  public String visitIdentificador(LAParser.IdentificadorContext ctx) {
      /* identificador: IDENT ('.'  IDENT)* dimensao; */
      String ident = "";
      for(TerminalNode id : ctx.IDENT()){ ident += "." + id.getText(); }
      if (ctx.dimensao() != null) { visitDimensao(ctx.dimensao()); }
      return ident;
  }

  @Override
  public String visitDimensao(LAParser.DimensaoContext ctx){
      /* dimensao: ('[' exp_aritmetica ']')* ; */
      for(LAParser.Exp_aritmeticaContext expr : ctx.exp_aritmetica()){ visitExp_aritmetica(expr); }
      return null;
  }

  @Override
  public String visitExp_aritmetica(LAParser.Exp_aritmeticaContext ctx) {
      /* exp_aritmetica: termo (op1 termo)* ; */
      String t1 = null;
      for(LAParser.TermoContext t : ctx.termo()){
          String t2 = visitTermo(t);
          t1 = getTipoRetorno(tipoOperacao.ARITMETICA, t1, t2);
      }
      return t1;
  }

  @Override
  public String visitTermo(LAParser.TermoContext ctx) {
      /* termo: fator (op2 fator)* ; */
      String f1 = null;
      for(LAParser.FatorContext ftr : ctx.fator()){
          String f2 = visitFator(ftr);
          f1 = getTipoRetorno(tipoOperacao.ARITMETICA, f1, f2);
      }
      return f1;
  }

  @Override
  public String visitFator(LAParser.FatorContext ctx){
      return null;
  }

}
