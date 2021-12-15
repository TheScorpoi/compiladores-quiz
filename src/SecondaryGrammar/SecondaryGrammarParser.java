// Generated from SecondaryGrammar.g4 by ANTLR 4.9.2

package SecondaryGrammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SecondaryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TEXT=15, BOOLEAN=16, 
		ID=17, COMMENT=18, WS=19;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_question = 2, RULE_mChoice = 3, 
		RULE_matching = 4, RULE_answer = 5, RULE_matchAnswerLeft = 6, RULE_matchAnswerRight = 7, 
		RULE_rightPeer = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "question", "mChoice", "matching", "answer", "matchAnswerLeft", 
			"matchAnswerRight", "rightPeer"
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

	@Override
	public String getGrammarFileName() { return "SecondaryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SecondaryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SecondaryGrammarParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			question();
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

	public static class QuestionContext extends ParserRuleContext {
		public MChoiceContext mChoice() {
			return getRuleContext(MChoiceContext.class,0);
		}
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				mChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				matching();
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

	public static class MChoiceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SecondaryGrammarParser.ID, 0); }
		public List<TerminalNode> TEXT() { return getTokens(SecondaryGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(SecondaryGrammarParser.TEXT, i);
		}
		public List<AnswerContext> answer() {
			return getRuleContexts(AnswerContext.class);
		}
		public AnswerContext answer(int i) {
			return getRuleContext(AnswerContext.class,i);
		}
		public MChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterMChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitMChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitMChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MChoiceContext mChoice() throws RecognitionException {
		MChoiceContext _localctx = new MChoiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(ID);
			setState(34);
			match(T__1);
			setState(35);
			match(T__2);
			setState(36);
			match(T__3);
			setState(37);
			match(T__4);
			setState(38);
			match(TEXT);
			setState(39);
			match(T__5);
			setState(40);
			match(TEXT);
			setState(41);
			match(T__6);
			setState(42);
			match(T__7);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(43);
				answer();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__8);
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

	public static class MatchingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SecondaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(SecondaryGrammarParser.TEXT, 0); }
		public List<MatchAnswerLeftContext> matchAnswerLeft() {
			return getRuleContexts(MatchAnswerLeftContext.class);
		}
		public MatchAnswerLeftContext matchAnswerLeft(int i) {
			return getRuleContext(MatchAnswerLeftContext.class,i);
		}
		public List<MatchAnswerRightContext> matchAnswerRight() {
			return getRuleContexts(MatchAnswerRightContext.class);
		}
		public MatchAnswerRightContext matchAnswerRight(int i) {
			return getRuleContext(MatchAnswerRightContext.class,i);
		}
		public List<RightPeerContext> rightPeer() {
			return getRuleContexts(RightPeerContext.class);
		}
		public RightPeerContext rightPeer(int i) {
			return getRuleContext(RightPeerContext.class,i);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(ID);
			setState(53);
			match(T__1);
			setState(54);
			match(T__2);
			setState(55);
			match(T__9);
			setState(56);
			match(T__4);
			setState(57);
			match(TEXT);
			setState(58);
			match(T__10);
			setState(59);
			match(T__7);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(60);
				matchAnswerLeft();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__8);
			setState(67);
			match(T__11);
			setState(68);
			match(T__7);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(69);
				matchAnswerRight();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__8);
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
				{
				}
				break;
			case T__12:
				{
				{
				setState(77);
				match(T__12);
				setState(78);
				match(T__7);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(79);
					rightPeer();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__8);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SecondaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(SecondaryGrammarParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SecondaryGrammarParser.BOOLEAN, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(TEXT);
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case ID:
				{
				}
				break;
			case T__13:
				{
				setState(91);
				match(T__13);
				setState(92);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MatchAnswerLeftContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SecondaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(SecondaryGrammarParser.TEXT, 0); }
		public MatchAnswerLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchAnswerLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterMatchAnswerLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitMatchAnswerLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitMatchAnswerLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchAnswerLeftContext matchAnswerLeft() throws RecognitionException {
		MatchAnswerLeftContext _localctx = new MatchAnswerLeftContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matchAnswerLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(TEXT);
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

	public static class MatchAnswerRightContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SecondaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(SecondaryGrammarParser.TEXT, 0); }
		public MatchAnswerRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchAnswerRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterMatchAnswerRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitMatchAnswerRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitMatchAnswerRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchAnswerRightContext matchAnswerRight() throws RecognitionException {
		MatchAnswerRightContext _localctx = new MatchAnswerRightContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_matchAnswerRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(TEXT);
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

	public static class RightPeerContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SecondaryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SecondaryGrammarParser.ID, i);
		}
		public RightPeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPeer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).enterRightPeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecondaryGrammarListener ) ((SecondaryGrammarListener)listener).exitRightPeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecondaryGrammarVisitor ) return ((SecondaryGrammarVisitor<? extends T>)visitor).visitRightPeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightPeerContext rightPeer() throws RecognitionException {
		RightPeerContext _localctx = new RightPeerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rightPeer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			match(T__13);
			setState(103);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6\3\6\3"+
		"\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16\6V"+
		"\13\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2j\2\27\3\2\2\2"+
		"\4\34\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\65\3\2\2\2\fZ\3\2\2\2\16a\3\2\2"+
		"\2\20d\3\2\2\2\22g\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33"+
		"\3\3\2\2\2\34\35\5\6\4\2\35\5\3\2\2\2\36!\5\b\5\2\37!\5\n\6\2 \36\3\2"+
		"\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\3\2\2#$\7\23\2\2$%\7\4\2\2%&\7\5\2\2"+
		"&\'\7\6\2\2\'(\7\7\2\2()\7\21\2\2)*\7\b\2\2*+\7\21\2\2+,\7\t\2\2,\60\7"+
		"\n\2\2-/\5\f\7\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63"+
		"\3\2\2\2\62\60\3\2\2\2\63\64\7\13\2\2\64\t\3\2\2\2\65\66\7\3\2\2\66\67"+
		"\7\23\2\2\678\7\4\2\289\7\5\2\29:\7\f\2\2:;\7\7\2\2;<\7\21\2\2<=\7\r\2"+
		"\2=A\7\n\2\2>@\5\16\b\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CA\3\2\2\2DE\7\13\2\2EF\7\16\2\2FJ\7\n\2\2GI\5\20\t\2HG\3\2\2\2IL"+
		"\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MX\7\13\2\2NY\3\2\2\2"+
		"OP\7\17\2\2PT\7\n\2\2QS\5\22\n\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VT\3\2\2\2WY\7\13\2\2XN\3\2\2\2XO\3\2\2\2Y\13\3\2\2\2Z[\7"+
		"\23\2\2[_\7\21\2\2\\`\3\2\2\2]^\7\20\2\2^`\7\22\2\2_\\\3\2\2\2_]\3\2\2"+
		"\2`\r\3\2\2\2ab\7\23\2\2bc\7\21\2\2c\17\3\2\2\2de\7\23\2\2ef\7\21\2\2"+
		"f\21\3\2\2\2gh\7\23\2\2hi\7\20\2\2ij\7\23\2\2j\23\3\2\2\2\n\27 \60AJT"+
		"X_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}