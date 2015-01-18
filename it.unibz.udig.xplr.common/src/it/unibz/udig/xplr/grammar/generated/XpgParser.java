// Generated from /Users/sara/Dropbox/tesi/tex/08-codice/Xpg.g4 by ANTLR 4.1
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
		DELTA=1, GAMMA=2, SEMANTICRULE=3, TRUE=4, FALSE=5, ARROW=6, LT=7, GT=8, 
		LPAREN=9, RPAREN=10, LGPAREN=11, RGPAREN=12, SEMICOLON=13, COMMA=14, COLON=15, 
		APICE=16, UNDERSCORE=17, EQUALS=18, UPPER=19, LOWER=20, DIGITS=21, ENDOFLINE=22, 
		STRING=23, WS=24;
	public static final String[] tokenNames = {
		"<INVALID>", "DELTA", "GAMMA", "SEMANTICRULE", "'true'", "'false'", "'->'", 
		"'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'", "','", "':'", "'''", 
		"'_'", "'='", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS"
	};
	public static final int
		RULE_xpgfile = 0, RULE_productions = 1, RULE_production = 2, RULE_linearRepresentation = 3, 
		RULE_relations = 4, RULE_deltarules = 5, RULE_triples = 6, RULE_semanticrules = 7, 
		RULE_relation = 8, RULE_triple = 9, RULE_condition = 10, RULE_driver = 11, 
		RULE_tester = 12, RULE_rules = 13, RULE_deltarule = 14, RULE_idrel = 15, 
		RULE_semanticrule = 16, RULE_idrelation = 17, RULE_nonterminal = 18, RULE_terminal = 19;
	public static final String[] ruleNames = {
		"xpgfile", "productions", "production", "linearRepresentation", "relations", 
		"deltarules", "triples", "semanticrules", "relation", "triple", "condition", 
		"driver", "tester", "rules", "deltarule", "idrel", "semanticrule", "idrelation", 
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
			setState(40); productions();
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
		enterRule(_localctx, 2, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); production();
				}
				}
				setState(45); 
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
		enterRule(_localctx, 4, RULE_production);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); nonterminal();
			setState(48); match(ARROW);
			setState(49); linearRepresentation();
			setState(50); match(ENDOFLINE);
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
		enterRule(_localctx, 6, RULE_linearRepresentation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(52); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(53); terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(56); relations();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			_la = _input.LA(1);
			if (_la==DELTA) {
				{
				setState(62); deltarules();
				}
			}

			setState(66);
			_la = _input.LA(1);
			if (_la==GAMMA) {
				{
				setState(65); triples();
				}
			}

			setState(69);
			_la = _input.LA(1);
			if (_la==SEMANTICRULE) {
				{
				setState(68); semanticrules();
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
		enterRule(_localctx, 8, RULE_relations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71); relation();
			setState(74);
			switch (_input.LA(1)) {
			case LOWER:
				{
				setState(72); nonterminal();
				}
				break;
			case UPPER:
				{
				setState(73); terminal();
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
		enterRule(_localctx, 10, RULE_deltarules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(DELTA);
			setState(77); match(LPAREN);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78); rules();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << EQUALS) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0) );
			setState(83); match(RPAREN);
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
		enterRule(_localctx, 12, RULE_triples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(GAMMA);
			setState(86); match(LGPAREN);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87); triple();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(92); match(RGPAREN);
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
		enterRule(_localctx, 14, RULE_semanticrules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(SEMANTICRULE);
			setState(95); match(LGPAREN);
			setState(96); semanticrule();
			setState(97); match(RGPAREN);
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
		enterRule(_localctx, 16, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(LT);
			setState(100); driver();
			setState(102);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(101); match(COMMA);
				}
			}

			setState(105);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				setState(104); tester();
				}
			}

			setState(107); match(GT);
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
		enterRule(_localctx, 18, RULE_triple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(LPAREN);
			setState(110); terminal();
			setState(111); match(SEMICOLON);
			setState(112); condition();
			setState(113); match(SEMICOLON);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114); rules();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << EQUALS) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0) );
			setState(119); match(RPAREN);
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
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 22, RULE_driver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); idrelation();
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
		enterRule(_localctx, 24, RULE_tester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); idrelation();
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
		enterRule(_localctx, 26, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); deltarule();
			setState(129);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(128); match(COMMA);
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
		enterRule(_localctx, 28, RULE_deltarule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(EQUALS);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 30, RULE_idrel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(STRING);
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
		enterRule(_localctx, 32, RULE_semanticrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(STRING);
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
		enterRule(_localctx, 34, RULE_idrelation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(154);
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
		enterRule(_localctx, 36, RULE_nonterminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(LOWER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(162); match(APICE);
					}
					} 
				}
				setState(167);
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
		enterRule(_localctx, 38, RULE_terminal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(UPPER);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UPPER) {
				{
				{
				setState(169); match(UPPER);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(175); match(APICE);
					}
					} 
				}
				setState(180);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\5\59\n\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\5\5B\n\5"+
		"\3\5\5\5E\n\5\3\5\5\5H\n\5\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\6\7R\n\7\r"+
		"\7\16\7S\3\7\3\7\3\b\3\b\3\b\6\b[\n\b\r\b\16\b\\\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\ni\n\n\3\n\5\nl\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\6\13v\n\13\r\13\16\13w\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\5\17\u0084\n\17\3\20\7\20\u0087\n\20\f\20\16\20\u008a\13\20\3"+
		"\20\3\20\7\20\u008e\n\20\f\20\16\20\u0091\13\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\7\23\u0099\n\23\f\23\16\23\u009c\13\23\3\24\3\24\7\24\u00a0\n"+
		"\24\f\24\16\24\u00a3\13\24\3\24\7\24\u00a6\n\24\f\24\16\24\u00a9\13\24"+
		"\3\25\3\25\7\25\u00ad\n\25\f\25\16\25\u00b0\13\25\3\25\7\25\u00b3\n\25"+
		"\f\25\16\25\u00b6\13\25\3\25\5=\u00a7\u00b4\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\5\4\2\6\7\31\31\4\2\23\23\25\27\3\2\25\27\u00b7"+
		"\2*\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2\b8\3\2\2\2\nI\3\2\2\2\fN\3\2\2\2\16"+
		"W\3\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24o\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0088\3\2\2\2 \u0092\3\2\2\2\"\u0094"+
		"\3\2\2\2$\u0096\3\2\2\2&\u009d\3\2\2\2(\u00aa\3\2\2\2*+\5\4\3\2+\3\3\2"+
		"\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2"+
		"\61\62\5&\24\2\62\63\7\b\2\2\63\64\5\b\5\2\64\65\7\30\2\2\65\7\3\2\2\2"+
		"\669\5&\24\2\679\5(\25\28\66\3\2\2\28\67\3\2\2\29=\3\2\2\2:<\5\n\6\2;"+
		":\3\2\2\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\5\f\7\2"+
		"A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\16\b\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2"+
		"\2FH\5\20\t\2GF\3\2\2\2GH\3\2\2\2H\t\3\2\2\2IL\5\22\n\2JM\5&\24\2KM\5"+
		"(\25\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\7\3\2\2OQ\7\13\2\2PR\5\34\17"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\r\3\2"+
		"\2\2WX\7\4\2\2XZ\7\r\2\2Y[\5\24\13\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]^\3\2\2\2^_\7\16\2\2_\17\3\2\2\2`a\7\5\2\2ab\7\r\2\2bc\5\"\22"+
		"\2cd\7\16\2\2d\21\3\2\2\2ef\7\t\2\2fh\5\30\r\2gi\7\20\2\2hg\3\2\2\2hi"+
		"\3\2\2\2ik\3\2\2\2jl\5\32\16\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\n\2\2"+
		"n\23\3\2\2\2op\7\13\2\2pq\5(\25\2qr\7\17\2\2rs\5\26\f\2su\7\17\2\2tv\5"+
		"\34\17\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\f\2\2z"+
		"\25\3\2\2\2{|\t\2\2\2|\27\3\2\2\2}~\5$\23\2~\31\3\2\2\2\177\u0080\5$\23"+
		"\2\u0080\33\3\2\2\2\u0081\u0083\5\36\20\2\u0082\u0084\7\20\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\35\3\2\2\2\u0085\u0087\t\3\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008f\7\24\2\2\u008c"+
		"\u008e\t\3\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\37\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7\31\2\2\u0093!\3\2\2\2\u0094\u0095\7\31\2\2\u0095#\3\2\2\2\u0096\u009a"+
		"\t\4\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b%\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009d\u00a1\7\26\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a6\7\22\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\'\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ae\7\25\2\2\u00ab\u00ad\7\25\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b4"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\22\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5)\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\26/8=ADGLS\\hkw\u0083\u0088\u008f\u009a\u00a1"+
		"\u00a7\u00ae\u00b4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}