/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model;

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
 * @see it.unibz.udig.omtg.cd.model.CDFactory
 * @model kind="package"
 * @generated
 */
public interface CDPackage extends EPackage
{

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNAME												= "cd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_URI												= "it.unibz.udig/omtg/cd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_PREFIX											= "cd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDPackage	eINSTANCE											= it.unibz.udig.omtg.cd.model.impl.CDPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassElementImpl <em>Class Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.ClassElementImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassElement()
	 * @generated
	 */
	int			CLASS_ELEMENT										= 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.ClassOperationImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassOperation()
	 * @generated
	 */
	int			CLASS_OPERATION										= 3;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl <em>OMT Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTRelationship()
	 * @generated
	 */
	int			OMT_RELATIONSHIP									= 11;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl <em>OMT Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeneralization()
	 * @generated
	 */
	int			OMT_GENERALIZATION									= 10;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTClass()
	 * @generated
	 */
	int			OMT_CLASS											= 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoFieldClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoFieldClass()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS									= 7;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectGeometryClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS						= 8;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectTopologyClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS						= 9;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTAggregationImpl <em>OMT Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTAggregationImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTAggregation()
	 * @generated
	 */
	int			OMT_AGGREGATION										= 12;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassAttribute()
	 * @generated
	 */
	int			CLASS_ATTRIBUTE										= 4;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl <em>OMT Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTClassDiagram()
	 * @generated
	 */
	int			OMT_CLASS_DIAGRAM									= 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_DIAGRAM__CLASSES							= 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_DIAGRAM__RELATIONS						= 1;

	/**
	 * The number of structural features of the '<em>OMT Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_DIAGRAM_FEATURE_COUNT						= 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__DIAGRAM									= 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__NAME										= 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__CONSTRAINT								= 2;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__INCOMING_RELATIONS						= 3;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OUTGOING_RELATIONS						= 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__ATTRIBUTES								= 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OPERATIONS								= 6;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__MULTIPLICITY								= 7;

	/**
	 * The number of structural features of the '<em>OMT Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_FEATURE_COUNT								= 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT__NAME									= 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT__TYPE									= 1;

	/**
	 * The number of structural features of the '<em>Class Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ELEMENT_FEATURE_COUNT							= 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__NAME								= CLASS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__TYPE								= CLASS_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__OMTCLASS							= CLASS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION_FEATURE_COUNT						= CLASS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__NAME								= CLASS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__TYPE								= CLASS_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__OMTCLASS							= CLASS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__KEY								= CLASS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__DEFAULT_VALUE						= CLASS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE_FEATURE_COUNT						= CLASS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTConventionalClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTConventionalClass()
	 * @generated
	 */
	int			OMT_CONVENTIONAL_CLASS								= 5;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__DIAGRAM						= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__NAME						= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__CONSTRAINT					= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__INCOMING_RELATIONS			= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OUTGOING_RELATIONS			= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__ATTRIBUTES					= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OPERATIONS					= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__MULTIPLICITY				= OMT_CLASS__MULTIPLICITY;

	/**
	 * The number of structural features of the '<em>OMT Conventional Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoreferencedClassImpl
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoreferencedClass()
	 * @generated
	 */
	int			OMT_GEOREFERENCED_CLASS								= 6;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__DIAGRAM					= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__NAME						= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__CONSTRAINT					= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__INCOMING_RELATIONS			= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OUTGOING_RELATIONS			= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__ATTRIBUTES					= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OPERATIONS					= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__MULTIPLICITY				= OMT_CLASS__MULTIPLICITY;

