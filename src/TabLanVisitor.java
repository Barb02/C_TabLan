// Generated from TabLan.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TabLanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TabLanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TabLanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TabLanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TabLanParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentNew}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentNew(TabLanParser.AssignmentNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentView}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentView(TabLanParser.AssignmentViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentID}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentID(TabLanParser.AssignmentIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentColumn}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentColumn(TabLanParser.AssignmentColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentReadFile}
	 * labeled alternative in {@link TabLanParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentReadFile(TabLanParser.AssignmentReadFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDefNoExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefNoExpr(TabLanParser.TypeDefNoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDefWithExpr}
	 * labeled alternative in {@link TabLanParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefWithExpr(TabLanParser.TypeDefWithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(TabLanParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReal(TabLanParser.TypeRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(TabLanParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeText}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeText(TabLanParser.TypeTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeId}
	 * labeled alternative in {@link TabLanParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(TabLanParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(TabLanParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerColumnAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderColumnAssignment(TabLanParser.HeaderColumnAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerTableAssignment}
	 * labeled alternative in {@link TabLanParser#headerAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderTableAssignment(TabLanParser.HeaderTableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddLineTable(TabLanParser.AddLineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addEmptyLineTable}
	 * labeled alternative in {@link TabLanParser#addLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddEmptyLineTable(TabLanParser.AddEmptyLineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#typeCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCreation(TabLanParser.TypeCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTypeTableNoText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeTableNoText(TabLanParser.CreateTypeTableNoTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTypeTableText}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeTableText(TabLanParser.CreateTypeTableTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTypeTableInner}
	 * labeled alternative in {@link TabLanParser#createTypeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeTableInner(TabLanParser.CreateTypeTableInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#createTypeNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeNumber(TabLanParser.CreateTypeNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableExprNoText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprNoText(TabLanParser.TableExprNoTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableExprText}
	 * labeled alternative in {@link TabLanParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprText(TabLanParser.TableExprTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TabLanParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(TabLanParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddColumn}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddColumn(TabLanParser.ExprAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(TabLanParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInteger}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(TabLanParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(TabLanParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTablecolum}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTablecolum(TabLanParser.ExprTablecolumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText(TabLanParser.ExprTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(TabLanParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIsDef}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsDef(TabLanParser.ExprIsDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLength}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLength(TabLanParser.ExprLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCast}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(TabLanParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVariable}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(TabLanParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(TabLanParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInLineIF}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInLineIF(TabLanParser.ExprInLineIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParenthesis}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(TabLanParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSign}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSign(TabLanParser.ExprSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReal(TabLanParser.ExprRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMulDiv}
	 * labeled alternative in {@link TabLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(TabLanParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#tableColum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColum(TabLanParser.TableColumContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(TabLanParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TabLanParser#readFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFile(TabLanParser.ReadFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readAs}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadAs(TabLanParser.ReadAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readAsAppend}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadAsAppend(TabLanParser.ReadAsAppendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readColumn}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadColumn(TabLanParser.ReadColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readSeparator}
	 * labeled alternative in {@link TabLanParser#howToRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadSeparator(TabLanParser.ReadSeparatorContext ctx);
}