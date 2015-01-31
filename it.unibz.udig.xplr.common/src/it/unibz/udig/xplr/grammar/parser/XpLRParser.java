package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.table.XpgActionContent;
import it.unibz.udig.xplr.grammar.entities.table.XpgActionEntry;
import it.unibz.udig.xplr.grammar.entities.table.XpgNextEntry;
import it.unibz.udig.xplr.grammar.entities.table.XpgParsingTableRow;
import it.unibz.udig.xplr.grammar.entities.table.XpgParsingTableState;
import it.unibz.udig.xplr.grammar.entities.table.XpgActionContent.Value;
import it.unibz.udig.xplr.grammar.entities.XpgElem;
import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgTerminal;
import it.unibz.udig.xplr.grammar.exceptions.SyntaxErrorException;
import it.unibz.udig.xplr.grammar.exceptions.UnparsedInputException;
import it.unibz.udig.xplr.grammar.generated.XpgLexer;
import it.unibz.udig.xplr.grammar.generated.XpgParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

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
			result.add( new ResultObject( "walked the tree - loader ready", 0 ) );
		}
		catch ( Exception ex )
		{
			ex.printStackTrace( );
			result.add( new ResultObject( "walked the tree - error ".concat( ex.getMessage( ) ), 1 ) );
			return;
		}

		// the parsing table
		ParsingTableConstructor constructor = new ParsingTableConstructor( loader );
		CopyOnWriteArrayList< CopyOnWriteArrayList< CopyOnWriteArrayList< XpgItem >>> items = ItemConstructor.items( loader, result );

		ItemConstructor.outItems(items);

		for ( String l : loader.getLayers( ) )
		{
			System.out.println( l );
		}
		
		setParsingtable( constructor.createTable( items, result ) );

		//ParsingTableConstructor.outTable( parsingtable );

	}

	public void theAlg(Dictionary dict)
	{
		if ( completeLexicalAnalisys( dict ) )
		{
			try
			{
				while ( theStack.size( ) > 0 )
				{
					Object s = theStack.get( theStack.size( ) - 1 );
					if ( s instanceof Integer )
					{
						XpgParsingTableRow row = getParsingtable( ).get( ( Integer ) s );
						for ( XpgParsingTableState substate : row.getSubstates( ) )
						{
							XpgNextEntry next = substate.getNextEntry( );
							if ( next == null )
							{
								theStack.remove( theStack.size( ) - 1 );
							}
							else
							{
								XpgActionEntry fetch = fetchVSymbol( substate );
								if ( fetch != null )
								{
									ArrayList< XpgActionContent > c = fetch.getContent( );
									for ( XpgActionContent action : c )
									{
										switch ( action.getOperation( ) )
										{
											case ACCEPT:
												getResult( ).add( new ResultObject( "SUCCESS", ResultObject.LEVEL_INFO ) );
												return;
											case ERROR:
												getResult( ).add( new ResultObject( "ERROR", ResultObject.LEVEL_ERROR ) );
												return;
											case REDUCE:
												getResult( ).add( new ResultObject( "ERROR", ResultObject.LEVEL_ERROR ) );
												return;
											case SHIFT:
												getResult( ).add( new ResultObject( action.toString( ), ResultObject.LEVEL_INFO ) );
												XpgElem tester = action.getRelTester( );

												if ( tester.getContent( ) == null || tester.getContent( ).equals( "T" ) )
												{
													theStack.add( next.getX( ) );
													theStack.add( action.getState( ) );
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
								else
									throw new SyntaxErrorException( "Error by parsing substate" );
							}

						}
					}
					else
						getResult( ).add( new ResultObject( "if ( s instanceof Integer )", ResultObject.LEVEL_ERROR ) );
				}
			}
			catch ( SyntaxErrorException | UnparsedInputException | NullPointerException e )
			{
				getResult( ).add( new ResultObject( e.getClass( ).getName( ).concat( e.getMessage( ) ), ResultObject.LEVEL_ERROR ) );
			}
		}
	}

	private boolean completeLexicalAnalisys(Dictionary d)
	{
		if ( d != null )
		{
			setDictionary( d );
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
			result.add( new ResultObject( "Dictionary is null, can't go any further", ResultObject.LEVEL_ERROR ) );
			return false;
		}

		return true;

	}

	private XpgActionEntry fetchVSymbol(XpgParsingTableState next) throws UnparsedInputException
	{

		if ( next.getNextEntry( ).getDriverRelation( ) == null ) // ???????
		{
			return null;
		}
		else if ( next.getNextEntry( ).getDriverRelation( ).toString( ).equalsIgnoreCase( "start" ) )
		{
			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if ( ! entry.isVisited( ) )
					if ( entry.getTerminalName( ) != null )
						for ( HashMap< XpgElem, XpgActionEntry > e : next.getActionEntry( ) )
							if ( e.get( entry.getTerminalName( ) ) != null )
								return e.get( entry.getTerminalName( ) ); //getDictionary( ).getEntries( ).indexOf( entry );
			}
		}
		else if ( next.getNextEntry( ).getDriverRelation( ).toString( ).equalsIgnoreCase( "EOI" ) )
		{
			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if ( ! entry.isVisited( ) )
				{
					throw new UnparsedInputException( );
				}

				return null;
			}
		}
		else
		{
			System.out.println( next.toString( ) );
			return new XpgActionEntry( );
		}

		return null;

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
