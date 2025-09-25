/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 by Martin Mirchev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project : sqlite-parser; an ANTLR4 grammar for SQLite https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 * Modified for demonstration purposes - Added semantic actions and command counting
 */

// $antlr-format alignTrailingComments on, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments off, useTab off
// $antlr-format allowShortRulesOnASingleLine on, alignSemicolons ownLine

lexer grammar SQLiteLexer;

@header {
    package com.example;
}

options {
    caseInsensitive = true;
}

// Símbolos
SCOL      : ';' { System.out.println("Lexer: Found semicolon"); };
DOT       : '.';
OPEN_PAR  : '(';
CLOSE_PAR : ')';
COMMA     : ',';
ASSIGN    : '=';
STAR      : '*';
PLUS      : '+';
MINUS     : '-';
TILDE     : '~';
PIPE2     : '||';
DIV       : '/';
MOD       : '%';
LT2       : '<<';
GT2       : '>>';
AMP       : '&';
PIPE      : '|';
LT        : '<';
LT_EQ     : '<=';
GT        : '>';
GT_EQ     : '>=';
EQ        : '==';
NOT_EQ1   : '!=';
NOT_EQ2   : '<>';

// Palavras-chave SQLite
SELECT_            : 'SELECT' { System.out.println("Lexer: Found SELECT command"); };
FROM_              : 'FROM';
WHERE_             : 'WHERE';
INSERT_            : 'INSERT' { System.out.println("Lexer: Found INSERT command"); };
UPDATE_            : 'UPDATE' { System.out.println("Lexer: Found UPDATE command"); };
DELETE_            : 'DELETE' { System.out.println("Lexer: Found DELETE command"); };
CREATE_            : 'CREATE' { System.out.println("Lexer: Found CREATE command"); };
DROP_              : 'DROP' { System.out.println("Lexer: Found DROP command"); };
TABLE_             : 'TABLE';
INTO_              : 'INTO';
VALUES_            : 'VALUES';
SET_               : 'SET';
AND_               : 'AND';
OR_                : 'OR';
NOT_               : 'NOT';
NULL_              : 'NULL';
TRUE_              : 'TRUE';
FALSE_             : 'FALSE';
IS_                : 'IS';
IN_                : 'IN';
LIKE_              : 'LIKE';
BETWEEN_           : 'BETWEEN';
ORDER_             : 'ORDER';
BY_                : 'BY';
GROUP_             : 'GROUP';
HAVING_            : 'HAVING';
LIMIT_             : 'LIMIT';
OFFSET_            : 'OFFSET';
ASC_               : 'ASC';
DESC_              : 'DESC';
DISTINCT_          : 'DISTINCT';
AS_                : 'AS';
ON_                : 'ON';
JOIN_              : 'JOIN';
LEFT_              : 'LEFT';
RIGHT_             : 'RIGHT';
INNER_             : 'INNER';
OUTER_             : 'OUTER';
UNION_             : 'UNION';
ALL_               : 'ALL';
EXISTS_            : 'EXISTS';
CASE_              : 'CASE';
WHEN_              : 'WHEN';
THEN_              : 'THEN';
ELSE_              : 'ELSE';
END_               : 'END';
PRIMARY_           : 'PRIMARY';
KEY_               : 'KEY';
FOREIGN_           : 'FOREIGN';
REFERENCES_        : 'REFERENCES';
CONSTRAINT_        : 'CONSTRAINT';
UNIQUE_            : 'UNIQUE';
CHECK_             : 'CHECK';
DEFAULT_           : 'DEFAULT';
AUTOINCREMENT_     : 'AUTOINCREMENT';
INDEX_             : 'INDEX';
VIEW_              : 'VIEW';
TRIGGER_           : 'TRIGGER';
PROCEDURE_         : 'PROCEDURE';
FUNCTION_          : 'FUNCTION';
RETURN_            : 'RETURN';
IF_                : 'IF';
DECLARE_           : 'DECLARE';
BEGIN_             : 'BEGIN';
COMMIT_            : 'COMMIT';
ROLLBACK_          : 'ROLLBACK';
TRANSACTION_       : 'TRANSACTION';
SAVEPOINT_         : 'SAVEPOINT';
RELEASE_           : 'RELEASE';
PRAGMA_            : 'PRAGMA';
VACUUM_            : 'VACUUM';
REINDEX_           : 'REINDEX';
ANALYZE_           : 'ANALYZE';
EXPLAIN_           : 'EXPLAIN';
QUERY_             : 'QUERY';
PLAN_              : 'PLAN';
ALTER_             : 'ALTER';
ADD_               : 'ADD';
COLUMN_            : 'COLUMN';
RENAME_            : 'RENAME';
TO_                : 'TO';
DATABASE_          : 'DATABASE';
SCHEMA_            : 'SCHEMA';
ATTACH_            : 'ATTACH';
DETACH_            : 'DETACH';
TEMPORARY_         : 'TEMPORARY';
TEMP_              : 'TEMP';
VIRTUAL_           : 'VIRTUAL';
WITHOUT_           : 'WITHOUT';
WITH_              : 'WITH';
RECURSIVE_         : 'RECURSIVE';
REPLACE_           : 'REPLACE';
ABORT_             : 'ABORT';
FAIL_              : 'FAIL';
IGNORE_            : 'IGNORE';
ROLLBACK_KW_       : 'ROLLBACK';
CASCADE_           : 'CASCADE';
RESTRICT_          : 'RESTRICT';
NO_                : 'NO';
ACTION_            : 'ACTION';
MATCH_             : 'MATCH';
FULL_              : 'FULL';
PARTIAL_           : 'PARTIAL';
SIMPLE_            : 'SIMPLE';
DEFERRABLE_        : 'DEFERRABLE';
DEFERRED_          : 'DEFERRED';
IMMEDIATE_         : 'IMMEDIATE';
INITIALLY_         : 'INITIALLY';
EXCLUSIVE_         : 'EXCLUSIVE';
COLLATE_           : 'COLLATE';
CONFLICT_          : 'CONFLICT';
INDEXED_           : 'INDEXED';
NATURAL_           : 'NATURAL';
CROSS_             : 'CROSS';
USING_             : 'USING';
NULLS_             : 'NULLS';
FIRST_             : 'FIRST';
LAST_              : 'LAST';
ESCAPE_            : 'ESCAPE';
GLOB_              : 'GLOB';
REGEXP_            : 'REGEXP';

