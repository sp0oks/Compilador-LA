// Generated from C:/Users/Gabriel/IdeaProjects/Compilador-LA/src/main/java\LA.g4 by ANTLR 4.7
package t1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, TIPO_BASICO=45, 
		OP1=46, OP2=47, OP3=48, OP_UNARIO=49, OP_LOGICO_1=50, OP_LOGICO_2=51, 
		OP_RELACIONAL=52, IDENT=53, CADEIA=54, NUM_INT=55, NUM_REAL=56, COMENT=57, 
		ESPACO=58, COMENT_N_FECHADO=59, SIMB_N_IDENTIFICADO=60;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico_ident = 8, RULE_tipo_estendido = 9, RULE_valor_constante = 10, 
		RULE_registro = 11, RULE_declaracao_global = 12, RULE_parametro = 13, 
		RULE_parametros = 14, RULE_corpo = 15, RULE_cmd = 16, RULE_selecao = 17, 
		RULE_item_selecao = 18, RULE_constantes = 19, RULE_numero_intervalo = 20, 
		RULE_exp_aritmetica = 21, RULE_termo = 22, RULE_fator = 23, RULE_parcela = 24, 
		RULE_parcela_unario = 25, RULE_parcela_nao_unario = 26, RULE_exp_relacional = 27, 
		RULE_expressao = 28, RULE_termo_logico = 29, RULE_fator_logico = 30, RULE_parcela_logica = 31;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"identificador", "dimensao", "tipo", "tipo_basico_ident", "tipo_estendido", 
		"valor_constante", "registro", "declaracao_global", "parametro", "parametros", 
		"corpo", "cmd", "selecao", "item_selecao", "constantes", "numero_intervalo", 
		"exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", "parcela_nao_unario", 
		"exp_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'.'", "'['", "']'", "'^'", "'verdadeiro'", "'falso'", 
		"'registro'", "'fim_registro'", "'procedimento'", "'('", "')'", "'fim_procedimento'", 
		"'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", 
		"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", 
		"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "';'", 
		"'retorne'", "'..'", "'&'", "'nao'", null, null, null, "'%'", "'-'", "'ou'", 
		"'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "TIPO_BASICO", "OP1", 
		"OP2", "OP3", "OP_UNARIO", "OP_LOGICO_1", "OP_LOGICO_2", "OP_RELACIONAL", 
		"IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENT", "ESPACO", "COMENT_N_FECHADO", 
		"SIMB_N_IDENTIFICADO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			declaracoes();
			setState(65);
			match(T__0);
			setState(66);
			corpo();
			setState(67);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__16) | (1L << T__20))) != 0)) {
				{
				{
				setState(69);
				decl_local_global();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				declaracao_local();
				}
				break;
			case T__16:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	 
		public Declaracao_localContext() { }
		public void copyFrom(Declaracao_localContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaracao_local_varContext extends Declaracao_localContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Declaracao_local_varContext(Declaracao_localContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declaracao_local_constContext extends Declaracao_localContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode TIPO_BASICO() { return getToken(LAParser.TIPO_BASICO, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Declaracao_local_constContext(Declaracao_localContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local_const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declaracao_local_tipoContext extends Declaracao_localContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_local_tipoContext(Declaracao_localContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new Declaracao_local_varContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__2);
				setState(80);
				variavel();
				}
				break;
			case T__3:
				_localctx = new Declaracao_local_constContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__3);
				setState(82);
				match(IDENT);
				setState(83);
				match(T__4);
				setState(84);
				match(TIPO_BASICO);
				setState(85);
				match(T__5);
				setState(86);
				valor_constante();
				}
				break;
			case T__6:
				_localctx = new Declaracao_local_tipoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(T__6);
				setState(88);
				match(IDENT);
				setState(89);
				match(T__4);
				setState(90);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public IdentificadorContext id1;
		public IdentificadorContext identificador;
		public List<IdentificadorContext> id2 = new ArrayList<IdentificadorContext>();
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((VariavelContext)_localctx).id1 = identificador();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(94);
				match(T__7);
				setState(95);
				((VariavelContext)_localctx).identificador = identificador();
				((VariavelContext)_localctx).id2.add(((VariavelContext)_localctx).identificador);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__4);
			setState(102);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENT);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(105);
				match(T__8);
				setState(106);
				match(IDENT);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(114);
				match(T__9);
				setState(115);
				exp_aritmetica();
				setState(116);
				match(T__10);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				registro();
				}
				break;
			case T__11:
			case TIPO_BASICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public TerminalNode TIPO_BASICO() { return getToken(LAParser.TIPO_BASICO, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==TIPO_BASICO || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(129);
				match(T__11);
				}
			}

			setState(132);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__14);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(137);
				variavel();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	 
		public Declaracao_globalContext() { }
		public void copyFrom(Declaracao_globalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaracao_global_funcContext extends Declaracao_globalContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Declaracao_global_funcContext(Declaracao_globalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_global_func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declaracao_global_procContext extends Declaracao_globalContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Declaracao_global_procContext(Declaracao_globalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global_proc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global_proc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_global_proc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao_global);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new Declaracao_global_procContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__16);
				setState(146);
				match(IDENT);
				setState(147);
				match(T__17);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==IDENT) {
					{
					setState(148);
					parametros();
					}
				}

				setState(151);
				match(T__18);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(152);
					declaracao_local();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(158);
					cmd();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new Declaracao_global_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__20);
				setState(166);
				match(IDENT);
				setState(167);
				match(T__17);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==IDENT) {
					{
					setState(168);
					parametros();
					}
				}

				setState(171);
				match(T__18);
				setState(172);
				match(T__4);
				setState(173);
				tipo_estendido();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(174);
					declaracao_local();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(180);
					cmd();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(190);
				match(T__22);
				}
			}

			setState(193);
			identificador();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(194);
				match(T__7);
				setState(195);
				identificador();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__4);
			setState(202);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			parametro();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(205);
				match(T__7);
				setState(206);
				parametro();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(212);
				declaracao_local();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
				{
				{
				setState(218);
				cmd();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmdChamadaContext extends CmdContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdChamadaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdAtribuicaoContext extends CmdContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdAtribuicaoContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdLeiaContext extends CmdContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdLeiaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdFacaContext extends CmdContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdEscrevaContext extends CmdContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdEscrevaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdSeContext extends CmdContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdParaContext extends CmdContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdEnquantoContext extends CmdContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdCasoContext extends CmdContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdRetorneContext extends CmdContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmd);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new CmdLeiaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__23);
				setState(225);
				match(T__17);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(226);
					match(T__11);
					}
				}

				setState(229);
				identificador();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(230);
					match(T__7);
					setState(231);
					expressao();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new CmdEscrevaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__24);
				setState(240);
				match(T__17);
				setState(241);
				expressao();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(242);
					match(T__7);
					setState(243);
					expressao();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new CmdSeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__25);
				setState(252);
				expressao();
				setState(253);
				match(T__26);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(254);
					cmd();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(260);
					match(T__27);
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
						{
						{
						setState(261);
						cmd();
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(269);
				match(T__28);
				}
				break;
			case 4:
				_localctx = new CmdCasoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(T__29);
				setState(272);
				exp_aritmetica();
				setState(273);
				match(T__30);
				setState(274);
				selecao();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(275);
					match(T__27);
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
						{
						{
						setState(276);
						cmd();
						}
						}
						setState(281);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(284);
				match(T__31);
				}
				break;
			case 5:
				_localctx = new CmdParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(T__32);
				setState(287);
				match(IDENT);
				setState(288);
				match(T__33);
				setState(289);
				exp_aritmetica();
				setState(290);
				match(T__34);
				setState(291);
				exp_aritmetica();
				setState(292);
				match(T__35);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(293);
					cmd();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__36);
				}
				break;
			case 6:
				_localctx = new CmdEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(T__37);
				setState(302);
				expressao();
				setState(303);
				match(T__35);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(304);
					cmd();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				match(T__38);
				}
				break;
			case 7:
				_localctx = new CmdFacaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				match(T__35);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(313);
					cmd();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T__34);
				setState(320);
				expressao();
				}
				break;
			case 8:
				_localctx = new CmdAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(321);
					match(T__11);
					}
				}

				setState(324);
				identificador();
				setState(325);
				match(T__33);
				setState(326);
				expressao();
				}
				break;
			case 9:
				_localctx = new CmdChamadaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(328);
				match(IDENT);
				setState(329);
				match(T__17);
				setState(330);
				expressao();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(331);
					match(T__39);
					setState(332);
					expressao();
					}
				}

				setState(335);
				match(T__18);
				}
				break;
			case 10:
				_localctx = new CmdRetorneContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(337);
				match(T__40);
				setState(338);
				expressao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_UNARIO || _la==NUM_INT) {
				{
				{
				setState(341);
				item_selecao();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			constantes();
			setState(348);
			match(T__4);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
				{
				{
				setState(349);
				cmd();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			numero_intervalo();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(356);
				match(T__7);
				setState(357);
				numero_intervalo();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LAParser.NUM_INT, i);
		}
		public List<TerminalNode> OP_UNARIO() { return getTokens(LAParser.OP_UNARIO); }
		public TerminalNode OP_UNARIO(int i) {
			return getToken(LAParser.OP_UNARIO, i);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_UNARIO) {
				{
				setState(363);
				match(OP_UNARIO);
				}
			}

			setState(366);
			match(NUM_INT);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(367);
				match(T__41);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_UNARIO) {
					{
					setState(368);
					match(OP_UNARIO);
					}
				}

				setState(371);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP1() { return getTokens(LAParser.OP1); }
		public TerminalNode OP1(int i) {
			return getToken(LAParser.OP1, i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			termo();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP1) {
				{
				{
				setState(375);
				match(OP1);
				setState(376);
				termo();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OP2() { return getTokens(LAParser.OP2); }
		public TerminalNode OP2(int i) {
			return getToken(LAParser.OP2, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			fator();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP2) {
				{
				{
				setState(383);
				match(OP2);
				setState(384);
				fator();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public TerminalNode OP3() { return getToken(LAParser.OP3, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			parcela();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP3) {
				{
				setState(391);
				match(OP3);
				setState(392);
				parcela();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public TerminalNode OP_UNARIO() { return getToken(LAParser.OP_UNARIO, 0); }
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parcela);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__17:
			case OP_UNARIO:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_UNARIO) {
					{
					setState(395);
					match(OP_UNARIO);
					}
				}

				setState(398);
				parcela_unario();
				}
				break;
			case T__42:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	 
		public Parcela_unarioContext() { }
		public void copyFrom(Parcela_unarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Parcela_unario_exprContext extends Parcela_unarioContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Parcela_unario_exprContext(Parcela_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_unario_funcContext extends Parcela_unarioContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Parcela_unario_funcContext(Parcela_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario_func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_unario_atom_intContext extends Parcela_unarioContext {
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Parcela_unario_atom_intContext(Parcela_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario_atom_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario_atom_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario_atom_int(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_unario_idContext extends Parcela_unarioContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Parcela_unario_idContext(Parcela_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_unario_atom_realContext extends Parcela_unarioContext {
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public Parcela_unario_atom_realContext(Parcela_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario_atom_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario_atom_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario_atom_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parcela_unario);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new Parcela_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(402);
					match(T__11);
					}
				}

				setState(405);
				identificador();
				}
				break;
			case 2:
				_localctx = new Parcela_unario_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__17);
				setState(407);
				expressao();
				setState(408);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new Parcela_unario_funcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(IDENT);
				setState(411);
				match(T__17);
				setState(412);
				expressao();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(413);
					match(T__7);
					setState(414);
					expressao();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
				match(T__18);
				}
				break;
			case 4:
				_localctx = new Parcela_unario_atom_intContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(NUM_INT);
				}
				break;
			case 5:
				_localctx = new Parcela_unario_atom_realContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(NUM_REAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	 
		public Parcela_nao_unarioContext() { }
		public void copyFrom(Parcela_nao_unarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Parcela_nao_unario_cadContext extends Parcela_nao_unarioContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Parcela_nao_unario_cadContext(Parcela_nao_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_nao_unario_cad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_nao_unario_idContext extends Parcela_nao_unarioContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Parcela_nao_unario_idContext(Parcela_nao_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_nao_unario_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parcela_nao_unario);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new Parcela_nao_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__42);
				setState(427);
				identificador();
				}
				break;
			case CADEIA:
				_localctx = new Parcela_nao_unario_cadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode OP_RELACIONAL() { return getToken(LAParser.OP_RELACIONAL, 0); }
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			exp_aritmetica();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_RELACIONAL) {
				{
				setState(432);
				match(OP_RELACIONAL);
				setState(433);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOGICO_1() { return getTokens(LAParser.OP_LOGICO_1); }
		public TerminalNode OP_LOGICO_1(int i) {
			return getToken(LAParser.OP_LOGICO_1, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			termo_logico();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO_1) {
				{
				{
				setState(437);
				match(OP_LOGICO_1);
				setState(438);
				termo_logico();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOGICO_2() { return getTokens(LAParser.OP_LOGICO_2); }
		public TerminalNode OP_LOGICO_2(int i) {
			return getToken(LAParser.OP_LOGICO_2, i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			fator_logico();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOGICO_2) {
				{
				{
				setState(445);
				match(OP_LOGICO_2);
				setState(446);
				fator_logico();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(452);
				match(T__43);
				}
			}

			setState(455);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	 
		public Parcela_logicaContext() { }
		public void copyFrom(Parcela_logicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Parcela_logica_atomContext extends Parcela_logicaContext {
		public Parcela_logica_atomContext(Parcela_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_logica_atom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parcela_logica_exprContext extends Parcela_logicaContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logica_exprContext(Parcela_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_logica_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parcela_logica);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				_localctx = new Parcela_logica_atomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
			case T__17:
			case T__42:
			case OP_UNARIO:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				_localctx = new Parcela_logica_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\5\4P\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\5\t\u0080\n\t"+
		"\3\n\3\n\3\13\5\13\u0085\n\13\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u008d\n\r"+
		"\f\r\16\r\u0090\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\16"+
		"\3\16\7\16\u009c\n\16\f\16\16\16\u009f\13\16\3\16\7\16\u00a2\n\16\f\16"+
		"\16\16\u00a5\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\16\7\16\u00b8\n\16"+
		"\f\16\16\16\u00bb\13\16\3\16\3\16\5\16\u00bf\n\16\3\17\5\17\u00c2\n\17"+
		"\3\17\3\17\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\7\20\u00d2\n\20\f\20\16\20\u00d5\13\20\3\21\7\21\u00d8"+
		"\n\21\f\21\16\21\u00db\13\21\3\21\7\21\u00de\n\21\f\21\16\21\u00e1\13"+
		"\21\3\22\3\22\3\22\5\22\u00e6\n\22\3\22\3\22\3\22\7\22\u00eb\n\22\f\22"+
		"\16\22\u00ee\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f7\n\22"+
		"\f\22\16\22\u00fa\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0102\n\22"+
		"\f\22\16\22\u0105\13\22\3\22\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13"+
		"\22\5\22\u010e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0118"+
		"\n\22\f\22\16\22\u011b\13\22\5\22\u011d\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0129\n\22\f\22\16\22\u012c\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0134\n\22\f\22\16\22\u0137\13\22\3\22"+
		"\3\22\3\22\3\22\7\22\u013d\n\22\f\22\16\22\u0140\13\22\3\22\3\22\3\22"+
		"\5\22\u0145\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0150"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0156\n\22\3\23\7\23\u0159\n\23\f\23\16"+
		"\23\u015c\13\23\3\24\3\24\3\24\7\24\u0161\n\24\f\24\16\24\u0164\13\24"+
		"\3\25\3\25\3\25\7\25\u0169\n\25\f\25\16\25\u016c\13\25\3\26\5\26\u016f"+
		"\n\26\3\26\3\26\3\26\5\26\u0174\n\26\3\26\5\26\u0177\n\26\3\27\3\27\3"+
		"\27\7\27\u017c\n\27\f\27\16\27\u017f\13\27\3\30\3\30\3\30\7\30\u0184\n"+
		"\30\f\30\16\30\u0187\13\30\3\31\3\31\3\31\5\31\u018c\n\31\3\32\5\32\u018f"+
		"\n\32\3\32\3\32\5\32\u0193\n\32\3\33\5\33\u0196\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01a2\n\33\f\33\16\33\u01a5\13"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01ab\n\33\3\34\3\34\3\34\5\34\u01b0\n\34"+
		"\3\35\3\35\3\35\5\35\u01b5\n\35\3\36\3\36\3\36\7\36\u01ba\n\36\f\36\16"+
		"\36\u01bd\13\36\3\37\3\37\3\37\7\37\u01c2\n\37\f\37\16\37\u01c5\13\37"+
		"\3 \5 \u01c8\n \3 \3 \3!\3!\5!\u01ce\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\4\2//\67\67\4\2\17\20"+
		"8:\3\2\17\20\2\u01f2\2B\3\2\2\2\4J\3\2\2\2\6O\3\2\2\2\b]\3\2\2\2\n_\3"+
		"\2\2\2\fj\3\2\2\2\16z\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u0084"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u00be\3\2\2\2\34\u00c1\3"+
		"\2\2\2\36\u00ce\3\2\2\2 \u00d9\3\2\2\2\"\u0155\3\2\2\2$\u015a\3\2\2\2"+
		"&\u015d\3\2\2\2(\u0165\3\2\2\2*\u016e\3\2\2\2,\u0178\3\2\2\2.\u0180\3"+
		"\2\2\2\60\u0188\3\2\2\2\62\u0192\3\2\2\2\64\u01aa\3\2\2\2\66\u01af\3\2"+
		"\2\28\u01b1\3\2\2\2:\u01b6\3\2\2\2<\u01be\3\2\2\2>\u01c7\3\2\2\2@\u01cd"+
		"\3\2\2\2BC\5\4\3\2CD\7\3\2\2DE\5 \21\2EF\7\4\2\2F\3\3\2\2\2GI\5\6\4\2"+
		"HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2MP\5\b\5"+
		"\2NP\5\32\16\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\7\5\2\2R^\5\n\6\2ST\7"+
		"\6\2\2TU\7\67\2\2UV\7\7\2\2VW\7/\2\2WX\7\b\2\2X^\5\26\f\2YZ\7\t\2\2Z["+
		"\7\67\2\2[\\\7\7\2\2\\^\5\20\t\2]Q\3\2\2\2]S\3\2\2\2]Y\3\2\2\2^\t\3\2"+
		"\2\2_d\5\f\7\2`a\7\n\2\2ac\5\f\7\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eg\3\2\2\2fd\3\2\2\2gh\7\7\2\2hi\5\20\t\2i\13\3\2\2\2jo\7\67\2\2k"+
		"l\7\13\2\2ln\7\67\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qo\3\2\2\2rs\5\16\b\2s\r\3\2\2\2tu\7\f\2\2uv\5,\27\2vw\7\r\2\2wy\3\2"+
		"\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}\u0080"+
		"\5\30\r\2~\u0080\5\24\13\2\177}\3\2\2\2\177~\3\2\2\2\u0080\21\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082\23\3\2\2\2\u0083\u0085\7\16\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\22\n\2"+
		"\u0087\25\3\2\2\2\u0088\u0089\t\3\2\2\u0089\27\3\2\2\2\u008a\u008e\7\21"+
		"\2\2\u008b\u008d\5\n\6\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\22\2\2\u0092\31\3\2\2\2\u0093\u0094\7\23\2\2\u0094"+
		"\u0095\7\67\2\2\u0095\u0097\7\24\2\2\u0096\u0098\5\36\20\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\7\25\2\2"+
		"\u009a\u009c\5\b\5\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\5\"\22\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00bf\7\26\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00ab"+
		"\7\24\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\7\7\2\2\u00af"+
		"\u00b3\5\24\13\2\u00b0\u00b2\5\b\5\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00bf\3\2\2\2\u00be\u0093\3"+
		"\2\2\2\u00be\u00a7\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00c2\7\31\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\5\f"+
		"\7\2\u00c4\u00c5\7\n\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5\24\13\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00d3\5\34\17\2\u00cf\u00d0\7\n\2\2\u00d0\u00d2\5\34"+
		"\17\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\b\5"+
		"\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00df\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\5\"\22\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0!\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\32\2\2\u00e3"+
		"\u00e5\7\24\2\2\u00e4\u00e6\7\16\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ec\5\f\7\2\u00e8\u00e9\7\n\2\2\u00e9"+
		"\u00eb\5:\36\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\25\2\2\u00f0\u0156\3\2\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3\7"+
		"\24\2\2\u00f3\u00f8\5:\36\2\u00f4\u00f5\7\n\2\2\u00f5\u00f7\5:\36\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc"+
		"\u0156\3\2\2\2\u00fd\u00fe\7\34\2\2\u00fe\u00ff\5:\36\2\u00ff\u0103\7"+
		"\35\2\2\u0100\u0102\5\"\22\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010d\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u010a\7\36\2\2\u0107\u0109\5\"\22\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\7\37\2\2\u0110\u0156\3\2\2\2\u0111\u0112\7"+
		" \2\2\u0112\u0113\5,\27\2\u0113\u0114\7!\2\2\u0114\u011c\5$\23\2\u0115"+
		"\u0119\7\36\2\2\u0116\u0118\5\"\22\2\u0117\u0116\3\2\2\2\u0118\u011b\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\7\"\2\2\u011f\u0156\3\2\2\2\u0120\u0121\7#\2\2\u0121"+
		"\u0122\7\67\2\2\u0122\u0123\7$\2\2\u0123\u0124\5,\27\2\u0124\u0125\7%"+
		"\2\2\u0125\u0126\5,\27\2\u0126\u012a\7&\2\2\u0127\u0129\5\"\22\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\'\2\2\u012e"+
		"\u0156\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131\5:\36\2\u0131\u0135\7&\2"+
		"\2\u0132\u0134\5\"\22\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u0139\7)\2\2\u0139\u0156\3\2\2\2\u013a\u013e\7&\2\2\u013b\u013d"+
		"\5\"\22\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142"+
		"\7%\2\2\u0142\u0156\5:\36\2\u0143\u0145\7\16\2\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5\f\7\2\u0147\u0148\7$"+
		"\2\2\u0148\u0149\5:\36\2\u0149\u0156\3\2\2\2\u014a\u014b\7\67\2\2\u014b"+
		"\u014c\7\24\2\2\u014c\u014f\5:\36\2\u014d\u014e\7*\2\2\u014e\u0150\5:"+
		"\36\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\7\25\2\2\u0152\u0156\3\2\2\2\u0153\u0154\7+\2\2\u0154\u0156\5:"+
		"\36\2\u0155\u00e2\3\2\2\2\u0155\u00f1\3\2\2\2\u0155\u00fd\3\2\2\2\u0155"+
		"\u0111\3\2\2\2\u0155\u0120\3\2\2\2\u0155\u012f\3\2\2\2\u0155\u013a\3\2"+
		"\2\2\u0155\u0144\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"#\3\2\2\2\u0157\u0159\5&\24\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2"+
		"\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b%\3\2\2\2\u015c\u015a\3"+
		"\2\2\2\u015d\u015e\5(\25\2\u015e\u0162\7\7\2\2\u015f\u0161\5\"\22\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\'\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016a\5*\26\2\u0166\u0167"+
		"\7\n\2\2\u0167\u0169\5*\26\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b)\3\2\2\2\u016c\u016a\3\2\2\2"+
		"\u016d\u016f\7\63\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0176\79\2\2\u0171\u0173\7,\2\2\u0172\u0174\7\63\2\2\u0173"+
		"\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\79"+
		"\2\2\u0176\u0171\3\2\2\2\u0176\u0177\3\2\2\2\u0177+\3\2\2\2\u0178\u017d"+
		"\5.\30\2\u0179\u017a\7\60\2\2\u017a\u017c\5.\30\2\u017b\u0179\3\2\2\2"+
		"\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e-\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u0180\u0185\5\60\31\2\u0181\u0182\7\61\2\2"+
		"\u0182\u0184\5\60\31\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186/\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\5\62\32\2\u0189\u018a\7\62\2\2\u018a\u018c\5\62\32\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\61\3\2\2\2\u018d\u018f\7\63\2\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\5\64"+
		"\33\2\u0191\u0193\5\66\34\2\u0192\u018e\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\63\3\2\2\2\u0194\u0196\7\16\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2"+
		"\2\u0196\u0197\3\2\2\2\u0197\u01ab\5\f\7\2\u0198\u0199\7\24\2\2\u0199"+
		"\u019a\5:\36\2\u019a\u019b\7\25\2\2\u019b\u01ab\3\2\2\2\u019c\u019d\7"+
		"\67\2\2\u019d\u019e\7\24\2\2\u019e\u01a3\5:\36\2\u019f\u01a0\7\n\2\2\u01a0"+
		"\u01a2\5:\36\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a7\7\25\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01ab\79\2\2\u01a9\u01ab\7:"+
		"\2\2\u01aa\u0195\3\2\2\2\u01aa\u0198\3\2\2\2\u01aa\u019c\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\65\3\2\2\2\u01ac\u01ad\7-\2\2"+
		"\u01ad\u01b0\5\f\7\2\u01ae\u01b0\78\2\2\u01af\u01ac\3\2\2\2\u01af\u01ae"+
		"\3\2\2\2\u01b0\67\3\2\2\2\u01b1\u01b4\5,\27\2\u01b2\u01b3\7\66\2\2\u01b3"+
		"\u01b5\5,\27\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b59\3\2\2\2"+
		"\u01b6\u01bb\5<\37\2\u01b7\u01b8\7\64\2\2\u01b8\u01ba\5<\37\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		";\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c3\5> \2\u01bf\u01c0\7\65\2\2\u01c0"+
		"\u01c2\5> \2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8"+
		"\7.\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\5@!\2\u01ca?\3\2\2\2\u01cb\u01ce\t\4\2\2\u01cc\u01ce\58\35\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceA\3\2\2\29JO]doz\177\u0084\u008e"+
		"\u0097\u009d\u00a3\u00ab\u00b3\u00b9\u00be\u00c1\u00c8\u00d3\u00d9\u00df"+
		"\u00e5\u00ec\u00f8\u0103\u010a\u010d\u0119\u011c\u012a\u0135\u013e\u0144"+
		"\u014f\u0155\u015a\u0162\u016a\u016e\u0173\u0176\u017d\u0185\u018b\u018e"+
		"\u0192\u0195\u01a3\u01aa\u01af\u01b4\u01bb\u01c3\u01c7\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}