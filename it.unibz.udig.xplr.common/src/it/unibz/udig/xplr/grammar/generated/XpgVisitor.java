package it.unibz.udig.xplr.grammar.generated;

// Generated from /Users/sara/Dropbox/tesi/tex/08-codice/Xpg.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XpgParser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface XpgVisitor<T> extends ParseTreeVisitor<T>
{
	/**
	 * Visit a parse tree produced by {@link XpgParser#semanticrules}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSemanticrules(@NotNull XpgParser.SemanticrulesContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#triples}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTriples(@NotNull XpgParser.TriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#production}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProduction(@NotNull XpgParser.ProductionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#semanticrule}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSemanticrule(@NotNull XpgParser.SemanticruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#tester}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTester(@NotNull XpgParser.TesterContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#idrel}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdrel(@NotNull XpgParser.IdrelContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#layername}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLayername(@NotNull XpgParser.LayernameContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#rules}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRules(@NotNull XpgParser.RulesContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#terminal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(@NotNull XpgParser.TerminalContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#xpgfile}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitXpgfile(@NotNull XpgParser.XpgfileContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#layer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLayer(@NotNull XpgParser.LayerContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#linearRepresentation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLinearRepresentation(@NotNull XpgParser.LinearRepresentationContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#relation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull XpgParser.RelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#condition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull XpgParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#triple}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTriple(@NotNull XpgParser.TripleContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#driver}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDriver(@NotNull XpgParser.DriverContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#nonterminal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNonterminal(@NotNull XpgParser.NonterminalContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#myrule}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMyrule(@NotNull XpgParser.MyruleContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#layers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLayers(@NotNull XpgParser.LayersContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#idrelation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdrelation(@NotNull XpgParser.IdrelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#productions}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProductions(@NotNull XpgParser.ProductionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpgParser#relations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRelations(@NotNull XpgParser.RelationsContext ctx);
}