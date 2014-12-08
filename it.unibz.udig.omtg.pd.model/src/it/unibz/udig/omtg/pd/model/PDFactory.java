/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.pd.model.PDPackage
 * @generated
 */
public interface PDFactory extends EFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PDFactory	eINSTANCE	= it.unibz.udig.omtg.pd.model.impl.PDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OMTPD Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMTPD Node</em>'.
	 * @generated
	 */
	OMTPDNode createOMTPDNode( );

	/**
	 * Returns a new object of class '<em>OMT Presentation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Presentation Diagram</em>'.
	 * @generated
	 */
	OMTPresentationDiagram createOMTPresentationDiagram( );

	/**
	 * Returns a new object of class '<em>OMTTP Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMTTP Operation</em>'.
	 * @generated
	 */
	OMTTPOperation createOMTTPOperation( );

	/**
	 * Returns a new object of class '<em>OMT Presentation Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Presentation Specification</em>'.
	 * @generated
	 */
	OMTPresentationSpecification createOMTPresentationSpecification( );

	/**
	 * Returns a new object of class '<em>OMT Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Specification</em>'.
	 * @generated
	 */
	OMTSpecification createOMTSpecification( );

	/**
	 * Returns a new object of class '<em>Pictogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pictogram</em>'.
	 * @generated
	 */
	Pictogram createPictogram( );

	/**
	 * Returns a new object of class '<em>OMT Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Class</em>'.
	 * @generated
	 */
	OMTClass createOMTClass( );

	/**
	 * Returns a new object of class '<em>OMT Conventional Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Conventional Class</em>'.
	 * @generated
	 */
	OMTConventionalClass createOMTConventionalClass( );

	/**
	 * Returns a new object of class '<em>OMT Georeferenced Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Georeferenced Class</em>'.
	 * @generated
	 */
	OMTGeoreferencedClass createOMTGeoreferencedClass( );

	/**
	 * Returns a new object of class '<em>OMT Geo Field Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Geo Field Class</em>'.
	 * @generated
	 */
	OMTGeoFieldClass createOMTGeoFieldClass( );

	/**
	 * Returns a new object of class '<em>OMT Geo Object Topology Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Geo Object Topology Class</em>'.
	 * @generated
	 */
	OMTGeoObjectTopologyClass createOMTGeoObjectTopologyClass( );

	/**
	 * Returns a new object of class '<em>OMT Geo Object Geometry Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Geo Object Geometry Class</em>'.
	 * @generated
	 */
	OMTGeoObjectGeometryClass createOMTGeoObjectGeometryClass( );

	/**
	 * Returns a new object of class '<em>Name Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Value Element</em>'.
	 * @generated
	 */
	NameValueElement createNameValueElement( );

	/**
	 * Returns a new object of class '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Attribute</em>'.
	 * @generated
	 */
	ClassAttribute createClassAttribute( );

	/**
	 * Returns a new object of class '<em>Class Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Operation</em>'.
	 * @generated
	 */
	ClassOperation createClassOperation( );

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PDPackage getPDPackage( );

} //PDFactory
