/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMTTP Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation()
 * @model
 * @generated
 */
public interface OMTTPOperation extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTPresentationDiagram)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation_Diagram()
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	OMTPresentationDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTPresentationDiagram value );

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation <em>Incoming Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OMTPresentationSpecification)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation_Target()
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation
	 * @model opposite="incomingOperation"
	 * @generated
	 */
	OMTPresentationSpecification getTarget( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget( OMTPresentationSpecification value );

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OMTClass)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation_Source()
	 * @see it.unibz.udig.omtg.pd.model.OMTClass#getOutgoingRelations
	 * @model opposite="outgoingRelations"
	 * @generated
	 */
	OMTClass getSource( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation_Expression()
	 * @model
	 * @generated
	 */
	String getExpression( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression( String value );

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTTPOperation_Bendpoints()
	 * @model dataType="it.unibz.udig.omtg.pd.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints( );

} // OMTTPOperation
