/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMTTD Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTDConnection()
 * @model
 * @generated
 */
public interface OMTTDConnection extends EObject
{

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(OMTTransformationDiagram)
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTDConnection_Diagram()
	 * @see it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getRelations
	 * @model opposite="relations" transient="false"
	 * @generated
	 */
	OMTTransformationDiagram getDiagram( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram( OMTTransformationDiagram value );

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
	 * @see it.unibz.udig.omtg.td.model.TDPackage#getOMTTDConnection_Bendpoints()
	 * @model dataType="it.unibz.udig.omtg.td.model.Point"
	 * @generated
	 */
	EList<Point> getBendpoints( );

} // OMTTDConnection
