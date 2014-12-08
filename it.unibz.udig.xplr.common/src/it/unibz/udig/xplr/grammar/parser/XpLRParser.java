package it.unibz.udig.xplr.grammar.parser;

import it.unibz.udig.xplr.grammar.entities.XpgItem;
import it.unibz.udig.xplr.grammar.entities.XpgNextEntry;
import it.unibz.udig.xplr.grammar.entities.XpgParsingTableRow;
import it.unibz.udig.xplr.grammar.generated.XpgLexer;
import it.unibz.udig.xplr.grammar.generated.XpgParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class XpLRParser
{

	private Dictionary dp;
	private ArrayList<XpgParsingTableRow> parsingtable;
	private ArrayList<Object> theStack;
	private ArrayList<ResultObject> result;

	public ArrayList<String> layers;

	public XpLRParser(String inputfile) throws IOException
	{

		result = new ArrayList<>();
		result.add(new ResultObject("Starting...", 0));

		dp = new Dictionary();

		XpgLoader loader = new XpgLoader(inputfile);

		InputStream is;
		ANTLRInputStream input;

		is = new FileInputStream(inputfile);
		input = new ANTLRInputStream(is);

		XpgLexer lexer = new XpgLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XpgParser parser = new XpgParser(tokens);
		parser.setBuildParseTree(true);

		ParseTree tree = parser.xpgfile(); // start

		ParseTreeWalker walker = new ParseTreeWalker();

		walker.walk(loader, tree); // walk parse tree
		layers = loader.getLayers();

		// the stack
		theStack = new ArrayList<Object>();

		// the parsing table
		ParsingTableConstructor constructor = new ParsingTableConstructor(loader);
		CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> items = ItemConstructor.items(loader);

		parsingtable = constructor.createTable(items);
		// ParsingTableConstructor.outTable( parsingtable );

		theAlg();
	}

	public Dictionary getDictionary()
	{
		return dp;
	}

	public ArrayList<ResultObject> getResult()
	{
		return result;
	}

	private Integer fetchVSymbol(XpgNextEntry e) throws Exception
	{
		// XpgNextEntry start = new XpgNextEntry( );
		// start.setX( new XpgElem( "S" ) );
		// start.setDriverRelation( new XpgElem( "start" ) );
		//
		// XpgNextEntry end = new XpgNextEntry( );
		// end.setX( new XpgElem( "EOI" ) );
		// end.setDriverRelation( new XpgElem( "end" ) );
		//
		// if ( e == null )
		// {
		// return null;
		// }
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

	private void theAlg()
	{
	}

	public class ResultObject
	{

		String message;
		Integer level;

		public ResultObject(String msg, Integer l)
		{
			this.message = msg;
			this.level = l;
		}

		public Integer getLevel()
		{
			return level;
		}

		public String getMessage()
		{
			return message;
		}

	}

}
