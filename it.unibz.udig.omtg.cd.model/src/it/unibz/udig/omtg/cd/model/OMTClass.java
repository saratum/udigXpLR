/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

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
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClass#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass()
 * @model
 * @generated
 */
public interface OMTClass extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTClassDiagram)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Diagram()
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	OMTClassDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTClass#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTClassDiagram value );

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
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Name()
	 * @model default="< ... >"
	 * @generated
	 */
	String getName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTClass#getName <em>Name</em>}' attribute.
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
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Constraint()
	 * @model default="0,0,50,50" dataType="it.unibz.udig.omtg.cd.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraint( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTClass#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint( Rectangle value );

	/**
	 * Returns the value of the '<em><b>Incoming Relations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.OMTRelationship}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relations</em>' reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_IncomingRelations()
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<OMTRelationship> getIncomingRelations( );

	/**
	 * Returns the value of the '<em><b>Outgoing Relations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.OMTRelationship}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Relations</em>' reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_OutgoingRelations()
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OMTRelationship> getOutgoingRelations( );

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.ClassAttribute}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Attributes()
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassAttribute> getAttributes( );

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.ClassOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Operations()
	 * @see it.unibz.udig.omtg.cd.model.ClassOperation#getOmtclass
	 * @model opposite="omtclass" containment="true"
	 * @generated
	 */
	EList<ClassOperation> getOperations( );

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClass_Multiplicity()
	 * @model default="*"
	 * @generated
	 */
	Multiplicity getMultiplicity( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTClass#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity( Multiplicity value );

} // OMTClass
