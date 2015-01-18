package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgNonTerminal;
import it.unibz.udig.xplr.grammar.entities.XpgRelation;
import it.unibz.udig.xplr.grammar.entities.XpgTerminal;
import it.unibz.udig.xplr.grammar.generated.XpgBaseListener;
import it.unibz.udig.xplr.grammar.generated.XpgParser.DeltaruleContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.DeltarulesContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.IdrelationContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.LayerContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.LayernameContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.LayersContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.NonterminalContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.ProductionContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.RelationContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.RelationsContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.RulesContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.SemanticrulesContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.SomethingContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.TerminalContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.TesterContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.TriplesContext;
import it.unibz.udig.xplr.grammar.generated.XpgParser.XpgfileContext;

import java.util.ArrayList;
import java.util.HashMap;

public class XpgLoader extends XpgBaseListener
{

	private ArrayList< XpgItem >		items;
	private ArrayList< XpgItem >		combinedItems;
	private ArrayList< XpgItem >		augmentedItems;
	private ArrayList< String >			layers;
	private HashMap< String, String >	layersMapping;
	private HashMap< String, String >	dbMapping;

	public XpgLoader()
	{
		this.items = new ArrayList< XpgItem >( );
		this.combinedItems = new ArrayList< XpgItem >( );
		this.augmentedItems = new ArrayList< XpgItem >( );
		this.layers = new ArrayList< String >( );
		this.dbMapping = new HashMap< String, String >( );
		this.layersMapping = new HashMap< String, String >( );
	}

	
	public HashMap< String, String > getLayersMapping()
	{
		return layersMapping;
	}
	
	public ArrayList< XpgItem > buildCombinations(XpgItem itemToBeCombined)
	{
		XpgItem combination;
		ArrayList< XpgItem > combinedItems = new ArrayList< XpgItem >( );

		ArrayList< Object > rightelems = itemToBeCombined.getRightelem( );

		for ( int i = 0; i < rightelems.size( ); i ++ )
		{
			Object relem = rightelems.get( i );

			combination = new XpgItem( );
			combination.setDot( i );
			combination.setLeftelem( itemToBeCombined.getLeftelem( ) );
			combination.setRightelem( itemToBeCombined.getRightelem( ) );

			combinedItems.add( combination );

			if ( relem.getClass( ).isAssignableFrom( XpgRelation.class ) )
			{
				i ++ ;
			}
		}

		combination = new XpgItem( );
		combination.setDot( rightelems.size( ) );
		combination.setLeftelem( itemToBeCombined.getLeftelem( ) );
		combination.setRightelem( itemToBeCombined.getRightelem( ) );

		combinedItems.add( combination );

		return combinedItems;
	}

	public ArrayList< XpgItem > getItems()
	{
		return items;
	}

	public void setItems(ArrayList< XpgItem > items)
	{
		this.items = items;
	}

	public ArrayList< XpgItem > getCombinedItems()
	{
		return combinedItems;
	}

	public void setCombinedItems(ArrayList< XpgItem > combinedItems)
	{
		this.combinedItems = combinedItems;
	}

	public ArrayList< XpgItem > getAugmentedItems()
	{
		return augmentedItems;
	}

	public void setAugmentedItems(ArrayList< XpgItem > augmentedItems)
	{
		this.augmentedItems = augmentedItems;
	}

	public ArrayList< String > getLayers()
	{
		return layers;
	}

	public void setLayers(ArrayList< String > layers)
	{
		this.layers = layers;
	}

	public HashMap< String, String > getDbMapping()
	{
		return dbMapping;
	}

	public void setDbMapping(HashMap< String, String > dbMapping)
	{
		this.dbMapping = dbMapping;
	}

	@Override
	public void enterXpgfile(XpgfileContext ctx)
	{
		super.enterXpgfile( ctx );
	}

