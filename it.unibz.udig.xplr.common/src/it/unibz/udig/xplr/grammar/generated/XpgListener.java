// Generated from /Users/sara/git/udigXpLR/regole/Xpg.g4 by ANTLR 4.1
package it.unibz.udig.xplr.grammar.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XpgParser}.
 */
public interface XpgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XpgParser#semanticrules}.
	 * @param ctx the parse tree
	 */
	void enterSemanticrules(@NotNull XpgParser.SemanticrulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#semanticrules}.
	 * @param ctx the parse tree
	 */
	void exitSemanticrules(@NotNull XpgParser.SemanticrulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(@NotNull XpgParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(@NotNull XpgParser.TriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(@NotNull XpgParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(@NotNull XpgParser.ProductionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#deltarule}.
	 * @param ctx the parse tree
	 */
	void enterDeltarule(@NotNull XpgParser.DeltaruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#deltarule}.
	 * @param ctx the parse tree
	 */
	void exitDeltarule(@NotNull XpgParser.DeltaruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#semanticrule}.
	 * @param ctx the parse tree
	 */
	void enterSemanticrule(@NotNull XpgParser.SemanticruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#semanticrule}.
	 * @param ctx the parse tree
	 */
	void exitSemanticrule(@NotNull XpgParser.SemanticruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#tester}.
	 * @param ctx the parse tree
	 */
	void enterTester(@NotNull XpgParser.TesterContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#tester}.
	 * @param ctx the parse tree
	 */
	void exitTester(@NotNull XpgParser.TesterContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#idrel}.
	 * @param ctx the parse tree
	 */
	void enterIdrel(@NotNull XpgParser.IdrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#idrel}.
	 * @param ctx the parse tree
	 */
	void exitIdrel(@NotNull XpgParser.IdrelContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#layername}.
	 * @param ctx the parse tree
	 */
	void enterLayername(@NotNull XpgParser.LayernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#layername}.
	 * @param ctx the parse tree
	 */
	void exitLayername(@NotNull XpgParser.LayernameContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(@NotNull XpgParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(@NotNull XpgParser.RulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(@NotNull XpgParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(@NotNull XpgParser.TerminalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#xpgfile}.
	 * @param ctx the parse tree
	 */
	void enterXpgfile(@NotNull XpgParser.XpgfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#xpgfile}.
	 * @param ctx the parse tree
	 */
	void exitXpgfile(@NotNull XpgParser.XpgfileContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(@NotNull XpgParser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(@NotNull XpgParser.LayerContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#something}.
	 * @param ctx the parse tree
	 */
	void enterSomething(@NotNull XpgParser.SomethingContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#something}.
	 * @param ctx the parse tree
	 */
	void exitSomething(@NotNull XpgParser.SomethingContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#linearRepresentation}.
	 * @param ctx the parse tree
	 */
	void enterLinearRepresentation(@NotNull XpgParser.LinearRepresentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#linearRepresentation}.
	 * @param ctx the parse tree
	 */
	void exitLinearRepresentation(@NotNull XpgParser.LinearRepresentationContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull XpgParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull XpgParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull XpgParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull XpgParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#triple}.
	 * @param ctx the parse tree
	 */
	void enterTriple(@NotNull XpgParser.TripleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#triple}.
	 * @param ctx the parse tree
	 */
	void exitTriple(@NotNull XpgParser.TripleContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#driver}.
	 * @param ctx the parse tree
	 */
	void enterDriver(@NotNull XpgParser.DriverContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#driver}.
	 * @param ctx the parse tree
	 */
	void exitDriver(@NotNull XpgParser.DriverContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#nonterminal}.
	 * @param ctx the parse tree
	 */
	void enterNonterminal(@NotNull XpgParser.NonterminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#nonterminal}.
	 * @param ctx the parse tree
	 */
	void exitNonterminal(@NotNull XpgParser.NonterminalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#layers}.
	 * @param ctx the parse tree
	 */
	void enterLayers(@NotNull XpgParser.LayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#layers}.
	 * @param ctx the parse tree
	 */
	void exitLayers(@NotNull XpgParser.LayersContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#idrelation}.
	 * @param ctx the parse tree
	 */
	void enterIdrelation(@NotNull XpgParser.IdrelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#idrelation}.
	 * @param ctx the parse tree
	 */
	void exitIdrelation(@NotNull XpgParser.IdrelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#deltarules}.
	 * @param ctx the parse tree
	 */
	void enterDeltarules(@NotNull XpgParser.DeltarulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#deltarules}.
	 * @param ctx the parse tree
	 */
	void exitDeltarules(@NotNull XpgParser.DeltarulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#productions}.
	 * @param ctx the parse tree
	 */
	void enterProductions(@NotNull XpgParser.ProductionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#productions}.
	 * @param ctx the parse tree
	 */
	void exitProductions(@NotNull XpgParser.ProductionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpgParser#relations}.
	 * @param ctx the parse tree
	 */
	void enterRelations(@NotNull XpgParser.RelationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpgParser#relations}.
	 * @param ctx the parse tree
	 */
	void exitRelations(@NotNull XpgParser.RelationsContext ctx);
}