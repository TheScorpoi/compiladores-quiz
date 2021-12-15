package SecondaryGrammar;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import types.*;

public class SecondaryGrammarMain {
   static List<Question> questionList;

   public static List<Question> load(String filename) {

      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName("BancoPerguntas/" +filename);
         // create a lexer that feeds off of input CharStream:
         SecondaryGrammarLexer lexer = new SecondaryGrammarLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         SecondaryGrammarParser parser = new SecondaryGrammarParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));

            SemanticCheckSec semanticCheckSec = new SemanticCheckSec();
            InterpreterSecondaryGrammar interpreter = new InterpreterSecondaryGrammar();

            semanticCheckSec.visit(tree);
            if (ErrorHandling.error()) {
               System.exit(0);
            }

            interpreter.visit(tree);

            return interpreter.getQuestions();

         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }

      return null;
   }

   public static void main(String[] args) {


      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         SecondaryGrammarLexer lexer = new SecondaryGrammarLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         SecondaryGrammarParser parser = new SecondaryGrammarParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));

            SemanticCheckSec semanticCheckSec = new SemanticCheckSec();
            InterpreterSecondaryGrammar interpreter = new InterpreterSecondaryGrammar();

            semanticCheckSec.visit(tree);
            if (ErrorHandling.error()) {
               System.exit(0);
            }

            interpreter.visit(tree);

            questionList = interpreter.getQuestions();

            //just to check
            //System.out.println(questionList);

         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }

}