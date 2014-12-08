/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OMT Geo Object Topology Class Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTGeoObjectTopologyClassKind()
 * @model
 * @generated
 */
public enum OMTGeoObjectTopologyClassKind implements Enumerator
{
	/**
	 * The '<em><b>UNIDIRECTIONAL LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECTIONAL_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIDIRECTIONAL_LINE( 0, "UNIDIRECTIONAL_LINE", "Unidirectional Line" ),

	/**
	 * The '<em><b>BIDIRECTIONAL LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	BIDIRECTIONAL_LINE( 1, "BIDIRECTIONAL_LINE", "Bidirectional Line" ),

	/**
	 * The '<em><b>NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_VALUE
	 * @generated
	 * @ordered
	 */
	NODE( 2, "NODE", "Node" );

	/**
	 * The '<em><b>UNIDIRECTIONAL LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIDIRECTIONAL LINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECTIONAL_LINE
	 * @model literal="Unidirectional Line"
	 * @generated
	 * @ordered
	 */
	public static final int										UNIDIRECTIONAL_LINE_VALUE	= 0;

	/**
	 * The '<em><b>BIDIRECTIONAL LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIDIRECTIONAL LINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL_LINE
	 * @model literal="Bidirectional Line"
	 * @generated
	 * @ordered
	 */
	public static final int										BIDIRECTIONAL_LINE_VALUE	= 1;

	/**
	 * The '<em><b>NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODE
	 * @model literal="Node"
	 * @generated
	 * @ordered
	 */
	public static final int										NODE_VALUE					= 2;

	/**
	 * An array of all the '<em><b>OMT Geo Object Topology Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OMTGeoObjectTopologyClassKind[]		VALUES_ARRAY				= new OMTGeoObjectTopologyClassKind[]
		{
			UNIDIRECTIONAL_LINE,
			BIDIRECTIONAL_LINE,
			NODE,
		};

	/**
	 * A public read-only list of all the '<em><b>OMT Geo Object Topology Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OMTGeoObjectTopologyClassKind>	VALUES						= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OMT Geo Object Topology Class Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectTopologyClassKind get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoObjectTopologyClassKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Object Topology Class Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectTopologyClassKind getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoObjectTopologyClassKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Object Topology Class Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectTopologyClassKind get( int value )
	{
		switch (value)
		{
			case UNIDIRECTIONAL_LINE_VALUE: return UNIDIRECTIONAL_LINE;
			case BIDIRECTIONAL_LINE_VALUE: return BIDIRECTIONAL_LINE;
			case NODE_VALUE: return NODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int		value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String	name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String	literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OMTGeoObjectTopologyClassKind(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue( )
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName( )
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral( )
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString( )
	{
		return literal;
	}

} //OMTGeoObjectTopologyClassKind
