// Generated from SecondaryGrammar.g4 by ANTLR 4.9.2

package SecondaryGrammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SecondaryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SecondaryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SecondaryGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SecondaryGrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(SecondaryGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChoice(SecondaryGrammarParser.MChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(SecondaryGrammarParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(SecondaryGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchAnswerLeft(SecondaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchAnswerRight(SecondaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecondaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightPeer(SecondaryGrammarParser.RightPeerContext ctx);
}