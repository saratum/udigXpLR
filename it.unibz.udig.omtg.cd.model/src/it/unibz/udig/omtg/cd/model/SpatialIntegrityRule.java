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
 * A representation of the literals of the enumeration '<em><b>Spatial Integrity Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getSpatialIntegrityRule()
 * @model
 * @generated
 */
public enum SpatialIntegrityRule implements Enumerator
{
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE( 0, "NONE", "NONE" ),

	/**
	 * The '<em><b>TOUCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH( 1, "TOUCH", "TOUCH" ),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN( 2, "IN", "IN" ),

	/**
	 * The '<em><b>CROSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS( 3, "CROSS", "CROSS" ),

	/**
	 * The '<em><b>OVERLAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAP_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAP( 4, "OVERLAP", "OVERLAP" ),

	/**
	 * The '<em><b>DISJOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT( 5, "DISJOINT", "DISJOINT" ),

	/**
	 * The '<em><b>ADJACENT TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJACENT_TO_VALUE
	 * @generated
	 * @ordered
	 */
	ADJACENT_TO( 6, "ADJACENT_TO", "ADJACENT_TO" ),

	/**
	 * The '<em><b>COINCIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COINCIDE_VALUE
	 * @generated
	 * @ordered
	 */
	COINCIDE( 7, "COINCIDE", "COINCIDE" ),

	/**
	 * The '<em><b>CONTAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAIN( 8, "CONTAIN", "CONTAIN" ),

	/**
	 * The '<em><b>NEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR( 9, "NEAR", "NEAR" );

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								NONE_VALUE			= 0;

	/**
	 * The '<em><b>TOUCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								TOUCH_VALUE			= 1;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								IN_VALUE			= 2;

	/**
	 * The '<em><b>CROSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								CROSS_VALUE			= 3;

	/**
	 * The '<em><b>OVERLAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERLAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								OVERLAP_VALUE		= 4;

	/**
	 * The '<em><b>DISJOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISJOINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISJOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								DISJOINT_VALUE		= 5;

	/**
	 * The '<em><b>ADJACENT TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADJACENT TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJACENT_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								ADJACENT_TO_VALUE	= 6;

	/**
	 * The '<em><b>COINCIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COINCIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COINCIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								COINCIDE_VALUE		= 7;

	/**
	 * The '<em><b>CONTAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								CONTAIN_VALUE		= 8;

	/**
	 * The '<em><b>NEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int								NEAR_VALUE			= 9;

	/**
	 * An array of all the '<em><b>Spatial Integrity Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpatialIntegrityRule[]		VALUES_ARRAY		= new SpatialIntegrityRule[]
		{
			NONE,
			TOUCH,
			IN,
			CROSS,
			OVERLAP,
			DISJOINT,
			ADJACENT_TO,
			COINCIDE,
			CONTAIN,
			NEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Spatial Integrity Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpatialIntegrityRule>	VALUES				= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spatial Integrity Rule</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpatialIntegrityRule get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			SpatialIntegrityRule result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spatial Integrity Rule</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpatialIntegrityRule getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			SpatialIntegrityRule result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spatial Integrity Rule</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpatialIntegrityRule get( int value )
	{
		switch (value)
		{
			case NONE_VALUE: return NONE;
			case TOUCH_VALUE: return TOUCH;
			case IN_VALUE: return IN;
			case CROSS_VALUE: return CROSS;
			case OVERLAP_VALUE: return OVERLAP;
			case DISJOINT_VALUE: return DISJOINT;
			case ADJACENT_TO_VALUE: return ADJACENT_TO;
			case COINCIDE_VALUE: return COINCIDE;
			case CONTAIN_VALUE: return CONTAIN;
			case NEAR_VALUE: return NEAR;
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
	private SpatialIntegrityRule(int value, String name, String literal)
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

} //SpatialIntegrityRule
