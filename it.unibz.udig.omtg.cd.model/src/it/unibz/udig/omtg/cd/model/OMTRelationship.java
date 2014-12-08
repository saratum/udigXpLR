/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getType <em>Type</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getRule <em>Rule</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship()
 * @model
 * @generated
 */
public interface OMTRelationship extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTClassDiagram)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Diagram()
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram#getRelations
	 * @model opposite="relations" transient="false"
	 * @generated
	 */
	OMTClassDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTClassDiagram value );

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OMTClass)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Target()
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getIncomingRelations
	 * @model opposite="incomingRelations"
	 * @generated
	 */
	OMTClass getTarget( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OMTClass)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Source()
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getOutgoingRelations
	 * @model opposite="outgoingRelations"
	 * @generated
	 */
	OMTClass getSource( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource( OMTClass value );

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
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Bendpoints()
	 * @model dataType="it.unibz.udig.omtg.cd.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints( );

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Simple association"</code>.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.OMTRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationshipType
	 * @see #setType(OMTRelationshipType)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Type()
	 * @model default="Simple association"
	 * @generated
	 */
	OMTRelationshipType getType( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType( OMTRelationshipType value );

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link it.unibz.udig.omtg.cd.model.SpatialIntegrityRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.SpatialIntegrityRule
	 * @see #setRule(SpatialIntegrityRule)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Rule()
	 * @model default="NONE"
	 * @generated
	 */
	SpatialIntegrityRule getRule( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see it.unibz.udig.omtg.cd.model.SpatialIntegrityRule
	 * @see #getRule()
	 * @generated
	 */
	void setRule( SpatialIntegrityRule value );

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTRelationship_Label()
	 * @model
	 * @generated
	 */
	String getLabel( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel( String value );

} // OMTRelationship
