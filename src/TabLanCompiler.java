import org.stringtemplate.v4.*;
import java.util.*;

@SuppressWarnings("CheckReturnValue")

public class TabLanCompiler extends TabLanBaseVisitor<ST> {

   protected int varCount = 0;
   protected int fileVarCount = 0;
   protected boolean inTable = false;
   protected boolean inFormulaDef = false;
   private STGroup templates = new STGroupFile("java.stg");
   protected Map<String,String> typeToClass = Map.of("int","Integer","double","Double");
   protected boolean inFor = false;
   protected String tableFor = "";
   protected String currentClassCreate = ""; // Ex: aTable

   protected String newVarName() {
      varCount++;
      return "v"+varCount;
   }
   protected String newFileName() {
      fileVarCount++;
      return "f"+fileVarCount;
   }
   protected String lastFileName() {
      return "f"+fileVarCount;
   }

   @Override public ST visitProgram(TabLanParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      ST st = null;
      for(TabLanParser.StatContext sc: ctx.stat()){
         st = visit(sc);
         if(inTable){
            res.add("class",st);
            inTable = false;
         }
         else{
            res.add("stat", st);
         }
      }  
      return res;
   }

   @Override public ST visitAssignmentView(TabLanParser.AssignmentViewContext ctx){
      ST res = templates.getInstanceOf("stats");
      ST assign = templates.getInstanceOf("assignNew");
      ST view = templates.getInstanceOf("viewColumn");

      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      List<Symbol> colums = TabLanParser.tableColumns.get(s.type().toString());


      assign.add("var", s.varName());
      assign.add("type", s.type());

      view.add("varTo", ctx.ID());
      view.add("varFrom", ctx.tableColum().id1.getText());
      String column = ctx.tableColum().id2.getText();
      view.add("colum", column);

      res.add("stat", assign.render());
      res.add("stat", view.render());
      ST snull = null;
      for (Symbol t : colums) {
         if (t.varName().equals(column)){
            continue;
         }
         snull = templates.getInstanceOf("fillColumnNull");
         snull.add("var",s.varName());
         snull.add("colum",t.varName());
         snull.add("textName","null");
         snull.add("size",s.varName()+"."+column+".size()");
         res.add("stat",snull.render());
      }
      return res;
   }

   @Override public ST visitAssignmentID(TabLanParser.AssignmentIDContext ctx) {
      ST res = templates.getInstanceOf("assign");
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      res.add("stat", visit(ctx.expr(0)).render());
      res.add("var", s.varName());
      res.add("value", ctx.expr(0).varName);
      return res;
   }

   @Override public ST visitAssignmentNew(TabLanParser.AssignmentNewContext ctx) {
      ST res = templates.getInstanceOf("assignNew");
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(id);
      res.add("var", s.varName());
      res.add("type", s.type());
      
      if(!ctx.tableColum().isEmpty()){
         ST stats = templates.getInstanceOf("stats");
         for(TabLanParser.TableColumContext col : ctx.tableColum()){
            ST equals = templates.getInstanceOf("assign");
            Symbol s2 = TabLanParser.symbolTable.get(col.id1.getText());
            equals.add("var", s.varName() + "." + col.id2.getText());
            equals.add("value", String.format("new ArrayList<>(%s.%s)",s2.varName(), col.id2.getText()));
            stats.add("stat", equals.render());
         }
         res.add("stat", stats);
      }
      
      return res;
   }

   @Override public ST visitAssignmentColumn(TabLanParser.AssignmentColumnContext ctx) {
      if(inFor){
         ST res = templates.getInstanceOf("stats");
         ST assign = templates.getInstanceOf("assignTableColumnFor");
         assign.add("table", tableFor);
         assign.add("element", ctx.tableColum().id1.getText());
         assign.add("colunmName", ctx.tableColum().id2.getText());
         assign.add("expr", visit(ctx.expr()));
         res.add("stat", assign.render());
         return res;
      }
      ST res = templates.getInstanceOf("stats");
      ST assign = templates.getInstanceOf("assign");
      assign.add("var",visit(ctx.tableColum()));
      assign.add("value",visit(ctx.expr()));
      res.add("stat",assign.render());
      return res;
   }

