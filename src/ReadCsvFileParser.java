// Generated from ReadCsvFile.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReadCsvFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, ID=2, SEPARATOR=3, NewLine=4, WS=5, ERROR=6;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_line = 2, RULE_field = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "line", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "ID", "SEPARATOR", "NewLine", "WS", "ERROR"
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
	public String getGrammarFileName() { return "ReadCsvFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReadCsvFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReadCsvFileParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadCsvFileVisitor ) return ((ReadCsvFileVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(8);
				header();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT || _la==ID) {
					{
					{
					setState(9);
					line();
					}
					}
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(15);
					line();
					}
					}
					setState(18); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT || _la==ID );
				}
				break;
			}
			setState(22);
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
	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(ReadCsvFileParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ReadCsvFileParser.TEXT, i);
		}
		public TerminalNode NewLine() { return getToken(ReadCsvFileParser.NewLine, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(ReadCsvFileParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(ReadCsvFileParser.SEPARATOR, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadCsvFileVisitor ) return ((ReadCsvFileVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					match(TEXT);
					setState(26); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(25);
						match(SEPARATOR);
						}
						}
						setState(28); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEPARATOR );
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(35);
			match(TEXT);
			setState(36);
			match(NewLine);
			}
		}
		catch (RecognitionException re) {
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
	public static class LineContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode NewLine() { return getToken(ReadCsvFileParser.NewLine, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(ReadCsvFileParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(ReadCsvFileParser.SEPARATOR, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadCsvFileVisitor ) return ((ReadCsvFileVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					field();
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(39);
						match(SEPARATOR);
						}
						}
						setState(42); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEPARATOR );
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(49);
			field();
			setState(50);
			match(NewLine);
			}
		}
		catch (RecognitionException re) {
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ReadCsvFileParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(ReadCsvFileParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReadCsvFileListener ) ((ReadCsvFileListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReadCsvFileVisitor ) return ((ReadCsvFileVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==ID) ) {
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
		"\u0004\u0001\u00067\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0001\u0000\u0004\u0000"+
		"\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b"+
		"\u0001\f\u0001\u001c\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		")\b\u0002\u000b\u0002\f\u0002*\u0005\u0002-\b\u0002\n\u0002\f\u00020\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000"+
		"\u0001\u00029\u0000\u0014\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000"+
		"\u0000\u0004.\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b"+
		"\f\u0003\u0002\u0001\u0000\t\u000b\u0003\u0004\u0002\u0000\n\t\u0001\u0000"+
		"\u0000\u0000\u000b\u000e\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u0015\u0001\u0000\u0000\u0000\u000e"+
		"\f\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000\u0010\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0015"+
		"\u0001\u0000\u0000\u0000\u0014\b\u0001\u0000\u0000\u0000\u0014\u0010\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0005"+
		"\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u001a\u0005"+
		"\u0001\u0000\u0000\u0019\u001b\u0005\u0003\u0000\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001"+
		"\u0000\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0001\u0000"+
		"\u0000$%\u0005\u0004\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0006\u0003\u0000\')\u0005\u0003\u0000\u0000(\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0003\u0006\u0003\u0000"+
		"23\u0005\u0004\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0007\u0000"+
		"\u0000\u00005\u0007\u0001\u0000\u0000\u0000\u0007\f\u0012\u0014\u001c"+
		" *.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}