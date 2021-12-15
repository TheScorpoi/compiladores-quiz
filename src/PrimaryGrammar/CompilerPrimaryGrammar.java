package PrimaryGrammar;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

import types.*;

public class CompilerPrimaryGrammar extends PrimaryGrammarBaseVisitor<ST> {

   protected int varCount = 0;
   private int variable = 0;
   protected String target = "./PrimaryGrammar/java"; // default
   protected STGroup stg = null;
   private String title;
   private int weightQuiz;
   List<Question> questionsList = new ArrayList<>();
   public String varAssignementArray;

   public boolean validTarget(String target) {
      File f = new File(target + ".stg");
      return ("./PrimaryGrammar/java".equalsIgnoreCase(target)) && f.exists() && f.isFile() && f.canRead();
   }

   public void setTarget(String target) {
      assert validTarget(target);

      this.target = target;
   }

   protected String newVarName() {
      varCount++;
      return "v" + varCount;
   }

   private String newVariable(){
      variable++;
      return "tmp" + variable;
   }

   @Override public ST visitProgram(PrimaryGrammarParser.ProgramContext ctx) {
      assert validTarget(target);

      stg = new STGroupFile(target + ".stg");
      ST res = stg.getInstanceOf("module");
      res.add("stat", visit(ctx.statList()));
      return res;
   }

   @Override
   public ST visitStatList(PrimaryGrammarParser.StatListContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for (PrimaryGrammarParser.StatContext sc : ctx.stat())
         res.add("stat", visit(sc));
      return res;
   }

   /*
    * @Override public ST visitStat(PrimaryGrammarParser.StatContext ctx) { return
    * visitChildren(ctx); }
    */

   @Override
   public ST visitTitle(PrimaryGrammarParser.TitleContext ctx) {
      ST res = stg.getInstanceOf("show");
      res.add("expr", ctx.TEXT().getText());
      return res;
   }

