/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OMT Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationshipType()
 * @model
 * @generated
 */
public enum OMTRelationshipType implements Enumerator
{
	/**
	 * The '<em><b>SIMPLE ASSOCIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_ASSOCIATION( 0, "SIMPLE_ASSOCIATION", "Simple association" ),

	/**
	 * The '<em><b>SPATIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPATIAL( 1, "SPATIAL", "Spatial" ),

	/**
	 * The '<em><b>ARC NODE NETWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARC_NODE_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	ARC_NODE_NETWORK( 2, "ARC_NODE_NETWORK", "Arc Node Network" ),

	/**
	 * The '<em><b>ARC ARC NETWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARC_ARC_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	ARC_ARC_NETWORK( 3, "ARC_ARC_NETWORK", "Arc Arc Network" );

	/**
	 * The '<em><b>SIMPLE ASSOCIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMPLE ASSOCIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_ASSOCIATION
	 * @model literal="Simple association"
	 * @generated
	 * @ordered
	 */
	public static final int							SIMPLE_ASSOCIATION_VALUE	= 0;

	/**
	 * The '<em><b>SPATIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPATIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPATIAL
	 * @model literal="Spatial"
	 * @generated
	 * @ordered
	 */
	public static final int							SPATIAL_VALUE				= 1;

	/**
	 * The '<em><b>ARC NODE NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARC NODE NETWORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARC_NODE_NETWORK
	 * @model literal="Arc Node Network"
	 * @generated
	 * @ordered
	 */
	public static final int							ARC_NODE_NETWORK_VALUE		= 2;

	/**
	 * The '<em><b>ARC ARC NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARC ARC NETWORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARC_ARC_NETWORK
	 * @model literal="Arc Arc Network"
	 * @generated
	 * @ordered
	 */
	public static final int							ARC_ARC_NETWORK_VALUE		= 3;

	/**
	 * An array of all the '<em><b>OMT Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OMTRelationshipType[]		VALUES_ARRAY				= new OMTRelationshipType[]
		{
			SIMPLE_ASSOCIATION,
			SPATIAL,
			ARC_NODE_NETWORK,
			ARC_ARC_NETWORK,
		};

	/**
	 * A public read-only list of all the '<em><b>OMT Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OMTRelationshipType>	VALUES						= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OMT Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTRelationshipType get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTRelationshipType getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTRelationshipType get( int value )
	{
		switch (value)
		{
			case SIMPLE_ASSOCIATION_VALUE: return SIMPLE_ASSOCIATION;
			case SPATIAL_VALUE: return SPATIAL;
			case ARC_NODE_NETWORK_VALUE: return ARC_NODE_NETWORK;
			case ARC_ARC_NETWORK_VALUE: return ARC_ARC_NETWORK;
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
	private OMTRelationshipType(int value, String name, String literal)
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

} //OMTRelationshipType
