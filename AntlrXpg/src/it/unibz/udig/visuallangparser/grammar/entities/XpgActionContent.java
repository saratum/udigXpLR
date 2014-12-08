package it.unibz.udig.visuallangparser.grammar.entities;

import java.io.Serializable;

public class XpgActionContent implements Comparable<XpgActionContent>, Serializable
{

	public static enum Value
	{
		SHIFT, REDUCE, ACCEPT, ERROR;
	}

	private Value operation;
	private XpgElem relTester; // shift
	private int shiftState; // shift
	private XpgItem production; // reduce
	private Integer reduceTo;

	public XpgActionContent(int shiftState, XpgElem tester)
	{
		this.operation = Value.SHIFT;
		this.shiftState = shiftState;
		this.relTester = tester;
	}

	public Integer getReduceTo()
	{
		return reduceTo;
	}

	public void setReduceTo(Integer reduceTo)
	{
		this.reduceTo = reduceTo;
	}

	public XpgActionContent(Value operation)
	{
		this.operation = operation;
	}

	public Value getOperation()
	{
		return operation;
	}

	public XpgElem getRelTester()
	{
		return relTester;
	}

	public int getState()
	{
		return shiftState;
	}

	public XpgItem getProduction()
	{
		return production;
	}

	public void setOperation(Value operation)
	{
		this.operation = operation;
	}

	public void setRelTester(XpgElem relTester)
	{
		this.relTester = relTester;
	}

	public void setState(int state)
	{
		this.shiftState = state;
	}

	public void setProduction(XpgItem production)
	{
		this.production = production;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		switch (this.operation)
		{
		case SHIFT:
			sb.append("action[");
			sb.append((this.relTester == null) ? "T" : this.relTester.toString());
			sb.append(":sh");
			sb.append(this.shiftState);
			sb.append("] ");
			break;
		case ACCEPT:
			sb.append("ACC");

			break;
		case ERROR:
			break;
		case REDUCE:
			sb.append("action[r: ");
			sb.append(this.reduceTo);
			sb.append("] ");

			break;

		default:
			break;
		}

		return sb.toString();

	}

	@Override
	public int compareTo(XpgActionContent o)
	{

		return this.toString().compareTo(o.toString());
	}

	@Override
	public int hashCode()
	{

		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof XpgActionContent)
		{
			XpgActionContent elem = (XpgActionContent) obj;
			return elem.toString().equals(this.toString());
		}
		else
		{
			return false;
		}
	}
}
