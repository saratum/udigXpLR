package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class XpgItem implements Comparable<XpgItem>, Serializable
{

	private XpgNonTerminal leftelem;
	private ArrayList<Object> rightelem;
	private Integer dot = 0;
	private Integer gotoitem = 0;

	public XpgItem()
	{

		this.rightelem = new ArrayList<Object>();
		this.leftelem = null;
	}

	public ArrayList<Object> getRightelem()
	{
		return rightelem;
	}

	public XpgNonTerminal getLeftelem()
	{
		return leftelem;
	}

	public void setRightelem(ArrayList<Object> rightelem)
	{
		this.rightelem = rightelem;
	}

	public void setLeftelem(XpgNonTerminal leftelem)
	{
		this.leftelem = leftelem;
	}

	public Integer getDot()
	{
		return dot;
	}

	public void setDot(Integer dot)
	{
		this.dot = dot;
	}

	public void setGotoitem(Integer gotoitem)
	{
		this.gotoitem = gotoitem;
	}

	public Integer getGotoitem()
	{
		return gotoitem;
	}

	@Override
	public String toString()
	{
		StringBuilder re = new StringBuilder();

		for (int i = 0; i < this.rightelem.size(); i++)
		{
			if (this.dot == i) re.append(".");

			re.append(this.rightelem.get(i).toString());
		}

		if (this.rightelem.size() == this.dot) re.append(".");

		return this.leftelem.getContent().concat("->").concat(re.toString()); // .concat(this.gotoitem.toString(
																				// ));
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgItem)
		{
			XpgItem elem = (XpgItem) obj;

			// return ( ( elem.getLeftelem( ).equals( this.leftelem ) )
			// && ( elem.getRightelem( ).equals( this.rightelem ) ) && (
			// elem.getDot( )
			// .equals( this.dot ) ) );
			return elem.toString().equals(this.toString());
		}
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}

	@Override
	public int compareTo(XpgItem o)
	{
		return this.toString().compareTo(o.toString());
	}
}
