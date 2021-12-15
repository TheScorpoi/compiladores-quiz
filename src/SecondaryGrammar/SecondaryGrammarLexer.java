// Generated from SecondaryGrammar.g4 by ANTLR 4.9.2

package SecondaryGrammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SecondaryGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TEXT=15, BOOLEAN=16, 
		ID=17, COMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "TEXT", "BOOLEAN", "ID", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'question'", "':'", "'type'", "'multiple-choice'", "'theme'", 
			"'text'", "'answers'", "'{'", "'}'", "'matching'", "'setLeft'", "'setRight'", 
			"'rightPeer'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TEXT", "BOOLEAN", "ID", "COMMENT", "WS"
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


	public SecondaryGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SecondaryGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\7\20\u008a\n\20\f\20\16\20\u008d\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009a\n\21\3\22\6\22\u009d"+
		"\n\22\r\22\16\22\u009e\3\23\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13\23"+
		"\3\23\3\23\3\23\3\23\3\24\6\24\u00ad\n\24\r\24\16\24\u00ae\3\24\3\24\4"+
		"\u008b\u00a4\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\62\3\2\2\2\7\64"+
		"\3\2\2\2\t9\3\2\2\2\13I\3\2\2\2\rO\3\2\2\2\17T\3\2\2\2\21\\\3\2\2\2\23"+
		"^\3\2\2\2\25`\3\2\2\2\27i\3\2\2\2\31q\3\2\2\2\33z\3\2\2\2\35\u0084\3\2"+
		"\2\2\37\u0087\3\2\2\2!\u0099\3\2\2\2#\u009c\3\2\2\2%\u00a0\3\2\2\2\'\u00ac"+
		"\3\2\2\2)*\7s\2\2*+\7w\2\2+,\7g\2\2,-\7u\2\2-.\7v\2\2./\7k\2\2/\60\7q"+
		"\2\2\60\61\7p\2\2\61\4\3\2\2\2\62\63\7<\2\2\63\6\3\2\2\2\64\65\7v\2\2"+
		"\65\66\7{\2\2\66\67\7r\2\2\678\7g\2\28\b\3\2\2\29:\7o\2\2:;\7w\2\2;<\7"+
		"n\2\2<=\7v\2\2=>\7k\2\2>?\7r\2\2?@\7n\2\2@A\7g\2\2AB\7/\2\2BC\7e\2\2C"+
		"D\7j\2\2DE\7q\2\2EF\7k\2\2FG\7e\2\2GH\7g\2\2H\n\3\2\2\2IJ\7v\2\2JK\7j"+
		"\2\2KL\7g\2\2LM\7o\2\2MN\7g\2\2N\f\3\2\2\2OP\7v\2\2PQ\7g\2\2QR\7z\2\2"+
		"RS\7v\2\2S\16\3\2\2\2TU\7c\2\2UV\7p\2\2VW\7u\2\2WX\7y\2\2XY\7g\2\2YZ\7"+
		"t\2\2Z[\7u\2\2[\20\3\2\2\2\\]\7}\2\2]\22\3\2\2\2^_\7\177\2\2_\24\3\2\2"+
		"\2`a\7o\2\2ab\7c\2\2bc\7v\2\2cd\7e\2\2de\7j\2\2ef\7k\2\2fg\7p\2\2gh\7"+
		"i\2\2h\26\3\2\2\2ij\7u\2\2jk\7g\2\2kl\7v\2\2lm\7N\2\2mn\7g\2\2no\7h\2"+
		"\2op\7v\2\2p\30\3\2\2\2qr\7u\2\2rs\7g\2\2st\7v\2\2tu\7T\2\2uv\7k\2\2v"+
		"w\7i\2\2wx\7j\2\2xy\7v\2\2y\32\3\2\2\2z{\7t\2\2{|\7k\2\2|}\7i\2\2}~\7"+
		"j\2\2~\177\7v\2\2\177\u0080\7R\2\2\u0080\u0081\7g\2\2\u0081\u0082\7g\2"+
		"\2\u0082\u0083\7t\2\2\u0083\34\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086"+
		"\7@\2\2\u0086\36\3\2\2\2\u0087\u008b\7$\2\2\u0088\u008a\13\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7$\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7V\2\2\u0091\u0092\7T\2\2\u0092\u0093\7W\2\2\u0093"+
		"\u009a\7G\2\2\u0094\u0095\7H\2\2\u0095\u0096\7C\2\2\u0096\u0097\7N\2\2"+
		"\u0097\u0098\7U\2\2\u0098\u009a\7G\2\2\u0099\u0090\3\2\2\2\u0099\u0094"+
		"\3\2\2\2\u009a\"\3\2\2\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f$\3\2\2\2"+
		"\u00a0\u00a4\7%\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\23"+
		"\2\2\u00aa&\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\24\2\2\u00b1(\3\2\2\2\b\2\u008b\u0099\u009e\u00a4\u00ae\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}