// Generated from /Users/tony/antlrtestings/ulNoActions.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ulNoActionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IF=9, 
		ELSE=10, WHILE=11, OP=12, INTEGERCONSTANT=13, FLOATCONSTANT=14, STRINGCONSTANT=15, 
		CHARCONSTANT=16, TYPE=17, ID=18, WS=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "IF", 
		"ELSE", "WHILE", "OP", "INTEGERCONSTANT", "FLOATCONSTANT", "STRINGCONSTANT", 
		"CHARCONSTANT", "TYPE", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "'-'", "'*'", "'/'", "'if'", 
		"'else'", "'while'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "IF", "ELSE", "WHILE", 
		"OP", "INTEGERCONSTANT", "FLOATCONSTANT", "STRINGCONSTANT", "CHARCONSTANT", 
		"TYPE", "ID", "WS", "COMMENT"
	};
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


	protected void mismatch (IntStream input, int ttype, BitSet follow)
	        throws RecognitionException
	{
	        throw new MismatchedTokenException(ttype, input);
	}
	public Object recoverFromMismatchedSet (IntStream input,
	                                      RecognitionException e,
	                                      BitSet follow)
	        throws RecognitionException
	{
	        reportError(e);
	        throw e;
	}


	public ulNoActionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ulNoActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\6\16M\n\16\r\16\16\16N\3\17\7\17R"+
		"\n\17\f\17\16\17U\13\17\3\17\3\17\6\17Y\n\17\r\17\16\17Z\3\20\3\20\7\20"+
		"_\n\20\f\20\16\20b\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0087"+
		"\n\22\3\23\6\23\u008a\n\23\r\23\16\23\u008b\3\24\6\24\u008f\n\24\r\24"+
		"\16\24\u0090\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0099\n\25\f\25\16\25"+
		"\u009c\13\25\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2"+
		"\5\3\2\f\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ac\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63"+
		"\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25>\3\2\2"+
		"\2\27C\3\2\2\2\31I\3\2\2\2\33L\3\2\2\2\35S\3\2\2\2\37\\\3\2\2\2!e\3\2"+
		"\2\2#\u0086\3\2\2\2%\u0089\3\2\2\2\'\u008e\3\2\2\2)\u0094\3\2\2\2+,\7"+
		"*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7}\2\2\60\b\3\2\2\2\61\62\7\177"+
		"\2\2\62\n\3\2\2\2\63\64\7=\2\2\64\f\3\2\2\2\65\66\7/\2\2\66\16\3\2\2\2"+
		"\678\7,\2\28\20\3\2\2\29:\7\61\2\2:\22\3\2\2\2;<\7k\2\2<=\7h\2\2=\24\3"+
		"\2\2\2>?\7g\2\2?@\7n\2\2@A\7u\2\2AB\7g\2\2B\26\3\2\2\2CD\7y\2\2DE\7j\2"+
		"\2EF\7k\2\2FG\7n\2\2GH\7g\2\2H\30\3\2\2\2IJ\7-\2\2J\32\3\2\2\2KM\4\62"+
		";\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\34\3\2\2\2PR\4\62;\2QP\3"+
		"\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VX\7\60\2\2WY"+
		"\4\62;\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\36\3\2\2\2\\`\7$\2\2"+
		"]_\n\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\7$\2\2d \3\2\2\2ef\7)\2\2fg\13\2\2\2gh\7)\2\2h\"\3\2\2\2ij\7k\2\2j"+
		"k\7p\2\2k\u0087\7v\2\2lm\7h\2\2mn\7n\2\2no\7q\2\2op\7c\2\2p\u0087\7v\2"+
		"\2qr\7e\2\2rs\7j\2\2st\7c\2\2t\u0087\7t\2\2uv\7u\2\2vw\7v\2\2wx\7t\2\2"+
		"xy\7k\2\2yz\7p\2\2z\u0087\7i\2\2{|\7d\2\2|}\7q\2\2}~\7q\2\2~\177\7n\2"+
		"\2\177\u0080\7g\2\2\u0080\u0081\7c\2\2\u0081\u0087\7p\2\2\u0082\u0083"+
		"\7x\2\2\u0083\u0084\7q\2\2\u0084\u0085\7k\2\2\u0085\u0087\7f\2\2\u0086"+
		"i\3\2\2\2\u0086l\3\2\2\2\u0086q\3\2\2\2\u0086u\3\2\2\2\u0086{\3\2\2\2"+
		"\u0086\u0082\3\2\2\2\u0087$\3\2\2\2\u0088\u008a\4c|\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"&\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\b\24\2\2\u0093(\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7\61\2\2\u0096"+
		"\u009a\3\2\2\2\u0097\u0099\n\4\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\t\4\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\25"+
		"\2\2\u00a0*\3\2\2\2\f\2NSZ`\u0086\u008b\u008e\u0090\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}