/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.OMTAggregation#isSpatial <em>Spatial</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTAggregation()
 * @model
 * @generated
 */
public interface OMTAggregation extends OMTRelationship
{

	/**
	 * Returns the value of the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spatial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' attribute.
	 * @see #setSpatial(boolean)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getOMTAggregation_Spatial()
	 * @model
	 * @generated
	 */
	boolean isSpatial( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.OMTAggregation#isSpatial <em>Spatial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' attribute.
	 * @see #isSpatial()
	 * @generated
	 */
	void setSpatial( boolean value );

} // OMTAggregation
