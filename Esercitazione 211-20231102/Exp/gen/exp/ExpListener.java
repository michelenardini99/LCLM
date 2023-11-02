// Generated from C:/Users/michele.nardini2/Desktop/LCLM/Esercitazione 211-20231102/Exp/src/exp\Exp.g4 by ANTLR 4.12.0
package exp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expProd2}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpProd2(ExpParser.ExpProd2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expProd2}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpProd2(ExpParser.ExpProd2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expProd3}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpProd3(ExpParser.ExpProd3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expProd3}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpProd3(ExpParser.ExpProd3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expProd1}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpProd1(ExpParser.ExpProd1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expProd1}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpProd1(ExpParser.ExpProd1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expProd4}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpProd4(ExpParser.ExpProd4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expProd4}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpProd4(ExpParser.ExpProd4Context ctx);
}