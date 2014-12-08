/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Transformation Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTransformationDiagram()
 * @model
 * @generated
 */
public interface OMTTransformationDiagram extends EObject
{

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.OMTClass}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTClass#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTransformationDiagram_Classes()
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTClass> getClasses( );

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.td.model.OMTTDConnection}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTransformationDiagram_Relations()
	 * @see it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTTDConnection> getRelations( );

} // OMTTransformationDiagram
