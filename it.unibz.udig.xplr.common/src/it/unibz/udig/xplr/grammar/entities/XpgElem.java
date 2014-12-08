package it.unibz.udig.xplr.grammar.entities;

public class XpgElem
{
	String content;

	public XpgElem()
	{
	}

	public XpgElem(String content)
	{
		this.content = content;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return this.content;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj.getClass().isAssignableFrom(this.getClass()))
			return this.content.equals(((XpgElem) obj).getContent());
		else
			return false;
	}

}
