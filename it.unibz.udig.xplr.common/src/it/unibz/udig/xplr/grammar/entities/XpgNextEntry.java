package it.unibz.udig.xplr.grammar.entities;

public class XpgNextEntry
{
	XpgElem driverRelation;
	XpgElem x; // terminal or non terminal

	public XpgNextEntry()
	{
		this.driverRelation = new XpgElem();
		this.x = new XpgElem();
	}

	public XpgElem getDriverRelation()
	{
		return driverRelation;
	}

	public XpgElem getX()
	{
		return x;
	}

	public void setDriverRelation(XpgElem driverRelation)
	{
		this.driverRelation = driverRelation;
	}

	public void setX(XpgElem x)
	{
		this.x = x;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.driverRelation.toString());
		sb.append(",");
		sb.append(this.x);

		return sb.toString();
	}
}