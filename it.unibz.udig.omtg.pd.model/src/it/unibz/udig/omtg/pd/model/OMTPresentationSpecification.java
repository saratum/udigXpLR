/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMT Presentation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getClassName <em>Class Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPictogramList <em>Pictogram List</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation <em>Incoming Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification()
 * @model
 * @generated
 */
public interface OMTPresentationSpecification extends OMTPDNode
{

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"< ... >"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_ClassName()
	 * @model default="< ... >"
	 * @generated
	 */
	String getClassName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName( String value );

	/**
	 * Returns the value of the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Name</em>' attribute.
	 * @see #setPresentationName(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_PresentationName()
	 * @model
	 * @generated
	 */
	String getPresentationName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPresentationName <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Name</em>' attribute.
	 * @see #getPresentationName()
	 * @generated
	 */
	void setPresentationName( String value );

	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName( String value );

	/**
	 * Returns the value of the '<em><b>Pictogram List</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.Pictogram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictogram List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictogram List</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_PictogramList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pictogram> getPictogramList( );

	/**
	 * Returns the value of the '<em><b>Incoming Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Operation</em>' reference.
	 * @see #setIncomingOperation(OMTTPOperation)
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_IncomingOperation()
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	OMTTPOperation getIncomingOperation( );

	/**
	 * Sets the value of the '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation <em>Incoming Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Operation</em>' reference.
	 * @see #getIncomingOperation()
	 * @generated
	 */
	void setIncomingOperation( OMTTPOperation value );

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.udig.omtg.pd.model.OMTSpecification}.
	 * It is bidirectional and its opposite is '{@link it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification <em>Presentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#getOMTPresentationSpecification_Specification()
	 * @see it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification
	 * @model opposite="presentationSpecification" containment="true"
	 * @generated
	 */
	EList<OMTSpecification> getSpecification( );

} // OMTPresentationSpecification
