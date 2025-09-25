// Generated from /workspaces/antlrr/antlr-example/src/main/antlr4/SQLiteParser.g4 by ANTLR 4.13.1

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8355053570L) != 0) || _la==PRAGMA_ || _la==EXPLAIN_) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 985162418487297L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while (_la==NOT_ || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & -9223372036854775559L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 31L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170534137668829216L) != 0) || _la==NATURAL_ || _la==CROSS_) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 524287L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 31L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & 13L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755815680L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 44392815524800L) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 1572865L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constraint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Constraint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Object_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_name; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 288230376151711743L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bind_parameterContext extends ParserRuleContext {
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Bind_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind_parameter; }
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

	@SuppressWarnings("CheckReturnValue")
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
		"\u0004\u0001\u00a5\u034e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u0001\u0000\u0005\u0000j\b\u0000\n\u0000"+
		"\f\u0000m\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001s\b\u0001\n\u0001\f\u0001v\t\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001z\b\u0001\u000b\u0001\f\u0001{\u0001\u0001\u0005\u0001\u007f\b\u0001"+
		"\n\u0001\f\u0001\u0082\t\u0001\u0001\u0001\u0005\u0001\u0085\b\u0001\n"+
		"\u0001\f\u0001\u0088\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0093\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0098"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003"+
		"\n\u0003\f\u0003\u00a0\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00a6\b\u0003\n\u0003\f\u0003\u00a9\t\u0003\u0003\u0003"+
		"\u00ab\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00af\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b6"+
		"\b\u0003\n\u0003\f\u0003\u00b9\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00bd\b\u0003\u0003\u0003\u00bf\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00c6\b\u0003\n\u0003\f\u0003"+
		"\u00c9\t\u0003\u0003\u0003\u00cb\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00d1\b\u0003\u0003\u0003\u00d3\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00dd\b\u0004\n\u0004\f\u0004\u00e0"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e4\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00eb\b\u0004"+
		"\n\u0004\f\u0004\u00ee\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00f6\b\u0004\n\u0004\f\u0004"+
		"\u00f9\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00fd\b\u0004\n\u0004"+
		"\f\u0004\u0100\t\u0004\u0001\u0004\u0003\u0004\u0103\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0111\b\u0005\n\u0005\f\u0005\u0114\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0118\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0120\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0125\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u012b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0132\b\u0007\n\u0007\f\u0007\u0135\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0139\b\u0007\n\u0007\f\u0007\u013c"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0142"+
		"\b\u0007\u0001\b\u0001\b\u0003\b\u0146\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u014c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0155\b\b\n\b\f\b\u0158\t\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u015d\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0164\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0169\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\n\u016f\b\n\u0001\n\u0003\n\u0172\b\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u017b\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0180\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u0186\b\f\u0001\f\u0005\f\u0189\b\f\n\f\f\f\u018c\t\f\u0001"+
		"\r\u0001\r\u0003\r\u0190\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0195\b\r"+
		"\u0001\r\u0003\r\u0198\b\r\u0001\r\u0003\r\u019b\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u01a0\b\r\u0001\r\u0001\r\u0003\r\u01a4\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u01b2\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u01b7\b\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01bb\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u01c0\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u01c6\b\u000e\n\u000e\f\u000e\u01c9\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01cd\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01da\b\u000e\n\u000e\f\u000e"+
		"\u01dd\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01e2\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u01ea\b\u000f\n\u000f\f\u000f\u01ed\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u01f1\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u01fd\b\u000f\u0005\u000f\u01ff\b\u000f\n\u000f"+
		"\f\u000f\u0202\t\u000f\u0001\u000f\u0003\u000f\u0205\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u020a\b\u000f\u0003\u000f\u020c\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0219\b\u0011\u0001\u0011\u0003\u0011\u021c\b\u0011\u0003\u0011"+
		"\u021e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0223\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0227\b\u0012\u0001\u0012\u0003"+
		"\u0012\u022a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0231\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0237\b\u0012\n\u0012\f\u0012\u023a\t\u0012\u0001\u0012"+
		"\u0003\u0012\u023d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0245\b\u0012\u0001\u0012\u0003\u0012"+
		"\u0248\b\u0012\u0003\u0012\u024a\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0251\b\u0013\n\u0013\f\u0013"+
		"\u0254\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0258\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u025c\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0260\b\u0014\u0001\u0014\u0003\u0014\u0263\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u026c\b\u0015\n\u0015\f\u0015\u026f\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0274\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0279\b\u0016\u0001\u0016\u0003\u0016\u027c\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0280\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0284\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0288\b"+
		"\u0017\u0001\u0017\u0003\u0017\u028b\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0293\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0298\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u02a1\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u02a6"+
		"\b\u0018\n\u0018\f\u0018\u02a9\t\u0018\u0003\u0018\u02ab\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u02b5\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u02bc\b\u0018\u000b\u0018\f"+
		"\u0018\u02bd\u0001\u0018\u0001\u0018\u0003\u0018\u02c2\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u02d1\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u02d9\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u02e3\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u02e8\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u02f0\b\u0018\n\u0018\f\u0018\u02f3\t\u0018\u0003"+
		"\u0018\u02f5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u02fb\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0301\b\u0018\u0005\u0018\u0303\b\u0018\n\u0018\f\u0018\u0306\t"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0337\b-\u0001"+
		".\u0001.\u0001/\u0004/\u033c\b/\u000b/\f/\u033d\u00010\u00010\u00011\u0003"+
		"1\u0343\b1\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u00033\u034c"+
		"\b3\u00013\u0000\u000104\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdf\u0000\f\u0001\u0000no\u0002\u0000!!PR\u0001\u000056\u0001\u0000"+
		"\u001d\u001e\u0001\u0000\u0082\u0083\u0001\u0000tx\u0001\u0000\u008d\u008e"+
		"\u0003\u0000(*\u009e\u009e\u00a0\u00a1\u0002\u0000\b\n\'\'\u0007\u0000"+
		"\u0006\t\u000b\u0018%&++--}}\u0090\u0091\u0001\u0000\u0019R\u0001\u0000"+
		"\b\t\u03ae\u0000k\u0001\u0000\u0000\u0000\u0002t\u0001\u0000\u0000\u0000"+
		"\u0004\u0092\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000\u0000\u0000"+
		"\b\u00d4\u0001\u0000\u0000\u0000\n\u0104\u0001\u0000\u0000\u0000\f\u0119"+
		"\u0001\u0000\u0000\u0000\u000e\u0121\u0001\u0000\u0000\u0000\u0010\u0143"+
		"\u0001\u0000\u0000\u0000\u0012\u015e\u0001\u0000\u0000\u0000\u0014\u016c"+
		"\u0001\u0000\u0000\u0000\u0016\u017c\u0001\u0000\u0000\u0000\u0018\u0183"+
		"\u0001\u0000\u0000\u0000\u001a\u018f\u0001\u0000\u0000\u0000\u001c\u01ba"+
		"\u0001\u0000\u0000\u0000\u001e\u01e3\u0001\u0000\u0000\u0000 \u020d\u0001"+
		"\u0000\u0000\u0000\"\u021d\u0001\u0000\u0000\u0000$\u0249\u0001\u0000"+
		"\u0000\u0000&\u024b\u0001\u0000\u0000\u0000(\u0262\u0001\u0000\u0000\u0000"+
		"*\u0273\u0001\u0000\u0000\u0000,\u0275\u0001\u0000\u0000\u0000.\u0283"+
		"\u0001\u0000\u0000\u00000\u02d0\u0001\u0000\u0000\u00002\u0307\u0001\u0000"+
		"\u0000\u00004\u0309\u0001\u0000\u0000\u00006\u030b\u0001\u0000\u0000\u0000"+
		"8\u030d\u0001\u0000\u0000\u0000:\u030f\u0001\u0000\u0000\u0000<\u0311"+
		"\u0001\u0000\u0000\u0000>\u0313\u0001\u0000\u0000\u0000@\u0315\u0001\u0000"+
		"\u0000\u0000B\u0317\u0001\u0000\u0000\u0000D\u0319\u0001\u0000\u0000\u0000"+
		"F\u031b\u0001\u0000\u0000\u0000H\u031d\u0001\u0000\u0000\u0000J\u031f"+
		"\u0001\u0000\u0000\u0000L\u0321\u0001\u0000\u0000\u0000N\u0323\u0001\u0000"+
		"\u0000\u0000P\u0325\u0001\u0000\u0000\u0000R\u0327\u0001\u0000\u0000\u0000"+
		"T\u0329\u0001\u0000\u0000\u0000V\u032b\u0001\u0000\u0000\u0000X\u032d"+
		"\u0001\u0000\u0000\u0000Z\u0336\u0001\u0000\u0000\u0000\\\u0338\u0001"+
		"\u0000\u0000\u0000^\u033b\u0001\u0000\u0000\u0000`\u033f\u0001\u0000\u0000"+
		"\u0000b\u0342\u0001\u0000\u0000\u0000d\u0346\u0001\u0000\u0000\u0000f"+
		"\u034b\u0001\u0000\u0000\u0000hj\u0003\u0002\u0001\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0005\u0000\u0000\u0001op\u0006\u0000\uffff\uffff\u0000p\u0001\u0001"+
		"\u0000\u0000\u0000qs\u0005\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u0080\u0003"+
		"\u0004\u0002\u0000xz\u0005\u0001\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0003\u0004\u0002\u0000~y\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0086\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0001"+
		"\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0003\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u0093\u0003\u0006\u0003\u0000\u008a\u0093\u0003\b\u0004"+
		"\u0000\u008b\u0093\u0003\n\u0005\u0000\u008c\u0093\u0003\f\u0006\u0000"+
		"\u008d\u0093\u0003\u000e\u0007\u0000\u008e\u0093\u0003\u0010\b\u0000\u008f"+
		"\u0093\u0003\u0012\t\u0000\u0090\u0093\u0003\u0014\n\u0000\u0091\u0093"+
		"\u0003\u0016\u000b\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092\u008a"+
		"\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u008c"+
		"\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0005"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0097"+
		"\u0006\u0003\uffff\uffff\u0000\u0096\u0098\u00057\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009e\u0003\"\u0011\u0000\u009a\u009b\u0005"+
		"\u0005\u0000\u0000\u009b\u009d\u0003\"\u0011\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u001a"+
		"\u0000\u0000\u00a2\u00a7\u0003$\u0012\u0000\u00a3\u00a4\u0005\u0005\u0000"+
		"\u0000\u00a4\u00a6\u0003$\u0012\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u001b\u0000\u0000\u00ad\u00af\u00030\u0018\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00be\u0001\u0000\u0000\u0000\u00b0\u00b1\u00051\u0000\u0000\u00b1\u00b2"+
		"\u00050\u0000\u0000\u00b2\u00b7\u00030\u0018\u0000\u00b3\u00b4\u0005\u0005"+
		"\u0000\u0000\u00b4\u00b6\u00030\u0018\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u00052\u0000\u0000"+
		"\u00bb\u00bd\u00030\u0018\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00b0\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005/\u0000\u0000\u00c1\u00c2"+
		"\u00050\u0000\u0000\u00c2\u00c7\u0003,\u0016\u0000\u00c3\u00c4\u0005\u0005"+
		"\u0000\u0000\u00c4\u00c6\u0003,\u0016\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d2\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u00053\u0000\u0000\u00cd\u00d0\u00030\u0018\u0000\u00ce"+
		"\u00cf\u00054\u0000\u0000\u00cf\u00d1\u00030\u0018\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u0007\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"\u001c\u0000\u0000\u00d5\u00d6\u0006\u0004\uffff\uffff\u0000\u00d6\u00d7"+
		"\u0005\"\u0000\u0000\u00d7\u00e3\u0003:\u001d\u0000\u00d8\u00d9\u0005"+
		"\u0003\u0000\u0000\u00d9\u00de\u0003<\u001e\u0000\u00da\u00db\u0005\u0005"+
		"\u0000\u0000\u00db\u00dd\u0003<\u001e\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000"+
		"\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u0102\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005#\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000\u0000"+
		"\u00e7\u00ec\u00030\u0018\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9"+
		"\u00eb\u00030\u0018\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ef\u00fe\u0005\u0004\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0005\u0000\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f7"+
		"\u00030\u0018\u0000\u00f3\u00f4\u0005\u0005\u0000\u0000\u00f4\u00f6\u0003"+
		"0\u0018\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005\u0004\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0103\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0003\u0006\u0003\u0000\u0102\u00e5\u0001\u0000"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\t\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\u001d\u0000\u0000\u0105\u0106\u0006\u0005\uffff"+
		"\uffff\u0000\u0106\u0107\u0003:\u001d\u0000\u0107\u0108\u0005$\u0000\u0000"+
		"\u0108\u0109\u0003<\u001e\u0000\u0109\u010a\u0005\u0006\u0000\u0000\u010a"+
		"\u0112\u00030\u0018\u0000\u010b\u010c\u0005\u0005\u0000\u0000\u010c\u010d"+
		"\u0003<\u001e\u0000\u010d\u010e\u0005\u0006\u0000\u0000\u010e\u010f\u0003"+
		"0\u0018\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010b\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0117\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u001b"+
		"\u0000\u0000\u0116\u0118\u00030\u0018\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u000b\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u001e\u0000\u0000\u011a\u011b\u0006\u0006\uffff"+
		"\uffff\u0000\u011b\u011c\u0005\u001a\u0000\u0000\u011c\u011f\u0003:\u001d"+
		"\u0000\u011d\u011e\u0005\u001b\u0000\u0000\u011e\u0120\u00030\u0018\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\r\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001f\u0000\u0000\u0122"+
		"\u0124\u0006\u0007\uffff\uffff\u0000\u0123\u0125\u0007\u0000\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u012a\u0005!\u0000\u0000\u0127"+
		"\u0128\u0005V\u0000\u0000\u0128\u0129\u0005\'\u0000\u0000\u0129\u012b"+
		"\u0005A\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0141\u0003"+
		":\u001d\u0000\u012d\u012e\u0005\u0003\u0000\u0000\u012e\u0133\u0003\u0018"+
		"\f\u0000\u012f\u0130\u0005\u0005\u0000\u0000\u0130\u0132\u0003\u0018\f"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u013a\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005\u0005\u0000\u0000\u0137\u0139\u0003\u001c\u000e"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\u0004\u0000\u0000\u013e\u0142\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u00058\u0000\u0000\u0140\u0142\u0003\u0006\u0003\u0000"+
		"\u0141\u012d\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u000f\u0001\u0000\u0000\u0000\u0143\u0145\u0005\u001f\u0000\u0000"+
		"\u0144\u0146\u0005L\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u014b\u0005P\u0000\u0000\u0148\u0149\u0005V\u0000\u0000\u0149\u014a\u0005"+
		"\'\u0000\u0000\u014a\u014c\u0005A\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0003>\u001f\u0000\u014e\u014f\u00059\u0000\u0000"+
		"\u014f\u0150\u0003:\u001d\u0000\u0150\u0151\u0005\u0003\u0000\u0000\u0151"+
		"\u0156\u0003.\u0017\u0000\u0152\u0153\u0005\u0005\u0000\u0000\u0153\u0155"+
		"\u0003.\u0017\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0005\u0004\u0000\u0000\u015a\u015b\u0005"+
		"\u001b\u0000\u0000\u015b\u015d\u00030\u0018\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0011\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005 \u0000\u0000\u015f\u0160\u0006\t\uffff"+
		"\uffff\u0000\u0160\u0163\u0007\u0001\u0000\u0000\u0161\u0162\u0005V\u0000"+
		"\u0000\u0162\u0164\u0005A\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0168\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u00038\u001c\u0000\u0166\u0167\u0005\u0002\u0000\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0003X,\u0000\u016b\u0013\u0001\u0000\u0000\u0000\u016c\u016e\u0005"+
		"^\u0000\u0000\u016d\u016f\u00038\u001c\u0000\u016e\u016d\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000"+
		"\u0000\u0170\u0172\u0005\u0002\u0000\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u017a\u0003F#\u0000\u0174\u0175\u0005\u0006\u0000\u0000\u0175"+
		"\u017b\u0003f3\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177\u0178\u0003"+
		"f3\u0000\u0178\u0179\u0005\u0004\u0000\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u0174\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0015\u0001\u0000\u0000"+
		"\u0000\u017c\u017f\u0005b\u0000\u0000\u017d\u017e\u0005c\u0000\u0000\u017e"+
		"\u0180\u0005d\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0003\u0004\u0002\u0000\u0182\u0017\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u0003<\u001e\u0000\u0184\u0186\u0003^/\u0000\u0185\u0184\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u018a\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0003\u001a\r\u0000\u0188\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u0019\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0005K\u0000\u0000"+
		"\u018e\u0190\u0003P(\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u01b6\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0005G\u0000\u0000\u0192\u0194\u0005H\u0000\u0000\u0193\u0195\u0007\u0002"+
		"\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000"+
		"\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0198\u0003 \u0010"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u019b\u0005O\u0000\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u01b7\u0001\u0000\u0000\u0000\u019c\u019d\u0005\'\u0000\u0000\u019d"+
		"\u019f\u0005(\u0000\u0000\u019e\u01a0\u0003 \u0010\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01b7\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a3\u0005L\u0000\u0000\u01a2\u01a4\u0003 \u0010"+
		"\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01b7\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005M\u0000\u0000"+
		"\u01a6\u01a7\u0005\u0003\u0000\u0000\u01a7\u01a8\u00030\u0018\u0000\u01a8"+
		"\u01a9\u0005\u0004\u0000\u0000\u01a9\u01b7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01b1\u0005N\u0000\u0000\u01ab\u01b2\u0003b1\u0000\u01ac\u01b2\u0003"+
		"2\u0019\u0000\u01ad\u01ae\u0005\u0003\u0000\u0000\u01ae\u01af\u00030\u0018"+
		"\u0000\u01af\u01b0\u0005\u0004\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000\u01b1\u01ac\u0001\u0000\u0000"+
		"\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b2\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005\u0086\u0000\u0000\u01b4\u01b7\u0003R)\u0000\u01b5"+
		"\u01b7\u0003\u001e\u000f\u0000\u01b6\u0191\u0001\u0000\u0000\u0000\u01b6"+
		"\u019c\u0001\u0000\u0000\u0000\u01b6\u01a1\u0001\u0000\u0000\u0000\u01b6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01b6\u01aa\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u001b\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005K\u0000\u0000\u01b9\u01bb"+
		"\u0003P(\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01e1\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005G\u0000"+
		"\u0000\u01bd\u01c0\u0005H\u0000\u0000\u01be\u01c0\u0005L\u0000\u0000\u01bf"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u0003\u0000\u0000\u01c2"+
		"\u01c7\u0003.\u0017\u0000\u01c3\u01c4\u0005\u0005\u0000\u0000\u01c4\u01c6"+
		"\u0003.\u0017\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0005\u0004\u0000\u0000\u01cb\u01cd\u0003"+
		" \u0010\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01e2\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005M\u0000"+
		"\u0000\u01cf\u01d0\u0005\u0003\u0000\u0000\u01d0\u01d1\u00030\u0018\u0000"+
		"\u01d1\u01d2\u0005\u0004\u0000\u0000\u01d2\u01e2\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005I\u0000\u0000\u01d4\u01d5\u0005H\u0000\u0000\u01d5\u01d6"+
		"\u0005\u0003\u0000\u0000\u01d6\u01db\u0003<\u001e\u0000\u01d7\u01d8\u0005"+
		"\u0005\u0000\u0000\u01d8\u01da\u0003<\u001e\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000"+
		"\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u0004"+
		"\u0000\u0000\u01df\u01e0\u0003\u001e\u000f\u0000\u01e0\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e1\u01bf\u0001\u0000\u0000\u0000\u01e1\u01ce\u0001\u0000"+
		"\u0000\u0000\u01e1\u01d3\u0001\u0000\u0000\u0000\u01e2\u001d\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005J\u0000\u0000\u01e4\u01f0\u0003T*\u0000"+
		"\u01e5\u01e6\u0005\u0003\u0000\u0000\u01e6\u01eb\u0003<\u001e\u0000\u01e7"+
		"\u01e8\u0005\u0005\u0000\u0000\u01e8\u01ea\u0003<\u001e\u0000\u01e9\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005\u0004\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01e5"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u0200"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u00059\u0000\u0000\u01f3\u01fc\u0007"+
		"\u0003\u0000\u0000\u01f4\u01f5\u0005$\u0000\u0000\u01f5\u01fd\u0005(\u0000"+
		"\u0000\u01f6\u01f7\u0005$\u0000\u0000\u01f7\u01fd\u0005N\u0000\u0000\u01f8"+
		"\u01fd\u0005y\u0000\u0000\u01f9\u01fd\u0005z\u0000\u0000\u01fa\u01fb\u0005"+
		"{\u0000\u0000\u01fb\u01fd\u0005|\u0000\u0000\u01fc\u01f4\u0001\u0000\u0000"+
		"\u0000\u01fc\u01f6\u0001\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01f2\u0001\u0000\u0000"+
		"\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u020b\u0001\u0000\u0000"+
		"\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0205\u0005\'\u0000\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0209\u0005\u0081\u0000\u0000"+
		"\u0207\u0208\u0005\u0084\u0000\u0000\u0208\u020a\u0007\u0004\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0204\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u001f\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u00059\u0000\u0000\u020e\u020f\u0005\u0087\u0000\u0000\u020f"+
		"\u0210\u0007\u0005\u0000\u0000\u0210!\u0001\u0000\u0000\u0000\u0211\u021e"+
		"\u0005\u0007\u0000\u0000\u0212\u0213\u0003:\u001d\u0000\u0213\u0214\u0005"+
		"\u0002\u0000\u0000\u0214\u0215\u0005\u0007\u0000\u0000\u0215\u021e\u0001"+
		"\u0000\u0000\u0000\u0216\u021b\u00030\u0018\u0000\u0217\u0219\u00058\u0000"+
		"\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0003N\'\u0000"+
		"\u021b\u0218\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u0211\u0001\u0000\u0000\u0000"+
		"\u021d\u0212\u0001\u0000\u0000\u0000\u021d\u0216\u0001\u0000\u0000\u0000"+
		"\u021e#\u0001\u0000\u0000\u0000\u021f\u0220\u00038\u001c\u0000\u0220\u0221"+
		"\u0005\u0002\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224"+
		"\u0001\u0000\u0000\u0000\u0224\u0229\u0003:\u001d\u0000\u0225\u0227\u0005"+
		"8\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0003J%\u0000"+
		"\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a\u0230\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0088\u0000\u0000"+
		"\u022c\u022d\u00050\u0000\u0000\u022d\u0231\u0003>\u001f\u0000\u022e\u022f"+
		"\u0005\'\u0000\u0000\u022f\u0231\u0005\u0088\u0000\u0000\u0230\u022b\u0001"+
		"\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001"+
		"\u0000\u0000\u0000\u0231\u024a\u0001\u0000\u0000\u0000\u0232\u023c\u0005"+
		"\u0003\u0000\u0000\u0233\u0238\u0003$\u0012\u0000\u0234\u0235\u0005\u0005"+
		"\u0000\u0000\u0235\u0237\u0003$\u0012\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023d\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023d\u0003&\u0013\u0000"+
		"\u023c\u0233\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0005\u0004\u0000\u0000"+
		"\u023f\u024a\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u0003\u0000\u0000"+
		"\u0241\u0242\u0003\u0006\u0003\u0000\u0242\u0247\u0005\u0004\u0000\u0000"+
		"\u0243\u0245\u00058\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u0248\u0003J%\u0000\u0247\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0222\u0001"+
		"\u0000\u0000\u0000\u0249\u0232\u0001\u0000\u0000\u0000\u0249\u0240\u0001"+
		"\u0000\u0000\u0000\u024a%\u0001\u0000\u0000\u0000\u024b\u0252\u0003$\u0012"+
		"\u0000\u024c\u024d\u0003(\u0014\u0000\u024d\u024e\u0003$\u0012\u0000\u024e"+
		"\u024f\u0003*\u0015\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u024c"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\'\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0263\u0005"+
		"\u0005\u0000\u0000\u0256\u0258\u0005\u0089\u0000\u0000\u0257\u0256\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025f\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u0005;\u0000\u0000\u025a\u025c\u0005>\u0000"+
		"\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u0260\u0001\u0000\u0000\u0000\u025d\u0260\u0005=\u0000\u0000"+
		"\u025e\u0260\u0005\u008a\u0000\u0000\u025f\u0259\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u0263\u0005:\u0000\u0000\u0262\u0255\u0001\u0000\u0000\u0000\u0262"+
		"\u0257\u0001\u0000\u0000\u0000\u0263)\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u00059\u0000\u0000\u0265\u0274\u00030\u0018\u0000\u0266\u0267\u0005\u008b"+
		"\u0000\u0000\u0267\u0268\u0005\u0003\u0000\u0000\u0268\u026d\u0003<\u001e"+
		"\u0000\u0269\u026a\u0005\u0005\u0000\u0000\u026a\u026c\u0003<\u001e\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000"+
		"\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000"+
		"\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0005\u0004\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000"+
		"\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0264\u0001\u0000\u0000\u0000"+
		"\u0273\u0266\u0001\u0000\u0000\u0000\u0273\u0272\u0001\u0000\u0000\u0000"+
		"\u0274+\u0001\u0000\u0000\u0000\u0275\u0278\u00030\u0018\u0000\u0276\u0277"+
		"\u0005\u0086\u0000\u0000\u0277\u0279\u0003R)\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000"+
		"\u0000\u0000\u027a\u027c\u0007\u0002\u0000\u0000\u027b\u027a\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027f\u0001\u0000"+
		"\u0000\u0000\u027d\u027e\u0005\u008c\u0000\u0000\u027e\u0280\u0007\u0006"+
		"\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280-\u0001\u0000\u0000\u0000\u0281\u0284\u0003<\u001e\u0000"+
		"\u0282\u0284\u00030\u0018\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283"+
		"\u0282\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0005\u0086\u0000\u0000\u0286\u0288\u0003R)\u0000\u0287\u0285\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001"+
		"\u0000\u0000\u0000\u0289\u028b\u0007\u0002\u0000\u0000\u028a\u0289\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b/\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0006\u0018\uffff\uffff\u0000\u028d\u02d1\u0003"+
		"2\u0019\u0000\u028e\u02d1\u0003d2\u0000\u028f\u0290\u00038\u001c\u0000"+
		"\u0290\u0291\u0005\u0002\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000"+
		"\u0292\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0003:\u001d\u0000\u0295"+
		"\u0296\u0005\u0002\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297"+
		"\u0292\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0001\u0000\u0000\u0000\u0299\u02d1\u0003<\u001e\u0000\u029a\u029b"+
		"\u00034\u001a\u0000\u029b\u029c\u00030\u0018\u000b\u029c\u02d1\u0001\u0000"+
		"\u0000\u0000\u029d\u029e\u0003V+\u0000\u029e\u02aa\u0005\u0003\u0000\u0000"+
		"\u029f\u02a1\u00057\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a7\u00030\u0018\u0000\u02a3\u02a4\u0005\u0005\u0000\u0000\u02a4\u02a6"+
		"\u00030\u0018\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02aa\u02a0\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005"+
		"\u0004\u0000\u0000\u02ad\u02d1\u0001\u0000\u0000\u0000\u02ae\u02af\u0005"+
		"\u0003\u0000\u0000\u02af\u02b0\u00030\u0018\u0000\u02b0\u02b1\u0005\u0004"+
		"\u0000\u0000\u02b1\u02d1\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005B\u0000"+
		"\u0000\u02b3\u02b5\u00030\u0018\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02bb\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0005C\u0000\u0000\u02b7\u02b8\u00030\u0018\u0000\u02b8\u02b9"+
		"\u0005D\u0000\u0000\u02b9\u02ba\u00030\u0018\u0000\u02ba\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000"+
		"\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005E\u0000"+
		"\u0000\u02c0\u02c2\u00030\u0018\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0005F\u0000\u0000\u02c4\u02d1\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0005A\u0000\u0000\u02c6\u02c7\u0005\u0003\u0000\u0000\u02c7\u02c8"+
		"\u0003\u0006\u0003\u0000\u02c8\u02c9\u0005\u0004\u0000\u0000\u02c9\u02d1"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\'\u0000\u0000\u02cb\u02cc\u0005"+
		"A\u0000\u0000\u02cc\u02cd\u0005\u0003\u0000\u0000\u02cd\u02ce\u0003\u0006"+
		"\u0003\u0000\u02ce\u02cf\u0005\u0004\u0000\u0000\u02cf\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d0\u028c\u0001\u0000\u0000\u0000\u02d0\u028e\u0001\u0000"+
		"\u0000\u0000\u02d0\u0297\u0001\u0000\u0000\u0000\u02d0\u029a\u0001\u0000"+
		"\u0000\u0000\u02d0\u029d\u0001\u0000\u0000\u0000\u02d0\u02ae\u0001\u0000"+
		"\u0000\u0000\u02d0\u02b2\u0001\u0000\u0000\u0000\u02d0\u02c5\u0001\u0000"+
		"\u0000\u0000\u02d0\u02ca\u0001\u0000\u0000\u0000\u02d1\u0304\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\n\n\u0000\u0000\u02d3\u02d4\u00036\u001b\u0000"+
		"\u02d4\u02d5\u00030\u0018\u000b\u02d5\u0303\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d8\n\u0003\u0000\u0000\u02d7\u02d9\u0005\'\u0000\u0000\u02d8\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02da\u02db\u0005.\u0000\u0000\u02db\u02dc\u0003"+
		"0\u0018\u0000\u02dc\u02dd\u0005%\u0000\u0000\u02dd\u02de\u00030\u0018"+
		"\u0004\u02de\u0303\u0001\u0000\u0000\u0000\u02df\u02e0\n\u0001\u0000\u0000"+
		"\u02e0\u02e2\u0005+\u0000\u0000\u02e1\u02e3\u0005\'\u0000\u0000\u02e2"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e4\u0303\u00030\u0018\u0002\u02e5\u02e7"+
		"\n\u0004\u0000\u0000\u02e6\u02e8\u0005\'\u0000\u0000\u02e7\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0005,\u0000\u0000\u02ea\u02f4\u0005\u0003"+
		"\u0000\u0000\u02eb\u02f5\u0003\u0006\u0003\u0000\u02ec\u02f1\u00030\u0018"+
		"\u0000\u02ed\u02ee\u0005\u0005\u0000\u0000\u02ee\u02f0\u00030\u0018\u0000"+
		"\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f5\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f4\u02eb\u0001\u0000\u0000\u0000\u02f4\u02ec\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005\u0004\u0000\u0000"+
		"\u02f7\u0303\u0001\u0000\u0000\u0000\u02f8\u02fa\n\u0002\u0000\u0000\u02f9"+
		"\u02fb\u0005\'\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005-\u0000\u0000\u02fd\u0300\u00030\u0018\u0000\u02fe\u02ff\u0005\u008f"+
		"\u0000\u0000\u02ff\u0301\u00030\u0018\u0000\u0300\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0303\u0001\u0000\u0000"+
		"\u0000\u0302\u02d2\u0001\u0000\u0000\u0000\u0302\u02d6\u0001\u0000\u0000"+
		"\u0000\u0302\u02df\u0001\u0000\u0000\u0000\u0302\u02e5\u0001\u0000\u0000"+
		"\u0000\u0302\u02f8\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u03051\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0007\u0007\u0000\u0000\u03083\u0001\u0000\u0000\u0000\u0309"+
		"\u030a\u0007\b\u0000\u0000\u030a5\u0001\u0000\u0000\u0000\u030b\u030c"+
		"\u0007\t\u0000\u0000\u030c7\u0001\u0000\u0000\u0000\u030d\u030e\u0003"+
		"Z-\u0000\u030e9\u0001\u0000\u0000\u0000\u030f\u0310\u0003Z-\u0000\u0310"+
		";\u0001\u0000\u0000\u0000\u0311\u0312\u0003Z-\u0000\u0312=\u0001\u0000"+
		"\u0000\u0000\u0313\u0314\u0003Z-\u0000\u0314?\u0001\u0000\u0000\u0000"+
		"\u0315\u0316\u0003Z-\u0000\u0316A\u0001\u0000\u0000\u0000\u0317\u0318"+
		"\u0003Z-\u0000\u0318C\u0001\u0000\u0000\u0000\u0319\u031a\u0003Z-\u0000"+
		"\u031aE\u0001\u0000\u0000\u0000\u031b\u031c\u0003Z-\u0000\u031cG\u0001"+
		"\u0000\u0000\u0000\u031d\u031e\u0003Z-\u0000\u031eI\u0001\u0000\u0000"+
		"\u0000\u031f\u0320\u0003Z-\u0000\u0320K\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0003Z-\u0000\u0322M\u0001\u0000\u0000\u0000\u0323\u0324\u0003"+
		"Z-\u0000\u0324O\u0001\u0000\u0000\u0000\u0325\u0326\u0003Z-\u0000\u0326"+
		"Q\u0001\u0000\u0000\u0000\u0327\u0328\u0003Z-\u0000\u0328S\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\u0003Z-\u0000\u032aU\u0001\u0000\u0000\u0000"+
		"\u032b\u032c\u0003Z-\u0000\u032cW\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0003Z-\u0000\u032eY\u0001\u0000\u0000\u0000\u032f\u0337\u0005\u009d"+
		"\u0000\u0000\u0330\u0337\u0003\\.\u0000\u0331\u0337\u0005\u00a0\u0000"+
		"\u0000\u0332\u0333\u0005\u0003\u0000\u0000\u0333\u0334\u0003Z-\u0000\u0334"+
		"\u0335\u0005\u0004\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336"+
		"\u032f\u0001\u0000\u0000\u0000\u0336\u0330\u0001\u0000\u0000\u0000\u0336"+
		"\u0331\u0001\u0000\u0000\u0000\u0336\u0332\u0001\u0000\u0000\u0000\u0337"+
		"[\u0001\u0000\u0000\u0000\u0338\u0339\u0007\n\u0000\u0000\u0339]\u0001"+
		"\u0000\u0000\u0000\u033a\u033c\u0003`0\u0000\u033b\u033a\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000"+
		"\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e_\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0003Z-\u0000\u0340a\u0001\u0000\u0000\u0000\u0341\u0343"+
		"\u0007\u000b\u0000\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u0005\u009e\u0000\u0000\u0345c\u0001\u0000\u0000\u0000\u0346\u0347\u0005"+
		"\u009f\u0000\u0000\u0347e\u0001\u0000\u0000\u0000\u0348\u034c\u0003b1"+
		"\u0000\u0349\u034c\u0003`0\u0000\u034a\u034c\u0005\u00a0\u0000\u0000\u034b"+
		"\u0348\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b"+
		"\u034a\u0001\u0000\u0000\u0000\u034cg\u0001\u0000\u0000\u0000pkt{\u0080"+
		"\u0086\u0092\u0097\u009e\u00a7\u00aa\u00ae\u00b7\u00bc\u00be\u00c7\u00ca"+
		"\u00d0\u00d2\u00de\u00e3\u00ec\u00f7\u00fe\u0102\u0112\u0117\u011f\u0124"+
		"\u012a\u0133\u013a\u0141\u0145\u014b\u0156\u015c\u0163\u0168\u016e\u0171"+
		"\u017a\u017f\u0185\u018a\u018f\u0194\u0197\u019a\u019f\u01a3\u01b1\u01b6"+
		"\u01ba\u01bf\u01c7\u01cc\u01db\u01e1\u01eb\u01f0\u01fc\u0200\u0204\u0209"+
		"\u020b\u0218\u021b\u021d\u0222\u0226\u0229\u0230\u0238\u023c\u0244\u0247"+
		"\u0249\u0252\u0257\u025b\u025f\u0262\u026d\u0273\u0278\u027b\u027f\u0283"+
		"\u0287\u028a\u0292\u0297\u02a0\u02a7\u02aa\u02b4\u02bd\u02c1\u02d0\u02d8"+
		"\u02e2\u02e7\u02f1\u02f4\u02fa\u0300\u0302\u0304\u0336\u033d\u0342\u034b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}