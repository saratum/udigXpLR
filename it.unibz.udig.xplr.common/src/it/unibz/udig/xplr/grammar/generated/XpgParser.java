package it.unibz.udig.xplr.grammar.generated;
// Generated from /Users/sara/Dropbox/tesi/tex/08-codice/Xpg.g4 by ANTLR 4.1
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
		DELTA=1, GAMMA=2, SEMANTICRULE=3, LAYERS=4, TRUE=5, FALSE=6, ARROW=7, 
		LT=8, GT=9, LPAREN=10, RPAREN=11, LGPAREN=12, RGPAREN=13, SEMICOLON=14, 
		COMMA=15, COLON=16, APICE=17, UNDERSCORE=18, UPPER=19, LOWER=20, DIGITS=21, 
		ENDOFLINE=22, STRING=23, WS=24;
	public static final String[] tokenNames = {
		"<INVALID>", "DELTA", "GAMMA", "SEMANTICRULE", "'LAYERS'", "'true'", "'false'", 
		"'->'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'", "','", "':'", 
		"'''", "'_'", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS"
	};
	public static final int
		RULE_xpgfile = 0, RULE_layers = 1, RULE_layer = 2, RULE_layername = 3, 
		RULE_productions = 4, RULE_production = 5, RULE_linearRepresentation = 6, 
		RULE_relations = 7, RULE_rules = 8, RULE_triples = 9, RULE_semanticrules = 10, 
		RULE_relation = 11, RULE_triple = 12, RULE_condition = 13, RULE_driver = 14, 
		RULE_tester = 15, RULE_myrule = 16, RULE_idrel = 17, RULE_semanticrule = 18, 
		RULE_idrelation = 19, RULE_nonterminal = 20, RULE_terminal = 21;
	public static final String[] ruleNames = {
		"xpgfile", "layers", "layer", "layername", "productions", "production", 
		"linearRepresentation", "relations", "rules", "triples", "semanticrules", 
		"relation", "triple", "condition", "driver", "tester", "myrule", "idrel", 
		"semanticrule", "idrelation", "nonterminal", "terminal"
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
			setState(44); layers();
			setState(45); productions();
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
			setState(47); match(LAYERS);
			setState(48); match(LPAREN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(49); layer();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(RPAREN);
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
		public TerminalNode ENDOFLINE() { return getToken(XpgParser.ENDOFLINE, 0); }
		public LayernameContext layername() {
			return getRuleContext(LayernameContext.class,0);
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
			setState(57); layername();
			setState(58); match(ENDOFLINE);
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
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(66);
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
		enterRule(_localctx, 8, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67); production();
				}
				}
				setState(70); 
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
		enterRule(_localctx, 10, RULE_production);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); nonterminal();
			setState(73); match(ARROW);
			setState(74); linearRepresentation();
			setState(75); match(ENDOFLINE);
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
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
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
		enterRule(_localctx, 12, RULE_linearRepresentation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(77); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(78); terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(81); relations();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(88);
			_la = _input.LA(1);
			if (_la==DELTA) {
				{
				setState(87); rules();
				}
			}

			setState(91);
			_la = _input.LA(1);
			if (_la==GAMMA) {
				{
				setState(90); triples();
				}
			}

			setState(94);
			_la = _input.LA(1);
			if (_la==SEMANTICRULE) {
				{
				setState(93); semanticrules();
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
		enterRule(_localctx, 14, RULE_relations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96); relation();
			setState(99);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(97); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(98); terminal();
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

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(XpgParser.LPAREN, 0); }
		public List<MyruleContext> myrule() {
			return getRuleContexts(MyruleContext.class);
		}
		public MyruleContext myrule(int i) {
			return getRuleContext(MyruleContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XpgParser.RPAREN, 0); }
		public TerminalNode DELTA() { return getToken(XpgParser.DELTA, 0); }
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
		enterRule(_localctx, 16, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(DELTA);
			setState(102); match(LPAREN);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103); myrule();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(108); match(RPAREN);
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
		enterRule(_localctx, 18, RULE_triples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(GAMMA);
			setState(111); match(LGPAREN);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112); triple();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(117); match(RGPAREN);
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
		enterRule(_localctx, 20, RULE_semanticrules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(SEMANTICRULE);
			setState(120); match(LGPAREN);
			setState(121); semanticrule();
			setState(122); match(RGPAREN);
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
		enterRule(_localctx, 22, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(LT);
			setState(125); driver();
			setState(127);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(126); match(COMMA);
				}
			}

			setState(130);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				setState(129); tester();
				}
			}

			setState(132); match(GT);
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
		public TerminalNode LPAREN() { return getToken(XpgParser.LPAREN, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public List<MyruleContext> myrule() {
			return getRuleContexts(MyruleContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(XpgParser.SEMICOLON, i);
		}
		public MyruleContext myrule(int i) {
			return getRuleContext(MyruleContext.class,i);
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
		enterRule(_localctx, 24, RULE_triple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(LPAREN);
			setState(135); terminal();
			setState(136); match(SEMICOLON);
			setState(137); condition();
			setState(138); match(SEMICOLON);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139); myrule();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(144); match(RPAREN);
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
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 28, RULE_driver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); idrelation();
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
		enterRule(_localctx, 30, RULE_tester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); idrelation();
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

	public static class MyruleContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(XpgParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(XpgParser.STRING, 0); }
		public MyruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).enterMyrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpgListener ) ((XpgListener)listener).exitMyrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpgVisitor ) return ((XpgVisitor<? extends T>)visitor).visitMyrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyruleContext myrule() throws RecognitionException {
		MyruleContext _localctx = new MyruleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_myrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(STRING);
			setState(154);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(153); match(COMMA);
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
		enterRule(_localctx, 34, RULE_idrel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(STRING);
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
		enterRule(_localctx, 36, RULE_semanticrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(STRING);
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
		enterRule(_localctx, 38, RULE_idrelation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 40, RULE_nonterminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(LOWER);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(174); match(APICE);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 42, RULE_terminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(UPPER);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(181); match(UPPER);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(187); match(APICE);
					}
					} 
				}
				setState(192);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\6\6\6G\n\6\r\6\16\6H\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bR"+
		"\n\b\3\b\7\bU\n\b\f\b\16\bX\13\b\3\b\5\b[\n\b\3\b\5\b^\n\b\3\b\5\ba\n"+
		"\b\3\t\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\6\nk\n\n\r\n\16\nl\3\n\3\n\3\13\3"+
		"\13\3\13\6\13t\n\13\r\13\16\13u\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\5\r\u0082\n\r\3\r\5\r\u0085\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\6\16\u008f\n\16\r\16\16\16\u0090\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\5\22\u009d\n\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25"+
		"\u00a5\n\25\f\25\16\25\u00a8\13\25\3\26\3\26\7\26\u00ac\n\26\f\26\16\26"+
		"\u00af\13\26\3\26\7\26\u00b2\n\26\f\26\16\26\u00b5\13\26\3\27\3\27\7\27"+
		"\u00b9\n\27\f\27\16\27\u00bc\13\27\3\27\7\27\u00bf\n\27\f\27\16\27\u00c2"+
		"\13\27\3\27\5V\u00b3\u00c0\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,\2\5\3\2\25\27\3\2\24\27\4\2\7\b\31\31\u00c1\2.\3\2\2\2\4\61\3"+
		"\2\2\2\6;\3\2\2\2\b>\3\2\2\2\nF\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2\2\20b\3\2"+
		"\2\2\22g\3\2\2\2\24p\3\2\2\2\26y\3\2\2\2\30~\3\2\2\2\32\u0088\3\2\2\2"+
		"\34\u0094\3\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u009a\3\2\2\2$\u009e"+
		"\3\2\2\2&\u00a0\3\2\2\2(\u00a2\3\2\2\2*\u00a9\3\2\2\2,\u00b6\3\2\2\2."+
		"/\5\4\3\2/\60\5\n\6\2\60\3\3\2\2\2\61\62\7\6\2\2\62\66\7\f\2\2\63\65\5"+
		"\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2"+
		"\28\66\3\2\2\29:\7\r\2\2:\5\3\2\2\2;<\5\b\5\2<=\7\30\2\2=\7\3\2\2\2>B"+
		"\t\2\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2"+
		"DB\3\2\2\2EG\5\f\7\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2"+
		"\2JK\5*\26\2KL\7\t\2\2LM\5\16\b\2MN\7\30\2\2N\r\3\2\2\2OR\5*\26\2PR\5"+
		",\27\2QO\3\2\2\2QP\3\2\2\2RV\3\2\2\2SU\5\20\t\2TS\3\2\2\2UX\3\2\2\2VW"+
		"\3\2\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\5\22\n\2ZY\3\2\2\2Z[\3\2\2\2"+
		"[]\3\2\2\2\\^\5\24\13\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5\26\f\2`_\3"+
		"\2\2\2`a\3\2\2\2a\17\3\2\2\2be\5\30\r\2cf\5*\26\2df\5,\27\2ec\3\2\2\2"+
		"ed\3\2\2\2f\21\3\2\2\2gh\7\3\2\2hj\7\f\2\2ik\5\"\22\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\r\2\2o\23\3\2\2\2pq\7\4\2\2qs\7"+
		"\16\2\2rt\5\32\16\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2"+
		"wx\7\17\2\2x\25\3\2\2\2yz\7\5\2\2z{\7\16\2\2{|\5&\24\2|}\7\17\2\2}\27"+
		"\3\2\2\2~\177\7\n\2\2\177\u0081\5\36\20\2\u0080\u0082\7\21\2\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5 \21\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\13"+
		"\2\2\u0087\31\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\5,\27\2\u008a\u008b"+
		"\7\20\2\2\u008b\u008c\5\34\17\2\u008c\u008e\7\20\2\2\u008d\u008f\5\"\22"+
		"\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\r\2\2\u0093\33\3\2\2\2\u0094"+
		"\u0095\t\4\2\2\u0095\35\3\2\2\2\u0096\u0097\5(\25\2\u0097\37\3\2\2\2\u0098"+
		"\u0099\5(\25\2\u0099!\3\2\2\2\u009a\u009c\7\31\2\2\u009b\u009d\7\21\2"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d#\3\2\2\2\u009e\u009f"+
		"\7\31\2\2\u009f%\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1\'\3\2\2\2\u00a2\u00a6"+
		"\t\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7)\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a9\u00ad\7\26\2\2\u00aa\u00ac\t\3\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b2\7\23\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4+\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00ba\7\25\2\2\u00b7\u00b9\7\25\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\23\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1-\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\26\66BHQVZ]`elu\u0081\u0084\u0090\u009c\u00a6"+
		"\u00ad\u00b3\u00ba\u00c0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}