// Generated from C:/Users/michele.nardini2/Desktop/LCLM/Esercitazione 1210/Prova/src/test\Test.g4 by ANTLR 4.12.0
package test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TestParser.StartContext ctx);
}