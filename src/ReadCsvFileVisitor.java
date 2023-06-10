// Generated from ReadCsvFile.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReadCsvFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReadCsvFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReadCsvFileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReadCsvFileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadCsvFileParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ReadCsvFileParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadCsvFileParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(ReadCsvFileParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadCsvFileParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ReadCsvFileParser.FieldContext ctx);
}