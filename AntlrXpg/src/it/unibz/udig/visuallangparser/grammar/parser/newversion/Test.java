package it.unibz.udig.visuallangparser.grammar.parser.newversion;

import it.unibz.udig.visuallangparser.grammar.entities.XpgItem;
import it.unibz.udig.visuallangparser.grammar.entities.XpgNonTerminal;
import it.unibz.udig.visuallangparser.grammar.generated.XpgLexer;
import it.unibz.udig.visuallangparser.grammar.generated.XpgParser;
import it.unibz.udig.visuallangparser.grammar.parser.ParsingTableConstructor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test
{

	public static void main(String[] args) throws Exception
	{
		new Test();

	}

	public Test()
	{
		try
		{
			// String filename =
			// "/Users/administrator/git/mymasterthesis/AntlrXpg/lamp2.txt";
			// String filename
			// ="/Users/administrator/git/mymasterthesis/AntlrXpg/lamp.xpg";
			String filename = "/Users/sara/git/mymasterthesis/AntlrXpg/xpg_tester2.txt";

			XpgLoader2 loader = new XpgLoader2();

			InputStream is;
			ANTLRInputStream input;

			is = new FileInputStream(filename);
			input = new ANTLRInputStream(is);

			XpgLexer lexer = new XpgLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			XpgParser parser = new XpgParser(tokens);
			parser.setBuildParseTree(true);

			ParseTree tree = parser.xpgfile(); // start

			ParseTreeWalker walker = new ParseTreeWalker();

			walker.walk(loader, tree); // walk parse tree

			// XpgItem augItem = new XpgItem( );
			// augItem.getRightelem( ).add( loader.getItems( ).get( 0
			// ).getLeftelem( ) );
			// augItem.setLeftelem( new XpgNonTerminal( "S'" ) );
			// loader.getAugmentedItems( ).add( augItem );
			//

			ParsingTableConstructor2 constructor = new ParsingTableConstructor2(loader);
			loader.getAugmentedItems().addAll(loader.getItems());

			// items
			CopyOnWriteArrayList<CopyOnWriteArrayList<CopyOnWriteArrayList<XpgItem>>> itemSet = ItemConstructor2.items(loader);
			ItemConstructor2.outItems(itemSet);

			ParsingTableConstructor2.outTable(constructor.createTable(itemSet));

			// the parsing table

		}

		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
