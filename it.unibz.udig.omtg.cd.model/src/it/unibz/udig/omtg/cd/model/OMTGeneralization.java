/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#getKind <em>Kind</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#isTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeneralization()
 * @model
 * @generated
 */
public interface OMTGeneralization extends OMTRelationship
{

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.GeneralizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.GeneralizationKind
	 * @see #setKind(GeneralizationKind)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeneralization_Kind()
	 * @model
	 * @generated
	 */
	GeneralizationKind getKind( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.GeneralizationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind( GeneralizationKind value );

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(boolean)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTGeneralization_Total()
	 * @model default="false"
	 * @generated
	 */
	boolean isTotal( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#isTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #isTotal()
	 * @generated
	 */
	void setTotal( boolean value );

} // OMTGeneralization
