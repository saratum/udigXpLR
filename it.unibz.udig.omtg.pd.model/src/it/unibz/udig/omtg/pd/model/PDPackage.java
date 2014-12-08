/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model;

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
 * @see it.unibz.udig.omtg.pd.model.PDFactory
 * @model kind="package"
 * @generated
 */
public interface PDPackage extends EPackage
{

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNAME												= "pd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_URI												= "it.unibz.udig/omtg/pd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String		eNS_PREFIX											= "pd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PDPackage	eINSTANCE											= it.unibz.udig.omtg.pd.model.impl.PDPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl <em>OMTPD Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPDNode()
	 * @generated
	 */
	int			OMTPD_NODE											= 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl <em>OMT Presentation Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPresentationDiagram()
	 * @generated
	 */
	int			OMT_PRESENTATION_DIAGRAM							= 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_DIAGRAM__OBJECTS					= 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_DIAGRAM__OPERATIONS				= 1;

	/**
	 * The number of structural features of the '<em>OMT Presentation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_DIAGRAM_FEATURE_COUNT				= 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTPD_NODE__DIAGRAM									= 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTPD_NODE__CONSTRAINT								= 1;

	/**
	 * The number of structural features of the '<em>OMTPD Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTPD_NODE_FEATURE_COUNT							= 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl <em>OMTTP Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTTPOperation()
	 * @generated
	 */
	int			OMTTP_OPERATION										= 14;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl <em>OMT Presentation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPresentationSpecification()
	 * @generated
	 */
	int			OMT_PRESENTATION_SPECIFICATION						= 11;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTClass()
	 * @generated
	 */
	int			OMT_CLASS											= 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__DIAGRAM									= OMTPD_NODE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__CONSTRAINT								= OMTPD_NODE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__NAME										= OMTPD_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__ATTRIBUTES								= OMTPD_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OPERATIONS								= OMTPD_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS__OUTGOING_RELATIONS						= OMTPD_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OMT Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CLASS_FEATURE_COUNT								= OMTPD_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTConventionalClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTConventionalClass()
	 * @generated
	 */
	int			OMT_CONVENTIONAL_CLASS								= 3;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__DIAGRAM						= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__CONSTRAINT					= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__NAME						= OMT_CLASS__NAME;

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
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS__OUTGOING_RELATIONS			= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The number of structural features of the '<em>OMT Conventional Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_CONVENTIONAL_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoreferencedClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoreferencedClass()
	 * @generated
	 */
	int			OMT_GEOREFERENCED_CLASS								= 4;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__DIAGRAM					= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__CONSTRAINT					= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__NAME						= OMT_CLASS__NAME;

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
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS__OUTGOING_RELATIONS			= OMT_CLASS__OUTGOING_RELATIONS;

	/**
	 * The number of structural features of the '<em>OMT Georeferenced Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEOREFERENCED_CLASS_FEATURE_COUNT				= OMT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoFieldClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoFieldClass()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS									= 5;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__DIAGRAM						= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__CONSTRAINT						= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__NAME							= OMT_CLASS__NAME;

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
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_FIELD_CLASS__OUTGOING_RELATIONS				= OMT_CLASS__OUTGOING_RELATIONS;

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
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectTopologyClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS						= 6;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__DIAGRAM				= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__CONSTRAINT			= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__NAME					= OMT_CLASS__NAME;

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
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS__OUTGOING_RELATIONS	= OMT_CLASS__OUTGOING_RELATIONS;

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
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectGeometryClassImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS						= 7;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__DIAGRAM				= OMT_CLASS__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__CONSTRAINT			= OMT_CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__NAME					= OMT_CLASS__NAME;

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
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS__OUTGOING_RELATIONS	= OMT_CLASS__OUTGOING_RELATIONS;

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
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.NameValueElementImpl <em>Name Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.NameValueElementImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getNameValueElement()
	 * @generated
	 */
	int			NAME_VALUE_ELEMENT									= 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			NAME_VALUE_ELEMENT__NAME							= 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			NAME_VALUE_ELEMENT__TYPE							= 1;

