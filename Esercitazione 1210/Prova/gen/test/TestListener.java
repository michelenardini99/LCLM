// Generated from C:/Users/michele.nardini2/Desktop/LCLM/Esercitazione 1210/Prova/src/test\Test.g4 by ANTLR 4.12.0
package test;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TestParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TestParser.StartContext ctx);
}