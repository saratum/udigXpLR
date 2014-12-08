package it.unibz.udig.visuallangparser.grammar.generated;

// Generated from /Users/sara/Dropbox/tesi/tex/08-codice/Xpg.g4 by ANTLR 4.1
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings(
	{ "all", "warnings", "unchecked", "unused", "cast" })
public class XpgParser extends Parser
{
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int DELTA = 1, GAMMA = 2, SEMANTICRULE = 3, LAYERS = 4, TRUE = 5, FALSE = 6, ARROW = 7, LT = 8, GT = 9, LPAREN = 10,
			RPAREN = 11, LGPAREN = 12, RGPAREN = 13, SEMICOLON = 14, COMMA = 15, COLON = 16, APICE = 17, UNDERSCORE = 18, UPPER = 19, LOWER = 20,
			DIGITS = 21, ENDOFLINE = 22, STRING = 23, WS = 24;
	public static final String[] tokenNames =
		{ "<INVALID>", "DELTA", "GAMMA", "SEMANTICRULE", "'LAYERS'", "'true'", "'false'", "'->'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "';'",
				"','", "':'", "'''", "'_'", "UPPER", "LOWER", "DIGITS", "';\n'", "STRING", "WS" };
	public static final int RULE_xpgfile = 0, RULE_layers = 1, RULE_layer = 2, RULE_productions = 3, RULE_production = 4,
			RULE_linearRepresentation = 5, RULE_relations = 6, RULE_rules = 7, RULE_triples = 8, RULE_semanticrules = 9, RULE_relation = 10,
			RULE_triple = 11, RULE_condition = 12, RULE_driver = 13, RULE_tester = 14, RULE_myrule = 15, RULE_idrel = 16, RULE_semanticrule = 17,
			RULE_idrelation = 18, RULE_nonterminal = 19, RULE_terminal = 20;
	public static final String[] ruleNames =
		{ "xpgfile", "layers", "layer", "productions", "production", "linearRepresentation", "relations", "rules", "triples", "semanticrules",
				"relation", "triple", "condition", "driver", "tester", "myrule", "idrel", "semanticrule", "idrelation", "nonterminal", "terminal" };

	@Override
	public String getGrammarFileName()
	{
		return "Xpg.g4";
	}

	@Override
	public String[] getTokenNames()
	{
		return tokenNames;
	}

	@Override
	public String[] getRuleNames()
	{
		return ruleNames;
	}

	@Override
	public ATN getATN()
	{
		return _ATN;
	}

