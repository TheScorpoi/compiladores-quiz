// Generated from SecondaryGrammar.g4 by ANTLR 4.9.2

package SecondaryGrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SecondaryGrammarParser}.
 */
public interface SecondaryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SecondaryGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SecondaryGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SecondaryGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SecondaryGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(SecondaryGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(SecondaryGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 */
	void enterMChoice(SecondaryGrammarParser.MChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 */
	void exitMChoice(SecondaryGrammarParser.MChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(SecondaryGrammarParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(SecondaryGrammarParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(SecondaryGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(SecondaryGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 */
	void enterMatchAnswerLeft(SecondaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 */
	void exitMatchAnswerLeft(SecondaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 */
	void enterMatchAnswerRight(SecondaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 */
	void exitMatchAnswerRight(SecondaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecondaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 */
	void enterRightPeer(SecondaryGrammarParser.RightPeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecondaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 */
	void exitRightPeer(SecondaryGrammarParser.RightPeerContext ctx);
}