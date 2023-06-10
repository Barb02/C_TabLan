// Generated from TabLan.g4 by ANTLR 4.12.0

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TabLanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, TEXT=52, VARTYPE=53, 
		BOOLEAN=54, ID=55, INTEGER=56, REAL=57, WS=58, COMMENT=59, ERROR=60;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_typeDef = 3, 
		RULE_typeExpr = 4, RULE_remove = 5, RULE_headerAssignment = 6, RULE_addLine = 7, 
		RULE_typeCreation = 8, RULE_createTypeTable = 9, RULE_createTypeNumber = 10, 
		RULE_tableExpr = 11, RULE_print = 12, RULE_forLoop = 13, RULE_expr = 14, 
		RULE_tableColum = 15, RULE_read = 16, RULE_readFile = 17, RULE_howToRead = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assignment", "typeDef", "typeExpr", "remove", "headerAssignment", 
			"addLine", "typeCreation", "createTypeTable", "createTypeNumber", "tableExpr", 
			"print", "forLoop", "expr", "tableColum", "read", "readFile", "howToRead"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':= new'", "'('", "')'", "':='", "'when'", "'unique'", 
			"':'", "'integer'", "'real'", "'boolean'", "'text'", "'remove'", "'->'", 
			"'['", "','", "']'", "'>>'", "'[]'", "'type'", "'table'", "'{'", "'}'", 
			"'invariant'", "'and'", "'print'", "'println'", "'center'", "'for'", 
			"'in'", "'do'", "'end'", "'+'", "'-'", "'length'", "'*'", "'/'", "'\\\\'", 
			"'='", "'>='", "'<='", "'>'", "'<'", "'read'", "'isdef'", "'?'", "'.'", 
			"'using'", "'as'", "'column'", "'separator'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TEXT", "VARTYPE", "BOOLEAN", "ID", "INTEGER", 
			"REAL", "WS", "COMMENT", "ERROR"
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
	public String getGrammarFileName() { return "TabLan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static protected Map<String, Symbol> symbolTable = new HashMap<>();
	    static protected Map<String, List<Symbol>> tableColumns = new HashMap<>(); // classe (Ex: aTable) -> lista de colunas
	    static protected Map<String, Type> typeTable = new HashMap<>();
	    static protected Map<String,List<Symbol>> formulaVariables = new HashMap<>();

	public TabLanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TabLanParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274772414697094794L) != 0)) {
				{
				{
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274772414697094792L) != 0)) {
					{
					setState(38);
					stat();
					}
				}

				setState(41);
				match(T__0);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TypeCreationContext typeCreation() {
			return getRuleContext(TypeCreationContext.class,0);
		}
		public HeaderAssignmentContext headerAssignment() {
			return getRuleContext(HeaderAssignmentContext.class,0);
		}
		public AddLineContext addLine() {
			return getRuleContext(AddLineContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				forLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				typeDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				typeCreation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				headerAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				addLine();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				remove();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				expr(0);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentColumnContext extends AssignmentContext {
		public TableColumContext tableColum() {
			return getRuleContext(TableColumContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentColumnContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAssignmentColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAssignmentColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAssignmentColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentViewContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TableColumContext tableColum() {
			return getRuleContext(TableColumContext.class,0);
		}
		public AssignmentViewContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAssignmentView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAssignmentView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAssignmentView(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentIDContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentIDContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAssignmentID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAssignmentID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAssignmentID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentNewContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public List<TableColumContext> tableColum() {
			return getRuleContexts(TableColumContext.class);
		}
		public TableColumContext tableColum(int i) {
			return getRuleContext(TableColumContext.class,i);
		}
		public AssignmentNewContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAssignmentNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAssignmentNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAssignmentNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentReadFileContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public ReadFileContext readFile() {
			return getRuleContext(ReadFileContext.class,0);
		}
		public AssignmentReadFileContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAssignmentReadFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAssignmentReadFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAssignmentReadFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignmentNewContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(ID);
				setState(61);
				match(T__1);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(62);
					match(T__2);
					setState(63);
					tableColum();
					setState(64);
					match(T__3);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AssignmentViewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__4);
				setState(73);
				tableColum();
				}
				break;
			case 3:
				_localctx = new AssignmentIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__4);
				setState(76);
				expr(0);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(77);
					match(T__5);
					setState(78);
					expr(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new AssignmentColumnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				tableColum();
				setState(82);
				match(T__4);
				setState(83);
				expr(0);
				}
				break;
			case 5:
				_localctx = new AssignmentReadFileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(ID);
				setState(86);
				match(T__4);
				setState(87);
				readFile();
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
	public static class TypeDefContext extends ParserRuleContext {
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
	 
		public TypeDefContext() { }
		public void copyFrom(TypeDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefNoExprContext extends TypeDefContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeDefNoExprContext(TypeDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeDefNoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeDefNoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeDefNoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefWithExprContext extends TypeDefContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeDefWithExprContext(TypeDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeDefWithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeDefWithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeDefWithExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDef);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new TypeDefNoExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(90);
					match(T__6);
					}
				}

				setState(93);
				match(ID);
				setState(94);
				match(T__7);
				setState(95);
				typeExpr();
				}
				break;
			case 2:
				_localctx = new TypeDefWithExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(96);
					match(T__6);
					}
				}

				setState(99);
				match(ID);
				setState(100);
				match(T__7);
				setState(101);
				typeExpr();
				setState(102);
				match(T__4);
				setState(103);
				expr(0);
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
	public static class TypeExprContext extends ParserRuleContext {
		public Type res;
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends TypeExprContext {
		public TypeIntContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRealContext extends TypeExprContext {
		public TypeRealContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTextContext extends TypeExprContext {
		public TypeTextContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdContext extends TypeExprContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TypeIdContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoolContext extends TypeExprContext {
		public TypeBoolContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeExpr);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__8);
				((TypeIntContext)_localctx).res =  new IntegerType();
				}
				break;
			case T__9:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__9);
				((TypeRealContext)_localctx).res =  new RealType();
				}
				break;
			case T__10:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__10);
				((TypeBoolContext)_localctx).res =  new BooleanType();
				}
				break;
			case T__11:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__11);
				((TypeTextContext)_localctx).res =  new TextType();
				}
				break;
			case ID:
				_localctx = new TypeIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(ID);
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
	public static class RemoveContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__12);
			setState(119);
			expr(0);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(120);
				match(T__5);
				setState(121);
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
	public static class HeaderAssignmentContext extends ParserRuleContext {
		public HeaderAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAssignment; }
	 
		public HeaderAssignmentContext() { }
		public void copyFrom(HeaderAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeaderTableAssignmentContext extends HeaderAssignmentContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public HeaderTableAssignmentContext(HeaderAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterHeaderTableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitHeaderTableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitHeaderTableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeaderColumnAssignmentContext extends HeaderAssignmentContext {
		public TableColumContext tableColum() {
			return getRuleContext(TableColumContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public HeaderColumnAssignmentContext(HeaderAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterHeaderColumnAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitHeaderColumnAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitHeaderColumnAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAssignmentContext headerAssignment() throws RecognitionException {
		HeaderAssignmentContext _localctx = new HeaderAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_headerAssignment);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new HeaderColumnAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				tableColum();
				setState(125);
				match(T__13);
				setState(126);
				match(TEXT);
				}
				break;
			case 2:
				_localctx = new HeaderTableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__13);
				setState(130);
				match(TEXT);
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
	public static class AddLineContext extends ParserRuleContext {
		public AddLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addLine; }
	 
		public AddLineContext() { }
		public void copyFrom(AddLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddEmptyLineTableContext extends AddLineContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public AddEmptyLineTableContext(AddLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAddEmptyLineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAddEmptyLineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAddEmptyLineTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddLineTableContext extends AddLineContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public AddLineTableContext(AddLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterAddLineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitAddLineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitAddLineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddLineContext addLine() throws RecognitionException {
		AddLineContext _localctx = new AddLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addLine);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new AddLineTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__14);
				setState(134);
				expr(0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(135);
					match(T__15);
					setState(136);
					expr(0);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__16);
				setState(143);
				match(T__17);
				setState(144);
				match(ID);
				}
				break;
			case T__18:
				_localctx = new AddEmptyLineTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__18);
				setState(147);
				match(T__17);
				setState(148);
				match(ID);
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
	public static class TypeCreationContext extends ParserRuleContext {
		public CreateTypeTableContext createTypeTable() {
			return getRuleContext(CreateTypeTableContext.class,0);
		}
		public CreateTypeNumberContext createTypeNumber() {
			return getRuleContext(CreateTypeNumberContext.class,0);
		}
		public TypeCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTypeCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTypeCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTypeCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCreationContext typeCreation() throws RecognitionException {
		TypeCreationContext _localctx = new TypeCreationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeCreation);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				createTypeTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				createTypeNumber();
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
	public static class CreateTypeTableContext extends ParserRuleContext {
		public CreateTypeTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeTable; }
	 
		public CreateTypeTableContext() { }
		public void copyFrom(CreateTypeTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTypeTableInnerContext extends CreateTypeTableContext {
		public List<TerminalNode> ID() { return getTokens(TabLanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabLanParser.ID, i);
		}
		public List<TableExprContext> tableExpr() {
			return getRuleContexts(TableExprContext.class);
		}
		public TableExprContext tableExpr(int i) {
			return getRuleContext(TableExprContext.class,i);
		}
		public CreateTypeTableInnerContext(CreateTypeTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterCreateTypeTableInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitCreateTypeTableInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitCreateTypeTableInner(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTypeTableNoTextContext extends CreateTypeTableContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public List<TableExprContext> tableExpr() {
			return getRuleContexts(TableExprContext.class);
		}
		public TableExprContext tableExpr(int i) {
			return getRuleContext(TableExprContext.class,i);
		}
		public CreateTypeTableNoTextContext(CreateTypeTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterCreateTypeTableNoText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitCreateTypeTableNoText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitCreateTypeTableNoText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTypeTableTextContext extends CreateTypeTableContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public List<TableExprContext> tableExpr() {
			return getRuleContexts(TableExprContext.class);
		}
		public TableExprContext tableExpr(int i) {
			return getRuleContext(TableExprContext.class,i);
		}
		public CreateTypeTableTextContext(CreateTypeTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterCreateTypeTableText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitCreateTypeTableText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitCreateTypeTableText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeTableContext createTypeTable() throws RecognitionException {
		CreateTypeTableContext _localctx = new CreateTypeTableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTypeTable);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new CreateTypeTableNoTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__19);
				setState(156);
				match(T__20);
				setState(157);
				match(ID);
				setState(158);
				match(T__21);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==ID) {
					{
					{
					setState(159);
					tableExpr();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(T__22);
				}
				break;
			case 2:
				_localctx = new CreateTypeTableTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__19);
				setState(167);
				match(T__20);
				setState(168);
				match(ID);
				setState(169);
				match(T__13);
				setState(170);
				match(TEXT);
				setState(171);
				match(T__21);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==ID) {
					{
					{
					setState(172);
					tableExpr();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__22);
				}
				break;
			case 3:
				_localctx = new CreateTypeTableInnerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__19);
				setState(180);
				match(T__20);
				setState(181);
				match(ID);
				setState(182);
				match(T__2);
				setState(183);
				match(ID);
				setState(184);
				match(T__7);
				setState(185);
				match(ID);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(186);
					match(T__15);
					setState(187);
					match(ID);
					setState(188);
					match(T__7);
					setState(189);
					match(ID);
					}
				}

				setState(192);
				match(T__3);
				setState(193);
				match(T__21);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==ID) {
					{
					{
					setState(194);
					tableExpr();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__22);
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
	public static class CreateTypeNumberContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TabLanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabLanParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreateTypeNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterCreateTypeNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitCreateTypeNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitCreateTypeNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeNumberContext createTypeNumber() throws RecognitionException {
		CreateTypeNumberContext _localctx = new CreateTypeNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTypeNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__19);
			setState(204);
			match(ID);
			setState(205);
			match(ID);
			setState(206);
			match(T__21);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(207);
				match(T__23);
				}
			}

			setState(210);
			expr(0);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(211);
				match(T__24);
				setState(212);
				expr(0);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(T__15);
			setState(219);
			expr(0);
			setState(220);
			match(T__0);
			setState(221);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
	public static class TableExprContext extends ParserRuleContext {
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	 
		public TableExprContext() { }
		public void copyFrom(TableExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableExprNoTextContext extends TableExprContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TableExprNoTextContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTableExprNoText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTableExprNoText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTableExprNoText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableExprTextContext extends TableExprContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public TableExprTextContext(TableExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTableExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTableExprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTableExprText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		TableExprContext _localctx = new TableExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableExpr);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new TableExprNoTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				typeDef();
				setState(224);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new TableExprTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				typeDef();
				setState(227);
				match(T__13);
				setState(228);
				match(TEXT);
				setState(229);
				match(T__0);
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
	public static class PrintContext extends ParserRuleContext {
		public Token p;
		public ExprContext c;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((PrintContext)_localctx).p = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
				((PrintContext)_localctx).p = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			expr(0);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(235);
				match(T__15);
				setState(236);
				expr(0);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(242);
				match(T__27);
				setState(243);
				((PrintContext)_localctx).c = expr(0);
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
	public static class ForLoopContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TabLanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabLanParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__28);
			setState(247);
			match(ID);
			setState(248);
			match(T__29);
			setState(249);
			match(ID);
			setState(250);
			match(T__30);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				stat();
				setState(252);
				match(T__0);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274772414697094792L) != 0) );
			setState(258);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
		public Type varType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.varType = ctx.varType;
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddColumnContext extends ExprContext {
		public TableColumContext e1;
		public Token op;
		public ExprContext e2;
		public TableColumContext tableColum() {
			return getRuleContext(TableColumContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAddColumnContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(TabLanParser.INTEGER, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTablecolumContext extends ExprContext {
		public TableColumContext tableColum() {
			return getRuleContext(TableColumContext.class,0);
		}
		public ExprTablecolumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprTablecolum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprTablecolum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprTablecolum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTextContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public ExprTextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompareContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprCompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIsDefContext extends ExprContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public ExprIsDefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprIsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprIsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprIsDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLengthContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLengthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprLength(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCastContext extends ExprContext {
		public ExprContext e;
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCastContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(TabLanParser.BOOLEAN, 0); }
		public ExprBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprInLineIFContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprInLineIFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprInLineIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprInLineIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprInLineIF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSignContext extends ExprContext {
		public Token sign;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprSign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRealContext extends ExprContext {
		public TerminalNode REAL() { return getToken(TabLanParser.REAL, 0); }
		public ExprRealContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitExprMulDiv(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ExprSignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				((ExprSignContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
					((ExprSignContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				((ExprSignContext)_localctx).e = expr(17);
				}
				break;
			case 2:
				{
				_localctx = new ExprLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__34);
				setState(264);
				expr(16);
				}
				break;
			case 3:
				{
				_localctx = new ExprAddColumnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				((ExprAddColumnContext)_localctx).e1 = tableColum();
				setState(266);
				((ExprAddColumnContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
					((ExprAddColumnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(267);
				((ExprAddColumnContext)_localctx).e2 = expr(15);
				}
				break;
			case 4:
				{
				_localctx = new ExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				typeExpr();
				setState(270);
				match(T__2);
				setState(271);
				((ExprCastContext)_localctx).e = expr(0);
				setState(272);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(T__43);
				setState(275);
				match(T__29);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(276);
					match(TEXT);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(T__2);
				setState(280);
				((ExprParenthesisContext)_localctx).e = expr(0);
				setState(281);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new ExprIsDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(T__44);
				setState(284);
				match(T__2);
				setState(285);
				match(ID);
				setState(286);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(INTEGER);
				}
				break;
			case 9:
				{
				_localctx = new ExprRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(REAL);
				}
				break;
			case 10:
				{
				_localctx = new ExprTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(TEXT);
				}
				break;
			case 11:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(BOOLEAN);
				}
				break;
			case 12:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new ExprTablecolumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				tableColum();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						((ExprMulDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(296);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						((ExprMulDivContext)_localctx).e2 = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(299);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						((ExprAddSubContext)_localctx).e2 = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompareContext(new ExprContext(_parentctx, _parentState));
						((ExprCompareContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(302);
						((ExprCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042430230528L) != 0)) ) {
							((ExprCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(303);
						((ExprCompareContext)_localctx).e2 = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprInLineIFContext(new ExprContext(_parentctx, _parentState));
						((ExprInLineIFContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(305);
						match(T__45);
						setState(306);
						((ExprInLineIFContext)_localctx).e2 = expr(0);
						setState(307);
						match(T__7);
						setState(308);
						((ExprInLineIFContext)_localctx).e3 = expr(8);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class TableColumContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(TabLanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabLanParser.ID, i);
		}
		public TableColumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterTableColum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitTableColum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitTableColum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumContext tableColum() throws RecognitionException {
		TableColumContext _localctx = new TableColumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableColum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((TableColumContext)_localctx).id1 = match(ID);
			setState(316);
			match(T__46);
			setState(317);
			((TableColumContext)_localctx).id2 = match(ID);
			}
		}
		catch (RecognitionException re) {
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
	public static class ReadContext extends ParserRuleContext {
		public ReadFileContext readFile() {
			return getRuleContext(ReadFileContext.class,0);
		}
		public HowToReadContext howToRead() {
			return getRuleContext(HowToReadContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				readFile();
				}
				break;
			case T__49:
			case T__50:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				howToRead();
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
	public static class ReadFileContext extends ParserRuleContext {
		public String varName;
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public HowToReadContext howToRead() {
			return getRuleContext(HowToReadContext.class,0);
		}
		public ReadFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterReadFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitReadFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitReadFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFileContext readFile() throws RecognitionException {
		ReadFileContext _localctx = new ReadFileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__43);
			setState(324);
			match(TEXT);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(325);
				match(T__47);
				setState(326);
				howToRead();
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
	public static class HowToReadContext extends ParserRuleContext {
		public HowToReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_howToRead; }
	 
		public HowToReadContext() { }
		public void copyFrom(HowToReadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadColumnContext extends HowToReadContext {
		public TerminalNode INTEGER() { return getToken(TabLanParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public List<HowToReadContext> howToRead() {
			return getRuleContexts(HowToReadContext.class);
		}
		public HowToReadContext howToRead(int i) {
			return getRuleContext(HowToReadContext.class,i);
		}
		public ReadColumnContext(HowToReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterReadColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitReadColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitReadColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadAsAppendContext extends HowToReadContext {
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public List<TerminalNode> ID() { return getTokens(TabLanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TabLanParser.ID, i);
		}
		public List<HowToReadContext> howToRead() {
			return getRuleContexts(HowToReadContext.class);
		}
		public HowToReadContext howToRead(int i) {
			return getRuleContext(HowToReadContext.class,i);
		}
		public ReadAsAppendContext(HowToReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterReadAsAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitReadAsAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitReadAsAppend(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadAsContext extends HowToReadContext {
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(TabLanParser.ID, 0); }
		public List<HowToReadContext> howToRead() {
			return getRuleContexts(HowToReadContext.class);
		}
		public HowToReadContext howToRead(int i) {
			return getRuleContext(HowToReadContext.class,i);
		}
		public ReadAsContext(HowToReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterReadAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitReadAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitReadAs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadSeparatorContext extends HowToReadContext {
		public TerminalNode TEXT() { return getToken(TabLanParser.TEXT, 0); }
		public List<HowToReadContext> howToRead() {
			return getRuleContexts(HowToReadContext.class);
		}
		public HowToReadContext howToRead(int i) {
			return getRuleContext(HowToReadContext.class,i);
		}
		public ReadSeparatorContext(HowToReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).enterReadSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabLanListener ) ((TabLanListener)listener).exitReadSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabLanVisitor ) return ((TabLanVisitor<? extends T>)visitor).visitReadSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HowToReadContext howToRead() throws RecognitionException {
		HowToReadContext _localctx = new HowToReadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_howToRead);
		try {
			int _alt;
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new ReadAsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(TEXT);
				setState(330);
				match(T__48);
				setState(331);
				match(ID);
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(T__15);
						setState(333);
						howToRead();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new ReadAsAppendContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(TEXT);
				setState(340);
				match(T__48);
				setState(341);
				match(ID);
				setState(342);
				match(T__17);
				setState(343);
				match(ID);
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(344);
						match(T__15);
						setState(345);
						howToRead();
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ReadColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(T__49);
				setState(352);
				match(INTEGER);
				setState(353);
				match(T__48);
				setState(354);
				match(ID);
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						match(T__15);
						setState(356);
						howToRead();
						}
						} 
					}
					setState(361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new ReadSeparatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(T__50);
				setState(363);
				match(TEXT);
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						match(T__15);
						setState(365);
						howToRead();
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0176\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000"+
		"\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002\f\u0002F\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002Y\b\u0002\u0001\u0003\u0003\u0003\\\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u008a\b\u0007\n\u0007\f\u0007\u008d\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0096\b\u0007\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ae\b\t\n"+
		"\t\f\t\u00b1\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bf\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00c4\b\t\n\t\f\t\u00c7\t\t\u0001\t\u0003\t\u00ca\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d1\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00d6\b\n\n\n\f\n\u00d9\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e8\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ee\b\f\n\f\f\f\u00f1\t\f\u0001\f"+
		"\u0001\f\u0003\f\u00f5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00ff\b\r\u000b\r\f\r\u0100\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0116\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0126\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0137\b\u000e\n\u000e\f\u000e\u013a"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0142\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0148\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u014f\b\u0012\n\u0012\f\u0012\u0152\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u015b\b\u0012\n\u0012\f\u0012\u015e\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0166\b\u0012\n\u0012\f\u0012\u0169\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u016f\b\u0012\n\u0012\f\u0012\u0172"+
		"\t\u0012\u0003\u0012\u0174\b\u0012\u0001\u0012\u0000\u0001\u001c\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0004\u0001\u0000\u001a\u001b\u0001\u0000!\"\u0001"+
		"\u0000$&\u0001\u0000\'+\u01a4\u0000,\u0001\u0000\u0000\u0000\u0002:\u0001"+
		"\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000"+
		"\u0000\bt\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\f\u0083\u0001"+
		"\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u0099\u0001"+
		"\u0000\u0000\u0000\u0012\u00c9\u0001\u0000\u0000\u0000\u0014\u00cb\u0001"+
		"\u0000\u0000\u0000\u0016\u00e7\u0001\u0000\u0000\u0000\u0018\u00e9\u0001"+
		"\u0000\u0000\u0000\u001a\u00f6\u0001\u0000\u0000\u0000\u001c\u0125\u0001"+
		"\u0000\u0000\u0000\u001e\u013b\u0001\u0000\u0000\u0000 \u0141\u0001\u0000"+
		"\u0000\u0000\"\u0143\u0001\u0000\u0000\u0000$\u0173\u0001\u0000\u0000"+
		"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0005\u0001\u0000\u0000*\'\u0001"+
		"\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u00001;\u0003"+
		"\u0004\u0002\u00002;\u0003\u001a\r\u00003;\u0003\u0006\u0003\u00004;\u0003"+
		"\u0010\b\u00005;\u0003\f\u0006\u00006;\u0003\u000e\u0007\u00007;\u0003"+
		"\u0018\f\u00008;\u0003\n\u0005\u00009;\u0003\u001c\u000e\u0000:1\u0001"+
		"\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000"+
		":4\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u00057\u0000\u0000=D\u0005"+
		"\u0002\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0003\u001e\u000f\u0000"+
		"@A\u0005\u0004\u0000\u0000AC\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EY\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005"+
		"7\u0000\u0000HI\u0005\u0005\u0000\u0000IY\u0003\u001e\u000f\u0000JK\u0005"+
		"7\u0000\u0000KL\u0005\u0005\u0000\u0000LO\u0003\u001c\u000e\u0000MN\u0005"+
		"\u0006\u0000\u0000NP\u0003\u001c\u000e\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000QR\u0003\u001e\u000f"+
		"\u0000RS\u0005\u0005\u0000\u0000ST\u0003\u001c\u000e\u0000TY\u0001\u0000"+
		"\u0000\u0000UV\u00057\u0000\u0000VW\u0005\u0005\u0000\u0000WY\u0003\""+
		"\u0011\u0000X<\u0001\u0000\u0000\u0000XG\u0001\u0000\u0000\u0000XJ\u0001"+
		"\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000"+
		"Y\u0005\u0001\u0000\u0000\u0000Z\\\u0005\u0007\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005"+
		"7\u0000\u0000^_\u0005\b\u0000\u0000_j\u0003\b\u0004\u0000`b\u0005\u0007"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u00057\u0000\u0000de\u0005\b\u0000\u0000ef\u0003"+
		"\b\u0004\u0000fg\u0005\u0005\u0000\u0000gh\u0003\u001c\u000e\u0000hj\u0001"+
		"\u0000\u0000\u0000i[\u0001\u0000\u0000\u0000ia\u0001\u0000\u0000\u0000"+
		"j\u0007\u0001\u0000\u0000\u0000kl\u0005\t\u0000\u0000lu\u0006\u0004\uffff"+
		"\uffff\u0000mn\u0005\n\u0000\u0000nu\u0006\u0004\uffff\uffff\u0000op\u0005"+
		"\u000b\u0000\u0000pu\u0006\u0004\uffff\uffff\u0000qr\u0005\f\u0000\u0000"+
		"ru\u0006\u0004\uffff\uffff\u0000su\u00057\u0000\u0000tk\u0001\u0000\u0000"+
		"\u0000tm\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000tq\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\t\u0001\u0000\u0000\u0000vw\u0005"+
		"\r\u0000\u0000wz\u0003\u001c\u000e\u0000xy\u0005\u0006\u0000\u0000y{\u0003"+
		"\u001c\u000e\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u000b\u0001\u0000\u0000\u0000|}\u0003\u001e\u000f\u0000}~\u0005\u000e"+
		"\u0000\u0000~\u007f\u00054\u0000\u0000\u007f\u0084\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u00057\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082"+
		"\u0084\u00054\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000f"+
		"\u0000\u0000\u0086\u008b\u0003\u001c\u000e\u0000\u0087\u0088\u0005\u0010"+
		"\u0000\u0000\u0088\u008a\u0003\u001c\u000e\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0011"+
		"\u0000\u0000\u008f\u0090\u0005\u0012\u0000\u0000\u0090\u0091\u00057\u0000"+
		"\u0000\u0091\u0096\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0013\u0000"+
		"\u0000\u0093\u0094\u0005\u0012\u0000\u0000\u0094\u0096\u00057\u0000\u0000"+
		"\u0095\u0085\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000"+
		"\u0096\u000f\u0001\u0000\u0000\u0000\u0097\u009a\u0003\u0012\t\u0000\u0098"+
		"\u009a\u0003\u0014\n\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\u0014\u0000\u0000\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e"+
		"\u00057\u0000\u0000\u009e\u00a2\u0005\u0016\u0000\u0000\u009f\u00a1\u0003"+
		"\u0016\u000b\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00ca\u0005\u0017\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0014\u0000\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00a9\u0005"+
		"7\u0000\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ab\u00054\u0000"+
		"\u0000\u00ab\u00af\u0005\u0016\u0000\u0000\u00ac\u00ae\u0003\u0016\u000b"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ca\u0005\u0017\u0000\u0000\u00b3\u00b4\u0005\u0014\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0015\u0000\u0000\u00b5\u00b6\u00057\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00b8\u00057\u0000\u0000\u00b8"+
		"\u00b9\u0005\b\u0000\u0000\u00b9\u00be\u00057\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0010\u0000\u0000\u00bb\u00bc\u00057\u0000\u0000\u00bc\u00bd\u0005"+
		"\b\u0000\u0000\u00bd\u00bf\u00057\u0000\u0000\u00be\u00ba\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c5\u0005\u0016"+
		"\u0000\u0000\u00c2\u00c4\u0003\u0016\u000b\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u0017"+
		"\u0000\u0000\u00c9\u009b\u0001\u0000\u0000\u0000\u00c9\u00a6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00b3\u0001\u0000\u0000\u0000\u00ca\u0013\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc\u00cd\u00057\u0000"+
		"\u0000\u00cd\u00ce\u00057\u0000\u0000\u00ce\u00d0\u0005\u0016\u0000\u0000"+
		"\u00cf\u00d1\u0005\u0018\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d7\u0003\u001c\u000e\u0000\u00d3\u00d4\u0005\u0019\u0000\u0000"+
		"\u00d4\u00d6\u0003\u001c\u000e\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0010\u0000\u0000"+
		"\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd\u0005\u0001\u0000\u0000"+
		"\u00dd\u00de\u0005\u0017\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0003\u0006\u0003\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000"+
		"\u00e1\u00e8\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0006\u0003\u0000"+
		"\u00e3\u00e4\u0005\u000e\u0000\u0000\u00e4\u00e5\u00054\u0000\u0000\u00e5"+
		"\u00e6\u0005\u0001\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00df\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e8"+
		"\u0017\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0000\u0000\u0000\u00ea"+
		"\u00ef\u0003\u001c\u000e\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec"+
		"\u00ee\u0003\u001c\u000e\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f4\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u001c\u0000\u0000\u00f3"+
		"\u00f5\u0003\u001c\u000e\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u001d\u0000\u0000\u00f7\u00f8\u00057\u0000\u0000\u00f8\u00f9"+
		"\u0005\u001e\u0000\u0000\u00f9\u00fa\u00057\u0000\u0000\u00fa\u00fe\u0005"+
		"\u001f\u0000\u0000\u00fb\u00fc\u0003\u0002\u0001\u0000\u00fc\u00fd\u0005"+
		"\u0001\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005 \u0000\u0000\u0103\u001b\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0006\u000e\uffff\uffff\u0000\u0105\u0106\u0007"+
		"\u0001\u0000\u0000\u0106\u0126\u0003\u001c\u000e\u0011\u0107\u0108\u0005"+
		"#\u0000\u0000\u0108\u0126\u0003\u001c\u000e\u0010\u0109\u010a\u0003\u001e"+
		"\u000f\u0000\u010a\u010b\u0007\u0001\u0000\u0000\u010b\u010c\u0003\u001c"+
		"\u000e\u000f\u010c\u0126\u0001\u0000\u0000\u0000\u010d\u010e\u0003\b\u0004"+
		"\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u0110\u0003\u001c\u000e"+
		"\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0126\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005,\u0000\u0000\u0113\u0115\u0005\u001e\u0000\u0000"+
		"\u0114\u0116\u00054\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0126\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0003\u001c\u000e\u0000\u0119"+
		"\u011a\u0005\u0004\u0000\u0000\u011a\u0126\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005-\u0000\u0000\u011c\u011d\u0005\u0003\u0000\u0000\u011d\u011e"+
		"\u00057\u0000\u0000\u011e\u0126\u0005\u0004\u0000\u0000\u011f\u0126\u0005"+
		"8\u0000\u0000\u0120\u0126\u00059\u0000\u0000\u0121\u0126\u00054\u0000"+
		"\u0000\u0122\u0126\u00056\u0000\u0000\u0123\u0126\u00057\u0000\u0000\u0124"+
		"\u0126\u0003\u001e\u000f\u0000\u0125\u0104\u0001\u0000\u0000\u0000\u0125"+
		"\u0107\u0001\u0000\u0000\u0000\u0125\u0109\u0001\u0000\u0000\u0000\u0125"+
		"\u010d\u0001\u0000\u0000\u0000\u0125\u0112\u0001\u0000\u0000\u0000\u0125"+
		"\u0117\u0001\u0000\u0000\u0000\u0125\u011b\u0001\u0000\u0000\u0000\u0125"+
		"\u011f\u0001\u0000\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125"+
		"\u0121\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0138\u0001\u0000\u0000\u0000\u0127\u0128\n\u000e\u0000\u0000\u0128\u0129"+
		"\u0007\u0002\u0000\u0000\u0129\u0137\u0003\u001c\u000e\u000f\u012a\u012b"+
		"\n\r\u0000\u0000\u012b\u012c\u0007\u0001\u0000\u0000\u012c\u0137\u0003"+
		"\u001c\u000e\u000e\u012d\u012e\n\f\u0000\u0000\u012e\u012f\u0007\u0003"+
		"\u0000\u0000\u012f\u0137\u0003\u001c\u000e\r\u0130\u0131\n\u0007\u0000"+
		"\u0000\u0131\u0132\u0005.\u0000\u0000\u0132\u0133\u0003\u001c\u000e\u0000"+
		"\u0133\u0134\u0005\b\u0000\u0000\u0134\u0135\u0003\u001c\u000e\b\u0135"+
		"\u0137\u0001\u0000\u0000\u0000\u0136\u0127\u0001\u0000\u0000\u0000\u0136"+
		"\u012a\u0001\u0000\u0000\u0000\u0136\u012d\u0001\u0000\u0000\u0000\u0136"+
		"\u0130\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u001d\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u00057\u0000\u0000\u013c\u013d\u0005/\u0000\u0000\u013d\u013e\u0005"+
		"7\u0000\u0000\u013e\u001f\u0001\u0000\u0000\u0000\u013f\u0142\u0003\""+
		"\u0011\u0000\u0140\u0142\u0003$\u0012\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142!\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005,\u0000\u0000\u0144\u0147\u00054\u0000\u0000\u0145\u0146"+
		"\u00050\u0000\u0000\u0146\u0148\u0003$\u0012\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148#\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u00054\u0000\u0000\u014a\u014b\u00051\u0000\u0000\u014b"+
		"\u0150\u00057\u0000\u0000\u014c\u014d\u0005\u0010\u0000\u0000\u014d\u014f"+
		"\u0003$\u0012\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0152\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0174\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u00054\u0000\u0000\u0154\u0155\u00051\u0000"+
		"\u0000\u0155\u0156\u00057\u0000\u0000\u0156\u0157\u0005\u0012\u0000\u0000"+
		"\u0157\u015c\u00057\u0000\u0000\u0158\u0159\u0005\u0010\u0000\u0000\u0159"+
		"\u015b\u0003$\u0012\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u0174\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u00052\u0000\u0000\u0160\u0161\u0005"+
		"8\u0000\u0000\u0161\u0162\u00051\u0000\u0000\u0162\u0167\u00057\u0000"+
		"\u0000\u0163\u0164\u0005\u0010\u0000\u0000\u0164\u0166\u0003$\u0012\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u0174\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u00053\u0000\u0000\u016b\u0170\u00054\u0000\u0000\u016c\u016d"+
		"\u0005\u0010\u0000\u0000\u016d\u016f\u0003$\u0012\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001"+
		"\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0149\u0001"+
		"\u0000\u0000\u0000\u0173\u0153\u0001\u0000\u0000\u0000\u0173\u015f\u0001"+
		"\u0000\u0000\u0000\u0173\u016a\u0001\u0000\u0000\u0000\u0174%\u0001\u0000"+
		"\u0000\u0000%\',:DOX[aitz\u0083\u008b\u0095\u0099\u00a2\u00af\u00be\u00c5"+
		"\u00c9\u00d0\u00d7\u00e7\u00ef\u00f4\u0100\u0115\u0125\u0136\u0138\u0141"+
		"\u0147\u0150\u015c\u0167\u0170\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}