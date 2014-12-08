/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TR Operator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.td.model.TDPackage#getTROperatorKind()
 * @model
 * @generated
 */
public enum TROperatorKind implements Enumerator
{
	/**
	 * The '<em><b>CENTROID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTROID_VALUE
	 * @generated
	 * @ordered
	 */
	CENTROID( 0, "CENTROID", "Centroid determination" ),

	/**
	 * The '<em><b>CONVEX HULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVEX_HULL_VALUE
	 * @generated
	 * @ordered
	 */
	CONVEX_HULL( 1, "CONVEX_HULL", "Convex hull" ),

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION( 8, "AGGREGATION", "Aggregation" );

	/**
	 * The '<em><b>CENTROID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTROID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTROID
	 * @model literal="Centroid determination"
	 * @generated
	 * @ordered
	 */
	public static final int						CENTROID_VALUE		= 0;

	/**
	 * The '<em><b>CONVEX HULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONVEX HULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONVEX_HULL
	 * @model literal="Convex hull"
	 * @generated
	 * @ordered
	 */
	public static final int						CONVEX_HULL_VALUE	= 1;

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGGREGATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model literal="Aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int						AGGREGATION_VALUE	= 8;

	/**
	 * An array of all the '<em><b>TR Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TROperatorKind[]		VALUES_ARRAY		= new TROperatorKind[]
		{
			CENTROID,
			CONVEX_HULL,
			AGGREGATION,
		};

	/**
	 * A public read-only list of all the '<em><b>TR Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TROperatorKind>	VALUES				= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TR Operator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TROperatorKind get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			TROperatorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TR Operator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TROperatorKind getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			TROperatorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TR Operator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TROperatorKind get( int value )
	{
		switch (value)
		{
			case CENTROID_VALUE: return CENTROID;
			case CONVEX_HULL_VALUE: return CONVEX_HULL;
			case AGGREGATION_VALUE: return AGGREGATION;
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
	private TROperatorKind(int value, String name, String literal)
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

} //TROperatorKind