	public XpgParser(TokenStream input)
	{
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class XpgfileContext extends ParserRuleContext
	{
		public LayersContext layers()
		{
			return getRuleContext(LayersContext.class, 0);
		}

		public ProductionsContext productions()
		{
			return getRuleContext(ProductionsContext.class, 0);
		}

		public XpgfileContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_xpgfile;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterXpgfile(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitXpgfile(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitXpgfile(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final XpgfileContext xpgfile() throws RecognitionException
	{
		XpgfileContext _localctx = new XpgfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xpgfile);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(42);
				layers();
				setState(43);
				productions();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class LayersContext extends ParserRuleContext
	{
		public TerminalNode LAYERS()
		{
			return getToken(XpgParser.LAYERS, 0);
		}

		public TerminalNode RPAREN()
		{
			return getToken(XpgParser.RPAREN, 0);
		}

		public List<LayerContext> layer()
		{
			return getRuleContexts(LayerContext.class);
		}

		public TerminalNode LPAREN()
		{
			return getToken(XpgParser.LPAREN, 0);
		}

		public LayerContext layer(int i)
		{
			return getRuleContext(LayerContext.class, i);
		}

		public LayersContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_layers;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterLayers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitLayers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitLayers(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LayersContext layers() throws RecognitionException
	{
		LayersContext _localctx = new LayersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layers);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(45);
				match(LAYERS);
				setState(46);
				match(LPAREN);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0))
				{
					{
						{
							setState(47);
							layer();
						}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(RPAREN);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class LayerContext extends ParserRuleContext
	{
		public List<TerminalNode> UNDERSCORE()
		{
			return getTokens(XpgParser.UNDERSCORE);
		}

		public TerminalNode ENDOFLINE()
		{
			return getToken(XpgParser.ENDOFLINE, 0);
		}

		public List<TerminalNode> DIGITS()
		{
			return getTokens(XpgParser.DIGITS);
		}

		public TerminalNode LOWER(int i)
		{
			return getToken(XpgParser.LOWER, i);
		}

		public TerminalNode UNDERSCORE(int i)
		{
			return getToken(XpgParser.UNDERSCORE, i);
		}

		public TerminalNode UPPER(int i)
		{
			return getToken(XpgParser.UPPER, i);
		}

		public TerminalNode DIGITS(int i)
		{
			return getToken(XpgParser.DIGITS, i);
		}

		public List<TerminalNode> LOWER()
		{
			return getTokens(XpgParser.LOWER);
		}

		public List<TerminalNode> UPPER()
		{
			return getTokens(XpgParser.UPPER);
		}

		public LayerContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_layer;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterLayer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitLayer(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitLayer(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LayerContext layer() throws RecognitionException
	{
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layer);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)))
				{
					_errHandler.recoverInline(this);
				}
				consume();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0))
				{
					{
						{
							setState(56);
							_la = _input.LA(1);
							if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)))
							{
								_errHandler.recoverInline(this);
							}
							consume();
						}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(ENDOFLINE);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionsContext extends ParserRuleContext
	{
		public ProductionContext production(int i)
		{
			return getRuleContext(ProductionContext.class, i);
		}

		public List<ProductionContext> production()
		{
			return getRuleContexts(ProductionContext.class);
		}

		public ProductionsContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_productions;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterProductions(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitProductions(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitProductions(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProductionsContext productions() throws RecognitionException
	{
		ProductionsContext _localctx = new ProductionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_productions);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do
				{
					{
						{
							setState(64);
							production();
						}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while (_la == LOWER);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionContext extends ParserRuleContext
	{
		public TerminalNode ENDOFLINE()
		{
			return getToken(XpgParser.ENDOFLINE, 0);
		}

		public TerminalNode ARROW()
		{
			return getToken(XpgParser.ARROW, 0);
		}

		public LinearRepresentationContext linearRepresentation()
		{
			return getRuleContext(LinearRepresentationContext.class, 0);
		}

		public NonterminalContext nonterminal()
		{
			return getRuleContext(NonterminalContext.class, 0);
		}

		public ProductionContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_production;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterProduction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitProduction(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitProduction(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ProductionContext production() throws RecognitionException
	{
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_production);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(69);
				nonterminal();
				setState(70);
				match(ARROW);
				setState(71);
				linearRepresentation();
				setState(72);
				match(ENDOFLINE);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class LinearRepresentationContext extends ParserRuleContext
	{
		public TerminalContext terminal()
		{
			return getRuleContext(TerminalContext.class, 0);
		}

		public TriplesContext triples()
		{
			return getRuleContext(TriplesContext.class, 0);
		}

		public SemanticrulesContext semanticrules()
		{
			return getRuleContext(SemanticrulesContext.class, 0);
		}

		public RulesContext rules()
		{
			return getRuleContext(RulesContext.class, 0);
		}

		public RelationsContext relations(int i)
		{
			return getRuleContext(RelationsContext.class, i);
		}

		public List<RelationsContext> relations()
		{
			return getRuleContexts(RelationsContext.class);
		}

		public NonterminalContext nonterminal()
		{
			return getRuleContext(NonterminalContext.class, 0);
		}

		public LinearRepresentationContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_linearRepresentation;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterLinearRepresentation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitLinearRepresentation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitLinearRepresentation(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LinearRepresentationContext linearRepresentation() throws RecognitionException
	{
		LinearRepresentationContext _localctx = new LinearRepresentationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_linearRepresentation);
		int _la;
		try
		{
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(76);
				switch (_input.LA(1))
				{
				case LOWER:
				{
					setState(74);
					nonterminal();
				}
					break;
				case UPPER:
				{
					setState(75);
					terminal();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				while (_alt != 1 && _alt != -1)
				{
					if (_alt == 1 + 1)
					{
						{
							{
								setState(78);
								relations();
							}
						}
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				}
				setState(85);
				_la = _input.LA(1);
				if (_la == DELTA)
				{
					{
						setState(84);
						rules();
					}
				}

				setState(88);
				_la = _input.LA(1);
				if (_la == GAMMA)
				{
					{
						setState(87);
						triples();
					}
				}

				setState(91);
				_la = _input.LA(1);
				if (_la == SEMANTICRULE)
				{
					{
						setState(90);
						semanticrules();
					}
				}

			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class RelationsContext extends ParserRuleContext
	{
		public TerminalContext terminal()
		{
			return getRuleContext(TerminalContext.class, 0);
		}

		public RelationContext relation()
		{
			return getRuleContext(RelationContext.class, 0);
		}

		public NonterminalContext nonterminal()
		{
			return getRuleContext(NonterminalContext.class, 0);
		}

		public RelationsContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_relations;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterRelations(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitRelations(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitRelations(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException
	{
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relations);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(93);
					relation();
					setState(96);
					switch (_input.LA(1))
					{
					case LOWER:
					{
						setState(94);
						nonterminal();
					}
						break;
					case UPPER:
					{
						setState(95);
						terminal();
					}
						break;
					default:
						throw new NoViableAltException(this);
					}
				}
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext
	{
		public TerminalNode DELTA()
		{
			return getToken(XpgParser.DELTA, 0);
		}

		public TerminalNode RPAREN()
		{
			return getToken(XpgParser.RPAREN, 0);
		}

		public MyruleContext myrule(int i)
		{
			return getRuleContext(MyruleContext.class, i);
		}

		public List<MyruleContext> myrule()
		{
			return getRuleContexts(MyruleContext.class);
		}

		public TerminalNode LPAREN()
		{
			return getToken(XpgParser.LPAREN, 0);
		}

		public RulesContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_rules;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterRules(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitRules(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitRules(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException
	{
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rules);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(98);
				match(DELTA);
				setState(99);
				match(LPAREN);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do
				{
					{
						{
							setState(100);
							myrule();
						}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while (_la == STRING);
				setState(105);
				match(RPAREN);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class TriplesContext extends ParserRuleContext
	{
		public TerminalNode GAMMA()
		{
			return getToken(XpgParser.GAMMA, 0);
		}

		public TerminalNode RGPAREN()
		{
			return getToken(XpgParser.RGPAREN, 0);
		}

		public TerminalNode LGPAREN()
		{
			return getToken(XpgParser.LGPAREN, 0);
		}

		public List<TripleContext> triple()
		{
			return getRuleContexts(TripleContext.class);
		}

		public TripleContext triple(int i)
		{
			return getRuleContext(TripleContext.class, i);
		}

		public TriplesContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_triples;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterTriples(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitTriples(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitTriples(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException
	{
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_triples);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(107);
				match(GAMMA);
				setState(108);
				match(LGPAREN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do
				{
					{
						{
							setState(109);
							triple();
						}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while (_la == LPAREN);
				setState(114);
				match(RGPAREN);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticrulesContext extends ParserRuleContext
	{
		public TerminalNode RGPAREN()
		{
			return getToken(XpgParser.RGPAREN, 0);
		}

		public TerminalNode LGPAREN()
		{
			return getToken(XpgParser.LGPAREN, 0);
		}

		public TerminalNode SEMANTICRULE()
		{
			return getToken(XpgParser.SEMANTICRULE, 0);
		}

		public SemanticruleContext semanticrule()
		{
			return getRuleContext(SemanticruleContext.class, 0);
		}

		public SemanticrulesContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_semanticrules;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterSemanticrules(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitSemanticrules(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitSemanticrules(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SemanticrulesContext semanticrules() throws RecognitionException
	{
		SemanticrulesContext _localctx = new SemanticrulesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_semanticrules);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				match(SEMANTICRULE);
				setState(117);
				match(LGPAREN);
				setState(118);
				semanticrule();
				setState(119);
				match(RGPAREN);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext
	{
		public DriverContext driver()
		{
			return getRuleContext(DriverContext.class, 0);
		}

		public TerminalNode LT()
		{
			return getToken(XpgParser.LT, 0);
		}

		public TerminalNode COMMA()
		{
			return getToken(XpgParser.COMMA, 0);
		}

		public TesterContext tester()
		{
			return getRuleContext(TesterContext.class, 0);
		}

		public TerminalNode GT()
		{
			return getToken(XpgParser.GT, 0);
		}

		public RelationContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_relation;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterRelation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitRelation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitRelation(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException
	{
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relation);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(121);
				match(LT);
				setState(122);
				driver();
				setState(124);
				_la = _input.LA(1);
				if (_la == COMMA)
				{
					{
						setState(123);
						match(COMMA);
					}
				}

				setState(127);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0))
				{
					{
						setState(126);
						tester();
					}
				}

				setState(129);
				match(GT);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class TripleContext extends ParserRuleContext
	{
		public TerminalContext terminal()
		{
			return getRuleContext(TerminalContext.class, 0);
		}

		public ConditionContext condition()
		{
			return getRuleContext(ConditionContext.class, 0);
		}

		public List<TerminalNode> SEMICOLON()
		{
			return getTokens(XpgParser.SEMICOLON);
		}

		public TerminalNode SEMICOLON(int i)
		{
			return getToken(XpgParser.SEMICOLON, i);
		}

		public TerminalNode RPAREN()
		{
			return getToken(XpgParser.RPAREN, 0);
		}

		public MyruleContext myrule(int i)
		{
			return getRuleContext(MyruleContext.class, i);
		}

		public List<MyruleContext> myrule()
		{
			return getRuleContexts(MyruleContext.class);
		}

		public TerminalNode LPAREN()
		{
			return getToken(XpgParser.LPAREN, 0);
		}

		public TripleContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_triple;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterTriple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitTriple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitTriple(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TripleContext triple() throws RecognitionException
	{
		TripleContext _localctx = new TripleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_triple);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(131);
				match(LPAREN);
				setState(132);
				terminal();
				setState(133);
				match(SEMICOLON);
				setState(134);
				condition();
				setState(135);
				match(SEMICOLON);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do
				{
					{
						{
							setState(136);
							myrule();
						}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while (_la == STRING);
				setState(141);
				match(RPAREN);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext
	{
		public TerminalNode TRUE()
		{
			return getToken(XpgParser.TRUE, 0);
		}

		public TerminalNode STRING()
		{
			return getToken(XpgParser.STRING, 0);
		}

		public TerminalNode FALSE()
		{
			return getToken(XpgParser.FALSE, 0);
		}

		public ConditionContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_condition;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitCondition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitCondition(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException
	{
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(143);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << STRING))) != 0)))
				{
					_errHandler.recoverInline(this);
				}
				consume();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class DriverContext extends ParserRuleContext
	{
		public IdrelationContext idrelation()
		{
			return getRuleContext(IdrelationContext.class, 0);
		}

		public DriverContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_driver;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterDriver(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitDriver(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitDriver(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final DriverContext driver() throws RecognitionException
	{
		DriverContext _localctx = new DriverContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_driver);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				idrelation();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class TesterContext extends ParserRuleContext
	{
		public IdrelationContext idrelation()
		{
			return getRuleContext(IdrelationContext.class, 0);
		}

		public TesterContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_tester;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterTester(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitTester(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitTester(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TesterContext tester() throws RecognitionException
	{
		TesterContext _localctx = new TesterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tester);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(147);
				idrelation();
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class MyruleContext extends ParserRuleContext
	{
		public TerminalNode COMMA()
		{
			return getToken(XpgParser.COMMA, 0);
		}

		public TerminalNode STRING()
		{
			return getToken(XpgParser.STRING, 0);
		}

		public MyruleContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_myrule;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterMyrule(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitMyrule(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitMyrule(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final MyruleContext myrule() throws RecognitionException
	{
		MyruleContext _localctx = new MyruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_myrule);
		int _la;
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(149);
				match(STRING);
				setState(151);
				_la = _input.LA(1);
				if (_la == COMMA)
				{
					{
						setState(150);
						match(COMMA);
					}
				}

			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class IdrelContext extends ParserRuleContext
	{
		public TerminalNode STRING()
		{
			return getToken(XpgParser.STRING, 0);
		}

		public IdrelContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_idrel;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterIdrel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitIdrel(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitIdrel(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IdrelContext idrel() throws RecognitionException
	{
		IdrelContext _localctx = new IdrelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idrel);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(153);
				match(STRING);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticruleContext extends ParserRuleContext
	{
		public TerminalNode STRING()
		{
			return getToken(XpgParser.STRING, 0);
		}

		public SemanticruleContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_semanticrule;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterSemanticrule(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitSemanticrule(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitSemanticrule(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SemanticruleContext semanticrule() throws RecognitionException
	{
		SemanticruleContext _localctx = new SemanticruleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_semanticrule);
		try
		{
			enterOuterAlt(_localctx, 1);
			{
				setState(155);
				match(STRING);
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class IdrelationContext extends ParserRuleContext
	{
		public List<TerminalNode> UNDERSCORE()
		{
			return getTokens(XpgParser.UNDERSCORE);
		}

		public List<TerminalNode> DIGITS()
		{
			return getTokens(XpgParser.DIGITS);
		}

		public TerminalNode LOWER(int i)
		{
			return getToken(XpgParser.LOWER, i);
		}

		public TerminalNode UNDERSCORE(int i)
		{
			return getToken(XpgParser.UNDERSCORE, i);
		}

		public TerminalNode UPPER(int i)
		{
			return getToken(XpgParser.UPPER, i);
		}

		public TerminalNode DIGITS(int i)
		{
			return getToken(XpgParser.DIGITS, i);
		}

		public List<TerminalNode> LOWER()
		{
			return getTokens(XpgParser.LOWER);
		}

		public List<TerminalNode> UPPER()
		{
			return getTokens(XpgParser.UPPER);
		}

		public IdrelationContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_idrelation;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterIdrelation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitIdrelation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitIdrelation(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final IdrelationContext idrelation() throws RecognitionException
	{
		IdrelationContext _localctx = new IdrelationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_idrelation);
		int _la;
		try
		{
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(157);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)))
				{
					_errHandler.recoverInline(this);
				}
				consume();
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				while (_alt != 2 && _alt != -1)
				{
					if (_alt == 1)
					{
						{
							{
								setState(158);
								_la = _input.LA(1);
								if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)))
								{
									_errHandler.recoverInline(this);
								}
								consume();
							}
						}
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				}
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class NonterminalContext extends ParserRuleContext
	{
		public List<TerminalNode> UNDERSCORE()
		{
			return getTokens(XpgParser.UNDERSCORE);
		}

		public TerminalNode APICE(int i)
		{
			return getToken(XpgParser.APICE, i);
		}

		public List<TerminalNode> DIGITS()
		{
			return getTokens(XpgParser.DIGITS);
		}

		public TerminalNode LOWER(int i)
		{
			return getToken(XpgParser.LOWER, i);
		}

		public TerminalNode UNDERSCORE(int i)
		{
			return getToken(XpgParser.UNDERSCORE, i);
		}

		public TerminalNode UPPER(int i)
		{
			return getToken(XpgParser.UPPER, i);
		}

		public TerminalNode DIGITS(int i)
		{
			return getToken(XpgParser.DIGITS, i);
		}

		public List<TerminalNode> APICE()
		{
			return getTokens(XpgParser.APICE);
		}

		public List<TerminalNode> LOWER()
		{
			return getTokens(XpgParser.LOWER);
		}

		public List<TerminalNode> UPPER()
		{
			return getTokens(XpgParser.UPPER);
		}

		public NonterminalContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_nonterminal;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterNonterminal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitNonterminal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitNonterminal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final NonterminalContext nonterminal() throws RecognitionException
	{
		NonterminalContext _localctx = new NonterminalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nonterminal);
		int _la;
		try
		{
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(164);
				match(LOWER);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0))
				{
					{
						{
							setState(165);
							_la = _input.LA(1);
							if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << UPPER) | (1L << LOWER) | (1L << DIGITS))) != 0)))
							{
								_errHandler.recoverInline(this);
							}
							consume();
						}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				while (_alt != 1 && _alt != -1)
				{
					if (_alt == 1 + 1)
					{
						{
							{
								setState(171);
								match(APICE);
							}
						}
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				}
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext
	{
		public TerminalNode APICE(int i)
		{
			return getToken(XpgParser.APICE, i);
		}

		public TerminalNode UPPER(int i)
		{
			return getToken(XpgParser.UPPER, i);
		}

		public List<TerminalNode> APICE()
		{
			return getTokens(XpgParser.APICE);
		}

		public List<TerminalNode> UPPER()
		{
			return getTokens(XpgParser.UPPER);
		}

		public TerminalContext(ParserRuleContext parent, int invokingState)
		{
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex()
		{
			return RULE_terminal;
		}

		@Override
		public void enterRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).enterTerminal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener)
		{
			if (listener instanceof XpgListener) ((XpgListener) listener).exitTerminal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor)
		{
			if (visitor instanceof XpgVisitor)
				return ((XpgVisitor<? extends T>) visitor).visitTerminal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException
	{
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_terminal);
		int _la;
		try
		{
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(177);
				match(UPPER);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == UPPER)
				{
					{
						{
							setState(178);
							match(UPPER);
						}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				while (_alt != 1 && _alt != -1)
				{
					if (_alt == 1 + 1)
					{
						{
							{
								setState(184);
								match(APICE);
							}
						}
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				}
			}
		}
		catch (RecognitionException re)
		{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally
		{
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\32\u00c1\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\7\3\63"
			+ "\n\3\f\3\16\3\66\13\3\3\3\3\3\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4"
			+ "\3\5\6\5D\n\5\r\5\16\5E\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7O\n\7\3\7\7\7R"
			+ "\n\7\f\7\16\7U\13\7\3\7\5\7X\n\7\3\7\5\7[\n\7\3\7\5\7^\n\7\3\b\3\b\3\b"
			+ "\5\bc\n\b\3\t\3\t\3\t\6\th\n\t\r\t\16\ti\3\t\3\t\3\n\3\n\3\n\6\nq\n\n"
			+ "\r\n\16\nr\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\177\n\f\3"
			+ "\f\5\f\u0082\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u008c\n\r\r\r\16"
			+ "\r\u008d\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u009a\n"
			+ "\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24\u00a2\n\24\f\24\16\24\u00a5\13"
			+ "\24\3\25\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac\13\25\3\25\7\25\u00af\n"
			+ "\25\f\25\16\25\u00b2\13\25\3\26\3\26\7\26\u00b6\n\26\f\26\16\26\u00b9"
			+ "\13\26\3\26\7\26\u00bc\n\26\f\26\16\26\u00bf\13\26\3\26\5S\u00b0\u00bd"
			+ "\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\25\27\3\2\24"
			+ "\27\4\2\7\b\31\31\u00bf\2,\3\2\2\2\4/\3\2\2\2\69\3\2\2\2\bC\3\2\2\2\n"
			+ "G\3\2\2\2\fN\3\2\2\2\16_\3\2\2\2\20d\3\2\2\2\22m\3\2\2\2\24v\3\2\2\2\26"
			+ "{\3\2\2\2\30\u0085\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u0095"
			+ "\3\2\2\2 \u0097\3\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u009f\3\2\2\2"
			+ "(\u00a6\3\2\2\2*\u00b3\3\2\2\2,-\5\4\3\2-.\5\b\5\2.\3\3\2\2\2/\60\7\6"
			+ "\2\2\60\64\7\f\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2"
			+ "\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\r\2\28\5\3\2\2\2"
			+ "9=\t\2\2\2:<\t\3\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"
			+ "?=\3\2\2\2@A\7\30\2\2A\7\3\2\2\2BD\5\n\6\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2"
			+ "\2EF\3\2\2\2F\t\3\2\2\2GH\5(\25\2HI\7\t\2\2IJ\5\f\7\2JK\7\30\2\2K\13\3"
			+ "\2\2\2LO\5(\25\2MO\5*\26\2NL\3\2\2\2NM\3\2\2\2OS\3\2\2\2PR\5\16\b\2QP"
			+ "\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\5\20\t\2"
			+ "WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\22\n\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2"
			+ "\2\\^\5\24\13\2]\\\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_b\5\26\f\2`c\5(\25\2a"
			+ "c\5*\26\2b`\3\2\2\2ba\3\2\2\2c\17\3\2\2\2de\7\3\2\2eg\7\f\2\2fh\5 \21"
			+ "\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\r\2\2l\21\3\2"
			+ "\2\2mn\7\4\2\2np\7\16\2\2oq\5\30\r\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3"
			+ "\2\2\2st\3\2\2\2tu\7\17\2\2u\23\3\2\2\2vw\7\5\2\2wx\7\16\2\2xy\5$\23\2"
			+ "yz\7\17\2\2z\25\3\2\2\2{|\7\n\2\2|~\5\34\17\2}\177\7\21\2\2~}\3\2\2\2"
			+ "~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082\5\36\20\2\u0081\u0080\3\2"
			+ "\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\13\2\2\u0084"
			+ "\27\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\5*\26\2\u0087\u0088\7\20\2"
			+ "\2\u0088\u0089\5\32\16\2\u0089\u008b\7\20\2\2\u008a\u008c\5 \21\2\u008b"
			+ "\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"
			+ "\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\r\2\2\u0090\31\3\2\2\2\u0091\u0092"
			+ "\t\4\2\2\u0092\33\3\2\2\2\u0093\u0094\5&\24\2\u0094\35\3\2\2\2\u0095\u0096"
			+ "\5&\24\2\u0096\37\3\2\2\2\u0097\u0099\7\31\2\2\u0098\u009a\7\21\2\2\u0099"
			+ "\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a!\3\2\2\2\u009b\u009c\7\31\2\2"
			+ "\u009c#\3\2\2\2\u009d\u009e\7\31\2\2\u009e%\3\2\2\2\u009f\u00a3\t\2\2"
			+ "\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"
			+ "\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\'\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"
			+ "\u00aa\7\26\2\2\u00a7\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3"
			+ "\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b0\3\2\2\2\u00ac"
			+ "\u00aa\3\2\2\2\u00ad\u00af\7\23\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3"
			+ "\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1)\3\2\2\2\u00b2\u00b0"
			+ "\3\2\2\2\u00b3\u00b7\7\25\2\2\u00b4\u00b6\7\25\2\2\u00b5\u00b4\3\2\2\2"
			+ "\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bd"
			+ "\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7\23\2\2\u00bb\u00ba\3\2\2\2"
			+ "\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be+\3"
			+ "\2\2\2\u00bf\u00bd\3\2\2\2\26\64=ENSWZ]bir~\u0081\u008d\u0099\u00a3\u00aa" + "\u00b0\u00b7\u00bd";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
	static
	{
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
		{
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}