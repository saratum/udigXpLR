/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.td.model.TDFactory
 * @model kind="package"
 * @generated
 */
public interface TDPackage extends EPackage
{

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNAME													= "td";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_URI													= "it.unibz.udig/omtg/td";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_PREFIX												= "td";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TDPackage	eINSTANCE												= it.unibz.udig.omtg.td.model.impl.TDPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl <em>OMT Transformation Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTransformationDiagram()
	 * @generated
	 */
	int			OMT_TRANSFORMATION_DIAGRAM								= 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_TRANSFORMATION_DIAGRAM__CLASSES						= 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_TRANSFORMATION_DIAGRAM__RELATIONS					= 1;

	/**
	 * The number of structural features of the '<em>OMT Transformation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_TRANSFORMATION_DIAGRAM_FEATURE_COUNT				= 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTClass()
	 * @generated
	 */
	int			OMT_CLASS												= 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__DIAGRAM										= 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__NAME											= 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__CONSTRAINT									= 2;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__INCOMING_RELATIONS							= 3;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OUTGOING_RELATIONS							= 4;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__INCOMING_TR_OPERATION						= 5;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OUTGOING_TR_OPERATION						= 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__ATTRIBUTES									= 7;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OPERATIONS									= 8;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__TEMPORARY									= 9;

	/**
	 * The number of structural features of the '<em>OMT Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_FEATURE_COUNT									= 10;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTConventionalClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTConventionalClass()
	 * @generated
	 */
	int			OMT_CONVENTIONAL_CLASS									= 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__DIAGRAM							= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__NAME							= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__CONSTRAINT						= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__INCOMING_RELATIONS				= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OUTGOING_RELATIONS				= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__INCOMING_TR_OPERATION			= OMT_CLASS__INCOMING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OUTGOING_TR_OPERATION			= OMT_CLASS__OUTGOING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__ATTRIBUTES						= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OPERATIONS						= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__TEMPORARY						= OMT_CLASS__TEMPORARY;

	/**
	 * The number of structural features of the '<em>OMT Conventional Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS_FEATURE_COUNT					= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoreferencedClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoreferencedClass()
	 * @generated
	 */
	int			OMT_GEOREFERENCED_CLASS									= 3;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__DIAGRAM						= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__NAME							= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__CONSTRAINT						= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__INCOMING_RELATIONS				= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OUTGOING_RELATIONS				= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__INCOMING_TR_OPERATION			= OMT_CLASS__INCOMING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OUTGOING_TR_OPERATION			= OMT_CLASS__OUTGOING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__ATTRIBUTES						= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OPERATIONS						= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__TEMPORARY						= OMT_CLASS__TEMPORARY;

	/**
	 * The number of structural features of the '<em>OMT Georeferenced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS_FEATURE_COUNT					= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoFieldClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoFieldClass()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS										= 4;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__DIAGRAM							= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__NAME								= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__CONSTRAINT							= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__INCOMING_RELATIONS					= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OUTGOING_RELATIONS					= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__INCOMING_TR_OPERATION				= OMT_CLASS__INCOMING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OUTGOING_TR_OPERATION				= OMT_CLASS__OUTGOING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__ATTRIBUTES							= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OPERATIONS							= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__TEMPORARY							= OMT_CLASS__TEMPORARY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__REPRESENTATION						= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Field Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS_FEATURE_COUNT						= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoObjectGeometryClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS							= 5;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__DIAGRAM					= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__NAME						= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__CONSTRAINT				= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__INCOMING_RELATIONS		= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OUTGOING_RELATIONS		= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__INCOMING_TR_OPERATION	= OMT_CLASS__INCOMING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OUTGOING_TR_OPERATION	= OMT_CLASS__OUTGOING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__ATTRIBUTES				= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OPERATIONS				= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__TEMPORARY				= OMT_CLASS__TEMPORARY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION			= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Object Geometry Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoObjectTopologyClassImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS							= 6;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__DIAGRAM					= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__NAME						= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__CONSTRAINT				= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__INCOMING_RELATIONS		= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OUTGOING_RELATIONS		= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Incoming Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__INCOMING_TR_OPERATION	= OMT_CLASS__INCOMING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Outgoing Tr Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OUTGOING_TR_OPERATION	= OMT_CLASS__OUTGOING_TR_OPERATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__ATTRIBUTES				= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OPERATIONS				= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__TEMPORARY				= OMT_CLASS__TEMPORARY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION			= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Object Topology Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl <em>OMTTD Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTDConnection()
	 * @generated
	 */
	int			OMTTD_CONNECTION										= 7;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTD_CONNECTION__DIAGRAM								= 0;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTD_CONNECTION__BENDPOINTS							= 1;

