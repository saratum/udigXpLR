/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMTPD Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPDNode()
 * @model
 * @generated
 */
public interface OMTPDNode extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTPresentationDiagram)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPDNode_Diagram()
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getObjects
	 * @model opposite="objects" transient="false"
	 * @generated
	 */
	OMTPresentationDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTPresentationDiagram value );

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The default value is <code>"0,0,100,100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(Rectangle)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPDNode_Constraint()
	 * @model default="0,0,100,100" dataType="it.unibz.udig.omtg.pd.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraint( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint( Rectangle value );

} // OMTPDNode
