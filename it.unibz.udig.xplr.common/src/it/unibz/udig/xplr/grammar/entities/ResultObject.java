package it.unibz.udig.xplr.grammar.entities;

public class ResultObject
{

	public static final Integer	LEVEL_INFO		= 0;
	public static final Integer	LEVEL_WARNING	= 1;
	public static final Integer	LEVEL_ERROR		= 2;
	public static final Integer	LEVEL_NONE		= 99;

	String						message;
	Integer						level;

	public ResultObject( String msg, Integer l)
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

	@Override
	public String toString()
	{
		String level = "";

		switch ( this.level )
		{

			case 0:
				level = "Info: ";
				break;
			case 1:
				level = "Warning: ";
				break;
			case 2:
				level = "ERROR: ";
				break;

			default:
				level = "";
				break;
		}
		return level.concat(this.message);
	}

}
