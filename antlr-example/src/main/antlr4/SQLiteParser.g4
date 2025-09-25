/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
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
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project : sqlite-parser; an ANTLR4 grammar for SQLite https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 * Modified for demonstration purposes - Added semantic actions and command counting
 */

// $antlr-format alignTrailingComments on, columnLimit 130, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments off
// $antlr-format useTab off, allowShortRulesOnASingleLine off, allowShortBlocksOnASingleLine on, alignSemicolons ownLine

parser grammar SQLiteParser;

@header {
    package com.example;
    import java.util.ArrayList;
    import java.util.List;
}

options {
    tokenVocab = SQLiteLexer;
}

@parser::members {
    public static class CommandCounter {
        public int selectCount = 0;
        public int insertCount = 0;
        public int updateCount = 0;
        public int deleteCount = 0;
        public int createCount = 0;
        public int dropCount = 0;
        
        public void printSummary() {
            System.out.println("=== Command Summary ===");
            System.out.println("SELECT statements: " + selectCount);
            System.out.println("INSERT statements: " + insertCount);
            System.out.println("UPDATE statements: " + updateCount);
            System.out.println("DELETE statements: " + deleteCount);
            System.out.println("CREATE statements: " + createCount);
            System.out.println("DROP statements: " + dropCount);
            System.out.println("Total commands: " + (selectCount + insertCount + updateCount + deleteCount + createCount + dropCount));
        }
    }
    
    public CommandCounter counter = new CommandCounter();
}

// Regra inicial
parse
    : sql_stmt_list* EOF { counter.printSummary(); }
;

sql_stmt_list
    : SCOL* sql_stmt (SCOL+ sql_stmt)* SCOL*
;

sql_stmt
    : ( select_stmt
      | insert_stmt  
      | update_stmt
      | delete_stmt
      | create_table_stmt
      | create_index_stmt
      | drop_stmt
      | pragma_stmt
      | explain_stmt
    )
;

// Comandos SELECT
select_stmt
    : SELECT_ { counter.selectCount++; System.out.println("Parser: Processing SELECT statement #" + counter.selectCount); }
      (DISTINCT_)? 
      result_column (COMMA result_column)*
      (FROM_ table_or_subquery (COMMA table_or_subquery)*)?
      (WHERE_ expr)?
      (GROUP_ BY_ expr (COMMA expr)* (HAVING_ expr)?)?
      (ORDER_ BY_ ordering_term (COMMA ordering_term)*)?
      (LIMIT_ expr (OFFSET_ expr)?)?
;

// Comandos INSERT
insert_stmt
    : INSERT_ { counter.insertCount++; System.out.println("Parser: Processing INSERT statement #" + counter.insertCount); }
      INTO_ table_name 
      (OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR)?
      (VALUES_ OPEN_PAR expr (COMMA expr)* CLOSE_PAR (COMMA OPEN_PAR expr (COMMA expr)* CLOSE_PAR)*
      | select_stmt)
;

// Comandos UPDATE
update_stmt
    : UPDATE_ { counter.updateCount++; System.out.println("Parser: Processing UPDATE statement #" + counter.updateCount); }
      table_name 
      SET_ column_name ASSIGN expr (COMMA column_name ASSIGN expr)*
      (WHERE_ expr)?
;

// Comandos DELETE
delete_stmt
    : DELETE_ { counter.deleteCount++; System.out.println("Parser: Processing DELETE statement #" + counter.deleteCount); }
      FROM_ table_name 
      (WHERE_ expr)?
;

// Comandos CREATE TABLE
create_table_stmt
    : CREATE_ { counter.createCount++; System.out.println("Parser: Processing CREATE statement #" + counter.createCount); }
      (TEMPORARY_ | TEMP_)? 
      TABLE_ 
      (IF_ NOT_ EXISTS_)?
      table_name 
      (OPEN_PAR column_def (COMMA column_def)* (COMMA table_constraint)* CLOSE_PAR
      | AS_ select_stmt)
;

// Comandos CREATE INDEX
create_index_stmt
    : CREATE_ 
      (UNIQUE_)? 
      INDEX_ 
      (IF_ NOT_ EXISTS_)?
      index_name 
      ON_ table_name OPEN_PAR indexed_column (COMMA indexed_column)* CLOSE_PAR
      (WHERE_ expr)?
;

// Comandos DROP
drop_stmt
    : DROP_ { counter.dropCount++; System.out.println("Parser: Processing DROP statement #" + counter.dropCount); }
      (TABLE_ | INDEX_ | VIEW_ | TRIGGER_) 
      (IF_ EXISTS_)?
      (schema_name DOT)? object_name
;

// PRAGMA
pragma_stmt
    : PRAGMA_ schema_name? DOT? pragma_name (ASSIGN pragma_value | OPEN_PAR pragma_value CLOSE_PAR)?
;

// EXPLAIN
explain_stmt
    : EXPLAIN_ (QUERY_ PLAN_)? sql_stmt
;

// Definições auxiliares
column_def
    : column_name type_name? column_constraint*
;

column_constraint
    : (CONSTRAINT_ constraint_name)?
      ( PRIMARY_ KEY_ (ASC_ | DESC_)? conflict_clause? (AUTOINCREMENT_)?
      | NOT_ NULL_ conflict_clause?
      | UNIQUE_ conflict_clause?
      | CHECK_ OPEN_PAR expr CLOSE_PAR
      | DEFAULT_ (signed_number | literal_value | OPEN_PAR expr CLOSE_PAR)
      | COLLATE_ collation_name
      | foreign_key_clause
      )