	@Override
	public void enterProduction(ProductionContext ctx)
	{

		XpgItem item = new XpgItem( );

		// parte sx di ARROW
		item.setLeftelem( buildNonterminal( ctx.nonterminal( ) ) );

		// parte dx della ARROW
		for ( int i = 0; i < ctx.linearRepresentation( ).getChildCount( ); i ++ )
		{
			Object rulectx = ctx.linearRepresentation( ).getChild( i );

			if ( rulectx.getClass( ).isAssignableFrom( TerminalContext.class ) )
			{
				TerminalContext tctx = ( TerminalContext ) rulectx;
				XpgTerminal telem = buildTerminal( tctx );
				item.getRightelem( ).add( telem );
			}
			else if ( rulectx.getClass( ).isAssignableFrom( NonterminalContext.class ) )
			{
				NonterminalContext tctx = ( NonterminalContext ) rulectx;
				XpgNonTerminal nelem = buildNonterminal( tctx );
				item.getRightelem( ).add( nelem );
			}
			else if ( rulectx.getClass( ).isAssignableFrom( RelationsContext.class ) )
			{

				RelationsContext rctx = ( RelationsContext ) rulectx;

				for ( int j = 0; j < rctx.getChildCount( ); j ++ )
				{
					if ( rctx.getChild( j ).getClass( ).isAssignableFrom( RelationContext.class ) )
					{
						RelationContext relctx = ( RelationContext ) rctx.getChild( j );
						item.getRightelem( ).add( buildRelation( relctx ) );
					}
					else if ( rctx.getChild( j ).getClass( ).isAssignableFrom( TerminalContext.class ) )
					{
						TerminalContext tctx = ( TerminalContext ) rctx.getChild( j );
						item.getRightelem( ).add( buildTerminal( tctx ) );
					}
					else if ( rctx.getChild( j ).getClass( ).isAssignableFrom( NonterminalContext.class ) )
					{
						NonterminalContext nctx = ( NonterminalContext ) rctx.getChild( j );
						item.getRightelem( ).add( buildNonterminal( nctx ) );
					}
				}
			}
			else if ( rulectx.getClass( ).isAssignableFrom( RulesContext.class ) )
			{
			}
			else if ( rulectx.getClass( ).isAssignableFrom( TriplesContext.class ) )
			{
			}
			else if ( rulectx.getClass( ).isAssignableFrom( SemanticrulesContext.class ) )
			{
			}
			else if ( rulectx.getClass( ).isAssignableFrom( DeltarulesContext.class ) )
			{
			}
			else
				System.out.println( rulectx.getClass( ).toString( ) );
		}

		items.add( item );

		combinedItems.addAll( buildCombinations( item ) );
	}

	@Override
	public void enterRelations(RelationsContext ctx)
	{
		// relations: (relation (nonterminal | terminal));
		super.enterRelations( ctx );
	}

	@Override
	public void enterRelation(RelationContext ctx)
	{
		// relation: LT LOWER (LOWER|UPPER|UNDERSCORE)* GT;
		ctx.toString( );
	}

	@Override
	public void enterLayers(LayersContext ctx)
	{
		for ( LayerContext layer : ctx.layer( ) )
		{
			layersMapping.put( layer.layername( ).getText( ), layer.something( ).getText( ) );
		}
		//super.enterLayers( ctx );
	}

	//	@Override
	//	public void enterLayername(LayernameContext ctx)
	//	{
	//		StringBuilder sb = new StringBuilder( );
	//		for ( int i = 0; i < ctx.getChildCount( ); i ++ )
	//		{
	//			sb.append( ctx.getChild( i ) );
	//		}
	//
	//		if ( ! layers.contains( sb.toString( ) ) )
	//			layers.add( sb.toString( ) );
	//	}

	//
	//	@Override
	//	public void enterLayer(LayerContext ctx)
	//	{
	//		super.enterLayer(ctx);
	//	}

