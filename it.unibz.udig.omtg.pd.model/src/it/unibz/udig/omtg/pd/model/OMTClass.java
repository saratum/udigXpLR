/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTClass#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTClass()
 * @model
 * @generated
 */
public interface OMTClass extends OMTPDNode
{

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"< ... >"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTClass_Name()
	 * @model default="< ... >"
	 * @generated
	 */
	String getName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName( String value );

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.ClassAttribute}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTClass_Attributes()
	 * @see it.unibz.udig.omtg.pd.model.ClassAttribute#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassAttribute> getAttributes( );

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.ClassOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTClass_Operations()
	 * @see it.unibz.udig.omtg.pd.model.ClassOperation#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassOperation> getOperations( );

	/**
	 * Returns the value of the '<em><b>Outgoing Relations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.OMTTPOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Relations</em>' reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTClass_OutgoingRelations()
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OMTTPOperation> getOutgoingRelations( );

} // OMTClass
