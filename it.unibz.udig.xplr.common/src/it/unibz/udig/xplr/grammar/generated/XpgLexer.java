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
		LAYERS=1, DELTA=2, GAMMA=3, SEMANTICRULE=4, TRUE=5, FALSE=6, ARROW=7, 
		LT=8, GT=9, LPAREN=10, RPAREN=11, LGPAREN=12, RGPAREN=13, SEMICOLON=14, 
		COMMA=15, COLON=16, APICE=17, UNDERSCORE=18, EQUALS=19, UPPER=20, LOWER=21, 
		DIGITS=22, ENDOFLINE=23, STRING=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'LAYERS'", "DELTA", "GAMMA", "SEMANTICRULE", "'true'", "'false'", "'->'", 
		"'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'''", 
		"'_'", "'='", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"LAYERS", "DELTA", "GAMMA", "SEMANTICRULE", "TRUE", "FALSE", "ARROW", 
		"LT", "GT", "LPAREN", "RPAREN", "LGPAREN", "RGPAREN", "SEMICOLON", "COMMA", 
		"COLON", "APICE", "UNDERSCORE", "EQUALS", "UPPER", "LOWER", "DIGITS", 
		"ENDOFLINE", "STRING", "WS"
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
		case 24: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\6\27\u0087\n\27\r\27\16\27\u0088\3\30\3\30\3\30\3\31\3\31\7"+
		"\31\u0090\n\31\f\31\16\31\u0093\13\31\3\31\3\31\3\32\6\32\u0098\n\32\r"+
		"\32\16\32\u0099\3\32\3\32\3\u0091\33\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\2\3"+
		"\2\6\3\2C\\\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u009f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\5<\3\2\2\2\7D\3\2\2\2\tL\3\2\2\2\13[\3\2\2\2\r`\3"+
		"\2\2\2\17f\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31"+
		"q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3"+
		"\2\2\2\'\177\3\2\2\2)\u0081\3\2\2\2+\u0083\3\2\2\2-\u0086\3\2\2\2/\u008a"+
		"\3\2\2\2\61\u008d\3\2\2\2\63\u0097\3\2\2\2\65\66\7N\2\2\66\67\7C\2\2\67"+
		"8\7[\2\289\7G\2\29:\7T\2\2:;\7U\2\2;\4\3\2\2\2<=\7F\2\2=>\7G\2\2>?\7N"+
		"\2\2?@\7V\2\2@A\7C\2\2AB\3\2\2\2BC\5!\21\2C\6\3\2\2\2DE\7I\2\2EF\7C\2"+
		"\2FG\7O\2\2GH\7O\2\2HI\7C\2\2IJ\3\2\2\2JK\5!\21\2K\b\3\2\2\2LM\7U\2\2"+
		"MN\7G\2\2NO\7O\2\2OP\7C\2\2PQ\7P\2\2QR\7V\2\2RS\7K\2\2ST\7E\2\2TU\7T\2"+
		"\2UV\7W\2\2VW\7N\2\2WX\7G\2\2XY\3\2\2\2YZ\5!\21\2Z\n\3\2\2\2[\\\7v\2\2"+
		"\\]\7t\2\2]^\7w\2\2^_\7g\2\2_\f\3\2\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7"+
		"u\2\2de\7g\2\2e\16\3\2\2\2fg\7/\2\2gh\7@\2\2h\20\3\2\2\2ij\7>\2\2j\22"+
		"\3\2\2\2kl\7@\2\2l\24\3\2\2\2mn\7*\2\2n\26\3\2\2\2op\7+\2\2p\30\3\2\2"+
		"\2qr\7}\2\2r\32\3\2\2\2st\7\177\2\2t\34\3\2\2\2uv\7=\2\2v\36\3\2\2\2w"+
		"x\7.\2\2x \3\2\2\2yz\7<\2\2z\"\3\2\2\2{|\7)\2\2|$\3\2\2\2}~\7a\2\2~&\3"+
		"\2\2\2\177\u0080\7?\2\2\u0080(\3\2\2\2\u0081\u0082\t\2\2\2\u0082*\3\2"+
		"\2\2\u0083\u0084\t\3\2\2\u0084,\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		".\3\2\2\2\u008a\u008b\7=\2\2\u008b\u008c\7\f\2\2\u008c\60\3\2\2\2\u008d"+
		"\u0091\7$\2\2\u008e\u0090\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7$\2\2\u0095\62\3\2\2\2\u0096\u0098\t\5\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\32\2\2\u009c\64\3\2\2\2\6\2"+
		"\u0088\u0091\u0099";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}