	/**
	 * The number of structural features of the '<em>Name Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			NAME_VALUE_ELEMENT_FEATURE_COUNT					= 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.ClassAttributeImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getClassAttribute()
	 * @generated
	 */
	int			CLASS_ATTRIBUTE										= 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__NAME								= NAME_VALUE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__TYPE								= NAME_VALUE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__OMTCLASS							= NAME_VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE__KEY								= NAME_VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_ATTRIBUTE_FEATURE_COUNT						= NAME_VALUE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.ClassOperationImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getClassOperation()
	 * @generated
	 */
	int			CLASS_OPERATION										= 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__NAME								= NAME_VALUE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__TYPE								= NAME_VALUE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Omtclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION__OMTCLASS							= NAME_VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			CLASS_OPERATION_FEATURE_COUNT						= NAME_VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__DIAGRAM				= OMTPD_NODE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__CONSTRAINT			= OMTPD_NODE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__CLASS_NAME			= OMTPD_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME	= OMTPD_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME	= OMTPD_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pictogram List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST		= OMTPD_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION	= OMTPD_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION__SPECIFICATION		= OMTPD_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>OMT Presentation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_PRESENTATION_SPECIFICATION_FEATURE_COUNT		= OMTPD_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTSpecificationImpl <em>OMT Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.OMTSpecificationImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTSpecification()
	 * @generated
	 */
	int			OMT_SPECIFICATION									= 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_SPECIFICATION__NAME								= NAME_VALUE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_SPECIFICATION__TYPE								= NAME_VALUE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Presentation Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_SPECIFICATION__PRESENTATION_SPECIFICATION		= NAME_VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OMT Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMT_SPECIFICATION_FEATURE_COUNT						= NAME_VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.impl.PictogramImpl <em>Pictogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.impl.PictogramImpl
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getPictogram()
	 * @generated
	 */
	int			PICTOGRAM											= 13;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			PICTOGRAM__MEANING									= 0;

	/**
	 * The feature id for the '<em><b>Image File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			PICTOGRAM__IMAGE_FILE_LOCATION						= 1;

	/**
	 * The number of structural features of the '<em>Pictogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			PICTOGRAM_FEATURE_COUNT								= 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION__DIAGRAM							= 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION__TARGET								= 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION__SOURCE								= 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION__EXPRESSION							= 3;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION__BENDPOINTS							= 4;

	/**
	 * The number of structural features of the '<em>OMTTP Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int			OMTTP_OPERATION_FEATURE_COUNT						= 5;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoFieldClassKind()
	 * @generated
	 */
	int			OMT_GEO_FIELD_CLASS_KIND							= 15;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectGeometryClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND					= 16;