	/**
	 * The number of structural features of the '<em>OMTTD Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTD_CONNECTION_FEATURE_COUNT							= 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTOperationImpl <em>OMT Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTOperationImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTOperation()
	 * @generated
	 */
	int			OMT_OPERATION											= 8;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION__DIAGRAM									= OMTTD_CONNECTION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION__BENDPOINTS								= OMTTD_CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION__TARGET									= OMTTD_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION__SOURCE									= OMTTD_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION__OPERATOR									= OMTTD_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OMT Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_OPERATION_FEATURE_COUNT								= OMTTD_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.ClassElementImpl <em>Class Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.ClassElementImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassElement()
	 * @generated
	 */
	int			CLASS_ELEMENT											= 10;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.ClassAttributeImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassAttribute()
	 * @generated
	 */
	int			CLASS_ATTRIBUTE											= 11;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.ClassOperationImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassOperation()
	 * @generated
	 */
	int			CLASS_OPERATION											= 12;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTROperationImpl <em>OMTTR Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.impl.OMTTROperationImpl
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTROperation()
	 * @generated
	 */
	int			OMTTR_OPERATION											= 9;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION__DIAGRAM								= OMTTD_CONNECTION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION__BENDPOINTS								= OMTTD_CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION__TARGET									= OMTTD_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION__SOURCE									= OMTTD_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION__OPERATION								= OMTTD_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OMTTR Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTR_OPERATION_FEATURE_COUNT							= OMTTD_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT__NAME										= 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT__TYPE										= 1;

