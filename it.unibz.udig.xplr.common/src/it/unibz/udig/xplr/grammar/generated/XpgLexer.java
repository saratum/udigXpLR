// Generated from /Users/sara/git/udigXpLR/regole/Xpg.g4 by ANTLR 4.1
package it.unibz.udig.xplr.grammar.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpgLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DB=1, DR=2, LAYERS=3, DELTA=4, GAMMA=5, SEMANTICRULE=6, TRUE=7, FALSE=8, 
		ARROW=9, LT=10, GT=11, LPAREN=12, RPAREN=13, LGPAREN=14, RGPAREN=15, SEMICOLON=16, 
		COMMA=17, COLON=18, APICE=19, UNDERSCORE=20, EQUALS=21, UPPER=22, LOWER=23, 
		DIGITS=24, PLUS=25, MINUS=26, ENDOFLINE=27, STRING=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'DB'", "'DR'", "'LAYERS'", "DELTA", "GAMMA", "SEMANTICRULE", "'true'", 
		"'false'", "'->'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'", "','", 
		"':'", "'''", "'_'", "'='", "UPPER", "LOWER", "DIGITS", "'+'", "'-'", 
		"';\n'", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"DB", "DR", "LAYERS", "DELTA", "GAMMA", "SEMANTICRULE", "TRUE", "FALSE", 
		"ARROW", "LT", "GT", "LPAREN", "RPAREN", "LGPAREN", "RGPAREN", "SEMICOLON", 
		"COMMA", "COLON", "APICE", "UNDERSCORE", "EQUALS", "UPPER", "LOWER", "DIGITS", 
		"PLUS", "MINUS", "ENDOFLINE", "STRING", "WS"
	};


	public XpgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xpg.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\6\31\u0095\n\31\r\31\16\31\u0096\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\7\35\u00a2\n\35\f\35\16\35\u00a5\13\35\3\35\3\35\3"+
		"\36\6\36\u00aa\n\36\r\36\16\36\u00ab\3\36\3\36\3\u00a3\37\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\2\3\2\6\3\2C\\\3\2c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7C\3\2\2\2\t"+
		"J\3\2\2\2\13R\3\2\2\2\rZ\3\2\2\2\17i\3\2\2\2\21n\3\2\2\2\23t\3\2\2\2\25"+
		"w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081"+
		"\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2"+
		")\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0094"+
		"\3\2\2\2\63\u0098\3\2\2\2\65\u009a\3\2\2\2\67\u009c\3\2\2\29\u009f\3\2"+
		"\2\2;\u00a9\3\2\2\2=>\7F\2\2>?\7D\2\2?\4\3\2\2\2@A\7F\2\2AB\7T\2\2B\6"+
		"\3\2\2\2CD\7N\2\2DE\7C\2\2EF\7[\2\2FG\7G\2\2GH\7T\2\2HI\7U\2\2I\b\3\2"+
		"\2\2JK\7F\2\2KL\7G\2\2LM\7N\2\2MN\7V\2\2NO\7C\2\2OP\3\2\2\2PQ\5%\23\2"+
		"Q\n\3\2\2\2RS\7I\2\2ST\7C\2\2TU\7O\2\2UV\7O\2\2VW\7C\2\2WX\3\2\2\2XY\5"+
		"%\23\2Y\f\3\2\2\2Z[\7U\2\2[\\\7G\2\2\\]\7O\2\2]^\7C\2\2^_\7P\2\2_`\7V"+
		"\2\2`a\7K\2\2ab\7E\2\2bc\7T\2\2cd\7W\2\2de\7N\2\2ef\7G\2\2fg\3\2\2\2g"+
		"h\5%\23\2h\16\3\2\2\2ij\7v\2\2jk\7t\2\2kl\7w\2\2lm\7g\2\2m\20\3\2\2\2"+
		"no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rs\7g\2\2s\22\3\2\2\2tu\7/\2\2uv\7"+
		"@\2\2v\24\3\2\2\2wx\7>\2\2x\26\3\2\2\2yz\7@\2\2z\30\3\2\2\2{|\7*\2\2|"+
		"\32\3\2\2\2}~\7+\2\2~\34\3\2\2\2\177\u0080\7}\2\2\u0080\36\3\2\2\2\u0081"+
		"\u0082\7\177\2\2\u0082 \3\2\2\2\u0083\u0084\7=\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7.\2\2\u0086$\3\2\2\2\u0087\u0088\7<\2\2\u0088&\3\2\2\2\u0089\u008a"+
		"\7)\2\2\u008a(\3\2\2\2\u008b\u008c\7a\2\2\u008c*\3\2\2\2\u008d\u008e\7"+
		"?\2\2\u008e,\3\2\2\2\u008f\u0090\t\2\2\2\u0090.\3\2\2\2\u0091\u0092\t"+
		"\3\2\2\u0092\60\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\62\3\2\2"+
		"\2\u0098\u0099\7-\2\2\u0099\64\3\2\2\2\u009a\u009b\7/\2\2\u009b\66\3\2"+
		"\2\2\u009c\u009d\7=\2\2\u009d\u009e\7\f\2\2\u009e8\3\2\2\2\u009f\u00a3"+
		"\7$\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7$\2\2\u00a7:\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\36\2\2\u00ae<\3\2\2\2\6\2\u0096\u00a3\u00ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}