	/**
	 * The number of structural features of the '<em>OMT Georeferenced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__DIAGRAM						= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__NAME							= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__CONSTRAINT						= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__INCOMING_RELATIONS				= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OUTGOING_RELATIONS				= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__ATTRIBUTES						= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OPERATIONS						= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__MULTIPLICITY					= OMT_CLASS__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__REPRESENTATION					= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Field Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS_FEATURE_COUNT					= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__DIAGRAM				= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__NAME					= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__CONSTRAINT			= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__INCOMING_RELATIONS	= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OUTGOING_RELATIONS	= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__ATTRIBUTES			= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OPERATIONS			= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__MULTIPLICITY			= OMT_CLASS__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION		= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Object Geometry Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS_FEATURE_COUNT			= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__DIAGRAM				= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__NAME					= OMT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__CONSTRAINT			= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__INCOMING_RELATIONS	= OMT_CLASS__INCOMING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OUTGOING_RELATIONS	= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__ATTRIBUTES			= OMT_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OPERATIONS			= OMT_CLASS__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__MULTIPLICITY			= OMT_CLASS__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION		= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Geo Object Topology Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS_FEATURE_COUNT			= OMT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__DIAGRAM							= 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__TARGET							= 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__SOURCE							= 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__BENDPOINTS						= 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__TYPE								= 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__RULE								= 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP__LABEL								= 6;

	/**
	 * The number of structural features of the '<em>OMT Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_RELATIONSHIP_FEATURE_COUNT						= 7;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__DIAGRAM							= OMT_RELATIONSHIP__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__TARGET							= OMT_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__SOURCE							= OMT_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__BENDPOINTS						= OMT_RELATIONSHIP__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__TYPE							= OMT_RELATIONSHIP__TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__RULE							= OMT_RELATIONSHIP__RULE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__LABEL							= OMT_RELATIONSHIP__LABEL;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__KIND							= OMT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION__TOTAL							= OMT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OMT Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GENERALIZATION_FEATURE_COUNT					= OMT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__DIAGRAM							= OMT_RELATIONSHIP__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__TARGET								= OMT_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__SOURCE								= OMT_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__BENDPOINTS							= OMT_RELATIONSHIP__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__TYPE								= OMT_RELATIONSHIP__TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__RULE								= OMT_RELATIONSHIP__RULE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__LABEL								= OMT_RELATIONSHIP__LABEL;

	/**
	 * The feature id for the '<em><b>Spatial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION__SPATIAL							= OMT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_AGGREGATION_FEATURE_COUNT						= OMT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.Multiplicity
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getMultiplicity()
	 * @generated
	 */
	int			MULTIPLICITY										= 13;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoFieldClassKind()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS_KIND							= 14;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectGeometryClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND					= 15;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectTopologyClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND					= 16;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.OMTRelationshipType <em>OMT Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationshipType
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTRelationshipType()
	 * @generated
	 */
	int			OMT_RELATIONSHIP_TYPE								= 17;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.SpatialIntegrityRule <em>Spatial Integrity Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.SpatialIntegrityRule
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getSpatialIntegrityRule()
	 * @generated
	 */
	int			SPATIAL_INTEGRITY_RULE								= 18;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.cd.model.GeneralizationKind <em>Generalization Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.cd.model.GeneralizationKind
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getGeneralizationKind()
	 * @generated
	 */
	int			GENERALIZATION_KIND									= 19;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getRectangle()
	 * @generated
	 */
	int			RECTANGLE											= 20;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getPoint()
	 * @generated
	 */
	int			POINT												= 21;

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassOperation
	 * @generated
	 */
	EClass getClassOperation( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.cd.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassOperation#getOmtclass()
	 * @see #getClassOperation()
	 * @generated
	 */
	EReference getClassOperation_Omtclass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization <em>OMT Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Generalization</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeneralization
	 * @generated
	 */
	EClass getOMTGeneralization( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeneralization#getKind()
	 * @see #getOMTGeneralization()
	 * @generated
	 */
	EAttribute getOMTGeneralization_Kind( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization#isTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeneralization#isTotal()
	 * @see #getOMTGeneralization()
	 * @generated
	 */
	EAttribute getOMTGeneralization_Total( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClass <em>OMT Geo Field Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Field Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClass
	 * @generated
	 */
	EClass getOMTGeoFieldClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClass#getRepresentation()
	 * @see #getOMTGeoFieldClass()
	 * @generated
	 */
	EAttribute getOMTGeoFieldClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass <em>OMT Geo Object Geometry Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Geometry Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass
	 * @generated
	 */
	EClass getOMTGeoObjectGeometryClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass#getRepresentation()
	 * @see #getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectGeometryClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass <em>OMT Geo Object Topology Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Topology Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass
	 * @generated
	 */
	EClass getOMTGeoObjectTopologyClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass#getRepresentation()
	 * @see #getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectTopologyClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTAggregation <em>OMT Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Aggregation</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTAggregation
	 * @generated
	 */
	EClass getOMTAggregation( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTAggregation#isSpatial <em>Spatial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTAggregation#isSpatial()
	 * @see #getOMTAggregation()
	 * @generated
	 */
	EAttribute getOMTAggregation_Spatial( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTRelationship <em>OMT Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Relationship</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship
	 * @generated
	 */
	EClass getOMTRelationship( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getDiagram()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EReference getOMTRelationship_Diagram( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getTarget()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EReference getOMTRelationship_Target( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getSource()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EReference getOMTRelationship_Source( );

	/**
	 * Returns the meta object for the attribute list '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getBendpoints()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EAttribute getOMTRelationship_Bendpoints( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getType()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EAttribute getOMTRelationship_Type( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getRule()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EAttribute getOMTRelationship_Rule( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTRelationship#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship#getLabel()
	 * @see #getOMTRelationship()
	 * @generated
	 */
	EAttribute getOMTRelationship_Label( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Element</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassElement
	 * @generated
	 */
	EClass getClassElement( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.ClassElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassElement#getName()
	 * @see #getClassElement()
	 * @generated
	 */
	EAttribute getClassElement_Name( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.ClassElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassElement#getType()
	 * @see #getClassElement()
	 * @generated
	 */
	EAttribute getClassElement_Type( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute#getOmtclass()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Omtclass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute#isKey()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Key( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.ClassAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute#getDefaultValue()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_DefaultValue( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram <em>OMT Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Class Diagram</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram
	 * @generated
	 */
	EClass getOMTClassDiagram( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram#getClasses()
	 * @see #getOMTClassDiagram()
	 * @generated
	 */
	EReference getOMTClassDiagram_Classes( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram#getRelations()
	 * @see #getOMTClassDiagram()
	 * @generated
	 */
	EReference getOMTClassDiagram_Relations( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTClass <em>OMT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass
	 * @generated
	 */
	EClass getOMTClass( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.cd.model.OMTClass#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getDiagram()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Diagram( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getName()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Name( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTClass#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getConstraint()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Constraint( );

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.udig.omtg.cd.model.OMTClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Relations</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getIncomingRelations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_IncomingRelations( );

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.udig.omtg.cd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Relations</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getOutgoingRelations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_OutgoingRelations( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.cd.model.OMTClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getAttributes()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Attributes( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.cd.model.OMTClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getOperations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Operations( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.cd.model.OMTClass#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass#getMultiplicity()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Multiplicity( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTConventionalClass <em>OMT Conventional Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Conventional Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTConventionalClass
	 * @generated
	 */
	EClass getOMTConventionalClass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass <em>OMT Georeferenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Georeferenced Class</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass
	 * @generated
	 */
	EClass getOMTGeoreferencedClass( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see it.unibz.udig.omtg.cd.model.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Field Class Kind</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind
	 * @generated
	 */
	EEnum getOMTGeoFieldClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Geometry Class Kind</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectGeometryClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Topology Class Kind</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectTopologyClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.OMTRelationshipType <em>OMT Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Relationship Type</em>'.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationshipType
	 * @generated
	 */
	EEnum getOMTRelationshipType( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.SpatialIntegrityRule <em>Spatial Integrity Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spatial Integrity Rule</em>'.
	 * @see it.unibz.udig.omtg.cd.model.SpatialIntegrityRule
	 * @generated
	 */
	EEnum getSpatialIntegrityRule( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.cd.model.GeneralizationKind <em>Generalization Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generalization Kind</em>'.
	 * @see it.unibz.udig.omtg.cd.model.GeneralizationKind
	 * @generated
	 */
	EEnum getGeneralizationKind( );

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
	CDFactory getCDFactory( );

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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.ClassOperationImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassOperation()
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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl <em>OMT Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeneralization()
		 * @generated
		 */
		EClass		OMT_GENERALIZATION								= eINSTANCE.getOMTGeneralization();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GENERALIZATION__KIND						= eINSTANCE.getOMTGeneralization_Kind();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GENERALIZATION__TOTAL						= eINSTANCE.getOMTGeneralization_Total();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoFieldClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoFieldClass()
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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectGeometryClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectGeometryClass()
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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoObjectTopologyClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectTopologyClass()
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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTAggregationImpl <em>OMT Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTAggregationImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTAggregation()
		 * @generated
		 */
		EClass		OMT_AGGREGATION									= eINSTANCE.getOMTAggregation();

		/**
		 * The meta object literal for the '<em><b>Spatial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_AGGREGATION__SPATIAL						= eINSTANCE.getOMTAggregation_Spatial();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl <em>OMT Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTRelationship()
		 * @generated
		 */
		EClass		OMT_RELATIONSHIP								= eINSTANCE.getOMTRelationship();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_RELATIONSHIP__DIAGRAM						= eINSTANCE.getOMTRelationship_Diagram();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_RELATIONSHIP__TARGET						= eINSTANCE.getOMTRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_RELATIONSHIP__SOURCE						= eINSTANCE.getOMTRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_RELATIONSHIP__BENDPOINTS					= eINSTANCE.getOMTRelationship_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_RELATIONSHIP__TYPE							= eINSTANCE.getOMTRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_RELATIONSHIP__RULE							= eINSTANCE.getOMTRelationship_Rule();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_RELATIONSHIP__LABEL							= eINSTANCE.getOMTRelationship_Label();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassElementImpl <em>Class Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.ClassElementImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassElement()
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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getClassAttribute()
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
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	CLASS_ATTRIBUTE__DEFAULT_VALUE					= eINSTANCE.getClassAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl <em>OMT Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTClassDiagram()
		 * @generated
		 */
		EClass		OMT_CLASS_DIAGRAM								= eINSTANCE.getOMTClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS_DIAGRAM__CLASSES						= eINSTANCE.getOMTClassDiagram_Classes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS_DIAGRAM__RELATIONS					= eINSTANCE.getOMTClassDiagram_Relations();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTClass()
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
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_CLASS__MULTIPLICITY							= eINSTANCE.getOMTClass_Multiplicity();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTConventionalClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTConventionalClass()
		 * @generated
		 */
		EClass		OMT_CONVENTIONAL_CLASS							= eINSTANCE.getOMTConventionalClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.impl.OMTGeoreferencedClassImpl
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoreferencedClass()
		 * @generated
		 */
		EClass		OMT_GEOREFERENCED_CLASS							= eINSTANCE.getOMTGeoreferencedClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.Multiplicity
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum		MULTIPLICITY									= eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoFieldClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_FIELD_CLASS_KIND						= eINSTANCE.getOMTGeoFieldClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectGeometryClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND				= eINSTANCE.getOMTGeoObjectGeometryClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTGeoObjectTopologyClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND				= eINSTANCE.getOMTGeoObjectTopologyClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.OMTRelationshipType <em>OMT Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.OMTRelationshipType
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getOMTRelationshipType()
		 * @generated
		 */
		EEnum		OMT_RELATIONSHIP_TYPE							= eINSTANCE.getOMTRelationshipType();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.SpatialIntegrityRule <em>Spatial Integrity Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.SpatialIntegrityRule
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getSpatialIntegrityRule()
		 * @generated
		 */
		EEnum		SPATIAL_INTEGRITY_RULE							= eINSTANCE.getSpatialIntegrityRule();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.cd.model.GeneralizationKind <em>Generalization Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.cd.model.GeneralizationKind
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getGeneralizationKind()
		 * @generated
		 */
		EEnum		GENERALIZATION_KIND								= eINSTANCE.getGeneralizationKind();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType	RECTANGLE										= eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see it.unibz.udig.omtg.cd.model.impl.CDPackageImpl#getPoint()
		 * @generated
		 */
		EDataType	POINT											= eINSTANCE.getPoint();

	}

} //CDPackage
