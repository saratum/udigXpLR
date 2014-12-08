/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pictogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.Pictogram#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.Pictogram#getImageFileLocation <em>Image File Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getPictogram()
 * @model
 * @generated
 */
public interface Pictogram extends EObject
{

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' attribute.
	 * @see #setMeaning(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getPictogram_Meaning()
	 * @model
	 * @generated
	 */
	String getMeaning( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.Pictogram#getMeaning <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' attribute.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning( String value );

	/**
	 * Returns the value of the '<em><b>Image File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image File Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image File Location</em>' attribute.
	 * @see #setImageFileLocation(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getPictogram_ImageFileLocation()
	 * @model
	 * @generated
	 */
	String getImageFileLocation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.Pictogram#getImageFileLocation <em>Image File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image File Location</em>' attribute.
	 * @see #getImageFileLocation()
	 * @generated
	 */
	void setImageFileLocation( String value );

} // Pictogram
