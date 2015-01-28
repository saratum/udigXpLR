package it.unibz.udig.xplr.grammar.entities;

public class XpgDelta
{

	private String	leftElem;
	private String	rightElem;

	public XpgDelta()
	{
		// TODO Auto-generated constructor stub
	}

	public XpgDelta( String l, String r)
	{
		this.leftElem = l;
		this.rightElem = r;
	}

	public String getLeftElem()
	{
		return leftElem;
	}

	public String getRightElem()
	{
		return rightElem;
	}

	public void setLeftElem(String leftElem)
	{
		this.leftElem = leftElem;
	}

	public void setRightElem(String rightElem)
	{
		this.rightElem = rightElem;
	}

	@Override
	public String toString()
	{
		return this.leftElem.concat( "=" ).concat( this.rightElem );
	}
}
