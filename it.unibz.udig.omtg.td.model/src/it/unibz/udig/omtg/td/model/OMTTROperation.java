/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMTTR Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTROperation#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTROperation#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTROperation#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTROperation()
 * @model
 * @generated
 */
public interface OMTTROperation extends OMTTDConnection
{

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation <em>Incoming Tr Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OMTClass)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTROperation_Target()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation
	 * @model opposite="incomingTrOperation"
	 * @generated
	 */
	OMTClass getTarget( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation <em>Outgoing Tr Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OMTClass)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTROperation_Source()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation
	 * @model opposite="outgoingTrOperation"
	 * @generated
	 */
	OMTClass getSource( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>"Centroid determination"</code>.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.td.model.TROperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see it.unibz.udig.omtg.td.model.TROperatorKind
	 * @see #setOperation(TROperatorKind)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTROperation_Operation()
	 * @model default="Centroid determination"
	 * @generated
	 */
	TROperatorKind getOperation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see it.unibz.udig.omtg.td.model.TROperatorKind
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation( TROperatorKind value );

} // OMTTROperation
