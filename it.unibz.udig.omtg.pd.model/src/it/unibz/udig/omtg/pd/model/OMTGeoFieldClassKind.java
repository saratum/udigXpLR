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
 * A representation of the literals of the enumeration '<em><b>OMT Geo Field Class Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTGeoFieldClassKind()
 * @model
 * @generated
 */
public enum OMTGeoFieldClassKind implements Enumerator
{
	/**
	 * The '<em><b>TRIANGULAR IRREGULAR NETWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_IRREGULAR_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGULAR_IRREGULAR_NETWORK( 0, "TRIANGULAR_IRREGULAR_NETWORK", "Triangular Irregular Network" ),

	/**
	 * The '<em><b>ISOLINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOLINE_VALUE
	 * @generated
	 * @ordered
	 */
	ISOLINE( 1, "ISOLINE", "Isoline" ),

	/**
	 * The '<em><b>PLANAR SUBDIVISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANAR_SUBDIVISION_VALUE
	 * @generated
	 * @ordered
	 */
	PLANAR_SUBDIVISION( 2, "PLANAR_SUBDIVISION", "Planar Subdivision" ),

	/**
	 * The '<em><b>TESSELATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESSELATION_VALUE
	 * @generated
	 * @ordered
	 */
	TESSELATION( 3, "TESSELATION", "Tesselation" ),

	/**
	 * The '<em><b>SAMPLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLING( 4, "SAMPLING", "Sampling" );

	/**
	 * The '<em><b>TRIANGULAR IRREGULAR NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIANGULAR IRREGULAR NETWORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_IRREGULAR_NETWORK
	 * @model literal="Triangular Irregular Network"
	 * @generated
	 * @ordered
	 */
	public static final int								TRIANGULAR_IRREGULAR_NETWORK_VALUE	= 0;

	/**
	 * The '<em><b>ISOLINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOLINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOLINE
	 * @model literal="Isoline"
	 * @generated
	 * @ordered
	 */
	public static final int								ISOLINE_VALUE						= 1;

	/**
	 * The '<em><b>PLANAR SUBDIVISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLANAR SUBDIVISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLANAR_SUBDIVISION
	 * @model literal="Planar Subdivision"
	 * @generated
	 * @ordered
	 */
	public static final int								PLANAR_SUBDIVISION_VALUE			= 2;

	/**
	 * The '<em><b>TESSELATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TESSELATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESSELATION
	 * @model literal="Tesselation"
	 * @generated
	 * @ordered
	 */
	public static final int								TESSELATION_VALUE					= 3;

	/**
	 * The '<em><b>SAMPLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMPLING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLING
	 * @model literal="Sampling"
	 * @generated
	 * @ordered
	 */
	public static final int								SAMPLING_VALUE						= 4;

	/**
	 * An array of all the '<em><b>OMT Geo Field Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OMTGeoFieldClassKind[]		VALUES_ARRAY						= new OMTGeoFieldClassKind[]
		{
			TRIANGULAR_IRREGULAR_NETWORK,
			ISOLINE,
			PLANAR_SUBDIVISION,
			TESSELATION,
			SAMPLING,
		};

	/**
	 * A public read-only list of all the '<em><b>OMT Geo Field Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OMTGeoFieldClassKind>	VALUES								= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OMT Geo Field Class Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoFieldClassKind get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoFieldClassKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Field Class Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoFieldClassKind getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoFieldClassKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Field Class Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoFieldClassKind get( int value )
	{
		switch (value)
		{
			case TRIANGULAR_IRREGULAR_NETWORK_VALUE: return TRIANGULAR_IRREGULAR_NETWORK;
			case ISOLINE_VALUE: return ISOLINE;
			case PLANAR_SUBDIVISION_VALUE: return PLANAR_SUBDIVISION;
			case TESSELATION_VALUE: return TESSELATION;
			case SAMPLING_VALUE: return SAMPLING;
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
	private OMTGeoFieldClassKind(int value, String name, String literal)
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

} //OMTGeoFieldClassKind
