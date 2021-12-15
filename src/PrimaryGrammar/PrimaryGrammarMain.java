package PrimaryGrammar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import types.*;

public class PrimaryGrammarMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         File file = new File(args[0]);
         
         if (file.exists()) {
         } else {
            ErrorHandling.printError("File \"" + file + "\" not found");
            System.exit(1);
         }
         if (!args[0].endsWith(".qz")) {
            ErrorHandling.printError("Extension not valid on file \"" + args[0] + "\"");
            System.exit(1);

         }

         
         CharStream input = CharStreams.fromStream(new FileInputStream(args[0]));

         // passar como arg - arg[0]
         // CharStream input = CharStreams.fromStream(new
         // FileInputStream("../examples/testarCompiler.txt"));

         // create a lexer that feeds off of input CharStream:
         PrimaryGrammarLexer lexer = new PrimaryGrammarLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         PrimaryGrammarParser parser = new PrimaryGrammarParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            CompilerPrimaryGrammar compiler = new CompilerPrimaryGrammar();
            SemCheckPrimary semCheck = new SemCheckPrimary();
            semCheck.visit(tree);

            if (ErrorHandling.error()) {
               System.exit(1);
            }

            // * Para correr o codigo e aparecer no terminal
            ST code = compiler.visit(tree);
            code.add("name", "Output");
            // System.out.println(code.render());

            String target = "java";
            compiler.validTarget("java");
            String filename = "Output." + target;

            // *Para criar o Output.java
            try {
               PrintWriter out = new PrintWriter(new File(filename));
               out.println(code.render());
               out.close();

            } catch (IOException e) {
               System.err.println("ERROR: Unable to write in file " + filename);
               System.exit(1);
            }
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
