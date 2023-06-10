import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class TabLanMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         TabLanLexer lexer = new TabLanLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         TabLanParser parser = new TabLanParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            TabLanSemanticCheck semanticCheck = new TabLanSemanticCheck();
            TabLanCompiler compiler = new TabLanCompiler();
            semanticCheck.visit(tree);
            ST result = compiler.visit(tree);
            result.add("name", "Output");
            System.out.println(result.render());
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
