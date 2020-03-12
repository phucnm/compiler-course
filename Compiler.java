/*
 * Compiler.java
 *
 * A starting place for the unnamed language compiler for CSC 435/535
 *
 */

import org.antlr.runtime.*;
import java.io.*;
import java.nio.file.Paths;

public class Compiler {
    public static String getBaseName(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index == -1) {
            return fileName;
        } else {
            return fileName.substring(0, index);
        }
    }
	public static void main (String[] args) throws Exception {
		try {
            // System.out.printf("\n [%d/%d] Testing %s\n", count, length, inputFile);
            // count++;
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
            ulNoActionsLexer lexer = new ulNoActionsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ulNoActionsParser parser = new ulNoActionsParser(tokens);
            Program p = parser.program();
            IRVisitor v = new IRVisitor();
            v.programName = getBaseName(Paths.get(args[0]).getFileName().toString());
            p.accept(v);
            System.out.println(v.program.toString());
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