	/**
	 * The number of structural features of the '<em>Class Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT_FEATURE_COUNT								= 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__NAME									= CLASS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__TYPE									= CLASS_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__OMTCLASS								= CLASS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__KEY									= CLASS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE_FEATURE_COUNT							= CLASS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__NAME									= CLASS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__TYPE									= CLASS_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__OMTCLASS								= CLASS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION_FEATURE_COUNT							= CLASS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoFieldClassKind()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS_KIND								= 13;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectGeometryClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND						= 14;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectTopologyClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND						= 15;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.td.model.TROperatorKind <em>TR Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.td.model.TROperatorKind
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getTROperatorKind()
	 * @generated
	 */
	int			TR_OPERATOR_KIND										= 16;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getRectangle()
	 * @generated
	 */
	int			RECTANGLE												= 17;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getPoint()
	 * @generated
	 */
	int			POINT													= 18;

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram <em>OMT Transformation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Transformation Diagram</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTransformationDiagram
	 * @generated
	 */
	EClass getOMTTransformationDiagram( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getClasses()
	 * @see #getOMTTransformationDiagram()
	 * @generated
	 */
	EReference getOMTTransformationDiagram_Classes( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTransformationDiagram#getRelations()
	 * @see #getOMTTransformationDiagram()
	 * @generated
	 */
	EReference getOMTTransformationDiagram_Relations( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTClass <em>OMT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass
	 * @generated
	 */
	EClass getOMTClass( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.td.model.OMTClass#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getDiagram()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Diagram( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getName()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Name( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTClass#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getConstraint()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Constraint( );

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Relations</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getIncomingRelations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_IncomingRelations( );

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Relations</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOutgoingRelations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_OutgoingRelations( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation <em>Incoming Tr Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Tr Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getIncomingTrOperation()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_IncomingTrOperation( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation <em>Outgoing Tr Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Tr Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOutgoingTrOperation()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_OutgoingTrOperation( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.td.model.OMTClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getAttributes()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Attributes( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.td.model.OMTClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#getOperations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Operations( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTClass#isTemporary <em>Temporary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporary</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTClass#isTemporary()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Temporary( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTConventionalClass <em>OMT Conventional Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Conventional Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTConventionalClass
	 * @generated
	 */
	EClass getOMTConventionalClass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTGeoreferencedClass <em>OMT Georeferenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Georeferenced Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoreferencedClass
	 * @generated
	 */
	EClass getOMTGeoreferencedClass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTGeoFieldClass <em>OMT Geo Field Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Field Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoFieldClass
	 * @generated
	 */
	EClass getOMTGeoFieldClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTGeoFieldClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoFieldClass#getRepresentation()
	 * @see #getOMTGeoFieldClass()
	 * @generated
	 */
	EAttribute getOMTGeoFieldClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass <em>OMT Geo Object Geometry Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Geometry Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass
	 * @generated
	 */
	EClass getOMTGeoObjectGeometryClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass#getRepresentation()
	 * @see #getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectGeometryClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass <em>OMT Geo Object Topology Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Topology Class</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass
	 * @generated
	 */
	EClass getOMTGeoObjectTopologyClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass#getRepresentation()
	 * @see #getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectTopologyClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTTDConnection <em>OMTTD Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMTTD Connection</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTDConnection
	 * @generated
	 */
	EClass getOMTTDConnection( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTDConnection#getDiagram()
	 * @see #getOMTTDConnection()
	 * @generated
	 */
	EReference getOMTTDConnection_Diagram( );

	/**
	 * Returns the meta object for the attribute list '{@link it.unibz.udig.omtg.td.model.OMTTDConnection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTDConnection#getBendpoints()
	 * @see #getOMTTDConnection()
	 * @generated
	 */
	EAttribute getOMTTDConnection_Bendpoints( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTOperation <em>OMT Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTOperation
	 * @generated
	 */
	EClass getOMTOperation( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTOperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTOperation#getTarget()
	 * @see #getOMTOperation()
	 * @generated
	 */
	EReference getOMTOperation_Target( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTOperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTOperation#getSource()
	 * @see #getOMTOperation()
	 * @generated
	 */
	EReference getOMTOperation_Source( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTOperation#getOperator()
	 * @see #getOMTOperation()
	 * @generated
	 */
	EAttribute getOMTOperation_Operator( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Element</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassElement
	 * @generated
	 */
	EClass getClassElement( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.ClassElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassElement#getName()
	 * @see #getClassElement()
	 * @generated
	 */
	EAttribute getClassElement_Name( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.ClassElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassElement#getType()
	 * @see #getClassElement()
	 * @generated
	 */
	EAttribute getClassElement_Type( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.td.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassAttribute#getOmtclass()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Omtclass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.ClassAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassAttribute#isKey()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Key( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassOperation
	 * @generated
	 */
	EClass getClassOperation( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.td.model.ClassOperation#getOmtclass()
	 * @see #getClassOperation()
	 * @generated
	 */
	EReference getClassOperation_Omtclass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.td.model.OMTTROperation <em>OMTTR Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMTTR Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation
	 * @generated
	 */
	EClass getOMTTROperation( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation#getTarget()
	 * @see #getOMTTROperation()
	 * @generated
	 */
	EReference getOMTTROperation_Target( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation#getSource()
	 * @see #getOMTTROperation()
	 * @generated
	 */
	EReference getOMTTROperation_Source( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.td.model.OMTTROperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTTROperation#getOperation()
	 * @see #getOMTTROperation()
	 * @generated
	 */
	EAttribute getOMTTROperation_Operation( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Field Class Kind</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind
	 * @generated
	 */
	EEnum getOMTGeoFieldClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Geometry Class Kind</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectGeometryClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Topology Class Kind</em>'.
	 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectTopologyClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.td.model.TROperatorKind <em>TR Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TR Operator Kind</em>'.
	 * @see it.unibz.udig.omtg.td.model.TROperatorKind
	 * @generated
	 */
	EEnum getTROperatorKind( );

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle( );

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint( );

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TDFactory getTDFactory( );

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl <em>OMT Transformation Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTransformationDiagram()
		 * @generated
		 */
		EClass		OMT_TRANSFORMATION_DIAGRAM						= eINSTANCE.getOMTTransformationDiagram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_TRANSFORMATION_DIAGRAM__CLASSES				= eINSTANCE.getOMTTransformationDiagram_Classes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_TRANSFORMATION_DIAGRAM__RELATIONS			= eINSTANCE.getOMTTransformationDiagram_Relations();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTClass()
		 * @generated
		 */
		EClass		OMT_CLASS										= eINSTANCE.getOMTClass();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__DIAGRAM								= eINSTANCE.getOMTClass_Diagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_CLASS__NAME									= eINSTANCE.getOMTClass_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_CLASS__CONSTRAINT							= eINSTANCE.getOMTClass_Constraint();

		/**
		 * The meta object literal for the '<em><b>Incoming Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__INCOMING_RELATIONS					= eINSTANCE.getOMTClass_IncomingRelations();

		/**
		 * The meta object literal for the '<em><b>Outgoing Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__OUTGOING_RELATIONS					= eINSTANCE.getOMTClass_OutgoingRelations();

		/**
		 * The meta object literal for the '<em><b>Incoming Tr Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__INCOMING_TR_OPERATION				= eINSTANCE.getOMTClass_IncomingTrOperation();

		/**
		 * The meta object literal for the '<em><b>Outgoing Tr Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__OUTGOING_TR_OPERATION				= eINSTANCE.getOMTClass_OutgoingTrOperation();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__ATTRIBUTES							= eINSTANCE.getOMTClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__OPERATIONS							= eINSTANCE.getOMTClass_Operations();

		/**
		 * The meta object literal for the '<em><b>Temporary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_CLASS__TEMPORARY							= eINSTANCE.getOMTClass_Temporary();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTConventionalClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTConventionalClass()
		 * @generated
		 */
		EClass		OMT_CONVENTIONAL_CLASS							= eINSTANCE.getOMTConventionalClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoreferencedClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoreferencedClass()
		 * @generated
		 */
		EClass		OMT_GEOREFERENCED_CLASS							= eINSTANCE.getOMTGeoreferencedClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoFieldClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoFieldClass()
		 * @generated
		 */
		EClass		OMT_GEO_FIELD_CLASS								= eINSTANCE.getOMTGeoFieldClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_FIELD_CLASS__REPRESENTATION				= eINSTANCE.getOMTGeoFieldClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoObjectGeometryClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectGeometryClass()
		 * @generated
		 */
		EClass		OMT_GEO_OBJECT_GEOMETRY_CLASS					= eINSTANCE.getOMTGeoObjectGeometryClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION	= eINSTANCE.getOMTGeoObjectGeometryClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTGeoObjectTopologyClassImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectTopologyClass()
		 * @generated
		 */
		EClass		OMT_GEO_OBJECT_TOPOLOGY_CLASS					= eINSTANCE.getOMTGeoObjectTopologyClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION	= eINSTANCE.getOMTGeoObjectTopologyClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl <em>OMTTD Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTDConnection()
		 * @generated
		 */
		EClass		OMTTD_CONNECTION								= eINSTANCE.getOMTTDConnection();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTD_CONNECTION__DIAGRAM						= eINSTANCE.getOMTTDConnection_Diagram();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMTTD_CONNECTION__BENDPOINTS					= eINSTANCE.getOMTTDConnection_Bendpoints();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTOperationImpl <em>OMT Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTOperationImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTOperation()
		 * @generated
		 */
		EClass		OMT_OPERATION									= eINSTANCE.getOMTOperation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_OPERATION__TARGET							= eINSTANCE.getOMTOperation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_OPERATION__SOURCE							= eINSTANCE.getOMTOperation_Source();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_OPERATION__OPERATOR							= eINSTANCE.getOMTOperation_Operator();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.ClassElementImpl <em>Class Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.ClassElementImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassElement()
		 * @generated
		 */
		EClass		CLASS_ELEMENT									= eINSTANCE.getClassElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	CLASS_ELEMENT__NAME								= eINSTANCE.getClassElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	CLASS_ELEMENT__TYPE								= eINSTANCE.getClassElement_Type();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.ClassAttributeImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass		CLASS_ATTRIBUTE									= eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Omtclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	CLASS_ATTRIBUTE__OMTCLASS						= eINSTANCE.getClassAttribute_Omtclass();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	CLASS_ATTRIBUTE__KEY							= eINSTANCE.getClassAttribute_Key();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.ClassOperationImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getClassOperation()
		 * @generated
		 */
		EClass		CLASS_OPERATION									= eINSTANCE.getClassOperation();

		/**
		 * The meta object literal for the '<em><b>Omtclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	CLASS_OPERATION__OMTCLASS						= eINSTANCE.getClassOperation_Omtclass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.impl.OMTTROperationImpl <em>OMTTR Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.impl.OMTTROperationImpl
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTTROperation()
		 * @generated
		 */
		EClass		OMTTR_OPERATION									= eINSTANCE.getOMTTROperation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTR_OPERATION__TARGET							= eINSTANCE.getOMTTROperation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTR_OPERATION__SOURCE							= eINSTANCE.getOMTTROperation_Source();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMTTR_OPERATION__OPERATION						= eINSTANCE.getOMTTROperation_Operation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoFieldClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_FIELD_CLASS_KIND						= eINSTANCE.getOMTGeoFieldClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectGeometryClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND				= eINSTANCE.getOMTGeoObjectGeometryClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getOMTGeoObjectTopologyClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND				= eINSTANCE.getOMTGeoObjectTopologyClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.td.model.TROperatorKind <em>TR Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.td.model.TROperatorKind
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getTROperatorKind()
		 * @generated
		 */
		EEnum		TR_OPERATOR_KIND								= eINSTANCE.getTROperatorKind();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType	RECTANGLE										= eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see it.unibz.udig.omtg.td.model.impl.TDPackageImpl#getPoint()
		 * @generated
		 */
		EDataType	POINT											= eINSTANCE.getPoint();

	}

} //TDPackage
