package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.XpgActionEntry;
import it.unibz.udig.xplr.grammar.entities.XpgElem;
import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgNextEntry;
import it.unibz.udig.xplr.grammar.entities.XpgParsingTableRow;
import it.unibz.udig.xplr.grammar.entities.XpgParsingTableState;
import it.unibz.udig.xplr.grammar.exceptions.SyntaxErrorException;
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

	private Dictionary dict;
	private ArrayList<XpgParsingTableRow> parsingtable;
	private CopyOnWriteArrayList<Object> theStack;
	private ArrayList<ResultObject> result;
	private XpgLoader loader;

	public XpLRParser(String inputfile) throws IOException
	{

		result = new ArrayList<>();
		result.add(new ResultObject("Starting...", 0));

		// the stack
		theStack = new CopyOnWriteArrayList<>();
		theStack.add(0); // state 0 della parsing table

		// the grammar
		InputStream is = new FileInputStream(inputfile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		XpgLexer lexer = new XpgLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XpgParser parser = new XpgParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.xpgfile(); // start
		ParseTreeWalker walker = new ParseTreeWalker();

		loader = new XpgLoader();
		try
		{
			walker.walk(loader, tree); // walk parse tree
			result.add(new ResultObject("walked the tree - loader ready", 0));
		}
		catch (Exception ex)
		{
			result.add(new ResultObject("walked the tree - error ".concat(ex.getMessage()), 1));
			return;
		}

		// the parsing table
		ParsingTableConstructor constructor = new ParsingTableConstructor(loader);
		CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> items = ItemConstructor.items(loader, result);

		// ItemConstructor.outItems(items);

		setParsingtable(constructor.createTable(items, result));

		// ParsingTableConstructor.outTable( parsingtable );

	}

	public ArrayList<XpgParsingTableRow> getParsingtable()
	{
		return parsingtable;
	}

	public void setParsingtable(ArrayList<XpgParsingTableRow> p)
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

	public ArrayList<ResultObject> getResult()
	{
		return result;
	}

	public XpgLoader getLoader()
	{
		return loader;
	}

	private Integer fetchVSymbol(XpgNextEntry e)
	{
		if (e.getDriverRelation().toString() == "start")
		{
			for (DictionaryEntry entry : getDictionary().getEntries())
			{
				if (!entry.visited) return getDictionary().getEntries().indexOf(entry);
			}
		}
		else if (e.getDriverRelation().toString() == "EOI")
		{
			for (DictionaryEntry entry : getDictionary().getEntries())
			{
				if (!entry.isVisited())
				{
					return null;
				}

				return 0;
			}
		}
		else if (e == null)
		{
			return null;
		}
		else
			return null;

		// XpgNextEntry start = new XpgNextEntry( );
		// start.setX( new XpgElem( "S" ) );
		// start.setDriverRelation( new XpgElem( "start" ) );
		//
		// XpgNextEntry end = new XpgNextEntry( );
		// end.setX( new XpgElem( "EOI" ) );
		// end.setDriverRelation( new XpgElem( "end" ) );
		//

		// else if ( e.equals( start ) )
		// {
		// return dp.getTheObjects( ).size( );
		//
		// }
		// else if ( e.equals( end ) )
		// {
		// if ( dp.getTheObjects( ).size( ) == 1 )
		// {
		//
		// Iterator< Entry< XpgRelation, Integer >> it = dp.getCounter(
		// ).entrySet( ).iterator( );
		// boolean zero = false;
		// while ( it.hasNext( ) )
		// {
		//
		// Entry< XpgRelation, Integer > entry = it.next( );
		// zero = ( entry.getValue( ) == 0 );
		// }
		//
		// if ( zero )
		// return 0;
		// else
		// return null;
		//
		// }
		// else
		// return null;
		//
		// }
		// else
		// {
		// // verifico se x � terminale o nonterminale
		// XpgElem elem = e.getX( );
		//
		// /*
		// if x is a terminal vsymbol, Fetch Vsymbol returns the index in Dp of
		// a non visited
		// vsymbol whose name is x and whose k-th syntactic attribute is linked
		// to the h-th syntactic attribute of z.
		// */
		// if ( XpgTerminal.class.isAssignableFrom( elem.getClass( ) ) )
		// {
		// for ( int i = dp.getTheObjects( ).size( ); i < 0; i -- )
		// {
		// Object z = theStack.get( theStack.size( ) - 1 );
		//
		// if ( dp.getTheObjects( ).get( i ).equals( elem.getClass( ) ) )
		// {
		//
		// }
		//
		// }
		//
		// }
		// else if ( XpgNonTerminal.class.isAssignableFrom( elem.getClass( ) ) )
		// {
		//
		// }
		// else
		// throw new Exception( );
		// }

		return null;

	}

	private void test()
	{
	}

	public void theAlg(Dictionary dict) throws SyntaxErrorException
	{
		if (dict != null)
		{
			setDictionary(dict);
			result.add(new ResultObject("Dictionary ready", 0));
		}
		else
		{
			result.add(new ResultObject("Dictionary is null, can go any further", 1));
			return;
		}

		// repeat forever
		// let s be the state of the stack top

		for (int i = theStack.size(); i < 0; i--)
		{
			Object s = theStack.get(i);

			if (s instanceof Integer)
			{
				XpgParsingTableRow row = getParsingtable().get((Integer) s);
				for (XpgParsingTableState substate : row.getSubstates())
				{
					XpgNextEntry next = substate.getNextEntry();
					Object o = fetchVSymbol(next);
					if (o != null)
					{

					}
					else if (next == null)
					{

					}
					else
						throw new SyntaxErrorException();
				}

			}

		}

		// Object ip = fetchVSymbol(s.g);

	}

}