	/**
	 * The meta object id for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectTopologyClassKind()
	 * @generated
	 */
	int			OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND					= 17;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getRectangle()
	 * @generated
	 */
	int			RECTANGLE											= 18;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getPoint()
	 * @generated
	 */
	int			POINT												= 19;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Image
	 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getImage()
	 * @generated
	 */
	int			IMAGE												= 20;

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTPDNode <em>OMTPD Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMTPD Node</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPDNode
	 * @generated
	 */
	EClass getOMTPDNode( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPDNode#getDiagram()
	 * @see #getOMTPDNode()
	 * @generated
	 */
	EReference getOMTPDNode_Diagram( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTPDNode#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPDNode#getConstraint()
	 * @see #getOMTPDNode()
	 * @generated
	 */
	EAttribute getOMTPDNode_Constraint( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram <em>OMT Presentation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Presentation Diagram</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram
	 * @generated
	 */
	EClass getOMTPresentationDiagram( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getObjects()
	 * @see #getOMTPresentationDiagram()
	 * @generated
	 */
	EReference getOMTPresentationDiagram_Objects( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram#getOperations()
	 * @see #getOMTPresentationDiagram()
	 * @generated
	 */
	EReference getOMTPresentationDiagram_Operations( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation <em>OMTTP Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMTTP Operation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation
	 * @generated
	 */
	EClass getOMTTPOperation( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getDiagram()
	 * @see #getOMTTPOperation()
	 * @generated
	 */
	EReference getOMTTPOperation_Diagram( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getTarget()
	 * @see #getOMTTPOperation()
	 * @generated
	 */
	EReference getOMTTPOperation_Target( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getSource()
	 * @see #getOMTTPOperation()
	 * @generated
	 */
	EReference getOMTTPOperation_Source( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getExpression()
	 * @see #getOMTTPOperation()
	 * @generated
	 */
	EAttribute getOMTTPOperation_Expression( );

	/**
	 * Returns the meta object for the attribute list '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation#getBendpoints()
	 * @see #getOMTTPOperation()
	 * @generated
	 */
	EAttribute getOMTTPOperation_Bendpoints( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification <em>OMT Presentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Presentation Specification</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification
	 * @generated
	 */
	EClass getOMTPresentationSpecification( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getClassName()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EAttribute getOMTPresentationSpecification_ClassName( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPresentationName <em>Presentation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Name</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPresentationName()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EAttribute getOMTPresentationSpecification_PresentationName( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getApplicationName()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EAttribute getOMTPresentationSpecification_ApplicationName( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPictogramList <em>Pictogram List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pictogram List</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getPictogramList()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EReference getOMTPresentationSpecification_PictogramList( );

	/**
	 * Returns the meta object for the reference '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation <em>Incoming Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Operation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getIncomingOperation()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EReference getOMTPresentationSpecification_IncomingOperation( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification#getSpecification()
	 * @see #getOMTPresentationSpecification()
	 * @generated
	 */
	EReference getOMTPresentationSpecification_Specification( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTSpecification <em>OMT Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Specification</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTSpecification
	 * @generated
	 */
	EClass getOMTSpecification( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification <em>Presentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Presentation Specification</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTSpecification#getPresentationSpecification()
	 * @see #getOMTSpecification()
	 * @generated
	 */
	EReference getOMTSpecification_PresentationSpecification( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.Pictogram <em>Pictogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pictogram</em>'.
	 * @see it.unibz.udig.omtg.pd.model.Pictogram
	 * @generated
	 */
	EClass getPictogram( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.Pictogram#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning</em>'.
	 * @see it.unibz.udig.omtg.pd.model.Pictogram#getMeaning()
	 * @see #getPictogram()
	 * @generated
	 */
	EAttribute getPictogram_Meaning( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.Pictogram#getImageFileLocation <em>Image File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image File Location</em>'.
	 * @see it.unibz.udig.omtg.pd.model.Pictogram#getImageFileLocation()
	 * @see #getPictogram()
	 * @generated
	 */
	EAttribute getPictogram_ImageFileLocation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTClass <em>OMT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass
	 * @generated
	 */
	EClass getOMTClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass#getName()
	 * @see #getOMTClass()
	 * @generated
	 */
	EAttribute getOMTClass_Name( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass#getAttributes()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Attributes( );

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.udig.omtg.pd.model.OMTClass#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass#getOperations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_Operations( );

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.udig.omtg.pd.model.OMTClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Relations</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass#getOutgoingRelations()
	 * @see #getOMTClass()
	 * @generated
	 */
	EReference getOMTClass_OutgoingRelations( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTConventionalClass <em>OMT Conventional Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Conventional Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTConventionalClass
	 * @generated
	 */
	EClass getOMTConventionalClass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass <em>OMT Georeferenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Georeferenced Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass
	 * @generated
	 */
	EClass getOMTGeoreferencedClass( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClass <em>OMT Geo Field Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Field Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClass
	 * @generated
	 */
	EClass getOMTGeoFieldClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClass#getRepresentation()
	 * @see #getOMTGeoFieldClass()
	 * @generated
	 */
	EAttribute getOMTGeoFieldClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass <em>OMT Geo Object Topology Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Topology Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass
	 * @generated
	 */
	EClass getOMTGeoObjectTopologyClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass#getRepresentation()
	 * @see #getOMTGeoObjectTopologyClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectTopologyClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass <em>OMT Geo Object Geometry Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMT Geo Object Geometry Class</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass
	 * @generated
	 */
	EClass getOMTGeoObjectGeometryClass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass#getRepresentation()
	 * @see #getOMTGeoObjectGeometryClass()
	 * @generated
	 */
	EAttribute getOMTGeoObjectGeometryClass_Representation( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.NameValueElement <em>Name Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Value Element</em>'.
	 * @see it.unibz.udig.omtg.pd.model.NameValueElement
	 * @generated
	 */
	EClass getNameValueElement( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.NameValueElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.udig.omtg.pd.model.NameValueElement#getName()
	 * @see #getNameValueElement()
	 * @generated
	 */
	EAttribute getNameValueElement_Name( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.NameValueElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.unibz.udig.omtg.pd.model.NameValueElement#getType()
	 * @see #getNameValueElement()
	 * @generated
	 */
	EAttribute getNameValueElement_Type( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see it.unibz.udig.omtg.pd.model.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.pd.model.ClassAttribute#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.pd.model.ClassAttribute#getOmtclass()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EReference getClassAttribute_Omtclass( );

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.udig.omtg.pd.model.ClassAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.unibz.udig.omtg.pd.model.ClassAttribute#isKey()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Key( );

	/**
	 * Returns the meta object for class '{@link it.unibz.udig.omtg.pd.model.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation</em>'.
	 * @see it.unibz.udig.omtg.pd.model.ClassOperation
	 * @generated
	 */
	EClass getClassOperation( );

	/**
	 * Returns the meta object for the container reference '{@link it.unibz.udig.omtg.pd.model.ClassOperation#getOmtclass <em>Omtclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Omtclass</em>'.
	 * @see it.unibz.udig.omtg.pd.model.ClassOperation#getOmtclass()
	 * @see #getClassOperation()
	 * @generated
	 */
	EReference getClassOperation_Omtclass( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Field Class Kind</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind
	 * @generated
	 */
	EEnum getOMTGeoFieldClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Geometry Class Kind</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectGeometryClassKind( );

	/**
	 * Returns the meta object for enum '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OMT Geo Object Topology Class Kind</em>'.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind
	 * @generated
	 */
	EEnum getOMTGeoObjectTopologyClassKind( );

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
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see org.eclipse.swt.graphics.Image
	 * @model instanceClass="org.eclipse.swt.graphics.Image"
	 * @generated
	 */
	EDataType getImage( );

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PDFactory getPDFactory( );

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
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl <em>OMTPD Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPDNode()
		 * @generated
		 */
		EClass		OMTPD_NODE											= eINSTANCE.getOMTPDNode();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTPD_NODE__DIAGRAM									= eINSTANCE.getOMTPDNode_Diagram();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMTPD_NODE__CONSTRAINT								= eINSTANCE.getOMTPDNode_Constraint();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl <em>OMT Presentation Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPresentationDiagram()
		 * @generated
		 */
		EClass		OMT_PRESENTATION_DIAGRAM							= eINSTANCE.getOMTPresentationDiagram();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_PRESENTATION_DIAGRAM__OBJECTS					= eINSTANCE.getOMTPresentationDiagram_Objects();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_PRESENTATION_DIAGRAM__OPERATIONS				= eINSTANCE.getOMTPresentationDiagram_Operations();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl <em>OMTTP Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTTPOperation()
		 * @generated
		 */
		EClass		OMTTP_OPERATION										= eINSTANCE.getOMTTPOperation();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTP_OPERATION__DIAGRAM							= eINSTANCE.getOMTTPOperation_Diagram();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTP_OPERATION__TARGET								= eINSTANCE.getOMTTPOperation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMTTP_OPERATION__SOURCE								= eINSTANCE.getOMTTPOperation_Source();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMTTP_OPERATION__EXPRESSION							= eINSTANCE.getOMTTPOperation_Expression();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMTTP_OPERATION__BENDPOINTS							= eINSTANCE.getOMTTPOperation_Bendpoints();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl <em>OMT Presentation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTPresentationSpecification()
		 * @generated
		 */
		EClass		OMT_PRESENTATION_SPECIFICATION						= eINSTANCE.getOMTPresentationSpecification();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_PRESENTATION_SPECIFICATION__CLASS_NAME			= eINSTANCE.getOMTPresentationSpecification_ClassName();

		/**
		 * The meta object literal for the '<em><b>Presentation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME	= eINSTANCE.getOMTPresentationSpecification_PresentationName();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME	= eINSTANCE.getOMTPresentationSpecification_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Pictogram List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST		= eINSTANCE.getOMTPresentationSpecification_PictogramList();

		/**
		 * The meta object literal for the '<em><b>Incoming Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION	= eINSTANCE.getOMTPresentationSpecification_IncomingOperation();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_PRESENTATION_SPECIFICATION__SPECIFICATION		= eINSTANCE.getOMTPresentationSpecification_Specification();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTSpecificationImpl <em>OMT Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTSpecificationImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTSpecification()
		 * @generated
		 */
		EClass		OMT_SPECIFICATION									= eINSTANCE.getOMTSpecification();

		/**
		 * The meta object literal for the '<em><b>Presentation Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_SPECIFICATION__PRESENTATION_SPECIFICATION		= eINSTANCE.getOMTSpecification_PresentationSpecification();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.PictogramImpl <em>Pictogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.PictogramImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getPictogram()
		 * @generated
		 */
		EClass		PICTOGRAM											= eINSTANCE.getPictogram();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	PICTOGRAM__MEANING									= eINSTANCE.getPictogram_Meaning();

		/**
		 * The meta object literal for the '<em><b>Image File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	PICTOGRAM__IMAGE_FILE_LOCATION						= eINSTANCE.getPictogram_ImageFileLocation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl <em>OMT Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTClass()
		 * @generated
		 */
		EClass		OMT_CLASS											= eINSTANCE.getOMTClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_CLASS__NAME										= eINSTANCE.getOMTClass_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__ATTRIBUTES								= eINSTANCE.getOMTClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__OPERATIONS								= eINSTANCE.getOMTClass_Operations();

		/**
		 * The meta object literal for the '<em><b>Outgoing Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	OMT_CLASS__OUTGOING_RELATIONS						= eINSTANCE.getOMTClass_OutgoingRelations();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTConventionalClassImpl <em>OMT Conventional Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTConventionalClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTConventionalClass()
		 * @generated
		 */
		EClass		OMT_CONVENTIONAL_CLASS								= eINSTANCE.getOMTConventionalClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoreferencedClassImpl <em>OMT Georeferenced Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoreferencedClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoreferencedClass()
		 * @generated
		 */
		EClass		OMT_GEOREFERENCED_CLASS								= eINSTANCE.getOMTGeoreferencedClass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoFieldClassImpl <em>OMT Geo Field Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoFieldClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoFieldClass()
		 * @generated
		 */
		EClass		OMT_GEO_FIELD_CLASS									= eINSTANCE.getOMTGeoFieldClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_FIELD_CLASS__REPRESENTATION					= eINSTANCE.getOMTGeoFieldClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectTopologyClassImpl <em>OMT Geo Object Topology Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectTopologyClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectTopologyClass()
		 * @generated
		 */
		EClass		OMT_GEO_OBJECT_TOPOLOGY_CLASS						= eINSTANCE.getOMTGeoObjectTopologyClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION		= eINSTANCE.getOMTGeoObjectTopologyClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectGeometryClassImpl <em>OMT Geo Object Geometry Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.OMTGeoObjectGeometryClassImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectGeometryClass()
		 * @generated
		 */
		EClass		OMT_GEO_OBJECT_GEOMETRY_CLASS						= eINSTANCE.getOMTGeoObjectGeometryClass();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION		= eINSTANCE.getOMTGeoObjectGeometryClass_Representation();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.NameValueElementImpl <em>Name Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.NameValueElementImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getNameValueElement()
		 * @generated
		 */
		EClass		NAME_VALUE_ELEMENT									= eINSTANCE.getNameValueElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	NAME_VALUE_ELEMENT__NAME							= eINSTANCE.getNameValueElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	NAME_VALUE_ELEMENT__TYPE							= eINSTANCE.getNameValueElement_Type();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.ClassAttributeImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass		CLASS_ATTRIBUTE										= eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Omtclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	CLASS_ATTRIBUTE__OMTCLASS							= eINSTANCE.getClassAttribute_Omtclass();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute	CLASS_ATTRIBUTE__KEY								= eINSTANCE.getClassAttribute_Key();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.impl.ClassOperationImpl <em>Class Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.impl.ClassOperationImpl
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getClassOperation()
		 * @generated
		 */
		EClass		CLASS_OPERATION										= eINSTANCE.getClassOperation();

		/**
		 * The meta object literal for the '<em><b>Omtclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference	CLASS_OPERATION__OMTCLASS							= eINSTANCE.getClassOperation_Omtclass();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind <em>OMT Geo Field Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoFieldClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_FIELD_CLASS_KIND							= eINSTANCE.getOMTGeoFieldClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind <em>OMT Geo Object Geometry Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectGeometryClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND					= eINSTANCE.getOMTGeoObjectGeometryClassKind();

		/**
		 * The meta object literal for the '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind <em>OMT Geo Object Topology Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getOMTGeoObjectTopologyClassKind()
		 * @generated
		 */
		EEnum		OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND					= eINSTANCE.getOMTGeoObjectTopologyClassKind();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType	RECTANGLE											= eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getPoint()
		 * @generated
		 */
		EDataType	POINT												= eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Image
		 * @see it.unibz.udig.omtg.pd.model.impl.PDPackageImpl#getImage()
		 * @generated
		 */
		EDataType	IMAGE												= eINSTANCE.getImage();

	}

} //PDPackage