   @Override
   public ST visitQuestion(PrimaryGrammarParser.QuestionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitMChoice(PrimaryGrammarParser.MChoiceContext ctx) {
      String id = ctx.ID().getText();  
      Symbol s = PrimaryGrammarParser.symbolTable.get(id);
      s.setVarName(newVarName());
      ST res = stg.getInstanceOf("mChoice");
      res.add("var1", s.varName()); 
      res.add("var2", newVariable()); 
      res.add("id", id);
      res.add("type", "multiple-choice");
      res.add("theme", ctx.TEXT(0).getText());
      res.add("questionText", ctx.TEXT(1).getText());

      String answers = "{";

      for (int i = 0; i < ctx.answer().size(); i++) {
         PrimaryGrammarParser.AnswerContext answer = ctx.answer(i);

         if (i != 0) {
            answers += ", ";
         }
         answers += "{";
         answers +=  "\"" + answer.ID().getText() + "\", ";
         answers += answer.TEXT().getText();

         if (answer.BOOLEAN()!= null) {
            answers += ", ";
            String validation = answer.BOOLEAN().getText();
            answers += "\"" + validation.toLowerCase() + "\"";  
         }
         answers += "}";

      }
      answers += "}";
      res.add("answers", answers);
      return res;
   }

   @Override
   public ST visitMatching(PrimaryGrammarParser.MatchingContext ctx) {
      String id = ctx.ID().getText();
      Symbol s = PrimaryGrammarParser.symbolTable.get(id);
      s.setVarName(newVarName());
      ST res = stg.getInstanceOf("matching");
      res.add("var", s.varName()); 
      res.add("var2", newVariable()); 
      res.add("var3", newVariable()); 
      res.add("var4", newVariable()); 
      res.add("id", id);
      res.add("type", "matching");
      res.add("theme", ctx.TEXT().getText());

      String questionsLeft = "{";
      for (int i = 0; i < ctx.matchAnswerLeft().size(); i++) {
         PrimaryGrammarParser.MatchAnswerLeftContext answer = ctx.matchAnswerLeft(i);

         if (i != 0) {
            questionsLeft += ", ";
         }
         questionsLeft += "{";
         questionsLeft +=  "\"" + answer.ID().getText() + "\", ";
         questionsLeft += answer.TEXT().getText();
         questionsLeft += "}";

      }
      questionsLeft += "}";
      res.add("questionsLeft", questionsLeft);

      String answersRight = "{";
      for (int i = 0; i < ctx.matchAnswerRight().size(); i++) {
         PrimaryGrammarParser.MatchAnswerRightContext answer = ctx.matchAnswerRight(i);

         if (i != 0) {
            answersRight += ", ";
         }
         answersRight += "{";
         answersRight +=  "\"" + answer.ID().getText() + "\", ";
         answersRight += answer.TEXT().getText();
         answersRight += "}";

      }
      answersRight += "}";
      res.add("answersRight", answersRight);

      if (ctx.rightPeer() != null) {
         String peers = "{";
         for (int i = 0; i < ctx.rightPeer().size(); i++) {
            if (i != 0) {
               peers += ", ";
            }

            peers += "{";
            peers += "\"" + ctx.rightPeer(i).ID(0).getText() + "\" , ";
            peers += "\"" + ctx.rightPeer(i).ID(1).getText() + "\"";
            peers += "}";

         }
         peers += "}";
         res.add("peers", peers);
      }

      return res;
   }

   @Override
   public ST visitAnswer(PrimaryGrammarParser.AnswerContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitMatchAnswerLeft(PrimaryGrammarParser.MatchAnswerLeftContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitMatchAnswerRight(PrimaryGrammarParser.MatchAnswerRightContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitRightPeer(PrimaryGrammarParser.RightPeerContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitType(PrimaryGrammarParser.TypeContext ctx) {
      ST res = stg.getInstanceOf("text");
      res.add("text", ctx.res.getName());
      return res;
   }

   @Override
   public ST visitDeclarationId(PrimaryGrammarParser.DeclarationIdContext ctx) {
      ST res = stg.getInstanceOf("declaration");
      String id = ctx.ID().getText();
      Symbol s = PrimaryGrammarParser.symbolTable.get(id);

      s.setVarName(newVarName());
      res.add("type", s.type().getName());
      res.add("var", s.varName());
      return res;
   }

   @Override
   public ST visitDeclarationArray(PrimaryGrammarParser.DeclarationArrayContext ctx) {
      ST res = stg.getInstanceOf("declarationArray");
      String id = ctx.ID().getText();

      Symbol s = PrimaryGrammarParser.symbolTable.get(id);
      s.setVarName(newVarName());
      String typeString = s.getsubType().getName();
      switch (typeString) {
         case "number":
            typeString = "Integer";
            break;
         case "bool":
            typeString = "Boolean";
            break;
         case "text":
            typeString = "String";
            break;
         case "real":
            typeString = "Double";
         default:
            break;
      }
      res.add("type", typeString);
      res.add("var", s.varName());

      /*
       * -aqui, experiencia ST res2 = stg.getInstanceOf("common_text"); String content
       * = res.render(); if(typeString.equals("Question")){ content =
       * content.replace("ArrayList<Question>", "List<Question>"); } res2.add("text",
       * content); return res2;
       */
      return res;
   }

   @Override
   public ST visitAssignmentId(PrimaryGrammarParser.AssignmentIdContext ctx) {
      ST res = stg.getInstanceOf("assign");
      Symbol s = PrimaryGrammarParser.symbolTable.get(ctx.ID().getText());

      if (ctx.type() != null) {
         s.setVarName(newVarName());
         String typeString = s.type().getName();
         switch (typeString) {
            case "number":
               typeString = "int";
               break;
            case "bool":
               typeString = "boolean";
               break;
            case "text":
               typeString = "String";
               break;
            case "real":
               typeString = "Double";
            default:
               break;
         }
         res.add("stat", typeString);
      }
      res.add("var", s.varName()); // compor a semantica
      res.add("value", visit(ctx.expr()).render());
      return res;
   }

   @Override
   public ST visitAssignmentArray(PrimaryGrammarParser.AssignmentArrayContext ctx) {
      ST res = stg.getInstanceOf("assignArray");
      Symbol s = PrimaryGrammarParser.symbolTable.get(ctx.ID().getText());
      String str = "";
      res.add("stat", "");
      if (ctx.type() != null) {
         s.setVarName(newVarName());
         String typeString = s.type().getName();
         switch (typeString) {
            case "number":
               typeString = "Integer";
               break;
            case "bool":
               typeString = "Boolean";
               break;
            case "text":
               typeString = "String";
               break;
            case "real":
               typeString = "Double";
               break;
            case "question":
               typeString = "Question";
               break;
            default:
               break;
         }
         str += "List<" + typeString + "> " + s.varName() + " = new ArrayList<>();\n";
      }

      varAssignementArray = s.varName();
      str += visit(ctx.arrayValues()).render();
      res.add("value", str );
      return res;
   }

   @Override
   public ST visitArrayValuesWithGet(PrimaryGrammarParser.ArrayValuesWithGetContext ctx) {
      ST res = stg.getInstanceOf("stats");
      String stat = varAssignementArray +  " = SecondaryGrammarMain.load(";
      stat += ctx.TEXT().getText() + ");";
      //System.out.println(visit(ctx.withFilter()).render()); //retorna uma string do filtro
      System.out.println(stat);
      res.add("stat", stat);
      return res;
   }

   @Override
   public ST visitArrayValuesWithoutGet(PrimaryGrammarParser.ArrayValuesWithoutGetContext ctx) {
      ST res = stg.getInstanceOf("stats");
      String stat = "";
      for (PrimaryGrammarParser.ExprContext expr : ctx.expr()) {

         if (PrimaryGrammarParser.symbolTable.keySet().contains(visit(expr).render())) {
            Symbol s = PrimaryGrammarParser.symbolTable.get(visit(expr).render());
            stat += varAssignementArray + ".add(" + s.varName() +");";
         } else {
            stat += varAssignementArray + ".add(" + visit(expr).render() +");";
         }
         stat += "\nSystem.out.println(" + varAssignementArray + ");";
         
      }
      res.add("stat", stat);
      return res;
   }

   @Override
   public ST visitArrayShuffle(PrimaryGrammarParser.ArrayShuffleContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitArrayAdd(PrimaryGrammarParser.ArrayAddContext ctx) {
      /*
       * ST res = stg.getInstanceOf("text"); Symbol s =
       * PrimaryGrammarParser.symbolTable.get(ctx.ID().getText()); String expr =
       * visit(ctx.add()).render(); System.out.println(s.getsubType() + " : " +
       * ctx.add()); String str = ""; switch(s.getsubType().toString()){ case
       * "number": str = s.varName() + ".add("; if (expr.contains(",")){ String[] splt
       * = expr.split(","); for (int i=0; i<splt.length; i++){
       * Integer.parseInt(splt[i]); if (i==splt.length-1) str = splt[i] + ");"; else
       * str = splt[i] + ", "; }
       * 
       * } else{ Integer.parseInt(expr); str = s.varName() + ".add(" + expr + ");"; }
       * } res.add("text" , str);
       * 
       * return res;
       */
      return visitChildren(ctx);
   }

   @Override
   public ST visitArrayRemove(PrimaryGrammarParser.ArrayRemoveContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitArrayShuffleAnswers(PrimaryGrammarParser.ArrayShuffleAnswersContext ctx) {
      ST res = stg.getInstanceOf("shuffleAnswers");
      Symbol s = PrimaryGrammarParser.symbolTable.get(ctx.ID().getText());
      res.add("expr", s.varName());
      return res;
   }

   @Override public ST visitAdd(PrimaryGrammarParser.AddContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitRemove(PrimaryGrammarParser.RemoveContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitAddSubExpr(PrimaryGrammarParser.AddSubExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitIntegerExpr(PrimaryGrammarParser.IntegerExprContext ctx) {
      ST res = stg.getInstanceOf("stats");
      res.add("stat", ctx.INTEGER().getText());
      return res;
   }

   @Override
   public ST visitSignExpr(PrimaryGrammarParser.SignExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitTextExpr(PrimaryGrammarParser.TextExprContext ctx) {
      ST res = stg.getInstanceOf("stats");
      res.add("stat", ctx.TEXT().getText());
      return res;
   }

   @Override
   public ST visitRealExpr(PrimaryGrammarParser.RealExprContext ctx) {
      ST res = stg.getInstanceOf("stats");
      res.add("stat", ctx.REAL().getText());
      return res;
   }

   @Override
   public ST visitBooleanExpr(PrimaryGrammarParser.BooleanExprContext ctx) {
      ST res = stg.getInstanceOf("stats");
      String value = ctx.BOOLEAN().getText();
      res.add("stat", value.toLowerCase());
      return res;
   }

   @Override
   public ST visitMultDivModExpr(PrimaryGrammarParser.MultDivModExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitPowExpr(PrimaryGrammarParser.PowExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitArrayGetEXpr(PrimaryGrammarParser.ArrayGetEXprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitParenExpr(PrimaryGrammarParser.ParenExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitIdExpr(PrimaryGrammarParser.IdExprContext ctx) {
      ST res = stg.getInstanceOf("stats");
      res.add("stat", ctx.ID().getText());
      return res;
   }

   @Override
   public ST visitFilterType(PrimaryGrammarParser.FilterTypeContext ctx) {
      /*
       * ST res = stg.getInstanceOf("text"); //Symbol s =
       * PrimaryGrammarParser.symbolTable.get(ctx.INTEGER().getText()); String type =
       * ctx.getType.getText(); switch(type){ case "multiple-choice": type =
       * "getMultipleChoice()"; break; case "matching": type = "getMatching()"; break;
       * default: break; } //res.add("text", s.varName() + "." + type); return res;
       */
      return visitChildren(ctx);
   }

   @Override
   public ST visitFilterTheme(PrimaryGrammarParser.FilterThemeContext ctx) {
      ST res = stg.getInstanceOf("stats");
      String stat = "";
      for (int i = 0; i < ctx.TEXT().size(); i++) {
         stat += ctx.TEXT(i).getText();
      }
      res.add("stat", stat);

      return res;

   }

   @Override
   public ST visitArrGetInt(PrimaryGrammarParser.ArrGetIntContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitArraySize(PrimaryGrammarParser.ArraySizeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitGetQuestion(PrimaryGrammarParser.GetQuestionContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public ST visitEditQuestion(PrimaryGrammarParser.EditQuestionContext ctx) {
      ST res = stg.getInstanceOf("edit");
      String str = "";
      String k = "";
      for (int i = 0; i < ctx.ID().size(); i++) {
         String s = ctx.ID(i).getText();
         System.out.println(s);
         switch (i) {
            case 0:
               Symbol s1 = PrimaryGrammarParser.symbolTable.get(s);
               str = s1.varName();
               break;
            default:
               k += s + ",";
               break;
         }
      }
      res.add("var1", str);
      res.add("k", k);

      return res;
   }

   @Override
   public ST visitShow(PrimaryGrammarParser.ShowContext ctx) {
      ST res = stg.getInstanceOf("show");
      if (PrimaryGrammarParser.symbolTable.keySet().contains(visit(ctx.expr()).render())) {
         Symbol s = PrimaryGrammarParser.symbolTable.get(visit(ctx.expr()).render());
         res.add("expr", s.varName()); // !compor
      } else {
         res.add("expr", visit(ctx.expr()).render()); // !compor
      }
      return res;
   }

   @Override
   public ST visitCaptureQuestion(PrimaryGrammarParser.CaptureQuestionContext ctx) {
      ST res = stg.getInstanceOf("captureRequest");
      Symbol s = PrimaryGrammarParser.symbolTable.get(ctx.ID().getText());
      res.add("expr", s.varName());
      res.add("var1", newVariable()); 
      res.add("var2", newVariable()); 
      return res;
   }

   @Override
   public ST visitReport(PrimaryGrammarParser.ReportContext ctx) {
   	ST res = stg.getInstanceOf("report");
   	String var = "";
   	try{
   		var = ctx.ID().getText();
   		Symbol s = PrimaryGrammarParser.symbolTable.get(var);
		var = s.varName();
   	}
   	catch(NullPointerException e){
   		var = ctx.TEXT().getText();
   	}
   	res.add("filename", var);
      return res;
   }
}
