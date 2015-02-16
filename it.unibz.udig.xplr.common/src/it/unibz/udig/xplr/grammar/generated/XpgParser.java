// Generated from /Users/sara/git/udigXpLR/regole/Xpg.g4 by ANTLR 4.1
package it.unibz.udig.xplr.grammar.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpgParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DB=1, DR=2, LAYERS=3, DELTA=4, GAMMA=5, SEMANTICRULE=6, TRUE=7, FALSE=8, 
		ARROW=9, LT=10, GT=11, LPAREN=12, RPAREN=13, LGPAREN=14, RGPAREN=15, SEMICOLON=16, 
		COMMA=17, COLON=18, APICE=19, UNDERSCORE=20, EQUALS=21, UPPER=22, LOWER=23, 
		DIGITS=24, PLUS=25, MINUS=26, ENDOFLINE=27, STRING=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'DB'", "'DR'", "'LAYERS'", "DELTA", "GAMMA", "SEMANTICRULE", 
		"'true'", "'false'", "'->'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", 
		"';'", "','", "':'", "'''", "'_'", "'='", "UPPER", "LOWER", "DIGITS", 
		"'+'", "'-'", "';\n'", "STRING", "WS"
	};
	public static final int
		RULE_xpgfile = 0, RULE_layers = 1, RULE_layer = 2, RULE_layername = 3, 
		RULE_something = 4, RULE_productions = 5, RULE_production = 6, RULE_linearRepresentation = 7, 
		RULE_relations = 8, RULE_deltarules = 9, RULE_triples = 10, RULE_semanticrules = 11, 
		RULE_relation = 12, RULE_triple = 13, RULE_condition = 14, RULE_driver = 15, 
		RULE_tester = 16, RULE_rules = 17, RULE_dbmapping = 18, RULE_deltarule = 19, 
		RULE_idrel = 20, RULE_semanticrule = 21, RULE_idrelation = 22, RULE_nonterminal = 23, 
		RULE_terminal = 24;
	public static final String[] ruleNames = {
		"xpgfile", "layers", "layer", "layername", "something", "productions", 
		"production", "linearRepresentation", "relations", "deltarules", "triples", 
		"semanticrules", "relation", "triple", "condition", "driver", "tester", 
		"rules", "dbmapping", "deltarule", "idrel", "semanticrule", "idrelation", 
		"nonterminal", "terminal"
	};

	@Override
	public String getGrammarFileName() { return "Xpg.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public XpgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XpgfileContext extends ParserRuleContext {
		public ProductionsContext productions() {
			return getRuleContext(ProductionsContext.class,0);
		}
		public LayersContext layers() {
			return getRuleContext(LayersContext.class,0);
		}
		public XpgfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpgfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterXpgfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitXpgfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitXpgfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XpgfileContext xpgfile() throws RecognitionException {
		XpgfileContext _localctx = new XpgfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xpgfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); layers();
			setState(51); productions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(XpgParser.LPAREN, 0); }
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XpgParser.RPAREN, 0); }
		public TerminalNode LAYERS() { return getToken(XpgParser.LAYERS, 0); }
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterLayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitLayers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitLayers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayersContext layers() throws RecognitionException {
		LayersContext _localctx = new LayersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(LAYERS);
			setState(54); match(LPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(55); layer();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayerContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(XpgParser.EQUALS, 0); }
		public TerminalNode ENDOFLINE() { return getToken(XpgParser.ENDOFLINE, 0); }
		public LayernameContext layername() {
			return getRuleContext(LayernameContext.class,0);
		}
		public SomethingContext something() {
			return getRuleContext(SomethingContext.class,0);
		}
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); layername();
			setState(64); match(EQUALS);
			setState(65); something();
			setState(66); match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayernameContext extends ParserRuleContext {
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
		public LayernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layername; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterLayername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitLayername(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitLayername(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayernameContext layername() throws RecognitionException {
		LayernameContext _localctx = new LayernameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_layername);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(69);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(74);
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

	public static class SomethingContext extends ParserRuleContext {
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public List<TerminalNode> APICE() { return getTokens(XpgParser.APICE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public TerminalNode APICE(int i) {
			return getToken(XpgParser.APICE, i);
		}
		public SomethingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_something; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterSomething(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitSomething(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitSomething(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomethingContext something() throws RecognitionException {
		SomethingContext _localctx = new SomethingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_something);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(UPPER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(76); match(UPPER);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(82); match(APICE);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ProductionsContext extends ParserRuleContext {
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public ProductionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterProductions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitProductions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitProductions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionsContext productions() throws RecognitionException {
		ProductionsContext _localctx = new ProductionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88); production();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionContext extends ParserRuleContext {
		public NonterminalContext nonterminal() {
			return getRuleContext(NonterminalContext.class,0);
		}
		public LinearRepresentationContext linearRepresentation() {
			return getRuleContext(LinearRepresentationContext.class,0);
		}
		public TerminalNode ENDOFLINE() { return getToken(XpgParser.ENDOFLINE, 0); }
		public TerminalNode ARROW() { return getToken(XpgParser.ARROW, 0); }
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_production);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); nonterminal();
			setState(94); match(ARROW);
			setState(95); linearRepresentation();
			setState(96); match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinearRepresentationContext extends ParserRuleContext {
		public NonterminalContext nonterminal() {
			return getRuleContext(NonterminalContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public List<RelationsContext> relations() {
			return getRuleContexts(RelationsContext.class);
		}
		public DeltarulesContext deltarules() {
			return getRuleContext(DeltarulesContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public SemanticrulesContext semanticrules() {
			return getRuleContext(SemanticrulesContext.class,0);
		}
		public RelationsContext relations(int i) {
			return getRuleContext(RelationsContext.class,i);
		}
		public LinearRepresentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearRepresentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterLinearRepresentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitLinearRepresentation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitLinearRepresentation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearRepresentationContext linearRepresentation() throws RecognitionException {
		LinearRepresentationContext _localctx = new LinearRepresentationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linearRepresentation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(98); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(99); terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(102); relations();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(109);
			_la = _input.LA(1);
			if (_la==DELTA) {
				{
				setState(108); deltarules();
				}
			}

			setState(112);
			_la = _input.LA(1);
			if (_la==GAMMA) {
				{
				setState(111); triples();
				}
			}

			setState(115);
			_la = _input.LA(1);
			if (_la==SEMANTICRULE) {
				{
				setState(114); semanticrules();
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

	public static class RelationsContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public NonterminalContext nonterminal() {
			return getRuleContext(NonterminalContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitRelations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitRelations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117); relation();
			setState(120);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(118); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(119); terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeltarulesContext extends ParserRuleContext {
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(XpgParser.LPAREN, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public TerminalNode RPAREN() { return getToken(XpgParser.RPAREN, 0); }
		public TerminalNode DELTA() { return getToken(XpgParser.DELTA, 0); }
		public DeltarulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltarules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterDeltarules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitDeltarules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitDeltarules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeltarulesContext deltarules() throws RecognitionException {
		DeltarulesContext _localctx = new DeltarulesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deltarules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(DELTA);
			setState(123); match(LPAREN);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124); rules();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DB || _la==DR );
			setState(129); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriplesContext extends ParserRuleContext {
		public TerminalNode RGPAREN() { return getToken(XpgParser.RGPAREN, 0); }
		public TripleContext triple(int i) {
			return getRuleContext(TripleContext.class,i);
		}
		public TerminalNode LGPAREN() { return getToken(XpgParser.LGPAREN, 0); }
		public TerminalNode GAMMA() { return getToken(XpgParser.GAMMA, 0); }
		public List<TripleContext> triple() {
			return getRuleContexts(TripleContext.class);
		}
		public TriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_triples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(GAMMA);
			setState(132); match(LGPAREN);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133); triple();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(138); match(RGPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticrulesContext extends ParserRuleContext {
		public TerminalNode RGPAREN() { return getToken(XpgParser.RGPAREN, 0); }
		public TerminalNode LGPAREN() { return getToken(XpgParser.LGPAREN, 0); }
		public SemanticruleContext semanticrule() {
			return getRuleContext(SemanticruleContext.class,0);
		}
		public TerminalNode SEMANTICRULE() { return getToken(XpgParser.SEMANTICRULE, 0); }
		public SemanticrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticrules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterSemanticrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitSemanticrules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitSemanticrules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticrulesContext semanticrules() throws RecognitionException {
		SemanticrulesContext _localctx = new SemanticrulesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_semanticrules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(SEMANTICRULE);
			setState(141); match(LGPAREN);
			setState(142); semanticrule();
			setState(143); match(RGPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(XpgParser.COMMA, 0); }
		public TerminalNode LT() { return getToken(XpgParser.LT, 0); }
		public TesterContext tester() {
			return getRuleContext(TesterContext.class,0);
		}
		public DriverContext driver() {
			return getRuleContext(DriverContext.class,0);
		}
		public TerminalNode GT() { return getToken(XpgParser.GT, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(LT);
			setState(146); driver();
			setState(148);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(147); match(COMMA);
				}
			}

			setState(151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				setState(150); tester();
				}
			}

			setState(153); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripleContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(XpgParser.SEMICOLON); }
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(XpgParser.LPAREN, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(XpgParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(XpgParser.RPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TripleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterTriple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitTriple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitTriple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripleContext triple() throws RecognitionException {
		TripleContext _localctx = new TripleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_triple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(LPAREN);
			setState(156); terminal();
			setState(157); match(SEMICOLON);
			setState(158); condition();
			setState(159); match(SEMICOLON);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160); rules();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DB || _la==DR );
			setState(165); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(XpgParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(XpgParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(XpgParser.STRING, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DriverContext extends ParserRuleContext {
		public IdrelationContext idrelation() {
			return getRuleContext(IdrelationContext.class,0);
		}
		public DriverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_driver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterDriver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitDriver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitDriver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DriverContext driver() throws RecognitionException {
		DriverContext _localctx = new DriverContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_driver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); idrelation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TesterContext extends ParserRuleContext {
		public IdrelationContext idrelation() {
			return getRuleContext(IdrelationContext.class,0);
		}
		public TesterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tester; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterTester(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitTester(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitTester(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TesterContext tester() throws RecognitionException {
		TesterContext _localctx = new TesterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); idrelation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public DbmappingContext dbmapping() {
			return getRuleContext(DbmappingContext.class,0);
		}
		public DeltaruleContext deltarule() {
			return getRuleContext(DeltaruleContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XpgParser.COMMA, 0); }
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case DB:
				{
				setState(173); dbmapping();
				}
				break;
			case DR:
				{
				setState(174); deltarule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(177); match(COMMA);
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

	public static class DbmappingContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(XpgParser.EQUALS, 0); }
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public TerminalNode DB() { return getToken(XpgParser.DB, 0); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
		public DbmappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbmapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterDbmapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitDbmapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitDbmapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbmappingContext dbmapping() throws RecognitionException {
		DbmappingContext _localctx = new DbmappingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dbmapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(DB);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); match(EQUALS);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(193);
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

	public static class DeltaruleContext extends ParserRuleContext {
		public TerminalNode DR() { return getToken(XpgParser.DR, 0); }
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public List<TerminalNode> APICE() { return getTokens(XpgParser.APICE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public TerminalNode APICE(int i) {
			return getToken(XpgParser.APICE, i);
		}
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
		public TerminalNode EQUALS() { return getToken(XpgParser.EQUALS, 0); }
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode PLUS() { return getToken(XpgParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XpgParser.MINUS, 0); }
		public DeltaruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltarule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterDeltarule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitDeltarule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitDeltarule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeltaruleContext deltarule() throws RecognitionException {
		DeltaruleContext _localctx = new DeltaruleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_deltarule);
		int _la;
		try {
			int _alt;
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(DR);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(195);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201); match(EQUALS);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(202);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(DR);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(209);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215); match(EQUALS);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(216);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222); match(PLUS);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(223);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); match(DR);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(230);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236); match(EQUALS);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(237);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243); match(MINUS);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(244);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); match(DR);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(251);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257); match(EQUALS);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
					{
					{
					setState(258);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264); relation();
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(265);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APICE) | (1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class IdrelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XpgParser.STRING, 0); }
		public IdrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idrel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterIdrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitIdrel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitIdrel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdrelContext idrel() throws RecognitionException {
		IdrelContext _localctx = new IdrelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idrel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticruleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XpgParser.STRING, 0); }
		public SemanticruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterSemanticrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitSemanticrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitSemanticrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticruleContext semanticrule() throws RecognitionException {
		SemanticruleContext _localctx = new SemanticruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_semanticrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdrelationContext extends ParserRuleContext {
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
		public IdrelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idrelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterIdrelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitIdrelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitIdrelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdrelationContext idrelation() throws RecognitionException {
		IdrelationContext _localctx = new IdrelationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idrelation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class NonterminalContext extends ParserRuleContext {
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public List<TerminalNode> APICE() { return getTokens(XpgParser.APICE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode APICE(int i) {
			return getToken(XpgParser.APICE, i);
		}
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
		public NonterminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterNonterminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitNonterminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitNonterminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonterminalContext nonterminal() throws RecognitionException {
		NonterminalContext _localctx = new NonterminalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nonterminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(LOWER);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(285);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(291); match(APICE);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class TerminalContext extends ParserRuleContext {
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public List<TerminalNode> APICE() { return getTokens(XpgParser.APICE); }
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public TerminalNode APICE(int i) {
			return getToken(XpgParser.APICE, i);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_terminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(UPPER);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(298); match(UPPER);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(304); match(APICE);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\37\u0139\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\7\6P\n\6\f\6"+
		"\16\6S\13\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\6\7\\\n\7\r\7\16\7]\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\5\tg\n\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\5\tp\n"+
		"\t\3\t\5\ts\n\t\3\t\5\tv\n\t\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\6\13"+
		"\u0080\n\13\r\13\16\13\u0081\3\13\3\13\3\f\3\f\3\f\6\f\u0089\n\f\r\f\16"+
		"\f\u008a\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0097\n\16\3"+
		"\16\5\16\u009a\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00a4"+
		"\n\17\r\17\16\17\u00a5\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\5\23\u00b2\n\23\3\23\5\23\u00b5\n\23\3\24\3\24\7\24\u00b9\n\24\f\24"+
		"\16\24\u00bc\13\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3\13\24\3"+
		"\25\3\25\7\25\u00c7\n\25\f\25\16\25\u00ca\13\25\3\25\3\25\7\25\u00ce\n"+
		"\25\f\25\16\25\u00d1\13\25\3\25\3\25\7\25\u00d5\n\25\f\25\16\25\u00d8"+
		"\13\25\3\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\25\3\25\7\25"+
		"\u00e3\n\25\f\25\16\25\u00e6\13\25\3\25\3\25\7\25\u00ea\n\25\f\25\16\25"+
		"\u00ed\13\25\3\25\3\25\7\25\u00f1\n\25\f\25\16\25\u00f4\13\25\3\25\3\25"+
		"\7\25\u00f8\n\25\f\25\16\25\u00fb\13\25\3\25\3\25\7\25\u00ff\n\25\f\25"+
		"\16\25\u0102\13\25\3\25\3\25\7\25\u0106\n\25\f\25\16\25\u0109\13\25\3"+
		"\25\3\25\7\25\u010d\n\25\f\25\16\25\u0110\13\25\5\25\u0112\n\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\7\30\u011a\n\30\f\30\16\30\u011d\13\30\3\31\3"+
		"\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\3\31\7\31\u0127\n\31\f\31\16"+
		"\31\u012a\13\31\3\32\3\32\7\32\u012e\n\32\f\32\16\32\u0131\13\32\3\32"+
		"\7\32\u0134\n\32\f\32\16\32\u0137\13\32\3\32\7Wk\u010e\u0128\u0135\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\30\32\4"+
		"\2\26\26\30\32\4\2\t\n\36\36\4\2\25\26\30\32\u0146\2\64\3\2\2\2\4\67\3"+
		"\2\2\2\6A\3\2\2\2\bF\3\2\2\2\nM\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20f\3\2"+
		"\2\2\22w\3\2\2\2\24|\3\2\2\2\26\u0085\3\2\2\2\30\u008e\3\2\2\2\32\u0093"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00a9\3\2\2\2 \u00ab\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00b6\3\2\2\2(\u0111\3\2\2\2*\u0113\3\2\2\2,\u0115"+
		"\3\2\2\2.\u0117\3\2\2\2\60\u011e\3\2\2\2\62\u012b\3\2\2\2\64\65\5\4\3"+
		"\2\65\66\5\f\7\2\66\3\3\2\2\2\678\7\5\2\28<\7\16\2\29;\5\6\4\2:9\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\17\2\2@\5\3\2"+
		"\2\2AB\5\b\5\2BC\7\27\2\2CD\5\n\6\2DE\7\35\2\2E\7\3\2\2\2FJ\t\2\2\2GI"+
		"\t\3\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2"+
		"MQ\7\30\2\2NP\7\30\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RW\3\2\2"+
		"\2SQ\3\2\2\2TV\7\25\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2X\13\3"+
		"\2\2\2YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^\r\3\2\2\2_`\5\60\31\2`a\7\13\2\2ab\5\20\t\2bc\7\35\2\2c\17\3\2\2\2d"+
		"g\5\60\31\2eg\5\62\32\2fd\3\2\2\2fe\3\2\2\2gk\3\2\2\2hj\5\22\n\2ih\3\2"+
		"\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\24\13\2on\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\26\f\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv"+
		"\5\30\r\2ut\3\2\2\2uv\3\2\2\2v\21\3\2\2\2wz\5\32\16\2x{\5\60\31\2y{\5"+
		"\62\32\2zx\3\2\2\2zy\3\2\2\2{\23\3\2\2\2|}\7\6\2\2}\177\7\16\2\2~\u0080"+
		"\5$\23\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\17\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7\7\2\2\u0086\u0088\7\20\2\2\u0087\u0089\5\34\17\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\21\2\2\u008d\27\3\2\2\2\u008e\u008f\7\b\2"+
		"\2\u008f\u0090\7\20\2\2\u0090\u0091\5,\27\2\u0091\u0092\7\21\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0096\5 \21\2\u0095\u0097\7\23\2"+
		"\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a"+
		"\5\"\22\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\7\r\2\2\u009c\33\3\2\2\2\u009d\u009e\7\16\2\2\u009e\u009f"+
		"\5\62\32\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a3\7\22"+
		"\2\2\u00a2\u00a4\5$\23\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\17"+
		"\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa\37\3\2\2\2\u00ab\u00ac"+
		"\5.\30\2\u00ac!\3\2\2\2\u00ad\u00ae\5.\30\2\u00ae#\3\2\2\2\u00af\u00b2"+
		"\5&\24\2\u00b0\u00b2\5(\25\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b5\7\23\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5%\3\2\2\2\u00b6\u00ba\7\3\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7\27\2\2\u00be\u00c0\t"+
		"\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\'\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\7\4\2\2"+
		"\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cf\7\27\2\2\u00cc\u00ce\t\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u0112\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d6\7\4\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dd\7\27\2\2\u00da\u00dc\t"+
		"\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\7\33"+
		"\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u0112\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00eb\7\4\2\2\u00e8\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\7\27\2\2\u00ef\u00f1\t\5\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\7\34\2\2\u00f6"+
		"\u00f8\t\5\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0112\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u0100\7\4\2\2\u00fd\u00ff\t\5\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0107\7\27\2\2\u0104\u0106\t\5\2\2\u0105\u0104\3"+
		"\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010e\5\32\16\2\u010b\u010d\t"+
		"\5\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u00c4\3\2"+
		"\2\2\u0111\u00d2\3\2\2\2\u0111\u00e7\3\2\2\2\u0111\u00fc\3\2\2\2\u0112"+
		")\3\2\2\2\u0113\u0114\7\36\2\2\u0114+\3\2\2\2\u0115\u0116\7\36\2\2\u0116"+
		"-\3\2\2\2\u0117\u011b\t\2\2\2\u0118\u011a\t\3\2\2\u0119\u0118\3\2\2\2"+
		"\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c/\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\7\31\2\2\u011f\u0121\t\3\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0128\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\7\25\2\2\u0126"+
		"\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\61\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012f\7\30\2\2\u012c\u012e"+
		"\7\30\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u0135\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134"+
		"\7\25\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0136\63\3\2\2\2\u0137\u0135\3\2\2\2\'<JQW]fkoru"+
		"z\u0081\u008a\u0096\u0099\u00a5\u00b1\u00b4\u00ba\u00c1\u00c8\u00cf\u00d6"+
		"\u00dd\u00e4\u00eb\u00f2\u00f9\u0100\u0107\u010e\u0111\u011b\u0122\u0128"+
		"\u012f\u0135";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}