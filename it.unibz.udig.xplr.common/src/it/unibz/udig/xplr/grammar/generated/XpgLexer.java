// Generated from /Users/sara/Dropbox/tesi/tex/08-codice/Xpg.g4 by ANTLR 4.1
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
		DELTA=1, GAMMA=2, SEMANTICRULE=3, TRUE=4, FALSE=5, ARROW=6, LT=7, GT=8, 
		LPAREN=9, RPAREN=10, LGPAREN=11, RGPAREN=12, SEMICOLON=13, COMMA=14, COLON=15, 
		APICE=16, UNDERSCORE=17, EQUALS=18, UPPER=19, LOWER=20, DIGITS=21, ENDOFLINE=22, 
		STRING=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DELTA", "GAMMA", "SEMANTICRULE", "'true'", "'false'", "'->'", "'<'", 
		"'>'", "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'''", "'_'", 
		"'='", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"DELTA", "GAMMA", "SEMANTICRULE", "TRUE", "FALSE", "ARROW", "LT", "GT", 
		"LPAREN", "RPAREN", "LGPAREN", "RGPAREN", "SEMICOLON", "COMMA", "COLON", 
		"APICE", "UNDERSCORE", "EQUALS", "UPPER", "LOWER", "DIGITS", "ENDOFLINE", 
		"STRING", "WS"
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
		case 23: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26~\n\26\r\26\16\26\177\3\27"+
		"\3\27\3\27\3\30\3\30\7\30\u0087\n\30\f\30\16\30\u008a\13\30\3\30\3\30"+
		"\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\31\3\31\3\u0088\32\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\2\3\2\6\3\2C\\\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u0096\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\3\63\3\2\2\2\5;\3\2\2\2\7C\3\2\2\2\tR\3\2\2\2\13W\3\2\2\2"+
		"\r]\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2"+
		"\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2"+
		"%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\u0081\3\2\2\2/\u0084\3\2\2"+
		"\2\61\u008e\3\2\2\2\63\64\7F\2\2\64\65\7G\2\2\65\66\7N\2\2\66\67\7V\2"+
		"\2\678\7C\2\289\3\2\2\29:\5\37\20\2:\4\3\2\2\2;<\7I\2\2<=\7C\2\2=>\7O"+
		"\2\2>?\7O\2\2?@\7C\2\2@A\3\2\2\2AB\5\37\20\2B\6\3\2\2\2CD\7U\2\2DE\7G"+
		"\2\2EF\7O\2\2FG\7C\2\2GH\7P\2\2HI\7V\2\2IJ\7K\2\2JK\7E\2\2KL\7T\2\2LM"+
		"\7W\2\2MN\7N\2\2NO\7G\2\2OP\3\2\2\2PQ\5\37\20\2Q\b\3\2\2\2RS\7v\2\2ST"+
		"\7t\2\2TU\7w\2\2UV\7g\2\2V\n\3\2\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2Z[\7u\2"+
		"\2[\\\7g\2\2\\\f\3\2\2\2]^\7/\2\2^_\7@\2\2_\16\3\2\2\2`a\7>\2\2a\20\3"+
		"\2\2\2bc\7@\2\2c\22\3\2\2\2de\7*\2\2e\24\3\2\2\2fg\7+\2\2g\26\3\2\2\2"+
		"hi\7}\2\2i\30\3\2\2\2jk\7\177\2\2k\32\3\2\2\2lm\7=\2\2m\34\3\2\2\2no\7"+
		".\2\2o\36\3\2\2\2pq\7<\2\2q \3\2\2\2rs\7)\2\2s\"\3\2\2\2tu\7a\2\2u$\3"+
		"\2\2\2vw\7?\2\2w&\3\2\2\2xy\t\2\2\2y(\3\2\2\2z{\t\3\2\2{*\3\2\2\2|~\t"+
		"\4\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080,\3"+
		"\2\2\2\u0081\u0082\7=\2\2\u0082\u0083\7\f\2\2\u0083.\3\2\2\2\u0084\u0088"+
		"\7$\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7$\2\2\u008c\60\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\b\31\2\2\u0093\62\3\2\2\2\6\2\177\u0088\u0090";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}