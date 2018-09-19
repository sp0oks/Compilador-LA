// Generated from /home/spooks/github/UFSCar/Compilador-LA/src/main/java/LA.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		T__52=53, T__53=54, T__54=55, T__55=56, TIPO_BASICO=57, IDENT=58, CADEIA=59, 
		NUM_INT=60, NUM_REAL=61, COMENT=62, ESPACO=63, COMENT_N_FECHADO=64, SIMB_N_IDENTIFICADO=65;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico_ident = 8, RULE_tipo_estendido = 9, RULE_valor_constante = 10, 
		RULE_registro = 11, RULE_declaracao_global = 12, RULE_parametro = 13, 
		RULE_parametros = 14, RULE_corpo = 15, RULE_cmd = 16, RULE_selecao = 17, 
		RULE_item_selecao = 18, RULE_constantes = 19, RULE_numero_intervalo = 20, 
		RULE_exp_aritmetica = 21, RULE_termo = 22, RULE_fator = 23, RULE_parcela = 24, 
		RULE_parcela_unario = 25, RULE_parcela_nao_unario = 26, RULE_exp_relacional = 27, 
		RULE_expressao = 28, RULE_termo_logico = 29, RULE_fator_logico = 30, RULE_parcela_logica = 31, 
		RULE_op_relacional = 32, RULE_op1 = 33, RULE_op2 = 34, RULE_op3 = 35, 
		RULE_op_unario = 36;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"identificador", "dimensao", "tipo", "tipo_basico_ident", "tipo_estendido", 
		"valor_constante", "registro", "declaracao_global", "parametro", "parametros", 
		"corpo", "cmd", "selecao", "item_selecao", "constantes", "numero_intervalo", 
		"exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", "parcela_nao_unario", 
		"exp_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
		"op_relacional", "op1", "op2", "op3", "op_unario"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'.'", "'['", "']'", "'^'", "'verdadeiro'", "'falso'", 
		"'registro'", "'fim_registro'", "'procedimento'", "'('", "')'", "'fim_procedimento'", 
		"'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", 
		"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", 
		"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "';'", 
		"'retorne'", "'..'", "'&'", "'ou'", "'e'", "'nao'", "'<>'", "'>='", "'<='", 
		"'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "TIPO_BASICO", "IDENT", 
		"CADEIA", "NUM_INT", "NUM_REAL", "COMENT", "ESPACO", "COMENT_N_FECHADO", 
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
			setState(74);
			declaracoes();
			setState(75);
			match(T__0);
			setState(76);
			corpo();
			setState(77);
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__16) | (1L << T__20))) != 0)) {
				{
				{
				setState(79);
				decl_local_global();
				}
				}
				setState(84);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaracao_local();
				}
				break;
			case T__16:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new Declaracao_local_varContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__2);
				setState(90);
				variavel();
				}
				break;
			case T__3:
				_localctx = new Declaracao_local_constContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__3);
				setState(92);
				match(IDENT);
				setState(93);
				match(T__4);
				setState(94);
				match(TIPO_BASICO);
				setState(95);
				match(T__5);
				setState(96);
				valor_constante();
				}
				break;
			case T__6:
				_localctx = new Declaracao_local_tipoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(IDENT);
				setState(99);
				match(T__4);
				setState(100);
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
			setState(103);
			((VariavelContext)_localctx).id1 = identificador();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(104);
				match(T__7);
				setState(105);
				((VariavelContext)_localctx).identificador = identificador();
				((VariavelContext)_localctx).id2.add(((VariavelContext)_localctx).identificador);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__4);
			setState(112);
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
			setState(114);
			match(IDENT);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(115);
				match(T__8);
				setState(116);
				match(IDENT);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(124);
				match(T__9);
				setState(125);
				exp_aritmetica();
				setState(126);
				match(T__10);
				}
				}
				setState(132);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				registro();
				}
				break;
			case T__11:
			case TIPO_BASICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(137);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(139);
				match(T__11);
				}
			}

			setState(142);
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
			setState(144);
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
			setState(146);
			match(T__14);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(147);
				variavel();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new Declaracao_global_procContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__16);
				setState(156);
				match(IDENT);
				setState(157);
				match(T__17);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==IDENT) {
					{
					setState(158);
					parametros();
					}
				}

				setState(161);
				match(T__18);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(162);
					declaracao_local();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(168);
					cmd();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new Declaracao_global_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__20);
				setState(176);
				match(IDENT);
				setState(177);
				match(T__17);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==IDENT) {
					{
					setState(178);
					parametros();
					}
				}

				setState(181);
				match(T__18);
				setState(182);
				match(T__4);
				setState(183);
				tipo_estendido();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(184);
					declaracao_local();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(190);
					cmd();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(200);
				match(T__22);
				}
			}

			setState(203);
			identificador();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(204);
				match(T__7);
				setState(205);
				identificador();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__4);
			setState(212);
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
			setState(214);
			parametro();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(215);
				match(T__7);
				setState(216);
				parametro();
				}
				}
				setState(221);
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
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(222);
				declaracao_local();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
				{
				{
				setState(228);
				cmd();
				}
				}
				setState(233);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new CmdLeiaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__23);
				setState(235);
				match(T__17);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(236);
					match(T__11);
					}
				}

				setState(239);
				identificador();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(240);
					match(T__7);
					setState(241);
					expressao();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new CmdEscrevaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__24);
				setState(250);
				match(T__17);
				setState(251);
				expressao();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(252);
					match(T__7);
					setState(253);
					expressao();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new CmdSeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(T__25);
				setState(262);
				expressao();
				setState(263);
				match(T__26);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(264);
					cmd();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(270);
					match(T__27);
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
						{
						{
						setState(271);
						cmd();
						}
						}
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(279);
				match(T__28);
				}
				break;
			case 4:
				_localctx = new CmdCasoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(T__29);
				setState(282);
				exp_aritmetica();
				setState(283);
				match(T__30);
				setState(284);
				selecao();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(285);
					match(T__27);
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
						{
						{
						setState(286);
						cmd();
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(294);
				match(T__31);
				}
				break;
			case 5:
				_localctx = new CmdParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(T__32);
				setState(297);
				match(IDENT);
				setState(298);
				match(T__33);
				setState(299);
				exp_aritmetica();
				setState(300);
				match(T__34);
				setState(301);
				exp_aritmetica();
				setState(302);
				match(T__35);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(303);
					cmd();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(T__36);
				}
				break;
			case 6:
				_localctx = new CmdEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(T__37);
				setState(312);
				expressao();
				setState(313);
				match(T__35);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
					{
					{
					setState(314);
					cmd();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(T__38);
				}
				break;
			case 7:
				_localctx = new CmdFacaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				match(T__35);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
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
				match(T__34);
				setState(330);
				expressao();
				}
				break;
			case 8:
				_localctx = new CmdAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(331);
					match(T__11);
					}
				}

				setState(334);
				identificador();
				setState(335);
				match(T__33);
				setState(336);
				expressao();
				}
				break;
			case 9:
				_localctx = new CmdChamadaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				match(IDENT);
				setState(339);
				match(T__17);
				setState(340);
				expressao();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(341);
					match(T__39);
					setState(342);
					expressao();
					}
				}

				setState(345);
				match(T__18);
				}
				break;
			case 10:
				_localctx = new CmdRetorneContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(347);
				match(T__40);
				setState(348);
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
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52 || _la==NUM_INT) {
				{
				{
				setState(351);
				item_selecao();
				}
				}
				setState(356);
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
			setState(357);
			constantes();
			setState(358);
			match(T__4);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << IDENT))) != 0)) {
				{
				{
				setState(359);
				cmd();
				}
				}
				setState(364);
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
			setState(365);
			numero_intervalo();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(366);
				match(T__7);
				setState(367);
				numero_intervalo();
				}
				}
				setState(372);
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
		enterRule(_localctx, 40, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(373);
				op_unario();
				}
			}

			setState(376);
			match(NUM_INT);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(377);
				match(T__41);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(378);
					op_unario();
					}
				}

				setState(381);
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
		enterRule(_localctx, 42, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			termo();
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					op1();
					setState(386);
					termo();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 44, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			fator();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53 || _la==T__54) {
				{
				{
				setState(394);
				op2();
				setState(395);
				fator();
				}
				}
				setState(401);
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
		enterRule(_localctx, 46, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			parcela();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(403);
				op3();
				setState(404);
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
		enterRule(_localctx, 48, RULE_parcela);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__17:
			case T__52:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(408);
					op_unario();
					}
				}

				setState(411);
				parcela_unario();
				}
				break;
			case T__42:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new Parcela_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(415);
					match(T__11);
					}
				}

				setState(418);
				identificador();
				}
				break;
			case 2:
				_localctx = new Parcela_unario_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__17);
				setState(420);
				expressao();
				setState(421);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new Parcela_unario_funcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(IDENT);
				setState(424);
				match(T__17);
				setState(425);
				expressao();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(426);
					match(T__7);
					setState(427);
					expressao();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(T__18);
				}
				break;
			case 4:
				_localctx = new Parcela_unario_atom_intContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(NUM_INT);
				}
				break;
			case 5:
				_localctx = new Parcela_unario_atom_realContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
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
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new Parcela_nao_unario_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T__42);
				setState(440);
				identificador();
				}
				break;
			case CADEIA:
				_localctx = new Parcela_nao_unario_cadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
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
		enterRule(_localctx, 54, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			exp_aritmetica();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) {
				{
				setState(445);
				op_relacional();
				setState(446);
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
			setState(450);
			termo_logico();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(451);
				match(T__43);
				setState(452);
				termo_logico();
				}
				}
				setState(457);
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
			setState(458);
			fator_logico();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(459);
				match(T__44);
				setState(460);
				fator_logico();
				}
				}
				setState(465);
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
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(466);
				match(T__45);
				}
			}

			setState(469);
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
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				_localctx = new Parcela_logica_atomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
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
			case T__52:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				_localctx = new Parcela_logica_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
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
		enterRule(_localctx, 64, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 66, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
		enterRule(_localctx, 68, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
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
		enterRule(_localctx, 70, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__55);
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
		enterRule(_localctx, 72, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__52);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u01e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0083\n\b"+
		"\f\b\16\b\u0086\13\b\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\13\5\13\u008f\n\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\7\16\u00a6\n\16\f\16\16\16"+
		"\u00a9\13\16\3\16\7\16\u00ac\n\16\f\16\16\16\u00af\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00b6\n\16\3\16\3\16\3\16\3\16\7\16\u00bc\n\16\f\16\16"+
		"\16\u00bf\13\16\3\16\7\16\u00c2\n\16\f\16\16\16\u00c5\13\16\3\16\3\16"+
		"\5\16\u00c9\n\16\3\17\5\17\u00cc\n\17\3\17\3\17\3\17\7\17\u00d1\n\17\f"+
		"\17\16\17\u00d4\13\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00dc\n\20\f"+
		"\20\16\20\u00df\13\20\3\21\7\21\u00e2\n\21\f\21\16\21\u00e5\13\21\3\21"+
		"\7\21\u00e8\n\21\f\21\16\21\u00eb\13\21\3\22\3\22\3\22\5\22\u00f0\n\22"+
		"\3\22\3\22\3\22\7\22\u00f5\n\22\f\22\16\22\u00f8\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u010c\n\22\f\22\16\22\u010f\13\22\3\22\3\22"+
		"\7\22\u0113\n\22\f\22\16\22\u0116\13\22\5\22\u0118\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125\13\22\5\22"+
		"\u0127\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0133"+
		"\n\22\f\22\16\22\u0136\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u013e"+
		"\n\22\f\22\16\22\u0141\13\22\3\22\3\22\3\22\3\22\7\22\u0147\n\22\f\22"+
		"\16\22\u014a\13\22\3\22\3\22\3\22\5\22\u014f\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u015a\n\22\3\22\3\22\3\22\3\22\5\22\u0160"+
		"\n\22\3\23\7\23\u0163\n\23\f\23\16\23\u0166\13\23\3\24\3\24\3\24\7\24"+
		"\u016b\n\24\f\24\16\24\u016e\13\24\3\25\3\25\3\25\7\25\u0173\n\25\f\25"+
		"\16\25\u0176\13\25\3\26\5\26\u0179\n\26\3\26\3\26\3\26\5\26\u017e\n\26"+
		"\3\26\5\26\u0181\n\26\3\27\3\27\3\27\3\27\7\27\u0187\n\27\f\27\16\27\u018a"+
		"\13\27\3\30\3\30\3\30\3\30\7\30\u0190\n\30\f\30\16\30\u0193\13\30\3\31"+
		"\3\31\3\31\3\31\5\31\u0199\n\31\3\32\5\32\u019c\n\32\3\32\3\32\5\32\u01a0"+
		"\n\32\3\33\5\33\u01a3\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u01af\n\33\f\33\16\33\u01b2\13\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01b8\n\33\3\34\3\34\3\34\5\34\u01bd\n\34\3\35\3\35\3\35\3\35\5\35\u01c3"+
		"\n\35\3\36\3\36\3\36\7\36\u01c8\n\36\f\36\16\36\u01cb\13\36\3\37\3\37"+
		"\3\37\7\37\u01d0\n\37\f\37\16\37\u01d3\13\37\3 \5 \u01d6\n \3 \3 \3!\3"+
		"!\5!\u01dc\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\b\3\2;<\4\2"+
		"\17\20=?\3\2\17\20\4\2\b\b\61\65\3\2\66\67\3\289\2\u0205\2L\3\2\2\2\4"+
		"T\3\2\2\2\6Y\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\ft\3\2\2\2\16\u0084\3\2\2\2"+
		"\20\u0089\3\2\2\2\22\u008b\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2\30"+
		"\u0094\3\2\2\2\32\u00c8\3\2\2\2\34\u00cb\3\2\2\2\36\u00d8\3\2\2\2 \u00e3"+
		"\3\2\2\2\"\u015f\3\2\2\2$\u0164\3\2\2\2&\u0167\3\2\2\2(\u016f\3\2\2\2"+
		"*\u0178\3\2\2\2,\u0182\3\2\2\2.\u018b\3\2\2\2\60\u0194\3\2\2\2\62\u019f"+
		"\3\2\2\2\64\u01b7\3\2\2\2\66\u01bc\3\2\2\28\u01be\3\2\2\2:\u01c4\3\2\2"+
		"\2<\u01cc\3\2\2\2>\u01d5\3\2\2\2@\u01db\3\2\2\2B\u01dd\3\2\2\2D\u01df"+
		"\3\2\2\2F\u01e1\3\2\2\2H\u01e3\3\2\2\2J\u01e5\3\2\2\2LM\5\4\3\2MN\7\3"+
		"\2\2NO\5 \21\2OP\7\4\2\2P\3\3\2\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3\2\2\2WZ\5\b\5\2XZ\5\32\16\2YW\3\2\2\2"+
		"YX\3\2\2\2Z\7\3\2\2\2[\\\7\5\2\2\\h\5\n\6\2]^\7\6\2\2^_\7<\2\2_`\7\7\2"+
		"\2`a\7;\2\2ab\7\b\2\2bh\5\26\f\2cd\7\t\2\2de\7<\2\2ef\7\7\2\2fh\5\20\t"+
		"\2g[\3\2\2\2g]\3\2\2\2gc\3\2\2\2h\t\3\2\2\2in\5\f\7\2jk\7\n\2\2km\5\f"+
		"\7\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\7"+
		"\2\2rs\5\20\t\2s\13\3\2\2\2ty\7<\2\2uv\7\13\2\2vx\7<\2\2wu\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\5\16\b\2}\r\3\2\2\2~"+
		"\177\7\f\2\2\177\u0080\5,\27\2\u0080\u0081\7\r\2\2\u0081\u0083\3\2\2\2"+
		"\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\17\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\5\30\r\2\u0088"+
		"\u008a\5\24\13\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21\3\2"+
		"\2\2\u008b\u008c\t\2\2\2\u008c\23\3\2\2\2\u008d\u008f\7\16\2\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\22\n\2"+
		"\u0091\25\3\2\2\2\u0092\u0093\t\3\2\2\u0093\27\3\2\2\2\u0094\u0098\7\21"+
		"\2\2\u0095\u0097\5\n\6\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\7\22\2\2\u009c\31\3\2\2\2\u009d\u009e\7\23\2\2\u009e"+
		"\u009f\7<\2\2\u009f\u00a1\7\24\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\7\25\2\2\u00a4"+
		"\u00a6\5\b\5\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ac\5\"\22\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00c9\7\26\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b5\7"+
		"\24\2\2\u00b4\u00b6\5\36\20\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00bd"+
		"\5\24\13\2\u00ba\u00bc\5\b\5\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c3\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c2\5\"\22\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c9\3\2\2\2\u00c8\u009d\3\2\2\2"+
		"\u00c8\u00b1\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00cc\7\31\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\5\f\7\2\u00ce"+
		"\u00cf\7\n\2\2\u00cf\u00d1\5\f\7\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\5\24\13\2\u00d7\35\3\2"+
		"\2\2\u00d8\u00dd\5\34\17\2\u00d9\u00da\7\n\2\2\u00da\u00dc\5\34\17\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\37\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e9\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"!\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00ef\7\24\2"+
		"\2\u00ee\u00f0\7\16\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f6\5\f\7\2\u00f2\u00f3\7\n\2\2\u00f3\u00f5\5:"+
		"\36\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\25"+
		"\2\2\u00fa\u0160\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\u0102\5:\36\2\u00fe\u00ff\7\n\2\2\u00ff\u0101\5:\36\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\25\2\2\u0106\u0160\3"+
		"\2\2\2\u0107\u0108\7\34\2\2\u0108\u0109\5:\36\2\u0109\u010d\7\35\2\2\u010a"+
		"\u010c\5\"\22\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0117\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0114\7\36\2\2\u0111\u0113\5\"\22\2\u0112\u0111\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\7\37\2\2\u011a\u0160\3\2\2\2\u011b\u011c\7 \2\2\u011c"+
		"\u011d\5,\27\2\u011d\u011e\7!\2\2\u011e\u0126\5$\23\2\u011f\u0123\7\36"+
		"\2\2\u0120\u0122\5\"\22\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u011f\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\7\"\2\2\u0129\u0160\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7<\2"+
		"\2\u012c\u012d\7$\2\2\u012d\u012e\5,\27\2\u012e\u012f\7%\2\2\u012f\u0130"+
		"\5,\27\2\u0130\u0134\7&\2\2\u0131\u0133\5\"\22\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\'\2\2\u0138\u0160\3\2\2\2\u0139"+
		"\u013a\7(\2\2\u013a\u013b\5:\36\2\u013b\u013f\7&\2\2\u013c\u013e\5\"\22"+
		"\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7)\2\2\u0143"+
		"\u0160\3\2\2\2\u0144\u0148\7&\2\2\u0145\u0147\5\"\22\2\u0146\u0145\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7%\2\2\u014c\u0160\5:\36"+
		"\2\u014d\u014f\7\16\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\5\f\7\2\u0151\u0152\7$\2\2\u0152\u0153\5:\36"+
		"\2\u0153\u0160\3\2\2\2\u0154\u0155\7<\2\2\u0155\u0156\7\24\2\2\u0156\u0159"+
		"\5:\36\2\u0157\u0158\7*\2\2\u0158\u015a\5:\36\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\25\2\2\u015c\u0160\3"+
		"\2\2\2\u015d\u015e\7+\2\2\u015e\u0160\5:\36\2\u015f\u00ec\3\2\2\2\u015f"+
		"\u00fb\3\2\2\2\u015f\u0107\3\2\2\2\u015f\u011b\3\2\2\2\u015f\u012a\3\2"+
		"\2\2\u015f\u0139\3\2\2\2\u015f\u0144\3\2\2\2\u015f\u014e\3\2\2\2\u015f"+
		"\u0154\3\2\2\2\u015f\u015d\3\2\2\2\u0160#\3\2\2\2\u0161\u0163\5&\24\2"+
		"\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165%\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\5(\25\2\u0168"+
		"\u016c\7\7\2\2\u0169\u016b\5\"\22\2\u016a\u0169\3\2\2\2\u016b\u016e\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\'\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0174\5*\26\2\u0170\u0171\7\n\2\2\u0171\u0173\5*\26\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175)\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5J&\2\u0178\u0177"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0180\7>\2\2\u017b"+
		"\u017d\7,\2\2\u017c\u017e\5J&\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0181\7>\2\2\u0180\u017b\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181+\3\2\2\2\u0182\u0188\5.\30\2\u0183\u0184\5D#\2\u0184\u0185"+
		"\5.\30\2\u0185\u0187\3\2\2\2\u0186\u0183\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189-\3\2\2\2\u018a\u0188\3\2\2\2"+
		"\u018b\u0191\5\60\31\2\u018c\u018d\5F$\2\u018d\u018e\5\60\31\2\u018e\u0190"+
		"\3\2\2\2\u018f\u018c\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192/\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0198\5\62\32"+
		"\2\u0195\u0196\5H%\2\u0196\u0197\5\62\32\2\u0197\u0199\3\2\2\2\u0198\u0195"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\61\3\2\2\2\u019a\u019c\5J&\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\5\64"+
		"\33\2\u019e\u01a0\5\66\34\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\63\3\2\2\2\u01a1\u01a3\7\16\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a4\3\2\2\2\u01a4\u01b8\5\f\7\2\u01a5\u01a6\7\24\2\2\u01a6"+
		"\u01a7\5:\36\2\u01a7\u01a8\7\25\2\2\u01a8\u01b8\3\2\2\2\u01a9\u01aa\7"+
		"<\2\2\u01aa\u01ab\7\24\2\2\u01ab\u01b0\5:\36\2\u01ac\u01ad\7\n\2\2\u01ad"+
		"\u01af\5:\36\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b4\7\25\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b8\7>\2\2\u01b6\u01b8\7?"+
		"\2\2\u01b7\u01a2\3\2\2\2\u01b7\u01a5\3\2\2\2\u01b7\u01a9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\65\3\2\2\2\u01b9\u01ba\7-\2\2"+
		"\u01ba\u01bd\5\f\7\2\u01bb\u01bd\7=\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\67\3\2\2\2\u01be\u01c2\5,\27\2\u01bf\u01c0\5B\"\2\u01c0"+
		"\u01c1\5,\27\2\u01c1\u01c3\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c39\3\2\2\2\u01c4\u01c9\5<\37\2\u01c5\u01c6\7.\2\2\u01c6\u01c8"+
		"\5<\37\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca;\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d1\5> \2\u01cd"+
		"\u01ce\7/\2\2\u01ce\u01d0\5> \2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2"+
		"\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2=\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d4\u01d6\7\60\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5@!\2\u01d8?\3\2\2\2\u01d9\u01dc\t\4"+
		"\2\2\u01da\u01dc\58\35\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc"+
		"A\3\2\2\2\u01dd\u01de\t\5\2\2\u01deC\3\2\2\2\u01df\u01e0\t\6\2\2\u01e0"+
		"E\3\2\2\2\u01e1\u01e2\t\7\2\2\u01e2G\3\2\2\2\u01e3\u01e4\7:\2\2\u01e4"+
		"I\3\2\2\2\u01e5\u01e6\7\67\2\2\u01e6K\3\2\2\29TYgny\u0084\u0089\u008e"+
		"\u0098\u00a1\u00a7\u00ad\u00b5\u00bd\u00c3\u00c8\u00cb\u00d2\u00dd\u00e3"+
		"\u00e9\u00ef\u00f6\u0102\u010d\u0114\u0117\u0123\u0126\u0134\u013f\u0148"+
		"\u014e\u0159\u015f\u0164\u016c\u0174\u0178\u017d\u0180\u0188\u0191\u0198"+
		"\u019b\u019f\u01a2\u01b0\u01b7\u01bc\u01c2\u01c9\u01d1\u01d5\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}