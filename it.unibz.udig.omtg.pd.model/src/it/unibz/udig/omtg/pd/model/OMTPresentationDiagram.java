/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Presentation Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getObjects <em>Objects</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationDiagram()
 * @model
 * @generated
 */
public interface OMTPresentationDiagram extends EObject
{

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.OMTPDNode}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationDiagram_Objects()
	 * @see it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTPDNode> getObjects( );

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.OMTTPOperation}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationDiagram_Operations()
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<OMTTPOperation> getOperations( );

} // OMTPresentationDiagram
