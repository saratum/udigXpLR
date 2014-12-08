/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Geo Object Geometry Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeoObjectGeometryClass()
 * @model
 * @generated
 */
public interface OMTGeoObjectGeometryClass extends OMTClass
{

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind
	 * @see #setRepresentation(OMTGeoObjectGeometryClassKind)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeoObjectGeometryClass_Representation()
	 * @model
	 * @generated
	 */
	OMTGeoObjectGeometryClassKind getRepresentation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation( OMTGeoObjectGeometryClassKind value );

} // OMTGeoObjectGeometryClass