;

table_constraint
    : (CONSTRAINT_ constraint_name)?
      ( (PRIMARY_ KEY_ | UNIQUE_) OPEN_PAR indexed_column (COMMA indexed_column)* CLOSE_PAR conflict_clause?
      | CHECK_ OPEN_PAR expr CLOSE_PAR
      | FOREIGN_ KEY_ OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR foreign_key_clause
      )
;

foreign_key_clause
    : REFERENCES_ foreign_table (OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR)?
      (ON_ (DELETE_ | UPDATE_) (SET_ NULL_ | SET_ DEFAULT_ | CASCADE_ | RESTRICT_ | NO_ ACTION_))*
      (NOT_? DEFERRABLE_ (INITIALLY_ (DEFERRED_ | IMMEDIATE_))?)?
;

conflict_clause
    : ON_ CONFLICT_ (ROLLBACK_KW_ | ABORT_ | FAIL_ | IGNORE_ | REPLACE_)
;

result_column
    : STAR
    | table_name DOT STAR
    | expr (AS_? column_alias)?
;

table_or_subquery
    : (schema_name DOT)? table_name (AS_? table_alias)?
      (INDEXED_ BY_ index_name | NOT_ INDEXED_)?
    | OPEN_PAR (table_or_subquery (COMMA table_or_subquery)* | join_clause) CLOSE_PAR
    | OPEN_PAR select_stmt CLOSE_PAR (AS_? table_alias)?
;

join_clause
    : table_or_subquery (join_operator table_or_subquery join_constraint)*
;

join_operator
    : COMMA
    | NATURAL_? (LEFT_ OUTER_? | INNER_ | CROSS_)? JOIN_
;

join_constraint
    : ON_ expr
    | USING_ OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR
    |
;

ordering_term
    : expr (COLLATE_ collation_name)? (ASC_ | DESC_)? (NULLS_ (FIRST_ | LAST_))?
;

indexed_column
    : (column_name | expr) (COLLATE_ collation_name)? (ASC_ | DESC_)?
;

// Expressões
expr
    : literal_value
    | bind_parameter
    | ((schema_name DOT)? table_name DOT)? column_name
    | unary_operator expr
    | expr binary_operator expr
    | function_name OPEN_PAR ((DISTINCT_)? expr (COMMA expr)*)? CLOSE_PAR
    | OPEN_PAR expr CLOSE_PAR
    | CASE_ expr? (WHEN_ expr THEN_ expr)+ (ELSE_ expr)? END_
    | EXISTS_ OPEN_PAR select_stmt CLOSE_PAR
    | NOT_ EXISTS_ OPEN_PAR select_stmt CLOSE_PAR
    | expr NOT_? IN_ OPEN_PAR (select_stmt | expr (COMMA expr)*) CLOSE_PAR
    | expr NOT_? BETWEEN_ expr AND_ expr
    | expr NOT_? LIKE_ expr (ESCAPE_ expr)?
    | expr IS_ NOT_? expr
;

literal_value
    : NUMERIC_LITERAL
    | STRING_LITERAL
    | BLOB_LITERAL
    | NULL_
    | TRUE_
    | FALSE_
;

unary_operator
    : MINUS | PLUS | TILDE | NOT_
;

binary_operator
    : PIPE2 | STAR | DIV | MOD | PLUS | MINUS | LT2 | GT2 | AMP | PIPE
    | LT | LT_EQ | GT | GT_EQ | ASSIGN | EQ | NOT_EQ1 | NOT_EQ2 | IS_
    | AND_ | OR_ | LIKE_ | GLOB_ | MATCH_ | REGEXP_
;

// Nomes e identificadores
schema_name: any_name;
table_name: any_name;
column_name: any_name;
index_name: any_name;
trigger_name: any_name;
view_name: any_name;
module_name: any_name;
pragma_name: any_name;
savepoint_name: any_name;
table_alias: any_name;
transaction_name: any_name;
column_alias: any_name;
constraint_name: any_name;
collation_name: any_name;
foreign_table: any_name;
function_name: any_name;
object_name: any_name;

any_name
    : IDENTIFIER
    | keyword
    | STRING_LITERAL
    | OPEN_PAR any_name CLOSE_PAR
;

keyword
    : SELECT_ | FROM_ | WHERE_ | INSERT_ | UPDATE_ | DELETE_ | CREATE_ | DROP_
    | TABLE_ | INTO_ | VALUES_ | SET_ | AND_ | OR_ | NOT_ | NULL_ | TRUE_ | FALSE_
    | IS_ | IN_ | LIKE_ | BETWEEN_ | ORDER_ | BY_ | GROUP_ | HAVING_ | LIMIT_
    | OFFSET_ | ASC_ | DESC_ | DISTINCT_ | AS_ | ON_ | JOIN_ | LEFT_ | RIGHT_
    | INNER_ | OUTER_ | UNION_ | ALL_ | EXISTS_ | CASE_ | WHEN_ | THEN_ | ELSE_
    | END_ | PRIMARY_ | KEY_ | FOREIGN_ | REFERENCES_ | CONSTRAINT_ | UNIQUE_
    | CHECK_ | DEFAULT_ | AUTOINCREMENT_ | INDEX_ | VIEW_ | TRIGGER_
;

type_name
    : name+
;

name
    : any_name
;

signed_number
    : (PLUS | MINUS)? NUMERIC_LITERAL
;

bind_parameter
    : BIND_PARAMETER
;

pragma_value
    : signed_number
    | name
    | STRING_LITERAL
;