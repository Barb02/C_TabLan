import static java.lang.System.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class TabLanSemanticCheck extends TabLanBaseVisitor<Boolean> {

   protected boolean inTable = false;
   protected boolean inFor = false;
   protected String currentClassCreate = ""; // Ex: aTable
   protected boolean inFormulaDef = false;
   protected String currentFormula = "";

   // @Override public Boolean visitProgram(TabLanParser.ProgramContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Boolean visitStat(TabLanParser.StatContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public Boolean visitAssignmentID(TabLanParser.AssignmentIDContext ctx) {
      Boolean res = visit(ctx.expr(0));
      String id = ctx.ID().getText();
      if (res)
      {
         if (!TabLanParser.symbolTable.containsKey(id))
         {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
            res = false;
         }
         else
         {
            Symbol sym = TabLanParser.symbolTable.get(id);
            if (!ctx.expr(0).varType.conformsTo(sym.type()))
            {
               ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
               res = false;
            }
            else
               sym.setValueDefined();
         }
      }
      
      return res;
   }

   @Override public Boolean visitAssignmentView(TabLanParser.AssignmentViewContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      if(!(s.type() instanceof TableType)){
         res = false;
         ErrorHandling.printError(ctx, "Can only use new in a table variable");
      }
      s.setValueDefined();
      return res;
   }

   @Override public Boolean visitAssignmentColumn(TabLanParser.AssignmentColumnContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTypeDefNoExpr(TabLanParser.TypeDefNoExprContext ctx) {
      Boolean res = visit(ctx.typeExpr());
   
      String id = ctx.ID().getText();

      if(!inTable){
         if (TabLanParser.symbolTable.containsKey(id))
         {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" already declared!");
            res = false;
         }
         else
            TabLanParser.symbolTable.put(id, new VariableSymbol(id, ctx.typeExpr().res));
      }
      else{
         for (Symbol column : TabLanParser.tableColumns.get(currentClassCreate)) {
            if (column.name().equals(id)){
               ErrorHandling.printError(ctx, "Column variable \""+id+"\" already declared!");
               res = false;
            }  
         }
         List<Symbol> columns = TabLanParser.tableColumns.get(currentClassCreate);
         columns.add(new VariableSymbol(id, ctx.typeExpr().res));
         TabLanParser.tableColumns.put(currentClassCreate, columns);
      }

      return res;
   }

   @Override public Boolean visitTypeDefWithExpr(TabLanParser.TypeDefWithExprContext ctx) {

      Boolean res;
      String id = ctx.ID().getText();
      
      for (Symbol column : TabLanParser.tableColumns.get(currentClassCreate)) {
         if (column.name().equals(id)){
            ErrorHandling.printError(ctx, "Column variable \""+id+"\" already declared!");
            res = false;
         }  
      }
      List<Symbol> columns = TabLanParser.tableColumns.get(currentClassCreate);
      columns.add(new VariableSymbol(id, ctx.typeExpr().res));
      TabLanParser.tableColumns.put(currentClassCreate, columns);
      
      inFormulaDef = true;
      currentFormula = id;
      res = visit(ctx.expr());
      inFormulaDef = false;

      if(res){
         Symbol col = TabLanParser.tableColumns.get(currentClassCreate).get(TabLanParser.tableColumns.get(currentClassCreate).size()-1);
         if (!ctx.expr().varType.conformsTo(col.type())){
            ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
            res = false;
         }
         else
            col.setValueDefined();
      }
   
      
      return res;
   }

   @Override public Boolean visitTypeInt(TabLanParser.TypeIntContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }


   @Override public Boolean visitTypeReal(TabLanParser.TypeRealContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTypeBool(TabLanParser.TypeBoolContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTypeText(TabLanParser.TypeTextContext ctx) {
      Boolean res = true;
      
      if(!ctx.res.isText())
         res = false;

      return res;
   }

   @Override public Boolean visitTypeId(TabLanParser.TypeIdContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      if (TabLanParser.tableColumns.containsKey(id))
      {
         ctx.res = TabLanParser.typeTable.get(ctx.ID().getText());
      }
      else{
         ErrorHandling.printError(ctx, "Class \""+id+"\" already exists!");
         res = false;
      }
      return res;
   }

   @Override public Boolean visitRemove(TabLanParser.RemoveContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitHeaderTableAssignment(TabLanParser.HeaderTableAssignmentContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitHeaderColumnAssignment(TabLanParser.HeaderColumnAssignmentContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }


   @Override public Boolean visitAddLineTable(TabLanParser.AddLineTableContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAddEmptyLineTable(TabLanParser.AddEmptyLineTableContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTypeCreation(TabLanParser.TypeCreationContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitCreateTypeTableNoText(TabLanParser.CreateTypeTableNoTextContext ctx) {
      Boolean res = true;
   
      String id = ctx.ID().getText();

      inTable = true;

      TableType t = new TableType(ctx.ID().getText());
      TabLanParser.typeTable.put(ctx.ID().getText(), t);
      if (TabLanParser.tableColumns.containsKey(id))
      {
         ErrorHandling.printError(ctx, "Class \""+id+"\" already exists!");
         res = false;
      }
      else{
         List<Symbol> columns = new ArrayList<>();
         TabLanParser.tableColumns.put(id, columns);
         currentClassCreate = id;
         
         for(TabLanParser.TableExprContext sc: ctx.tableExpr()){
            res = visit(sc);
            if(res != null && res == false) break;
         }
      }

      inTable = false;
      
      return res;
   }

   @Override public Boolean visitCreateTypeTableText(TabLanParser.CreateTypeTableTextContext ctx) {
      Boolean res = true;
   
      String id = ctx.ID().getText();

      inTable = true;

      TableType t = new TableType(ctx.ID().getText());
      TabLanParser.typeTable.put(ctx.ID().getText(), t);
      if (TabLanParser.tableColumns.containsKey(id))
      {
         ErrorHandling.printError(ctx, "Class \""+id+"\" already exists!");
         res = false;
      }
      else{
         List<Symbol> columns = new ArrayList<>();
         TabLanParser.tableColumns.put(id, columns);
         currentClassCreate = id;
         
         for(TabLanParser.TableExprContext sc: ctx.tableExpr()){
            res = visit(sc);
            if(res != null && res == false) break;
         }
      }

      inTable = false;
      
      return res;
   }

   @Override public Boolean visitCreateTypeTableInner(TabLanParser.CreateTypeTableInnerContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitCreateTypeNumber(TabLanParser.CreateTypeNumberContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprSign(TabLanParser.ExprSignContext ctx) { 
      Boolean res = visit(ctx.e) && checkNumericType(ctx, ctx.e.varType);
      if (res)
         ctx.varType = ctx.e.varType;
      return res;
   }

   @Override public Boolean visitTableExprNoText(TabLanParser.TableExprNoTextContext ctx) {
      return visit(ctx.typeDef());
   }

   @Override public Boolean visitTableExprText(TabLanParser.TableExprTextContext ctx) {
      return visit(ctx.typeDef());
   }

   @Override public Boolean visitPrint(TabLanParser.PrintContext ctx) {

      Boolean res = true;

      for(TabLanParser.ExprContext pc: ctx.expr())
            res = visit(pc);
      
      if(ctx.c != null)
         res = visit(ctx.c) && ctx.c.varType.isNumeric();

      if(!res){
         ErrorHandling.printError(ctx, "Only numeric values can be used in center function");
      }

      return res;
   }


   @Override public Boolean visitForLoop(TabLanParser.ForLoopContext ctx) {
      // TODO:
      // verificar identação?
      // verificar: variáveis definidas dentro do for não podem ser usadas fora
      // verificar se o iterable é uma tabela
      inFor = true;
      Boolean res = true;
      String id = ctx.ID(0).getText();
      TabLanParser.symbolTable.put(id, new VariableSymbol(id, integerType)); // substituir p linha type
      
      String id2 = ctx.ID(1).getText();
      if (!TabLanParser.symbolTable.containsKey(id2))
      {
         ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
         res = false;
      }
      else
      {
         Symbol sym = TabLanParser.symbolTable.get(id2);
         if (!sym.valueDefined())
         {
            ErrorHandling.printError(ctx, "Variable \""+id2+"\" not defined!");
            res = false;
         }
         // else if tipo não é tabela, res = false
      }
      for(TabLanParser.StatContext sc: ctx.stat()){
         visit(sc);
      }
      inFor = false;
      return res;
   }

   @Override public Boolean visitExprRead(TabLanParser.ExprReadContext ctx) {
      ctx.varType = textTypeOnlyNumbers;
      return true;
   }

   @Override public Boolean visitExprInteger(TabLanParser.ExprIntegerContext ctx) {
      ctx.varType = integerType;
      return true;
   }

   @Override public Boolean visitExprTablecolum(TabLanParser.ExprTablecolumContext ctx) {
      ctx.varType = new ColumnType(String.format("%s.%s",ctx.tableColum().id1.getText(),ctx.tableColum().id2.getText()));
      return true;
   }

   @Override public Boolean visitExprBool(TabLanParser.ExprBoolContext ctx) {
      ctx.varType = booleanType;
      return true;
   }

   @Override public Boolean visitExprText(TabLanParser.ExprTextContext ctx) {
      try{
         Double.valueOf(ctx.getText().replace("\"", ""));
         ctx.varType = textTypeOnlyNumbers;
      }
      catch(Exception e){
         ctx.varType = textType;
      }
      return true;
   }

   @Override public Boolean visitExprAddSub(TabLanParser.ExprAddSubContext ctx) {
      if(inFor) return true;
      Boolean res = (visit(ctx.e1) && ctx.e1.varType.isText() &&
                     visit(ctx.e2) && ctx.e2.varType.isText()) ||
                    (visit(ctx.e1) && checkNumericType(ctx, ctx.e1.varType) &&
                     visit(ctx.e2) && checkNumericType(ctx, ctx.e2.varType));

      if (res){
         if(ctx.e1.varType.isText()){
            if(ctx.e1.varType.isTextOnlyNumbers() && ctx.e2.varType.isTextOnlyNumbers())
               ctx.varType = textTypeOnlyNumbers;
            else
               ctx.varType = textType;
         }
         else
            ctx.varType = fetchType(ctx.e1.varType, ctx.e2.varType);
      }
      return res;
   }

   @Override public Boolean visitExprCompare(TabLanParser.ExprCompareContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.varType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.varType);

      if (res)
      {
         ctx.varType = booleanType;
      }

      return res;
   }

   @Override public Boolean visitExprIsDef(TabLanParser.ExprIsDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   // @Override public Boolean visitExprNew(TabLanParser.ExprNewContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }


   @Override public Boolean visitAssignmentNew(TabLanParser.AssignmentNewContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      if(!(s.type() instanceof TableType)){
         res = false;
         ErrorHandling.printError(ctx, "Can only use new in a table variable");
      }
      s.setValueDefined();
      return res;
   }

   @Override public Boolean visitAssignmentReadFile(TabLanParser.AssignmentReadFileContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      if(!(s.type() instanceof TableType)){
         res = false;
         ErrorHandling.printError(ctx, "Can only use new in a table variable");
      }
      s.setValueDefined();
      return res;
   }

   @Override public Boolean visitExprLength(TabLanParser.ExprLengthContext ctx) {
      ctx.varType = realType;
      Boolean res = visit(ctx.expr());
      return res;
   }

   @Override public Boolean visitExprCast(TabLanParser.ExprCastContext ctx) {

      // TODO boolean to int and vice versa?

      Boolean res = visit(ctx.e) && !ctx.e.varType.isBoolean();

      if(!res){
         ErrorHandling.printError(ctx, "Cannot cast a boolean");
      }

      if(ctx.e.varType.isText() && !ctx.e.varType.isTextOnlyNumbers()){
         ErrorHandling.printError(ctx, "Can only cast string that only contains numbers");
         return res;
      }
      
      res = !ctx.typeExpr().res.isBoolean();

      if(res){
         if(ctx.typeExpr().res.name().equals("String"))
            ctx.varType = textTypeOnlyNumbers;
         else
            ctx.varType = ctx.typeExpr().res;
      }
      else{
         ErrorHandling.printError(ctx, "Invalid cast type");
      }

      return res;
   }

   @Override public Boolean visitExprVariable(TabLanParser.ExprVariableContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();

      if(!inTable){
         if (!TabLanParser.symbolTable.containsKey(id))
         {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
            res = false;
         }
         else
         {
            Symbol sym = TabLanParser.symbolTable.get(id);
            if (!sym.valueDefined())
            {
               ErrorHandling.printError(ctx, "Variable \""+id+"\" not defined!");
               res = false;
            }
            else
               ctx.varType = sym.type();
         }
         return res;
      }
      else{
         Symbol col = null;
         for (Symbol column : TabLanParser.tableColumns.get(currentClassCreate)) {
            if (column.name().equals(id)){
               col = column;
               break;
            }  
         }

         if(col == null){
            ErrorHandling.printError(ctx, "Column variable \""+id+"\" does not exist!");
            res = false;
         }
         else{
            ctx.varType = col.type();
         }

         if(inFormulaDef){ // adicionar as colunas dependentes
            List<Symbol> variables = TabLanParser.formulaVariables.get(currentFormula);
            if(variables == null){
               variables = new ArrayList<>();
               variables.add(col);
            }
            else{
               boolean b = true;
               for (Symbol symbol : variables) {
                  if(symbol.equals(col))
                     b = false;
               }
               if(b) 
                  variables.add(col);
            }
            
            TabLanParser.formulaVariables.put(currentFormula, variables);
         }

         return res;
      }
   }
      

   // @Override public Boolean visitExprMod(TabLanParser.ExprModContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public Boolean visitExprInLineIF(TabLanParser.ExprInLineIFContext ctx) {
      Boolean res = visit(ctx.e1) && checkBooleanType(ctx, ctx.e1.varType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.varType) &&
                    visit(ctx.e3) && checkNumericType(ctx, ctx.e3.varType);
      if (res)
         ctx.varType = fetchType(ctx.e2.varType, ctx.e3.varType);
      
      return res;
   }

   @Override public Boolean visitExprParenthesis(TabLanParser.ExprParenthesisContext ctx) {
      Boolean res = visit(ctx.e);
      if (res)
         ctx.varType = ctx.e.varType;
      return res;
   }

   @Override public Boolean visitExprReal(TabLanParser.ExprRealContext ctx) {
      ctx.varType = realType;
      return true;
   }

   @Override public Boolean visitExprMulDiv(TabLanParser.ExprMulDivContext ctx) {
      Boolean res = visit(ctx.e1) && checkNumericType(ctx, ctx.e1.varType) &&
                    visit(ctx.e2) && checkNumericType(ctx, ctx.e2.varType);
      if (res)
      {
         ctx.varType = fetchType(ctx.e1.varType, ctx.e2.varType);
         if (integerOperator(ctx.op.getText()) && !"int".equals(ctx.varType.name()))
         {
            ErrorHandling.printError(ctx, "The integer operator "+ctx.op.getText()+" requires integer operands!");
            res = false;
         }
      }
      return res;
   }

   // @Override public Boolean visitReadStdio(TabLanParser.ReadStdioContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Boolean visitReadFromFile(TabLanParser.ReadFromFileContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Boolean visitReadDataUsing(TabLanParser.ReadDataUsingContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Boolean visitReadData(TabLanParser.ReadDataContext ctx) {
   //    ctx.varType = textType;
   //    System.out.println("pog");
   //    return true;
   // }

   // @Override public Boolean visitReadTable(TabLanParser.ReadTableContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Boolean visitReadTableUsingSep(TabLanParser.ReadTableUsingSepContext ctx) {
   //    Boolean res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public Boolean visitReadAs(TabLanParser.ReadAsContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitReadAsAppend(TabLanParser.ReadAsAppendContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitReadColumn(TabLanParser.ReadColumnContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitReadSeparator(TabLanParser.ReadSeparatorContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   private Boolean checkNumericType(ParserRuleContext ctx, Type t)
   {
      Boolean res = true;
      if (!t.isNumeric())
      {
         ErrorHandling.printError(ctx, "Numeric operator applied to a non-numeric operand!");
         res = false;
      }
      return res;
   }

   private Boolean checkBooleanType(ParserRuleContext ctx, Type t)
   {
      Boolean res = true;
      if (!t.isBoolean())
      {
         ErrorHandling.printError(ctx, "Numeric or Text operand used where a boolean is required!");
         res = false;
      }
      return res;
   }

   private Type fetchType(Type t1, Type t2)
   {
      Type res = null;
      if (t1.isNumeric() && t2.isNumeric())
      {
         if ("double".equals(t1.name()))
            res = t1;
         else if ("double".equals(t2.name()))
            res = t2;
         else
            res = t1;
      }
      else if ("boolean".equals(t1.name()) && "boolean".equals(t2.name()))
         res = t1;
      return res;
   }

   private boolean integerOperator(String op)
   {
      return "//".equals(op) || "\\\\".equals(op);
   }

   private final RealType realType = new RealType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final TextType textType = new TextType();
   private final TextType textTypeOnlyNumbers = new TextType(true);
   private final ColumnType columnType = new ColumnType();
}