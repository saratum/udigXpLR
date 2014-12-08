/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTOperation#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTOperation#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTOperation()
 * @model
 * @generated
 */
public interface OMTOperation extends OMTTDConnection
{

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OMTClass)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTOperation_Target()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getIncomingRelations
	 * @model opposite="incomingRelations"
	 * @generated
	 */
	OMTClass getTarget( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTOperation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OMTClass)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTOperation_Source()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOutgoingRelations
	 * @model opposite="outgoingRelations"
	 * @generated
	 */
	OMTClass getSource( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTOperation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTOperation_Operator()
	 * @model
	 * @generated
	 */
	String getOperator( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator( String value );

} // OMTOperation
