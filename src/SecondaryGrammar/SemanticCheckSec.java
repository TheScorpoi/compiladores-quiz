package SecondaryGrammar;

import java.util.ArrayList;
import java.util.List;

import types.*;
public class SemanticCheckSec extends SecondaryGrammarBaseVisitor<Boolean> {

   List<Question> questionsList = new ArrayList<>();

   @Override
   public Boolean visitProgram(SecondaryGrammarParser.ProgramContext ctx) {
       return visitChildren(ctx);
   }

   @Override
   public Boolean visitStat(SecondaryGrammarParser.StatContext ctx) {
       visit(ctx.question());
       return true;
   }

   @Override
   public Boolean visitQuestion(SecondaryGrammarParser.QuestionContext ctx) {

       if (ctx.mChoice() != null) {
           visit(ctx.mChoice());
       } else if (ctx.matching() != null) {
           visit(ctx.matching());
       } else {
           ErrorHandling.printError(ctx, "ERROR: Neither question type was called correctly");
           return false;
       }
       return true;
   }

   @Override
   public Boolean visitMChoice(SecondaryGrammarParser.MChoiceContext ctx) {
       String iD = ctx.ID().getText();
       String type = "multiple-choice";
       String theme = ctx.TEXT(0).getText();
       String questionText = ctx.TEXT(1).getText();

       for (Question question : questionsList) {
           if (question.getiD().equals(iD)) {
               ErrorHandling.printError(ctx, "ERROR: Question with iD: " + iD + ", already exists");
               return false;
           }
       }

       MultipleChoice multipleChoice = new MultipleChoice(iD, type, theme, questionText);

       for (SecondaryGrammarParser.AnswerContext answer : ctx.answer()) {
           String idAnswer = answer.ID().getText();
           String anwserText = answer.TEXT().getText();
           String validation = answer.BOOLEAN().getText();
           boolean validationBool = true;
           if (validation.equals("TRUE")) {
               validationBool = true;
           } else if (validation.equals("FALSE")) {
               validationBool = false;
           }
           multipleChoice.addAnswer(idAnswer, anwserText, validationBool);
       }

       questionsList.add(multipleChoice);

       return true;
   }

   @Override
   public Boolean visitMatching(SecondaryGrammarParser.MatchingContext ctx) {
       String iD = ctx.ID().getText();
       String type = "matching";
       String theme = ctx.TEXT().getText();

       for (Question question : questionsList) {
           if (question.getiD().equals(iD)) {
               ErrorHandling.printError(ctx, "ERROR: Question with iD: " + iD + ", already exists");
               return false;
           }
       }

       Matching matching = new Matching(iD, type, theme);

       for (SecondaryGrammarParser.MatchAnswerLeftContext question : ctx.matchAnswerLeft()) {
           String idAnswer = question.ID().getText();
           String questionText = question.TEXT().getText();

           matching.addQuestionLeft(idAnswer, questionText);
       }

       for (SecondaryGrammarParser.MatchAnswerRightContext answer : ctx.matchAnswerRight()) {
           String idAnswer = answer.ID().getText();
           String answerText = answer.TEXT().getText();

           matching.addAnswerRight(idAnswer, answerText);
       }

       String peerLeft = "";
       String peerRight = "";
       for (int i = 0; i < ctx.rightPeer().size(); i++) {
           if (i % 2 == 0) {
               peerLeft = ctx.rightPeer(i).getText();
           } else {
               peerRight = ctx.rightPeer(i).getText();
               matching.addPeers(peerLeft, peerRight);
           }
       }

       if (!questionsList.contains(matching)) {
           questionsList.add(matching);
       }
       // System.out.println(matching); this was only to test if the visitor is working
       // good
       return true;
   }

   @Override
   public Boolean visitAnswer(SecondaryGrammarParser.AnswerContext ctx) {
       return visitChildren(ctx);
   }

   @Override
   public Boolean visitMatchAnswerLeft(SecondaryGrammarParser.MatchAnswerLeftContext ctx) {
       return visitChildren(ctx);
   }

   @Override
   public Boolean visitMatchAnswerRight(SecondaryGrammarParser.MatchAnswerRightContext ctx) {
       return visitChildren(ctx);
   }

   @Override
   public Boolean visitRightPeer(SecondaryGrammarParser.RightPeerContext ctx) {
       return visitChildren(ctx);
   }
}