// Tipos de dados
INTEGER_TYPE       : 'INTEGER';
REAL_TYPE          : 'REAL';
TEXT_TYPE          : 'TEXT';
BLOB_TYPE          : 'BLOB';
NUMERIC_TYPE       : 'NUMERIC';
VARCHAR_TYPE       : 'VARCHAR';
CHAR_TYPE          : 'CHAR';
DATE_TYPE          : 'DATE';
DATETIME_TYPE      : 'DATETIME';
TIME_TYPE          : 'TIME';
TIMESTAMP_TYPE     : 'TIMESTAMP';

// Identificadores e literais
IDENTIFIER:
    '"' (~'"' | '""')* '"'
    | '`' (~'`' | '``')* '`'
    | '[' ~']'* ']'
    | [A-Z_] [A-Z_0-9]*
;

NUMERIC_LITERAL: 
    ((DIGIT+ ('.' DIGIT*)?) | ('.' DIGIT+)) ('E' [-+]? DIGIT+)? 
    | '0x' HEX_DIGIT+
;

BIND_PARAMETER: '?' DIGIT* | [:@$] IDENTIFIER;

STRING_LITERAL: '\'' ( ~'\'' | '\'\'')* '\'';

BLOB_LITERAL: 'X' STRING_LITERAL;

// Comentários
SINGLE_LINE_COMMENT: '--' ~[\r\n]* (('\r'? '\n') | EOF) -> channel(HIDDEN);

MULTILINE_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);

// Espaços em branco
SPACES: [ \u000B\t\r\n] -> channel(HIDDEN);

UNEXPECTED_CHAR: .;

fragment HEX_DIGIT : [0-9A-F];
fragment DIGIT     : [0-9];