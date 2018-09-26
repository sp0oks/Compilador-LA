package t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnalisadorSemantico extends LABaseVisitor<String> {
  PilhaDeTabelas escopos;
  SaidaParser sp;
  HashMap<String, List<String>> tabelaDeParametros;
  HashMap<String, List<EntradaTabelaDeSimbolos>> tabelaDeRegistros;
  ArrayList<String> tabelaDeTipos;

  public AnalisadorSemantico(SaidaParser sp) { this.sp = sp; }

  public boolean isNumerico(String tipo) { return (tipo.equals("inteiro") || tipo.equals("real")); }

  public String isExpressaoValida(LAEnums.TipoDeOperacao op, String t1, String t2) {
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
  public String visitPrograma (LAParser.ProgramaContext ctx) {
      /* programa: declaracoes 'algoritmo' corpo 'fim_algoritmo'; */
      escopos = new PilhaDeTabelas();
      tabelaDeParametros = new HashMap<>();
      tabelaDeRegistros = new HashMap<>();
      tabelaDeTipos = new ArrayList<>();

      escopos.empilhar(new TabelaDeSimbolos("global"));
      tabelaDeTipos.addAll(Arrays.asList("inteiro", "real", "literal", "logico", "registro",
                                         "vazio", "^inteiro", "^real", "^literal", "^logico"));

      visitDeclaracoes(ctx.declaracoes());
      visitCorpo(ctx.corpo());
      return null;
  }

  @Override
  public String visitDeclaracao_local_const (LAParser.Declaracao_local_constContext ctx) {
      /* declaracao_local: 'constante'  IDENT ':' tipo_basico '=' valor_constante */
      String id = ctx.IDENT().getText();
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          String tipo = visitTipo_basico(ctx.tipo_basico());
          escopos.topo().adicionarSimbolo(id, tipo, LAEnums.TipoDeDado.CONSTANTE);
      }
      return null;
  }

  @Override
  public String visitDeclaracao_local_tipo (LAParser.Declaracao_local_tipoContext ctx) {
      /* declaraçao_local: 'tipo' IDENT ':' tipo */
      String id = ctx.IDENT().getText();

      if(escopos.topo().existeSimbolo(id)) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + id + " ja declarado anteriormente");
      } else {
          if (ctx.tipo().registro() != null) {
              escopos.topo().adicionarSimbolo(id, "registro", LAEnums.TipoDeDado.REGISTRO);
              tabelaDeRegistros.put(id, new ArrayList<>());
          } else { escopos.topo().adicionarSimbolo(id, "tipo", LAEnums.TipoDeDado.TIPO); }
          tabelaDeTipos.add(id);
          if (!id.startsWith("^")) {
              tabelaDeTipos.add("^" + ctx.IDENT().getText());
          }
          visitTipo(ctx.tipo());
      }
      return null;
  }

  @Override
  public String visitDeclaracao_global_proc (LAParser.Declaracao_global_procContext ctx) {
      /* decl_global: 'procedimento'  IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento' */
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), "vazio", LAEnums.TipoDeDado.FUNCAO);
          tabelaDeParametros.put(ctx.IDENT().getText(), new ArrayList<>());
          escopos.empilhar(new TabelaDeSimbolos("procedimento"));
          if (ctx.parametros() != null) {
              for (LAParser.ParametroContext par : ctx.parametros().parametro()) {
                  String tPar = visitParametro(par);
                  tabelaDeParametros.get(ctx.IDENT().getText()).add(tPar);
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
  public String visitDeclaracao_global_func (LAParser.Declaracao_global_funcContext ctx) {
      /* decl_global : 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' */
      if(escopos.topo().existeSimbolo(ctx.IDENT().getText())) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " ja declarado anteriormente");
      } else {
          String tipo = visitTipo_estendido(ctx.tipo_estendido());
          escopos.topo().adicionarSimbolo(ctx.IDENT().getText(), tipo, LAEnums.TipoDeDado.FUNCAO);
          tabelaDeParametros.put(ctx.IDENT().getText(), new ArrayList<>());
          escopos.empilhar(new TabelaDeSimbolos("funcao"));
          if (ctx.parametros() != null) {
              for (LAParser.ParametroContext par : ctx.parametros().parametro()) {
                  String tPar = visitParametro(par);
                  tabelaDeParametros.get(ctx.IDENT().getText()).add(tPar);
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
  public String visitParametro (LAParser.ParametroContext ctx) {
      /* parametro : 'var'? identificador (',' identificador)* ':' tipo_estendido */
      String tipo = visitTipo_estendido(ctx.tipo_estendido());
      LAEnums.TipoDeDado tDado = LAEnums.TipoDeDado.REGISTRO;

      if (escopos.getTipoDeDado(tipo) != LAEnums.TipoDeDado.REGISTRO)
          tDado = LAEnums.TipoDeDado.VARIAVEL;
// usar isso no gerador de código
//      if (ctx.getText().startsWith("var")) {
//          tipo = "^" + tipo;
//      }
      for (LAParser.IdentificadorContext id : ctx.identificador()) {
          if (escopos.topo().existeSimbolo(id.getText())) {
              sp.println("Linha " + id.start.getLine() + ": identificador " + id.getText() + " ja declarado anteriormente");
          } else {
              escopos.topo().adicionarSimbolo(id.getText(), tipo, tDado);
              visitIdentificador(id);
              // Se o parâmetro for um registro, adicionar também os atributos deste ao escopo
              if (tDado == LAEnums.TipoDeDado.REGISTRO) {
                  for (int i = 0; i < tabelaDeRegistros.get(tipo).size(); i++) {
                      EntradaTabelaDeSimbolos atributo = tabelaDeRegistros.get(tipo).get(i);
                      escopos.topo().adicionarSimbolo(id.getText() + "." + atributo.getNome(), atributo.getTipo(), atributo.getTipoDeDado());
                  }
              }
          }
      }
      return tipo;
  }

  @Override
  public String visitCmdPara (LAParser.CmdParaContext ctx) {
      /* cmd : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para' */
      if(escopos.existeSimbolo(ctx.IDENT().getText())) {
          String tipo = escopos.getTipoSimbolo(ctx.IDENT().getText());
          for (LAParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()) {
              tipo = isExpressaoValida(LAEnums.TipoDeOperacao.ARITMETICA, tipo, visitExp_aritmetica(exp));
          }
          if (tipo.equals("tipo_invalido")) {
              sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + ctx.IDENT().getText());
          }
          if (ctx.cmd() != null) {
              for (LAParser.CmdContext cmd : ctx.cmd()) {
                  visit(cmd);
              }
          }
      } else {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + ctx.IDENT().getText() + " nao declarado");
      }
      return null;
  }

  @Override
  public String visitCmdAtribuicao (LAParser.CmdAtribuicaoContext ctx) {
      /* cmd : '^'? identificador '<-' expressao */
      String tExpr, tRet;
      String tipo = visitIdentificador(ctx.identificador());

      String id = ctx.identificador().IDENT(0).getText();
      for (int i = 1; i < ctx.identificador().IDENT().size(); i++){
          id += "." + ctx.identificador().IDENT(i).getText();
      }
      LAEnums.TipoDeOperacao op = LAEnums.TipoDeOperacao.ARITMETICA;

      if (tipo != null) {
          if (ctx.op_ptr() != null) {
              id = "^" + id;
              if (!tipo.startsWith("^")) {
                  tipo = "^" + tipo;
                  op = LAEnums.TipoDeOperacao.PONTEIRO;
              } else { tipo = tipo.substring(tipo.indexOf("^")+1); }
          } else {
              if (tipo.startsWith("^")) { op = LAEnums.TipoDeOperacao.PONTEIRO; }
              if (tipo.equals("logico")) { op = LAEnums.TipoDeOperacao.LOGICA; }
              else if (escopos.topo().getTipoDeDado(tipo) == LAEnums.TipoDeDado.REGISTRO) {
                  op = LAEnums.TipoDeOperacao.REGISTRO;
              }
          }
      }
      tExpr = visitExpressao(ctx.expressao());
      tRet = isExpressaoValida(op, tipo, tExpr);

      if (tRet != null && tRet.equals("tipo_invalido")) {
          if (ctx.identificador().dimensao() != null) {
              String index = ctx.identificador().dimensao().getText();
              sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + id + index);
          } else {
              sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + id);
          }
      }
      return null;
  }

  @Override
  public String visitCmdRetorne (LAParser.CmdRetorneContext ctx) {
      /* cmd : 'retorne' expressao */
      if (!escopos.topo().getNome().equals("funcao")){
          sp.println("Linha " + ctx.start.getLine() + ": comando retorne nao permitido nesse escopo");
      }
      visitExpressao(ctx.expressao());
      return null;
  }

  @Override
  public String visitVariavel (LAParser.VariavelContext ctx) {
      /* variavel : identificador (',' identificador)* ':' tipo; */
      String tipo = ctx.tipo().getText().startsWith("registro") ? "registro" : ctx.tipo().getText();
      for (LAParser.IdentificadorContext id : ctx.identificador()) {
          String var = id.getText();
          LAEnums.TipoDeDado simbolo = LAEnums.TipoDeDado.VARIAVEL;

          // variável é um vetor
          if (id.dimensao() != null) {
              var = var.substring(0, var.indexOf('['));
              simbolo = LAEnums.TipoDeDado.VETOR;
          }
          if (escopos.topo().existeSimbolo(var)) {
              sp.println("Linha " + id.start.getLine() + ": identificador " + id.getText() + " ja declarado anteriormente");
          } else {
                  // variável é um registro sem nome
                  if (tipo.equals("registro")) {
                      simbolo = LAEnums.TipoDeDado.REGISTRO;

                      if (tabelaDeRegistros.get(var) == null) {
                          tabelaDeRegistros.put(var, new ArrayList<>());
                      }
                  }
                  // variável é atributo de um registro
                  if (escopos.topo().getNome().startsWith("registro")) {
                      String id_reg = escopos.topo().getNome();
                      EntradaTabelaDeSimbolos atributo = new EntradaTabelaDeSimbolos(var, tipo, simbolo);
                      // adicionando variável à lista de atributos do registro
                      id_reg = id_reg.substring(id_reg.indexOf("[") + 1, id_reg.indexOf("]"));
                      tabelaDeRegistros.get(id_reg).add(atributo);
                  }
                  escopos.topo().adicionarSimbolo(var, tipo, simbolo);

                  // variável é de um tipo registro declarado anteriormente
                  if (escopos.topo().existeSimbolo(tipo) && escopos.topo().getTipoSimbolo(tipo).equals("registro")) {
                      for (int i = 0; i < tabelaDeRegistros.get(tipo).size(); i++) {
                          // adicionamos todos os atributos deste tipo à nova variavel
                          EntradaTabelaDeSimbolos atributo = tabelaDeRegistros.get(tipo).get(i);
                          escopos.topo().adicionarSimbolo(var + "." + atributo.getNome(), atributo.getTipo(), atributo.getTipoDeDado());
                      }
                  }
              }
          }
      visitTipo(ctx.tipo());
      if(tabelaDeTipos.indexOf(tipo) == -1) {
          sp.println("Linha " + ctx.start.getLine() + ": tipo " + tipo + " nao declarado");
      }
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
              for (LAParser.VariavelContext var : ctx.variavel()) {
                  visitVariavel(var);
              }
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
      if(!escopos.topo().existeSimbolo(nome)) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + nome + " nao declarado");
      }
      if (ctx.dimensao() != null) { visitDimensao(ctx.dimensao()); }
      return escopos.topo().getTipoSimbolo(nome);
  }

  @Override
  public String visitTipo_estendido (LAParser.Tipo_estendidoContext ctx) {
      /* tipo_estendido : op_ptr? tipo_basico_ident */
      return ((ctx.op_ptr() != null) ? "^" : "") + visitTipo_basico_ident(ctx.tipo_basico_ident());
  }

  @Override
  public String visitTipo_basico_ident (LAParser.Tipo_basico_identContext ctx) {
      /* tipo_basico_ident : tipo_basico | IDENT */
      if (ctx.tipo_basico() != null) { return ctx.tipo_basico().getText(); }
      else return ctx.IDENT().getText();
  }

  @Override
  public String visitExpressao (LAParser.ExpressaoContext ctx) {
      /* expressao : t1=termo_logico ('ou' t2+=termo_logico)* */
      String t1 = visitTermo_logico(ctx.t1);
      for (LAParser.Termo_logicoContext t : ctx.t2) {
          String t2 = visitTermo_logico(t);
          t1 = isExpressaoValida(LAEnums.TipoDeOperacao.LOGICA, t1, t2);
      }
      return t1;
  }

  @Override
  public String visitTermo_logico (LAParser.Termo_logicoContext ctx) {
      /* termo_logico : f1=fator_logico ('e' f2+=fator_logico)* */
      String f1 = visitFator_logico(ctx.f1);
      for (LAParser.Fator_logicoContext f : ctx.f2) {
          String f2 = visitFator_logico(f);
          f1 = isExpressaoValida(LAEnums.TipoDeOperacao.LOGICA, f1, f2);
      }
      return f1;
  }

  @Override
  public String visitParcela_logica_atom (LAParser.Parcela_logica_atomContext ctx) {
      /* parcela_logica : ('verdadeiro' | 'falso') */
      return "logico";
  }

  @Override
  public String visitExp_relacional (LAParser.Exp_relacionalContext ctx) {
      /* exp_relacional : exp_aritmetica (op_relacional exp_aritmetica)? */
      String exp1 = null;
      for(LAParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()){
          String exp2 = visitExp_aritmetica(exp);
          exp1 = isExpressaoValida(LAEnums.TipoDeOperacao.RELACIONAL, exp1, exp2);
      }
      return exp1;
  }

  @Override
  public String visitExp_aritmetica (LAParser.Exp_aritmeticaContext ctx) {
      /* exp_aritmetica : termo (op1 termo)* ; */
      String t1 = null;
      for(LAParser.TermoContext t : ctx.termo()){
          String t2 = visitTermo(t);
          t1 = isExpressaoValida(LAEnums.TipoDeOperacao.ARITMETICA, t1, t2);
      }
      return t1;
  }

  @Override
  public String visitTermo (LAParser.TermoContext ctx) {
      /* termo : fator (op2 fator)* ; */
      String f1 = null;
      for(LAParser.FatorContext ftr : ctx.fator()){
          String f2 = visitFator(ftr);
          f1 = isExpressaoValida(LAEnums.TipoDeOperacao.ARITMETICA, f1, f2);
      }
      return f1;
  }

  @Override
  public String visitFator (LAParser.FatorContext ctx){
      /* fator : parcela (op3 parcela)? ; */
      String p1 = null;
      for(LAParser.ParcelaContext pcl : ctx.parcela()){
          String p2 = visitParcela(pcl);
          p1 = isExpressaoValida(LAEnums.TipoDeOperacao.ARITMETICA, p1, p2);
      }
      return p1;
  }

  @Override
  public String visitParcela (LAParser.ParcelaContext ctx) {
      /* parcela : op_unario? parcela_unario | parcela_nao_unario; */
      if (ctx.parcela_unario() != null) {
          String tp = visit(ctx.parcela_unario());
          if (ctx.op_unario() != null && !isNumerico(tp)) {
              return "tipo_invalido";
          }
          return tp;
      }
      return visit(ctx.parcela_nao_unario());
  }

  @Override
  public String visitParcela_unario_id (LAParser.Parcela_unario_idContext ctx) {
      /* parcela_unario : op_ptr? identificador */
      String tipo = visitIdentificador(ctx.identificador());
      if (ctx.op_ptr() != null) {
          if (!tipo.startsWith("^")) tipo = "^" + tipo;
      }
      return tipo;
  }

  @Override
  public String visitParcela_unario_func (LAParser.Parcela_unario_funcContext ctx) {
      /* parcela_unario : IDENT '(' expressao (','  expressao)* ')' */
      String nome = ctx.IDENT().getText();

      if(!escopos.topo().existeSimbolo(nome)) {
          sp.println("Linha " + ctx.start.getLine() + ": identificador " + nome + " nao declarado");
      } else {
          boolean valid = true;

          if (tabelaDeParametros.get(nome).size() == ctx.expressao().size()) {
              if (ctx.expressao().size() > 0) {
                  int i = 0;
                  for (LAParser.ExpressaoContext param : ctx.expressao()) {
                      valid = tabelaDeParametros.get(nome).get(i).equals(visitExpressao(param));
                      if (!valid) { break; }
                      i++;
                  }
              }
          } else { valid = false; }
          if (!valid) {
              sp.println("Linha " + ctx.start.getLine() + ": incompatibilidade de parametros na chamada de " + nome);
          }
      }
      return escopos.getTipoSimbolo(nome);
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
}
