/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClassDiagram()
 * @model
 * @generated
 */
public interface OMTClassDiagram extends EObject
{

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.OMTClass}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClass#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClassDiagram_Classes()
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTClass> getClasses( );

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.cd.model.OMTRelationship}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTClassDiagram_Relations()
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTRelationship> getRelations( );

} // OMTClassDiagram
