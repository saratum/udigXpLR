/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Geo Object Topology Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTGeoObjectTopologyClass()
 * @model
 * @generated
 */
public interface OMTGeoObjectTopologyClass extends OMTClass
{

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind
	 * @see #setRepresentation(OMTGeoObjectTopologyClassKind)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTGeoObjectTopologyClass_Representation()
	 * @model
	 * @generated
	 */
	OMTGeoObjectTopologyClassKind getRepresentation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation( OMTGeoObjectTopologyClassKind value );

} // OMTGeoObjectTopologyClass
