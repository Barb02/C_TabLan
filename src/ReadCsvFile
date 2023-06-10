grammar ReadCsvFile;

program: (header line* | line+ ) EOF;

header: (TEXT SEPARATOR+)* TEXT NewLine;

line: (field SEPARATOR+)* field  NewLine;

field: TEXT | ID;

// Tokens
TEXT: [a-zA-Z][a-zA-Z_0-9]+;
ID: [ a-zA-Z_0-9'.()-]+;
SEPARATOR: (',' | ';');
NewLine: '\r'? '\n';
WS: [ \t\n\r]+ -> skip ;
ERROR: .; // Reconhecer tokens inválidos
