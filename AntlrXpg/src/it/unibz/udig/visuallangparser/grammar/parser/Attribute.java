package it.unibz.udig.visuallangparser.grammar.parser;

public class Attribute
{

	String name, type;
	Object value;

	public Attribute(String n, String t, Object v)
	{
		this.name = n;
		this.type = t;
		this.value = v;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	public Object getValue()
	{
		return value;
	}

	@Override
	public String toString()
	{
		String _name = (getName() == null) ? "*" : getName();
		String _type = (getType() == null) ? "*" : getType();
		String _value = (getValue() == null) ? "null" : getValue().toString();

		return _name.concat(" - ").concat(_type).concat(" - ").concat(_value.toString());
	}
}
