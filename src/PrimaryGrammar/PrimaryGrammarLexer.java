// Generated from PrimaryGrammar.g4 by ANTLR 4.9.2

package PrimaryGrammar;
import types.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrimaryGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		T__45=46, INTEGER=47, REAL=48, TEXT=49, BOOLEAN=50, ID=51, COMMENT=52, 
		WS=53, ERROR=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "INTEGER", "REAL", "TEXT", 
			"BOOLEAN", "ID", "COMMENT", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'quiz'", "'question'", "':'", "'type'", "'multiple-choice'", "'theme'", 
			"'text'", "'answers'", "'{'", "'}'", "'matching'", "'setLeft'", "'setRight'", 
			"'rightPeer'", "'->'", "'number'", "'real'", "'bool'", "'array['", "']'", 
			"'='", "'get'", "'all'", "'from'", "'['", "','", "'shuffle'", "'add'", 
			"'remove'", "'+'", "'-'", "'^'", "'*'", "'/'", "'%'", "'('", "')'", "'with'", 
			"'size'", "'as'", "'select'", "'edit'", "'show'", "'capture'", "'request'", 
			"'report'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INTEGER", 
			"REAL", "TEXT", "BOOLEAN", "ID", "COMMENT", "WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PrimaryGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrimaryGrammar.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\6\60\u0159\n\60\r\60\16\60\u015a\3\61\6\61\u015e"+
		"\n\61\r\61\16\61\u015f\3\61\3\61\7\61\u0164\n\61\f\61\16\61\u0167\13\61"+
		"\3\62\3\62\7\62\u016b\n\62\f\62\16\62\u016e\13\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u017b\n\63\3\64\6\64\u017e\n"+
		"\64\r\64\16\64\u017f\3\65\3\65\7\65\u0184\n\65\f\65\16\65\u0187\13\65"+
		"\3\65\3\65\3\65\3\65\3\66\6\66\u018e\n\66\r\66\16\66\u018f\3\66\3\66\3"+
		"\67\3\67\4\u016c\u0185\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8\3\2\5\3\2\62;\6\2\60\60\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u019c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5t\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0084"+
		"\3\2\2\2\r\u0094\3\2\2\2\17\u009a\3\2\2\2\21\u009f\3\2\2\2\23\u00a7\3"+
		"\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2\2\31\u00b4\3\2\2\2\33\u00bc\3\2"+
		"\2\2\35\u00c5\3\2\2\2\37\u00cf\3\2\2\2!\u00d2\3\2\2\2#\u00d9\3\2\2\2%"+
		"\u00de\3\2\2\2\'\u00e3\3\2\2\2)\u00ea\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3"+
		"\2\2\2/\u00f2\3\2\2\2\61\u00f6\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd\3\2\2"+
		"\2\67\u00ff\3\2\2\29\u0107\3\2\2\2;\u010b\3\2\2\2=\u0112\3\2\2\2?\u0114"+
		"\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E\u011a\3\2\2\2G\u011c\3\2\2\2I"+
		"\u011e\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2\2\2O\u0127\3\2\2\2Q\u012c\3\2"+
		"\2\2S\u012f\3\2\2\2U\u0136\3\2\2\2W\u013b\3\2\2\2Y\u0140\3\2\2\2[\u0148"+
		"\3\2\2\2]\u0150\3\2\2\2_\u0158\3\2\2\2a\u015d\3\2\2\2c\u0168\3\2\2\2e"+
		"\u017a\3\2\2\2g\u017d\3\2\2\2i\u0181\3\2\2\2k\u018d\3\2\2\2m\u0193\3\2"+
		"\2\2op\7s\2\2pq\7w\2\2qr\7k\2\2rs\7|\2\2s\4\3\2\2\2tu\7s\2\2uv\7w\2\2"+
		"vw\7g\2\2wx\7u\2\2xy\7v\2\2yz\7k\2\2z{\7q\2\2{|\7p\2\2|\6\3\2\2\2}~\7"+
		"<\2\2~\b\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7{\2\2\u0081\u0082\7r\2"+
		"\2\u0082\u0083\7g\2\2\u0083\n\3\2\2\2\u0084\u0085\7o\2\2\u0085\u0086\7"+
		"w\2\2\u0086\u0087\7n\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\u008d\7/\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7j\2\2\u008f\u0090\7q\2\2\u0090\u0091\7k\2\2"+
		"\u0091\u0092\7e\2\2\u0092\u0093\7g\2\2\u0093\f\3\2\2\2\u0094\u0095\7v"+
		"\2\2\u0095\u0096\7j\2\2\u0096\u0097\7g\2\2\u0097\u0098\7o\2\2\u0098\u0099"+
		"\7g\2\2\u0099\16\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7z\2\2\u009d\u009e\7v\2\2\u009e\20\3\2\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7u\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7o\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7e\2\2\u00af\u00b0"+
		"\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3"+
		"\30\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7N\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\32\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7"+
		"v\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3"+
		"\7j\2\2\u00c3\u00c4\7v\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\u00cb\7R\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7t\2\2"+
		"\u00ce\36\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\7@\2\2\u00d1 \3\2\2\2"+
		"\u00d2\u00d3\7p\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6"+
		"\7d\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7t\2\2\u00d8\"\3\2\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		"$\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2&\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7{\2\2\u00e8\u00e9\7]\2\2"+
		"\u00e9(\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed"+
		",\3\2\2\2\u00ee\u00ef\7i\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		".\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\60\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7o\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7]\2\2\u00fc\64\3\2\2\2\u00fd"+
		"\u00fe\7.\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7j\2\2\u0101"+
		"\u0102\7w\2\2\u0102\u0103\7h\2\2\u0103\u0104\7h\2\2\u0104\u0105\7n\2\2"+
		"\u0105\u0106\7g\2\2\u01068\3\2\2\2\u0107\u0108\7c\2\2\u0108\u0109\7f\2"+
		"\2\u0109\u010a\7f\2\2\u010a:\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d\7"+
		"g\2\2\u010d\u010e\7o\2\2\u010e\u010f\7q\2\2\u010f\u0110\7x\2\2\u0110\u0111"+
		"\7g\2\2\u0111<\3\2\2\2\u0112\u0113\7-\2\2\u0113>\3\2\2\2\u0114\u0115\7"+
		"/\2\2\u0115@\3\2\2\2\u0116\u0117\7`\2\2\u0117B\3\2\2\2\u0118\u0119\7,"+
		"\2\2\u0119D\3\2\2\2\u011a\u011b\7\61\2\2\u011bF\3\2\2\2\u011c\u011d\7"+
		"\'\2\2\u011dH\3\2\2\2\u011e\u011f\7*\2\2\u011fJ\3\2\2\2\u0120\u0121\7"+
		"+\2\2\u0121L\3\2\2\2\u0122\u0123\7y\2\2\u0123\u0124\7k\2\2\u0124\u0125"+
		"\7v\2\2\u0125\u0126\7j\2\2\u0126N\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u012a\7|\2\2\u012a\u012b\7g\2\2\u012bP\3\2\2\2\u012c\u012d"+
		"\7c\2\2\u012d\u012e\7u\2\2\u012eR\3\2\2\2\u012f\u0130\7u\2\2\u0130\u0131"+
		"\7g\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u0133\u0134\7e\2\2\u0134"+
		"\u0135\7v\2\2\u0135T\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7f\2\2\u0138"+
		"\u0139\7k\2\2\u0139\u013a\7v\2\2\u013aV\3\2\2\2\u013b\u013c\7u\2\2\u013c"+
		"\u013d\7j\2\2\u013d\u013e\7q\2\2\u013e\u013f\7y\2\2\u013fX\3\2\2\2\u0140"+
		"\u0141\7e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7r\2\2\u0143\u0144\7v\2\2"+
		"\u0144\u0145\7w\2\2\u0145\u0146\7t\2\2\u0146\u0147\7g\2\2\u0147Z\3\2\2"+
		"\2\u0148\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a\u014b\7s\2\2\u014b\u014c"+
		"\7w\2\2\u014c\u014d\7g\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2\u014f"+
		"\\\3\2\2\2\u0150\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153\7r\2\2\u0153"+
		"\u0154\7q\2\2\u0154\u0155\7t\2\2\u0155\u0156\7v\2\2\u0156^\3\2\2\2\u0157"+
		"\u0159\t\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b`\3\2\2\2\u015c\u015e\t\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0165\7\60\2\2\u0162\u0164\t\2\2\2\u0163\u0162\3"+
		"\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"b\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\7$\2\2\u0169\u016b\13\2\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7$\2\2\u0170"+
		"d\3\2\2\2\u0171\u0172\7V\2\2\u0172\u0173\7T\2\2\u0173\u0174\7W\2\2\u0174"+
		"\u017b\7G\2\2\u0175\u0176\7H\2\2\u0176\u0177\7C\2\2\u0177\u0178\7N\2\2"+
		"\u0178\u0179\7U\2\2\u0179\u017b\7G\2\2\u017a\u0171\3\2\2\2\u017a\u0175"+
		"\3\2\2\2\u017bf\3\2\2\2\u017c\u017e\t\3\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180h\3\2\2\2"+
		"\u0181\u0185\7%\2\2\u0182\u0184\13\2\2\2\u0183\u0182\3\2\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\7\f\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\65"+
		"\2\2\u018bj\3\2\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\b\66\2\2\u0192l\3\2\2\2\u0193\u0194\13\2\2\2\u0194n\3\2\2\2\13"+
		"\2\u015a\u015f\u0165\u016c\u017a\u017f\u0185\u018f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}