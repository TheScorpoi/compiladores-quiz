// Generated from PrimaryGrammar.g4 by ANTLR 4.9.2

package PrimaryGrammar;
import types.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrimaryGrammarParser}.
 */
public interface PrimaryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PrimaryGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PrimaryGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(PrimaryGrammarParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(PrimaryGrammarParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PrimaryGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PrimaryGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(PrimaryGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(PrimaryGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(PrimaryGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(PrimaryGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 */
	void enterMChoice(PrimaryGrammarParser.MChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#mChoice}.
	 * @param ctx the parse tree
	 */
	void exitMChoice(PrimaryGrammarParser.MChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(PrimaryGrammarParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(PrimaryGrammarParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(PrimaryGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(PrimaryGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 */
	void enterMatchAnswerLeft(PrimaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#matchAnswerLeft}.
	 * @param ctx the parse tree
	 */
	void exitMatchAnswerLeft(PrimaryGrammarParser.MatchAnswerLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 */
	void enterMatchAnswerRight(PrimaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#matchAnswerRight}.
	 * @param ctx the parse tree
	 */
	void exitMatchAnswerRight(PrimaryGrammarParser.MatchAnswerRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 */
	void enterRightPeer(PrimaryGrammarParser.RightPeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#rightPeer}.
	 * @param ctx the parse tree
	 */
	void exitRightPeer(PrimaryGrammarParser.RightPeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PrimaryGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PrimaryGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationId}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationId(PrimaryGrammarParser.DeclarationIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationId}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationId(PrimaryGrammarParser.DeclarationIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationArray}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationArray(PrimaryGrammarParser.DeclarationArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationArray}
	 * labeled alternative in {@link PrimaryGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationArray(PrimaryGrammarParser.DeclarationArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentId}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentId(PrimaryGrammarParser.AssignmentIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentId}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentId(PrimaryGrammarParser.AssignmentIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentArray(PrimaryGrammarParser.AssignmentArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link PrimaryGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentArray(PrimaryGrammarParser.AssignmentArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValuesWithGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValuesWithGet(PrimaryGrammarParser.ArrayValuesWithGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValuesWithGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValuesWithGet(PrimaryGrammarParser.ArrayValuesWithGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValuesWithoutGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValuesWithoutGet(PrimaryGrammarParser.ArrayValuesWithoutGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValuesWithoutGet}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValuesWithoutGet(PrimaryGrammarParser.ArrayValuesWithoutGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayShuffle}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void enterArrayShuffle(PrimaryGrammarParser.ArrayShuffleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayShuffle}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void exitArrayShuffle(PrimaryGrammarParser.ArrayShuffleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAdd}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void enterArrayAdd(PrimaryGrammarParser.ArrayAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAdd}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void exitArrayAdd(PrimaryGrammarParser.ArrayAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayRemove}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void enterArrayRemove(PrimaryGrammarParser.ArrayRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayRemove}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void exitArrayRemove(PrimaryGrammarParser.ArrayRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayShuffleAnswers}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void enterArrayShuffleAnswers(PrimaryGrammarParser.ArrayShuffleAnswersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayShuffleAnswers}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayOps}.
	 * @param ctx the parse tree
	 */
	void exitArrayShuffleAnswers(PrimaryGrammarParser.ArrayShuffleAnswersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PrimaryGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PrimaryGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(PrimaryGrammarParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(PrimaryGrammarParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(PrimaryGrammarParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(PrimaryGrammarParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(PrimaryGrammarParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(PrimaryGrammarParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignExpr(PrimaryGrammarParser.SignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignExpr(PrimaryGrammarParser.SignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTextExpr(PrimaryGrammarParser.TextExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTextExpr(PrimaryGrammarParser.TextExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealExpr(PrimaryGrammarParser.RealExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealExpr(PrimaryGrammarParser.RealExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(PrimaryGrammarParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(PrimaryGrammarParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(PrimaryGrammarParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(PrimaryGrammarParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(PrimaryGrammarParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(PrimaryGrammarParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayGetEXpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayGetEXpr(PrimaryGrammarParser.ArrayGetEXprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayGetEXpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayGetEXpr(PrimaryGrammarParser.ArrayGetEXprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PrimaryGrammarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PrimaryGrammarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(PrimaryGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link PrimaryGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(PrimaryGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterType}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterType(PrimaryGrammarParser.FilterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterType}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterType(PrimaryGrammarParser.FilterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterTheme}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 */
	void enterFilterTheme(PrimaryGrammarParser.FilterThemeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterTheme}
	 * labeled alternative in {@link PrimaryGrammarParser#withFilter}.
	 * @param ctx the parse tree
	 */
	void exitFilterTheme(PrimaryGrammarParser.FilterThemeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrGetInt}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void enterArrGetInt(PrimaryGrammarParser.ArrGetIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrGetInt}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void exitArrGetInt(PrimaryGrammarParser.ArrGetIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySize}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void enterArraySize(PrimaryGrammarParser.ArraySizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySize}
	 * labeled alternative in {@link PrimaryGrammarParser#arrayGet}.
	 * @param ctx the parse tree
	 */
	void exitArraySize(PrimaryGrammarParser.ArraySizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#getQuestion}.
	 * @param ctx the parse tree
	 */
	void enterGetQuestion(PrimaryGrammarParser.GetQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#getQuestion}.
	 * @param ctx the parse tree
	 */
	void exitGetQuestion(PrimaryGrammarParser.GetQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#editQuestion}.
	 * @param ctx the parse tree
	 */
	void enterEditQuestion(PrimaryGrammarParser.EditQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#editQuestion}.
	 * @param ctx the parse tree
	 */
	void exitEditQuestion(PrimaryGrammarParser.EditQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(PrimaryGrammarParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(PrimaryGrammarParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#shuffleAnswers}.
	 * @param ctx the parse tree
	 */
	void enterShuffleAnswers(PrimaryGrammarParser.ShuffleAnswersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#shuffleAnswers}.
	 * @param ctx the parse tree
	 */
	void exitShuffleAnswers(PrimaryGrammarParser.ShuffleAnswersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#captureQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCaptureQuestion(PrimaryGrammarParser.CaptureQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#captureQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCaptureQuestion(PrimaryGrammarParser.CaptureQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimaryGrammarParser#report}.
	 * @param ctx the parse tree
	 */
	void enterReport(PrimaryGrammarParser.ReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimaryGrammarParser#report}.
	 * @param ctx the parse tree
	 */
	void exitReport(PrimaryGrammarParser.ReportContext ctx);
}