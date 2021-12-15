package SecondaryGrammar;
import java.util.ArrayList;
import java.util.List;

import types.*;
public class InterpreterSecondaryGrammar extends SecondaryGrammarBaseVisitor<Question> {

   List<Question> questionsList = new ArrayList<>();
   
   @Override
   public Question visitProgram(SecondaryGrammarParser.ProgramContext ctx) {
      return visitChildren(ctx); 
   }

   @Override
   public Question visitStat(SecondaryGrammarParser.StatContext ctx) {
         visit(ctx.question());  //se der erro tentar com o visit program, ou um + na gramatica...
      return null;
   }

   @Override
   public Question visitQuestion(SecondaryGrammarParser.QuestionContext ctx) {
      if (ctx.mChoice() != null) {
         visit(ctx.mChoice());   //verificar qual delas visitar, achamos nos??
      }else{
         visit(ctx.matching());
      }
      return null;
   }

   @Override
   public Question visitMChoice(SecondaryGrammarParser.MChoiceContext ctx) {
      String iD = ctx.ID().getText();
      String type = "multiple-choice";
      String theme = ctx.TEXT(0).getText();
      String questionText = ctx.TEXT(1).getText();

      MultipleChoice multipleChoice = new MultipleChoice(iD, type, theme, questionText);
      
      for (SecondaryGrammarParser.AnswerContext answer : ctx.answer()) {
         String idAnswer = answer.ID().getText();
         String anwserText = answer.TEXT().getText();

         if (answer.BOOLEAN() != null) {
            String validation = answer.BOOLEAN().getText();
            boolean validationBool = true;
            if (validation.equals("TRUE")) {
               validationBool = true;
            } else if (validation.equals("FALSE")) {
               validationBool = false;
            }
            multipleChoice.addAnswer(idAnswer, anwserText, validationBool);
         } else {
            multipleChoice.addAnswer(idAnswer, anwserText);
         }
      }
      
      if (!questionsList.contains(multipleChoice)) {
         questionsList.add(multipleChoice);
      } 
      //System.out.println(multipleChoice); this was only to test if the visitor is working good
      return null;
   }

   @Override
   public Question visitMatching(SecondaryGrammarParser.MatchingContext ctx) {
      String iD = ctx.ID().getText();
      String type = "matching";
      String theme = ctx.TEXT().getText();

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

      if (ctx.rightPeer() != null) {
         String peerLeft = "";
         String peerRight = "";
         for (int i = 0; i < ctx.rightPeer().size(); i++) {
            peerLeft = ctx.rightPeer(i).ID(0).getText();
            peerRight = ctx.rightPeer(i).ID(1).getText();
            matching.addPeers(peerLeft, peerRight);
         }
      }
      
      if (!questionsList.contains(matching)) {
         questionsList.add(matching);
      }
      //System.out.println(matching); //this was only to test if the visitor is working good
      return null;
   }

   @Override
   public Question visitAnswer(SecondaryGrammarParser.AnswerContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Question visitMatchAnswerLeft(SecondaryGrammarParser.MatchAnswerLeftContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Question visitMatchAnswerRight(SecondaryGrammarParser.MatchAnswerRightContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Question visitRightPeer(SecondaryGrammarParser.RightPeerContext ctx) {
      return visitChildren(ctx);
   }


   /**
    * Gets all the quesiton from the list
    * @return a list with all the questions
    */
   public List<Question> getQuestions() {
      return questionsList;
   }
   
}