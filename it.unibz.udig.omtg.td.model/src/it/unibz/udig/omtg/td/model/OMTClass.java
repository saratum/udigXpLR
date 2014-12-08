/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation <em>Incoming Tr Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation <em>Outgoing Tr Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTClass#isTemporary <em>Temporary</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass()
 * @model
 * @generated
 */
public interface OMTClass extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTTransformationDiagram)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Diagram()
	 * @see it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	OMTTransformationDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTTransformationDiagram value );

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
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Name()
	 * @model default="< ... >"
	 * @generated
	 */
	String getName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName( String value );

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The default value is <code>"0,0,50,50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(Rectangle)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Constraint()
	 * @model default="0,0,50,50" dataType="it.unibz.udig.omtg.td.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraint( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint( Rectangle value );

	/**
	 * Returns the value of the '<em><b>Incoming Relations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.OMTOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTOperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relations</em>' reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_IncomingRelations()
	 * @see it.unibz.udig.omtg.td.model.OMTOperation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<OMTOperation> getIncomingRelations( );

	/**
	 * Returns the value of the '<em><b>Outgoing Relations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.OMTOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTOperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Relations</em>' reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_OutgoingRelations()
	 * @see it.unibz.udig.omtg.td.model.OMTOperation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OMTOperation> getOutgoingRelations( );

	/**
	 * Returns the value of the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Tr Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Tr Operation</em>' reference.
	 * @see #setIncomingTrOperation(OMTTROperation)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_IncomingTrOperation()
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	OMTTROperation getIncomingTrOperation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation <em>Incoming Tr Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Tr Operation</em>' reference.
	 * @see #getIncomingTrOperation()
	 * @generated
	 */
	void setIncomingTrOperation( OMTTROperation value );

	/**
	 * Returns the value of the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Tr Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Tr Operation</em>' reference.
	 * @see #setOutgoingTrOperation(OMTTROperation)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_OutgoingTrOperation()
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	OMTTROperation getOutgoingTrOperation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation <em>Outgoing Tr Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Tr Operation</em>' reference.
	 * @see #getOutgoingTrOperation()
	 * @generated
	 */
	void setOutgoingTrOperation( OMTTROperation value );

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.ClassAttribute}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Attributes()
	 * @see it.unibz.udig.omtg.td.model.ClassAttribute#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassAttribute> getAttributes( );

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.ClassOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Operations()
	 * @see it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassOperation> getOperations( );

	/**
	 * Returns the value of the '<em><b>Temporary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporary</em>' attribute.
	 * @see #setTemporary(boolean)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTClass_Temporary()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTemporary( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTClass#isTemporary <em>Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporary</em>' attribute.
	 * @see #isTemporary()
	 * @generated
	 */
	void setTemporary( boolean value );

} // OMTClass
