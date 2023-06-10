import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class ReadCsvFileMain {
   public static Map<String, List<String>> read(String file) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(new FileInputStream(file));
         // create a lexer that feeds off of input CharStream:
         ReadCsvFileLexer lexer = new ReadCsvFileLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         ReadCsvFileParser parser = new ReadCsvFileParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ReadFileVisit visitor0 = new ReadFileVisit();
            visitor0.visit(tree);
            Map<String, List<String>> res = visitor0.data;
            return res;
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
      return null;
   }
}
