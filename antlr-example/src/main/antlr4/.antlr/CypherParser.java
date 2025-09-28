// Generated from /workspaces/antlrr/antlr-example/src/main/antlr4/CypherParser.g4 by ANTLR 4.13.1

package com.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ProjectionBodyContext projectionBody() {
			return getRuleContext(ProjectionBodyContext.class,0);
		}
		public ReturnStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSt; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class SkipStContext extends ParserRuleContext {
		public TerminalNode SKIP_W() { return getToken(CypherParser.SKIP_W, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SkipStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipSt; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitStContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(CypherParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitSt; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13606456393728L) != 0)) {
				{
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13606456393728L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 577727389967056896L) != 0)) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 22820363834490880L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 577727389967056896L) != 0)) {
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22820363834490880L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateStContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public CreateStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSt; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 250L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11534336L) != 0)) {
				{
				{
				setState(486);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11534336L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 11047892835893249L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringExpPrefixContext extends ParserRuleContext {
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public StringExpPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpPrefix; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullExpressionContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullExpression; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1729382256910270527L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1729382256910270527L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1729382256910270527L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1729382256910270527L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class CountAllContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public CountAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countAll; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(CypherParser.DIGIT, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CypherParser.STRING_LITERAL, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharLitContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(CypherParser.CHAR_LITERAL, 0); }
		public CharLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLit; }
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35320872390656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 130027633L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 2305843009213693951L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1729382256910270527L) != 0)) ) {
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
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 9007199254740991L) != 0)) ) {
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
		"\u0004\u0001c\u033e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u00b5\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00bb\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u00bf\b"+
		"\u0002\n\u0002\f\u0002\u00c2\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00c6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cb\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d0\b\u0004\u0003"+
		"\u0004\u00d2\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00da\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t\u00e3\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00e7\b\t\u0001\t\u0003\t\u00ea\b\t\u0001\t\u0003\t\u00ed\b"+
		"\t\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\n\u0001\n\u0005\n\u00f5\b\n"+
		"\n\n\f\n\u00f8\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fd"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u0101\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0108\b\r\n\r\f\r\u010b\t\r\u0001\u000e\u0005\u000e"+
		"\u010e\b\u000e\n\u000e\f\u000e\u0111\t\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0115\b\u000e\u000b\u000e\f\u000e\u0116\u0001\u000e\u0003\u000e"+
		"\u011a\b\u000e\u0003\u000e\u011c\b\u000e\u0001\u000f\u0005\u000f\u011f"+
		"\b\u000f\n\u000f\f\u000f\u0122\t\u000f\u0001\u000f\u0005\u000f\u0125\b"+
		"\u000f\n\u000f\f\u000f\u0128\t\u000f\u0001\u000f\u0004\u000f\u012b\b\u000f"+
		"\u000b\u000f\f\u000f\u012c\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010"+
		"\u0132\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u013f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0146\b\u0013\u0001\u0014\u0003\u0014\u0149\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0152\b\u0015\n\u0015\f\u0015\u0155\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u015b\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0162\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0166\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u016d"+
		"\b\u0019\n\u0019\f\u0019\u0170\t\u0019\u0001\u0019\u0003\u0019\u0173\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0178\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u017f"+
		"\b\u001b\n\u001b\f\u001b\u0182\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u018c\b\u001d\n\u001d\f\u001d\u018f\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u019c\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0004\u001f\u01a0\b\u001f\u000b\u001f\f\u001f\u01a1\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0003!\u01a9\b!\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u01b1\b#\n#\f#\u01b4\t#\u0001$\u0001$\u0001$\u0005"+
		"$\u01b9\b$\n$\f$\u01bc\t$\u0001%\u0001%\u0001%\u0005%\u01c1\b%\n%\f%\u01c4"+
		"\t%\u0001&\u0001&\u0001&\u0005&\u01c9\b&\n&\f&\u01cc\t&\u0001\'\u0003"+
		"\'\u01cf\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u01d7"+
		"\b(\n(\f(\u01da\t(\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u01e1\b*"+
		"\n*\f*\u01e4\t*\u0001+\u0001+\u0001+\u0005+\u01e9\b+\n+\f+\u01ec\t+\u0001"+
		",\u0001,\u0001,\u0005,\u01f1\b,\n,\f,\u01f4\t,\u0001-\u0003-\u01f7\b-"+
		"\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0005.\u01ff\b.\n.\f.\u0202"+
		"\t.\u0001/\u0001/\u0001/\u0001/\u0003/\u0208\b/\u0001/\u0001/\u0003/\u020c"+
		"\b/\u0001/\u0003/\u020f\b/\u0001/\u0003/\u0212\b/\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00011\u00031\u021c\b1\u00012\u00012\u0003"+
		"2\u0220\b2\u00012\u00012\u00013\u00013\u00033\u0226\b3\u00014\u00014\u0001"+
		"4\u00054\u022b\b4\n4\f4\u022e\t4\u00015\u00015\u00015\u00035\u0233\b5"+
		"\u00015\u00015\u00016\u00016\u00056\u0239\b6\n6\f6\u023c\t6\u00016\u0001"+
		"6\u00016\u00016\u00036\u0242\b6\u00017\u00017\u00017\u00018\u00018\u0003"+
		"8\u0249\b8\u00019\u00019\u00039\u024d\b9\u00019\u00039\u0250\b9\u0001"+
		"9\u00039\u0253\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0263\b:\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0003<\u026b\b<\u0001<\u0001<\u0003<\u026f"+
		"\b<\u0001<\u0001<\u0003<\u0273\b<\u0001<\u0001<\u0003<\u0277\b<\u0003"+
		"<\u0279\b<\u0001=\u0001=\u0003=\u027d\b=\u0001=\u0003=\u0280\b=\u0001"+
		"=\u0003=\u0283\b=\u0001=\u0003=\u0286\b=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u028e\b>\u0001>\u0005>\u0291\b>\n>\f>\u0294\t>\u0001?"+
		"\u0001?\u0003?\u0298\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u02a0\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0005A\u02a7\bA\nA\fA\u02aa"+
		"\tA\u0001B\u0001B\u0001B\u0003B\u02af\bB\u0001B\u0003B\u02b2\bB\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0003E\u02c1\bE\u0001E\u0001E\u0003E\u02c5\bE\u0001E\u0001"+
		"E\u0001E\u0001E\u0001F\u0001F\u0004F\u02cd\bF\u000bF\fF\u02ce\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u02d5\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u02dd\bH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0005J\u02e7\bJ\nJ\fJ\u02ea\tJ\u0001K\u0001K\u0003K\u02ee\bK\u0001K"+
		"\u0001K\u0001K\u0001K\u0001K\u0004K\u02f5\bK\u000bK\fK\u02f6\u0001K\u0001"+
		"K\u0003K\u02fb\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0003L\u0302\bL\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u030b\bM\u0001N\u0001"+
		"N\u0003N\u030f\bN\u0001N\u0001N\u0003N\u0313\bN\u0003N\u0315\bN\u0001"+
		"O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0003"+
		"S\u0321\bS\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0005T\u0329\bT\n"+
		"T\fT\u032c\tT\u0003T\u032e\bT\u0001T\u0001T\u0001U\u0001U\u0001U\u0001"+
		"U\u0001V\u0001V\u0003V\u0338\bV\u0001W\u0001W\u0001X\u0001X\u0001X\u0000"+
		"\u0000Y\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u0000\n\u0002\u0000%&*+\u0002\u0000((//\u0001\u0000\u0001\u0002\u0002"+
		"\u0000\u0001\u0001\u0003\u0007\u0001\u0000\u0012\u0013\u0002\u0000\u0014"+
		"\u0015\u0017\u0017\u0001\u0000!$\u0001\u0000GH\u0002\u0000\u001e#YZ\u0001"+
		"\u0000$X\u0360\u0000\u00b2\u0001\u0000\u0000\u0000\u0002\u00ba\u0001\u0000"+
		"\u0000\u0000\u0004\u00bc\u0001\u0000\u0000\u0000\u0006\u00c5\u0001\u0000"+
		"\u0000\u0000\b\u00c7\u0001\u0000\u0000\u0000\n\u00d3\u0001\u0000\u0000"+
		"\u0000\f\u00d6\u0001\u0000\u0000\u0000\u000e\u00db\u0001\u0000\u0000\u0000"+
		"\u0010\u00de\u0001\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000\u0000"+
		"\u0014\u00f0\u0001\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000"+
		"\u0018\u00fe\u0001\u0000\u0000\u0000\u001a\u0102\u0001\u0000\u0000\u0000"+
		"\u001c\u010f\u0001\u0000\u0000\u0000\u001e\u0120\u0001\u0000\u0000\u0000"+
		" \u0131\u0001\u0000\u0000\u0000\"\u0136\u0001\u0000\u0000\u0000$\u013e"+
		"\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000(\u0148\u0001\u0000"+
		"\u0000\u0000*\u014d\u0001\u0000\u0000\u0000,\u015a\u0001\u0000\u0000\u0000"+
		".\u015c\u0001\u0000\u0000\u00000\u0163\u0001\u0000\u0000\u00002\u0169"+
		"\u0001\u0000\u0000\u00004\u0177\u0001\u0000\u0000\u00006\u017b\u0001\u0000"+
		"\u0000\u00008\u0183\u0001\u0000\u0000\u0000:\u0187\u0001\u0000\u0000\u0000"+
		"<\u019b\u0001\u0000\u0000\u0000>\u019f\u0001\u0000\u0000\u0000@\u01a3"+
		"\u0001\u0000\u0000\u0000B\u01a6\u0001\u0000\u0000\u0000D\u01aa\u0001\u0000"+
		"\u0000\u0000F\u01ad\u0001\u0000\u0000\u0000H\u01b5\u0001\u0000\u0000\u0000"+
		"J\u01bd\u0001\u0000\u0000\u0000L\u01c5\u0001\u0000\u0000\u0000N\u01ce"+
		"\u0001\u0000\u0000\u0000P\u01d2\u0001\u0000\u0000\u0000R\u01db\u0001\u0000"+
		"\u0000\u0000T\u01dd\u0001\u0000\u0000\u0000V\u01e5\u0001\u0000\u0000\u0000"+
		"X\u01ed\u0001\u0000\u0000\u0000Z\u01f6\u0001\u0000\u0000\u0000\\\u01fa"+
		"\u0001\u0000\u0000\u0000^\u0211\u0001\u0000\u0000\u0000`\u0213\u0001\u0000"+
		"\u0000\u0000b\u021b\u0001\u0000\u0000\u0000d\u021d\u0001\u0000\u0000\u0000"+
		"f\u0223\u0001\u0000\u0000\u0000h\u0227\u0001\u0000\u0000\u0000j\u0232"+
		"\u0001\u0000\u0000\u0000l\u0241\u0001\u0000\u0000\u0000n\u0243\u0001\u0000"+
		"\u0000\u0000p\u0248\u0001\u0000\u0000\u0000r\u024a\u0001\u0000\u0000\u0000"+
		"t\u0262\u0001\u0000\u0000\u0000v\u0264\u0001\u0000\u0000\u0000x\u0278"+
		"\u0001\u0000\u0000\u0000z\u027a\u0001\u0000\u0000\u0000|\u0289\u0001\u0000"+
		"\u0000\u0000~\u0295\u0001\u0000\u0000\u0000\u0080\u029b\u0001\u0000\u0000"+
		"\u0000\u0082\u02a3\u0001\u0000\u0000\u0000\u0084\u02ab\u0001\u0000\u0000"+
		"\u0000\u0086\u02b5\u0001\u0000\u0000\u0000\u0088\u02b9\u0001\u0000\u0000"+
		"\u0000\u008a\u02be\u0001\u0000\u0000\u0000\u008c\u02ca\u0001\u0000\u0000"+
		"\u0000\u008e\u02d0\u0001\u0000\u0000\u0000\u0090\u02d8\u0001\u0000\u0000"+
		"\u0000\u0092\u02de\u0001\u0000\u0000\u0000\u0094\u02e3\u0001\u0000\u0000"+
		"\u0000\u0096\u02eb\u0001\u0000\u0000\u0000\u0098\u02fe\u0001\u0000\u0000"+
		"\u0000\u009a\u030a\u0001\u0000\u0000\u0000\u009c\u030c\u0001\u0000\u0000"+
		"\u0000\u009e\u0316\u0001\u0000\u0000\u0000\u00a0\u0318\u0001\u0000\u0000"+
		"\u0000\u00a2\u031a\u0001\u0000\u0000\u0000\u00a4\u031c\u0001\u0000\u0000"+
		"\u0000\u00a6\u031e\u0001\u0000\u0000\u0000\u00a8\u0324\u0001\u0000\u0000"+
		"\u0000\u00aa\u0331\u0001\u0000\u0000\u0000\u00ac\u0337\u0001\u0000\u0000"+
		"\u0000\u00ae\u0339\u0001\u0000\u0000\u0000\u00b0\u033b\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b5\u0005\t\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001"+
		"\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8\u00bb\u0003\u0004\u0002\u0000"+
		"\u00b9\u00bb\u0003\b\u0004\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u0003\u0001\u0000\u0000\u0000\u00bc"+
		"\u00c0\u0003\u0006\u0003\u0000\u00bd\u00bf\u0003~?\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0005\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0003"+
		"\u001c\u000e\u0000\u00c4\u00c6\u0003\u001e\u000f\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0007\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u001c\u0000\u0000\u00c8\u00ca\u0003"+
		"\u0082A\u0000\u00c9\u00cb\u00030\u0018\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cf\u0005\u001d\u0000\u0000\u00cd\u00d0\u0005\u0017\u0000"+
		"\u0000\u00ce\u00d0\u00032\u0019\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\t\u0001\u0000\u0000\u0000\u00d3\u00d4\u00055\u0000\u0000\u00d4"+
		"\u00d5\u0003\u0012\t\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u00059\u0000\u0000\u00d7\u00d9\u0003\u0012\t\u0000\u00d8\u00da\u0003"+
		"D\"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\r\u0001\u0000\u0000\u0000\u00db\u00dc\u00057\u0000"+
		"\u0000\u00dc\u00dd\u0003H$\u0000\u00dd\u000f\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005.\u0000\u0000\u00df\u00e0\u0003H$\u0000\u00e0\u0011\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0005?\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e6\u0003\u0014\n\u0000\u00e5\u00e7\u0003\u001a\r"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003\u000e\u0007"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003\u0010\b\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u0013\u0001\u0000\u0000\u0000\u00ee\u00f1\u0005\u0017\u0000\u0000"+
		"\u00ef\u00f1\u0003\u0016\u000b\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005\u000b\u0000\u0000\u00f3\u00f5\u0003\u0016\u000b\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u0015\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0003H$\u0000\u00fa\u00fb\u0005=\u0000\u0000\u00fb\u00fd"+
		"\u0003\u00aeW\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u0017\u0001\u0000\u0000\u0000\u00fe\u0100\u0003"+
		"H$\u0000\u00ff\u0101\u0007\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0019\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u00053\u0000\u0000\u0103\u0104\u0005\'\u0000\u0000"+
		"\u0104\u0109\u0003\u0018\f\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106"+
		"\u0108\u0003\u0018\f\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u001b\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0003$\u0012\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u011b\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u011c\u0003"+
		"\n\u0005\u0000\u0113\u0115\u0003&\u0013\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0003\n\u0005\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000"+
		"\u0000\u011b\u0112\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000"+
		"\u0000\u011c\u001d\u0001\u0000\u0000\u0000\u011d\u011f\u0003$\u0012\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u012a\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u0125\u0003&\u0013\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0129\u012b\u0003\f\u0006\u0000\u012a\u0126"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0003\u001c\u000e\u0000\u012f\u001f"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u00052\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005/\u0000\u0000\u0134\u0135\u0003B!"+
		"\u0000\u0135!\u0001\u0000\u0000\u0000\u0136\u0137\u0005;\u0000\u0000\u0137"+
		"\u0138\u0003H$\u0000\u0138\u0139\u0005=\u0000\u0000\u0139\u013a\u0003"+
		"\u00aeW\u0000\u013a#\u0001\u0000\u0000\u0000\u013b\u013f\u0003 \u0010"+
		"\u0000\u013c\u013f\u0003\"\u0011\u0000\u013d\u013f\u0003.\u0017\u0000"+
		"\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f%\u0001\u0000\u0000\u0000\u0140"+
		"\u0146\u0003@ \u0000\u0141\u0146\u00036\u001b\u0000\u0142\u0146\u0003"+
		"(\u0014\u0000\u0143\u0146\u0003:\u001d\u0000\u0144\u0146\u0003*\u0015"+
		"\u0000\u0145\u0140\u0001\u0000\u0000\u0000\u0145\u0141\u0001\u0000\u0000"+
		"\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\'\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0005,\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005)\u0000\u0000\u014b\u014c\u0003\u0094J\u0000\u014c)\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u00054\u0000\u0000\u014e\u0153\u0003,\u0016"+
		"\u0000\u014f\u0150\u0005\u000b\u0000\u0000\u0150\u0152\u0003,\u0016\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154+\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0003\u00aeW\u0000\u0157\u0158\u0003>\u001f\u0000\u0158\u015b\u0001"+
		"\u0000\u0000\u0000\u0159\u015b\u0003h4\u0000\u015a\u0156\u0001\u0000\u0000"+
		"\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b-\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005\u001c\u0000\u0000\u015d\u015e\u0003\u0082A\u0000\u015e"+
		"\u0161\u00030\u0018\u0000\u015f\u0160\u0005\u001d\u0000\u0000\u0160\u0162"+
		"\u00032\u0019\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162/\u0001\u0000\u0000\u0000\u0163\u0165\u0005\f"+
		"\u0000\u0000\u0164\u0166\u0003\u0094J\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\r\u0000\u0000\u01681\u0001\u0000\u0000\u0000"+
		"\u0169\u016e\u00034\u001a\u0000\u016a\u016b\u0005\u000b\u0000\u0000\u016b"+
		"\u016d\u00034\u001a\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0173\u0003D\"\u0000\u0172\u0171\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u01733\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0003\u00aeW\u0000\u0175\u0176\u0005=\u0000\u0000"+
		"\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0003\u00aeW\u0000\u017a5\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u00050\u0000\u0000\u017c\u0180\u0003j5\u0000\u017d\u017f\u00038\u001c"+
		"\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000"+
		"\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u01817\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u00051\u0000\u0000\u0184\u0185\u0007\u0001\u0000\u0000\u0185"+
		"\u0186\u0003:\u001d\u0000\u01869\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"6\u0000\u0000\u0188\u018d\u0003<\u001e\u0000\u0189\u018a\u0005\u000b\u0000"+
		"\u0000\u018a\u018c\u0003<\u001e\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e;\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0003h4\u0000\u0191\u0192\u0005"+
		"\u0001\u0000\u0000\u0192\u0193\u0003H$\u0000\u0193\u019c\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0003\u00aeW\u0000\u0195\u0196\u0007\u0002\u0000\u0000"+
		"\u0196\u0197\u0003H$\u0000\u0197\u019c\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0003\u00aeW\u0000\u0199\u019a\u0003>\u001f\u0000\u019a\u019c\u0001\u0000"+
		"\u0000\u0000\u019b\u0190\u0001\u0000\u0000\u0000\u019b\u0194\u0001\u0000"+
		"\u0000\u0000\u019b\u0198\u0001\u0000\u0000\u0000\u019c=\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005\u0019\u0000\u0000\u019e\u01a0\u0003\u00acV\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2?\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005(\u0000\u0000\u01a4\u01a5"+
		"\u0003F#\u0000\u01a5A\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003F#\u0000"+
		"\u01a7\u01a9\u0003D\"\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9C\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u00058\u0000\u0000\u01ab\u01ac\u0003H$\u0000\u01acE\u0001\u0000\u0000"+
		"\u0000\u01ad\u01b2\u0003j5\u0000\u01ae\u01af\u0005\u000b\u0000\u0000\u01af"+
		"\u01b1\u0003j5\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3G\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b5\u01ba\u0003J%\u0000\u01b6\u01b7\u0005D\u0000\u0000"+
		"\u01b7\u01b9\u0003J%\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bbI\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bd\u01c2\u0003L&\u0000\u01be\u01bf\u0005F\u0000"+
		"\u0000\u01bf\u01c1\u0003L&\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3K\u0001\u0000\u0000\u0000\u01c4\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c5\u01ca\u0003N\'\u0000\u01c6\u01c7\u0005"+
		"<\u0000\u0000\u01c7\u01c9\u0003N\'\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cbM\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005C\u0000\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003P(\u0000\u01d1O\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d8\u0003T*\u0000\u01d3\u01d4\u0003R)\u0000"+
		"\u01d4\u01d5\u0003T*\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9Q\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0007"+
		"\u0003\u0000\u0000\u01dcS\u0001\u0000\u0000\u0000\u01dd\u01e2\u0003V+"+
		"\u0000\u01de\u01df\u0007\u0004\u0000\u0000\u01df\u01e1\u0003V+\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"U\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01ea"+
		"\u0003X,\u0000\u01e6\u01e7\u0007\u0005\u0000\u0000\u01e7\u01e9\u0003X"+
		",\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ebW\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ed\u01f2\u0003Z-\u0000\u01ee\u01ef\u0005\u0016\u0000\u0000\u01ef\u01f1"+
		"\u0003Z-\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3Y\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f7\u0007\u0004\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0003\\.\u0000\u01f9[\u0001\u0000\u0000\u0000\u01fa"+
		"\u0200\u0003f3\u0000\u01fb\u01ff\u0003`0\u0000\u01fc\u01ff\u0003^/\u0000"+
		"\u01fd\u01ff\u0003d2\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\u0202"+
		"\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0001\u0000\u0000\u0000\u0201]\u0001\u0000\u0000\u0000\u0202\u0200\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0005A\u0000\u0000\u0204\u0212\u0003f3"+
		"\u0000\u0205\u020e\u0005\u0010\u0000\u0000\u0206\u0208\u0003H$\u0000\u0207"+
		"\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0005\b\u0000\u0000\u020a\u020c"+
		"\u0003H$\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020f\u0003H$\u0000"+
		"\u020e\u0207\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0005\u0011\u0000\u0000"+
		"\u0211\u0203\u0001\u0000\u0000\u0000\u0211\u0205\u0001\u0000\u0000\u0000"+
		"\u0212_\u0001\u0000\u0000\u0000\u0213\u0214\u0003b1\u0000\u0214\u0215"+
		"\u0003f3\u0000\u0215a\u0001\u0000\u0000\u0000\u0216\u0217\u0005E\u0000"+
		"\u0000\u0217\u021c\u00059\u0000\u0000\u0218\u0219\u0005@\u0000\u0000\u0219"+
		"\u021c\u00059\u0000\u0000\u021a\u021c\u0005>\u0000\u0000\u021b\u0216\u0001"+
		"\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021cc\u0001\u0000\u0000\u0000\u021d\u021f\u0005B\u0000"+
		"\u0000\u021e\u0220\u0005C\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005I\u0000\u0000\u0222e\u0001\u0000\u0000\u0000\u0223\u0225"+
		"\u0003h4\u0000\u0224\u0226\u0003>\u001f\u0000\u0225\u0224\u0001\u0000"+
		"\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226g\u0001\u0000\u0000"+
		"\u0000\u0227\u022c\u0003t:\u0000\u0228\u0229\u0005\n\u0000\u0000\u0229"+
		"\u022b\u0003\u00acV\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022e"+
		"\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0001\u0000\u0000\u0000\u022di\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0003\u00aeW\u0000\u0230\u0231\u0005\u0001"+
		"\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022f\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0003l6\u0000\u0235k\u0001\u0000\u0000\u0000"+
		"\u0236\u023a\u0003r9\u0000\u0237\u0239\u0003n7\u0000\u0238\u0237\u0001"+
		"\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0242\u0001"+
		"\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"\f\u0000\u0000\u023e\u023f\u0003l6\u0000\u023f\u0240\u0005\r\u0000\u0000"+
		"\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0236\u0001\u0000\u0000\u0000"+
		"\u0241\u023d\u0001\u0000\u0000\u0000\u0242m\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0003x<\u0000\u0244\u0245\u0003r9\u0000\u0245o\u0001\u0000\u0000"+
		"\u0000\u0246\u0249\u0003\u00a8T\u0000\u0247\u0249\u0003\u0098L\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249"+
		"q\u0001\u0000\u0000\u0000\u024a\u024c\u0005\f\u0000\u0000\u024b\u024d"+
		"\u0003\u00aeW\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001"+
		"\u0000\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0250\u0003"+
		">\u001f\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u0253\u0003p8\u0000"+
		"\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0005\r\u0000\u0000\u0255"+
		"s\u0001\u0000\u0000\u0000\u0256\u0263\u0003\u009aM\u0000\u0257\u0263\u0003"+
		"\u0098L\u0000\u0258\u0263\u0003\u0096K\u0000\u0259\u0263\u0003\u0092I"+
		"\u0000\u025a\u0263\u0003\u008eG\u0000\u025b\u0263\u0003\u008aE\u0000\u025c"+
		"\u0263\u0003\u0088D\u0000\u025d\u0263\u0003\u008cF\u0000\u025e\u0263\u0003"+
		"\u0086C\u0000\u025f\u0263\u0003\u0084B\u0000\u0260\u0263\u0003\u00aeW"+
		"\u0000\u0261\u0263\u0003\u0080@\u0000\u0262\u0256\u0001\u0000\u0000\u0000"+
		"\u0262\u0257\u0001\u0000\u0000\u0000\u0262\u0258\u0001\u0000\u0000\u0000"+
		"\u0262\u0259\u0001\u0000\u0000\u0000\u0262\u025a\u0001\u0000\u0000\u0000"+
		"\u0262\u025b\u0001\u0000\u0000\u0000\u0262\u025c\u0001\u0000\u0000\u0000"+
		"\u0262\u025d\u0001\u0000\u0000\u0000\u0262\u025e\u0001\u0000\u0000\u0000"+
		"\u0262\u025f\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000"+
		"\u0262\u0261\u0001\u0000\u0000\u0000\u0263u\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0003\u00aeW\u0000\u0265\u0266\u0005\u0001\u0000\u0000\u0266w\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0005\u0006\u0000\u0000\u0268\u026a\u0005"+
		"\u0012\u0000\u0000\u0269\u026b\u0003z=\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026e\u0005\u0012\u0000\u0000\u026d\u026f\u0005\u0005\u0000"+
		"\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u0279\u0001\u0000\u0000\u0000\u0270\u0272\u0005\u0012\u0000"+
		"\u0000\u0271\u0273\u0003z=\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0276\u0005\u0012\u0000\u0000\u0275\u0277\u0005\u0005\u0000\u0000\u0276"+
		"\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u0279\u0001\u0000\u0000\u0000\u0278\u0267\u0001\u0000\u0000\u0000\u0278"+
		"\u0270\u0001\u0000\u0000\u0000\u0279y\u0001\u0000\u0000\u0000\u027a\u027c"+
		"\u0005\u0010\u0000\u0000\u027b\u027d\u0003\u00aeW\u0000\u027c\u027b\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0001"+
		"\u0000\u0000\u0000\u027e\u0280\u0003|>\u0000\u027f\u027e\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0282\u0001\u0000\u0000"+
		"\u0000\u0281\u0283\u0003\u009cN\u0000\u0282\u0281\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000"+
		"\u0284\u0286\u0003p8\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0005\u0011\u0000\u0000\u0288{\u0001\u0000\u0000\u0000\u0289\u028a\u0005"+
		"\u0019\u0000\u0000\u028a\u0292\u0003\u00acV\u0000\u028b\u028d\u0005\u001a"+
		"\u0000\u0000\u028c\u028e\u0005\u0019\u0000\u0000\u028d\u028c\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000"+
		"\u0000\u0000\u028f\u0291\u0003\u00acV\u0000\u0290\u028b\u0001\u0000\u0000"+
		"\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293}\u0001\u0000\u0000\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0297\u0005:\u0000\u0000\u0296"+
		"\u0298\u0005$\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0003\u0006\u0003\u0000\u029a\u007f\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0005-\u0000\u0000\u029c\u029f\u0005\u000e\u0000\u0000\u029d\u02a0\u0003"+
		"\u0004\u0002\u0000\u029e\u02a0\u0003B!\u0000\u029f\u029d\u0001\u0000\u0000"+
		"\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0005\u000f\u0000\u0000\u02a2\u0081\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a8\u0003\u00aeW\u0000\u02a4\u02a5\u0005\n\u0000\u0000"+
		"\u02a5\u02a7\u0003\u00aeW\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a9\u0083\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ac\u0003\u0082A\u0000\u02ac\u02ae"+
		"\u0005\f\u0000\u0000\u02ad\u02af\u0005?\u0000\u0000\u02ae\u02ad\u0001"+
		"\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b2\u0003\u0094J\u0000\u02b1\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u0005\r\u0000\u0000\u02b4\u0085\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0005\f\u0000\u0000\u02b6\u02b7\u0003H$\u0000\u02b7"+
		"\u02b8\u0005\r\u0000\u0000\u02b8\u0087\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0007\u0006\u0000\u0000\u02ba\u02bb\u0005\f\u0000\u0000\u02bb\u02bc\u0003"+
		"\u0090H\u0000\u02bc\u02bd\u0005\r\u0000\u0000\u02bd\u0089\u0001\u0000"+
		"\u0000\u0000\u02be\u02c0\u0005\u0010\u0000\u0000\u02bf\u02c1\u0003v;\u0000"+
		"\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003\u008cF\u0000\u02c3"+
		"\u02c5\u0003D\"\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0005\u001a\u0000\u0000\u02c7\u02c8\u0003H$\u0000\u02c8\u02c9\u0005\u0011"+
		"\u0000\u0000\u02c9\u008b\u0001\u0000\u0000\u0000\u02ca\u02cc\u0003r9\u0000"+
		"\u02cb\u02cd\u0003n7\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cf\u008d\u0001\u0000\u0000\u0000\u02d0\u02d1"+
		"\u0005\u0010\u0000\u0000\u02d1\u02d4\u0003\u0090H\u0000\u02d2\u02d3\u0005"+
		"\u001a\u0000\u0000\u02d3\u02d5\u0003H$\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0005\u0011\u0000\u0000\u02d7\u008f\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0003\u00aeW\u0000\u02d9\u02da\u0005A\u0000\u0000\u02da"+
		"\u02dc\u0003H$\u0000\u02db\u02dd\u0003D\"\u0000\u02dc\u02db\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u0091\u0001\u0000"+
		"\u0000\u0000\u02de\u02df\u0005 \u0000\u0000\u02df\u02e0\u0005\f\u0000"+
		"\u0000\u02e0\u02e1\u0005\u0017\u0000\u0000\u02e1\u02e2\u0005\r\u0000\u0000"+
		"\u02e2\u0093\u0001\u0000\u0000\u0000\u02e3\u02e8\u0003H$\u0000\u02e4\u02e5"+
		"\u0005\u000b\u0000\u0000\u02e5\u02e7\u0003H$\u0000\u02e6\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u0095\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ed\u0005O\u0000"+
		"\u0000\u02ec\u02ee\u0003H$\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f4\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0005P\u0000\u0000\u02f0\u02f1\u0003H$\u0000\u02f1\u02f2\u0005"+
		"Q\u0000\u0000\u02f2\u02f3\u0003H$\u0000\u02f3\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f4\u02ef\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005R\u0000\u0000"+
		"\u02f9\u02fb\u0003H$\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005S\u0000\u0000\u02fd\u0097\u0001\u0000\u0000\u0000\u02fe\u0301\u0005"+
		"\u001b\u0000\u0000\u02ff\u0302\u0003\u00aeW\u0000\u0300\u0302\u0003\u00a0"+
		"P\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0300\u0001\u0000\u0000"+
		"\u0000\u0302\u0099\u0001\u0000\u0000\u0000\u0303\u030b\u0003\u009eO\u0000"+
		"\u0304\u030b\u0003\u00a0P\u0000\u0305\u030b\u0005I\u0000\u0000\u0306\u030b"+
		"\u0003\u00a2Q\u0000\u0307\u030b\u0003\u00a4R\u0000\u0308\u030b\u0003\u00a6"+
		"S\u0000\u0309\u030b\u0003\u00a8T\u0000\u030a\u0303\u0001\u0000\u0000\u0000"+
		"\u030a\u0304\u0001\u0000\u0000\u0000\u030a\u0305\u0001\u0000\u0000\u0000"+
		"\u030a\u0306\u0001\u0000\u0000\u0000\u030a\u0307\u0001\u0000\u0000\u0000"+
		"\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000"+
		"\u030b\u009b\u0001\u0000\u0000\u0000\u030c\u030e\u0005\u0017\u0000\u0000"+
		"\u030d\u030f\u0003\u00a0P\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0001\u0000\u0000\u0000\u030f\u0314\u0001\u0000\u0000\u0000\u0310"+
		"\u0312\u0005\b\u0000\u0000\u0311\u0313\u0003\u00a0P\u0000\u0312\u0311"+
		"\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0315"+
		"\u0001\u0000\u0000\u0000\u0314\u0310\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0001\u0000\u0000\u0000\u0315\u009d\u0001\u0000\u0000\u0000\u0316\u0317"+
		"\u0007\u0007\u0000\u0000\u0317\u009f\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0005]\u0000\u0000\u0319\u00a1\u0001\u0000\u0000\u0000\u031a\u031b\u0005"+
		"\\\u0000\u0000\u031b\u00a3\u0001\u0000\u0000\u0000\u031c\u031d\u0005["+
		"\u0000\u0000\u031d\u00a5\u0001\u0000\u0000\u0000\u031e\u0320\u0005\u0010"+
		"\u0000\u0000\u031f\u0321\u0003\u0094J\u0000\u0320\u031f\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0005\u0011\u0000\u0000\u0323\u00a7\u0001\u0000\u0000"+
		"\u0000\u0324\u032d\u0005\u000e\u0000\u0000\u0325\u032a\u0003\u00aaU\u0000"+
		"\u0326\u0327\u0005\u000b\u0000\u0000\u0327\u0329\u0003\u00aaU\u0000\u0328"+
		"\u0326\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032e\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d"+
		"\u0325\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0005\u000f\u0000\u0000\u0330"+
		"\u00a9\u0001\u0000\u0000\u0000\u0331\u0332\u0003\u00acV\u0000\u0332\u0333"+
		"\u0005\u0019\u0000\u0000\u0333\u0334\u0003H$\u0000\u0334\u00ab\u0001\u0000"+
		"\u0000\u0000\u0335\u0338\u0003\u00aeW\u0000\u0336\u0338\u0003\u00b0X\u0000"+
		"\u0337\u0335\u0001\u0000\u0000\u0000\u0337\u0336\u0001\u0000\u0000\u0000"+
		"\u0338\u00ad\u0001\u0000\u0000\u0000\u0339\u033a\u0007\b\u0000\u0000\u033a"+
		"\u00af\u0001\u0000\u0000\u0000\u033b\u033c\u0007\t\u0000\u0000\u033c\u00b1"+
		"\u0001\u0000\u0000\u0000f\u00b4\u00ba\u00c0\u00c5\u00ca\u00cf\u00d1\u00d9"+
		"\u00e2\u00e6\u00e9\u00ec\u00f0\u00f6\u00fc\u0100\u0109\u010f\u0116\u0119"+
		"\u011b\u0120\u0126\u012c\u0131\u013e\u0145\u0148\u0153\u015a\u0161\u0165"+
		"\u016e\u0172\u0177\u0180\u018d\u019b\u01a1\u01a8\u01b2\u01ba\u01c2\u01ca"+
		"\u01ce\u01d8\u01e2\u01ea\u01f2\u01f6\u01fe\u0200\u0207\u020b\u020e\u0211"+
		"\u021b\u021f\u0225\u022c\u0232\u023a\u0241\u0248\u024c\u024f\u0252\u0262"+
		"\u026a\u026e\u0272\u0276\u0278\u027c\u027f\u0282\u0285\u028d\u0292\u0297"+
		"\u029f\u02a8\u02ae\u02b1\u02c0\u02c4\u02ce\u02d4\u02dc\u02e8\u02ed\u02f6"+
		"\u02fa\u0301\u030a\u030e\u0312\u0314\u0320\u032a\u032d\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}