   @Override public ST visitTypeDefNoExpr(TabLanParser.TypeDefNoExprContext ctx) {

      if(!inTable){
         ST res = templates.getInstanceOf("stats");
   
         String varName = ctx.ID().getText();
         Symbol s = TabLanParser.symbolTable.get(varName);
         s.setVarName(s.name());
   
         ST declareVar = templates.getInstanceOf("declareVar");
         declareVar.add("varType", s.type().name());
         declareVar.add("varName",s.varName());
         res.add("stat", declareVar.render());
         return res;
      }else{
         ST varAndType = templates.getInstanceOf("varAndVartype");

         List<Symbol> columns = TabLanParser.tableColumns.get(currentClassCreate);
         for (Symbol column : columns) {
            if (column.name().equals(ctx.ID().getText())) {
               column.setVarName(column.name());
               varAndType.add("var", column.varName());
               varAndType.add("varType", column.type().name());
               break;
            }
         }
         return varAndType;
      }
   }

   @Override public ST visitTypeDefWithExpr(TabLanParser.TypeDefWithExprContext ctx) {

      inFormulaDef = true;

      ST formula = templates.getInstanceOf("formula"); 

      List<Symbol> columns = TabLanParser.tableColumns.get(currentClassCreate);
      Symbol currentCol = null;

      for (Symbol column : columns) {
         if (column.name().equals(ctx.ID().getText())) {
            currentCol = column;
            break;
         }
      }

      // Adicionar coluna
      currentCol.setVarName(currentCol.name());
      formula.add("colVar", currentCol.varName());
      formula.add("colVarType", typeToClass.get(currentCol.type().name()));
      //

      formula.add("retType", currentCol.type().name());
      formula.add("name", currentCol.varName());

      List<Symbol> variables = TabLanParser.formulaVariables.get(currentCol.name());

      formula.add("firstVar", variables.get(0).name());
      formula.add("firstVarType", variables.get(0).type());

      for (int i=1; i<variables.size(); i++) {
         formula.add("var", variables.get(i).name());
         formula.add("varType",  variables.get(i).type());
      }

      formula.add("expr", visit(ctx.expr()).render());
      formula.add("retVar", ctx.expr().varName);
      
      return formula;
      
   }

   @Override public ST visitTypeInt(TabLanParser.TypeIntContext ctx) {
      ST res = templates.getInstanceOf("type");
      res.add("type", ctx.res);
      return res;
   }

   @Override public ST visitTypeReal(TabLanParser.TypeRealContext ctx) {
      ST res = templates.getInstanceOf("type");
      res.add("type", ctx.res);
      return res;
   }

   @Override public ST visitTypeBool(TabLanParser.TypeBoolContext ctx) {
      ST res = templates.getInstanceOf("type");
      res.add("type", ctx.res);
      return res;
   }

   @Override public ST visitTypeText(TabLanParser.TypeTextContext ctx) {
      ST res = templates.getInstanceOf("type");
      res.add("type", ctx.res);
      return res; 
   }

   @Override public ST visitTypeId(TabLanParser.TypeIdContext ctx) {
      ST res = templates.getInstanceOf("type");
      
      String varName = ctx.toString();
      Symbol symbol = TabLanParser.symbolTable.get(varName);
      symbol.setVarName(symbol.name());

      res.add("varType", symbol.type());

      return res;

      
   }

