
package PrimaryGrammar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import PrimaryGrammar.PrimaryGrammarParser;
import types.*;
import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.*;

public class SemCheckPrimary extends PrimaryGrammarBaseVisitor<Boolean> {

   protected String target = "./PrimaryGrammar/java"; // default
   protected STGroup stg = null;
   private final ArrayType arrayType = new ArrayType();
   private final RealType realType = new RealType();
   private final NumberType numberType = new NumberType();
   private final BooleanType booleanType = new BooleanType();
   private final TextType textType = new TextType();

   private Boolean checkNumericType(Type t) {
      Boolean res = true;
      if (!t.isNumeric()) {
         ErrorHandling.printError("Numeric operator applied to a non-numeric operand!");
         res = false;
      }
      return res;
   }

   public boolean checkVariable(String id) {

      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError("Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError("Variable \"" + id + "\" not defined!");
            return false;
         }
      }
      return true;
   }

   private Type fetchType(Type t1, Type t2) {
      Type res = null;
      if (t1.isNumeric() && t2.isNumeric()) {
         if ("real".equals(t1.getName()))
            res = t1;
         else if ("real".equals(t2.getName()))
            res = t2;
         else
            res = t1;
      } else if ("bool".equals(t1.getName()) && "bool".equals(t2.getName()))
         res = t1;
      return res;
   }

   @Override
   public Boolean visitProgram(PrimaryGrammarParser.ProgramContext ctx) {
      File f = new File("./PrimaryGrammar/java.stg");
      if (!(f.exists() && f.isFile() && f.canRead())) {
         ErrorHandling.printError(ctx, "File not found or don't exists");
         return false;
      }

      stg = new STGroupFile(target + ".stg");
      ST res = stg.getInstanceOf("module");
      res.add("stat", visit(ctx.statList()));

      return true;
   }

   @Override
   public Boolean visitStatList(PrimaryGrammarParser.StatListContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for (PrimaryGrammarParser.StatContext sc : ctx.stat())
         res.add("stat", visit(sc));
      return true;
   }

   @Override
   public Boolean visitStat(PrimaryGrammarParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitTitle(PrimaryGrammarParser.TitleContext ctx) {
      // !Nao estao a funcionar corretamente
      String title = ctx.TEXT().getText();
      if (title == null) {
         ErrorHandling.printError(ctx, "Title wasn't addressed");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitQuestion(PrimaryGrammarParser.QuestionContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitMChoice(PrimaryGrammarParser.MChoiceContext ctx) {
      String id = ctx.ID().getText();
      Symbol s = null;
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         PrimaryGrammarParser.symbolTable.put(id, new VariableSymbol(id, new QuestionType()));
         s = PrimaryGrammarParser.symbolTable.get(id);
      } else {
         ErrorHandling.printError(ctx, "Question iD \"" + id + "\" already is defined");
         return false;
      }

      boolean withValidation = false;
      boolean withOutValidation = false;

      boolean firstAnswer = true;

      for (PrimaryGrammarParser.AnswerContext answer : ctx.answer()) {
         if (firstAnswer) {
            firstAnswer = false;
            if (answer.BOOLEAN() == null) {
               withOutValidation = true;
               continue;
            } else {
               withValidation = true;
               continue;
            }
         }

         if (withValidation) {
            if (answer.BOOLEAN() != null) {
               continue;
            } else {
               ErrorHandling.printError(ctx, "Inconsistency on answer validation!");
               return false;
            }
         }

         if (withOutValidation) {
            if (answer.BOOLEAN() == null) {
               continue;
            } else {
               ErrorHandling.printError(ctx, "Inconsistency on answer validation!");
               return false;
            }
         }
      }

      ctx.varName = id;
      s.setValueDefined();

      return true;
   }

   @Override
   public Boolean visitMatching(PrimaryGrammarParser.MatchingContext ctx) {
      String id = ctx.ID().getText();
      Symbol s = null;
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         PrimaryGrammarParser.symbolTable.put(id, new VariableSymbol(id, new QuestionType()));
         s = PrimaryGrammarParser.symbolTable.get(id);
      } else {
         ErrorHandling.printError(ctx, "Question iD \"" + id + "\" already is defined");
         return false;
      }

      boolean withValidation = false;
      boolean withOutValidation = false;

      boolean firstAnswer = true;

      for (PrimaryGrammarParser.RightPeerContext answer : ctx.rightPeer()) {
         if (firstAnswer) {
            firstAnswer = false;
            if (answer == null) {
               withOutValidation = true;
               continue;
            } else {
               withValidation = true;
               continue;
            }
         }

         if (withValidation) {
            if (answer != null) {
               continue;
            } else {
               ErrorHandling.printError(ctx, "Inconsistency on answer validation!");
               return false;
            }
         }

         if (withOutValidation) {
            if (answer == null) {
               continue;
            } else {
               ErrorHandling.printError(ctx, "Inconsistency on answer validation!");
               return false;
            }
         }
      }

      ctx.varName = id;
      s.setValueDefined();

      return true;
   }

   @Override
   public Boolean visitAnswer(PrimaryGrammarParser.AnswerContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitMatchAnswerLeft(PrimaryGrammarParser.MatchAnswerLeftContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitMatchAnswerRight(PrimaryGrammarParser.MatchAnswerRightContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitRightPeer(PrimaryGrammarParser.RightPeerContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitType(PrimaryGrammarParser.TypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitDeclarationId(PrimaryGrammarParser.DeclarationIdContext ctx) {
      String id = ctx.ID().getText();
      if (PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" already declared");
         return false;
      } else {
         PrimaryGrammarParser.symbolTable.put(id, new VariableSymbol(id, ctx.type().res));
      }
      return true;
   }

   @Override
   public Boolean visitDeclarationArray(PrimaryGrammarParser.DeclarationArrayContext ctx) {

      String id = ctx.ID().getText();
      if (PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Array \"" + id + "\" already declared!");
         return false;
      } else {
         VariableSymbol sb = new VariableSymbol(id, arrayType);
         sb.setsubType(ctx.type().res);
         PrimaryGrammarParser.symbolTable.put(id, sb);
         sb.setValueDefined();
      }
      return true;
   }

   @Override
   public Boolean visitAssignmentId(PrimaryGrammarParser.AssignmentIdContext ctx) {
      String var = ctx.ID().getText();

      // declaration made behind
      if (ctx.type() == null) {
         if (visit(ctx.expr())) {
            if (!PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
               ErrorHandling.printError(ctx, "Variable \"" + var + "\" does not exists yet!");
               return false;
            } else {
               Symbol s = PrimaryGrammarParser.symbolTable.get(var);
               if (ctx.expr().eType != null && !ctx.expr().eType.conformsTo(s.type())) {
                  ErrorHandling.printError(ctx, "Variable are not compatible");
                  return false;
               } else {
                  if (ctx.expr().vType != null && !ctx.expr().vType.conformsTo(s.getsubType())) {
                     ErrorHandling.printError(ctx, "Variable are not compatible");
                     return false;
                  } else {
                     s.setValueDefined();
                  }

               }

            }
         }

         // declaration not made
      } else {
         if (PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
            ErrorHandling.printError(ctx, "Variable \"" + var + "\" already declared");
            return false;
         } else {
            PrimaryGrammarParser.symbolTable.put(var, new VariableSymbol(var, ctx.type().res));
            Symbol s = PrimaryGrammarParser.symbolTable.get(var);
            if (ctx.expr().eType != null && !ctx.expr().eType.conformsTo(s.type())) {
               ErrorHandling.printError(ctx, "Variable are not compatible");
               return false;
            } else {
               if (ctx.expr().vType != null && !ctx.expr().vType.conformsTo(s.getsubType())) {
                  ErrorHandling.printError(ctx, "Variable are not compatible");
                  return false;
               } else {
                  s.setValueDefined();
               }
            }

         }
      }

      return true;
   }

   @Override
   public Boolean visitAssignmentArray(PrimaryGrammarParser.AssignmentArrayContext ctx) {
      String var = ctx.ID().getText();
      Boolean res = visit(ctx.arrayValues());

      if (ctx.type() == null) {
         if (res) {
            if (!PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
               ErrorHandling.printError(ctx, "Variable \"" + var + "\" does not exists yet!");
               res = false;
            } else {
               Symbol s = PrimaryGrammarParser.symbolTable.get(var);

               if (ctx.arrayValues().arrType != null && !ctx.arrayValues().arrType.conformsTo(s.getsubType())) {
                  ErrorHandling.printError(ctx, "Not same type");
                  return false;
               } else {
                  s.setValueDefined();
               }

               if (ctx.arrayValues().getClass().getName()
                     .equals("PrimaryGrammar.PrimaryGrammarParser$ArrayValuesWithGetContext")) {
                  if (!s.getsubType().getName().equals("question")) {
                     ErrorHandling.printError("Not same type");
                     return false;
                  }

               }

            }
         }
      } else {
         if (PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
            ErrorHandling.printError(ctx, "Variable \"" + var + "\" already declared");
            return false;
         } else {

            PrimaryGrammarParser.symbolTable.put(var, new VariableSymbol(var, ctx.type().res));
            Symbol s = PrimaryGrammarParser.symbolTable.get(var);
            if (ctx.arrayValues() != null && !visit(ctx.arrayValues())) {
               ErrorHandling.printError(ctx, "Variable are not compatible");
               return false;
            } else {
               s.setValueDefined();
            }

         }

         if (ctx.arrayValues().getClass().getName()
               .equals("PrimaryGrammar.PrimaryGrammarParser$ArrayValuesWithGetContext")) {
            if (!ctx.type().res.getName().equals("question")) {
               ErrorHandling.printError("Not same type");
               return false;
            }

         }

      }

      return true;
   }

   @Override
   public Boolean visitArrayValuesWithGet(PrimaryGrammarParser.ArrayValuesWithGetContext ctx) {
      /*
      InputStream in_stream = null;
      CharStream input = null;
      String path = "./BancoPerguntas/";

      if (ctx.TEXT() != null) {
         String var = ctx.TEXT().getText();
         var = var.substring(1, var.length() - 1);
         path += var;
         System.out.println(path);
         try (Scanner inputinho = new Scanner(new File(path))) {

         } catch (FileNotFoundException e) {
            ErrorHandling.printError(ctx, "File not found!");
            return false;
         }
      }*/

      return true;

   }

   @Override
   public Boolean visitArrayValuesWithoutGet(PrimaryGrammarParser.ArrayValuesWithoutGetContext ctx) {
      Boolean res = visit(ctx.expr(0));
      Type tp = ctx.expr(0).eType;

      int i = 1;
      try {
         while (res) {
            res = visit(ctx.expr(i));
            if (!tp.conformsTo(ctx.expr(i).eType)) {
               ErrorHandling.printError(ctx, "Incoherent types defined in array values!");
               res = false;
            }
            i++;
         }
         return res;
      } catch (NullPointerException e) {
         res = true;
      }
      ctx.arrType = tp;
      return res;
   }

   @Override
   public Boolean visitArrayShuffle(PrimaryGrammarParser.ArrayShuffleContext ctx) {
      String id = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\" not defined!");
            return false;
         } else {
            if (sym.getsubType() == null) {
               ErrorHandling.printError(ctx,
                     "Method can only be applied to arrays and \"" + id + "\" is not an array from type \"question\"!");
               return false;
            }
         }
      }
      return true;
   }

   @Override
   public Boolean visitArrayAdd(PrimaryGrammarParser.ArrayAddContext ctx) {
      String var = ctx.ID().getText();
      Boolean res = visit(ctx.add());

      if (res) {
         if (!PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
            ErrorHandling.printError(ctx, "Variable \"" + var + "\" does not exists!");
            return false;
         } else {
            Symbol sym = PrimaryGrammarParser.symbolTable.get(var);
            if (sym.getsubType() == null) {
               ErrorHandling.printError(ctx,
                     "Method can only be applied to arrays and \"" + var + "\" is not an array!");
               return false;
            } else if (ctx.add().vType != null && !ctx.add().vType.conformsTo(sym.getsubType())) {
               ErrorHandling.printError(ctx, "Expression type does not conform to variable \"" + var + "\" type!");
               return false;
            } else
               sym.setValueDefined();
         }
      }
      return true;
   }

   @Override
   public Boolean visitArrayRemove(PrimaryGrammarParser.ArrayRemoveContext ctx) {
      String var = ctx.ID().getText();
      Boolean res = visit(ctx.remove());

      if (res) {
         if (!PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
            ErrorHandling.printError(ctx, "Variable \"" + var + "\" does not exists!");
            return false;
         } else {
            Symbol sym = PrimaryGrammarParser.symbolTable.get(var);
            if (sym.getsubType() == null) {
               ErrorHandling.printError(ctx,
                     "Method can only be applied to arrays and \"" + var + "\" is not an array!");
               res = false;
            } else if (ctx.remove().vType != null && !ctx.remove().vType.conformsTo(sym.getsubType())) {
               ErrorHandling.printError(ctx, "Expression type does not conform to variable \"" + var + "\" type!");
               return false;
            } else
               sym.setValueDefined();
         }
      }
      return true;
   }

   @Override
   public Boolean visitArrayShuffleAnswers(PrimaryGrammarParser.ArrayShuffleAnswersContext ctx) {
      String var = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(var)) {
         ErrorHandling.printError(ctx, "Variable \"" + var + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(var);
         System.out.println(PrimaryGrammarParser.symbolTable);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + var + "\" not defined!");
            return false;
         } else {
            if ((sym.type().getName().equals("array") && sym.getsubType().getName().equals("question"))
                  || (sym.getsubType().getName().equals("question") && sym.getsubType().getClass() == null)) {
            } else {
               ErrorHandling.printError(ctx, "Method can only be applied to arrays and \"" + var
                     + "\" is not an array, or array type its not from type \"question\"!");
               return false;
            }
         }
      }
      return true;

   }

   @Override
   public Boolean visitAdd(PrimaryGrammarParser.AddContext ctx) {
      Boolean res = visit(ctx.expr(0));
      Type tp = ctx.expr(0).eType;
      int i = 1;
      while (res && ctx.expr(i) != null) {
         res = visit(ctx.expr(i));
         if (ctx.expr(i).eType != null && !tp.conformsTo(ctx.expr(i).eType)) {
            ErrorHandling.printError(ctx, "Incoherent types defined in array values!");
            res = false;
         }
         i++;
      }
      ctx.vType = tp;
      return res;
   }

   @Override
   public Boolean visitRemove(PrimaryGrammarParser.RemoveContext ctx) {
      Boolean res = visit(ctx.expr(0));
      Type tp = ctx.expr(0).eType;
      int i = 1;
      while (res && ctx.expr(i) != null) {
         res = visit(ctx.expr(i));
         if (ctx.expr(i).eType != null && !tp.conformsTo(ctx.expr(i).eType)) {
            ErrorHandling.printError(ctx, "Incoherent types defined in array values!");
            res = false;
         }
         i++;
      }
      ctx.vType = tp;
      return res;
   }

   @Override
   public Boolean visitAddSubExpr(PrimaryGrammarParser.AddSubExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx.e1.eType) && visit(ctx.e2) && checkNumericType(ctx.e2.eType);
      if (res)
         ctx.eType = fetchType(ctx.e1.eType, ctx.e2.eType);
      ctx.vType = null;
      return res;
   }

   @Override
   public Boolean visitIntegerExpr(PrimaryGrammarParser.IntegerExprContext ctx) {
      ctx.eType = numberType;
      ctx.vType = null;
      return true;
   }

   @Override
   public Boolean visitSignExpr(PrimaryGrammarParser.SignExprContext ctx) {
      Boolean res = visit(ctx.e) && checkNumericType(ctx.e.eType);
      if (res)
         ctx.eType = ctx.e.eType;
      ctx.vType = null;
      return res;
   }

   @Override
   public Boolean visitTextExpr(PrimaryGrammarParser.TextExprContext ctx) {
      ctx.eType = textType;
      ctx.vType = null;
      return true;
   }

   @Override
   public Boolean visitRealExpr(PrimaryGrammarParser.RealExprContext ctx) {
      ctx.eType = realType;
      ctx.vType = null;
      return true;
   }

   @Override
   public Boolean visitBooleanExpr(PrimaryGrammarParser.BooleanExprContext ctx) {
      ctx.eType = booleanType;
      ctx.vType = null;
      return true;
   }

   @Override
   public Boolean visitMultDivModExpr(PrimaryGrammarParser.MultDivModExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx.e1.eType) && visit(ctx.e2) && checkNumericType(ctx.e2.eType);
      if (res) {
         ctx.eType = fetchType(ctx.e1.eType, ctx.e2.eType);
         ctx.vType = null;
         if (!"number".equals(ctx.eType.getName())) {
            ErrorHandling.printError(ctx, "The integer operator " + ctx.op.getText() + " requires integer operands!");
            res = false;
         }
      }
      return res;
   }

   @Override
   public Boolean visitPowExpr(PrimaryGrammarParser.PowExprContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx.e1.eType) && visit(ctx.e2) && checkNumericType(ctx.e2.eType);
      if (res)
         ctx.eType = fetchType(ctx.e1.eType, ctx.e2.eType);
      ctx.vType = null;
      return res;
   }

   @Override
   public Boolean visitArrayGetEXpr(PrimaryGrammarParser.ArrayGetEXprContext ctx) {
      Boolean res = visit(ctx.arrayGet());
      if (res) {
         ctx.eType = ctx.arrayGet().vType;
      }
      return res;
   }

   @Override
   public Boolean visitParenExpr(PrimaryGrammarParser.ParenExprContext ctx) {
      Boolean res = visit(ctx.e);
      if (res)
         ctx.eType = ctx.e.eType;
      return res;
   }

   @Override
   public Boolean visitIdExpr(PrimaryGrammarParser.IdExprContext ctx) {
      String id = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\" not defined!");
            return false;
         } else {
            ctx.eType = sym.type();
            ctx.vType = sym.getsubType();
            ctx.varName = id;
         }

      }
      return true;
   }

   // !FAZER FILTER TYPE
   @Override
   public Boolean visitFilterType(PrimaryGrammarParser.FilterTypeContext ctx) {
      return true;
   }

   @Override
   public Boolean visitFilterTheme(PrimaryGrammarParser.FilterThemeContext ctx) {

      int i = 0;
      while (ctx.ID(i) != null) {
         String iD = ctx.ID(i).getText();
         if (!PrimaryGrammarParser.symbolTable.keySet().contains(iD)) {
            ErrorHandling.printError(ctx, "Variable \"" + iD + "\" does not exists!");
            return false;
         } else {
            Symbol s = PrimaryGrammarParser.symbolTable.get(iD);
            if (!s.type().getName().equals("text")) {
               ErrorHandling.printError(ctx, "Variable \"" + iD + "\" must be of type text!");
               return false;
            }
         }
         i++;
      }

      return true;

   }

   @Override
   public Boolean visitArrGetInt(PrimaryGrammarParser.ArrGetIntContext ctx) {

      // check if this func is being used in an array
      String id = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\" not defined!");
            return false;
         } else {
            if (sym.getsubType() == null) {
               ErrorHandling.printError(ctx,
                     "Method can only be applied to arrays and \"" + id + "\" is not an array!");
               return false;
            }
         }
      }

      Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
      ctx.vType = sym.getsubType();

      // check the value to do the get from the array
      Integer int1 = Integer.parseInt(ctx.INTEGER().getText());

      if (int1 < 0 /* || verificacao do tamanho do array */) {
         ErrorHandling.printError(ctx, "Pass a number bigger than zero and lower than the size of the array!");
         return false;
      }

      return true;
   }

   @Override
   public Boolean visitArraySize(PrimaryGrammarParser.ArraySizeContext ctx) {
      String id = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
         if (!sym.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\" not defined!");
            return false;
         } else {
            if (sym.getsubType() == null) {
               ErrorHandling.printError(ctx,
                     "Method can only be applied to arrays and \"" + id + "\" is not an array!");
               return false;
            }
         }
      }

      Symbol sym = PrimaryGrammarParser.symbolTable.get(id);
      ctx.vType = sym.getsubType();

      return true;
   }

   @Override
   public Boolean visitGetQuestion(PrimaryGrammarParser.GetQuestionContext ctx) {
      // Only works for multiple-choice

      String id = ctx.ID(0).getText();
      String renomeacao = ctx.ID(1).getText();

      // Select das alineas que se quer mostrar
      if (!PrimaryGrammarParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable doesn't exists yet!");
         return false;
      } else {
         System.out.println(PrimaryGrammarParser.symbolTable);
         /*
          * int i = 2; try { if (ctx.ID(3) != null) { Boolean res = true; while (res) {
          * res = visit(ctx.ID(i)); if (!tp.conformsTo(ctx.expr(i).eType)) {
          * ErrorHandling.printError(ctx, "Incoherent types defined in array values!");
          * res = false; } i++; } } else {
          * 
          * }
          */

         // return true;
         // } catch (NullPointerException e) {
         // res = true;
         // }
      }

      return true;
   }

   @Override
   public Boolean visitEditQuestion(PrimaryGrammarParser.EditQuestionContext ctx) {
      // Only works for multiple-choice

      return visitChildren(ctx);
   }

   @Override
   public Boolean visitShow(PrimaryGrammarParser.ShowContext ctx) {
      Boolean res = visit(ctx.expr());

      if (ctx.expr().getClass().getName().equals("PrimaryGrammar.PrimaryGrammarParser$IdExprContext")) {
         if (!res) {
            ErrorHandling.printError(ctx, "The argument passed to show is incorret!");
            return false;
         }

         if (!PrimaryGrammarParser.symbolTable.containsKey(ctx.expr().varName)) {
            ErrorHandling.printError(ctx, "Variable \"" + ctx.expr().varName + "\" not defined!");
            return false;
         }
      }

      return true;
   }

   @Override
   public Boolean visitShuffleAnswers(PrimaryGrammarParser.ShuffleAnswersContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitCaptureQuestion(PrimaryGrammarParser.CaptureQuestionContext ctx) {
      String id = ctx.ID().getText();
      if (!PrimaryGrammarParser.symbolTable.keySet().contains(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" does not exists!");
         return false;
      } else {
         Symbol s = PrimaryGrammarParser.symbolTable.get(id);
         if (!s.type().getName().equals("question")) {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\" its not from type \"question\"!");
            return false;
         }
      }

      return true;
   }

   @Override
   public Boolean visitReport(PrimaryGrammarParser.ReportContext ctx) {

      if (ctx.ID() != null) {
         String iD = ctx.ID().getText();
         if (!PrimaryGrammarParser.symbolTable.keySet().contains(iD)) {
            ErrorHandling.printError(ctx, "Variable \"" + iD + "\" does not exists!");
            return false;
         } else {
            Symbol s = PrimaryGrammarParser.symbolTable.get(iD);
            if (!s.type().getName().equals("text")) {
               ErrorHandling.printError(ctx, "Variable \"" + iD + "\" must be of type text!");
               return false;
            }
         }
      }

      return true;
   }
}
