/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Geo Field Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClass#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeoFieldClass()
 * @model
 * @generated
 */
public interface OMTGeoFieldClass extends OMTClass
{

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The default value is <code>"Triangular Irregular Network"</code>.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind
	 * @see #setRepresentation(OMTGeoFieldClassKind)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeoFieldClass_Representation()
	 * @model default="Triangular Irregular Network" required="true"
	 * @generated
	 */
	OMTGeoFieldClassKind getRepresentation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClass#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation( OMTGeoFieldClassKind value );

} // OMTGeoFieldClass
