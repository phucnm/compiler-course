package com.company;

import antlr.ParseTree;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input;
        System.out.println(new File(".").getAbsolutePath());
        if (args.length == 0 ) {
            System.out.println("Usage: Compiler filename.ul");
            return;
        }
        input = new ANTLRInputStream(new FileInputStream(args[0]));

        // The name of the grammar here is "ulNoActions",
        // so ANTLR generates ulNoActionsLexer and ulNoActionsParser
        ulNoActionsLexer lexer = new ulNoActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ulNoActionsParser parser = new ulNoActionsParser(tokens);

        try {
            ulNoActionsParser.program_return program = parser.program();
            CommonTree tree = (CommonTree)program.getTree();
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            ulNoActionsWalker walker = new ulNoActionsWalker(nodes);
            walker.program();
//            DOTTreeGenerator gen = new DOTTreeGenerator();
//            StringTemplate st = gen.toDOT(tree);
//            System.out.println(tree.toStringTree());
            System.out.println(tree.toStringTree());
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