   @Override public ST visitRemove(TabLanParser.RemoveContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitHeaderTableAssignment(TabLanParser.HeaderTableAssignmentContext ctx) {
      //TODO -semantic check
      ST res = templates.getInstanceOf("Tableheader");
      res.add("var",ctx.ID().getText());
      res.add("text",ctx.TEXT().getText());
      
      return res;
   }

   @Override public ST visitHeaderColumnAssignment(TabLanParser.HeaderColumnAssignmentContext ctx) {
      //TODO -semantic check
      ST res = templates.getInstanceOf("ColumHeader");
      String s = visit(ctx.tableColum()).render().strip();
      String[] t = s.split("\\.");

      res.add("var",t[0]);
      res.add("colum",t[1]);
      res.add("text", ctx.TEXT().getText());
      
      return res;
   }


   @Override public ST visitAddLineTable(TabLanParser.AddLineTableContext ctx) {
      ST res = templates.getInstanceOf("stats");
      int size = ctx.expr().size();
      int count = 0;
      Map<String, List<String>> argsFormula = new HashMap<>();

      for(Map.Entry<String, List<Symbol>> element : TabLanParser.tableColumns.entrySet()){
         for (int i = 0; i < element.getValue().size(); i++){  // vai a cada coluna: n1, n2 e avg
            ST addLine = templates.getInstanceOf("addLineToTable");
            addLine.add("var", ctx.ID());
            addLine.add("colum", element.getValue().get(i).name());

            ST valueToAdd = null;
            if(count < size)
               valueToAdd = visit(ctx.expr(count));

            List<String> independent;
            
            for (String formula : TabLanParser.formulaVariables.keySet()) { // p cada formula
               if(argsFormula.get(formula)==null){
                  independent = new ArrayList<>();
               }
               else{
                  independent = argsFormula.get(formula);
               }

               for (Symbol col : TabLanParser.formulaVariables.get(formula)) { // p cada variavel usada nessa formula
                  if(element.getValue().get(i).equals(col)){  // variavel é a coluna atual
                     independent.add(ctx.expr(count).varName);
                  }
               }
               argsFormula.put(formula, independent);
            }

            if(count < size){
               addLine.add("text", valueToAdd);
               addLine.add("textName", ctx.expr(count++).varName);
               res.add("stat", addLine.render());
            }
            else if(!TabLanParser.formulaVariables.containsKey(element.getValue().get(i).name())){
               addLine.add("textName", "null");
               res.add("stat", addLine.render());
            }
         }
         ST addToFormula = templates.getInstanceOf("addToFormula");

         if(!TabLanParser.formulaVariables.keySet().isEmpty()){
            for (String formula : TabLanParser.formulaVariables.keySet()) {
               List<String> independent = argsFormula.get(formula);
               for (String arg : independent) {
                  addToFormula.add("col", arg);
               }
               addToFormula.add("var", ctx.ID());
               addToFormula.add("colFormula", formula);
               res.add("stat", addToFormula.render());
            }
         }  
      }

      
      
      return res;
   }

   @Override public ST visitAddEmptyLineTable(TabLanParser.AddEmptyLineTableContext ctx) {
      ST res = templates.getInstanceOf("stats");
      int count = 0;

      for(Map.Entry<String, List<Symbol>> element : TabLanParser.tableColumns.entrySet()){
         for (int i = 0; i < element.getValue().size(); i++){
            ST addLine = templates.getInstanceOf("addLineToTable");
            addLine.add("var", ctx.ID());
            addLine.add("colum", element.getValue().get(i).name);
            addLine.add("textName", "null");
            res.add("stat", addLine.render());
         }
      } 
      return res;
   }

   @Override public ST visitTypeCreation(TabLanParser.TypeCreationContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCreateTypeTableNoText(TabLanParser.CreateTypeTableNoTextContext ctx) {
      ST res = templates.getInstanceOf("defineClassTable");
      res.add("classname", ctx.ID());
      inTable = true;
      currentClassCreate = ctx.ID().getText();

      String s = "";
      for(TabLanParser.TableExprContext sc: ctx.tableExpr()){
         s = visit(sc).render();
         if(inFormulaDef){
            res.add("formula", s);
            continue;
         }

         String[] t = s.split(",");
         res.add("var",t[0]);
         res.add("varType",t[1]);
         if(t.length == 3)
            res.add("name",t[2]);
         else if(t.length == 2)
            res.add("name", "\"" + t[0] + "\"");
      }
      return res;
   }

   @Override public ST visitCreateTypeTableText(TabLanParser.CreateTypeTableTextContext ctx) {
      ST res = templates.getInstanceOf("defineClassTable");
      res.add("classname", ctx.ID());
      inTable = true;
      currentClassCreate = ctx.ID().getText();
      
      String s = "";
      for(TabLanParser.TableExprContext sc: ctx.tableExpr()){
         s = visit(sc).render();
         String[] t = s.split(",");
         res.add("var",t[0]);
         res.add("varType",t[1]);
         if(t.length == 3)
            res.add("name",t[2]);
         else if(t.length == 2)
            res.add("name", "\"" + t[0] + "\"");
      }

      res.add("tableHeader", ctx.TEXT());
      return res;
   }

   @Override public ST visitCreateTypeTableInner(TabLanParser.CreateTypeTableInnerContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCreateTypeNumber(TabLanParser.CreateTypeNumberContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTableColum(TabLanParser.TableColumContext ctx){
      if(inFor){
         ST res = templates.getInstanceOf("tableColumWithTranslator");
         res.add("element",ctx.id1.getText());
         res.add("table",tableFor);
         res.add("colunmName",ctx.id2.getText());
         return res;
      }
      ST res = templates.getInstanceOf("tableColum");
      res.add("var",ctx.id1.getText());
      res.add("colum",ctx.id2.getText());
      return res;
   }

   @Override public ST visitTableExprNoText(TabLanParser.TableExprNoTextContext ctx) {
      return visit(ctx.typeDef());
   }

   @Override public ST visitTableExprText(TabLanParser.TableExprTextContext ctx) {
      ST res = visit(ctx.typeDef());
      res.add("name", ctx.TEXT());
      return res;
   }

   @Override public ST visitPrint(TabLanParser.PrintContext ctx) {

      ST res = templates.getInstanceOf("stats");

      ST print;
      if(ctx.p.getText().equals("print"))
         print = templates.getInstanceOf("printnoln");
      else
         print = templates.getInstanceOf("println");

      String value = "";
      for(TabLanParser.ExprContext pc: ctx.expr()){
         res.add("stat", visit(pc).render());

         if(pc == ctx.c)
            continue;

         if(pc.varType.name().equals("double"))
            value = value + String.format("Double.toString(%s)", pc.varName) + "+";
         else if(pc.varType.name().equals("int"))
            value = value + String.format("Integer.toString(%s)", pc.varName) + "+";
         else
            value = value + pc.varName + "+";
      }
      value = value.substring(0, value.length()-1);
      if(ctx.c != null){
         value = String.format("centerString((int)%s,%s)", ctx.c.varName, value);
      }
      print.add("value",value);
      res.add("stat", print.render());
      return res;
   }

   @Override public ST visitForLoop(TabLanParser.ForLoopContext ctx) {
      inFor = true;
      ST res = templates.getInstanceOf("stats");
      ST loop = templates.getInstanceOf("forLoopCreate");
      String id = ctx.ID(0).getText();
      loop.add("element", TabLanParser.symbolTable.get(id).name());
      id = ctx.ID(1).getText();
      loop.add("table", id);
      tableFor = id;
      ST stats = templates.getInstanceOf("stats");
      for(TabLanParser.StatContext sc: ctx.stat()){
         stats.add("stat",visit(sc));
      }
      loop.add("stat",stats.render());
      res.add("stat", loop.render());
      inFor = false;
      return res;
   }

   @Override public ST visitExprRead(TabLanParser.ExprReadContext ctx) {
      ST res = templates.getInstanceOf("readStdInput");
      ctx.varName = newVarName();
      res.add("varType", "String");
      res.add("varName", ctx.varName);
      if(ctx.TEXT() != null){
         res.add("text", ctx.TEXT().getText());
      }
      return res;
   } 

   @Override public ST visitExprIsDef(TabLanParser.ExprIsDefContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   // @Override public ST visitExprNew(TabLanParser.ExprNewContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public ST visitExprLength(TabLanParser.ExprLengthContext ctx) {
      ST res = null;
      //return res;
      if(ctx.expr().varType instanceof ColumnType){
         res = templates.getInstanceOf("declareVar");
         ctx.varName = newVarName();
         res.add("varType", "int");
         res.add("varName", ctx.varName);
         ST columnSize = templates.getInstanceOf("outsideColumnSize");
         String[] name = ctx.expr().varType.name.split("\\.");
         columnSize.add("tableName", name[0]);
         columnSize.add("columnName", name[1]);
         res.add("value", columnSize.render());
      }
      return res;
   }

   @Override public ST visitExprCast(TabLanParser.ExprCastContext ctx) {

      // TODO boolean to int and vice versa?
      
      ctx.varName = newVarName();
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.e).render());

      String castType = ctx.typeExpr().res.name();
      ST cast;

      // if we are converting a numeric value to another numeric value
      if((castType.equals("integer") || castType.equals("real")) && ctx.e.varType.isNumeric())
         cast = templates.getInstanceOf("castNumeric"); 
      else
         cast = templates.getInstanceOf("castString");   
      
      cast.add("castType", ctx.typeExpr().res.name());
      cast.add("varName", ctx.varName);
      cast.add("value", ctx.e.varName);
      res.add("stat", cast.render());   

      return res;
   }

   @Override public ST visitExprVariable(TabLanParser.ExprVariableContext ctx) {
      if(!inTable){
         ST res = templates.getInstanceOf("stats");
         ST decl = templates.getInstanceOf("declareVar");
         String id = ctx.ID().getText();
         ctx.varName = newVarName();
         decl.add("varType", ctx.varType.name());
         decl.add("varName", ctx.varName);
         decl.add("value", TabLanParser.symbolTable.get(id).varName());
         res.add("stat", decl.render());
         return res;
      }
      else{
         ST res = templates.getInstanceOf("stats");
         ST decl = templates.getInstanceOf("declareVar");
         String id = ctx.ID().getText();
         ctx.varName = newVarName();
         decl.add("varType", ctx.varType.name());
         decl.add("varName", ctx.varName);
         for (Symbol sym : TabLanParser.tableColumns.get(currentClassCreate)) {
            if(sym.name().equals(id))
               decl.add("value", sym.varName());
         }
         res.add("stat", decl.render());
         return res;
      }
      
   }

   // @Override public ST visitExprMod(TabLanParser.ExprModContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public ST visitExprSign(TabLanParser.ExprSignContext ctx) { 
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.expr()).render());
      ST decl = templates.getInstanceOf("declareVar");
      ctx.varName = newVarName();
      decl.add("varType", ctx.varType.name());
      decl.add("varName", ctx.varName);
      decl.add("value", ctx.sign.getText()+ctx.expr().varName);
      res.add("stat", decl.render());
      return res;
   }


   @Override public ST visitExprParenthesis(TabLanParser.ExprParenthesisContext ctx) {
      ST res = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return res;
   }

   @Override public ST visitExprInLineIF(TabLanParser.ExprInLineIFContext ctx) {
      ctx.varName = newVarName();
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.e1));
      res.add("stat", visit(ctx.e2));
      res.add("stat", visit(ctx.e3));
      ST inLineIF = templates.getInstanceOf("inLineIF");
      inLineIF.add("varType", ctx.varType);
      inLineIF.add("varName", ctx.varName);
      inLineIF.add("e1", ctx.e1.varName);
      inLineIF.add("e2", ctx.e2.varName);
      inLineIF.add("e3", ctx.e3.varName);
      res.add("stat", inLineIF.render());
      return res;
   }

   @Override public ST visitExprMulDiv(TabLanParser.ExprMulDivContext ctx) {
      ctx.varName = newVarName();
      return opExpression(visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.varType.name(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);
   }

   @Override public ST visitExprAddSub(TabLanParser.ExprAddSubContext ctx) {
      ctx.varName = newVarName();
      return opExpression(visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.varType.name(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);
   }

   @Override public ST visitExprCompare(TabLanParser.ExprCompareContext ctx) {
      ctx.varName = newVarName();
      return opExpression(visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.varType.name(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);
   }

   @Override public ST visitExprInteger(TabLanParser.ExprIntegerContext ctx) {
      ST res = templates.getInstanceOf("declareVar");
      ctx.varName = newVarName();
      res.add("varType", ctx.varType.name());
      res.add("varName", ctx.varName);
      res.add("value", ctx.INTEGER().getText());
      return res;
   }

   @Override public ST visitExprTablecolum(TabLanParser.ExprTablecolumContext ctx) {
      ST res = null;
      if(inFor){
         res = templates.getInstanceOf("declareVar");
         ctx.varName = newVarName();
         String tipo = "";
         for (Symbol s : TabLanParser.tableColumns.get(TabLanParser.symbolTable.get(tableFor).type.name)) {
            if (s.name.equals(ctx.tableColum().id2.getText())){
               tipo = s.type.name;
               break;
            }
         }
         res.add("varType", "Object");
         res.add("varName", ctx.varName);
         res.add("value", "(Object)" + visit(ctx.tableColum()).render());
      }
      return res;
   }


   @Override public ST visitExprReal(TabLanParser.ExprRealContext ctx) {
      ST res = templates.getInstanceOf("declareVar");
      ctx.varName = newVarName();
      res.add("varType", ctx.varType.name());
      res.add("varName", ctx.varName);
      res.add("value", ctx.REAL().getText());
      return res;
   }

   @Override public ST visitExprText(TabLanParser.ExprTextContext ctx) {
      ST res = templates.getInstanceOf("declareVar");
      ctx.varName = newVarName();
      res.add("varType", ctx.varType.name());
      res.add("varName", ctx.varName);
      res.add("value", ctx.TEXT().getText());
      return res;
   }

   @Override public ST visitExprBool(TabLanParser.ExprBoolContext ctx) {
      ST res = templates.getInstanceOf("declareVar");
      ctx.varName = newVarName();
      res.add("varType", ctx.varType.name());
      res.add("varName", ctx.varName);
      ST lb = templates.getInstanceOf("literalBoolean");
      lb.add("value", ctx.BOOLEAN().getText());
      res.add("value", lb.render());
      return res;
   }

   @Override public ST visitExprAddColumn(TabLanParser.ExprAddColumnContext ctx){
      ST res = templates.getInstanceOf("stats");
      ST assign = templates.getInstanceOf("opColumn");
      assign.add("expr", visit(ctx.expr()));
      ctx.varName = newVarName();
      assign.add("newVar", ctx.varName);
      assign.add("columnName", ctx.tableColum().id2.getText());
      assign.add("table", tableFor);
      assign.add("op", ctx.op.getText());
      assign.add("var", ctx.expr().varName);
      assign.add("element", ctx.tableColum().id1.getText());
      res.add("stat", assign.render());
      return res;

   }

   protected ST opExpression(String e1Stats, String e2Stats, String varType, String varName, String e1Var, String op, String e2Var) {
      ST res = templates.getInstanceOf("opExpression");
      res.add("stat", e1Stats);
      res.add("stat", e2Stats);
      res.add("varType", varType);
      res.add("varName", varName);
      res.add("e1", e1Var);
      res.add("op", translateOp(op));
      res.add("e2", e2Var);
      return res;
   }

   protected String translateOp(String op) {
      String res = op;
      switch(op) {
         case "\\\\":
            res = "%";
            break;
         case "=":
            res = "==";
            break;
         // case "/=":
         //    res = "!=";
         //    break;
      }
      return res;
   }

   // @Override public ST visitReadStdio(TabLanParser.ReadStdioContext ctx) {
   //    ST res = templates.getInstanceOf("readStdInput");
   //    ctx.varName = newVarName();
   //    res.add("varType", ctx.varType.name());
   //    res.add("varName", ctx.varName);
   //    return res;
   // }

   // @Override public ST visitReadFromFile(TabLanParser.ReadFromFileContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public ST visitReadDataUsing(TabLanParser.ReadDataUsingContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public ST visitReadData(TabLanParser.ReadDataContext ctx) {
   //    ST res = templates.getInstanceOf("readStdInput");
   //    ctx.varName = newVarName();
   //    res.add("varType", "String");
   //    res.add("varName", ctx.varName);
   //    return res;
   // }

   List<String> renamedColumns = new ArrayList<>();

   // TODO rename the headers of the tables based on the 'howToRead'
   @Override public ST visitAssignmentReadFile(TabLanParser.AssignmentReadFileContext ctx) {
      ST res = templates.getInstanceOf("stats");
      renamedColumns.clear();

      res.add("stat", visit(ctx.readFile()).render());

      String var = ctx.ID().getText();
      ST assign_new = templates.getInstanceOf("assignNew");
      String id = ctx.ID().getText();
      Symbol s = TabLanParser.symbolTable.get(var);
      assign_new.add("var", s.varName());
      assign_new.add("type", s.type());
      res.add("stat", assign_new);
      int index = 0;
      List<Symbol> columns = TabLanParser.tableColumns.get(TabLanParser.symbolTable.get(var).type().toString());
      for (Symbol column : columns) {
         String list;
         if(renamedColumns.isEmpty())
            list = String.format("%s.get(\"%s\")", ctx.readFile().varName, column.name());
         else
            list = String.format("%s.get(\"%s\")", ctx.readFile().varName, renamedColumns.get(index++));

         if(!column.type().isText()){
            String varName = newVarName();

            ST declare = templates.getInstanceOf("declareList");
            declare.add("varType", column.type.toString());
            declare.add("varName", varName);
            res.add("stat", declare);

            ST convert = templates.getInstanceOf("convertList");
            convert.add("list", list);
            convert.add("from", "String");
            convert.add("to", column.type().toString());
            convert.add("newList", varName);
            res.add("stat", convert);

            list = varName;
         }
         ST assign = templates.getInstanceOf("justAssign");
         assign.add("var", String.format("%s.%s", var, column.name()));
         assign.add("value", list);
         res.add("stat", assign);
      }
      return res;
   }

   @Override public ST visitReadFile(TabLanParser.ReadFileContext ctx) {
      ST res = templates.getInstanceOf("stats");
      ST read = templates.getInstanceOf("readFile");
      ctx.varName = newFileName();
      read.add("name", ctx.varName);
      read.add("file", ctx.TEXT().getText());
      res.add("stat",read);

      if(ctx.howToRead() != null){
         res.add("stat", visit(ctx.howToRead()).render());
      }

      return res;
   }

   // @Override public ST visitReadTableUsingSep(TabLanParser.ReadTableUsingSepContext ctx) {
   //    ST res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   @Override public ST visitReadAs(TabLanParser.ReadAsContext ctx) {
      ST res = templates.getInstanceOf("stats");

      ST replace = templates.getInstanceOf("replaceKey");
      replace.add("old", ctx.TEXT().getText().replace("\"", ""));
      replace.add("map", lastFileName());
      replace.add("new", ctx.ID().getText());
      renamedColumns.add(ctx.ID().getText());
      res.add("stat", replace);

      if(ctx.howToRead() != null){
         for(TabLanParser.HowToReadContext htr : ctx.howToRead())
            res.add("stat", visit(htr).render());
      }
      return res;
   }

   @Override public ST visitReadAsAppend(TabLanParser.ReadAsAppendContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitReadColumn(TabLanParser.ReadColumnContext ctx) {
      ST res = templates.getInstanceOf("stats");

      ST replace = templates.getInstanceOf("replaceKey");
      replace.add("old", "placeholder"+Integer.parseInt(ctx.INTEGER().getText()));
      replace.add("map", lastFileName());
      replace.add("new", ctx.ID().getText());
      renamedColumns.add(ctx.ID().getText());
      res.add("stat", replace);

      if(ctx.howToRead() != null){
         for(TabLanParser.HowToReadContext htr : ctx.howToRead())
            res.add("stat", visit(htr).render());
      }

      return res;
   }

   @Override public ST visitReadSeparator(TabLanParser.ReadSeparatorContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

}