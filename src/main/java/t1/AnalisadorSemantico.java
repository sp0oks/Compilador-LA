package t1;

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
      if (t1 == null) {
          return t2;
      } else if (t2 == null) {
          return t1;
      }
      switch (op) {
          case ARITMETICA:
              if (isNumerico(t1) && isNumerico(t2)) {
                  return (t1.equals("real") || t2.equals("real")) ? "real" : "inteiro";
              } else if (t1.equals("literal") && t2.equals("literal")) {
                  return "literal";
              }
              return "tipo_invalido";
          case RELACIONAL:
              if (isNumerico(t1) && isNumerico(t2)) {
                  return "logico";
              }
              return "tipo_invalido";
          case LOGICA:
              if (t1.equals("logico") && t2.equals("logico")) {
                  return "logico";
              }
              return "tipo_invalido";
          case PONTEIRO:
              if (t1.startsWith("^") && t2.startsWith("&")) {
                  return t1;
              }
              return "tipo_invalido";
          case REGISTRO:
              if (t1.equals(t2)) {
                  return t1;
              }
              return "tipo_invalido";
          default:
              return null;
      }
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
  public String visitDeclaracao_local_const(LAParser.Declaracao_local_constContext ctx) {
      /* declaracao_local: 'constante'  IDENT ':' tipo_basico '=' valor_constante */
      String id = ctx.IDENT().getText();
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          String tipo = visitTipo_basico(ctx.tipo_basico());
          escopos.topo().adicionarSimbolo(id, tipo, LAEnums.tipoSimbolo.CONSTANTE);
      }
      return null;
  }

  @Override
  public String visitDeclaracao_local_tipo(LAParser.Declaracao_local_tipoContext ctx) {
      /* declaraçao_local: 'tipo' IDENT ':' tipo */
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          if (ctx.tipo().registro() != null) {
              escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), "registro", LAEnums.tipoSimbolo.REGISTRO);
              tabelaDeRegistros.put(ctx.IDENT().getText(), new ArrayList<>());
          } else { escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), "tipo", LAEnums.tipoSimbolo.TIPO); }
          tabelaDeTipos.add(ctx.IDENT().getText());
          visitTipo(ctx.tipo());
      }
      return null;
  }

  @Override
  public String visitDeclaracao_global_proc(LAParser.Declaracao_global_procContext ctx) {
      /* decl_global: 'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento' */
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), "vazio", LAEnums.tipoSimbolo.FUNCAO);
          tabelaDeParametros.put(ctx.IDENT().getText(), new ArrayList<>());
          escopos.empilhar(new TabelaDeSimbolos("procedimento"));
          if (ctx.parametros() != null) {
              for (LAParser.ParametroContext par : ctx.parametros().parametro()) {
                  tabelaDeParametros.get(ctx.IDENT().getText()).add(visitParametro(par));
              }
          }
          if (ctx.declaracao_local() != null) {
              for (LAParser.Declaracao_localContext decl : ctx.declaracao_local()) {
                  visit(decl);
              }
          }
          if (ctx.cmd() != null) {
              for (LAParser.CmdContext cmd : ctx.cmd()) {
                  visit(cmd);
              }
          }
          escopos.desempilhar();
      }
      return null;
  }

  @Override
  public String visitDeclaracao_global_func(LAParser.Declaracao_global_funcContext ctx) {
      /* decl_global : 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' */
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          String tipo = visitTipo_estendido(ctx.tipo_estendido());
          escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), tipo, LAEnums.tipoSimbolo.FUNCAO);
          tabelaDeParametros.put(ctx.IDENT().getText(), new ArrayList<>());
          escopos.empilhar(new TabelaDeSimbolos("funcao"));
          if (ctx.parametros() != null) {
              for (LAParser.ParametroContext par : ctx.parametros().parametro()) {
                  tabelaDeParametros.get(ctx.IDENT().getText()).add(visitParametro(par));
              }
          }
          if (ctx.declaracao_local() != null) {
              for (LAParser.Declaracao_localContext decl : ctx.declaracao_local()) {
                  visit(decl);
              }
          }
          if (ctx.cmd() != null) {
              for (LAParser.CmdContext cmd : ctx.cmd()) {
                  visit(cmd);
              }
          }
          escopos.desempilhar();
      }
      return null;
  }

  @Override
  public String visitCmdPara(LAParser.CmdParaContext ctx) {
      /* 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para' */
      if(escopos.existeSimbolo(ctx.IDENT().getText())) {
          String tipo = escopos.getTipoSimbolo(ctx.IDENT().getText());
          for (LAParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()) {
              tipo = getTipoRetorno(LAEnums.tipoOperacao.ARITMETICA, tipo, visitExp_aritmetica(exp));
          }
          if (tipo.equals("tipo_invalido")) {
              sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + ctx.IDENT().getText());
          }
          escopos.empilhar(new TabelaDeSimbolos("para"));
          if (ctx.cmd() != null) {
              for (LAParser.CmdContext cmd : ctx.cmd()) {
                  visit(cmd);
              }
          }
          escopos.desempilhar();
      } else {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " nao declarado");
      }
      return null;
  }

  @Override
  public String visitCmdAtribuicao(LAParser.CmdAtribuicaoContext ctx) {
      /* '^'? identificador '<-' expressao */
      String tExpr, tRet;
      String tipo = visitIdentificador(ctx.identificador());
      String id = ctx.identificador().IDENT(0).getText();
      LAEnums.tipoOperacao op = LAEnums.tipoOperacao.ARITMETICA;
      // temporario, tipos não podem ser null
      if (tipo != null) {
          if (tipo.startsWith("^")) op = LAEnums.tipoOperacao.PONTEIRO;
          if (ctx.op_ptr() != null) {
              id = "^" + id;
              if (!tipo.startsWith("^")) {
                  tipo = "^" + visitIdentificador(ctx.identificador());
                  op = LAEnums.tipoOperacao.PONTEIRO;
              }
          } else {
              if (tipo.equals("logico")) op = LAEnums.tipoOperacao.LOGICA;
          }
      }
      tExpr = visitExpressao(ctx.expressao());
      tRet = getTipoRetorno(op, tipo, tExpr);

      if (tRet != null && tRet.equals("tipo_invalido")) {
          sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + id);
      }
      return null;
  }

  @Override
  public String visitCmdRetorne(LAParser.CmdRetorneContext ctx) {
    if (!escopos.topo().getNome().equals("funcao")){
      sp.println("Linha " + ctx.start.getLine() + ": comando retorne nao permitido nesse escopo");
    }
    return null;
  }

  @Override
  public String visitRegistro(LAParser.RegistroContext ctx) {
      /* 'registro' (variavel)* 'fim_registro' */
      if (ctx.getParent().getParent() instanceof LAParser.VariavelContext) {
          escopos.empilhar(new TabelaDeSimbolos("registro"));
          for (LAParser.VariavelContext var : ctx.variavel()) {
              visitVariavel(var);
          }
          escopos.desempilhar();
      } else {
          for (LAParser.VariavelContext var : ctx.variavel()) {
              visitVariavel(var);
          }
      }
      return null;
  }

  @Override
  public String visitVariavel(LAParser.VariavelContext ctx) {
      /* variavel: identificador (',' identificador)* ':' tipo; */
      String tipo = ctx.tipo().getText();
      for (LAParser.IdentificadorContext id : ctx.identificador()) {
              if (escopos.topo().existeSimbolo(id.getText())) {
                  sp.println("Linha " + id.start.getLine() + ": identificador " + id.getText() + " ja declarado anteriormente");
              } else {
                  String var = id.getText();
                  if (ctx.tipo().registro() != null) {
                      tabelaDeRegistros.put(var, new ArrayList<>());
                  }
                  if (escopos.topo().getNome().equals("registro")) {
//                      var = tabelaDeRegistros.
                  }
                  escopos.topo().adicionarSimbolo(id.getText(), tipo, LAEnums.tipoSimbolo.VARIAVEL);
              }
      }
      if(tabelaDeTipos.indexOf(tipo) == -1) {
          sp.println("Linha " + ctx.start.getLine() + ": tipo " + tipo + " nao declarado");
      }
      return null;
  }

  @Override
  public String visitIdentificador(LAParser.IdentificadorContext ctx) {
      /* identificador: IDENT ('.'  IDENT)* dimensao; */
      String nome = ctx.IDENT().get(0).getText();
      for(int i = 1; i < ctx.IDENT().size(); i++) nome += "." + ctx.IDENT().get(i).getText();
      if(!escopos.topo().existeSimbolo(nome)) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + nome + " nao declarado");
      }
      if (ctx.dimensao() != null) { visitDimensao(ctx.dimensao()); }
      return escopos.topo().getTipoSimbolo(nome);
  }

  @Override
  public String visitTipo_estendido(LAParser.Tipo_estendidoContext ctx) {
      /* op_ptr? tipo_basico_ident */
      return ((ctx.op_ptr() != null) ? "^" : "") + visitTipo_basico_ident(ctx.tipo_basico_ident());
  }

  @Override
  public String visitTipo_basico_ident(LAParser.Tipo_basico_identContext ctx) {
      /* tipo_basico_ident: tipo_basico | IDENT */
      if (ctx.tipo_basico() != null) { return ctx.tipo_basico().getText(); }
      else return ctx.IDENT().getText();
  }

  @Override
  public String visitExpressao(LAParser.ExpressaoContext ctx) {
      /* t1=termo_logico ('ou' t2+=termo_logico)* */
      String t1 = visitTermo_logico(ctx.t1);
      for (LAParser.Termo_logicoContext t : ctx.t2) {
          String t2 = visitTermo_logico(t);
          t1 = getTipoRetorno(LAEnums.tipoOperacao.LOGICA, t1, t2);
      }
      return t1;
  }

  @Override
  public String visitTermo_logico(LAParser.Termo_logicoContext ctx) {
      /* f1=fator_logico ('e' f2+=fator_logico)* */
      String f1 = visitFator_logico(ctx.f1);
      for (LAParser.Fator_logicoContext f : ctx.f2) {
          String f2 = visitFator_logico(f);
          f1 = getTipoRetorno(LAEnums.tipoOperacao.LOGICA, f1, f2);
      }
      return f1;
  }

  @Override
  public String visitParcela_logica_atom(LAParser.Parcela_logica_atomContext ctx) {
      return "logico";
  }

  @Override
  public String visitExp_relacional(LAParser.Exp_relacionalContext ctx) {
      /* exp_aritmetica (op_relacional exp_aritmetica)? */
      String exp1 = null;
      for(LAParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()){
          String exp2 = visitExp_aritmetica(exp);
          exp1 = getTipoRetorno(LAEnums.tipoOperacao.RELACIONAL, exp1, exp2);
      }
      return exp1;
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
              return "tipo_invalido";
          }
          return tp;
      } else if (ctx.parcela_nao_unario() != null) {
          return visit(ctx.parcela_nao_unario());
      }
      return null;
  }

  @Override
  public String visitParcela_unario_atom_int (LAParser.Parcela_unario_atom_intContext ctx) {
      return "inteiro";
  }

  @Override
  public String visitParcela_unario_atom_real (LAParser.Parcela_unario_atom_realContext ctx) {
      return "real";
  }

  @Override
  public String visitParcela_nao_unario_id (LAParser.Parcela_nao_unario_idContext ctx) {
      /* '&'  identificador */
      return "&" + visitIdentificador(ctx.identificador());
  }

  @Override
  public String visitParcela_nao_unario_cad (LAParser.Parcela_nao_unario_cadContext ctx) {
      return "literal";
  }
}
