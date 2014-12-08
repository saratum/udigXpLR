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
 * A representation of the literals of the enumeration '<em><b>OMT Geo Object Geometry Class Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTGeoObjectGeometryClassKind()
 * @model
 * @generated
 */
public enum OMTGeoObjectGeometryClassKind implements Enumerator
{
	/**
	 * The '<em><b>POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT( 0, "POINT", "Point" ),

	/**
	 * The '<em><b>LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE( 1, "LINE", "Line" ),

	/**
	 * The '<em><b>POLYGON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON( 2, "POLYGON", "Polygon" );

	/**
	 * The '<em><b>POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @model literal="Point"
	 * @generated
	 * @ordered
	 */
	public static final int										POINT_VALUE		= 0;

	/**
	 * The '<em><b>LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model literal="Line"
	 * @generated
	 * @ordered
	 */
	public static final int										LINE_VALUE		= 1;

	/**
	 * The '<em><b>POLYGON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLYGON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYGON
	 * @model literal="Polygon"
	 * @generated
	 * @ordered
	 */
	public static final int										POLYGON_VALUE	= 2;

	/**
	 * An array of all the '<em><b>OMT Geo Object Geometry Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OMTGeoObjectGeometryClassKind[]		VALUES_ARRAY	= new OMTGeoObjectGeometryClassKind[]
		{
			POINT,
			LINE,
			POLYGON,
		};

	/**
	 * A public read-only list of all the '<em><b>OMT Geo Object Geometry Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OMTGeoObjectGeometryClassKind>	VALUES			= Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OMT Geo Object Geometry Class Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectGeometryClassKind get( String literal )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoObjectGeometryClassKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Object Geometry Class Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectGeometryClassKind getByName( String name )
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			OMTGeoObjectGeometryClassKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OMT Geo Object Geometry Class Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMTGeoObjectGeometryClassKind get( int value )
	{
		switch (value)
		{
			case POINT_VALUE: return POINT;
			case LINE_VALUE: return LINE;
			case POLYGON_VALUE: return POLYGON;
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
	private OMTGeoObjectGeometryClassKind(int value, String name, String literal)
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

} //OMTGeoObjectGeometryClassKind
