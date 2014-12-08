/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass <em>Omtclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getClassOperation()
 * @model
 * @generated
 */
public interface ClassOperation extends ClassElement
{

	/**
	 * Returns the value of the '<em><b>Omtclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omtclass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omtclass</em>' container reference.
	 * @see #setOmtclass(OMTClass)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getClassOperation_Omtclass()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	OMTClass getOmtclass( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass <em>Omtclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omtclass</em>' container reference.
	 * @see #getOmtclass()
	 * @generated
	 */
	void setOmtclass( OMTClass value );

} // ClassOperation
