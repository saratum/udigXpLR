package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.XpgActionEntry;
import it.unibz.udig.xplr.grammar.entities.XpgElem;
import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgNextEntry;
import it.unibz.udig.xplr.grammar.entities.XpgParsingTableRow;
import it.unibz.udig.xplr.grammar.entities.XpgParsingTableState;
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
			result.add( new ResultObject( "walked the tree - error ".concat( ex.getMessage( ) ), 1 ) );
			return;
		}

		// the parsing table
		ParsingTableConstructor constructor = new ParsingTableConstructor( loader );
		CopyOnWriteArrayList< CopyOnWriteArrayList< CopyOnWriteArrayList< XpgItem >>> items = ItemConstructor.items( loader, result );

		// ItemConstructor.outItems(items);

		setParsingtable( constructor.createTable( items, result ) );

//	 ParsingTableConstructor.outTable( parsingtable );

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

	private Integer fetchVSymbol(XpgNextEntry next) throws UnparsedInputException
	{
		if ( next.getDriverRelation( ).toString( ).equalsIgnoreCase( "start" ))
		{
//			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
//			{
//
//				if ( ! entry.visited )
//					if ( entry.equals( next.getX( ) ) )
//						return getDictionary( ).getEntries( ).indexOf( entry );
//			}
		}
		else if ( next.getDriverRelation( ).toString( ).equalsIgnoreCase( "EOI" ))
		{
			for ( DictionaryEntry entry : getDictionary( ).getEntries( ) )
			{
				if ( ! entry.isVisited( ) )
				{
					throw new UnparsedInputException( );
				}

				return 0;
			}
		}
		else
			return null;

		

		return null;

	}

	private void test()
	{
	}

	public void theAlg(Dictionary dict)
	{
		if ( dict != null )
		{
			setDictionary( dict );
			result.add( new ResultObject( "Dictionary ready", 0 ) );
		}
		else
		{
			result.add( new ResultObject( "Dictionary is null, can go any further", 1 ) );
			return;
		}

		try
		{
			// repeat forever
			// let s be the state of the stack top

			for ( Object s : theStack )
			{

				if ( s instanceof Integer )
				{
					XpgParsingTableRow row = getParsingtable( ).get( ( Integer ) s );
					for ( XpgParsingTableState substate : row.getSubstates( ) )
					{
						XpgNextEntry next = substate.getNextEntry( );
						Integer fetch = fetchVSymbol( next );
						if ( fetch != null )
						{
							getResult( ).add( new ResultObject( String.valueOf( fetch ), ResultObject.LEVEL_INFO ) );
						}
						else if ( next == null )
						{

						}
						else
							throw new SyntaxErrorException( "Error by parsing substate" );

					}

				}

			}

		}
		catch ( SyntaxErrorException e )
		{
			getResult( ).add( new ResultObject( e.getMessage( ), ResultObject.LEVEL_ERROR ) );
		}
		catch ( UnparsedInputException e )
		{
			getResult( ).add( new ResultObject( e.getMessage( ), ResultObject.LEVEL_ERROR ) );
		}

	}

}
