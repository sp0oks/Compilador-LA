package t1;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnalisadorSemantico extends LABaseVisitor<String> {
  PilhaDeTabelas escopos;
  SaidaParser sp;
  HashMap<String, List<String>> tabelaDeParametros;
  HashMap<String, List<String>> tabelaDeRegistros;
  ArrayList<String> tabelaDeTipos;

  public AnalisadorSemantico(SaidaParser sp) { this.sp = sp; }

  public boolean isNumerico(String tipo) { return (tipo.equals("inteiro") || tipo.equals("real")); }

  public String getTipoRetorno(LAEnums.tipoOperacao op, String t1, String t2) {
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
      tabelaDeRegistros = new HashMap<>();
      tabelaDeTipos = new ArrayList<>();

      escopos.empilhar(new TabelaDeSimbolos("global"));
      tabelaDeTipos.addAll(Arrays.asList("inteiro", "real", "literal", "logico", "^inteiro", "^real", "^literal", "^logico"));

      visitDeclaracoes(ctx.declaracoes());
      visitCorpo(ctx.corpo());
      return null;
  }

  @Override
  public String visitDeclaracao_local_var(LAParser.Declaracao_local_varContext ctx) {
      /* declaracao_local: 'declare' variavel */
      if(ctx.variavel() != null){
          String tipo = visitVariavel(ctx.variavel());
          if(escopos.topo().existeSimbolo(ctx.variavel().id1.getText())) {
              sp.println("Linha " + ctx.variavel().id1.start.getLine() + ": identificador " + ctx.variavel().id1.getText() + " ja declarado anteriormente");
          } else {
                escopos.topo().adicionarSimbolo(ctx.variavel().id1.getText(), tipo, LAEnums.tipoSimbolo.VARIAVEL);
            }
            for(LAParser.IdentificadorContext id : ctx.variavel().id2) {
                if(escopos.topo().existeSimbolo(id.getText())){
                    sp.println("Linha " + id.start.getLine() + ": identificador " + id.getText() + " ja declarado anteriormente");
                } else {
                    escopos.topo().adicionarSimbolo(id.getText(), tipo, LAEnums.tipoSimbolo.VARIAVEL);
                }
            }
      }
      return null;
  }

  @Override
  public String visitDeclaracao_local_const(LAParser.Declaracao_local_constContext ctx) {
      /* declaracao_local: 'constante'  IDENT ':' tipo_basico '=' valor_constante */
      String id = ctx.IDENT().getText();
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          escopos.topo().adicionarSimbolo(id, ctx.TIPO_BASICO().getText(), LAEnums.tipoSimbolo.CONSTANTE);
      }
      return null;
  }

  @Override
  public String visitDeclaracao_local_tipo(LAParser.Declaracao_local_tipoContext ctx) {
      /* declaraçao_local: 'tipo'  IDENT ':' tipo */
      String id = ctx.IDENT().getText();
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          String tipo = visitTipo(ctx.tipo());
          escopos.topo().adicionarSimbolo(id, tipo, LAEnums.tipoSimbolo.TIPO);
      }
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
  public String visitVariavel(LAParser.VariavelContext ctx) {
      /* variavel: id1=identificador (',' id2+=identificador)* ':' tipo; */
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
  public String visitExp_aritmetica(LAParser.Exp_aritmeticaContext ctx) {
      /* exp_aritmetica: termo (op1 termo)* ; */
      String t1 = null;
      for(LAParser.TermoContext t : ctx.termo()){
          String t2 = visitTermo(t);
          t1 = getTipoRetorno(LAEnums.tipoOperacao.ARITMETICA, t1, t2);
      }
      return t1;
  }

  @Override
  public String visitTermo(LAParser.TermoContext ctx) {
      /* termo: fator (op2 fator)* ; */
      String f1 = null;
      for(LAParser.FatorContext ftr : ctx.fator()){
          String f2 = visitFator(ftr);
          f1 = getTipoRetorno(LAEnums.tipoOperacao.ARITMETICA, f1, f2);
      }
      return f1;
  }

  @Override
  public String visitFator(LAParser.FatorContext ctx){
      /* fator: parcela (op3 parcela)? ; */
      String p1 = null;
      for(LAParser.ParcelaContext pcl : ctx.parcela()){
          String p2 = visitParcela(pcl);
          p1 = getTipoRetorno(LAEnums.tipoOperacao.ARITMETICA, p1, p2);
      }
      return p1;
  }

  @Override
  public String visitParcela(LAParser.ParcelaContext ctx) {
      /* parcela: op_unario? parcela_unario | parcela_nao_unario; */
      if (ctx.parcela_unario() != null) {
          String tp = visit(ctx.parcela_unario());
          if (ctx.op_unario() != null && !isNumerico(tp)) {
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
