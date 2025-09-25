// Generated from SQLiteParser.g4 by ANTLR 4.9.3

    package com.example;
    import java.util.ArrayList;
    import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, SELECT_=25, 
		FROM_=26, WHERE_=27, INSERT_=28, UPDATE_=29, DELETE_=30, CREATE_=31, DROP_=32, 
		TABLE_=33, INTO_=34, VALUES_=35, SET_=36, AND_=37, OR_=38, NOT_=39, NULL_=40, 
		TRUE_=41, FALSE_=42, IS_=43, IN_=44, LIKE_=45, BETWEEN_=46, ORDER_=47, 
		BY_=48, GROUP_=49, HAVING_=50, LIMIT_=51, OFFSET_=52, ASC_=53, DESC_=54, 
		DISTINCT_=55, AS_=56, ON_=57, JOIN_=58, LEFT_=59, RIGHT_=60, INNER_=61, 
		OUTER_=62, UNION_=63, ALL_=64, EXISTS_=65, CASE_=66, WHEN_=67, THEN_=68, 
		ELSE_=69, END_=70, PRIMARY_=71, KEY_=72, FOREIGN_=73, REFERENCES_=74, 
		CONSTRAINT_=75, UNIQUE_=76, CHECK_=77, DEFAULT_=78, AUTOINCREMENT_=79, 
		INDEX_=80, VIEW_=81, TRIGGER_=82, PROCEDURE_=83, FUNCTION_=84, RETURN_=85, 
		IF_=86, DECLARE_=87, BEGIN_=88, COMMIT_=89, ROLLBACK_=90, TRANSACTION_=91, 
		SAVEPOINT_=92, RELEASE_=93, PRAGMA_=94, VACUUM_=95, REINDEX_=96, ANALYZE_=97, 
		EXPLAIN_=98, QUERY_=99, PLAN_=100, ALTER_=101, ADD_=102, COLUMN_=103, 
		RENAME_=104, TO_=105, DATABASE_=106, SCHEMA_=107, ATTACH_=108, DETACH_=109, 
		TEMPORARY_=110, TEMP_=111, VIRTUAL_=112, WITHOUT_=113, WITH_=114, RECURSIVE_=115, 
		REPLACE_=116, ABORT_=117, FAIL_=118, IGNORE_=119, ROLLBACK_KW_=120, CASCADE_=121, 
		RESTRICT_=122, NO_=123, ACTION_=124, MATCH_=125, FULL_=126, PARTIAL_=127, 
		SIMPLE_=128, DEFERRABLE_=129, DEFERRED_=130, IMMEDIATE_=131, INITIALLY_=132, 
		EXCLUSIVE_=133, COLLATE_=134, CONFLICT_=135, INDEXED_=136, NATURAL_=137, 
		CROSS_=138, USING_=139, NULLS_=140, FIRST_=141, LAST_=142, ESCAPE_=143, 
		GLOB_=144, REGEXP_=145, INTEGER_TYPE=146, REAL_TYPE=147, TEXT_TYPE=148, 
		BLOB_TYPE=149, NUMERIC_TYPE=150, VARCHAR_TYPE=151, CHAR_TYPE=152, DATE_TYPE=153, 
		DATETIME_TYPE=154, TIME_TYPE=155, TIMESTAMP_TYPE=156, IDENTIFIER=157, 
		NUMERIC_LITERAL=158, BIND_PARAMETER=159, STRING_LITERAL=160, BLOB_LITERAL=161, 
		SINGLE_LINE_COMMENT=162, MULTILINE_COMMENT=163, SPACES=164, UNEXPECTED_CHAR=165;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_select_stmt = 3, 
		RULE_insert_stmt = 4, RULE_update_stmt = 5, RULE_delete_stmt = 6, RULE_create_table_stmt = 7, 
		RULE_create_index_stmt = 8, RULE_drop_stmt = 9, RULE_pragma_stmt = 10, 
		RULE_explain_stmt = 11, RULE_column_def = 12, RULE_column_constraint = 13, 
		RULE_table_constraint = 14, RULE_foreign_key_clause = 15, RULE_conflict_clause = 16, 
		RULE_result_column = 17, RULE_table_or_subquery = 18, RULE_join_clause = 19, 
		RULE_join_operator = 20, RULE_join_constraint = 21, RULE_ordering_term = 22, 
		RULE_indexed_column = 23, RULE_expr = 24, RULE_literal_value = 25, RULE_unary_operator = 26, 
		RULE_binary_operator = 27, RULE_schema_name = 28, RULE_table_name = 29, 
		RULE_column_name = 30, RULE_index_name = 31, RULE_trigger_name = 32, RULE_view_name = 33, 
		RULE_module_name = 34, RULE_pragma_name = 35, RULE_savepoint_name = 36, 
		RULE_table_alias = 37, RULE_transaction_name = 38, RULE_column_alias = 39, 
		RULE_constraint_name = 40, RULE_collation_name = 41, RULE_foreign_table = 42, 
		RULE_function_name = 43, RULE_object_name = 44, RULE_any_name = 45, RULE_keyword = 46, 
		RULE_type_name = 47, RULE_name = 48, RULE_signed_number = 49, RULE_bind_parameter = 50, 
		RULE_pragma_value = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "select_stmt", "insert_stmt", "update_stmt", 
			"delete_stmt", "create_table_stmt", "create_index_stmt", "drop_stmt", 
			"pragma_stmt", "explain_stmt", "column_def", "column_constraint", "table_constraint", 
			"foreign_key_clause", "conflict_clause", "result_column", "table_or_subquery", 
			"join_clause", "join_operator", "join_constraint", "ordering_term", "indexed_column", 
			"expr", "literal_value", "unary_operator", "binary_operator", "schema_name", 
			"table_name", "column_name", "index_name", "trigger_name", "view_name", 
			"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name", 
			"column_alias", "constraint_name", "collation_name", "foreign_table", 
			"function_name", "object_name", "any_name", "keyword", "type_name", "name", 
			"signed_number", "bind_parameter", "pragma_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'SELECT'", "'FROM'", "'WHERE'", 
			"'INSERT'", "'UPDATE'", "'DELETE'", "'CREATE'", "'DROP'", "'TABLE'", 
			"'INTO'", "'VALUES'", "'SET'", "'AND'", "'OR'", "'NOT'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'IS'", "'IN'", "'LIKE'", "'BETWEEN'", "'ORDER'", "'BY'", 
			"'GROUP'", "'HAVING'", "'LIMIT'", "'OFFSET'", "'ASC'", "'DESC'", "'DISTINCT'", 
			"'AS'", "'ON'", "'JOIN'", "'LEFT'", "'RIGHT'", "'INNER'", "'OUTER'", 
			"'UNION'", "'ALL'", "'EXISTS'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
			"'END'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'CONSTRAINT'", 
			"'UNIQUE'", "'CHECK'", "'DEFAULT'", "'AUTOINCREMENT'", "'INDEX'", "'VIEW'", 
			"'TRIGGER'", "'PROCEDURE'", "'FUNCTION'", "'RETURN'", "'IF'", "'DECLARE'", 
			"'BEGIN'", "'COMMIT'", null, "'TRANSACTION'", "'SAVEPOINT'", "'RELEASE'", 
			"'PRAGMA'", "'VACUUM'", "'REINDEX'", "'ANALYZE'", "'EXPLAIN'", "'QUERY'", 
			"'PLAN'", "'ALTER'", "'ADD'", "'COLUMN'", "'RENAME'", "'TO'", "'DATABASE'", 
			"'SCHEMA'", "'ATTACH'", "'DETACH'", "'TEMPORARY'", "'TEMP'", "'VIRTUAL'", 
			"'WITHOUT'", "'WITH'", "'RECURSIVE'", "'REPLACE'", "'ABORT'", "'FAIL'", 
			"'IGNORE'", null, "'CASCADE'", "'RESTRICT'", "'NO'", "'ACTION'", "'MATCH'", 
			"'FULL'", "'PARTIAL'", "'SIMPLE'", "'DEFERRABLE'", "'DEFERRED'", "'IMMEDIATE'", 
			"'INITIALLY'", "'EXCLUSIVE'", "'COLLATE'", "'CONFLICT'", "'INDEXED'", 
			"'NATURAL'", "'CROSS'", "'USING'", "'NULLS'", "'FIRST'", "'LAST'", "'ESCAPE'", 
			"'GLOB'", "'REGEXP'", "'INTEGER'", "'REAL'", "'TEXT'", "'BLOB'", "'NUMERIC'", 
			"'VARCHAR'", "'CHAR'", "'DATE'", "'DATETIME'", "'TIME'", "'TIMESTAMP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "SELECT_", 
			"FROM_", "WHERE_", "INSERT_", "UPDATE_", "DELETE_", "CREATE_", "DROP_", 
			"TABLE_", "INTO_", "VALUES_", "SET_", "AND_", "OR_", "NOT_", "NULL_", 
			"TRUE_", "FALSE_", "IS_", "IN_", "LIKE_", "BETWEEN_", "ORDER_", "BY_", 
			"GROUP_", "HAVING_", "LIMIT_", "OFFSET_", "ASC_", "DESC_", "DISTINCT_", 
			"AS_", "ON_", "JOIN_", "LEFT_", "RIGHT_", "INNER_", "OUTER_", "UNION_", 
			"ALL_", "EXISTS_", "CASE_", "WHEN_", "THEN_", "ELSE_", "END_", "PRIMARY_", 
			"KEY_", "FOREIGN_", "REFERENCES_", "CONSTRAINT_", "UNIQUE_", "CHECK_", 
			"DEFAULT_", "AUTOINCREMENT_", "INDEX_", "VIEW_", "TRIGGER_", "PROCEDURE_", 
			"FUNCTION_", "RETURN_", "IF_", "DECLARE_", "BEGIN_", "COMMIT_", "ROLLBACK_", 
			"TRANSACTION_", "SAVEPOINT_", "RELEASE_", "PRAGMA_", "VACUUM_", "REINDEX_", 
			"ANALYZE_", "EXPLAIN_", "QUERY_", "PLAN_", "ALTER_", "ADD_", "COLUMN_", 
			"RENAME_", "TO_", "DATABASE_", "SCHEMA_", "ATTACH_", "DETACH_", "TEMPORARY_", 
			"TEMP_", "VIRTUAL_", "WITHOUT_", "WITH_", "RECURSIVE_", "REPLACE_", "ABORT_", 
			"FAIL_", "IGNORE_", "ROLLBACK_KW_", "CASCADE_", "RESTRICT_", "NO_", "ACTION_", 
			"MATCH_", "FULL_", "PARTIAL_", "SIMPLE_", "DEFERRABLE_", "DEFERRED_", 
			"IMMEDIATE_", "INITIALLY_", "EXCLUSIVE_", "COLLATE_", "CONFLICT_", "INDEXED_", 
			"NATURAL_", "CROSS_", "USING_", "NULLS_", "FIRST_", "LAST_", "ESCAPE_", 
			"GLOB_", "REGEXP_", "INTEGER_TYPE", "REAL_TYPE", "TEXT_TYPE", "BLOB_TYPE", 
			"NUMERIC_TYPE", "VARCHAR_TYPE", "CHAR_TYPE", "DATE_TYPE", "DATETIME_TYPE", 
			"TIME_TYPE", "TIMESTAMP_TYPE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << SELECT_) | (1L << INSERT_) | (1L << UPDATE_) | (1L << DELETE_) | (1L << CREATE_) | (1L << DROP_))) != 0) || _la==PRAGMA_ || _la==EXPLAIN_) {
				{
				{
				setState(104);
				sql_stmt_list();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(EOF);
			 counter.printSummary(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(113);
				match(SCOL);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			sql_stmt();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(120);
						match(SCOL);
						}
						}
						setState(123); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(125);
					sql_stmt();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(SCOL);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Explain_stmtContext explain_stmt() {
			return getRuleContext(Explain_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(137);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(138);
				insert_stmt();
				}
				break;
			case 3:
				{
				setState(139);
				update_stmt();
				}
				break;
			case 4:
				{
				setState(140);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(141);
				create_table_stmt();
				}
				break;
			case 6:
				{
				setState(142);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(143);
				drop_stmt();
				}
				break;
			case 8:
				{
				setState(144);
				pragma_stmt();
				}
				break;
			case 9:
				{
				setState(145);
				explain_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SELECT_);
			 counter.selectCount++; System.out.println("Parser: Processing SELECT statement #" + counter.selectCount); 
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(150);
				match(DISTINCT_);
				}
				break;
			}
			setState(153);
			result_column();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				result_column();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(161);
				match(FROM_);
				setState(162);
				table_or_subquery();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					table_or_subquery();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(172);
				match(WHERE_);
				setState(173);
				expr(0);
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_) {
				{
				setState(176);
				match(GROUP_);
				setState(177);
				match(BY_);
				setState(178);
				expr(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					expr(0);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING_) {
					{
					setState(186);
					match(HAVING_);
					setState(187);
					expr(0);
					}
				}

				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(192);
				match(ORDER_);
				setState(193);
				match(BY_);
				setState(194);
				ordering_term();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					ordering_term();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(204);
				match(LIMIT_);
				setState(205);
				expr(0);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET_) {
					{
					setState(206);
					match(OFFSET_);
					setState(207);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(INSERT_);
			 counter.insertCount++; System.out.println("Parser: Processing INSERT statement #" + counter.insertCount); 
			setState(214);
			match(INTO_);
			setState(215);
			table_name();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(216);
				match(OPEN_PAR);
				setState(217);
				column_name();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					column_name();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(CLOSE_PAR);
				}
			}

			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_:
				{
				setState(229);
				match(VALUES_);
				setState(230);
				match(OPEN_PAR);
				setState(231);
				expr(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expr(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(CLOSE_PAR);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(240);
					match(COMMA);
					setState(241);
					match(OPEN_PAR);
					setState(242);
					expr(0);
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(243);
						match(COMMA);
						setState(244);
						expr(0);
						}
						}
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(250);
					match(CLOSE_PAR);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SELECT_:
				{
				setState(257);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(UPDATE_);
			 counter.updateCount++; System.out.println("Parser: Processing UPDATE statement #" + counter.updateCount); 
			setState(262);
			table_name();
			setState(263);
			match(SET_);
			setState(264);
			column_name();
			setState(265);
			match(ASSIGN);
			setState(266);
			expr(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				column_name();
				setState(269);
				match(ASSIGN);
				setState(270);
				expr(0);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(277);
				match(WHERE_);
				setState(278);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(DELETE_);
			 counter.deleteCount++; System.out.println("Parser: Processing DELETE statement #" + counter.deleteCount); 
			setState(283);
			match(FROM_);
			setState(284);
			table_name();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(285);
				match(WHERE_);
				setState(286);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(CREATE_);
			 counter.createCount++; System.out.println("Parser: Processing CREATE statement #" + counter.createCount); 
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY_ || _la==TEMP_) {
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==TEMPORARY_ || _la==TEMP_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(294);
			match(TABLE_);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_) {
				{
				setState(295);
				match(IF_);
				setState(296);
				match(NOT_);
				setState(297);
				match(EXISTS_);
				}
			}

			setState(300);
			table_name();
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(301);
				match(OPEN_PAR);
				setState(302);
				column_def();
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(COMMA);
						setState(304);
						column_def();
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(310);
					match(COMMA);
					setState(311);
					table_constraint();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(CLOSE_PAR);
				}
				break;
			case AS_:
				{
				setState(319);
				match(AS_);
				setState(320);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(CREATE_);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE_) {
				{
				setState(324);
				match(UNIQUE_);
				}
			}

			setState(327);
			match(INDEX_);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_) {
				{
				setState(328);
				match(IF_);
				setState(329);
				match(NOT_);
				setState(330);
				match(EXISTS_);
				}
			}

			setState(333);
			index_name();
			setState(334);
			match(ON_);
			setState(335);
			table_name();
			setState(336);
			match(OPEN_PAR);
			setState(337);
			indexed_column();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				indexed_column();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(CLOSE_PAR);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(346);
				match(WHERE_);
				setState(347);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(DROP_);
			 counter.dropCount++; System.out.println("Parser: Processing DROP statement #" + counter.dropCount); 
			setState(352);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TABLE_ - 33)) | (1L << (INDEX_ - 33)) | (1L << (VIEW_ - 33)) | (1L << (TRIGGER_ - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_) {
				{
				setState(353);
				match(IF_);
				setState(354);
				match(EXISTS_);
				}
			}

			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(357);
				schema_name();
				setState(358);
				match(DOT);
				}
				break;
			}
			setState(362);
			object_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragma_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(PRAGMA_);
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(365);
				schema_name();
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(368);
				match(DOT);
				}
			}

			setState(371);
			pragma_name();
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(372);
				match(ASSIGN);
				setState(373);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(374);
				match(OPEN_PAR);
				setState(375);
				pragma_value();
				setState(376);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case SELECT_:
			case INSERT_:
			case UPDATE_:
			case DELETE_:
			case CREATE_:
			case DROP_:
			case PRAGMA_:
			case EXPLAIN_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explain_stmtContext extends ParserRuleContext {
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public Explain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExplain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExplain_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExplain_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explain_stmtContext explain_stmt() throws RecognitionException {
		Explain_stmtContext _localctx = new Explain_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_explain_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(EXPLAIN_);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUERY_) {
				{
				setState(381);
				match(QUERY_);
				setState(382);
				match(PLAN_);
				}
			}

			setState(385);
			sql_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			column_name();
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(388);
				type_name();
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_ || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (PRIMARY_ - 71)) | (1L << (REFERENCES_ - 71)) | (1L << (CONSTRAINT_ - 71)) | (1L << (UNIQUE_ - 71)) | (1L << (CHECK_ - 71)) | (1L << (DEFAULT_ - 71)) | (1L << (COLLATE_ - 71)))) != 0)) {
				{
				{
				setState(391);
				column_constraint();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(397);
				match(CONSTRAINT_);
				setState(398);
				constraint_name();
				}
			}

			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				{
				setState(401);
				match(PRIMARY_);
				setState(402);
				match(KEY_);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(403);
					_la = _input.LA(1);
					if ( !(_la==ASC_ || _la==DESC_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(406);
					conflict_clause();
					}
				}

				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOINCREMENT_) {
					{
					setState(409);
					match(AUTOINCREMENT_);
					}
				}

				}
				break;
			case NOT_:
				{
				setState(412);
				match(NOT_);
				setState(413);
				match(NULL_);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(414);
					conflict_clause();
					}
				}

				}
				break;
			case UNIQUE_:
				{
				setState(417);
				match(UNIQUE_);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(418);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(421);
				match(CHECK_);
				setState(422);
				match(OPEN_PAR);
				setState(423);
				expr(0);
				setState(424);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				{
				setState(426);
				match(DEFAULT_);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(427);
					signed_number();
					}
					break;
				case 2:
					{
					setState(428);
					literal_value();
					}
					break;
				case 3:
					{
					setState(429);
					match(OPEN_PAR);
					setState(430);
					expr(0);
					setState(431);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case COLLATE_:
				{
				setState(435);
				match(COLLATE_);
				setState(436);
				collation_name();
				}
				break;
			case REFERENCES_:
				{
				setState(437);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(440);
				match(CONSTRAINT_);
				setState(441);
				constraint_name();
				}
			}

			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
			case UNIQUE_:
				{
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(444);
					match(PRIMARY_);
					setState(445);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(446);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449);
				match(OPEN_PAR);
				setState(450);
				indexed_column();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(451);
					match(COMMA);
					setState(452);
					indexed_column();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				match(CLOSE_PAR);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(459);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(462);
				match(CHECK_);
				setState(463);
				match(OPEN_PAR);
				setState(464);
				expr(0);
				setState(465);
				match(CLOSE_PAR);
				}
				break;
			case FOREIGN_:
				{
				setState(467);
				match(FOREIGN_);
				setState(468);
				match(KEY_);
				setState(469);
				match(OPEN_PAR);
				setState(470);
				column_name();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(471);
					match(COMMA);
					setState(472);
					column_name();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				match(CLOSE_PAR);
				setState(479);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ON_() { return getTokens(SQLiteParser.ON_); }
		public TerminalNode ON_(int i) {
			return getToken(SQLiteParser.ON_, i);
		}
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public List<TerminalNode> DELETE_() { return getTokens(SQLiteParser.DELETE_); }
		public TerminalNode DELETE_(int i) {
			return getToken(SQLiteParser.DELETE_, i);
		}
		public List<TerminalNode> UPDATE_() { return getTokens(SQLiteParser.UPDATE_); }
		public TerminalNode UPDATE_(int i) {
			return getToken(SQLiteParser.UPDATE_, i);
		}
		public List<TerminalNode> SET_() { return getTokens(SQLiteParser.SET_); }
		public TerminalNode SET_(int i) {
			return getToken(SQLiteParser.SET_, i);
		}
		public List<TerminalNode> NULL_() { return getTokens(SQLiteParser.NULL_); }
		public TerminalNode NULL_(int i) {
			return getToken(SQLiteParser.NULL_, i);
		}
		public List<TerminalNode> DEFAULT_() { return getTokens(SQLiteParser.DEFAULT_); }
		public TerminalNode DEFAULT_(int i) {
			return getToken(SQLiteParser.DEFAULT_, i);
		}
		public List<TerminalNode> CASCADE_() { return getTokens(SQLiteParser.CASCADE_); }
		public TerminalNode CASCADE_(int i) {
			return getToken(SQLiteParser.CASCADE_, i);
		}
		public List<TerminalNode> RESTRICT_() { return getTokens(SQLiteParser.RESTRICT_); }
		public TerminalNode RESTRICT_(int i) {
			return getToken(SQLiteParser.RESTRICT_, i);
		}
		public List<TerminalNode> NO_() { return getTokens(SQLiteParser.NO_); }
		public TerminalNode NO_(int i) {
			return getToken(SQLiteParser.NO_, i);
		}
		public List<TerminalNode> ACTION_() { return getTokens(SQLiteParser.ACTION_); }
		public TerminalNode ACTION_(int i) {
			return getToken(SQLiteParser.ACTION_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(REFERENCES_);
			setState(484);
			foreign_table();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(485);
				match(OPEN_PAR);
				setState(486);
				column_name();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(487);
					match(COMMA);
					setState(488);
					column_name();
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				match(CLOSE_PAR);
				}
			}

			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON_) {
				{
				{
				setState(498);
				match(ON_);
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==UPDATE_ || _la==DELETE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(500);
					match(SET_);
					setState(501);
					match(NULL_);
					}
					break;
				case 2:
					{
					setState(502);
					match(SET_);
					setState(503);
					match(DEFAULT_);
					}
					break;
				case 3:
					{
					setState(504);
					match(CASCADE_);
					}
					break;
				case 4:
					{
					setState(505);
					match(RESTRICT_);
					}
					break;
				case 5:
					{
					setState(506);
					match(NO_);
					setState(507);
					match(ACTION_);
					}
					break;
				}
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_) {
					{
					setState(515);
					match(NOT_);
					}
				}

				setState(518);
				match(DEFERRABLE_);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIALLY_) {
					{
					setState(519);
					match(INITIALLY_);
					setState(520);
					_la = _input.LA(1);
					if ( !(_la==DEFERRED_ || _la==IMMEDIATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode ROLLBACK_KW_() { return getToken(SQLiteParser.ROLLBACK_KW_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(ON_);
			setState(526);
			match(CONFLICT_);
			setState(527);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (REPLACE_ - 116)) | (1L << (ABORT_ - 116)) | (1L << (FAIL_ - 116)) | (1L << (IGNORE_ - 116)) | (1L << (ROLLBACK_KW_ - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_result_column);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				table_name();
				setState(531);
				match(DOT);
				setState(532);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				expr(0);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(535);
						match(AS_);
						}
						break;
					}
					setState(538);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_or_subquery);
		int _la;
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(543);
					schema_name();
					setState(544);
					match(DOT);
					}
					break;
				}
				setState(548);
				table_name();
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(549);
						match(AS_);
						}
						break;
					}
					setState(552);
					table_alias();
					}
					break;
				}
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED_:
					{
					setState(555);
					match(INDEXED_);
					setState(556);
					match(BY_);
					setState(557);
					index_name();
					}
					break;
				case NOT_:
					{
					setState(558);
					match(NOT_);
					setState(559);
					match(INDEXED_);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case SELECT_:
				case WHERE_:
				case INSERT_:
				case UPDATE_:
				case DELETE_:
				case CREATE_:
				case DROP_:
				case ORDER_:
				case GROUP_:
				case LIMIT_:
				case ON_:
				case JOIN_:
				case LEFT_:
				case INNER_:
				case PRAGMA_:
				case EXPLAIN_:
				case NATURAL_:
				case CROSS_:
				case USING_:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(OPEN_PAR);
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(563);
					table_or_subquery();
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(564);
						match(COMMA);
						setState(565);
						table_or_subquery();
						}
						}
						setState(570);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(571);
					join_clause();
					}
					break;
				}
				setState(574);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(OPEN_PAR);
				setState(577);
				select_stmt();
				setState(578);
				match(CLOSE_PAR);
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(580);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(579);
						match(AS_);
						}
						break;
					}
					setState(582);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			table_or_subquery();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << JOIN_) | (1L << LEFT_) | (1L << INNER_))) != 0) || _la==NATURAL_ || _la==CROSS_) {
				{
				{
				setState(588);
				join_operator();
				setState(589);
				table_or_subquery();
				setState(590);
				join_constraint();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_join_operator);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(COMMA);
				}
				break;
			case JOIN_:
			case LEFT_:
			case INNER_:
			case NATURAL_:
			case CROSS_:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(598);
					match(NATURAL_);
					}
				}

				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_:
					{
					setState(601);
					match(LEFT_);
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(602);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(605);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(606);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(609);
				match(JOIN_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_join_constraint);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(ON_);
				setState(613);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(USING_);
				setState(615);
				match(OPEN_PAR);
				setState(616);
				column_name();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(617);
					match(COMMA);
					setState(618);
					column_name();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624);
				match(CLOSE_PAR);
				}
				break;
			case CLOSE_PAR:
			case COMMA:
			case JOIN_:
			case LEFT_:
			case INNER_:
			case NATURAL_:
			case CROSS_:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			expr(0);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(630);
				match(COLLATE_);
				setState(631);
				collation_name();
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(634);
				_la = _input.LA(1);
				if ( !(_la==ASC_ || _la==DESC_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(637);
				match(NULLS_);
				setState(638);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(641);
				column_name();
				}
				break;
			case 2:
				{
				setState(642);
				expr(0);
				}
				break;
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(645);
				match(COLLATE_);
				setState(646);
				collation_name();
				}
			}

			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==ASC_ || _la==DESC_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Bind_parameterContext bind_parameter() {
			return getRuleContext(Bind_parameterContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public List<TerminalNode> WHEN_() { return getTokens(SQLiteParser.WHEN_); }
		public TerminalNode WHEN_(int i) {
			return getToken(SQLiteParser.WHEN_, i);
		}
		public List<TerminalNode> THEN_() { return getTokens(SQLiteParser.THEN_); }
		public TerminalNode THEN_(int i) {
			return getToken(SQLiteParser.THEN_, i);
		}
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(653);
				literal_value();
				}
				break;
			case 2:
				{
				setState(654);
				bind_parameter();
				}
				break;
			case 3:
				{
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(655);
						schema_name();
						setState(656);
						match(DOT);
						}
						break;
					}
					setState(660);
					table_name();
					setState(661);
					match(DOT);
					}
					break;
				}
				setState(665);
				column_name();
				}
				break;
			case 4:
				{
				setState(666);
				unary_operator();
				setState(667);
				expr(11);
				}
				break;
			case 5:
				{
				setState(669);
				function_name();
				setState(670);
				match(OPEN_PAR);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << SELECT_) | (1L << FROM_) | (1L << WHERE_) | (1L << INSERT_) | (1L << UPDATE_) | (1L << DELETE_) | (1L << CREATE_) | (1L << DROP_) | (1L << TABLE_) | (1L << INTO_) | (1L << VALUES_) | (1L << SET_) | (1L << AND_) | (1L << OR_) | (1L << NOT_) | (1L << NULL_) | (1L << TRUE_) | (1L << FALSE_) | (1L << IS_) | (1L << IN_) | (1L << LIKE_) | (1L << BETWEEN_) | (1L << ORDER_) | (1L << BY_) | (1L << GROUP_) | (1L << HAVING_) | (1L << LIMIT_) | (1L << OFFSET_) | (1L << ASC_) | (1L << DESC_) | (1L << DISTINCT_) | (1L << AS_) | (1L << ON_) | (1L << JOIN_) | (1L << LEFT_) | (1L << RIGHT_) | (1L << INNER_) | (1L << OUTER_) | (1L << UNION_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ALL_ - 64)) | (1L << (EXISTS_ - 64)) | (1L << (CASE_ - 64)) | (1L << (WHEN_ - 64)) | (1L << (THEN_ - 64)) | (1L << (ELSE_ - 64)) | (1L << (END_ - 64)) | (1L << (PRIMARY_ - 64)) | (1L << (KEY_ - 64)) | (1L << (FOREIGN_ - 64)) | (1L << (REFERENCES_ - 64)) | (1L << (CONSTRAINT_ - 64)) | (1L << (UNIQUE_ - 64)) | (1L << (CHECK_ - 64)) | (1L << (DEFAULT_ - 64)) | (1L << (AUTOINCREMENT_ - 64)) | (1L << (INDEX_ - 64)) | (1L << (VIEW_ - 64)) | (1L << (TRIGGER_ - 64)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (IDENTIFIER - 157)) | (1L << (NUMERIC_LITERAL - 157)) | (1L << (BIND_PARAMETER - 157)) | (1L << (STRING_LITERAL - 157)) | (1L << (BLOB_LITERAL - 157)))) != 0)) {
					{
					setState(672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(671);
						match(DISTINCT_);
						}
						break;
					}
					setState(674);
					expr(0);
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(675);
						match(COMMA);
						setState(676);
						expr(0);
						}
						}
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(684);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(686);
				match(OPEN_PAR);
				setState(687);
				expr(0);
				setState(688);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(690);
				match(CASE_);
				setState(692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(691);
					expr(0);
					}
					break;
				}
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(694);
					match(WHEN_);
					setState(695);
					expr(0);
					setState(696);
					match(THEN_);
					setState(697);
					expr(0);
					}
					}
					setState(701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_ );
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_) {
					{
					setState(703);
					match(ELSE_);
					setState(704);
					expr(0);
					}
				}

				setState(707);
				match(END_);
				}
				break;
			case 8:
				{
				setState(709);
				match(EXISTS_);
				setState(710);
				match(OPEN_PAR);
				setState(711);
				select_stmt();
				setState(712);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(714);
				match(NOT_);
				setState(715);
				match(EXISTS_);
				setState(716);
				match(OPEN_PAR);
				setState(717);
				select_stmt();
				setState(718);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(770);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(722);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(723);
						binary_operator();
						setState(724);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(726);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(728);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(727);
							match(NOT_);
							}
						}

						setState(730);
						match(BETWEEN_);
						setState(731);
						expr(0);
						setState(732);
						match(AND_);
						setState(733);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(735);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(736);
						match(IS_);
						setState(738);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
						case 1:
							{
							setState(737);
							match(NOT_);
							}
							break;
						}
						setState(740);
						expr(2);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(741);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(743);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(742);
							match(NOT_);
							}
						}

						setState(745);
						match(IN_);
						setState(746);
						match(OPEN_PAR);
						setState(756);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
						case 1:
							{
							setState(747);
							select_stmt();
							}
							break;
						case 2:
							{
							setState(748);
							expr(0);
							setState(753);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(749);
								match(COMMA);
								setState(750);
								expr(0);
								}
								}
								setState(755);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						}
						setState(758);
						match(CLOSE_PAR);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(760);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(762);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(761);
							match(NOT_);
							}
						}

						setState(764);
						match(LIKE_);
						setState(765);
						expr(0);
						setState(768);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
						case 1:
							{
							setState(766);
							match(ESCAPE_);
							setState(767);
							expr(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_) | (1L << TRUE_) | (1L << FALSE_))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (NUMERIC_LITERAL - 158)) | (1L << (STRING_LITERAL - 158)) | (1L << (BLOB_LITERAL - 158)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << AND_) | (1L << OR_) | (1L << IS_) | (1L << LIKE_))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (MATCH_ - 125)) | (1L << (GLOB_ - 125)) | (1L << (REGEXP_ - 125)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Constraint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterConstraint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitConstraint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitConstraint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraint_nameContext constraint_name() throws RecognitionException {
		Constraint_nameContext _localctx = new Constraint_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constraint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterObject_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitObject_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitObject_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_nameContext object_name() throws RecognitionException {
		Object_nameContext _localctx = new Object_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_any_name);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(IDENTIFIER);
				}
				break;
			case SELECT_:
			case FROM_:
			case WHERE_:
			case INSERT_:
			case UPDATE_:
			case DELETE_:
			case CREATE_:
			case DROP_:
			case TABLE_:
			case INTO_:
			case VALUES_:
			case SET_:
			case AND_:
			case OR_:
			case NOT_:
			case NULL_:
			case TRUE_:
			case FALSE_:
			case IS_:
			case IN_:
			case LIKE_:
			case BETWEEN_:
			case ORDER_:
			case BY_:
			case GROUP_:
			case HAVING_:
			case LIMIT_:
			case OFFSET_:
			case ASC_:
			case DESC_:
			case DISTINCT_:
			case AS_:
			case ON_:
			case JOIN_:
			case LEFT_:
			case RIGHT_:
			case INNER_:
			case OUTER_:
			case UNION_:
			case ALL_:
			case EXISTS_:
			case CASE_:
			case WHEN_:
			case THEN_:
			case ELSE_:
			case END_:
			case PRIMARY_:
			case KEY_:
			case FOREIGN_:
			case REFERENCES_:
			case CONSTRAINT_:
			case UNIQUE_:
			case CHECK_:
			case DEFAULT_:
			case AUTOINCREMENT_:
			case INDEX_:
			case VIEW_:
			case TRIGGER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(818);
				match(OPEN_PAR);
				setState(819);
				any_name();
				setState(820);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public TerminalNode THEN_() { return getToken(SQLiteParser.THEN_, 0); }
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (SELECT_ - 25)) | (1L << (FROM_ - 25)) | (1L << (WHERE_ - 25)) | (1L << (INSERT_ - 25)) | (1L << (UPDATE_ - 25)) | (1L << (DELETE_ - 25)) | (1L << (CREATE_ - 25)) | (1L << (DROP_ - 25)) | (1L << (TABLE_ - 25)) | (1L << (INTO_ - 25)) | (1L << (VALUES_ - 25)) | (1L << (SET_ - 25)) | (1L << (AND_ - 25)) | (1L << (OR_ - 25)) | (1L << (NOT_ - 25)) | (1L << (NULL_ - 25)) | (1L << (TRUE_ - 25)) | (1L << (FALSE_ - 25)) | (1L << (IS_ - 25)) | (1L << (IN_ - 25)) | (1L << (LIKE_ - 25)) | (1L << (BETWEEN_ - 25)) | (1L << (ORDER_ - 25)) | (1L << (BY_ - 25)) | (1L << (GROUP_ - 25)) | (1L << (HAVING_ - 25)) | (1L << (LIMIT_ - 25)) | (1L << (OFFSET_ - 25)) | (1L << (ASC_ - 25)) | (1L << (DESC_ - 25)) | (1L << (DISTINCT_ - 25)) | (1L << (AS_ - 25)) | (1L << (ON_ - 25)) | (1L << (JOIN_ - 25)) | (1L << (LEFT_ - 25)) | (1L << (RIGHT_ - 25)) | (1L << (INNER_ - 25)) | (1L << (OUTER_ - 25)) | (1L << (UNION_ - 25)) | (1L << (ALL_ - 25)) | (1L << (EXISTS_ - 25)) | (1L << (CASE_ - 25)) | (1L << (WHEN_ - 25)) | (1L << (THEN_ - 25)) | (1L << (ELSE_ - 25)) | (1L << (END_ - 25)) | (1L << (PRIMARY_ - 25)) | (1L << (KEY_ - 25)) | (1L << (FOREIGN_ - 25)) | (1L << (REFERENCES_ - 25)) | (1L << (CONSTRAINT_ - 25)) | (1L << (UNIQUE_ - 25)) | (1L << (CHECK_ - 25)) | (1L << (DEFAULT_ - 25)) | (1L << (AUTOINCREMENT_ - 25)) | (1L << (INDEX_ - 25)) | (1L << (VIEW_ - 25)) | (1L << (TRIGGER_ - 25)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(827); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(826);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(829); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(833);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(836);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bind_parameterContext extends ParserRuleContext {
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Bind_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBind_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBind_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBind_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bind_parameterContext bind_parameter() throws RecognitionException {
		Bind_parameterContext _localctx = new Bind_parameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bind_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(BIND_PARAMETER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pragma_value);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a7\u0350\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\2\3\3\7\3u\n\3\f\3"+
		"\16\3x\13\3\3\3\3\3\6\3|\n\3\r\3\16\3}\3\3\7\3\u0081\n\3\f\3\16\3\u0084"+
		"\13\3\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u0095\n\4\3\5\3\5\3\5\5\5\u009a\n\5\3\5\3\5\3\5\7\5\u009f"+
		"\n\5\f\5\16\5\u00a2\13\5\3\5\3\5\3\5\3\5\7\5\u00a8\n\5\f\5\16\5\u00ab"+
		"\13\5\5\5\u00ad\n\5\3\5\3\5\5\5\u00b1\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b8"+
		"\n\5\f\5\16\5\u00bb\13\5\3\5\3\5\5\5\u00bf\n\5\5\5\u00c1\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00c8\n\5\f\5\16\5\u00cb\13\5\5\5\u00cd\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00d3\n\5\5\5\u00d5\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00df"+
		"\n\6\f\6\16\6\u00e2\13\6\3\6\3\6\5\6\u00e6\n\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u00ed\n\6\f\6\16\6\u00f0\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f8\n\6\f"+
		"\6\16\6\u00fb\13\6\3\6\3\6\7\6\u00ff\n\6\f\6\16\6\u0102\13\6\3\6\5\6\u0105"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0113\n\7\f\7"+
		"\16\7\u0116\13\7\3\7\3\7\5\7\u011a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0122"+
		"\n\b\3\t\3\t\3\t\5\t\u0127\n\t\3\t\3\t\3\t\3\t\5\t\u012d\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u0134\n\t\f\t\16\t\u0137\13\t\3\t\3\t\7\t\u013b\n\t\f\t"+
		"\16\t\u013e\13\t\3\t\3\t\3\t\3\t\5\t\u0144\n\t\3\n\3\n\5\n\u0148\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u014e\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0157\n\n"+
		"\f\n\16\n\u015a\13\n\3\n\3\n\3\n\5\n\u015f\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0166\n\13\3\13\3\13\3\13\5\13\u016b\n\13\3\13\3\13\3\f\3\f\5\f"+
		"\u0171\n\f\3\f\5\f\u0174\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u017d\n\f"+
		"\3\r\3\r\3\r\5\r\u0182\n\r\3\r\3\r\3\16\3\16\5\16\u0188\n\16\3\16\7\16"+
		"\u018b\n\16\f\16\16\16\u018e\13\16\3\17\3\17\5\17\u0192\n\17\3\17\3\17"+
		"\3\17\5\17\u0197\n\17\3\17\5\17\u019a\n\17\3\17\5\17\u019d\n\17\3\17\3"+
		"\17\3\17\5\17\u01a2\n\17\3\17\3\17\5\17\u01a6\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01b4\n\17\3\17\3\17\3\17"+
		"\5\17\u01b9\n\17\3\20\3\20\5\20\u01bd\n\20\3\20\3\20\3\20\5\20\u01c2\n"+
		"\20\3\20\3\20\3\20\3\20\7\20\u01c8\n\20\f\20\16\20\u01cb\13\20\3\20\3"+
		"\20\5\20\u01cf\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u01dc\n\20\f\20\16\20\u01df\13\20\3\20\3\20\3\20\5\20\u01e4"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ec\n\21\f\21\16\21\u01ef\13"+
		"\21\3\21\3\21\5\21\u01f3\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u01ff\n\21\7\21\u0201\n\21\f\21\16\21\u0204\13\21\3\21"+
		"\5\21\u0207\n\21\3\21\3\21\3\21\5\21\u020c\n\21\5\21\u020e\n\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u021b\n\23\3\23"+
		"\5\23\u021e\n\23\5\23\u0220\n\23\3\24\3\24\3\24\5\24\u0225\n\24\3\24\3"+
		"\24\5\24\u0229\n\24\3\24\5\24\u022c\n\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0233\n\24\3\24\3\24\3\24\3\24\7\24\u0239\n\24\f\24\16\24\u023c\13\24"+
		"\3\24\5\24\u023f\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0247\n\24\3"+
		"\24\5\24\u024a\n\24\5\24\u024c\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u0253"+
		"\n\25\f\25\16\25\u0256\13\25\3\26\3\26\5\26\u025a\n\26\3\26\3\26\5\26"+
		"\u025e\n\26\3\26\3\26\5\26\u0262\n\26\3\26\5\26\u0265\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u026e\n\27\f\27\16\27\u0271\13\27\3\27\3"+
		"\27\3\27\5\27\u0276\n\27\3\30\3\30\3\30\5\30\u027b\n\30\3\30\5\30\u027e"+
		"\n\30\3\30\3\30\5\30\u0282\n\30\3\31\3\31\5\31\u0286\n\31\3\31\3\31\5"+
		"\31\u028a\n\31\3\31\5\31\u028d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0295\n\32\3\32\3\32\3\32\5\32\u029a\n\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u02a3\n\32\3\32\3\32\3\32\7\32\u02a8\n\32\f\32\16\32\u02ab"+
		"\13\32\5\32\u02ad\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02b7"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\6\32\u02be\n\32\r\32\16\32\u02bf\3\32\3"+
		"\32\5\32\u02c4\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u02d3\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02db"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02e5\n\32\3\32\3\32"+
		"\3\32\5\32\u02ea\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02f2\n\32\f"+
		"\32\16\32\u02f5\13\32\5\32\u02f7\n\32\3\32\3\32\3\32\3\32\5\32\u02fd\n"+
		"\32\3\32\3\32\3\32\3\32\5\32\u0303\n\32\7\32\u0305\n\32\f\32\16\32\u0308"+
		"\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u0339\n/\3\60\3\60\3\61\6\61\u033e"+
		"\n\61\r\61\16\61\u033f\3\62\3\62\3\63\5\63\u0345\n\63\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\65\5\65\u034e\n\65\3\65\2\3\62\66\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\16"+
		"\3\2pq\4\2##RT\3\2\678\3\2\37 \3\2\u0084\u0085\3\2vz\3\2\u008f\u0090\5"+
		"\2*,\u00a0\u00a0\u00a2\u00a3\4\2\n\f))\t\2\b\13\r\32\'(--//\177\177\u0092"+
		"\u0093\3\2\33T\3\2\n\13\2\u03b0\2m\3\2\2\2\4v\3\2\2\2\6\u0094\3\2\2\2"+
		"\b\u0096\3\2\2\2\n\u00d6\3\2\2\2\f\u0106\3\2\2\2\16\u011b\3\2\2\2\20\u0123"+
		"\3\2\2\2\22\u0145\3\2\2\2\24\u0160\3\2\2\2\26\u016e\3\2\2\2\30\u017e\3"+
		"\2\2\2\32\u0185\3\2\2\2\34\u0191\3\2\2\2\36\u01bc\3\2\2\2 \u01e5\3\2\2"+
		"\2\"\u020f\3\2\2\2$\u021f\3\2\2\2&\u024b\3\2\2\2(\u024d\3\2\2\2*\u0264"+
		"\3\2\2\2,\u0275\3\2\2\2.\u0277\3\2\2\2\60\u0285\3\2\2\2\62\u02d2\3\2\2"+
		"\2\64\u0309\3\2\2\2\66\u030b\3\2\2\28\u030d\3\2\2\2:\u030f\3\2\2\2<\u0311"+
		"\3\2\2\2>\u0313\3\2\2\2@\u0315\3\2\2\2B\u0317\3\2\2\2D\u0319\3\2\2\2F"+
		"\u031b\3\2\2\2H\u031d\3\2\2\2J\u031f\3\2\2\2L\u0321\3\2\2\2N\u0323\3\2"+
		"\2\2P\u0325\3\2\2\2R\u0327\3\2\2\2T\u0329\3\2\2\2V\u032b\3\2\2\2X\u032d"+
		"\3\2\2\2Z\u032f\3\2\2\2\\\u0338\3\2\2\2^\u033a\3\2\2\2`\u033d\3\2\2\2"+
		"b\u0341\3\2\2\2d\u0344\3\2\2\2f\u0348\3\2\2\2h\u034d\3\2\2\2jl\5\4\3\2"+
		"kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3"+
		"qr\b\2\1\2r\3\3\2\2\2su\7\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wy\3\2\2\2xv\3\2\2\2y\u0082\5\6\4\2z|\7\3\2\2{z\3\2\2\2|}\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\5\6\4\2\u0080{\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\3\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u0095\5\b\5\2\u008c\u0095\5\n\6\2\u008d\u0095"+
		"\5\f\7\2\u008e\u0095\5\16\b\2\u008f\u0095\5\20\t\2\u0090\u0095\5\22\n"+
		"\2\u0091\u0095\5\24\13\2\u0092\u0095\5\26\f\2\u0093\u0095\5\30\r\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\7\3\2\2\2\u0096\u0097\7\33\2"+
		"\2\u0097\u0099\b\5\1\2\u0098\u009a\79\2\2\u0099\u0098\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\5$\23\2\u009c\u009d\7\7\2\2\u009d"+
		"\u009f\5$\23\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ac\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7\34\2\2\u00a4\u00a9\5&\24\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\5"+
		"&\24\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a3\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\7\35\2\2\u00af"+
		"\u00b1\5\62\32\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c0\3"+
		"\2\2\2\u00b2\u00b3\7\63\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00b9\5\62\32\2"+
		"\u00b5\u00b6\7\7\2\2\u00b6\u00b8\5\62\32\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\64\2\2\u00bd\u00bf\5\62\32\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00cc\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\7"+
		"\62\2\2\u00c4\u00c9\5.\30\2\u00c5\u00c6\7\7\2\2\u00c6\u00c8\5.\30\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\7\65\2\2\u00cf\u00d2\5"+
		"\62\32\2\u00d0\u00d1\7\66\2\2\u00d1\u00d3\5\62\32\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\t\3\2\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d8\b\6\1\2\u00d8"+
		"\u00d9\7$\2\2\u00d9\u00e5\5<\37\2\u00da\u00db\7\5\2\2\u00db\u00e0\5> "+
		"\2\u00dc\u00dd\7\7\2\2\u00dd\u00df\5> \2\u00de\u00dc\3\2\2\2\u00df\u00e2"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00da\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u0104\3\2\2\2\u00e7\u00e8\7%\2\2\u00e8"+
		"\u00e9\7\5\2\2\u00e9\u00ee\5\62\32\2\u00ea\u00eb\7\7\2\2\u00eb\u00ed\5"+
		"\62\32\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u0100\7\6"+
		"\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7\5\2\2\u00f4\u00f9\5\62\32\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00f8\5\62\32\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f2\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\5\b\5\2\u0104\u00e7\3\2"+
		"\2\2\u0104\u0103\3\2\2\2\u0105\13\3\2\2\2\u0106\u0107\7\37\2\2\u0107\u0108"+
		"\b\7\1\2\u0108\u0109\5<\37\2\u0109\u010a\7&\2\2\u010a\u010b\5> \2\u010b"+
		"\u010c\7\b\2\2\u010c\u0114\5\62\32\2\u010d\u010e\7\7\2\2\u010e\u010f\5"+
		"> \2\u010f\u0110\7\b\2\2\u0110\u0111\5\62\32\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010d\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0119\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\35\2\2\u0118"+
		"\u011a\5\62\32\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\r\3\2\2"+
		"\2\u011b\u011c\7 \2\2\u011c\u011d\b\b\1\2\u011d\u011e\7\34\2\2\u011e\u0121"+
		"\5<\37\2\u011f\u0120\7\35\2\2\u0120\u0122\5\62\32\2\u0121\u011f\3\2\2"+
		"\2\u0121\u0122\3\2\2\2\u0122\17\3\2\2\2\u0123\u0124\7!\2\2\u0124\u0126"+
		"\b\t\1\2\u0125\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012c\7#\2\2\u0129\u012a\7X\2\2\u012a\u012b\7)\2"+
		"\2\u012b\u012d\7C\2\2\u012c\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0143\5<\37\2\u012f\u0130\7\5\2\2\u0130\u0135\5\32\16\2"+
		"\u0131\u0132\7\7\2\2\u0132\u0134\5\32\16\2\u0133\u0131\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013c\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\7\7\2\2\u0139\u013b\5\36\20\2\u013a\u0138\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\6\2\2\u0140\u0144\3\2"+
		"\2\2\u0141\u0142\7:\2\2\u0142\u0144\5\b\5\2\u0143\u012f\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\21\3\2\2\2\u0145\u0147\7!\2\2\u0146\u0148\7N\2\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014d"+
		"\7R\2\2\u014a\u014b\7X\2\2\u014b\u014c\7)\2\2\u014c\u014e\7C\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5@"+
		"!\2\u0150\u0151\7;\2\2\u0151\u0152\5<\37\2\u0152\u0153\7\5\2\2\u0153\u0158"+
		"\5\60\31\2\u0154\u0155\7\7\2\2\u0155\u0157\5\60\31\2\u0156\u0154\3\2\2"+
		"\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015e\7\6\2\2\u015c\u015d\7\35\2\2"+
		"\u015d\u015f\5\62\32\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\23"+
		"\3\2\2\2\u0160\u0161\7\"\2\2\u0161\u0162\b\13\1\2\u0162\u0165\t\3\2\2"+
		"\u0163\u0164\7X\2\2\u0164\u0166\7C\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0168\5:\36\2\u0168\u0169\7\4\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\5Z.\2\u016d\25\3\2\2\2\u016e\u0170\7`\2\2\u016f\u0171"+
		"\5:\36\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0174\7\4\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u017c\5H%\2\u0176\u0177\7\b\2\2\u0177\u017d\5h\65\2\u0178\u0179"+
		"\7\5\2\2\u0179\u017a\5h\65\2\u017a\u017b\7\6\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u0176\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u017d\3\2\2\2\u017d\27\3\2\2"+
		"\2\u017e\u0181\7d\2\2\u017f\u0180\7e\2\2\u0180\u0182\7f\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5\6\4\2\u0184"+
		"\31\3\2\2\2\u0185\u0187\5> \2\u0186\u0188\5`\61\2\u0187\u0186\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u018c\3\2\2\2\u0189\u018b\5\34\17\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\33\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7M\2\2\u0190\u0192\5R*\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u01b8\3\2\2\2\u0193\u0194\7I"+
		"\2\2\u0194\u0196\7J\2\2\u0195\u0197\t\4\2\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\5\"\22\2\u0199\u0198\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\7Q\2\2\u019c"+
		"\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01b9\3\2\2\2\u019e\u019f\7)"+
		"\2\2\u019f\u01a1\7*\2\2\u01a0\u01a2\5\"\22\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01b9\3\2\2\2\u01a3\u01a5\7N\2\2\u01a4\u01a6\5\""+
		"\22\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b9\3\2\2\2\u01a7"+
		"\u01a8\7O\2\2\u01a8\u01a9\7\5\2\2\u01a9\u01aa\5\62\32\2\u01aa\u01ab\7"+
		"\6\2\2\u01ab\u01b9\3\2\2\2\u01ac\u01b3\7P\2\2\u01ad\u01b4\5d\63\2\u01ae"+
		"\u01b4\5\64\33\2\u01af\u01b0\7\5\2\2\u01b0\u01b1\5\62\32\2\u01b1\u01b2"+
		"\7\6\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4\u01b9\3\2\2\2\u01b5\u01b6\7\u0088\2\2\u01b6\u01b9"+
		"\5T+\2\u01b7\u01b9\5 \21\2\u01b8\u0193\3\2\2\2\u01b8\u019e\3\2\2\2\u01b8"+
		"\u01a3\3\2\2\2\u01b8\u01a7\3\2\2\2\u01b8\u01ac\3\2\2\2\u01b8\u01b5\3\2"+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\35\3\2\2\2\u01ba\u01bb\7M\2\2\u01bb\u01bd"+
		"\5R*\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01e3\3\2\2\2\u01be"+
		"\u01bf\7I\2\2\u01bf\u01c2\7J\2\2\u01c0\u01c2\7N\2\2\u01c1\u01be\3\2\2"+
		"\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7\5\2\2\u01c4\u01c9"+
		"\5\60\31\2\u01c5\u01c6\7\7\2\2\u01c6\u01c8\5\60\31\2\u01c7\u01c5\3\2\2"+
		"\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\7\6\2\2\u01cd\u01cf\5\"\22\2"+
		"\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01e4\3\2\2\2\u01d0\u01d1"+
		"\7O\2\2\u01d1\u01d2\7\5\2\2\u01d2\u01d3\5\62\32\2\u01d3\u01d4\7\6\2\2"+
		"\u01d4\u01e4\3\2\2\2\u01d5\u01d6\7K\2\2\u01d6\u01d7\7J\2\2\u01d7\u01d8"+
		"\7\5\2\2\u01d8\u01dd\5> \2\u01d9\u01da\7\7\2\2\u01da\u01dc\5> \2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7\6\2\2\u01e1"+
		"\u01e2\5 \21\2\u01e2\u01e4\3\2\2\2\u01e3\u01c1\3\2\2\2\u01e3\u01d0\3\2"+
		"\2\2\u01e3\u01d5\3\2\2\2\u01e4\37\3\2\2\2\u01e5\u01e6\7L\2\2\u01e6\u01f2"+
		"\5V,\2\u01e7\u01e8\7\5\2\2\u01e8\u01ed\5> \2\u01e9\u01ea\7\7\2\2\u01ea"+
		"\u01ec\5> \2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2"+
		"\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1"+
		"\7\6\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01e7\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u0202\3\2\2\2\u01f4\u01f5\7;\2\2\u01f5\u01fe\t\5\2\2\u01f6\u01f7\7&\2"+
		"\2\u01f7\u01ff\7*\2\2\u01f8\u01f9\7&\2\2\u01f9\u01ff\7P\2\2\u01fa\u01ff"+
		"\7{\2\2\u01fb\u01ff\7|\2\2\u01fc\u01fd\7}\2\2\u01fd\u01ff\7~\2\2\u01fe"+
		"\u01f6\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01f4\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u020d\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0207\7)\2\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\7\u0083\2\2\u0209\u020a"+
		"\7\u0086\2\2\u020a\u020c\t\6\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2"+
		"\2\u020c\u020e\3\2\2\2\u020d\u0206\3\2\2\2\u020d\u020e\3\2\2\2\u020e!"+
		"\3\2\2\2\u020f\u0210\7;\2\2\u0210\u0211\7\u0089\2\2\u0211\u0212\t\7\2"+
		"\2\u0212#\3\2\2\2\u0213\u0220\7\t\2\2\u0214\u0215\5<\37\2\u0215\u0216"+
		"\7\4\2\2\u0216\u0217\7\t\2\2\u0217\u0220\3\2\2\2\u0218\u021d\5\62\32\2"+
		"\u0219\u021b\7:\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021e\5P)\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u0213\3\2\2\2\u021f\u0214\3\2\2\2\u021f\u0218\3\2"+
		"\2\2\u0220%\3\2\2\2\u0221\u0222\5:\36\2\u0222\u0223\7\4\2\2\u0223\u0225"+
		"\3\2\2\2\u0224\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u022b\5<\37\2\u0227\u0229\7:\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022c\5L\'\2\u022b\u0228\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u0232\3\2\2\2\u022d\u022e\7\u008a\2\2\u022e\u022f"+
		"\7\62\2\2\u022f\u0233\5@!\2\u0230\u0231\7)\2\2\u0231\u0233\7\u008a\2\2"+
		"\u0232\u022d\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u024c"+
		"\3\2\2\2\u0234\u023e\7\5\2\2\u0235\u023a\5&\24\2\u0236\u0237\7\7\2\2\u0237"+
		"\u0239\5&\24\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023f\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023f\5(\25\2\u023e\u0235\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0241\7\6\2\2\u0241\u024c\3\2\2\2\u0242\u0243\7\5\2\2\u0243"+
		"\u0244\5\b\5\2\u0244\u0249\7\6\2\2\u0245\u0247\7:\2\2\u0246\u0245\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\5L\'\2\u0249"+
		"\u0246\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0224\3\2"+
		"\2\2\u024b\u0234\3\2\2\2\u024b\u0242\3\2\2\2\u024c\'\3\2\2\2\u024d\u0254"+
		"\5&\24\2\u024e\u024f\5*\26\2\u024f\u0250\5&\24\2\u0250\u0251\5,\27\2\u0251"+
		"\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255)\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0265"+
		"\7\7\2\2\u0258\u025a\7\u008b\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u0261\3\2\2\2\u025b\u025d\7=\2\2\u025c\u025e\7@\2\2\u025d\u025c"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\3\2\2\2\u025f\u0262\7?\2\2\u0260"+
		"\u0262\7\u008c\2\2\u0261\u025b\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0260"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\7<\2\2\u0264"+
		"\u0257\3\2\2\2\u0264\u0259\3\2\2\2\u0265+\3\2\2\2\u0266\u0267\7;\2\2\u0267"+
		"\u0276\5\62\32\2\u0268\u0269\7\u008d\2\2\u0269\u026a\7\5\2\2\u026a\u026f"+
		"\5> \2\u026b\u026c\7\7\2\2\u026c\u026e\5> \2\u026d\u026b\3\2\2\2\u026e"+
		"\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7\6\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0276\3\2\2\2\u0275\u0266\3\2\2\2\u0275\u0268\3\2\2\2\u0275\u0274\3\2"+
		"\2\2\u0276-\3\2\2\2\u0277\u027a\5\62\32\2\u0278\u0279\7\u0088\2\2\u0279"+
		"\u027b\5T+\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2"+
		"\2\u027c\u027e\t\4\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281"+
		"\3\2\2\2\u027f\u0280\7\u008e\2\2\u0280\u0282\t\b\2\2\u0281\u027f\3\2\2"+
		"\2\u0281\u0282\3\2\2\2\u0282/\3\2\2\2\u0283\u0286\5> \2\u0284\u0286\5"+
		"\62\32\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0288\7\u0088\2\2\u0288\u028a\5T+\2\u0289\u0287\3\2\2\2\u0289\u028a\3"+
		"\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\t\4\2\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\61\3\2\2\2\u028e\u028f\b\32\1\2\u028f\u02d3\5\64"+
		"\33\2\u0290\u02d3\5f\64\2\u0291\u0292\5:\36\2\u0292\u0293\7\4\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u0297\5<\37\2\u0297\u0298\7\4\2\2\u0298\u029a\3\2\2\2\u0299"+
		"\u0294\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02d3\5>"+
		" \2\u029c\u029d\5\66\34\2\u029d\u029e\5\62\32\r\u029e\u02d3\3\2\2\2\u029f"+
		"\u02a0\5X-\2\u02a0\u02ac\7\5\2\2\u02a1\u02a3\79\2\2\u02a2\u02a1\3\2\2"+
		"\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a9\5\62\32\2\u02a5"+
		"\u02a6\7\7\2\2\u02a6\u02a8\5\62\32\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab\3"+
		"\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02a2\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u02af\7\6\2\2\u02af\u02d3\3\2\2\2\u02b0\u02b1\7\5\2\2\u02b1"+
		"\u02b2\5\62\32\2\u02b2\u02b3\7\6\2\2\u02b3\u02d3\3\2\2\2\u02b4\u02b6\7"+
		"D\2\2\u02b5\u02b7\5\62\32\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02bd\3\2\2\2\u02b8\u02b9\7E\2\2\u02b9\u02ba\5\62\32\2\u02ba\u02bb\7"+
		"F\2\2\u02bb\u02bc\5\62\32\2\u02bc\u02be\3\2\2\2\u02bd\u02b8\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c3\3\2"+
		"\2\2\u02c1\u02c2\7G\2\2\u02c2\u02c4\5\62\32\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\7H\2\2\u02c6\u02d3\3\2"+
		"\2\2\u02c7\u02c8\7C\2\2\u02c8\u02c9\7\5\2\2\u02c9\u02ca\5\b\5\2\u02ca"+
		"\u02cb\7\6\2\2\u02cb\u02d3\3\2\2\2\u02cc\u02cd\7)\2\2\u02cd\u02ce\7C\2"+
		"\2\u02ce\u02cf\7\5\2\2\u02cf\u02d0\5\b\5\2\u02d0\u02d1\7\6\2\2\u02d1\u02d3"+
		"\3\2\2\2\u02d2\u028e\3\2\2\2\u02d2\u0290\3\2\2\2\u02d2\u0299\3\2\2\2\u02d2"+
		"\u029c\3\2\2\2\u02d2\u029f\3\2\2\2\u02d2\u02b0\3\2\2\2\u02d2\u02b4\3\2"+
		"\2\2\u02d2\u02c7\3\2\2\2\u02d2\u02cc\3\2\2\2\u02d3\u0306\3\2\2\2\u02d4"+
		"\u02d5\f\f\2\2\u02d5\u02d6\58\35\2\u02d6\u02d7\5\62\32\r\u02d7\u0305\3"+
		"\2\2\2\u02d8\u02da\f\5\2\2\u02d9\u02db\7)\2\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\60\2\2\u02dd\u02de\5"+
		"\62\32\2\u02de\u02df\7\'\2\2\u02df\u02e0\5\62\32\6\u02e0\u0305\3\2\2\2"+
		"\u02e1\u02e2\f\3\2\2\u02e2\u02e4\7-\2\2\u02e3\u02e5\7)\2\2\u02e4\u02e3"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0305\5\62\32\4"+
		"\u02e7\u02e9\f\6\2\2\u02e8\u02ea\7)\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7.\2\2\u02ec\u02f6\7\5\2\2\u02ed"+
		"\u02f7\5\b\5\2\u02ee\u02f3\5\62\32\2\u02ef\u02f0\7\7\2\2\u02f0\u02f2\5"+
		"\62\32\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02ed\3\2"+
		"\2\2\u02f6\u02ee\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\7\6\2\2\u02f9"+
		"\u0305\3\2\2\2\u02fa\u02fc\f\4\2\2\u02fb\u02fd\7)\2\2\u02fc\u02fb\3\2"+
		"\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7/\2\2\u02ff"+
		"\u0302\5\62\32\2\u0300\u0301\7\u0091\2\2\u0301\u0303\5\62\32\2\u0302\u0300"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u02d4\3\2\2\2\u0304"+
		"\u02d8\3\2\2\2\u0304\u02e1\3\2\2\2\u0304\u02e7\3\2\2\2\u0304\u02fa\3\2"+
		"\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\63\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\t\t\2\2\u030a\65\3\2\2\2\u030b"+
		"\u030c\t\n\2\2\u030c\67\3\2\2\2\u030d\u030e\t\13\2\2\u030e9\3\2\2\2\u030f"+
		"\u0310\5\\/\2\u0310;\3\2\2\2\u0311\u0312\5\\/\2\u0312=\3\2\2\2\u0313\u0314"+
		"\5\\/\2\u0314?\3\2\2\2\u0315\u0316\5\\/\2\u0316A\3\2\2\2\u0317\u0318\5"+
		"\\/\2\u0318C\3\2\2\2\u0319\u031a\5\\/\2\u031aE\3\2\2\2\u031b\u031c\5\\"+
		"/\2\u031cG\3\2\2\2\u031d\u031e\5\\/\2\u031eI\3\2\2\2\u031f\u0320\5\\/"+
		"\2\u0320K\3\2\2\2\u0321\u0322\5\\/\2\u0322M\3\2\2\2\u0323\u0324\5\\/\2"+
		"\u0324O\3\2\2\2\u0325\u0326\5\\/\2\u0326Q\3\2\2\2\u0327\u0328\5\\/\2\u0328"+
		"S\3\2\2\2\u0329\u032a\5\\/\2\u032aU\3\2\2\2\u032b\u032c\5\\/\2\u032cW"+
		"\3\2\2\2\u032d\u032e\5\\/\2\u032eY\3\2\2\2\u032f\u0330\5\\/\2\u0330[\3"+
		"\2\2\2\u0331\u0339\7\u009f\2\2\u0332\u0339\5^\60\2\u0333\u0339\7\u00a2"+
		"\2\2\u0334\u0335\7\5\2\2\u0335\u0336\5\\/\2\u0336\u0337\7\6\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u0331\3\2\2\2\u0338\u0332\3\2\2\2\u0338\u0333\3\2"+
		"\2\2\u0338\u0334\3\2\2\2\u0339]\3\2\2\2\u033a\u033b\t\f\2\2\u033b_\3\2"+
		"\2\2\u033c\u033e\5b\62\2\u033d\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340a\3\2\2\2\u0341\u0342\5\\/\2\u0342"+
		"c\3\2\2\2\u0343\u0345\t\r\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2"+
		"\u0345\u0346\3\2\2\2\u0346\u0347\7\u00a0\2\2\u0347e\3\2\2\2\u0348\u0349"+
		"\7\u00a1\2\2\u0349g\3\2\2\2\u034a\u034e\5d\63\2\u034b\u034e\5b\62\2\u034c"+
		"\u034e\7\u00a2\2\2\u034d\u034a\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034c"+
		"\3\2\2\2\u034ei\3\2\2\2rmv}\u0082\u0088\u0094\u0099\u00a0\u00a9\u00ac"+
		"\u00b0\u00b9\u00be\u00c0\u00c9\u00cc\u00d2\u00d4\u00e0\u00e5\u00ee\u00f9"+
		"\u0100\u0104\u0114\u0119\u0121\u0126\u012c\u0135\u013c\u0143\u0147\u014d"+
		"\u0158\u015e\u0165\u016a\u0170\u0173\u017c\u0181\u0187\u018c\u0191\u0196"+
		"\u0199\u019c\u01a1\u01a5\u01b3\u01b8\u01bc\u01c1\u01c9\u01ce\u01dd\u01e3"+
		"\u01ed\u01f2\u01fe\u0202\u0206\u020b\u020d\u021a\u021d\u021f\u0224\u0228"+
		"\u022b\u0232\u023a\u023e\u0246\u0249\u024b\u0254\u0259\u025d\u0261\u0264"+
		"\u026f\u0275\u027a\u027d\u0281\u0285\u0289\u028c\u0294\u0299\u02a2\u02a9"+
		"\u02ac\u02b6\u02bf\u02c3\u02d2\u02da\u02e4\u02e9\u02f3\u02f6\u02fc\u0302"+
		"\u0304\u0306\u0338\u033f\u0344\u034d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}