package t1;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnalisadorSemantico extends LABaseVisitor<String> {
  PilhaDeTabelas escopos;
  SaidaParser sp;
  HashMap<String, List<String>> tabelaDeParametros;
  ArrayList<String> tabelaDeSimbolos = new ArrayList<String>();

  public AnalisadorSemantico(SaidaParser sp) { this.sp = sp; }

  public enum tipoOperacao { ARITMETICA, RELACIONAL, LOGICA }

  public boolean isNumerico(String tipo) { return (tipo.equals("inteiro") || tipo.equals("real")); }

  public String getTipoRetorno(tipoOperacao op, String t1, String t2) {
      switch (op) {
          case ARITMETICA:
              if (isNumerico(t1) && isNumerico(t2)) {
                  return (t1.equals("real") || t2.equals("real")) ? "real" : "inteiro";
              } else if (t1.equals("literal") && t2.equals("literal")) { return "literal"; }
              return "tipo_invalido";
          case RELACIONAL:
              if(isNumerico(t1) && isNumerico(t2)){ return "logico"; }
              return "tipo_invalido";
          case LOGICA:
              if(t1.equals("logico") && t2.equals("logico")){ return "logico"; }
              return "tipo_invalido";
          default:
              break;
      }
      return null;
  }

  @Override
  public String visitPrograma(LAParser.ProgramaContext ctx) {
      /* programa: declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
      escopos = new PilhaDeTabelas();
      tabelaDeParametros = new HashMap<>();
      escopos.empilhar(new TabelaDeSimbolos("global"));

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
  public String visitCorpo(LAParser.CorpoContext ctx) {
      /* corpo: (declaracao_local)* (cmd)* ; */
      for(LAParser.Declaracao_localContext decl : ctx.declaracao_local()) { visit(decl); }
      for(LAParser.CmdContext cmd : ctx.cmd()) { visit(cmd); }
      return null;
  }

  @Override
  public String visitDeclaracao_local_var(LAParser.Declaracao_local_varContext ctx) {
      /* declaracao_local: 'declare'  variavel */
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
      return null;
  }

  @Override
  public String visitDeclaracao_local_const(LAParser.Declaracao_local_constContext ctx) {
      /* declaracao_local: 'constante'  IDENT ':' tipo_basico '=' valor_constante */
      return null;
  }

  @Override
  public String visitDeclaracao_local_tipo(LAParser.Declaracao_local_tipoContext ctx) {
      /* declaraçao_local: 'tipo'  IDENT ':' tipo */
      return null;
  }

  @Override
  public String visitDeclaracao_global_proc(LAParser.Declaracao_global_procContext ctx) {
      /* decl_global: 'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento' */
      return null;
  }

  @Override
  public String visitDeclaracao_global_func(LAParser.Declaracao_global_funcContext ctx) {
      /* decl_global : 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' */
      return null;
  }

  @Override
  public String visitCmdLeia(LAParser.CmdLeiaContext ctx) {
      return null;
  }

  @Override
  public String visitCmdEscreva(LAParser.CmdEscrevaContext ctx) {
      return null;
  }

  @Override
  public String visitCmdSe(LAParser.CmdSeContext ctx) {
      return null;
  }

  @Override
  public String visitCmdCaso(LAParser.CmdCasoContext ctx) {
      return null;
  }

  @Override
  public String visitCmdPara(LAParser.CmdParaContext ctx) {
      return null;
  }

  @Override
  public String visitCmdEnquanto(LAParser.CmdEnquantoContext ctx) {
      return null;
  }

  @Override
  public String visitCmdFaca(LAParser.CmdFacaContext ctx) {
      return null;
  }

  @Override
  public String visitCmdAtribuicao(LAParser.CmdAtribuicaoContext ctx) {
      return null;
  }

  @Override
  public String visitCmdChamada(LAParser.CmdChamadaContext ctx) {
      return null;
  }

  @Override
  public String visitCmdRetorne(LAParser.CmdRetorneContext ctx) {
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
      if (ctx.TIPO_BASICO() != null) { return ctx.TIPO_BASICO().getText(); }
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
      /* fator: parcela (op3 parcela)? ; */
      String p1 = null;
      for(LAParser.ParcelaContext pcl : ctx.parcela()){
          String p2 = visitParcela(pcl);
          p1 = getTipoRetorno(tipoOperacao.ARITMETICA, p1, p2);
      }
      return p1;
  }

  @Override
  public String visitParcela(LAParser.ParcelaContext ctx) {
      /* parcela: op_unario? parcela_unario | parcela_nao_unario; */
      if (ctx.parcela_unario() != null) {
          String tp = visit(ctx.parcela_unario());
          if (ctx.OP_UNARIO() != null && !isNumerico(tp)) {
              return "tipo_indefinido";
          }
          return tp;
      } else if (ctx.parcela_nao_unario() != null) {
          return visit(ctx.parcela_nao_unario());
      }
      return null;
  }

  @Override
  public String visitParcela_unario_id (LAParser.Parcela_unario_idContext ctx) {
      /* parcela_unario: '^'? identificador */
      if(ctx.identificador() != null) {
          String id = ctx.identificador().getText();
          String tid = visitIdentificador(ctx.identificador());

          if (!escopos.existeSimbolo(id)) {
              sp.println("Linha " + ctx.identificador().start.getLine() + ": identificador " + id + "nao declarado");
          }
          return tid;
      }
      return null;
  }

  @Override
  public String visitParcela_unario_expr (LAParser.Parcela_unario_exprContext ctx) {
      /* '(' expressao ')'; */
      return null;
  }

  @Override
  public String visitParcela_unario_func (LAParser.Parcela_unario_funcContext ctx) {
      /* parcela_unario_func:  IDENT '(' expressao (','  expressao)* ')' */
      if (ctx.IDENT() != null) {
          String id = ctx.IDENT().getText();
          String texp;
          List<String> params = tabelaDeParametros.get(id);
          String tpRetorno = params.get(0);
          boolean incompat = false;

          if (!escopos.existeSimbolo(id)) {
              sp.println("Linha " + ctx.start.getLine() + ": identificador " + id + "nao declarado");
          }
          for (int i = 1; i < ctx.expressao().size(); i++) {
              texp = visitExpressao(ctx.expressao(i));
              incompat = params.get(i).equals(texp);
          }
          incompat = incompat && !params.isEmpty() && params.size() == ctx.expressao().size() + 1;
          if (incompat) {
              sp.println("Linha " + ctx.start.getLine() + ": incompatibilidade de parametros na chamada de " + id);
          }
          return tpRetorno;
      }
      return null;
  }

  @Override
  public String visitParcela_unario_atom_int (LAParser.Parcela_unario_atom_intContext ctx) { return "inteiro"; }

  @Override
  public String visitParcela_unario_atom_real (LAParser.Parcela_unario_atom_realContext ctx) { return "real"; }

  @Override
  public String visitParcela_nao_unario_id (LAParser.Parcela_nao_unario_idContext ctx) {
      return null;
  }
}
