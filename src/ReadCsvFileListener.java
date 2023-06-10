// Generated from ReadCsvFile.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReadCsvFileParser}.
 */
public interface ReadCsvFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReadCsvFileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReadCsvFileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadCsvFileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReadCsvFileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadCsvFileParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ReadCsvFileParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadCsvFileParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ReadCsvFileParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadCsvFileParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ReadCsvFileParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadCsvFileParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ReadCsvFileParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadCsvFileParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ReadCsvFileParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadCsvFileParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ReadCsvFileParser.FieldContext ctx);
}