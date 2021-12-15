// Generated from PrimaryGrammar.g4 by ANTLR 4.9.2

package PrimaryGrammar;
import types.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrimaryGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_stat = 2, RULE_title = 3, RULE_question = 4, 
		RULE_mChoice = 5, RULE_matching = 6, RULE_answer = 7, RULE_matchAnswerLeft = 8, 
		RULE_matchAnswerRight = 9, RULE_rightPeer = 10, RULE_type = 11, RULE_declaration = 12, 
		RULE_assignment = 13, RULE_arrayValues = 14, RULE_arrayOps = 15, RULE_add = 16, 
		RULE_remove = 17, RULE_expr = 18, RULE_withFilter = 19, RULE_arrayGet = 20, 
		RULE_getQuestion = 21, RULE_editQuestion = 22, RULE_show = 23, RULE_shuffleAnswers = 24, 
		RULE_captureQuestion = 25, RULE_report = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "stat", "title", "question", "mChoice", "matching", 
			"answer", "matchAnswerLeft", "matchAnswerRight", "rightPeer", "type", 
			"declaration", "assignment", "arrayValues", "arrayOps", "add", "remove", 
			"expr", "withFilter", "arrayGet", "getQuestion", "editQuestion", "show", 
			"shuffleAnswers", "captureQuestion", "report"
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

	@Override
	public String getGrammarFileName() { return "PrimaryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static protected Map<String,Symbol> symbolTable = new HashMap<>();

	public PrimaryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrimaryGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			statList();
			setState(55);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitStatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__41) | (1L << T__43) | (1L << T__45) | (1L << INTEGER) | (1L << REAL) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(57);
				stat();
				}
				}
				setState(62);
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

	public static class StatContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayOpsContext arrayOps() {
			return getRuleContext(ArrayOpsContext.class,0);
		}
		public GetQuestionContext getQuestion() {
			return getRuleContext(GetQuestionContext.class,0);
		}
		public EditQuestionContext editQuestion() {
			return getRuleContext(EditQuestionContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public CaptureQuestionContext captureQuestion() {
			return getRuleContext(CaptureQuestionContext.class,0);
		}
		public ReportContext report() {
			return getRuleContext(ReportContext.class,0);
		}
		public ShuffleAnswersContext shuffleAnswers() {
			return getRuleContext(ShuffleAnswersContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				title();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				question();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				arrayOps();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				getQuestion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				editQuestion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				show();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				captureQuestion();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				report();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				shuffleAnswers();
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
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
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				mChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
		public String varName;
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public List<TerminalNode> TEXT() { return getTokens(PrimaryGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(PrimaryGrammarParser.TEXT, i);
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
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterMChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitMChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitMChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MChoiceContext mChoice() throws RecognitionException {
		MChoiceContext _localctx = new MChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			match(ID);
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			setState(87);
			match(T__4);
			setState(88);
			match(T__5);
			setState(89);
			match(TEXT);
			setState(90);
			match(T__6);
			setState(91);
			match(TEXT);
			setState(92);
			match(T__7);
			setState(93);
			match(T__8);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(94);
				answer();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__9);
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
		public String varName;
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
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
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__1);
			setState(103);
			match(ID);
			setState(104);
			match(T__2);
			setState(105);
			match(T__3);
			setState(106);
			match(T__10);
			setState(107);
			match(T__5);
			setState(108);
			match(TEXT);
			setState(109);
			match(T__11);
			setState(110);
			match(T__8);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(111);
				matchAnswerLeft();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__9);
			setState(118);
			match(T__12);
			setState(119);
			match(T__8);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(120);
				matchAnswerRight();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__9);
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__6:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__29:
			case T__30:
			case T__35:
			case T__41:
			case T__43:
			case T__45:
			case INTEGER:
			case REAL:
			case TEXT:
			case BOOLEAN:
			case ID:
				{
				}
				break;
			case T__13:
				{
				{
				setState(128);
				match(T__13);
				setState(129);
				match(T__8);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(130);
					rightPeer();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__9);
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
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(PrimaryGrammarParser.BOOLEAN, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(TEXT);
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case ID:
				{
				}
				break;
			case T__14:
				{
				setState(142);
				match(T__14);
				setState(143);
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
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public MatchAnswerLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchAnswerLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterMatchAnswerLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitMatchAnswerLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitMatchAnswerLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchAnswerLeftContext matchAnswerLeft() throws RecognitionException {
		MatchAnswerLeftContext _localctx = new MatchAnswerLeftContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matchAnswerLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
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
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public MatchAnswerRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchAnswerRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterMatchAnswerRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitMatchAnswerRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitMatchAnswerRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchAnswerRightContext matchAnswerRight() throws RecognitionException {
		MatchAnswerRightContext _localctx = new MatchAnswerRightContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matchAnswerRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
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
		public List<TerminalNode> ID() { return getTokens(PrimaryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PrimaryGrammarParser.ID, i);
		}
		public RightPeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPeer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterRightPeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitRightPeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitRightPeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightPeerContext rightPeer() throws RecognitionException {
		RightPeerContext _localctx = new RightPeerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rightPeer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(T__14);
			setState(154);
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

	public static class TypeContext extends ParserRuleContext {
		public Type res;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__6);
				((TypeContext)_localctx).res =  new TextType();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__15);
				((TypeContext)_localctx).res =  new NumberType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__16);
				((TypeContext)_localctx).res =  new RealType();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(T__1);
				((TypeContext)_localctx).res =  new QuestionType();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(T__17);
				((TypeContext)_localctx).res =  new BooleanType();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationArrayContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public DeclarationArrayContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterDeclarationArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitDeclarationArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitDeclarationArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationIdContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public DeclarationIdContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterDeclarationId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitDeclarationId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitDeclarationId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case T__15:
			case T__16:
			case T__17:
				_localctx = new DeclarationIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				type();
				setState(169);
				match(ID);
				}
				break;
			case T__18:
				_localctx = new DeclarationArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__18);
				setState(172);
				type();
				setState(173);
				match(T__19);
				setState(174);
				match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentIdContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentIdContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterAssignmentId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitAssignmentId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitAssignmentId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentArrayContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterAssignmentArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitAssignmentArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitAssignmentArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignmentIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__6:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(178);
					type();
					}
					break;
				case ID:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182);
				match(ID);
				setState(183);
				match(T__20);
				setState(184);
				expr(0);
				}
				}
				break;
			case 2:
				_localctx = new AssignmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(185);
					match(T__18);
					setState(186);
					type();
					setState(187);
					match(T__19);
					}
					break;
				case ID:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				match(ID);
				setState(193);
				match(T__20);
				setState(194);
				arrayValues();
				}
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

	public static class ArrayValuesContext extends ParserRuleContext {
		public Type arrType;
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
	 
		public ArrayValuesContext() { }
		public void copyFrom(ArrayValuesContext ctx) {
			super.copyFrom(ctx);
			this.arrType = ctx.arrType;
		}
	}
	public static class ArrayValuesWithoutGetContext extends ArrayValuesContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayValuesWithoutGetContext(ArrayValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayValuesWithoutGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayValuesWithoutGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayValuesWithoutGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayValuesWithGetContext extends ArrayValuesContext {
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public WithFilterContext withFilter() {
			return getRuleContext(WithFilterContext.class,0);
		}
		public ArrayValuesWithGetContext(ArrayValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayValuesWithGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayValuesWithGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayValuesWithGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayValues);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case TEXT:
				_localctx = new ArrayValuesWithGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					}
					break;
				case T__21:
					{
					setState(198);
					match(T__21);
					setState(199);
					match(T__22);
					setState(200);
					match(T__23);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				match(TEXT);
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
				case T__0:
				case T__1:
				case T__6:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__21:
				case T__29:
				case T__30:
				case T__35:
				case T__41:
				case T__43:
				case T__45:
				case INTEGER:
				case REAL:
				case TEXT:
				case BOOLEAN:
				case ID:
					{
					}
					break;
				case T__37:
					{
					setState(205);
					withFilter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__24:
				_localctx = new ArrayValuesWithoutGetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__24);
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__19:
					{
					}
					break;
				case T__29:
				case T__30:
				case T__35:
				case INTEGER:
				case REAL:
				case TEXT:
				case BOOLEAN:
				case ID:
					{
					setState(210);
					expr(0);
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(211);
						match(T__25);
						setState(212);
						expr(0);
						}
						}
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				match(T__19);
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

	public static class ArrayOpsContext extends ParserRuleContext {
		public ArrayOpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOps; }
	 
		public ArrayOpsContext() { }
		public void copyFrom(ArrayOpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayShuffleContext extends ArrayOpsContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ArrayShuffleContext(ArrayOpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayShuffle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayShuffle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayShuffle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAddContext extends ArrayOpsContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ArrayAddContext(ArrayOpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayRemoveContext extends ArrayOpsContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public ArrayRemoveContext(ArrayOpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayShuffleAnswersContext extends ArrayOpsContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ArrayShuffleAnswersContext(ArrayOpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayShuffleAnswers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayShuffleAnswers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayShuffleAnswers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOpsContext arrayOps() throws RecognitionException {
		ArrayOpsContext _localctx = new ArrayOpsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayOps);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayShuffleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ID);
				setState(224);
				match(T__26);
				}
				break;
			case 2:
				_localctx = new ArrayAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(ID);
				setState(226);
				add();
				}
				break;
			case 3:
				_localctx = new ArrayRemoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(ID);
				setState(228);
				remove();
				}
				break;
			case 4:
				_localctx = new ArrayShuffleAnswersContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(ID);
				setState(230);
				match(T__26);
				setState(231);
				match(T__7);
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

	public static class AddContext extends ParserRuleContext {
		public Type vType;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__27);
			setState(235);
			expr(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(236);
				match(T__25);
				setState(237);
				expr(0);
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

	public static class RemoveContext extends ParserRuleContext {
		public Type vType;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__28);
			setState(244);
			expr(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(245);
				match(T__25);
				setState(246);
				expr(0);
				}
				}
				setState(251);
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

	public static class ExprContext extends ParserRuleContext {
		public Type eType;
		public Type vType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.vType = ctx.vType;
			this.varName = ctx.varName;
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(PrimaryGrammarParser.INTEGER, 0); }
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitIntegerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitIntegerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignExprContext extends ExprContext {
		public Token sign;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterSignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitSignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitSignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextExprContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public TextExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterTextExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitTextExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitTextExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealExprContext extends ExprContext {
		public TerminalNode REAL() { return getToken(PrimaryGrammarParser.REAL, 0); }
		public RealExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterRealExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitRealExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitRealExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(PrimaryGrammarParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivModExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterMultDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitMultDivModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitMultDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayGetEXprContext extends ExprContext {
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public ArrayGetEXprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrayGetEXpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrayGetEXpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrayGetEXpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(253);
				((SignExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((SignExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				((SignExprContext)_localctx).e = expr(11);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(T__35);
				setState(256);
				((ParenExprContext)_localctx).e = expr(0);
				setState(257);
				match(T__36);
				}
				break;
			case 3:
				{
				_localctx = new ArrayGetEXprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				arrayGet();
				}
				break;
			case 4:
				{
				_localctx = new TextExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(TEXT);
				}
				break;
			case 5:
				{
				_localctx = new RealExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(REAL);
				}
				break;
			case 6:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(INTEGER);
				}
				break;
			case 7:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(268);
						match(T__31);
						setState(269);
						((PowExprContext)_localctx).e2 = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new MultDivModExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivModExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(271);
						((MultDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((MultDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((MultDivModExprContext)_localctx).e2 = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(274);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((AddSubExprContext)_localctx).e2 = expr(9);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WithFilterContext extends ParserRuleContext {
		public String filter;
		public WithFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withFilter; }
	 
		public WithFilterContext() { }
		public void copyFrom(WithFilterContext ctx) {
			super.copyFrom(ctx);
			this.filter = ctx.filter;
		}
	}
	public static class FilterTypeContext extends WithFilterContext {
		public List<TerminalNode> TEXT() { return getTokens(PrimaryGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(PrimaryGrammarParser.TEXT, i);
		}
		public FilterTypeContext(WithFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterFilterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitFilterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitFilterType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterThemeContext extends WithFilterContext {
		public List<TerminalNode> TEXT() { return getTokens(PrimaryGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(PrimaryGrammarParser.TEXT, i);
		}
		public List<TerminalNode> ID() { return getTokens(PrimaryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PrimaryGrammarParser.ID, i);
		}
		public FilterThemeContext(WithFilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterFilterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitFilterTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitFilterTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithFilterContext withFilter() throws RecognitionException {
		WithFilterContext _localctx = new WithFilterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_withFilter);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new FilterTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__37);
				setState(282);
				match(T__3);
				{
				setState(283);
				match(TEXT);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(284);
					match(T__25);
					setState(285);
					match(TEXT);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new FilterThemeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__37);
				setState(292);
				match(T__5);
				setState(293);
				match(T__35);
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(295);
						match(T__25);
						setState(296);
						match(TEXT);
						}
						break;
					case 2:
						{
						setState(297);
						match(T__25);
						setState(298);
						match(ID);
						}
						break;
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__36);
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

	public static class ArrayGetContext extends ParserRuleContext {
		public Type vType;
		public ArrayGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGet; }
	 
		public ArrayGetContext() { }
		public void copyFrom(ArrayGetContext ctx) {
			super.copyFrom(ctx);
			this.vType = ctx.vType;
		}
	}
	public static class ArrGetIntContext extends ArrayGetContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(PrimaryGrammarParser.INTEGER, 0); }
		public ArrGetIntContext(ArrayGetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArrGetInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArrGetInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArrGetInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySizeContext extends ArrayGetContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ArraySizeContext(ArrayGetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterArraySize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitArraySize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitArraySize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayGetContext arrayGet() throws RecognitionException {
		ArrayGetContext _localctx = new ArrayGetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayGet);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ArrGetIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(ID);
				setState(308);
				match(T__24);
				setState(309);
				match(INTEGER);
				setState(310);
				match(T__19);
				}
				break;
			case 2:
				_localctx = new ArraySizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(ID);
				setState(312);
				match(T__38);
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

	public static class GetQuestionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PrimaryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PrimaryGrammarParser.ID, i);
		}
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public GetQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterGetQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitGetQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitGetQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetQuestionContext getQuestion() throws RecognitionException {
		GetQuestionContext _localctx = new GetQuestionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_getQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__21);
			setState(316);
			match(ID);
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(317);
				match(T__23);
				setState(318);
				match(TEXT);
				}
				break;
			case T__39:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
			match(T__39);
			setState(323);
			match(ID);
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__6:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__29:
			case T__30:
			case T__35:
			case T__41:
			case T__43:
			case T__45:
			case INTEGER:
			case REAL:
			case TEXT:
			case BOOLEAN:
			case ID:
				{
				}
				break;
			case T__2:
				{
				setState(325);
				match(T__2);
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(326);
					match(T__40);
					{
					setState(327);
					match(ID);
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(328);
						match(T__25);
						setState(329);
						match(ID);
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(337); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
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

	public static class EditQuestionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PrimaryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PrimaryGrammarParser.ID, i);
		}
		public EditQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterEditQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitEditQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitEditQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditQuestionContext editQuestion() throws RecognitionException {
		EditQuestionContext _localctx = new EditQuestionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_editQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__41);
			setState(342);
			match(ID);
			setState(343);
			match(T__2);
			setState(353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(344);
				match(T__40);
				{
				setState(345);
				match(ID);
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(346);
					match(T__25);
					setState(347);
					match(ID);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				}
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__40 );
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

	public static class ShowContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			expr(0);
			setState(358);
			match(T__42);
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

	public static class ShuffleAnswersContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ShuffleAnswersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffleAnswers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterShuffleAnswers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitShuffleAnswers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitShuffleAnswers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShuffleAnswersContext shuffleAnswers() throws RecognitionException {
		ShuffleAnswersContext _localctx = new ShuffleAnswersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shuffleAnswers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ID);
			setState(361);
			match(T__26);
			setState(362);
			match(T__7);
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

	public static class CaptureQuestionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public CaptureQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterCaptureQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitCaptureQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitCaptureQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureQuestionContext captureQuestion() throws RecognitionException {
		CaptureQuestionContext _localctx = new CaptureQuestionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_captureQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__43);
			setState(365);
			match(T__44);
			setState(366);
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

	public static class ReportContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PrimaryGrammarParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(PrimaryGrammarParser.ID, 0); }
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimaryGrammarListener ) ((PrimaryGrammarListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimaryGrammarVisitor ) return ((PrimaryGrammarVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_report);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__45);
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==ID) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\6"+
		"\3\6\5\6T\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7"+
		"\f\7\16\7e\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bs\n"+
		"\b\f\b\16\bv\13\b\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\5\b\u008c\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0093\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\5\17\u00b7\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1\n\17\3\17\3\17\3\17"+
		"\5\17\u00c6\n\17\3\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\20\3\20\3\20\5"+
		"\20\u00d1\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d8\n\20\f\20\16\20\u00db"+
		"\13\20\5\20\u00dd\n\20\3\20\5\20\u00e0\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00eb\n\21\3\22\3\22\3\22\3\22\7\22\u00f1\n\22"+
		"\f\22\16\22\u00f4\13\22\3\23\3\23\3\23\3\23\7\23\u00fa\n\23\f\23\16\23"+
		"\u00fd\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u010c\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0117\n\24\f\24\16\24\u011a\13\24\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0121\n\25\f\25\16\25\u0124\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u012e\n\25\f\25\16\25\u0131\13\25\3\25\5\25\u0134\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0143\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u014d\n\27\f"+
		"\27\16\27\u0150\13\27\6\27\u0152\n\27\r\27\16\27\u0153\5\27\u0156\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u015f\n\30\f\30\16\30\u0162\13"+
		"\30\6\30\u0164\n\30\r\30\16\30\u0165\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\2\3&\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\3\2 !\3\2#%\4\2\63\63\65\65"+
		"\2\u0193\28\3\2\2\2\4>\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\fU\3\2"+
		"\2\2\16h\3\2\2\2\20\u008d\3\2\2\2\22\u0094\3\2\2\2\24\u0097\3\2\2\2\26"+
		"\u009a\3\2\2\2\30\u00a8\3\2\2\2\32\u00b2\3\2\2\2\34\u00c5\3\2\2\2\36\u00df"+
		"\3\2\2\2 \u00ea\3\2\2\2\"\u00ec\3\2\2\2$\u00f5\3\2\2\2&\u010b\3\2\2\2"+
		"(\u0133\3\2\2\2*\u013b\3\2\2\2,\u013d\3\2\2\2.\u0157\3\2\2\2\60\u0167"+
		"\3\2\2\2\62\u016a\3\2\2\2\64\u016e\3\2\2\2\66\u0172\3\2\2\289\5\4\3\2"+
		"9:\7\2\2\3:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?\5\3\2\2\2@>\3\2\2\2AM\5\b\5\2BM\5\n\6\2CM\5\32\16\2DM\5\34\17\2EM"+
		"\5 \21\2FM\5,\27\2GM\5.\30\2HM\5\60\31\2IM\5\64\33\2JM\5\66\34\2KM\5\62"+
		"\32\2LA\3\2\2\2LB\3\2\2\2LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2LG\3"+
		"\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\7\3\2\2OP"+
		"\7\63\2\2P\t\3\2\2\2QT\5\f\7\2RT\5\16\b\2SQ\3\2\2\2SR\3\2\2\2T\13\3\2"+
		"\2\2UV\7\4\2\2VW\7\65\2\2WX\7\5\2\2XY\7\6\2\2YZ\7\7\2\2Z[\7\b\2\2[\\\7"+
		"\63\2\2\\]\7\t\2\2]^\7\63\2\2^_\7\n\2\2_c\7\13\2\2`b\5\20\t\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\f\2\2g\r\3\2"+
		"\2\2hi\7\4\2\2ij\7\65\2\2jk\7\5\2\2kl\7\6\2\2lm\7\r\2\2mn\7\b\2\2no\7"+
		"\63\2\2op\7\16\2\2pt\7\13\2\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\f\2\2xy\7\17\2\2y}\7\13\2\2z|\5\24"+
		"\13\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u008b\7\f\2\2\u0081\u008c\3\2\2\2\u0082\u0083\7\20\2\2\u0083"+
		"\u0087\7\13\2\2\u0084\u0086\5\26\f\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\7\f\2\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2"+
		"\2\2\u008c\17\3\2\2\2\u008d\u008e\7\65\2\2\u008e\u0092\7\63\2\2\u008f"+
		"\u0093\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0093\7\64\2\2\u0092\u008f\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0093\21\3\2\2\2\u0094\u0095\7\65\2\2\u0095"+
		"\u0096\7\63\2\2\u0096\23\3\2\2\2\u0097\u0098\7\65\2\2\u0098\u0099\7\63"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009b\7\65\2\2\u009b\u009c\7\21\2\2\u009c"+
		"\u009d\7\65\2\2\u009d\27\3\2\2\2\u009e\u009f\7\t\2\2\u009f\u00a9\b\r\1"+
		"\2\u00a0\u00a1\7\22\2\2\u00a1\u00a9\b\r\1\2\u00a2\u00a3\7\23\2\2\u00a3"+
		"\u00a9\b\r\1\2\u00a4\u00a5\7\4\2\2\u00a5\u00a9\b\r\1\2\u00a6\u00a7\7\24"+
		"\2\2\u00a7\u00a9\b\r\1\2\u00a8\u009e\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\31\3\2\2"+
		"\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\65\2\2\u00ac\u00b3\3\2\2\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\26\2\2\u00b0\u00b1"+
		"\7\65\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ad\3\2\2\2"+
		"\u00b3\33\3\2\2\2\u00b4\u00b7\5\30\r\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\65\2\2"+
		"\u00b9\u00ba\7\27\2\2\u00ba\u00c6\5&\24\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd"+
		"\5\30\r\2\u00bd\u00be\7\26\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1\3\2\2\2"+
		"\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\7\65\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00b6\3\2\2"+
		"\2\u00c5\u00c0\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c9"+
		"\7\30\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00cc\7\32\2\2\u00cb\u00c7\3\2\2"+
		"\2\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\7\63\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d1\5(\25\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00e0\3\2\2\2\u00d2\u00dc\7\33\2\2\u00d3\u00dd\3\2\2\2\u00d4"+
		"\u00d9\5&\24\2\u00d5\u00d6\7\34\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d5\3"+
		"\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d4\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\7\26\2\2\u00df\u00cb\3\2\2\2\u00df"+
		"\u00d2\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\65\2\2\u00e2\u00eb\7\35"+
		"\2\2\u00e3\u00e4\7\65\2\2\u00e4\u00eb\5\"\22\2\u00e5\u00e6\7\65\2\2\u00e6"+
		"\u00eb\5$\23\2\u00e7\u00e8\7\65\2\2\u00e8\u00e9\7\35\2\2\u00e9\u00eb\7"+
		"\n\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb!\3\2\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00f2\5&\24\2"+
		"\u00ee\u00ef\7\34\2\2\u00ef\u00f1\5&\24\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00fb\5&\24\2\u00f7\u00f8\7"+
		"\34\2\2\u00f8\u00fa\5&\24\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fe\u00ff\b\24\1\2\u00ff\u0100\t\2\2\2\u0100\u010c\5&\24\r\u0101\u0102"+
		"\7&\2\2\u0102\u0103\5&\24\2\u0103\u0104\7\'\2\2\u0104\u010c\3\2\2\2\u0105"+
		"\u010c\5*\26\2\u0106\u010c\7\63\2\2\u0107\u010c\7\62\2\2\u0108\u010c\7"+
		"\61\2\2\u0109\u010c\7\64\2\2\u010a\u010c\7\65\2\2\u010b\u00fe\3\2\2\2"+
		"\u010b\u0101\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107"+
		"\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\u0118\3\2\2\2\u010d\u010e\f\f\2\2\u010e\u010f\7\"\2\2\u010f\u0117\5&"+
		"\24\f\u0110\u0111\f\13\2\2\u0111\u0112\t\3\2\2\u0112\u0117\5&\24\f\u0113"+
		"\u0114\f\n\2\2\u0114\u0115\t\2\2\2\u0115\u0117\5&\24\13\u0116\u010d\3"+
		"\2\2\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\'\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011c\7(\2\2\u011c\u011d\7\6\2\2\u011d\u0122\7\63\2\2\u011e\u011f"+
		"\7\34\2\2\u011f\u0121\7\63\2\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0134\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127\7\b\2\2\u0127\u0128\7&\2\2\u0128"+
		"\u012f\t\4\2\2\u0129\u012a\7\34\2\2\u012a\u012e\7\63\2\2\u012b\u012c\7"+
		"\34\2\2\u012c\u012e\7\65\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7\'\2\2\u0133\u011b\3\2\2\2\u0133"+
		"\u0125\3\2\2\2\u0134)\3\2\2\2\u0135\u0136\7\65\2\2\u0136\u0137\7\33\2"+
		"\2\u0137\u0138\7\61\2\2\u0138\u013c\7\26\2\2\u0139\u013a\7\65\2\2\u013a"+
		"\u013c\7)\2\2\u013b\u0135\3\2\2\2\u013b\u0139\3\2\2\2\u013c+\3\2\2\2\u013d"+
		"\u013e\7\30\2\2\u013e\u0142\7\65\2\2\u013f\u0140\7\32\2\2\u0140\u0143"+
		"\7\63\2\2\u0141\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0145\7*\2\2\u0145\u0155\7\65\2\2\u0146\u0156"+
		"\3\2\2\2\u0147\u0151\7\5\2\2\u0148\u0149\7+\2\2\u0149\u014e\7\65\2\2\u014a"+
		"\u014b\7\34\2\2\u014b\u014d\7\65\2\2\u014c\u014a\3\2\2\2\u014d\u0150\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0148\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0146\3\2\2\2\u0155"+
		"\u0147\3\2\2\2\u0156-\3\2\2\2\u0157\u0158\7,\2\2\u0158\u0159\7\65\2\2"+
		"\u0159\u0163\7\5\2\2\u015a\u015b\7+\2\2\u015b\u0160\7\65\2\2\u015c\u015d"+
		"\7\34\2\2\u015d\u015f\7\65\2\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163\u015a\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166/\3\2\2\2\u0167\u0168\5&\24\2\u0168\u0169\7-\2\2\u0169"+
		"\61\3\2\2\2\u016a\u016b\7\65\2\2\u016b\u016c\7\35\2\2\u016c\u016d\7\n"+
		"\2\2\u016d\63\3\2\2\2\u016e\u016f\7.\2\2\u016f\u0170\7/\2\2\u0170\u0171"+
		"\7\65\2\2\u0171\65\3\2\2\2\u0172\u0173\7\60\2\2\u0173\u0174\t\4\2\2\u0174"+
		"\67\3\2\2\2&>LSct}\u0087\u008b\u0092\u00a8\u00b2\u00b6\u00c0\u00c5\u00cb"+
		"\u00d0\u00d9\u00dc\u00df\u00ea\u00f2\u00fb\u010b\u0116\u0118\u0122\u012d"+
		"\u012f\u0133\u013b\u0142\u014e\u0153\u0155\u0160\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}