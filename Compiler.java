/*
 * Compiler.java
 *
 * A starting place for the unnamed language compiler for CSC 435/535
 *
 */

import org.antlr.runtime.*;
import java.io.*;

public class Compiler {
	public static void main (String[] args) throws Exception {
		int count = 1;
		int length = args.length;
		for (String inputFile : args) {
            if (!inputFile.contains(".ul")) {
                System.out.printf("\n%s is not accepted, expect .ul file\n", inputFile);
                continue;
            }
            try {
                System.out.printf("\n [%d/%d] Testing %s\n", count, length, inputFile);
                count++;
                ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
				ulNoActionsLexer lexer = new ulNoActionsLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ulNoActionsParser parser = new ulNoActionsParser(tokens);
				Program p = parser.program();
				TypeCheckVisitor v = new TypeCheckVisitor();
				p.accept(v);
            }
            catch (RecognitionException e )	{
                // A lexical or parsing error occured.
                // ANTLR will have already printed information on the
                // console due to code added to the grammar.  So there is
                // nothing to do here.
            }
            catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
	}
}
