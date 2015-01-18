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
		LAYERS=1, DELTA=2, GAMMA=3, SEMANTICRULE=4, TRUE=5, FALSE=6, ARROW=7, 
		LT=8, GT=9, LPAREN=10, RPAREN=11, LGPAREN=12, RGPAREN=13, SEMICOLON=14, 
		COMMA=15, COLON=16, APICE=17, UNDERSCORE=18, EQUALS=19, UPPER=20, LOWER=21, 
		DIGITS=22, ENDOFLINE=23, STRING=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'LAYERS'", "DELTA", "GAMMA", "SEMANTICRULE", "'true'", "'false'", 
		"'->'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'", "','", "':'", 
		"'''", "'_'", "'='", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS"
	};
	public static final int
		RULE_xpgfile = 0, RULE_layers = 1, RULE_layer = 2, RULE_layername = 3, 
		RULE_something = 4, RULE_productions = 5, RULE_production = 6, RULE_linearRepresentation = 7, 
		RULE_relations = 8, RULE_deltarules = 9, RULE_triples = 10, RULE_semanticrules = 11, 
		RULE_relation = 12, RULE_triple = 13, RULE_condition = 14, RULE_driver = 15, 
		RULE_tester = 16, RULE_rules = 17, RULE_deltarule = 18, RULE_idrel = 19, 
		RULE_semanticrule = 20, RULE_idrelation = 21, RULE_nonterminal = 22, RULE_terminal = 23;
	public static final String[] ruleNames = {
		"xpgfile", "layers", "layer", "layername", "something", "productions", 
		"production", "linearRepresentation", "relations", "deltarules", "triples", 
		"semanticrules", "relation", "triple", "condition", "driver", "tester", 
		"rules", "deltarule", "idrel", "semanticrule", "idrelation", "nonterminal", 
		"terminal"
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
			setState(48); layers();
			setState(49); productions();
			}
		}
		catch (RecognitionException re) {
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
			setState(51); match(LAYERS);
			setState(52); match(LPAREN);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(53); layer();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(61); layername();
			setState(62); match(EQUALS);
			setState(63); something();
			setState(64); match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
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
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(72);
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
			setState(73); match(UPPER);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(74); match(UPPER);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(80); match(APICE);
					}
					} 
				}
				setState(85);
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86); production();
				}
				}
				setState(89); 
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
			setState(91); nonterminal();
			setState(92); match(ARROW);
			setState(93); linearRepresentation();
			setState(94); match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
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
			setState(98);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(96); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(97); terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100); relations();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==DELTA) {
				{
				setState(106); deltarules();
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==GAMMA) {
				{
				setState(109); triples();
				}
			}

			setState(113);
			_la = _input.LA(1);
			if (_la==SEMANTICRULE) {
				{
				setState(112); semanticrules();
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
			setState(115); relation();
			setState(118);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(116); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(117); terminal();
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
			setState(120); match(DELTA);
			setState(121); match(LPAREN);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122); rules();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << EQUALS) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0) );
			setState(127); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(129); match(GAMMA);
			setState(130); match(LGPAREN);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131); triple();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(136); match(RGPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(138); match(SEMANTICRULE);
			setState(139); match(LGPAREN);
			setState(140); semanticrule();
			setState(141); match(RGPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(143); match(LT);
			setState(144); driver();
			setState(146);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(145); match(COMMA);
				}
			}

			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				setState(148); tester();
				}
			}

			setState(151); match(GT);
			}
		}
		catch (RecognitionException re) {
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
			setState(153); match(LPAREN);
			setState(154); terminal();
			setState(155); match(SEMICOLON);
			setState(156); condition();
			setState(157); match(SEMICOLON);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158); rules();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << EQUALS) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0) );
			setState(163); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(165);
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
			setState(167); idrelation();
			}
		}
		catch (RecognitionException re) {
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

	public static class RulesContext extends ParserRuleContext {
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
			setState(171); deltarule();
			setState(173);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(172); match(COMMA);
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

	public static class DeltaruleContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(XpgParser.EQUALS, 0); }
		public List<TerminalNode> UPPER() { return getTokens(XpgParser.UPPER); }
		public TerminalNode LOWER(int i) {
			return getToken(XpgParser.LOWER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(XpgParser.UNDERSCORE); }
		public TerminalNode DIGITS(int i) {
			return getToken(XpgParser.DIGITS, i);
		}
		public TerminalNode UPPER(int i) {
			return getToken(XpgParser.UPPER, i);
		}
		public List<TerminalNode> LOWER() { return getTokens(XpgParser.LOWER); }
		public List<TerminalNode> DIGITS() { return getTokens(XpgParser.DIGITS); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(XpgParser.UNDERSCORE, i);
		}
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
		enterRule(_localctx, 36, RULE_deltarule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181); match(EQUALS);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 38, RULE_idrel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_semanticrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_idrelation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 44, RULE_nonterminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(LOWER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(200);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(206); match(APICE);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 46, RULE_terminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(UPPER);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(213); match(UPPER);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(219); match(APICE);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\33\u00e4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6"+
		"\3\6\7\6T\n\6\f\6\16\6W\13\6\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\te\n\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\5\tn\n\t\3\t\5\tq"+
		"\n\t\3\t\5\tt\n\t\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\6\13~\n\13\r\13"+
		"\16\13\177\3\13\3\13\3\f\3\f\3\f\6\f\u0087\n\f\r\f\16\f\u0088\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0095\n\16\3\16\5\16\u0098\n"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00a2\n\17\r\17\16\17"+
		"\u00a3\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00b0\n"+
		"\23\3\24\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\24\3\24\7\24\u00ba\n"+
		"\24\f\24\16\24\u00bd\13\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00c5\n"+
		"\27\f\27\16\27\u00c8\13\27\3\30\3\30\7\30\u00cc\n\30\f\30\16\30\u00cf"+
		"\13\30\3\30\7\30\u00d2\n\30\f\30\16\30\u00d5\13\30\3\31\3\31\7\31\u00d9"+
		"\n\31\f\31\16\31\u00dc\13\31\3\31\7\31\u00df\n\31\f\31\16\31\u00e2\13"+
		"\31\3\31\6Ui\u00d3\u00e0\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\5\3\2\26\30\4\2\24\24\26\30\4\2\7\b\32\32\u00e3\2\62\3\2\2"+
		"\2\4\65\3\2\2\2\6?\3\2\2\2\bD\3\2\2\2\nK\3\2\2\2\fY\3\2\2\2\16]\3\2\2"+
		"\2\20d\3\2\2\2\22u\3\2\2\2\24z\3\2\2\2\26\u0083\3\2\2\2\30\u008c\3\2\2"+
		"\2\32\u0091\3\2\2\2\34\u009b\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\""+
		"\u00ab\3\2\2\2$\u00ad\3\2\2\2&\u00b4\3\2\2\2(\u00be\3\2\2\2*\u00c0\3\2"+
		"\2\2,\u00c2\3\2\2\2.\u00c9\3\2\2\2\60\u00d6\3\2\2\2\62\63\5\4\3\2\63\64"+
		"\5\f\7\2\64\3\3\2\2\2\65\66\7\3\2\2\66:\7\f\2\2\679\5\6\4\28\67\3\2\2"+
		"\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\r\2\2>\5\3\2"+
		"\2\2?@\5\b\5\2@A\7\25\2\2AB\5\n\6\2BC\7\31\2\2C\7\3\2\2\2DH\t\2\2\2EG"+
		"\t\3\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2"+
		"KO\7\26\2\2LN\7\26\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2"+
		"\2QO\3\2\2\2RT\7\23\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2V\13\3"+
		"\2\2\2WU\3\2\2\2XZ\5\16\b\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"\r\3\2\2\2]^\5.\30\2^_\7\t\2\2_`\5\20\t\2`a\7\31\2\2a\17\3\2\2\2be\5."+
		"\30\2ce\5\60\31\2db\3\2\2\2dc\3\2\2\2ei\3\2\2\2fh\5\22\n\2gf\3\2\2\2h"+
		"k\3\2\2\2ij\3\2\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2ln\5\24\13\2ml\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2oq\5\26\f\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\30"+
		"\r\2sr\3\2\2\2st\3\2\2\2t\21\3\2\2\2ux\5\32\16\2vy\5.\30\2wy\5\60\31\2"+
		"xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\7\4\2\2{}\7\f\2\2|~\5$\23\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7\r\2\2\u0082\25\3\2\2\2\u0083\u0084\7\5\2\2\u0084\u0086\7\16\2"+
		"\2\u0085\u0087\5\34\17\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\17"+
		"\2\2\u008b\27\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7\16\2\2\u008e\u008f"+
		"\5*\26\2\u008f\u0090\7\17\2\2\u0090\31\3\2\2\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0094\5 \21\2\u0093\u0095\7\21\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\"\22\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\13\2\2\u009a\33\3\2\2"+
		"\2\u009b\u009c\7\f\2\2\u009c\u009d\5\60\31\2\u009d\u009e\7\20\2\2\u009e"+
		"\u009f\5\36\20\2\u009f\u00a1\7\20\2\2\u00a0\u00a2\5$\23\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\t\4\2"+
		"\2\u00a8\37\3\2\2\2\u00a9\u00aa\5,\27\2\u00aa!\3\2\2\2\u00ab\u00ac\5,"+
		"\27\2\u00ac#\3\2\2\2\u00ad\u00af\5&\24\2\u00ae\u00b0\7\21\2\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0%\3\2\2\2\u00b1\u00b3\t\3\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bb\7\25\2\2\u00b8"+
		"\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf"+
		"\7\32\2\2\u00bf)\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1+\3\2\2\2\u00c2\u00c6"+
		"\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7-\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00cd\7\27\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d2\7\23\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00da\7\26\2\2\u00d7\u00d9\7\26\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\7\23\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\61"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\32:HOU[dimpsx\177\u0088\u0094\u0097\u00a3"+
		"\u00af\u00b4\u00bb\u00c6\u00cd\u00d3\u00da\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}