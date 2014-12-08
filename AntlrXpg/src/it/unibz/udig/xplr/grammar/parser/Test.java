package it.unibz.udig.xplr.grammar.parser;

public class Test
{

	final String filename = "/Users/sara/git/udigXpLR/regole/lamp.xpg";
	XpgLoader loader = new XpgLoader(filename);

	public static void main(String[] args) throws Exception
	{
		new Test();

	}

	public Test()
	{
		try
		{
			new XpLRParser(filename);
		}

		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
