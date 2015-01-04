package it.unibz.udig.xplr.grammar.parser;

public class ResultObject
{

	public static final Integer LEVEL_INFO = 0;
	public static final Integer LEVEL_WARNING = 1;
	public static final Integer LEVEL_ERROR = 2;
	
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