grammar TabLan;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    static protected Map<String, Symbol> symbolTable = new HashMap<>();
    static protected Map<String, List<Symbol>> tableColumns = new HashMap<>(); // classe (Ex: aTable) -> lista de colunas
    static protected Map<String, Type> typeTable = new HashMap<>();
    static protected Map<String,List<Symbol>> formulaVariables = new HashMap<>();
}


program: (stat? ';')* EOF;
    
stat: assignment            // t := new   c := 1   c:=c+1;
    | forLoop
    | typeDef               // t: ATable;
    | typeCreation          // type table ATable{...};
    | headerAssignment      // t -> "Table:"; or t.column -> "column:"
    | addLine               // ["One", c] >> t;
    | print
    | remove
    | expr                  // this probably shouldn't be here 
    ;


assignment: ID ':= new' ('(' tableColum ')')*   #assignmentNew
          | ID ':=' tableColum    #assignmentView
          | ID ':=' expr ('when' expr)?         #assignmentID
          | tableColum ':=' expr                #assignmentColumn
          | ID ':=' readFile                #assignmentReadFile
          ;

typeDef: 'unique'? ID ':' typeExpr               #typeDefNoExpr
        |'unique'? ID ':' typeExpr ':=' expr     #typeDefWithExpr
        ;

typeExpr returns[Type res]: 
    'integer' {$res = new IntegerType();}       #typeInt
   | 'real'    {$res = new RealType();}         #typeReal
   | 'boolean' {$res = new BooleanType();}      #typeBool
   | 'text'     {$res = new TextType();}        #typeText
   | ID                                         #typeId
   ;

remove: 'remove' expr ('when' expr)?
      ;

headerAssignment: tableColum '->' TEXT  #headerColumnAssignment
                | ID '->' TEXT          #headerTableAssignment
                ;

addLine: '[' expr (',' expr)* ']' '>>' ID        #addLineTable
        | '[]' '>>' ID                      #addEmptyLineTable
       ;

typeCreation: createTypeTable
            | createTypeNumber
            ;
            
createTypeTable: 'type' 'table' ID '{' tableExpr* '}'       #createTypeTableNoText
                | 'type' 'table' ID '->' TEXT '{' tableExpr* '}'  #createTypeTableText
                | 'type' 'table' ID '(' ID ':' ID (',' ID ':' ID)?')' '{' tableExpr* '}' #createTypeTableInner
                ;

createTypeNumber: 'type' ID ID '{' 'invariant'? expr ('and' expr)* ',' expr ';' '}'
                ;

tableExpr: typeDef ';'                #tableExprNoText
         | typeDef '->' TEXT ';'   #tableExprText
         ;

print: p=('print'|'println') expr (',' expr)* ('center' c=expr)?;

forLoop: 'for' ID 'in' ID 'do' (stat ';')+ 'end'
        ;
    
expr returns[Type varType, String varName]:  
      sign=('+'|'-') e=expr                         #exprSign
    | 'length' expr                          #exprLength
    | e1=tableColum op=('+'|'-') e2=expr           #exprAddColumn
    | e1=expr op=('*' | '/' | '\\\\') e2=expr    #exprMulDiv
    | e1=expr op=('+' | '-') e2=expr             #exprAddSub
    | e1=expr op=('='|'>='|'<='|'>'|'<') e2=expr #exprCompare
    //| 'new' (expr)?                              #exprNew
    | typeExpr '(' e=expr ')'                            #exprCast
    | 'read' 'in' TEXT?                    #exprRead
    | '(' e=expr ')'                               #exprParenthesis
    | 'isdef' '(' ID ')'                   #exprIsDef
    | e1=expr '?' e2=expr ':' e3=expr                     #exprInLineIF
    | INTEGER                                    #exprInteger
    | REAL                                       #exprReal
    | TEXT                                       #exprText
    | BOOLEAN                                    #exprBool
    | ID                                   #exprVariable
    | tableColum                            #exprTablecolum
    ;

tableColum: id1=ID '.' id2=ID;

read: readFile                                                  
    | howToRead                                        
    ;

readFile returns[String varName]: 'read' TEXT ('using' howToRead)?;

howToRead: TEXT 'as' ID (',' howToRead)*                #readAs
    |      TEXT 'as' ID '>>' ID (',' howToRead)*        #readAsAppend
    |      'column' INTEGER 'as' ID (',' howToRead)*    #readColumn
    |      'separator' TEXT (',' howToRead)*            #readSeparator
    ;    


//Tokens
TEXT: '"' .*? '"';

// table type
VARTYPE: ('integer'|'real'|'text'|'boolean');
BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: [0-9]+ ;
REAL: [0-9]+ '.' [0-9]* ;

// skip
WS: [ \t\n\r]+ -> skip ;
COMMENT: '--' .*? ('\n'|EOF) -> skip ;
ERROR: .; //Reconhecer tokens inválidos
