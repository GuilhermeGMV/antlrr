// Generated from CypherParser.g4 by ANTLR 4.9.3

package com.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, ADD_ASSIGN=2, LE=3, GE=4, GT=5, LT=6, NOT_EQUAL=7, RANGE=8, 
		SEMI=9, DOT=10, COMMA=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, 
		LBRACK=16, RBRACK=17, SUB=18, PLUS=19, DIV=20, MOD=21, CARET=22, MULT=23, 
		ESC=24, COLON=25, STICK=26, DOLLAR=27, CALL=28, YIELD=29, FILTER=30, EXTRACT=31, 
		COUNT=32, ANY=33, NONE=34, SINGLE=35, ALL=36, ASC=37, ASCENDING=38, BY=39, 
		CREATE=40, DELETE=41, DESC=42, DESCENDING=43, DETACH=44, EXISTS=45, LIMIT=46, 
		MATCH=47, MERGE=48, ON=49, OPTIONAL=50, ORDER=51, REMOVE=52, RETURN=53, 
		SET=54, SKIP_W=55, WHERE=56, WITH=57, UNION=58, UNWIND=59, AND=60, AS=61, 
		CONTAINS=62, DISTINCT=63, ENDS=64, IN=65, IS=66, NOT=67, OR=68, STARTS=69, 
		XOR=70, FALSE=71, TRUE=72, NULL_W=73, CONSTRAINT=74, DO=75, FOR=76, REQUIRE=77, 
		UNIQUE=78, CASE=79, WHEN=80, THEN=81, ELSE=82, END=83, MANDATORY=84, SCALAR=85, 
		OF=86, ADD=87, DROP=88, ID=89, ESC_LITERAL=90, CHAR_LITERAL=91, STRING_LITERAL=92, 
		DIGIT=93, FLOAT=94, WS=95, COMMENT=96, LINE_COMMENT=97, ERRCHAR=98, Letter=99;
	public static final int
		RULE_script = 0, RULE_query = 1, RULE_regularQuery = 2, RULE_singleQuery = 3, 
		RULE_standaloneCall = 4, RULE_returnSt = 5, RULE_withSt = 6, RULE_skipSt = 7, 
		RULE_limitSt = 8, RULE_projectionBody = 9, RULE_projectionItems = 10, 
		RULE_projectionItem = 11, RULE_orderItem = 12, RULE_orderSt = 13, RULE_singlePartQ = 14, 
		RULE_multiPartQ = 15, RULE_matchSt = 16, RULE_unwindSt = 17, RULE_readingStatement = 18, 
		RULE_updatingStatement = 19, RULE_deleteSt = 20, RULE_removeSt = 21, RULE_removeItem = 22, 
		RULE_queryCallSt = 23, RULE_parenExpressionChain = 24, RULE_yieldItems = 25, 
		RULE_yieldItem = 26, RULE_mergeSt = 27, RULE_mergeAction = 28, RULE_setSt = 29, 
		RULE_setItem = 30, RULE_nodeLabels = 31, RULE_createSt = 32, RULE_patternWhere = 33, 
		RULE_where = 34, RULE_pattern = 35, RULE_expression = 36, RULE_xorExpression = 37, 
		RULE_andExpression = 38, RULE_notExpression = 39, RULE_comparisonExpression = 40, 
		RULE_comparisonSigns = 41, RULE_addSubExpression = 42, RULE_multDivExpression = 43, 
		RULE_powerExpression = 44, RULE_unaryAddSubExpression = 45, RULE_atomicExpression = 46, 
		RULE_listExpression = 47, RULE_stringExpression = 48, RULE_stringExpPrefix = 49, 
		RULE_nullExpression = 50, RULE_propertyOrLabelExpression = 51, RULE_propertyExpression = 52, 
		RULE_patternPart = 53, RULE_patternElem = 54, RULE_patternElemChain = 55, 
		RULE_properties = 56, RULE_nodePattern = 57, RULE_atom = 58, RULE_lhs = 59, 
		RULE_relationshipPattern = 60, RULE_relationDetail = 61, RULE_relationshipTypes = 62, 
		RULE_unionSt = 63, RULE_subqueryExist = 64, RULE_invocationName = 65, 
		RULE_functionInvocation = 66, RULE_parenthesizedExpression = 67, RULE_filterWith = 68, 
		RULE_patternComprehension = 69, RULE_relationshipsChainPattern = 70, RULE_listComprehension = 71, 
		RULE_filterExpression = 72, RULE_countAll = 73, RULE_expressionChain = 74, 
		RULE_caseExpression = 75, RULE_parameter = 76, RULE_literal = 77, RULE_rangeLit = 78, 
		RULE_boolLit = 79, RULE_numLit = 80, RULE_stringLit = 81, RULE_charLit = 82, 
		RULE_listLit = 83, RULE_mapLit = 84, RULE_mapPair = 85, RULE_name = 86, 
		RULE_symbol = 87, RULE_reservedWord = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "query", "regularQuery", "singleQuery", "standaloneCall", "returnSt", 
			"withSt", "skipSt", "limitSt", "projectionBody", "projectionItems", "projectionItem", 
			"orderItem", "orderSt", "singlePartQ", "multiPartQ", "matchSt", "unwindSt", 
			"readingStatement", "updatingStatement", "deleteSt", "removeSt", "removeItem", 
			"queryCallSt", "parenExpressionChain", "yieldItems", "yieldItem", "mergeSt", 
			"mergeAction", "setSt", "setItem", "nodeLabels", "createSt", "patternWhere", 
			"where", "pattern", "expression", "xorExpression", "andExpression", "notExpression", 
			"comparisonExpression", "comparisonSigns", "addSubExpression", "multDivExpression", 
			"powerExpression", "unaryAddSubExpression", "atomicExpression", "listExpression", 
			"stringExpression", "stringExpPrefix", "nullExpression", "propertyOrLabelExpression", 
			"propertyExpression", "patternPart", "patternElem", "patternElemChain", 
			"properties", "nodePattern", "atom", "lhs", "relationshipPattern", "relationDetail", 
			"relationshipTypes", "unionSt", "subqueryExist", "invocationName", "functionInvocation", 
			"parenthesizedExpression", "filterWith", "patternComprehension", "relationshipsChainPattern", 
			"listComprehension", "filterExpression", "countAll", "expressionChain", 
			"caseExpression", "parameter", "literal", "rangeLit", "boolLit", "numLit", 
			"stringLit", "charLit", "listLit", "mapLit", "mapPair", "name", "symbol", 
			"reservedWord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'<='", "'>='", "'>'", "'<'", "'<>'", "'..'", "';'", 
			"'.'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'-'", "'+'", 
			"'/'", "'%'", "'^'", "'*'", "'`'", "':'", "'|'", "'$'", "'CALL'", "'YIELD'", 
			"'FILTER'", "'EXTRACT'", "'COUNT'", "'ANY'", "'NONE'", "'SINGLE'", "'ALL'", 
			"'ASC'", "'ASCENDING'", "'BY'", "'CREATE'", "'DELETE'", "'DESC'", "'DESCENDING'", 
			"'DETACH'", "'EXISTS'", "'LIMIT'", "'MATCH'", "'MERGE'", "'ON'", "'OPTIONAL'", 
			"'ORDER'", "'REMOVE'", "'RETURN'", "'SET'", "'SKIP'", "'WHERE'", "'WITH'", 
			"'UNION'", "'UNWIND'", "'AND'", "'AS'", "'CONTAINS'", "'DISTINCT'", "'ENDS'", 
			"'IN'", "'IS'", "'NOT'", "'OR'", "'STARTS'", "'XOR'", "'FALSE'", "'TRUE'", 
			"'NULL'", "'CONSTRAINT'", "'DO'", "'FOR'", "'REQUIRE'", "'UNIQUE'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'MANDATORY'", "'SCALAR'", "'OF'", 
			"'ADD'", "'DROP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "ADD_ASSIGN", "LE", "GE", "GT", "LT", "NOT_EQUAL", "RANGE", 
			"SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SUB", "PLUS", "DIV", "MOD", "CARET", "MULT", "ESC", "COLON", 
			"STICK", "DOLLAR", "CALL", "YIELD", "FILTER", "EXTRACT", "COUNT", "ANY", 
			"NONE", "SINGLE", "ALL", "ASC", "ASCENDING", "BY", "CREATE", "DELETE", 
			"DESC", "DESCENDING", "DETACH", "EXISTS", "LIMIT", "MATCH", "MERGE", 
			"ON", "OPTIONAL", "ORDER", "REMOVE", "RETURN", "SET", "SKIP_W", "WHERE", 
			"WITH", "UNION", "UNWIND", "AND", "AS", "CONTAINS", "DISTINCT", "ENDS", 
			"IN", "IS", "NOT", "OR", "STARTS", "XOR", "FALSE", "TRUE", "NULL_W", 
			"CONSTRAINT", "DO", "FOR", "REQUIRE", "UNIQUE", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "MANDATORY", "SCALAR", "OF", "ADD", "DROP", "ID", "ESC_LITERAL", 
			"CHAR_LITERAL", "STRING_LITERAL", "DIGIT", "FLOAT", "WS", "COMMENT", 
			"LINE_COMMENT", "ERRCHAR", "Letter"
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
	public String getGrammarFileName() { return "CypherParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CypherParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CypherParser.EOF, 0); }
		public TerminalNode SEMI() { return getToken(CypherParser.SEMI, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			query();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(179);
				match(SEMI);
				}
			}

			setState(182);
			match(EOF);
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

	public static class QueryContext extends ParserRuleContext {
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public StandaloneCallContext standaloneCall() {
			return getRuleContext(StandaloneCallContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				regularQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				standaloneCall();
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

	public static class RegularQueryContext extends ParserRuleContext {
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public List<UnionStContext> unionSt() {
			return getRuleContexts(UnionStContext.class);
		}
		public UnionStContext unionSt(int i) {
			return getRuleContext(UnionStContext.class,i);
		}
		public RegularQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRegularQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRegularQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRegularQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularQueryContext regularQuery() throws RecognitionException {
		RegularQueryContext _localctx = new RegularQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regularQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			singleQuery();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(189);
				unionSt();
				}
				}
				setState(194);
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

	public static class SingleQueryContext extends ParserRuleContext {
		public SinglePartQContext singlePartQ() {
			return getRuleContext(SinglePartQContext.class,0);
		}
		public MultiPartQContext multiPartQ() {
			return getRuleContext(MultiPartQContext.class,0);
		}
		public SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSingleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSingleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSingleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQueryContext singleQuery() throws RecognitionException {
		SingleQueryContext _localctx = new SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleQuery);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				singlePartQ();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				multiPartQ();
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

	public static class StandaloneCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public ParenExpressionChainContext parenExpressionChain() {
			return getRuleContext(ParenExpressionChainContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public YieldItemsContext yieldItems() {
			return getRuleContext(YieldItemsContext.class,0);
		}
		public StandaloneCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStandaloneCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStandaloneCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStandaloneCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneCallContext standaloneCall() throws RecognitionException {
		StandaloneCallContext _localctx = new StandaloneCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standaloneCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CALL);
			setState(200);
			invocationName();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(201);
				parenExpressionChain();
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YIELD) {
				{
				setState(204);
				match(YIELD);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(205);
					match(MULT);
					}
					break;
				case FILTER:
				case EXTRACT:
				case COUNT:
				case ANY:
				case NONE:
				case SINGLE:
				case ID:
				case ESC_LITERAL:
					{
					setState(206);
					yieldItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ReturnStContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ProjectionBodyContext projectionBody() {
			return getRuleContext(ProjectionBodyContext.class,0);
		}
		public ReturnStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReturnSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReturnSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReturnSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStContext returnSt() throws RecognitionException {
		ReturnStContext _localctx = new ReturnStContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RETURN);
			setState(212);
			projectionBody();
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

	public static class WithStContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public ProjectionBodyContext projectionBody() {
			return getRuleContext(ProjectionBodyContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public WithStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterWithSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitWithSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitWithSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStContext withSt() throws RecognitionException {
		WithStContext _localctx = new WithStContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_withSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(WITH);
			setState(215);
			projectionBody();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(216);
				where();
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

	public static class SkipStContext extends ParserRuleContext {
		public TerminalNode SKIP_W() { return getToken(CypherParser.SKIP_W, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SkipStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSkipSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSkipSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSkipSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStContext skipSt() throws RecognitionException {
		SkipStContext _localctx = new SkipStContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_skipSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(SKIP_W);
			setState(220);
			expression();
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

	public static class LimitStContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(CypherParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLimitSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLimitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLimitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStContext limitSt() throws RecognitionException {
		LimitStContext _localctx = new LimitStContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limitSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LIMIT);
			setState(223);
			expression();
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

	public static class ProjectionBodyContext extends ParserRuleContext {
		public ProjectionItemsContext projectionItems() {
			return getRuleContext(ProjectionItemsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public OrderStContext orderSt() {
			return getRuleContext(OrderStContext.class,0);
		}
		public SkipStContext skipSt() {
			return getRuleContext(SkipStContext.class,0);
		}
		public LimitStContext limitSt() {
			return getRuleContext(LimitStContext.class,0);
		}
		public ProjectionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionBodyContext projectionBody() throws RecognitionException {
		ProjectionBodyContext _localctx = new ProjectionBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_projectionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(225);
				match(DISTINCT);
				}
			}

			setState(228);
			projectionItems();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(229);
				orderSt();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_W) {
				{
				setState(232);
				skipSt();
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(235);
				limitSt();
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

	public static class ProjectionItemsContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public List<ProjectionItemContext> projectionItem() {
			return getRuleContexts(ProjectionItemContext.class);
		}
		public ProjectionItemContext projectionItem(int i) {
			return getRuleContext(ProjectionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ProjectionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionItemsContext projectionItems() throws RecognitionException {
		ProjectionItemsContext _localctx = new ProjectionItemsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_projectionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				{
				setState(238);
				match(MULT);
				}
				break;
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case SUB:
			case PLUS:
			case DOLLAR:
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ALL:
			case EXISTS:
			case NOT:
			case FALSE:
			case TRUE:
			case NULL_W:
			case CASE:
			case ID:
			case ESC_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case DIGIT:
				{
				setState(239);
				projectionItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				projectionItem();
				}
				}
				setState(248);
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

	public static class ProjectionItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ProjectionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionItemContext projectionItem() throws RecognitionException {
		ProjectionItemContext _localctx = new ProjectionItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_projectionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(250);
				match(AS);
				setState(251);
				symbol();
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

	public static class OrderItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CypherParser.ASCENDING, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public TerminalNode DESCENDING() { return getToken(CypherParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterOrderItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitOrderItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitOrderItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expression();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASC) | (1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) {
				{
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASC) | (1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
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

	public static class OrderStContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public OrderStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterOrderSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitOrderSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitOrderSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderStContext orderSt() throws RecognitionException {
		OrderStContext _localctx = new OrderStContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ORDER);
			setState(259);
			match(BY);
			setState(260);
			orderItem();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				orderItem();
				}
				}
				setState(267);
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

	public static class SinglePartQContext extends ParserRuleContext {
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
		}
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<UpdatingStatementContext> updatingStatement() {
			return getRuleContexts(UpdatingStatementContext.class);
		}
		public UpdatingStatementContext updatingStatement(int i) {
			return getRuleContext(UpdatingStatementContext.class,i);
		}
		public SinglePartQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlePartQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSinglePartQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSinglePartQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSinglePartQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglePartQContext singlePartQ() throws RecognitionException {
		SinglePartQContext _localctx = new SinglePartQContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_singlePartQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << MATCH) | (1L << OPTIONAL) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(268);
				readingStatement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(274);
				returnSt();
				}
				break;
			case CREATE:
			case DELETE:
			case DETACH:
			case MERGE:
			case REMOVE:
			case SET:
				{
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					updatingStatement();
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DETACH) | (1L << MERGE) | (1L << REMOVE) | (1L << SET))) != 0) );
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(280);
					returnSt();
					}
				}

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

	public static class MultiPartQContext extends ParserRuleContext {
		public SinglePartQContext singlePartQ() {
			return getRuleContext(SinglePartQContext.class,0);
		}
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<WithStContext> withSt() {
			return getRuleContexts(WithStContext.class);
		}
		public WithStContext withSt(int i) {
			return getRuleContext(WithStContext.class,i);
		}
		public List<UpdatingStatementContext> updatingStatement() {
			return getRuleContexts(UpdatingStatementContext.class);
		}
		public UpdatingStatementContext updatingStatement(int i) {
			return getRuleContext(UpdatingStatementContext.class,i);
		}
		public MultiPartQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiPartQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMultiPartQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMultiPartQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMultiPartQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiPartQContext multiPartQ() throws RecognitionException {
		MultiPartQContext _localctx = new MultiPartQContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiPartQ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << MATCH) | (1L << OPTIONAL) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(285);
				readingStatement();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DETACH) | (1L << MERGE) | (1L << REMOVE) | (1L << SET))) != 0)) {
						{
						{
						setState(291);
						updatingStatement();
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(297);
					withSt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(302);
			singlePartQ();
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

	public static class MatchStContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public PatternWhereContext patternWhere() {
			return getRuleContext(PatternWhereContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public MatchStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMatchSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMatchSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMatchSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStContext matchSt() throws RecognitionException {
		MatchStContext _localctx = new MatchStContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matchSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(304);
				match(OPTIONAL);
				}
			}

			setState(307);
			match(MATCH);
			setState(308);
			patternWhere();
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

	public static class UnwindStContext extends ParserRuleContext {
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public UnwindStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwindSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnwindSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnwindSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnwindSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnwindStContext unwindSt() throws RecognitionException {
		UnwindStContext _localctx = new UnwindStContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unwindSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(UNWIND);
			setState(311);
			expression();
			setState(312);
			match(AS);
			setState(313);
			symbol();
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

	public static class ReadingStatementContext extends ParserRuleContext {
		public MatchStContext matchSt() {
			return getRuleContext(MatchStContext.class,0);
		}
		public UnwindStContext unwindSt() {
			return getRuleContext(UnwindStContext.class,0);
		}
		public QueryCallStContext queryCallSt() {
			return getRuleContext(QueryCallStContext.class,0);
		}
		public ReadingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReadingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReadingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReadingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadingStatementContext readingStatement() throws RecognitionException {
		ReadingStatementContext _localctx = new ReadingStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readingStatement);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
			case OPTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				matchSt();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				unwindSt();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				queryCallSt();
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

	public static class UpdatingStatementContext extends ParserRuleContext {
		public CreateStContext createSt() {
			return getRuleContext(CreateStContext.class,0);
		}
		public MergeStContext mergeSt() {
			return getRuleContext(MergeStContext.class,0);
		}
		public DeleteStContext deleteSt() {
			return getRuleContext(DeleteStContext.class,0);
		}
		public SetStContext setSt() {
			return getRuleContext(SetStContext.class,0);
		}
		public RemoveStContext removeSt() {
			return getRuleContext(RemoveStContext.class,0);
		}
		public UpdatingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUpdatingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUpdatingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUpdatingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatingStatementContext updatingStatement() throws RecognitionException {
		UpdatingStatementContext _localctx = new UpdatingStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_updatingStatement);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				createSt();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				mergeSt();
				}
				break;
			case DELETE:
			case DETACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				deleteSt();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				setSt();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				removeSt();
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

	public static class DeleteStContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public DeleteStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterDeleteSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitDeleteSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitDeleteSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStContext deleteSt() throws RecognitionException {
		DeleteStContext _localctx = new DeleteStContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_deleteSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETACH) {
				{
				setState(327);
				match(DETACH);
				}
			}

			setState(330);
			match(DELETE);
			setState(331);
			expressionChain();
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

	public static class RemoveStContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public List<RemoveItemContext> removeItem() {
			return getRuleContexts(RemoveItemContext.class);
		}
		public RemoveItemContext removeItem(int i) {
			return getRuleContext(RemoveItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public RemoveStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRemoveSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRemoveSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRemoveSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveStContext removeSt() throws RecognitionException {
		RemoveStContext _localctx = new RemoveStContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_removeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(REMOVE);
			setState(334);
			removeItem();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				removeItem();
				}
				}
				setState(341);
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

	public static class RemoveItemContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public RemoveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRemoveItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRemoveItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRemoveItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveItemContext removeItem() throws RecognitionException {
		RemoveItemContext _localctx = new RemoveItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_removeItem);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				symbol();
				setState(343);
				nodeLabels();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				propertyExpression();
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

	public static class QueryCallStContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public ParenExpressionChainContext parenExpressionChain() {
			return getRuleContext(ParenExpressionChainContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public YieldItemsContext yieldItems() {
			return getRuleContext(YieldItemsContext.class,0);
		}
		public QueryCallStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryCallSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterQueryCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitQueryCallSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitQueryCallSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryCallStContext queryCallSt() throws RecognitionException {
		QueryCallStContext _localctx = new QueryCallStContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryCallSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(CALL);
			setState(349);
			invocationName();
			setState(350);
			parenExpressionChain();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YIELD) {
				{
				setState(351);
				match(YIELD);
				setState(352);
				yieldItems();
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

	public static class ParenExpressionChainContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public ParenExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParenExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParenExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParenExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExpressionChainContext parenExpressionChain() throws RecognitionException {
		ParenExpressionChainContext _localctx = new ParenExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parenExpressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LPAREN);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(356);
				expressionChain();
				}
			}

			setState(359);
			match(RPAREN);
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

	public static class YieldItemsContext extends ParserRuleContext {
		public List<YieldItemContext> yieldItem() {
			return getRuleContexts(YieldItemContext.class);
		}
		public YieldItemContext yieldItem(int i) {
			return getRuleContext(YieldItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public YieldItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterYieldItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitYieldItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitYieldItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldItemsContext yieldItems() throws RecognitionException {
		YieldItemsContext _localctx = new YieldItemsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_yieldItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			yieldItem();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				yieldItem();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(369);
				where();
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

	public static class YieldItemContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterYieldItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitYieldItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitYieldItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldItemContext yieldItem() throws RecognitionException {
		YieldItemContext _localctx = new YieldItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_yieldItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(372);
				symbol();
				setState(373);
				match(AS);
				}
				break;
			}
			setState(377);
			symbol();
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

	public static class MergeStContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public PatternPartContext patternPart() {
			return getRuleContext(PatternPartContext.class,0);
		}
		public List<MergeActionContext> mergeAction() {
			return getRuleContexts(MergeActionContext.class);
		}
		public MergeActionContext mergeAction(int i) {
			return getRuleContext(MergeActionContext.class,i);
		}
		public MergeStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMergeSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMergeSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMergeSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStContext mergeSt() throws RecognitionException {
		MergeStContext _localctx = new MergeStContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mergeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(MERGE);
			setState(380);
			patternPart();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(381);
				mergeAction();
				}
				}
				setState(386);
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

	public static class MergeActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public SetStContext setSt() {
			return getRuleContext(SetStContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public MergeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMergeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMergeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMergeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeActionContext mergeAction() throws RecognitionException {
		MergeActionContext _localctx = new MergeActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mergeAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ON);
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==CREATE || _la==MATCH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(389);
			setSt();
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

	public static class SetStContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public List<SetItemContext> setItem() {
			return getRuleContexts(SetItemContext.class);
		}
		public SetItemContext setItem(int i) {
			return getRuleContext(SetItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SetStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSetSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSetSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSetSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStContext setSt() throws RecognitionException {
		SetStContext _localctx = new SetStContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_setSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(SET);
			setState(392);
			setItem();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(394);
				setItem();
				}
				}
				setState(399);
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

	public static class SetItemContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(CypherParser.ADD_ASSIGN, 0); }
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public SetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSetItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSetItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSetItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetItemContext setItem() throws RecognitionException {
		SetItemContext _localctx = new SetItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setItem);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				propertyExpression();
				setState(401);
				match(ASSIGN);
				setState(402);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				symbol();
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ADD_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				symbol();
				setState(409);
				nodeLabels();
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

	public static class NodeLabelsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NodeLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNodeLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNodeLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNodeLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelsContext nodeLabels() throws RecognitionException {
		NodeLabelsContext _localctx = new NodeLabelsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nodeLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				match(COLON);
				setState(414);
				name();
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
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

	public static class CreateStContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public CreateStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCreateSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCreateSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCreateSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStContext createSt() throws RecognitionException {
		CreateStContext _localctx = new CreateStContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(CREATE);
			setState(420);
			pattern();
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

	public static class PatternWhereContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public PatternWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternWhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternWhereContext patternWhere() throws RecognitionException {
		PatternWhereContext _localctx = new PatternWhereContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_patternWhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			pattern();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(423);
				where();
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(WHERE);
			setState(427);
			expression();
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

	public static class PatternContext extends ParserRuleContext {
		public List<PatternPartContext> patternPart() {
			return getRuleContexts(PatternPartContext.class);
		}
		public PatternPartContext patternPart(int i) {
			return getRuleContext(PatternPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			patternPart();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(430);
				match(COMMA);
				setState(431);
				patternPart();
				}
				}
				setState(436);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<XorExpressionContext> xorExpression() {
			return getRuleContexts(XorExpressionContext.class);
		}
		public XorExpressionContext xorExpression(int i) {
			return getRuleContext(XorExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CypherParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CypherParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			xorExpression();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(438);
				match(OR);
				setState(439);
				xorExpression();
				}
				}
				setState(444);
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

	public static class XorExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(CypherParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(CypherParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_xorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			andExpression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(446);
				match(XOR);
				setState(447);
				andExpression();
				}
				}
				setState(452);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<NotExpressionContext> notExpression() {
			return getRuleContexts(NotExpressionContext.class);
		}
		public NotExpressionContext notExpression(int i) {
			return getRuleContext(NotExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CypherParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CypherParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			notExpression();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(454);
				match(AND);
				setState(455);
				notExpression();
				}
				}
				setState(460);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_notExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(461);
				match(NOT);
				}
			}

			setState(464);
			comparisonExpression();
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AddSubExpressionContext> addSubExpression() {
			return getRuleContexts(AddSubExpressionContext.class);
		}
		public AddSubExpressionContext addSubExpression(int i) {
			return getRuleContext(AddSubExpressionContext.class,i);
		}
		public List<ComparisonSignsContext> comparisonSigns() {
			return getRuleContexts(ComparisonSignsContext.class);
		}
		public ComparisonSignsContext comparisonSigns(int i) {
			return getRuleContext(ComparisonSignsContext.class,i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			addSubExpression();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(467);
				comparisonSigns();
				setState(468);
				addSubExpression();
				}
				}
				setState(474);
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

	public static class ComparisonSignsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public TerminalNode LE() { return getToken(CypherParser.LE, 0); }
		public TerminalNode GE() { return getToken(CypherParser.GE, 0); }
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CypherParser.NOT_EQUAL, 0); }
		public ComparisonSignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonSigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterComparisonSigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitComparisonSigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitComparisonSigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonSignsContext comparisonSigns() throws RecognitionException {
		ComparisonSignsContext _localctx = new ComparisonSignsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comparisonSigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT) | (1L << NOT_EQUAL))) != 0)) ) {
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

	public static class AddSubExpressionContext extends ParserRuleContext {
		public List<MultDivExpressionContext> multDivExpression() {
			return getRuleContexts(MultDivExpressionContext.class);
		}
		public MultDivExpressionContext multDivExpression(int i) {
			return getRuleContext(MultDivExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CypherParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CypherParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CypherParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CypherParser.SUB, i);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			multDivExpression();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==PLUS) {
				{
				{
				setState(478);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				multDivExpression();
				}
				}
				setState(484);
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

	public static class MultDivExpressionContext extends ParserRuleContext {
		public List<PowerExpressionContext> powerExpression() {
			return getRuleContexts(PowerExpressionContext.class);
		}
		public PowerExpressionContext powerExpression(int i) {
			return getRuleContext(PowerExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CypherParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CypherParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CypherParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CypherParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CypherParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CypherParser.MOD, i);
		}
		public MultDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMultDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMultDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMultDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivExpressionContext multDivExpression() throws RecognitionException {
		MultDivExpressionContext _localctx = new MultDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			powerExpression();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) {
				{
				{
				setState(486);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(487);
				powerExpression();
				}
				}
				setState(492);
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

	public static class PowerExpressionContext extends ParserRuleContext {
		public List<UnaryAddSubExpressionContext> unaryAddSubExpression() {
			return getRuleContexts(UnaryAddSubExpressionContext.class);
		}
		public UnaryAddSubExpressionContext unaryAddSubExpression(int i) {
			return getRuleContext(UnaryAddSubExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CypherParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CypherParser.CARET, i);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			unaryAddSubExpression();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(494);
				match(CARET);
				setState(495);
				unaryAddSubExpression();
				}
				}
				setState(500);
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

	public static class UnaryAddSubExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CypherParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(CypherParser.SUB, 0); }
		public UnaryAddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryAddSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnaryAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnaryAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnaryAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryAddSubExpressionContext unaryAddSubExpression() throws RecognitionException {
		UnaryAddSubExpressionContext _localctx = new UnaryAddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unaryAddSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB || _la==PLUS) {
				{
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(504);
			atomicExpression();
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

	public static class AtomicExpressionContext extends ParserRuleContext {
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public List<ListExpressionContext> listExpression() {
			return getRuleContexts(ListExpressionContext.class);
		}
		public ListExpressionContext listExpression(int i) {
			return getRuleContext(ListExpressionContext.class,i);
		}
		public List<NullExpressionContext> nullExpression() {
			return getRuleContexts(NullExpressionContext.class);
		}
		public NullExpressionContext nullExpression(int i) {
			return getRuleContext(NullExpressionContext.class,i);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atomicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			propertyOrLabelExpression();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LBRACK - 16)) | (1L << (CONTAINS - 16)) | (1L << (ENDS - 16)) | (1L << (IN - 16)) | (1L << (IS - 16)) | (1L << (STARTS - 16)))) != 0)) {
				{
				setState(510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTAINS:
				case ENDS:
				case STARTS:
					{
					setState(507);
					stringExpression();
					}
					break;
				case LBRACK:
				case IN:
					{
					setState(508);
					listExpression();
					}
					break;
				case IS:
					{
					setState(509);
					nullExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(514);
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

	public static class ListExpressionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_listExpression);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(IN);
				setState(516);
				propertyOrLabelExpression();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(LBRACK);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
						{
						setState(518);
						expression();
						}
					}

					setState(521);
					match(RANGE);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
						{
						setState(522);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(525);
					expression();
					}
					break;
				}
				setState(528);
				match(RBRACK);
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

	public static class StringExpressionContext extends ParserRuleContext {
		public StringExpPrefixContext stringExpPrefix() {
			return getRuleContext(StringExpPrefixContext.class,0);
		}
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			stringExpPrefix();
			setState(532);
			propertyOrLabelExpression();
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

	public static class StringExpPrefixContext extends ParserRuleContext {
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public StringExpPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringExpPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringExpPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringExpPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpPrefixContext stringExpPrefix() throws RecognitionException {
		StringExpPrefixContext _localctx = new StringExpPrefixContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringExpPrefix);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(STARTS);
				setState(535);
				match(WITH);
				}
				break;
			case ENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(ENDS);
				setState(537);
				match(WITH);
				}
				break;
			case CONTAINS:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(CONTAINS);
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

	public static class NullExpressionContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullExpressionContext nullExpression() throws RecognitionException {
		NullExpressionContext _localctx = new NullExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nullExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(IS);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(542);
				match(NOT);
				}
			}

			setState(545);
			match(NULL_W);
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

	public static class PropertyOrLabelExpressionContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertyOrLabelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyOrLabelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPropertyOrLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPropertyOrLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPropertyOrLabelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyOrLabelExpressionContext propertyOrLabelExpression() throws RecognitionException {
		PropertyOrLabelExpressionContext _localctx = new PropertyOrLabelExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertyOrLabelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			propertyExpression();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(548);
				nodeLabels();
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

	public static class PropertyExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_propertyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			atom();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(552);
				match(DOT);
				setState(553);
				name();
				}
				}
				setState(558);
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

	public static class PatternPartContext extends ParserRuleContext {
		public PatternElemContext patternElem() {
			return getRuleContext(PatternElemContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public PatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternPartContext patternPart() throws RecognitionException {
		PatternPartContext _localctx = new PatternPartContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_patternPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(559);
				symbol();
				setState(560);
				match(ASSIGN);
				}
			}

			setState(564);
			patternElem();
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

	public static class PatternElemContext extends ParserRuleContext {
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public List<PatternElemChainContext> patternElemChain() {
			return getRuleContexts(PatternElemChainContext.class);
		}
		public PatternElemChainContext patternElemChain(int i) {
			return getRuleContext(PatternElemChainContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public PatternElemContext patternElem() {
			return getRuleContext(PatternElemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public PatternElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElemContext patternElem() throws RecognitionException {
		PatternElemContext _localctx = new PatternElemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_patternElem);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				nodePattern();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT || _la==SUB) {
					{
					{
					setState(567);
					patternElemChain();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(LPAREN);
				setState(574);
				patternElem();
				setState(575);
				match(RPAREN);
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

	public static class PatternElemChainContext extends ParserRuleContext {
		public RelationshipPatternContext relationshipPattern() {
			return getRuleContext(RelationshipPatternContext.class,0);
		}
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public PatternElemChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElemChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternElemChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternElemChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternElemChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElemChainContext patternElemChain() throws RecognitionException {
		PatternElemChainContext _localctx = new PatternElemChainContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_patternElemChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			relationshipPattern();
			setState(580);
			nodePattern();
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

	public static class PropertiesContext extends ParserRuleContext {
		public MapLitContext mapLit() {
			return getRuleContext(MapLitContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_properties);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				mapLit();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				parameter();
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

	public static class NodePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNodePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(LPAREN);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(587);
				symbol();
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(590);
				nodeLabels();
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==DOLLAR) {
				{
				setState(593);
				properties();
				}
			}

			setState(596);
			match(RPAREN);
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

	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CountAllContext countAll() {
			return getRuleContext(CountAllContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public PatternComprehensionContext patternComprehension() {
			return getRuleContext(PatternComprehensionContext.class,0);
		}
		public FilterWithContext filterWith() {
			return getRuleContext(FilterWithContext.class,0);
		}
		public RelationshipsChainPatternContext relationshipsChainPattern() {
			return getRuleContext(RelationshipsChainPatternContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SubqueryExistContext subqueryExist() {
			return getRuleContext(SubqueryExistContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_atom);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				caseExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				countAll();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(602);
				listComprehension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				patternComprehension();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(604);
				filterWith();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(605);
				relationshipsChainPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(606);
				parenthesizedExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(607);
				functionInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(608);
				symbol();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(609);
				subqueryExist();
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

	public static class LhsContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			symbol();
			setState(613);
			match(ASSIGN);
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

	public static class RelationshipPatternContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public List<TerminalNode> SUB() { return getTokens(CypherParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CypherParser.SUB, i);
		}
		public RelationDetailContext relationDetail() {
			return getRuleContext(RelationDetailContext.class,0);
		}
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_relationshipPattern);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(LT);
				setState(616);
				match(SUB);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(617);
					relationDetail();
					}
				}

				setState(620);
				match(SUB);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(621);
					match(GT);
					}
				}

				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(SUB);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(625);
					relationDetail();
					}
				}

				setState(628);
				match(SUB);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(629);
					match(GT);
					}
				}

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

	public static class RelationDetailContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public RelationshipTypesContext relationshipTypes() {
			return getRuleContext(RelationshipTypesContext.class,0);
		}
		public RangeLitContext rangeLit() {
			return getRuleContext(RangeLitContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public RelationDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationDetailContext relationDetail() throws RecognitionException {
		RelationDetailContext _localctx = new RelationDetailContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LBRACK);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(635);
				symbol();
				}
			}

			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(638);
				relationshipTypes();
				}
			}

			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(641);
				rangeLit();
				}
			}

			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==DOLLAR) {
				{
				setState(644);
				properties();
				}
			}

			setState(647);
			match(RBRACK);
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

	public static class RelationshipTypesContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> STICK() { return getTokens(CypherParser.STICK); }
		public TerminalNode STICK(int i) {
			return getToken(CypherParser.STICK, i);
		}
		public RelationshipTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipTypesContext relationshipTypes() throws RecognitionException {
		RelationshipTypesContext _localctx = new RelationshipTypesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationshipTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(COLON);
			setState(650);
			name();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STICK) {
				{
				{
				setState(651);
				match(STICK);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(652);
					match(COLON);
					}
				}

				setState(655);
				name();
				}
				}
				setState(660);
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

	public static class UnionStContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public UnionStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnionSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionStContext unionSt() throws RecognitionException {
		UnionStContext _localctx = new UnionStContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unionSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(UNION);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(662);
				match(ALL);
				}
			}

			setState(665);
			singleQuery();
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

	public static class SubqueryExistContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public PatternWhereContext patternWhere() {
			return getRuleContext(PatternWhereContext.class,0);
		}
		public SubqueryExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSubqueryExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSubqueryExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSubqueryExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryExistContext subqueryExist() throws RecognitionException {
		SubqueryExistContext _localctx = new SubqueryExistContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_subqueryExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(EXISTS);
			setState(668);
			match(LBRACE);
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case CREATE:
			case DELETE:
			case DETACH:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REMOVE:
			case RETURN:
			case SET:
			case WITH:
			case UNWIND:
				{
				setState(669);
				regularQuery();
				}
				break;
			case LPAREN:
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				{
				setState(670);
				patternWhere();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(673);
			match(RBRACE);
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

	public static class InvocationNameContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public InvocationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterInvocationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitInvocationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitInvocationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationNameContext invocationName() throws RecognitionException {
		InvocationNameContext _localctx = new InvocationNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_invocationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			symbol();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(676);
				match(DOT);
				setState(677);
				symbol();
				}
				}
				setState(682);
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

	public static class FunctionInvocationContext extends ParserRuleContext {
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			invocationName();
			setState(684);
			match(LPAREN);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(685);
				match(DISTINCT);
				}
			}

			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(688);
				expressionChain();
				}
			}

			setState(691);
			match(RPAREN);
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(LPAREN);
			setState(694);
			expression();
			setState(695);
			match(RPAREN);
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

	public static class FilterWithContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public FilterWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFilterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFilterWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFilterWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterWithContext filterWith() throws RecognitionException {
		FilterWithContext _localctx = new FilterWithContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_filterWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(698);
			match(LPAREN);
			setState(699);
			filterExpression();
			setState(700);
			match(RPAREN);
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

	public static class PatternComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public RelationshipsChainPatternContext relationshipsChainPattern() {
			return getRuleContext(RelationshipsChainPatternContext.class,0);
		}
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public PatternComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternComprehensionContext patternComprehension() throws RecognitionException {
		PatternComprehensionContext _localctx = new PatternComprehensionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_patternComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(LBRACK);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(703);
				lhs();
				}
			}

			setState(706);
			relationshipsChainPattern();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(707);
				where();
				}
			}

			setState(710);
			match(STICK);
			setState(711);
			expression();
			setState(712);
			match(RBRACK);
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

	public static class RelationshipsChainPatternContext extends ParserRuleContext {
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public List<PatternElemChainContext> patternElemChain() {
			return getRuleContexts(PatternElemChainContext.class);
		}
		public PatternElemChainContext patternElemChain(int i) {
			return getRuleContext(PatternElemChainContext.class,i);
		}
		public RelationshipsChainPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipsChainPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipsChainPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipsChainPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipsChainPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipsChainPatternContext relationshipsChainPattern() throws RecognitionException {
		RelationshipsChainPatternContext _localctx = new RelationshipsChainPatternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_relationshipsChainPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			nodePattern();
			setState(716); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(715);
					patternElemChain();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(718); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class ListComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(LBRACK);
			setState(721);
			filterExpression();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STICK) {
				{
				setState(722);
				match(STICK);
				setState(723);
				expression();
				}
			}

			setState(726);
			match(RBRACK);
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

	public static class FilterExpressionContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_filterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			symbol();
			setState(729);
			match(IN);
			setState(730);
			expression();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(731);
				where();
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

	public static class CountAllContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public CountAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCountAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCountAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCountAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountAllContext countAll() throws RecognitionException {
		CountAllContext _localctx = new CountAllContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_countAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(COUNT);
			setState(735);
			match(LPAREN);
			setState(736);
			match(MULT);
			setState(737);
			match(RPAREN);
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

	public static class ExpressionChainContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionChainContext expressionChain() throws RecognitionException {
		ExpressionChainContext _localctx = new ExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			expression();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(740);
				match(COMMA);
				setState(741);
				expression();
				}
				}
				setState(746);
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(CypherParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(CypherParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(CypherParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(CypherParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(CASE);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(748);
				expression();
				}
			}

			setState(756); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(751);
				match(WHEN);
				setState(752);
				expression();
				setState(753);
				match(THEN);
				setState(754);
				expression();
				}
				}
				setState(758); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(760);
				match(ELSE);
				setState(761);
				expression();
				}
			}

			setState(764);
			match(END);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(CypherParser.DOLLAR, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(DOLLAR);
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				{
				setState(767);
				symbol();
				}
				break;
			case DIGIT:
				{
				setState(768);
				numLit();
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

	public static class LiteralContext extends ParserRuleContext {
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CharLitContext charLit() {
			return getRuleContext(CharLitContext.class,0);
		}
		public ListLitContext listLit() {
			return getRuleContext(ListLitContext.class,0);
		}
		public MapLitContext mapLit() {
			return getRuleContext(MapLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_literal);
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				boolLit();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				numLit();
				}
				break;
			case NULL_W:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				match(NULL_W);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				stringLit();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(775);
				charLit();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(776);
				listLit();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(777);
				mapLit();
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

	public static class RangeLitContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public List<NumLitContext> numLit() {
			return getRuleContexts(NumLitContext.class);
		}
		public NumLitContext numLit(int i) {
			return getRuleContext(NumLitContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public RangeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRangeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRangeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRangeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLitContext rangeLit() throws RecognitionException {
		RangeLitContext _localctx = new RangeLitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rangeLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(MULT);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(781);
				numLit();
				}
			}

			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE) {
				{
				setState(784);
				match(RANGE);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(785);
					numLit();
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

	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLitContext boolLit() throws RecognitionException {
		BoolLitContext _localctx = new BoolLitContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_boolLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(CypherParser.DIGIT, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNumLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNumLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumLitContext numLit() throws RecognitionException {
		NumLitContext _localctx = new NumLitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_numLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(DIGIT);
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

	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CypherParser.STRING_LITERAL, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_stringLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(STRING_LITERAL);
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

	public static class CharLitContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(CypherParser.CHAR_LITERAL, 0); }
		public CharLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCharLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCharLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCharLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLitContext charLit() throws RecognitionException {
		CharLitContext _localctx = new CharLitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_charLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(CHAR_LITERAL);
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

	public static class ListLitContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public ListLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLitContext listLit() throws RecognitionException {
		ListLitContext _localctx = new ListLitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_listLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(LBRACK);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(799);
				expressionChain();
				}
			}

			setState(802);
			match(RBRACK);
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

	public static class MapLitContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public List<MapPairContext> mapPair() {
			return getRuleContexts(MapPairContext.class);
		}
		public MapPairContext mapPair(int i) {
			return getRuleContext(MapPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public MapLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMapLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMapLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMapLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLitContext mapLit() throws RecognitionException {
		MapLitContext _localctx = new MapLitContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_mapLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LBRACE);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ALL - 30)) | (1L << (ASC - 30)) | (1L << (ASCENDING - 30)) | (1L << (BY - 30)) | (1L << (CREATE - 30)) | (1L << (DELETE - 30)) | (1L << (DESC - 30)) | (1L << (DESCENDING - 30)) | (1L << (DETACH - 30)) | (1L << (EXISTS - 30)) | (1L << (LIMIT - 30)) | (1L << (MATCH - 30)) | (1L << (MERGE - 30)) | (1L << (ON - 30)) | (1L << (OPTIONAL - 30)) | (1L << (ORDER - 30)) | (1L << (REMOVE - 30)) | (1L << (RETURN - 30)) | (1L << (SET - 30)) | (1L << (SKIP_W - 30)) | (1L << (WHERE - 30)) | (1L << (WITH - 30)) | (1L << (UNION - 30)) | (1L << (UNWIND - 30)) | (1L << (AND - 30)) | (1L << (AS - 30)) | (1L << (CONTAINS - 30)) | (1L << (DISTINCT - 30)) | (1L << (ENDS - 30)) | (1L << (IN - 30)) | (1L << (IS - 30)) | (1L << (NOT - 30)) | (1L << (OR - 30)) | (1L << (STARTS - 30)) | (1L << (XOR - 30)) | (1L << (FALSE - 30)) | (1L << (TRUE - 30)) | (1L << (NULL_W - 30)) | (1L << (CONSTRAINT - 30)) | (1L << (DO - 30)) | (1L << (FOR - 30)) | (1L << (REQUIRE - 30)) | (1L << (UNIQUE - 30)) | (1L << (CASE - 30)) | (1L << (WHEN - 30)) | (1L << (THEN - 30)) | (1L << (ELSE - 30)) | (1L << (END - 30)) | (1L << (MANDATORY - 30)) | (1L << (SCALAR - 30)) | (1L << (OF - 30)) | (1L << (ADD - 30)) | (1L << (DROP - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(805);
				mapPair();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(806);
					match(COMMA);
					setState(807);
					mapPair();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(815);
			match(RBRACE);
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

	public static class MapPairContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMapPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMapPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMapPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairContext mapPair() throws RecognitionException {
		MapPairContext _localctx = new MapPairContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			name();
			setState(818);
			match(COLON);
			setState(819);
			expression();
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
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_name);
		try {
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				symbol();
				}
				break;
			case ALL:
			case ASC:
			case ASCENDING:
			case BY:
			case CREATE:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DETACH:
			case EXISTS:
			case LIMIT:
			case MATCH:
			case MERGE:
			case ON:
			case OPTIONAL:
			case ORDER:
			case REMOVE:
			case RETURN:
			case SET:
			case SKIP_W:
			case WHERE:
			case WITH:
			case UNION:
			case UNWIND:
			case AND:
			case AS:
			case CONTAINS:
			case DISTINCT:
			case ENDS:
			case IN:
			case IS:
			case NOT:
			case OR:
			case STARTS:
			case XOR:
			case FALSE:
			case TRUE:
			case NULL_W:
			case CONSTRAINT:
			case DO:
			case FOR:
			case REQUIRE:
			case UNIQUE:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case MANDATORY:
			case SCALAR:
			case OF:
			case ADD:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				reservedWord();
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode ESC_LITERAL() { return getToken(CypherParser.ESC_LITERAL, 0); }
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode FILTER() { return getToken(CypherParser.FILTER, 0); }
		public TerminalNode EXTRACT() { return getToken(CypherParser.EXTRACT, 0); }
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) ) {
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

	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public TerminalNode ASCENDING() { return getToken(CypherParser.ASCENDING, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(CypherParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LIMIT() { return getToken(CypherParser.LIMIT, 0); }
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode SKIP_W() { return getToken(CypherParser.SKIP_W, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public TerminalNode AND() { return getToken(CypherParser.AND, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode OR() { return getToken(CypherParser.OR, 0); }
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode XOR() { return getToken(CypherParser.XOR, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode DO() { return getToken(CypherParser.DO, 0); }
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode REQUIRE() { return getToken(CypherParser.REQUIRE, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(CypherParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(CypherParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public TerminalNode MANDATORY() { return getToken(CypherParser.MANDATORY, 0); }
		public TerminalNode SCALAR() { return getToken(CypherParser.SCALAR, 0); }
		public TerminalNode OF() { return getToken(CypherParser.OF, 0); }
		public TerminalNode ADD() { return getToken(CypherParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(CypherParser.DROP, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ALL - 36)) | (1L << (ASC - 36)) | (1L << (ASCENDING - 36)) | (1L << (BY - 36)) | (1L << (CREATE - 36)) | (1L << (DELETE - 36)) | (1L << (DESC - 36)) | (1L << (DESCENDING - 36)) | (1L << (DETACH - 36)) | (1L << (EXISTS - 36)) | (1L << (LIMIT - 36)) | (1L << (MATCH - 36)) | (1L << (MERGE - 36)) | (1L << (ON - 36)) | (1L << (OPTIONAL - 36)) | (1L << (ORDER - 36)) | (1L << (REMOVE - 36)) | (1L << (RETURN - 36)) | (1L << (SET - 36)) | (1L << (SKIP_W - 36)) | (1L << (WHERE - 36)) | (1L << (WITH - 36)) | (1L << (UNION - 36)) | (1L << (UNWIND - 36)) | (1L << (AND - 36)) | (1L << (AS - 36)) | (1L << (CONTAINS - 36)) | (1L << (DISTINCT - 36)) | (1L << (ENDS - 36)) | (1L << (IN - 36)) | (1L << (IS - 36)) | (1L << (NOT - 36)) | (1L << (OR - 36)) | (1L << (STARTS - 36)) | (1L << (XOR - 36)) | (1L << (FALSE - 36)) | (1L << (TRUE - 36)) | (1L << (NULL_W - 36)) | (1L << (CONSTRAINT - 36)) | (1L << (DO - 36)) | (1L << (FOR - 36)) | (1L << (REQUIRE - 36)) | (1L << (UNIQUE - 36)) | (1L << (CASE - 36)) | (1L << (WHEN - 36)) | (1L << (THEN - 36)) | (1L << (ELSE - 36)) | (1L << (END - 36)) | (1L << (MANDATORY - 36)) | (1L << (SCALAR - 36)) | (1L << (OF - 36)) | (1L << (ADD - 36)) | (1L << (DROP - 36)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u0340\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\5\2\u00b7\n\2\3\2\3\2\3\3"+
		"\3\3\5\3\u00bd\n\3\3\4\3\4\7\4\u00c1\n\4\f\4\16\4\u00c4\13\4\3\5\3\5\5"+
		"\5\u00c8\n\5\3\6\3\6\3\6\5\6\u00cd\n\6\3\6\3\6\3\6\5\6\u00d2\n\6\5\6\u00d4"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00dc\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\5\13\u00e5\n\13\3\13\3\13\5\13\u00e9\n\13\3\13\5\13\u00ec\n\13\3\13\5"+
		"\13\u00ef\n\13\3\f\3\f\5\f\u00f3\n\f\3\f\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa"+
		"\13\f\3\r\3\r\3\r\5\r\u00ff\n\r\3\16\3\16\5\16\u0103\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u010a\n\17\f\17\16\17\u010d\13\17\3\20\7\20\u0110\n"+
		"\20\f\20\16\20\u0113\13\20\3\20\3\20\6\20\u0117\n\20\r\20\16\20\u0118"+
		"\3\20\5\20\u011c\n\20\5\20\u011e\n\20\3\21\7\21\u0121\n\21\f\21\16\21"+
		"\u0124\13\21\3\21\7\21\u0127\n\21\f\21\16\21\u012a\13\21\3\21\6\21\u012d"+
		"\n\21\r\21\16\21\u012e\3\21\3\21\3\22\5\22\u0134\n\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0141\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0148\n\25\3\26\5\26\u014b\n\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u0154\n\27\f\27\16\27\u0157\13\27\3\30\3\30\3\30\3"+
		"\30\5\30\u015d\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0164\n\31\3\32\3\32"+
		"\5\32\u0168\n\32\3\32\3\32\3\33\3\33\3\33\7\33\u016f\n\33\f\33\16\33\u0172"+
		"\13\33\3\33\5\33\u0175\n\33\3\34\3\34\3\34\5\34\u017a\n\34\3\34\3\34\3"+
		"\35\3\35\3\35\7\35\u0181\n\35\f\35\16\35\u0184\13\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\7\37\u018e\n\37\f\37\16\37\u0191\13\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u019e\n \3!\3!\6!\u01a2\n!\r!\16!\u01a3\3"+
		"\"\3\"\3\"\3#\3#\5#\u01ab\n#\3$\3$\3$\3%\3%\3%\7%\u01b3\n%\f%\16%\u01b6"+
		"\13%\3&\3&\3&\7&\u01bb\n&\f&\16&\u01be\13&\3\'\3\'\3\'\7\'\u01c3\n\'\f"+
		"\'\16\'\u01c6\13\'\3(\3(\3(\7(\u01cb\n(\f(\16(\u01ce\13(\3)\5)\u01d1\n"+
		")\3)\3)\3*\3*\3*\3*\7*\u01d9\n*\f*\16*\u01dc\13*\3+\3+\3,\3,\3,\7,\u01e3"+
		"\n,\f,\16,\u01e6\13,\3-\3-\3-\7-\u01eb\n-\f-\16-\u01ee\13-\3.\3.\3.\7"+
		".\u01f3\n.\f.\16.\u01f6\13.\3/\5/\u01f9\n/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u0201\n\60\f\60\16\60\u0204\13\60\3\61\3\61\3\61\3\61\5\61\u020a\n"+
		"\61\3\61\3\61\5\61\u020e\n\61\3\61\5\61\u0211\n\61\3\61\5\61\u0214\n\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u021e\n\63\3\64\3\64\5\64"+
		"\u0222\n\64\3\64\3\64\3\65\3\65\5\65\u0228\n\65\3\66\3\66\3\66\7\66\u022d"+
		"\n\66\f\66\16\66\u0230\13\66\3\67\3\67\3\67\5\67\u0235\n\67\3\67\3\67"+
		"\38\38\78\u023b\n8\f8\168\u023e\138\38\38\38\38\58\u0244\n8\39\39\39\3"+
		":\3:\5:\u024b\n:\3;\3;\5;\u024f\n;\3;\5;\u0252\n;\3;\5;\u0255\n;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0265\n<\3=\3=\3=\3>\3>\3>\5"+
		">\u026d\n>\3>\3>\5>\u0271\n>\3>\3>\5>\u0275\n>\3>\3>\5>\u0279\n>\5>\u027b"+
		"\n>\3?\3?\5?\u027f\n?\3?\5?\u0282\n?\3?\5?\u0285\n?\3?\5?\u0288\n?\3?"+
		"\3?\3@\3@\3@\3@\5@\u0290\n@\3@\7@\u0293\n@\f@\16@\u0296\13@\3A\3A\5A\u029a"+
		"\nA\3A\3A\3B\3B\3B\3B\5B\u02a2\nB\3B\3B\3C\3C\3C\7C\u02a9\nC\fC\16C\u02ac"+
		"\13C\3D\3D\3D\5D\u02b1\nD\3D\5D\u02b4\nD\3D\3D\3E\3E\3E\3E\3F\3F\3F\3"+
		"F\3F\3G\3G\5G\u02c3\nG\3G\3G\5G\u02c7\nG\3G\3G\3G\3G\3H\3H\6H\u02cf\n"+
		"H\rH\16H\u02d0\3I\3I\3I\3I\5I\u02d7\nI\3I\3I\3J\3J\3J\3J\5J\u02df\nJ\3"+
		"K\3K\3K\3K\3K\3L\3L\3L\7L\u02e9\nL\fL\16L\u02ec\13L\3M\3M\5M\u02f0\nM"+
		"\3M\3M\3M\3M\3M\6M\u02f7\nM\rM\16M\u02f8\3M\3M\5M\u02fd\nM\3M\3M\3N\3"+
		"N\3N\5N\u0304\nN\3O\3O\3O\3O\3O\3O\3O\5O\u030d\nO\3P\3P\5P\u0311\nP\3"+
		"P\3P\5P\u0315\nP\5P\u0317\nP\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\5U\u0323\n"+
		"U\3U\3U\3V\3V\3V\3V\7V\u032b\nV\fV\16V\u032e\13V\5V\u0330\nV\3V\3V\3W"+
		"\3W\3W\3W\3X\3X\5X\u033a\nX\3Y\3Y\3Z\3Z\3Z\2\2[\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\2\f\4\2\'(,-\4\2**\61\61\3\2\3\4\4\2\3\3\5\t\3\2\24"+
		"\25\4\2\26\27\31\31\3\2#&\3\2IJ\4\2 %[\\\3\2&Z\2\u0362\2\u00b4\3\2\2\2"+
		"\4\u00bc\3\2\2\2\6\u00be\3\2\2\2\b\u00c7\3\2\2\2\n\u00c9\3\2\2\2\f\u00d5"+
		"\3\2\2\2\16\u00d8\3\2\2\2\20\u00dd\3\2\2\2\22\u00e0\3\2\2\2\24\u00e4\3"+
		"\2\2\2\26\u00f2\3\2\2\2\30\u00fb\3\2\2\2\32\u0100\3\2\2\2\34\u0104\3\2"+
		"\2\2\36\u0111\3\2\2\2 \u0122\3\2\2\2\"\u0133\3\2\2\2$\u0138\3\2\2\2&\u0140"+
		"\3\2\2\2(\u0147\3\2\2\2*\u014a\3\2\2\2,\u014f\3\2\2\2.\u015c\3\2\2\2\60"+
		"\u015e\3\2\2\2\62\u0165\3\2\2\2\64\u016b\3\2\2\2\66\u0179\3\2\2\28\u017d"+
		"\3\2\2\2:\u0185\3\2\2\2<\u0189\3\2\2\2>\u019d\3\2\2\2@\u01a1\3\2\2\2B"+
		"\u01a5\3\2\2\2D\u01a8\3\2\2\2F\u01ac\3\2\2\2H\u01af\3\2\2\2J\u01b7\3\2"+
		"\2\2L\u01bf\3\2\2\2N\u01c7\3\2\2\2P\u01d0\3\2\2\2R\u01d4\3\2\2\2T\u01dd"+
		"\3\2\2\2V\u01df\3\2\2\2X\u01e7\3\2\2\2Z\u01ef\3\2\2\2\\\u01f8\3\2\2\2"+
		"^\u01fc\3\2\2\2`\u0213\3\2\2\2b\u0215\3\2\2\2d\u021d\3\2\2\2f\u021f\3"+
		"\2\2\2h\u0225\3\2\2\2j\u0229\3\2\2\2l\u0234\3\2\2\2n\u0243\3\2\2\2p\u0245"+
		"\3\2\2\2r\u024a\3\2\2\2t\u024c\3\2\2\2v\u0264\3\2\2\2x\u0266\3\2\2\2z"+
		"\u027a\3\2\2\2|\u027c\3\2\2\2~\u028b\3\2\2\2\u0080\u0297\3\2\2\2\u0082"+
		"\u029d\3\2\2\2\u0084\u02a5\3\2\2\2\u0086\u02ad\3\2\2\2\u0088\u02b7\3\2"+
		"\2\2\u008a\u02bb\3\2\2\2\u008c\u02c0\3\2\2\2\u008e\u02cc\3\2\2\2\u0090"+
		"\u02d2\3\2\2\2\u0092\u02da\3\2\2\2\u0094\u02e0\3\2\2\2\u0096\u02e5\3\2"+
		"\2\2\u0098\u02ed\3\2\2\2\u009a\u0300\3\2\2\2\u009c\u030c\3\2\2\2\u009e"+
		"\u030e\3\2\2\2\u00a0\u0318\3\2\2\2\u00a2\u031a\3\2\2\2\u00a4\u031c\3\2"+
		"\2\2\u00a6\u031e\3\2\2\2\u00a8\u0320\3\2\2\2\u00aa\u0326\3\2\2\2\u00ac"+
		"\u0333\3\2\2\2\u00ae\u0339\3\2\2\2\u00b0\u033b\3\2\2\2\u00b2\u033d\3\2"+
		"\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b7\7\13\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\2\2\3\u00b9\3\3\2\2\2"+
		"\u00ba\u00bd\5\6\4\2\u00bb\u00bd\5\n\6\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\5\3\2\2\2\u00be\u00c2\5\b\5\2\u00bf\u00c1\5\u0080A\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\7\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\5\36\20\2\u00c6\u00c8"+
		"\5 \21\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\t\3\2\2\2\u00c9"+
		"\u00ca\7\36\2\2\u00ca\u00cc\5\u0084C\2\u00cb\u00cd\5\62\32\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00d1\7\37\2\2"+
		"\u00cf\u00d2\7\31\2\2\u00d0\u00d2\5\64\33\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\13\3\2\2\2\u00d5\u00d6\7\67\2\2\u00d6\u00d7\5\24\13\2\u00d7"+
		"\r\3\2\2\2\u00d8\u00d9\7;\2\2\u00d9\u00db\5\24\13\2\u00da\u00dc\5F$\2"+
		"\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\17\3\2\2\2\u00dd\u00de"+
		"\79\2\2\u00de\u00df\5J&\2\u00df\21\3\2\2\2\u00e0\u00e1\7\60\2\2\u00e1"+
		"\u00e2\5J&\2\u00e2\23\3\2\2\2\u00e3\u00e5\7A\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\26\f\2\u00e7\u00e9\5"+
		"\34\17\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00ec\5\20\t\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3"+
		"\2\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\25\3\2\2\2\u00f0\u00f3\7\31\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5\7\r\2\2\u00f5"+
		"\u00f7\5\30\r\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\5J&\2\u00fc\u00fd\7?\2\2\u00fd\u00ff\5\u00b0Y\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100\u0102\5J&\2\u0101\u0103"+
		"\t\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\33\3\2\2\2\u0104"+
		"\u0105\7\65\2\2\u0105\u0106\7)\2\2\u0106\u010b\5\32\16\2\u0107\u0108\7"+
		"\r\2\2\u0108\u010a\5\32\16\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\35\3\2\2\2\u010d\u010b\3\2\2"+
		"\2\u010e\u0110\5&\24\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011d\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u011e\5\f\7\2\u0115\u0117\5(\25\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u011c\5\f\7\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0114\3\2\2\2\u011d\u0116\3\2\2\2\u011e\37\3\2\2\2\u011f\u0121"+
		"\5&\24\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u012c\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5("+
		"\25\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\5\16"+
		"\b\2\u012c\u0128\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5\36\20\2\u0131!\3\2\2"+
		"\2\u0132\u0134\7\64\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\5D#\2\u0137#\3\2\2\2\u0138"+
		"\u0139\7=\2\2\u0139\u013a\5J&\2\u013a\u013b\7?\2\2\u013b\u013c\5\u00b0"+
		"Y\2\u013c%\3\2\2\2\u013d\u0141\5\"\22\2\u013e\u0141\5$\23\2\u013f\u0141"+
		"\5\60\31\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2"+
		"\u0141\'\3\2\2\2\u0142\u0148\5B\"\2\u0143\u0148\58\35\2\u0144\u0148\5"+
		"*\26\2\u0145\u0148\5<\37\2\u0146\u0148\5,\27\2\u0147\u0142\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148)\3\2\2\2\u0149\u014b\7.\2\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7+\2\2\u014d\u014e\5\u0096L\2"+
		"\u014e+\3\2\2\2\u014f\u0150\7\66\2\2\u0150\u0155\5.\30\2\u0151\u0152\7"+
		"\r\2\2\u0152\u0154\5.\30\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156-\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0158\u0159\5\u00b0Y\2\u0159\u015a\5@!\2\u015a\u015d\3\2\2\2\u015b\u015d"+
		"\5j\66\2\u015c\u0158\3\2\2\2\u015c\u015b\3\2\2\2\u015d/\3\2\2\2\u015e"+
		"\u015f\7\36\2\2\u015f\u0160\5\u0084C\2\u0160\u0163\5\62\32\2\u0161\u0162"+
		"\7\37\2\2\u0162\u0164\5\64\33\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\61\3\2\2\2\u0165\u0167\7\16\2\2\u0166\u0168\5\u0096L\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\17"+
		"\2\2\u016a\63\3\2\2\2\u016b\u0170\5\66\34\2\u016c\u016d\7\r\2\2\u016d"+
		"\u016f\5\66\34\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0175\5F$\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\65\3\2\2\2"+
		"\u0176\u0177\5\u00b0Y\2\u0177\u0178\7?\2\2\u0178\u017a\3\2\2\2\u0179\u0176"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\u00b0Y"+
		"\2\u017c\67\3\2\2\2\u017d\u017e\7\62\2\2\u017e\u0182\5l\67\2\u017f\u0181"+
		"\5:\36\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u01839\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\63\2\2"+
		"\u0186\u0187\t\3\2\2\u0187\u0188\5<\37\2\u0188;\3\2\2\2\u0189\u018a\7"+
		"8\2\2\u018a\u018f\5> \2\u018b\u018c\7\r\2\2\u018c\u018e\5> \2\u018d\u018b"+
		"\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"=\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\5j\66\2\u0193\u0194\7\3\2\2"+
		"\u0194\u0195\5J&\2\u0195\u019e\3\2\2\2\u0196\u0197\5\u00b0Y\2\u0197\u0198"+
		"\t\4\2\2\u0198\u0199\5J&\2\u0199\u019e\3\2\2\2\u019a\u019b\5\u00b0Y\2"+
		"\u019b\u019c\5@!\2\u019c\u019e\3\2\2\2\u019d\u0192\3\2\2\2\u019d\u0196"+
		"\3\2\2\2\u019d\u019a\3\2\2\2\u019e?\3\2\2\2\u019f\u01a0\7\33\2\2\u01a0"+
		"\u01a2\5\u00aeX\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4A\3\2\2\2\u01a5\u01a6\7*\2\2\u01a6\u01a7"+
		"\5H%\2\u01a7C\3\2\2\2\u01a8\u01aa\5H%\2\u01a9\u01ab\5F$\2\u01aa\u01a9"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abE\3\2\2\2\u01ac\u01ad\7:\2\2\u01ad\u01ae"+
		"\5J&\2\u01aeG\3\2\2\2\u01af\u01b4\5l\67\2\u01b0\u01b1\7\r\2\2\u01b1\u01b3"+
		"\5l\67\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5I\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bc\5L\'\2\u01b8"+
		"\u01b9\7F\2\2\u01b9\u01bb\5L\'\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2"+
		"\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bdK\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01bf\u01c4\5N(\2\u01c0\u01c1\7H\2\2\u01c1\u01c3\5N(\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5M\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cc\5P)\2\u01c8\u01c9"+
		"\7>\2\2\u01c9\u01cb\5P)\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdO\3\2\2\2\u01ce\u01cc\3\2\2\2"+
		"\u01cf\u01d1\7E\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d3\5R*\2\u01d3Q\3\2\2\2\u01d4\u01da\5V,\2\u01d5\u01d6"+
		"\5T+\2\u01d6\u01d7\5V,\2\u01d7\u01d9\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbS\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dd\u01de\t\5\2\2\u01deU\3\2\2\2\u01df\u01e4\5"+
		"X-\2\u01e0\u01e1\t\6\2\2\u01e1\u01e3\5X-\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5W\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01ec\5Z.\2\u01e8\u01e9\t\7\2\2\u01e9\u01eb\5Z.\2"+
		"\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01edY\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f4\5\\/\2\u01f0\u01f1"+
		"\7\30\2\2\u01f1\u01f3\5\\/\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5[\3\2\2\2\u01f6\u01f4\3\2\2\2"+
		"\u01f7\u01f9\t\6\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\5^\60\2\u01fb]\3\2\2\2\u01fc\u0202\5h\65\2\u01fd"+
		"\u0201\5b\62\2\u01fe\u0201\5`\61\2\u01ff\u0201\5f\64\2\u0200\u01fd\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203_\3\2\2\2\u0204\u0202\3\2\2\2"+
		"\u0205\u0206\7C\2\2\u0206\u0214\5h\65\2\u0207\u0210\7\22\2\2\u0208\u020a"+
		"\5J&\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\7\n\2\2\u020c\u020e\5J&\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2"+
		"\2\u020e\u0211\3\2\2\2\u020f\u0211\5J&\2\u0210\u0209\3\2\2\2\u0210\u020f"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\7\23\2\2\u0213\u0205\3\2\2\2"+
		"\u0213\u0207\3\2\2\2\u0214a\3\2\2\2\u0215\u0216\5d\63\2\u0216\u0217\5"+
		"h\65\2\u0217c\3\2\2\2\u0218\u0219\7G\2\2\u0219\u021e\7;\2\2\u021a\u021b"+
		"\7B\2\2\u021b\u021e\7;\2\2\u021c\u021e\7@\2\2\u021d\u0218\3\2\2\2\u021d"+
		"\u021a\3\2\2\2\u021d\u021c\3\2\2\2\u021ee\3\2\2\2\u021f\u0221\7D\2\2\u0220"+
		"\u0222\7E\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\7K\2\2\u0224g\3\2\2\2\u0225\u0227\5j\66\2\u0226\u0228"+
		"\5@!\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228i\3\2\2\2\u0229\u022e"+
		"\5v<\2\u022a\u022b\7\f\2\2\u022b\u022d\5\u00aeX\2\u022c\u022a\3\2\2\2"+
		"\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022fk\3"+
		"\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\5\u00b0Y\2\u0232\u0233\7\3\2\2"+
		"\u0233\u0235\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\5n8\2\u0237m\3\2\2\2\u0238\u023c\5t;\2\u0239\u023b"+
		"\5p9\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u0244\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\16"+
		"\2\2\u0240\u0241\5n8\2\u0241\u0242\7\17\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0238\3\2\2\2\u0243\u023f\3\2\2\2\u0244o\3\2\2\2\u0245\u0246\5z>\2\u0246"+
		"\u0247\5t;\2\u0247q\3\2\2\2\u0248\u024b\5\u00aaV\2\u0249\u024b\5\u009a"+
		"N\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024bs\3\2\2\2\u024c\u024e"+
		"\7\16\2\2\u024d\u024f\5\u00b0Y\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2"+
		"\2\u024f\u0251\3\2\2\2\u0250\u0252\5@!\2\u0251\u0250\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0255\5r:\2\u0254\u0253\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7\17\2\2\u0257u\3\2\2\2"+
		"\u0258\u0265\5\u009cO\2\u0259\u0265\5\u009aN\2\u025a\u0265\5\u0098M\2"+
		"\u025b\u0265\5\u0094K\2\u025c\u0265\5\u0090I\2\u025d\u0265\5\u008cG\2"+
		"\u025e\u0265\5\u008aF\2\u025f\u0265\5\u008eH\2\u0260\u0265\5\u0088E\2"+
		"\u0261\u0265\5\u0086D\2\u0262\u0265\5\u00b0Y\2\u0263\u0265\5\u0082B\2"+
		"\u0264\u0258\3\2\2\2\u0264\u0259\3\2\2\2\u0264\u025a\3\2\2\2\u0264\u025b"+
		"\3\2\2\2\u0264\u025c\3\2\2\2\u0264\u025d\3\2\2\2\u0264\u025e\3\2\2\2\u0264"+
		"\u025f\3\2\2\2\u0264\u0260\3\2\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0263\3\2\2\2\u0265w\3\2\2\2\u0266\u0267\5\u00b0Y\2\u0267\u0268"+
		"\7\3\2\2\u0268y\3\2\2\2\u0269\u026a\7\b\2\2\u026a\u026c\7\24\2\2\u026b"+
		"\u026d\5|?\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\u0270\7\24\2\2\u026f\u0271\7\7\2\2\u0270\u026f\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u027b\3\2\2\2\u0272\u0274\7\24\2\2\u0273\u0275\5"+
		"|?\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0278\7\24\2\2\u0277\u0279\7\7\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3"+
		"\2\2\2\u0279\u027b\3\2\2\2\u027a\u0269\3\2\2\2\u027a\u0272\3\2\2\2\u027b"+
		"{\3\2\2\2\u027c\u027e\7\22\2\2\u027d\u027f\5\u00b0Y\2\u027e\u027d\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u0282\5~@\2\u0281\u0280"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0285\5\u009eP"+
		"\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0288"+
		"\5r:\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\7\23\2\2\u028a}\3\2\2\2\u028b\u028c\7\33\2\2\u028c\u0294\5\u00ae"+
		"X\2\u028d\u028f\7\34\2\2\u028e\u0290\7\33\2\2\u028f\u028e\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\5\u00aeX\2\u0292\u028d"+
		"\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\177\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0299\7<\2\2\u0298\u029a\7&\2\2"+
		"\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c"+
		"\5\b\5\2\u029c\u0081\3\2\2\2\u029d\u029e\7/\2\2\u029e\u02a1\7\20\2\2\u029f"+
		"\u02a2\5\6\4\2\u02a0\u02a2\5D#\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2"+
		"\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7\21\2\2\u02a4\u0083\3\2\2\2\u02a5"+
		"\u02aa\5\u00b0Y\2\u02a6\u02a7\7\f\2\2\u02a7\u02a9\5\u00b0Y\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u0085\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\5\u0084C\2\u02ae\u02b0"+
		"\7\16\2\2\u02af\u02b1\7A\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02b4\5\u0096L\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7\17\2\2\u02b6\u0087\3\2\2\2"+
		"\u02b7\u02b8\7\16\2\2\u02b8\u02b9\5J&\2\u02b9\u02ba\7\17\2\2\u02ba\u0089"+
		"\3\2\2\2\u02bb\u02bc\t\b\2\2\u02bc\u02bd\7\16\2\2\u02bd\u02be\5\u0092"+
		"J\2\u02be\u02bf\7\17\2\2\u02bf\u008b\3\2\2\2\u02c0\u02c2\7\22\2\2\u02c1"+
		"\u02c3\5x=\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2"+
		"\2\u02c4\u02c6\5\u008eH\2\u02c5\u02c7\5F$\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\34\2\2\u02c9\u02ca\5"+
		"J&\2\u02ca\u02cb\7\23\2\2\u02cb\u008d\3\2\2\2\u02cc\u02ce\5t;\2\u02cd"+
		"\u02cf\5p9\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2\2"+
		"\2\u02d0\u02d1\3\2\2\2\u02d1\u008f\3\2\2\2\u02d2\u02d3\7\22\2\2\u02d3"+
		"\u02d6\5\u0092J\2\u02d4\u02d5\7\34\2\2\u02d5\u02d7\5J&\2\u02d6\u02d4\3"+
		"\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7\23\2\2\u02d9"+
		"\u0091\3\2\2\2\u02da\u02db\5\u00b0Y\2\u02db\u02dc\7C\2\2\u02dc\u02de\5"+
		"J&\2\u02dd\u02df\5F$\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u0093"+
		"\3\2\2\2\u02e0\u02e1\7\"\2\2\u02e1\u02e2\7\16\2\2\u02e2\u02e3\7\31\2\2"+
		"\u02e3\u02e4\7\17\2\2\u02e4\u0095\3\2\2\2\u02e5\u02ea\5J&\2\u02e6\u02e7"+
		"\7\r\2\2\u02e7\u02e9\5J&\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0097\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ef\7Q\2\2\u02ee\u02f0\5J&\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02f6\3\2\2\2\u02f1\u02f2\7R\2\2\u02f2\u02f3\5J&\2\u02f3"+
		"\u02f4\7S\2\2\u02f4\u02f5\5J&\2\u02f5\u02f7\3\2\2\2\u02f6\u02f1\3\2\2"+
		"\2\u02f7\u02f8\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fc"+
		"\3\2\2\2\u02fa\u02fb\7T\2\2\u02fb\u02fd\5J&\2\u02fc\u02fa\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7U\2\2\u02ff\u0099\3\2"+
		"\2\2\u0300\u0303\7\35\2\2\u0301\u0304\5\u00b0Y\2\u0302\u0304\5\u00a2R"+
		"\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u009b\3\2\2\2\u0305\u030d"+
		"\5\u00a0Q\2\u0306\u030d\5\u00a2R\2\u0307\u030d\7K\2\2\u0308\u030d\5\u00a4"+
		"S\2\u0309\u030d\5\u00a6T\2\u030a\u030d\5\u00a8U\2\u030b\u030d\5\u00aa"+
		"V\2\u030c\u0305\3\2\2\2\u030c\u0306\3\2\2\2\u030c\u0307\3\2\2\2\u030c"+
		"\u0308\3\2\2\2\u030c\u0309\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030b\3\2"+
		"\2\2\u030d\u009d\3\2\2\2\u030e\u0310\7\31\2\2\u030f\u0311\5\u00a2R\2\u0310"+
		"\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0316\3\2\2\2\u0312\u0314\7\n"+
		"\2\2\u0313\u0315\5\u00a2R\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0317\3\2\2\2\u0316\u0312\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u009f\3\2"+
		"\2\2\u0318\u0319\t\t\2\2\u0319\u00a1\3\2\2\2\u031a\u031b\7_\2\2\u031b"+
		"\u00a3\3\2\2\2\u031c\u031d\7^\2\2\u031d\u00a5\3\2\2\2\u031e\u031f\7]\2"+
		"\2\u031f\u00a7\3\2\2\2\u0320\u0322\7\22\2\2\u0321\u0323\5\u0096L\2\u0322"+
		"\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7\23"+
		"\2\2\u0325\u00a9\3\2\2\2\u0326\u032f\7\20\2\2\u0327\u032c\5\u00acW\2\u0328"+
		"\u0329\7\r\2\2\u0329\u032b\5\u00acW\2\u032a\u0328\3\2\2\2\u032b\u032e"+
		"\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0330\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032f\u0327\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2"+
		"\2\2\u0331\u0332\7\21\2\2\u0332\u00ab\3\2\2\2\u0333\u0334\5\u00aeX\2\u0334"+
		"\u0335\7\33\2\2\u0335\u0336\5J&\2\u0336\u00ad\3\2\2\2\u0337\u033a\5\u00b0"+
		"Y\2\u0338\u033a\5\u00b2Z\2\u0339\u0337\3\2\2\2\u0339\u0338\3\2\2\2\u033a"+
		"\u00af\3\2\2\2\u033b\u033c\t\n\2\2\u033c\u00b1\3\2\2\2\u033d\u033e\t\13"+
		"\2\2\u033e\u00b3\3\2\2\2h\u00b6\u00bc\u00c2\u00c7\u00cc\u00d1\u00d3\u00db"+
		"\u00e4\u00e8\u00eb\u00ee\u00f2\u00f8\u00fe\u0102\u010b\u0111\u0118\u011b"+
		"\u011d\u0122\u0128\u012e\u0133\u0140\u0147\u014a\u0155\u015c\u0163\u0167"+
		"\u0170\u0174\u0179\u0182\u018f\u019d\u01a3\u01aa\u01b4\u01bc\u01c4\u01cc"+
		"\u01d0\u01da\u01e4\u01ec\u01f4\u01f8\u0200\u0202\u0209\u020d\u0210\u0213"+
		"\u021d\u0221\u0227\u022e\u0234\u023c\u0243\u024a\u024e\u0251\u0254\u0264"+
		"\u026c\u0270\u0274\u0278\u027a\u027e\u0281\u0284\u0287\u028f\u0294\u0299"+
		"\u02a1\u02aa\u02b0\u02b3\u02c2\u02c6\u02d0\u02d6\u02de\u02ea\u02ef\u02f8"+
		"\u02fc\u0303\u030c\u0310\u0314\u0316\u0322\u032c\u032f\u0339";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}