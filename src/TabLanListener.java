// Generated from TabLan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TabLanParser}.
 */
public interface TabLanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TabLanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TabLanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TabLanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TabLanParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TabLanParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentNew}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentNew(TabLanParser.AssignmentNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentNew}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentNew(TabLanParser.AssignmentNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentView}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentView(TabLanParser.AssignmentViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentView}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentView(TabLanParser.AssignmentViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentID}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentID(TabLanParser.AssignmentIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentID}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentID(TabLanParser.AssignmentIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentColumn}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentColumn(TabLanParser.AssignmentColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentColumn}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentColumn(TabLanParser.AssignmentColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentReadFile}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentReadFile(TabLanParser.AssignmentReadFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentReadFile}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentReadFile(TabLanParser.AssignmentReadFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDefNoExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefNoExpr(TabLanParser.TypeDefNoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDefNoExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefNoExpr(TabLanParser.TypeDefNoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDefWithExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefWithExpr(TabLanParser.TypeDefWithExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDefWithExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefWithExpr(TabLanParser.TypeDefWithExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(TabLanParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(TabLanParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeReal(TabLanParser.TypeRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeReal(TabLanParser.TypeRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(TabLanParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(TabLanParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeText}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeText(TabLanParser.TypeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeText}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeText(TabLanParser.TypeTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeId}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(TabLanParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeId}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(TabLanParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(TabLanParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(TabLanParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerColumnAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 */
	void enterHeaderColumnAssignment(TabLanParser.HeaderColumnAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerColumnAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 */
	void exitHeaderColumnAssignment(TabLanParser.HeaderColumnAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerTableAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 */
	void enterHeaderTableAssignment(TabLanParser.HeaderTableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerTableAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 */
	void exitHeaderTableAssignment(TabLanParser.HeaderTableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 */
	void enterAddLineTable(TabLanParser.AddLineTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 */
	void exitAddLineTable(TabLanParser.AddLineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addEmptyLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 */
	void enterAddEmptyLineTable(TabLanParser.AddEmptyLineTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addEmptyLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 */
	void exitAddEmptyLineTable(TabLanParser.AddEmptyLineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#typeCreation}.
	 * @param ctx the parse tree
	 */
	void enterTypeCreation(TabLanParser.TypeCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#typeCreation}.
	 * @param ctx the parse tree
	 */
	void exitTypeCreation(TabLanParser.TypeCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTypeTableNoText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeTableNoText(TabLanParser.CreateTypeTableNoTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTypeTableNoText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeTableNoText(TabLanParser.CreateTypeTableNoTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTypeTableText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeTableText(TabLanParser.CreateTypeTableTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTypeTableText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeTableText(TabLanParser.CreateTypeTableTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTypeTableInner}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeTableInner(TabLanParser.CreateTypeTableInnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTypeTableInner}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeTableInner(TabLanParser.CreateTypeTableInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#createTypeNumber}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeNumber(TabLanParser.CreateTypeNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#createTypeNumber}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeNumber(TabLanParser.CreateTypeNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableExprNoText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprNoText(TabLanParser.TableExprNoTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableExprNoText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprNoText(TabLanParser.TableExprNoTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableExprText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprText(TabLanParser.TableExprTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableExprText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprText(TabLanParser.TableExprTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TabLanParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TabLanParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(TabLanParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(TabLanParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddColumn}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddColumn(TabLanParser.ExprAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddColumn}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddColumn(TabLanParser.ExprAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(TabLanParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(TabLanParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInteger}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(TabLanParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInteger}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(TabLanParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(TabLanParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(TabLanParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTablecolum}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTablecolum(TabLanParser.ExprTablecolumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTablecolum}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTablecolum(TabLanParser.ExprTablecolumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprText(TabLanParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprText(TabLanParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(TabLanParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(TabLanParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIsDef}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIsDef(TabLanParser.ExprIsDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIsDef}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIsDef(TabLanParser.ExprIsDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLength}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLength(TabLanParser.ExprLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLength}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLength(TabLanParser.ExprLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCast}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(TabLanParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCast}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(TabLanParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVariable}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(TabLanParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVariable}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(TabLanParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(TabLanParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(TabLanParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInLineIF}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInLineIF(TabLanParser.ExprInLineIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInLineIF}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInLineIF(TabLanParser.ExprInLineIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParenthesis}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(TabLanParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParenthesis}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(TabLanParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSign}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSign(TabLanParser.ExprSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSign}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSign(TabLanParser.ExprSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(TabLanParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(TabLanParser.ExprRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMulDiv}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(TabLanParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMulDiv}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(TabLanParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#tableColum}.
	 * @param ctx the parse tree
	 */
	void enterTableColum(TabLanParser.TableColumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#tableColum}.
	 * @param ctx the parse tree
	 */
	void exitTableColum(TabLanParser.TableColumContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(TabLanParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(TabLanParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabLanParser#readFile}.
	 * @param ctx the parse tree
	 */
	void enterReadFile(TabLanParser.ReadFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabLanParser#readFile}.
	 * @param ctx the parse tree
	 */
	void exitReadFile(TabLanParser.ReadFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readAs}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void enterReadAs(TabLanParser.ReadAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readAs}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void exitReadAs(TabLanParser.ReadAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readAsAppend}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void enterReadAsAppend(TabLanParser.ReadAsAppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readAsAppend}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void exitReadAsAppend(TabLanParser.ReadAsAppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readColumn}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void enterReadColumn(TabLanParser.ReadColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readColumn}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void exitReadColumn(TabLanParser.ReadColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readSeparator}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void enterReadSeparator(TabLanParser.ReadSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readSeparator}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 */
	void exitReadSeparator(TabLanParser.ReadSeparatorContext ctx);
}