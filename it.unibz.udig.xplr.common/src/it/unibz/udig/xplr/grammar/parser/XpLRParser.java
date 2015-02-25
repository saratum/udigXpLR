package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.table.XpgActionContent;
import it.unibz.udig.xplr.grammar.entities.table.XpgActionEntry;
import it.unibz.udig.xplr.grammar.entities.table.XpgGotoEntry;
import it.unibz.udig.xplr.grammar.entities.table.XpgNextEntry;
import it.unibz.udig.xplr.grammar.entities.table.XpgParsingTableRow;
import it.unibz.udig.xplr.grammar.entities.table.XpgParsingTableState;
import it.unibz.udig.xplr.grammar.entities.table.XpgActionContent.Value;
import it.unibz.udig.xplr.grammar.entities.Attribute;
import it.unibz.udig.xplr.grammar.entities.Dictionary;
import it.unibz.udig.xplr.grammar.entities.DictionaryEntry;
import it.unibz.udig.xplr.grammar.entities.ResultObject;
import it.unibz.udig.xplr.grammar.entities.XpgDelta;
import it.unibz.udig.xplr.grammar.entities.XpgElem;
import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgNonTerminal;
import it.unibz.udig.xplr.grammar.entities.XpgTerminal;
import it.unibz.udig.xplr.grammar.exceptions.SyntaxErrorException;
import it.unibz.udig.xplr.grammar.exceptions.UnparsedInputException;
import it.unibz.udig.xplr.grammar.generated.XpgLexer;
import it.unibz.udig.xplr.grammar.generated.XpgParser;
import it.unibz.udig.xplr.grammar.generated.XpgParser.NonterminalContext;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class XpLRParser
{

	private Dictionary						dict;
	private ArrayList< XpgParsingTableRow >	parsingtable;
	private CopyOnWriteArrayList< Object >	theStack;
	private ArrayList< ResultObject >		result;
	private XpgLoader						loader;

	public XpLRParser( String inputfile) throws IOException
	{

		result = new ArrayList<>( );
		result.add( new ResultObject( "Starting...", 0 ) );

		// the stack
		theStack = new CopyOnWriteArrayList<>( );
		theStack.add( 0 ); // state 0 della parsing table

		// the grammar
		InputStream is = new FileInputStream( inputfile );
		ANTLRInputStream input = new ANTLRInputStream( is );
		XpgLexer lexer = new XpgLexer( input );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		XpgParser parser = new XpgParser( tokens );
		parser.setBuildParseTree( true );
		ParseTree tree = parser.xpgfile( ); // start
		ParseTreeWalker walker = new ParseTreeWalker( );

		loader = new XpgLoader( );
		try
		{
			walker.walk( loader, tree ); // walk parse tree
			result.add( new ResultObject( "walked the tree - loader ready", ResultObject.LEVEL_INFO ) );
		}
		catch ( Exception ex )
		{
			ex.printStackTrace( );
			result.add( new ResultObject( "walked the tree - error ".concat( ex.getMessage( ) ), ResultObject.LEVEL_ERROR ) );
			return;
		}

		// itemset
		for ( XpgItem item : loader.getAugmentedItems( ) )
		{
			System.out.println( item.toString( ) );
		}

		// the parsing table
		ParsingTableConstructor constructor = new ParsingTableConstructor( loader );
		CopyOnWriteArrayList< CopyOnWriteArrayList< CopyOnWriteArrayList< XpgItem >>> items = ItemConstructor.items( loader, result );
		ItemConstructor.outItems( items );
		setParsingtable( constructor.createTable( items, result ) );
		ParsingTableConstructor.outTable( parsingtable );
	}

	public void theAlg(Dictionary dict)
	{
		int ip = 999;
		if ( completeLexicalAnalisys( dict ) )
		{
			try
			{
				while ( theStack.size( ) > 0 )
				{
					Object s = theStack.get( theStack.size( ) - 1 );
					if ( s instanceof Integer )
					{
						Integer stackTop = ( Integer ) s;
						XpgParsingTableRow row = getParsingtable( ).get( stackTop );

						for ( XpgParsingTableState substate : row.getSubstates( ) )
						{
							XpgNextEntry next = substate.getNextEntry( );
							if ( next == null )
							{
								getResult( ).add( new ResultObject( "ERROR", ResultObject.LEVEL_ERROR ) );
								return;
							}
							else if ( next.isEmpty( ) )
							{
								XpgElem b = ( XpgElem ) theStack.get( theStack.size( ) - 2 );
								ArrayList< HashMap< XpgElem, XpgActionEntry >> aEntries = substate.getActionEntry( );
								for ( HashMap< XpgElem, XpgActionEntry > action : aEntries )
								{
									if ( action.containsKey( b ) )
									{
										int m = 0;
										XpgItem itemTop = getLoader( ).getAugmentedItems( ).get( stackTop - 1 );
										getResult( ).add( new ResultObject( "REDUCE ".concat( itemTop.toString( ) ), ResultObject.LEVEL_INFO ) );

										// calculate the syntactic attribute of A as specified by delta
										itemTop.getDeltaRules( );
										// apply the gamma rule
										itemTop.getTriples( );

										// pop 2*m out of the stack
										for ( Object objR : itemTop.getRightelem( ) )
										{
											if ( objR instanceof XpgElem )
												m ++ ;
										}
										int toIndex = theStack.size( );
										int fromIndex = theStack.size( ) - ( 2 * m );

										List< Object > saveList = theStack.subList( fromIndex, toIndex );
										theStack.removeAll( saveList );

										int s2 = ( int ) theStack.get( theStack.size( ) - 1 );
										XpgParsingTableRow r2 = getParsingtable( ).get( s2 );
										for ( XpgParsingTableState sr2 : r2.getSubstates( ) )
										{
											for ( HashMap< XpgElem, XpgGotoEntry > gotoEntry : sr2.getGotoEntry( ) )
											{
												if ( gotoEntry.containsKey( itemTop.getLeftelem( ) ) )
												{
													theStack.add( itemTop.getLeftelem( ) );
													theStack.add( gotoEntry.get( itemTop.getLeftelem( ) ).getState( ) );

													break;
												}
											}
										}

									}
								}
							}
							else
							{
								ip = fetchVSymbol( substate );
								if ( ip != 999 )
								{
									if ( ip == - 1 )
									{
										getResult( ).add( new ResultObject( "SUCCESS", ResultObject.LEVEL_INFO ) );
										return;
									}
									else
									{
										DictionaryEntry b = getDictionary( ).getEntries( ).get( ip );

										for ( HashMap< XpgElem, XpgActionEntry > action : substate.getActionEntry( ) )
										{
											XpgActionEntry ae = action.get( b.getTerminalName( ) );
											if ( ae != null )
											{
												for ( XpgActionContent ac : ae.getContent( ) )
												{

													switch ( ac.getOperation( ) )
													{
														case ACCEPT:
															getResult( ).add( new ResultObject( "SUCCESS", ResultObject.LEVEL_INFO ) );
															return;
														case ERROR:
															getResult( ).add( new ResultObject( "ERROR", ResultObject.LEVEL_ERROR ) );
															return;
														case REDUCE:
															getResult( ).add( new ResultObject( "REDUCE", ResultObject.LEVEL_WARNING ) );
															return;
														case SHIFT:
															getResult( ).add( new ResultObject( "Shift action: ".concat( action.toString( ) ), ResultObject.LEVEL_INFO ) );
															XpgElem tester = ac.getRelTester( );

															if ( tester.getContent( ) == null || tester.getContent( ).equals( "T" ) )
															{
																theStack.add( b.getTerminalName( ) );
																theStack.add( ac.getState( ) );
															}
															else if ( test( null ) )
															{
																System.out.println( "WRONG OPINION OF ME" );
																//	theStack.add( next.getX( ) );
																//	theStack.add( action.getState( ) );
																// TODO verificare se i miei tester sono sempre T o se va implementata anche questa parte
															}
															else
															{
																throw new SyntaxErrorException( "if ( tester.getContent( ) == null || tester.getContent( ).equals( \"T\" ) )" );
															}

															break;
														default:
															throw new SyntaxErrorException( "switch ( action.getOperation( ) )" );
													}

												}

											}
										}
									}

								}
								else
									throw new SyntaxErrorException( " 999" );
							}
						}
					}
				}
			}
			catch ( SyntaxErrorException | UnparsedInputException e )
			{
				getResult( ).add( new ResultObject( e.getClass( ).getName( ).concat( ( e.getMessage( ) == null ) ? "" : e.getMessage( ) ), ResultObject.LEVEL_ERROR ) );
			}
			catch ( NullPointerException e )
			{
				e.printStackTrace( );
			}
		}
	}

	private boolean completeLexicalAnalisys(Dictionary d)
	{
		if ( d != null )
		{
			setDictionary( d );
			getResult( ).add( new ResultObject( "\n", ResultObject.LEVEL_NONE ) );
			result.add( new ResultObject( "Dictionary ready, here the entries:", ResultObject.LEVEL_INFO ) );

			for ( DictionaryEntry e : getDictionary( ).getEntries( ) )
			{
				if ( e.getAttributes( ) != null )
				{
					for ( Attribute attr : e.getAttributes( ) )
					{
						if ( attr.getName( ).equalsIgnoreCase( "layer" ) )
						{
							String t = getLoader( ).getLayersMapping( ).get( attr.getValue( ) );
							e.setTerminalName( new XpgTerminal( t ) );
							break;
						}
					}
				}

				result.add( new ResultObject( e.toString( ), ResultObject.LEVEL_INFO ) );

				if ( e.getAttributes( ) != null )
					for ( Attribute attr : e.getAttributes( ) )
					{
						result.add( new ResultObject( attr.toString( ), ResultObject.LEVEL_INFO ) );
					}
			}
		}
		else
		{
			getResult( ).add( new ResultObject( "\n", ResultObject.LEVEL_NONE ) );
			result.add( new ResultObject( "Dictionary is null, can't go any further", ResultObject.LEVEL_ERROR ) );
			return false;
		}

		return true;

	}

	private int fetchVSymbol(XpgParsingTableState s) throws UnparsedInputException, SyntaxErrorException
	{
		XpgNextEntry next = s.getNextEntry( );

		if ( next.getDriverRelation( ) == null )
		{
			return 999;
		}
		else if ( next.getDriverRelation( ).toString( ).equalsIgnoreCase( "start" ) )
		{
			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if ( ! entry.getName( ).equals( "EOI" ) && ! entry.isVisited( ) )
					if ( entry.getTerminalName( ) != null )
						for ( HashMap< XpgElem, XpgActionEntry > e : s.getActionEntry( ) )
							if ( e.get( entry.getTerminalName( ) ) != null )
								return getDictionary( ).getEntries( ).indexOf( entry );
			}
		}
		else if ( next.getDriverRelation( ).toString( ).equalsIgnoreCase( "end" ) )
		{
			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if ( ! entry.getName( ).equals( "EOI" ) && ! entry.isVisited( ) )
					throw new UnparsedInputException( );

				return - 1;
			}
		}
		else
		{
			int ip = 999;
			toBreak: for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if (  ! entry.isVisited( ) )
					if ( entry.getTerminalName( ) != null )
						for ( HashMap< XpgElem, XpgActionEntry > e : s.getActionEntry( ) )
							if ( e.get( entry.getTerminalName( ) ) != null )
							{
								ip = getDictionary( ).getEntries( ).indexOf( entry );
								break toBreak;
							}
			}

			getDictionary( ).getEntries( ).get( ip ).setVisited( true );
			return ip;

			//			int manyTimes = 0;
			//			// for i = 1 to n
			//			XpgElem z = ( XpgElem ) theStack.get( theStack.size( ) - 2 );
			//			int next_set = - 1;
			//
			//			XpgElem h_k = next.getDriverRelation( );
			//			XpgElem x = next.getX( );
			//
			//			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			//			{
			//				if ( ! entry.getName( ).equals( "EOI" ) && ! entry.isVisited( ) )
			//				{
			//					manyTimes ++ ;
			//
			//					next_set = getDictionary( ).getEntries( ).indexOf( entry );
			//				}
			//			}
			//
			//			if ( manyTimes > 1 )
			//				throw new SyntaxErrorException( " runtime conflicy " );
			//			else
			//			{
			//			//	getDictionary( ).getEntries( ).get( next_set ).setVisited( true );
			//				return next_set;
			//			}

		}
		return 999;
	}

	private boolean test(Object o)
	{
		return true;
	}

	public ArrayList< XpgParsingTableRow > getParsingtable()
	{
		return parsingtable;
	}

	public void setParsingtable(ArrayList< XpgParsingTableRow > p)
	{
		this.parsingtable = p;
	}

	public Dictionary getDictionary()
	{
		return dict;
	}

	public void setDictionary(Dictionary dp)
	{
		this.dict = dp;
	}

	public ArrayList< ResultObject > getResult()
	{
		return result;
	}

	public XpgLoader getLoader()
	{
		return loader;
	}

}
