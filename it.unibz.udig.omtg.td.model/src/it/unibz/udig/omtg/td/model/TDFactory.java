/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.td.model.TDPackage
 * @generated
 */
public interface TDFactory extends EFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TDFactory	eINSTANCE	= it.unibz.udig.omtg.td.model.impl.TDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OMT Transformation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Transformation Diagram</em>'.
	 * @generated
	 */
	OMTTransformationDiagram createOMTTransformationDiagram( );

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
	 * Returns a new object of class '<em>OMT Geo Object Geometry Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Geo Object Geometry Class</em>'.
	 * @generated
	 */
	OMTGeoObjectGeometryClass createOMTGeoObjectGeometryClass( );

	/**
	 * Returns a new object of class '<em>OMT Geo Object Topology Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Geo Object Topology Class</em>'.
	 * @generated
	 */
	OMTGeoObjectTopologyClass createOMTGeoObjectTopologyClass( );

	/**
	 * Returns a new object of class '<em>OMTTD Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMTTD Connection</em>'.
	 * @generated
	 */
	OMTTDConnection createOMTTDConnection( );

	/**
	 * Returns a new object of class '<em>OMT Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMT Operation</em>'.
	 * @generated
	 */
	OMTOperation createOMTOperation( );

	/**
	 * Returns a new object of class '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Element</em>'.
	 * @generated
	 */
	ClassElement createClassElement( );

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
	 * Returns a new object of class '<em>OMTTR Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMTTR Operation</em>'.
	 * @generated
	 */
	OMTTROperation createOMTTROperation( );

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TDPackage getTDPackage( );

} //TDFactory
