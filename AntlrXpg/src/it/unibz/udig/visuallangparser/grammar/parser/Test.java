package it.unibz.udig.visuallangparser.grammar.parser;

public class Test
{

	XpgLoader loader = new XpgLoader();

	public static void main(String[] args) throws Exception
	{
		new Test();

	}

	public Test()
	{
		try
		{
			 String filename
			 ="/Users/sara/git/mymasterthesis/regole/lamp.xpg"; 
			 //= "/Users/sara/git/mymasterthesis/AntlrXpg/xpg_tester2.txt";
			new XpLRParser(filename);
		}

		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
