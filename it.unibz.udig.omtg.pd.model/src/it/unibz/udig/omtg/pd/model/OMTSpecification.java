/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification <em>Presentation Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTSpecification()
 * @model
 * @generated
 */
public interface OMTSpecification extends NameValueElement
{

	/**
	 * Returns the value of the '<em><b>Presentation Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Specification</em>' container reference.
	 * @see #setPresentationSpecification(OMTPresentationSpecification)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTSpecification_PresentationSpecification()
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getSpecification
	 * @model opposite="specification" transient="false"
	 * @generated
	 */
	OMTPresentationSpecification getPresentationSpecification( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification <em>Presentation Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Specification</em>' container reference.
	 * @see #getPresentationSpecification()
	 * @generated
	 */
	void setPresentationSpecification( OMTPresentationSpecification value );

} // OMTSpecification
