package exp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
    			
        String fileName = "prova.txt";

        CharStream chars = CharStreams.fromFileName(fileName);
        SimpleExpMinusLexer lexer = new SimpleExpMinusLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleExpMinusParser parser = new SimpleExpMinusParser(tokens);
                
        ParseTree prog = parser.prog();  
        
        System.out.println("You had: "+lexer.lexicalErrors+" lexical errors and "+
                parser.getNumberOfSyntaxErrors()+" syntax errors");

        if (lexer.lexicalErrors+parser.getNumberOfSyntaxErrors() > 0) System.exit(1);   
        
        System.out.println("Calculating expression");
        
        SimpleCalcSTVisitor visitor = new SimpleCalcSTVisitor();
        System.out.println("The result is: " + visitor.visit(prog));
    
    }
}
