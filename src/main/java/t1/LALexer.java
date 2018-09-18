// Generated from /home/spooks/github/UFSCar/Compilador-LA/src/main/java/LA.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "TIPO_BASICO", "OP1", "OP2", "OP3", "OP_UNARIO", 
		"OP_LOGICO_1", "OP_LOGICO_2", "OP_RELACIONAL", "IDENT", "CADEIA", "NUM_INT", 
		"NUM_REAL", "COMENT", "ESPACO", "COMENT_N_FECHADO", "SIMB_N_IDENTIFICADO"
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

	void erroLexico(String msg) { throw new ParseCancellationException(msg); }

	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 58:
			COMENT_N_FECHADO_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			SIMB_N_IDENTIFICADO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENT_N_FECHADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			erroLexico("Linha " + (getLine()+1) + ": comentario nao fechado");
			break;
		}
	}
	private void SIMB_N_IDENTIFICADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01a9"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01c0\n\65\3\66\3\66\7\66\u01c4"+
		"\n\66\f\66\16\66\u01c7\13\66\3\67\3\67\7\67\u01cb\n\67\f\67\16\67\u01ce"+
		"\13\67\3\67\3\67\38\68\u01d3\n8\r8\168\u01d4\39\39\39\39\3:\3:\7:\u01dd"+
		"\n:\f:\16:\u01e0\13:\3:\3:\3:\3:\3;\6;\u01e7\n;\r;\16;\u01e8\3;\3;\3<"+
		"\3<\7<\u01ef\n<\f<\16<\u01f2\13<\3<\3<\3=\3=\3=\5\u01cc\u01de\u01f0\2"+
		">\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>\3\2\t\4\2--//\4\2,,\61\61\4\2>>@@\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0204\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\u0085\3\2\2\2\7\u0093"+
		"\3\2\2\2\t\u009b\3\2\2\2\13\u00a5\3\2\2\2\r\u00a7\3\2\2\2\17\u00a9\3\2"+
		"\2\2\21\u00ae\3\2\2\2\23\u00b0\3\2\2\2\25\u00b2\3\2\2\2\27\u00b4\3\2\2"+
		"\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2\2\35\u00c3\3\2\2\2\37\u00c9\3\2\2\2"+
		"!\u00d2\3\2\2\2#\u00df\3\2\2\2%\u00ec\3\2\2\2\'\u00ee\3\2\2\2)\u00f0\3"+
		"\2\2\2+\u0101\3\2\2\2-\u0108\3\2\2\2/\u0113\3\2\2\2\61\u0117\3\2\2\2\63"+
		"\u011c\3\2\2\2\65\u0124\3\2\2\2\67\u0127\3\2\2\29\u012d\3\2\2\2;\u0133"+
		"\3\2\2\2=\u013a\3\2\2\2?\u013f\3\2\2\2A\u0144\3\2\2\2C\u014d\3\2\2\2E"+
		"\u0152\3\2\2\2G\u0155\3\2\2\2I\u0159\3\2\2\2K\u015e\3\2\2\2M\u0167\3\2"+
		"\2\2O\u0170\3\2\2\2Q\u017d\3\2\2\2S\u017f\3\2\2\2U\u0187\3\2\2\2W\u018a"+
		"\3\2\2\2Y\u018c\3\2\2\2[\u01a8\3\2\2\2]\u01aa\3\2\2\2_\u01ac\3\2\2\2a"+
		"\u01ae\3\2\2\2c\u01b0\3\2\2\2e\u01b2\3\2\2\2g\u01b5\3\2\2\2i\u01bf\3\2"+
		"\2\2k\u01c1\3\2\2\2m\u01c8\3\2\2\2o\u01d2\3\2\2\2q\u01d6\3\2\2\2s\u01da"+
		"\3\2\2\2u\u01e6\3\2\2\2w\u01ec\3\2\2\2y\u01f5\3\2\2\2{|\7c\2\2|}\7n\2"+
		"\2}~\7i\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082"+
		"\7v\2\2\u0082\u0083\7o\2\2\u0083\u0084\7q\2\2\u0084\4\3\2\2\2\u0085\u0086"+
		"\7h\2\2\u0086\u0087\7k\2\2\u0087\u0088\7o\2\2\u0088\u0089\7a\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b\u008c\7i\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7v\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7q\2\2\u0092\6\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7e\2\2\u0096\u0097\7n\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\b\3\2\2\2\u009b\u009c\7e\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\n\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\f\3\2\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7r\2\2\u00ac\u00ad\7q\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7.\2\2\u00af\22"+
		"\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3"+
		"\26\3\2\2\2\u00b4\u00b5\7_\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7`\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7q\2\2\u00c2\34\3\2"+
		"\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7q\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7q\2\2\u00d1 \3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7a\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da"+
		"\7k\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\"\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7f\2\2"+
		"\u00e5\u00e6\7k\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7q\2\2\u00eb$\3\2\2\2\u00ec\u00ed"+
		"\7*\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef(\3\2\2\2\u00f0\u00f1\7"+
		"h\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5"+
		"\7r\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7e\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7o\2\2"+
		"\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7q\2\2\u0100*\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7e\2\2\u0105\u0106\7c\2\2\u0106\u0107\7q\2\2\u0107"+
		",\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a\7k\2\2\u010a\u010b\7o\2\2\u010b"+
		"\u010c\7a\2\2\u010c\u010d\7h\2\2\u010d\u010e\7w\2\2\u010e\u010f\7p\2\2"+
		"\u010f\u0110\7e\2\2\u0110\u0111\7c\2\2\u0111\u0112\7q\2\2\u0112.\3\2\2"+
		"\2\u0113\u0114\7x\2\2\u0114\u0115\7c\2\2\u0115\u0116\7t\2\2\u0116\60\3"+
		"\2\2\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7c\2\2\u011b\62\3\2\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7e\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7x\2\2"+
		"\u0122\u0123\7c\2\2\u0123\64\3\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7"+
		"g\2\2\u0126\66\3\2\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a"+
		"\7v\2\2\u012a\u012b\7c\2\2\u012b\u012c\7q\2\2\u012c8\3\2\2\2\u012d\u012e"+
		"\7u\2\2\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7q\2\2\u0132:\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135\7k\2\2\u0135"+
		"\u0136\7o\2\2\u0136\u0137\7a\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2"+
		"\u0139<\3\2\2\2\u013a\u013b\7e\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2"+
		"\2\u013d\u013e\7q\2\2\u013e>\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141\7"+
		"g\2\2\u0141\u0142\7l\2\2\u0142\u0143\7c\2\2\u0143@\3\2\2\2\u0144\u0145"+
		"\7h\2\2\u0145\u0146\7k\2\2\u0146\u0147\7o\2\2\u0147\u0148\7a\2\2\u0148"+
		"\u0149\7e\2\2\u0149\u014a\7c\2\2\u014a\u014b\7u\2\2\u014b\u014c\7q\2\2"+
		"\u014cB\3\2\2\2\u014d\u014e\7r\2\2\u014e\u014f\7c\2\2\u014f\u0150\7t\2"+
		"\2\u0150\u0151\7c\2\2\u0151D\3\2\2\2\u0152\u0153\7>\2\2\u0153\u0154\7"+
		"/\2\2\u0154F\3\2\2\2\u0155\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7g\2\2\u0158H\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7c\2\2\u015b\u015c"+
		"\7e\2\2\u015c\u015d\7c\2\2\u015dJ\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160"+
		"\7k\2\2\u0160\u0161\7o\2\2\u0161\u0162\7a\2\2\u0162\u0163\7r\2\2\u0163"+
		"\u0164\7c\2\2\u0164\u0165\7t\2\2\u0165\u0166\7c\2\2\u0166L\3\2\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7s\2\2\u016a\u016b\7w\2\2"+
		"\u016b\u016c\7c\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7q\2\2\u016fN\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7k\2\2\u0172\u0173"+
		"\7o\2\2\u0173\u0174\7a\2\2\u0174\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176"+
		"\u0177\7s\2\2\u0177\u0178\7w\2\2\u0178\u0179\7c\2\2\u0179\u017a\7p\2\2"+
		"\u017a\u017b\7v\2\2\u017b\u017c\7q\2\2\u017cP\3\2\2\2\u017d\u017e\7=\2"+
		"\2\u017eR\3\2\2\2\u017f\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7"+
		"v\2\2\u0182\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7p\2\2\u0185\u0186"+
		"\7g\2\2\u0186T\3\2\2\2\u0187\u0188\7\60\2\2\u0188\u0189\7\60\2\2\u0189"+
		"V\3\2\2\2\u018a\u018b\7(\2\2\u018bX\3\2\2\2\u018c\u018d\7p\2\2\u018d\u018e"+
		"\7c\2\2\u018e\u018f\7q\2\2\u018fZ\3\2\2\2\u0190\u0191\7n\2\2\u0191\u0192"+
		"\7k\2\2\u0192\u0193\7v\2\2\u0193\u0194\7g\2\2\u0194\u0195\7t\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u01a9\7n\2\2\u0197\u0198\7k\2\2\u0198\u0199\7p\2\2"+
		"\u0199\u019a\7v\2\2\u019a\u019b\7g\2\2\u019b\u019c\7k\2\2\u019c\u019d"+
		"\7t\2\2\u019d\u01a9\7q\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7g\2\2\u01a0"+
		"\u01a1\7c\2\2\u01a1\u01a9\7n\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7q\2\2"+
		"\u01a4\u01a5\7i\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7e\2\2\u01a7\u01a9"+
		"\7q\2\2\u01a8\u0190\3\2\2\2\u01a8\u0197\3\2\2\2\u01a8\u019e\3\2\2\2\u01a8"+
		"\u01a2\3\2\2\2\u01a9\\\3\2\2\2\u01aa\u01ab\t\2\2\2\u01ab^\3\2\2\2\u01ac"+
		"\u01ad\t\3\2\2\u01ad`\3\2\2\2\u01ae\u01af\7\'\2\2\u01afb\3\2\2\2\u01b0"+
		"\u01b1\7/\2\2\u01b1d\3\2\2\2\u01b2\u01b3\7q\2\2\u01b3\u01b4\7w\2\2\u01b4"+
		"f\3\2\2\2\u01b5\u01b6\7g\2\2\u01b6h\3\2\2\2\u01b7\u01c0\7?\2\2\u01b8\u01b9"+
		"\7>\2\2\u01b9\u01c0\7@\2\2\u01ba\u01bb\7@\2\2\u01bb\u01c0\7?\2\2\u01bc"+
		"\u01bd\7>\2\2\u01bd\u01c0\7?\2\2\u01be\u01c0\t\4\2\2\u01bf\u01b7\3\2\2"+
		"\2\u01bf\u01b8\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01be"+
		"\3\2\2\2\u01c0j\3\2\2\2\u01c1\u01c5\t\5\2\2\u01c2\u01c4\t\6\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6l\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\7$\2\2\u01c9\u01cb"+
		"\13\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0"+
		"\7$\2\2\u01d0n\3\2\2\2\u01d1\u01d3\t\7\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5p\3\2\2\2\u01d6"+
		"\u01d7\5o8\2\u01d7\u01d8\7\60\2\2\u01d8\u01d9\5o8\2\u01d9r\3\2\2\2\u01da"+
		"\u01de\7}\2\2\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e2\7\177\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\b"+
		":\2\2\u01e4t\3\2\2\2\u01e5\u01e7\t\b\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\b;\2\2\u01ebv\3\2\2\2\u01ec\u01f0\7}\2\2\u01ed\u01ef\13\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\b<\3\2\u01f4"+
		"x\3\2\2\2\u01f5\u01f6\13\2\2\2\u01f6\u01f7\b=\4\2\u01f7z\3\2\2\2\13\2"+
		"\u01a8\u01bf\u01c5\u01cc\u01d4\u01de\u01e8\u01f0\5\b\2\2\3<\2\3=\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}