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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, IDENT=61, CADEIA=62, NUM_INT=63, NUM_REAL=64, COMENT=65, ESPACO=66, 
		COMENT_N_FECHADO=67, SIMB_N_IDENTIFICADO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_estendido = 8, RULE_tipo_basico_ident = 9, RULE_tipo_basico = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_selecao = 18, RULE_item_selecao = 19, RULE_constantes = 20, RULE_numero_intervalo = 21, 
		RULE_expressao = 22, RULE_termo_logico = 23, RULE_fator_logico = 24, RULE_parcela_logica = 25, 
		RULE_exp_relacional = 26, RULE_exp_aritmetica = 27, RULE_termo = 28, RULE_fator = 29, 
		RULE_parcela = 30, RULE_parcela_unario = 31, RULE_parcela_nao_unario = 32, 
		RULE_op_relacional = 33, RULE_op1 = 34, RULE_op2 = 35, RULE_op3 = 36, 
		RULE_op_unario = 37, RULE_op_ptr = 38;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"identificador", "dimensao", "tipo", "tipo_estendido", "tipo_basico_ident", 
		"tipo_basico", "valor_constante", "registro", "declaracao_global", "parametro", 
		"parametros", "corpo", "cmd", "selecao", "item_selecao", "constantes", 
		"numero_intervalo", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
		"exp_relacional", "exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", 
		"parcela_nao_unario", "op_relacional", "op1", "op2", "op3", "op_unario", 
		"op_ptr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'.'", "'['", "']'", "'literal'", "'inteiro'", 
		"'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'^'", "'escreva'", "'se'", "'entao'", "'senao'", "'fim_se'", 
		"'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", 
		"'fim_para'", "'enquanto'", "'fim_enquanto'", "';'", "'retorne'", "'..'", 
		"'ou'", "'e'", "'nao'", "'&'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'+'", 
		"'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENT", "ESPACO", "COMENT_N_FECHADO", 
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
			setState(78);
			declaracoes();
			setState(79);
			match(T__0);
			setState(80);
			corpo();
			setState(81);
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__19) | (1L << T__23))) != 0)) {
				{
				{
				setState(83);
				decl_local_global();
				}
				}
				setState(88);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaracao_local();
				}
				break;
			case T__19:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new Declaracao_local_varContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__2);
				setState(94);
				variavel();
				}
				break;
			case T__3:
				_localctx = new Declaracao_local_constContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__3);
				setState(96);
				match(IDENT);
				setState(97);
				match(T__4);
				setState(98);
				tipo_basico();
				setState(99);
				match(T__5);
				setState(100);
				valor_constante();
				}
				break;
			case T__6:
				_localctx = new Declaracao_local_tipoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(T__6);
				setState(103);
				match(IDENT);
				setState(104);
				match(T__4);
				setState(105);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(108);
			identificador();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(109);
				match(T__7);
				setState(110);
				identificador();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__4);
			setState(117);
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
			setState(119);
			match(IDENT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(120);
				match(T__8);
				setState(121);
				match(IDENT);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(127);
				dimensao();
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
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(T__9);
				setState(131);
				exp_aritmetica();
				setState(132);
				match(T__10);
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				registro();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Op_ptrContext op_ptr() {
			return getRuleContext(Op_ptrContext.class,0);
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
		enterRule(_localctx, 16, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(142);
				op_ptr();
				}
			}

			setState(145);
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(IDENT);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (T__16 - 16)) | (1L << (CADEIA - 16)) | (1L << (NUM_INT - 16)) | (1L << (NUM_REAL - 16)))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__17);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(156);
				variavel();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__18);
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
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new Declaracao_global_procContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__19);
				setState(165);
				match(IDENT);
				setState(166);
				match(T__20);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==IDENT) {
					{
					setState(167);
					parametros();
					}
				}

				setState(170);
				match(T__21);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(171);
					declaracao_local();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(177);
					cmd();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new Declaracao_global_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__23);
				setState(185);
				match(IDENT);
				setState(186);
				match(T__20);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==IDENT) {
					{
					setState(187);
					parametros();
					}
				}

				setState(190);
				match(T__21);
				setState(191);
				match(T__4);
				setState(192);
				tipo_estendido();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(193);
					declaracao_local();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(199);
					cmd();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__24);
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
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(209);
				match(T__25);
				}
			}

			setState(212);
			identificador();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(213);
				match(T__7);
				setState(214);
				identificador();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__4);
			setState(221);
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
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			parametro();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(224);
				match(T__7);
				setState(225);
				parametro();
				}
				}
				setState(230);
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
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(231);
				declaracao_local();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
				{
				{
				setState(237);
				cmd();
				}
				}
				setState(242);
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
		public Op_ptrContext op_ptr() {
			return getRuleContext(Op_ptrContext.class,0);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
		enterRule(_localctx, 34, RULE_cmd);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new CmdLeiaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__26);
				setState(244);
				match(T__20);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(245);
					match(T__27);
					}
				}

				setState(248);
				identificador();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(249);
					match(T__7);
					setState(250);
					identificador();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__21);
				}
				break;
			case 2:
				_localctx = new CmdEscrevaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__28);
				setState(259);
				match(T__20);
				setState(260);
				expressao();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(261);
					match(T__7);
					setState(262);
					expressao();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				match(T__21);
				}
				break;
			case 3:
				_localctx = new CmdSeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(T__29);
				setState(271);
				expressao();
				setState(272);
				match(T__30);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(273);
					cmd();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(279);
					match(T__31);
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
						{
						{
						setState(280);
						cmd();
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(288);
				match(T__32);
				}
				break;
			case 4:
				_localctx = new CmdCasoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(T__33);
				setState(291);
				exp_aritmetica();
				setState(292);
				match(T__34);
				setState(293);
				selecao();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(294);
					match(T__31);
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
						{
						{
						setState(295);
						cmd();
						}
						}
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(303);
				match(T__35);
				}
				break;
			case 5:
				_localctx = new CmdParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(T__36);
				setState(306);
				match(IDENT);
				setState(307);
				match(T__37);
				setState(308);
				exp_aritmetica();
				setState(309);
				match(T__38);
				setState(310);
				exp_aritmetica();
				setState(311);
				match(T__39);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(312);
					cmd();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(T__40);
				}
				break;
			case 6:
				_localctx = new CmdEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(T__41);
				setState(321);
				expressao();
				setState(322);
				match(T__39);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(323);
					cmd();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				match(T__42);
				}
				break;
			case 7:
				_localctx = new CmdFacaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				match(T__39);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
					{
					{
					setState(332);
					cmd();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__38);
				setState(339);
				expressao();
				}
				break;
			case 8:
				_localctx = new CmdAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(340);
					op_ptr();
					}
				}

				setState(343);
				identificador();
				setState(344);
				match(T__37);
				setState(345);
				expressao();
				}
				break;
			case 9:
				_localctx = new CmdChamadaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				match(IDENT);
				setState(348);
				match(T__20);
				setState(349);
				expressao();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(350);
					match(T__43);
					setState(351);
					expressao();
					}
				}

				setState(354);
				match(T__21);
				}
				break;
			case 10:
				_localctx = new CmdRetorneContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(356);
				match(T__44);
				setState(357);
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
		enterRule(_localctx, 36, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56 || _la==NUM_INT) {
				{
				{
				setState(360);
				item_selecao();
				}
				}
				setState(365);
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
		enterRule(_localctx, 38, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			constantes();
			setState(367);
			match(T__4);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__33) | (1L << T__36) | (1L << T__39) | (1L << T__41) | (1L << T__44) | (1L << IDENT))) != 0)) {
				{
				{
				setState(368);
				cmd();
				}
				}
				setState(373);
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
		enterRule(_localctx, 40, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			numero_intervalo();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(375);
				match(T__7);
				setState(376);
				numero_intervalo();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LAParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
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
		enterRule(_localctx, 42, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(382);
				op_unario();
				}
			}

			setState(385);
			match(NUM_INT);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(386);
				match(T__45);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(387);
					op_unario();
					}
				}

				setState(390);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext t1;
		public Termo_logicoContext termo_logico;
		public List<Termo_logicoContext> t2 = new ArrayList<Termo_logicoContext>();
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
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
		enterRule(_localctx, 44, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((ExpressaoContext)_localctx).t1 = termo_logico();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(394);
				match(T__46);
				setState(395);
				((ExpressaoContext)_localctx).termo_logico = termo_logico();
				((ExpressaoContext)_localctx).t2.add(((ExpressaoContext)_localctx).termo_logico);
				}
				}
				setState(400);
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
		public Fator_logicoContext f1;
		public Fator_logicoContext fator_logico;
		public List<Fator_logicoContext> f2 = new ArrayList<Fator_logicoContext>();
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
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
		enterRule(_localctx, 46, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Termo_logicoContext)_localctx).f1 = fator_logico();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(402);
				match(T__47);
				setState(403);
				((Termo_logicoContext)_localctx).fator_logico = fator_logico();
				((Termo_logicoContext)_localctx).f2.add(((Termo_logicoContext)_localctx).fator_logico);
				}
				}
				setState(408);
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
		enterRule(_localctx, 48, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(409);
				match(T__48);
				}
			}

			setState(412);
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
		enterRule(_localctx, 50, RULE_parcela_logica);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				_localctx = new Parcela_logica_atomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__20:
			case T__27:
			case T__49:
			case T__56:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				_localctx = new Parcela_logica_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			exp_aritmetica();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) {
				{
				setState(419);
				op_relacional();
				setState(420);
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
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
		enterRule(_localctx, 54, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			termo();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					op1();
					setState(426);
					termo();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
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
		enterRule(_localctx, 56, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			fator();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__57 || _la==T__58) {
				{
				{
				setState(434);
				op2();
				setState(435);
				fator();
				}
				}
				setState(441);
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
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
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
		enterRule(_localctx, 58, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			parcela();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(443);
				op3();
				setState(444);
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
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_parcela);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__27:
			case T__56:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(448);
					op_unario();
					}
				}

				setState(451);
				parcela_unario();
				}
				break;
			case T__49:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
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
		public Op_ptrContext op_ptr() {
			return getRuleContext(Op_ptrContext.class,0);
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
		enterRule(_localctx, 62, RULE_parcela_unario);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new Parcela_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(455);
					op_ptr();
					}
				}

				setState(458);
				identificador();
				}
				break;
			case 2:
				_localctx = new Parcela_unario_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(T__20);
				setState(460);
				expressao();
				setState(461);
				match(T__21);
				}
				break;
			case 3:
				_localctx = new Parcela_unario_funcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(IDENT);
				setState(464);
				match(T__20);
				setState(465);
				expressao();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(466);
					match(T__7);
					setState(467);
					expressao();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				match(T__21);
				}
				break;
			case 4:
				_localctx = new Parcela_unario_atom_intContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(NUM_INT);
				}
				break;
			case 5:
				_localctx = new Parcela_unario_atom_realContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
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
		enterRule(_localctx, 64, RULE_parcela_nao_unario);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				_localctx = new Parcela_nao_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__49);
				setState(480);
				identificador();
				}
				break;
			case CADEIA:
				_localctx = new Parcela_nao_unario_cadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
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

	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==T__55 || _la==T__56) ) {
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

	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(_la==T__57 || _la==T__58) ) {
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

	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__59);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__56);
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

	public static class Op_ptrContext extends ParserRuleContext {
		public Op_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_ptrContext op_ptr() throws RecognitionException {
		Op_ptrContext _localctx = new Op_ptrContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__27);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u01f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\5\7\u0083"+
		"\n\7\3\b\3\b\3\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\3\t\3\t\5\t\u008f\n"+
		"\t\3\n\5\n\u0092\n\n\3\n\3\n\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2"+
		"\13\17\3\17\7\17\u00b5\n\17\f\17\16\17\u00b8\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00bf\n\17\3\17\3\17\3\17\3\17\7\17\u00c5\n\17\f\17\16\17\u00c8"+
		"\13\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\17\3\17\5\17\u00d2"+
		"\n\17\3\20\5\20\u00d5\n\20\3\20\3\20\3\20\7\20\u00da\n\20\f\20\16\20\u00dd"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8"+
		"\13\21\3\22\7\22\u00eb\n\22\f\22\16\22\u00ee\13\22\3\22\7\22\u00f1\n\22"+
		"\f\22\16\22\u00f4\13\22\3\23\3\23\3\23\5\23\u00f9\n\23\3\23\3\23\3\23"+
		"\7\23\u00fe\n\23\f\23\16\23\u0101\13\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u010a\n\23\f\23\16\23\u010d\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0115\n\23\f\23\16\23\u0118\13\23\3\23\3\23\7\23\u011c\n\23"+
		"\f\23\16\23\u011f\13\23\5\23\u0121\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u012b\n\23\f\23\16\23\u012e\13\23\5\23\u0130\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013c\n\23\f\23\16"+
		"\23\u013f\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16"+
		"\23\u014a\13\23\3\23\3\23\3\23\3\23\7\23\u0150\n\23\f\23\16\23\u0153\13"+
		"\23\3\23\3\23\3\23\5\23\u0158\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0163\n\23\3\23\3\23\3\23\3\23\5\23\u0169\n\23\3\24\7"+
		"\24\u016c\n\24\f\24\16\24\u016f\13\24\3\25\3\25\3\25\7\25\u0174\n\25\f"+
		"\25\16\25\u0177\13\25\3\26\3\26\3\26\7\26\u017c\n\26\f\26\16\26\u017f"+
		"\13\26\3\27\5\27\u0182\n\27\3\27\3\27\3\27\5\27\u0187\n\27\3\27\5\27\u018a"+
		"\n\27\3\30\3\30\3\30\7\30\u018f\n\30\f\30\16\30\u0192\13\30\3\31\3\31"+
		"\3\31\7\31\u0197\n\31\f\31\16\31\u019a\13\31\3\32\5\32\u019d\n\32\3\32"+
		"\3\32\3\33\3\33\5\33\u01a3\n\33\3\34\3\34\3\34\3\34\5\34\u01a9\n\34\3"+
		"\35\3\35\3\35\3\35\7\35\u01af\n\35\f\35\16\35\u01b2\13\35\3\36\3\36\3"+
		"\36\3\36\7\36\u01b8\n\36\f\36\16\36\u01bb\13\36\3\37\3\37\3\37\3\37\5"+
		"\37\u01c1\n\37\3 \5 \u01c4\n \3 \3 \5 \u01c8\n \3!\5!\u01cb\n!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\7!\u01d7\n!\f!\16!\u01da\13!\3!\3!\3!\3!\5!\u01e0"+
		"\n!\3\"\3\"\3\"\5\"\u01e5\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		"(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLN\2\b\3\2\16\21\4\2\22\23@B\3\2\22\23\4\2\b\b\659\3\2:;\3\2<="+
		"\2\u0210\2P\3\2\2\2\4X\3\2\2\2\6]\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\fy\3\2"+
		"\2\2\16\u0088\3\2\2\2\20\u008e\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2"+
		"\2\26\u0099\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3\2\2\2\34\u00d1\3\2\2\2"+
		"\36\u00d4\3\2\2\2 \u00e1\3\2\2\2\"\u00ec\3\2\2\2$\u0168\3\2\2\2&\u016d"+
		"\3\2\2\2(\u0170\3\2\2\2*\u0178\3\2\2\2,\u0181\3\2\2\2.\u018b\3\2\2\2\60"+
		"\u0193\3\2\2\2\62\u019c\3\2\2\2\64\u01a2\3\2\2\2\66\u01a4\3\2\2\28\u01aa"+
		"\3\2\2\2:\u01b3\3\2\2\2<\u01bc\3\2\2\2>\u01c7\3\2\2\2@\u01df\3\2\2\2B"+
		"\u01e4\3\2\2\2D\u01e6\3\2\2\2F\u01e8\3\2\2\2H\u01ea\3\2\2\2J\u01ec\3\2"+
		"\2\2L\u01ee\3\2\2\2N\u01f0\3\2\2\2PQ\5\4\3\2QR\7\3\2\2RS\5\"\22\2ST\7"+
		"\4\2\2T\3\3\2\2\2UW\5\6\4\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\5"+
		"\3\2\2\2ZX\3\2\2\2[^\5\b\5\2\\^\5\34\17\2][\3\2\2\2]\\\3\2\2\2^\7\3\2"+
		"\2\2_`\7\5\2\2`m\5\n\6\2ab\7\6\2\2bc\7?\2\2cd\7\7\2\2de\5\26\f\2ef\7\b"+
		"\2\2fg\5\30\r\2gm\3\2\2\2hi\7\t\2\2ij\7?\2\2jk\7\7\2\2km\5\20\t\2l_\3"+
		"\2\2\2la\3\2\2\2lh\3\2\2\2m\t\3\2\2\2ns\5\f\7\2op\7\n\2\2pr\5\f\7\2qo"+
		"\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\7\2\2w"+
		"x\5\20\t\2x\13\3\2\2\2y~\7?\2\2z{\7\13\2\2{}\7?\2\2|z\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\5\16\b\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084"+
		"\u0085\7\f\2\2\u0085\u0086\58\35\2\u0086\u0087\7\r\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0084\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c\u008f\5\32\16\2\u008d\u008f\5\22"+
		"\n\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\21\3\2\2\2\u0090\u0092"+
		"\5N(\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\23\3\2\2\2\u0095\u0098\5\26\f\2\u0096\u0098\7?"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a"+
		"\t\2\2\2\u009a\27\3\2\2\2\u009b\u009c\t\3\2\2\u009c\31\3\2\2\2\u009d\u00a1"+
		"\7\24\2\2\u009e\u00a0\5\n\6\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\u00aa\7\27\2\2\u00a9\u00ab\5 \21\2\u00aa\u00a9\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\7\30\2\2\u00ad"+
		"\u00af\5\b\5\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5$\23\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00d2\7\31\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\7?\2\2\u00bc\u00be\7"+
		"\27\2\2\u00bd\u00bf\5 \21\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c6\5"+
		"\22\n\2\u00c3\u00c5\5\b\5\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00cb\5$\23\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00a6\3\2\2\2\u00d1"+
		"\u00ba\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d5\7\34\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\5\f\7\2\u00d7\u00d8"+
		"\7\n\2\2\u00d8\u00da\5\f\7\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7\7\2\2\u00df\u00e0\5\22\n\2\u00e0\37\3\2\2\2\u00e1\u00e6"+
		"\5\36\20\2\u00e2\u00e3\7\n\2\2\u00e3\u00e5\5\36\20\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7!"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\5\b\5\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\5$\23\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\35\2\2\u00f6\u00f8\7\27\2\2\u00f7\u00f9"+
		"\7\36\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00ff\5\f\7\2\u00fb\u00fc\7\n\2\2\u00fc\u00fe\5\f\7\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\30\2\2\u0103\u0169\3"+
		"\2\2\2\u0104\u0105\7\37\2\2\u0105\u0106\7\27\2\2\u0106\u010b\5.\30\2\u0107"+
		"\u0108\7\n\2\2\u0108\u010a\5.\30\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0169\3\2\2\2\u0110\u0111\7"+
		" \2\2\u0111\u0112\5.\30\2\u0112\u0116\7!\2\2\u0113\u0115\5$\23\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0120\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d\7\"\2\2\u011a"+
		"\u011c\5$\23\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0119\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7#"+
		"\2\2\u0123\u0169\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0126\58\35\2\u0126"+
		"\u0127\7%\2\2\u0127\u012f\5&\24\2\u0128\u012c\7\"\2\2\u0129\u012b\5$\23"+
		"\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0128\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7&\2\2\u0132\u0169\3\2"+
		"\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7?\2\2\u0135\u0136\7(\2\2\u0136\u0137"+
		"\58\35\2\u0137\u0138\7)\2\2\u0138\u0139\58\35\2\u0139\u013d\7*\2\2\u013a"+
		"\u013c\5$\23\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\7+\2\2\u0141\u0169\3\2\2\2\u0142\u0143\7,\2\2\u0143\u0144\5.\30"+
		"\2\u0144\u0148\7*\2\2\u0145\u0147\5$\23\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\7-\2\2\u014c\u0169\3\2\2\2\u014d\u0151\7*\2"+
		"\2\u014e\u0150\5$\23\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7)\2\2\u0155\u0169\5.\30\2\u0156\u0158\5N(\2\u0157\u0156\3\2\2"+
		"\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5\f\7\2\u015a\u015b"+
		"\7(\2\2\u015b\u015c\5.\30\2\u015c\u0169\3\2\2\2\u015d\u015e\7?\2\2\u015e"+
		"\u015f\7\27\2\2\u015f\u0162\5.\30\2\u0160\u0161\7.\2\2\u0161\u0163\5."+
		"\30\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\7\30\2\2\u0165\u0169\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0169\5."+
		"\30\2\u0168\u00f5\3\2\2\2\u0168\u0104\3\2\2\2\u0168\u0110\3\2\2\2\u0168"+
		"\u0124\3\2\2\2\u0168\u0133\3\2\2\2\u0168\u0142\3\2\2\2\u0168\u014d\3\2"+
		"\2\2\u0168\u0157\3\2\2\2\u0168\u015d\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"%\3\2\2\2\u016a\u016c\5(\25\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\'\3\2\2\2\u016f\u016d\3"+
		"\2\2\2\u0170\u0171\5*\26\2\u0171\u0175\7\7\2\2\u0172\u0174\5$\23\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176)\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017d\5,\27\2\u0179\u017a"+
		"\7\n\2\2\u017a\u017c\5,\27\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e+\3\2\2\2\u017f\u017d\3\2\2\2"+
		"\u0180\u0182\5L\'\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0189\7A\2\2\u0184\u0186\7\60\2\2\u0185\u0187\5L\'\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\7A"+
		"\2\2\u0189\u0184\3\2\2\2\u0189\u018a\3\2\2\2\u018a-\3\2\2\2\u018b\u0190"+
		"\5\60\31\2\u018c\u018d\7\61\2\2\u018d\u018f\5\60\31\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"/\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0198\5\62\32\2\u0194\u0195\7\62\2"+
		"\2\u0195\u0197\5\62\32\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\61\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019b\u019d\7\63\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\5\64\33\2\u019f\63\3\2\2\2\u01a0\u01a3\t\4"+
		"\2\2\u01a1\u01a3\5\66\34\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\65\3\2\2\2\u01a4\u01a8\58\35\2\u01a5\u01a6\5D#\2\u01a6\u01a7\58\35\2"+
		"\u01a7\u01a9\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\67"+
		"\3\2\2\2\u01aa\u01b0\5:\36\2\u01ab\u01ac\5F$\2\u01ac\u01ad\5:\36\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b19\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b9"+
		"\5<\37\2\u01b4\u01b5\5H%\2\u01b5\u01b6\5<\37\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba;\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c0\5> \2\u01bd\u01be"+
		"\5J&\2\u01be\u01bf\5> \2\u01bf\u01c1\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1=\3\2\2\2\u01c2\u01c4\5L\'\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\5@!\2\u01c6\u01c8\5B\""+
		"\2\u01c7\u01c3\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8?\3\2\2\2\u01c9\u01cb"+
		"\5N(\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01e0\5\f\7\2\u01cd\u01ce\7\27\2\2\u01ce\u01cf\5.\30\2\u01cf\u01d0\7"+
		"\30\2\2\u01d0\u01e0\3\2\2\2\u01d1\u01d2\7?\2\2\u01d2\u01d3\7\27\2\2\u01d3"+
		"\u01d8\5.\30\2\u01d4\u01d5\7\n\2\2\u01d5\u01d7\5.\30\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7\30\2\2\u01dc\u01e0\3"+
		"\2\2\2\u01dd\u01e0\7A\2\2\u01de\u01e0\7B\2\2\u01df\u01ca\3\2\2\2\u01df"+
		"\u01cd\3\2\2\2\u01df\u01d1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2"+
		"\2\2\u01e0A\3\2\2\2\u01e1\u01e2\7\64\2\2\u01e2\u01e5\5\f\7\2\u01e3\u01e5"+
		"\7@\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5C\3\2\2\2\u01e6\u01e7"+
		"\t\5\2\2\u01e7E\3\2\2\2\u01e8\u01e9\t\6\2\2\u01e9G\3\2\2\2\u01ea\u01eb"+
		"\t\7\2\2\u01ebI\3\2\2\2\u01ec\u01ed\7>\2\2\u01edK\3\2\2\2\u01ee\u01ef"+
		"\7;\2\2\u01efM\3\2\2\2\u01f0\u01f1\7\36\2\2\u01f1O\3\2\2\2;X]ls~\u0082"+
		"\u008a\u008e\u0091\u0097\u00a1\u00aa\u00b0\u00b6\u00be\u00c6\u00cc\u00d1"+
		"\u00d4\u00db\u00e6\u00ec\u00f2\u00f8\u00ff\u010b\u0116\u011d\u0120\u012c"+
		"\u012f\u013d\u0148\u0151\u0157\u0162\u0168\u016d\u0175\u017d\u0181\u0186"+
		"\u0189\u0190\u0198\u019c\u01a2\u01a8\u01b0\u01b9\u01c0\u01c3\u01c7\u01ca"+
		"\u01d8\u01df\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}