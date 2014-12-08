/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.ClassAttribute#isKey <em>Key</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.cd.model.CDPackage#getClassAttribute()
 * @model
 * @generated
 */
public interface ClassAttribute extends ClassElement
{

	/**
	 * Returns the value of the '<em><b>Omtclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.cd.model.OMTClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omtclass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omtclass</em>' container reference.
	 * @see #setOmtclass(OMTClass)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getClassAttribute_Omtclass()
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	OMTClass getOmtclass( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omtclass</em>' container reference.
	 * @see #getOmtclass()
	 * @generated
	 */
	void setOmtclass( OMTClass value );

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getClassAttribute_Key()
	 * @model
	 * @generated
	 */
	boolean isKey( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey( boolean value );

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#getClassAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue( String value );

} // ClassAttribute