	@Override
	public void enterSomething(SomethingContext ctx)
	{
		// TODO Auto-generated method stub
		super.enterSomething( ctx );
	}

	@Override
	public void enterDeltarule(DeltaruleContext ctx)
	{
		StringBuilder sb = new StringBuilder( );
		for ( int i = 0; i < ctx.getChildCount( ); i ++ )
		{
			sb.append( ctx.getChild( i ) );
		}

		String[ ] output = sb.toString( ).split( "=" );

		if ( output[ 0 ].equalsIgnoreCase( "layer" ) )
			layers.add( output[ 1 ] );
		else
			dbMapping.put( output[ 0 ], output[ 1 ] );

	}

	private XpgTerminal buildTerminal(TerminalContext ctx)
	{
		StringBuilder sb = new StringBuilder( );
		for ( int i = 0; i < ctx.getChildCount( ); i ++ )
		{
			if ( ! ctx.getChild( i ).equals( "'" ) )
				sb.append( ctx.getChild( i ) );

		}
		return new XpgTerminal( sb.toString( ) );
	}

	private XpgRelation buildRelation(RelationContext ctx)
	{
		XpgRelation rv = new XpgRelation( );

		TesterContext testerContext = ctx.tester( );

		if ( ( testerContext != null ) && ( testerContext.getChildCount( ) > 0 ) )
		{
			StringBuilder sb = new StringBuilder( );
			for ( int i = 0; i < testerContext.getChildCount( ); i ++ )
			{
				StringBuilder content = new StringBuilder( );
				if ( testerContext.getChild( i ).getClass( ).isAssignableFrom( IdrelationContext.class ) )
				{
					IdrelationContext rel = ( IdrelationContext ) testerContext.getChild( i );
					for ( int j = 0; j < rel.getChildCount( ); j ++ )
					{
						content.append( rel.getChild( j ) );

					}
				}
				else
					content.append( ctx.getChild( i ) );

				sb.append( content );

				rv.getTester( ).setContent( sb.toString( ) );

			}
		}

		if ( ctx.driver( ).getChildCount( ) > 0 )
		{
			StringBuilder sb = new StringBuilder( );
			for ( int i = 0; i < ctx.driver( ).getChildCount( ); i ++ )
			{
				StringBuilder content = new StringBuilder( );
				if ( ctx.driver( ).getChild( i ).getClass( ).isAssignableFrom( IdrelationContext.class ) )
				{
					IdrelationContext rel = ( IdrelationContext ) ctx.driver( ).getChild( i );
					for ( int j = 0; j < rel.getChildCount( ); j ++ )
					{
						content.append( rel.getChild( j ) );

					}
				}
				else
					content.append( ctx.getChild( i ) );

				sb.append( content );

				rv.getDriver( ).setContent( sb.toString( ) );

			}
		}

		return rv;
	}

	private XpgNonTerminal buildNonterminal(NonterminalContext ctx)
	{

		StringBuilder sb = new StringBuilder( );
		for ( int i = 0; i < ctx.getChildCount( ); i ++ )
		{
			if ( ! ctx.getChild( i ).toString( ).equals( "'" ) )
				sb.append( ctx.getChild( i ) );

		}
		return new XpgNonTerminal( sb.toString( ) ); // a.concat(b);
	}

	// private String buildGenericContent(ParserRuleContext ctx)
	// {
	// StringBuilder sb = new StringBuilder();
	// for (int i = 0; i < ctx.getChildCount(); i++)
	// {
	// sb.append(ctx.getChild(i));
	//
	// }
	// return sb.toString();
	// }

	// private String getContent(TerminalNode node)
	// {
	// return node.getText();
	// }
	//
	// private StringBuilder getContentList(List<TerminalNode> list)
	// {
	// StringBuilder b = new StringBuilder();
	//
	// for (TerminalNode terminalNode : list)
	// {
	// b.append(terminalNode.getText());
	// }
	//
	// return b;
	// }

}
