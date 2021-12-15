// Generated from PrimaryGrammar.g4 by ANTLR 4.9.2

package PrimaryGrammar;
import types.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrimaryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrimaryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PrimaryGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(PrimaryGrammarParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PrimaryGrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(PrimaryGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(PrimaryGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChoice(PrimaryGrammarParser.MChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(PrimaryGrammarParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(PrimaryGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchAnswerLeft(PrimaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchAnswerRight(PrimaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightPeer(PrimaryGrammarParser.RightPeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PrimaryGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationId}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationId(PrimaryGrammarParser.DeclarationIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationArray}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationArray(PrimaryGrammarParser.DeclarationArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentId}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentId(PrimaryGrammarParser.AssignmentIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentArray(PrimaryGrammarParser.AssignmentArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValuesWithGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValuesWithGet(PrimaryGrammarParser.ArrayValuesWithGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValuesWithoutGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValuesWithoutGet(PrimaryGrammarParser.ArrayValuesWithoutGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayShuffle}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayShuffle(PrimaryGrammarParser.ArrayShuffleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAdd}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAdd(PrimaryGrammarParser.ArrayAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayRemove}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRemove(PrimaryGrammarParser.ArrayRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayShuffleAnswers}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayShuffleAnswers(PrimaryGrammarParser.ArrayShuffleAnswersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(PrimaryGrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(PrimaryGrammarParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(PrimaryGrammarParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(PrimaryGrammarParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpr(PrimaryGrammarParser.SignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextExpr(PrimaryGrammarParser.TextExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpr(PrimaryGrammarParser.RealExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(PrimaryGrammarParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr(PrimaryGrammarParser.MultDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(PrimaryGrammarParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayGetEXpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayGetEXpr(PrimaryGrammarParser.ArrayGetEXprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PrimaryGrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(PrimaryGrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterType}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterType(PrimaryGrammarParser.FilterTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterTheme}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterTheme(PrimaryGrammarParser.FilterThemeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrGetInt}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrGetInt(PrimaryGrammarParser.ArrGetIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySize}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySize(PrimaryGrammarParser.ArraySizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#getQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetQuestion(PrimaryGrammarParser.GetQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#editQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditQuestion(PrimaryGrammarParser.EditQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(PrimaryGrammarParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#shuffleAnswers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShuffleAnswers(PrimaryGrammarParser.ShuffleAnswersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#captureQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureQuestion(PrimaryGrammarParser.CaptureQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimaryGrammarParser#report}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReport(PrimaryGrammarParser.ReportContext ctx);
}