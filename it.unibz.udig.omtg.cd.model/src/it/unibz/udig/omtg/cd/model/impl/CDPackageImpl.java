/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.ClassElement;
import it.unibz.udig.omtg.cd.model.ClassOperation;
import it.unibz.udig.omtg.cd.model.GeneralizationKind;
import it.unibz.udig.omtg.cd.model.Multiplicity;
import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClassKind;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClassKind;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClassKind;
import it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.cd.model.OMTRelationshipType;
import it.unibz.udig.omtg.cd.model.SpatialIntegrityRule;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDPackageImpl extends EPackageImpl implements CDPackage
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		classOperationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtGeneralizationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtGeoFieldClassEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtGeoObjectGeometryClassEClass		= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtGeoObjectTopologyClassEClass		= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtAggregationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtRelationshipEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		classElementEClass					= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		classAttributeEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtClassDiagramEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtClassEClass						= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtConventionalClassEClass			= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtGeoreferencedClassEClass			= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		multiplicityEEnum					= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		omtGeoFieldClassKindEEnum			= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		omtGeoObjectGeometryClassKindEEnum	= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		omtGeoObjectTopologyClassKindEEnum	= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		omtRelationshipTypeEEnum			= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		spatialIntegrityRuleEEnum			= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum		generalizationKindEEnum				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType	rectangleEDataType					= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType	pointEDataType						= null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unibz.udig.omtg.cd.model.CDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDPackageImpl()
	{
		super(eNS_URI, CDFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean	isInited	= false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDPackage init( )
	{
		if (isInited) return (CDPackage)EPackage.Registry.INSTANCE.getEPackage(CDPackage.eNS_URI);

		// Obtain or create and register package
		CDPackageImpl theCDPackage = (CDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCDPackage.createPackageContents();

		// Initialize created meta-data
		theCDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDPackage.eNS_URI, theCDPackage);
		return theCDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperation( )
	{
		return classOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperation_Omtclass( )
	{
		return (EReference)classOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTGeneralization( )
	{
		return omtGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTGeneralization_Kind( )
	{
		return (EAttribute)omtGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTGeneralization_Total( )
	{
		return (EAttribute)omtGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTGeoFieldClass( )
	{
		return omtGeoFieldClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTGeoFieldClass_Representation( )
	{
		return (EAttribute)omtGeoFieldClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTGeoObjectGeometryClass( )
	{
		return omtGeoObjectGeometryClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTGeoObjectGeometryClass_Representation( )
	{
		return (EAttribute)omtGeoObjectGeometryClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTGeoObjectTopologyClass( )
	{
		return omtGeoObjectTopologyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTGeoObjectTopologyClass_Representation( )
	{
		return (EAttribute)omtGeoObjectTopologyClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTAggregation( )
	{
		return omtAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTAggregation_Spatial( )
	{
		return (EAttribute)omtAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTRelationship( )
	{
		return omtRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTRelationship_Diagram( )
	{
		return (EReference)omtRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTRelationship_Target( )
	{
		return (EReference)omtRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTRelationship_Source( )
	{
		return (EReference)omtRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTRelationship_Bendpoints( )
	{
		return (EAttribute)omtRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTRelationship_Type( )
	{
		return (EAttribute)omtRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTRelationship_Rule( )
	{
		return (EAttribute)omtRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTRelationship_Label( )
	{
		return (EAttribute)omtRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassElement( )
	{
		return classElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassElement_Name( )
	{
		return (EAttribute)classElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassElement_Type( )
	{
		return (EAttribute)classElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAttribute( )
	{
		return classAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAttribute_Omtclass( )
	{
		return (EReference)classAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_Key( )
	{
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_DefaultValue( )
	{
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassAttribute_ColumnDefinition()
	{
		return (EAttribute)classAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTClassDiagram( )
	{
		return omtClassDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClassDiagram_Classes( )
	{
		return (EReference)omtClassDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClassDiagram_Relations( )
	{
		return (EReference)omtClassDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTClass( )
	{
		return omtClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Diagram( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTClass_Name( )
	{
		return (EAttribute)omtClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTClass_Constraint( )
	{
		return (EAttribute)omtClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_IncomingRelations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_OutgoingRelations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Attributes( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Operations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTClass_Multiplicity( )
	{
		return (EAttribute)omtClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTConventionalClass( )
	{
		return omtConventionalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTGeoreferencedClass( )
	{
		return omtGeoreferencedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity( )
	{
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOMTGeoFieldClassKind( )
	{
		return omtGeoFieldClassKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOMTGeoObjectGeometryClassKind( )
	{
		return omtGeoObjectGeometryClassKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOMTGeoObjectTopologyClassKind( )
	{
		return omtGeoObjectTopologyClassKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOMTRelationshipType( )
	{
		return omtRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpatialIntegrityRule( )
	{
		return spatialIntegrityRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneralizationKind( )
	{
		return generalizationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle( )
	{
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint( )
	{
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFactory getCDFactory( )
	{
		return (CDFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean	isCreated	= false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents( )
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		omtClassDiagramEClass = createEClass(OMT_CLASS_DIAGRAM);
		createEReference(omtClassDiagramEClass, OMT_CLASS_DIAGRAM__CLASSES);
		createEReference(omtClassDiagramEClass, OMT_CLASS_DIAGRAM__RELATIONS);

		omtClassEClass = createEClass(OMT_CLASS);
		createEReference(omtClassEClass, OMT_CLASS__DIAGRAM);
		createEAttribute(omtClassEClass, OMT_CLASS__NAME);
		createEAttribute(omtClassEClass, OMT_CLASS__CONSTRAINT);
		createEReference(omtClassEClass, OMT_CLASS__INCOMING_RELATIONS);
		createEReference(omtClassEClass, OMT_CLASS__OUTGOING_RELATIONS);
		createEReference(omtClassEClass, OMT_CLASS__ATTRIBUTES);
		createEReference(omtClassEClass, OMT_CLASS__OPERATIONS);
		createEAttribute(omtClassEClass, OMT_CLASS__MULTIPLICITY);

		classElementEClass = createEClass(CLASS_ELEMENT);
		createEAttribute(classElementEClass, CLASS_ELEMENT__NAME);
		createEAttribute(classElementEClass, CLASS_ELEMENT__TYPE);

		classOperationEClass = createEClass(CLASS_OPERATION);
		createEReference(classOperationEClass, CLASS_OPERATION__OMTCLASS);

		classAttributeEClass = createEClass(CLASS_ATTRIBUTE);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__OMTCLASS);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__KEY);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__COLUMN_DEFINITION);

		omtConventionalClassEClass = createEClass(OMT_CONVENTIONAL_CLASS);

		omtGeoreferencedClassEClass = createEClass(OMT_GEOREFERENCED_CLASS);

		omtGeoFieldClassEClass = createEClass(OMT_GEO_FIELD_CLASS);
		createEAttribute(omtGeoFieldClassEClass, OMT_GEO_FIELD_CLASS__REPRESENTATION);

		omtGeoObjectGeometryClassEClass = createEClass(OMT_GEO_OBJECT_GEOMETRY_CLASS);
		createEAttribute(omtGeoObjectGeometryClassEClass, OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION);

		omtGeoObjectTopologyClassEClass = createEClass(OMT_GEO_OBJECT_TOPOLOGY_CLASS);
		createEAttribute(omtGeoObjectTopologyClassEClass, OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION);

		omtGeneralizationEClass = createEClass(OMT_GENERALIZATION);
		createEAttribute(omtGeneralizationEClass, OMT_GENERALIZATION__KIND);
		createEAttribute(omtGeneralizationEClass, OMT_GENERALIZATION__TOTAL);

		omtRelationshipEClass = createEClass(OMT_RELATIONSHIP);
		createEReference(omtRelationshipEClass, OMT_RELATIONSHIP__DIAGRAM);
		createEReference(omtRelationshipEClass, OMT_RELATIONSHIP__TARGET);
		createEReference(omtRelationshipEClass, OMT_RELATIONSHIP__SOURCE);
		createEAttribute(omtRelationshipEClass, OMT_RELATIONSHIP__BENDPOINTS);
		createEAttribute(omtRelationshipEClass, OMT_RELATIONSHIP__TYPE);
		createEAttribute(omtRelationshipEClass, OMT_RELATIONSHIP__RULE);
		createEAttribute(omtRelationshipEClass, OMT_RELATIONSHIP__LABEL);

		omtAggregationEClass = createEClass(OMT_AGGREGATION);
		createEAttribute(omtAggregationEClass, OMT_AGGREGATION__SPATIAL);

		// Create enums
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		omtGeoFieldClassKindEEnum = createEEnum(OMT_GEO_FIELD_CLASS_KIND);
		omtGeoObjectGeometryClassKindEEnum = createEEnum(OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND);
		omtGeoObjectTopologyClassKindEEnum = createEEnum(OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND);
		omtRelationshipTypeEEnum = createEEnum(OMT_RELATIONSHIP_TYPE);
		spatialIntegrityRuleEEnum = createEEnum(SPATIAL_INTEGRITY_RULE);
		generalizationKindEEnum = createEEnum(GENERALIZATION_KIND);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean	isInitialized	= false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents( )
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classOperationEClass.getESuperTypes().add(this.getClassElement());
		classAttributeEClass.getESuperTypes().add(this.getClassElement());
		omtConventionalClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoreferencedClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoFieldClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectGeometryClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectTopologyClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeneralizationEClass.getESuperTypes().add(this.getOMTRelationship());
		omtAggregationEClass.getESuperTypes().add(this.getOMTRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(omtClassDiagramEClass, OMTClassDiagram.class, "OMTClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTClassDiagram_Classes(), this.getOMTClass(), this.getOMTClass_Diagram(), "classes", null, 0, -1, OMTClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClassDiagram_Relations(), this.getOMTRelationship(), this.getOMTRelationship_Diagram(), "relations", null, 0, -1, OMTClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtClassEClass, OMTClass.class, "OMTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTClass_Diagram(), this.getOMTClassDiagram(), this.getOMTClassDiagram_Classes(), "diagram", null, 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Name(), ecorePackage.getEString(), "name", "< ... >", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Constraint(), this.getRectangle(), "constraint", "0,0,50,50", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_IncomingRelations(), this.getOMTRelationship(), this.getOMTRelationship_Target(), "incomingRelations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_OutgoingRelations(), this.getOMTRelationship(), this.getOMTRelationship_Source(), "outgoingRelations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Attributes(), this.getClassAttribute(), this.getClassAttribute_Omtclass(), "attributes", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Operations(), this.getClassOperation(), this.getClassOperation_Omtclass(), "operations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Multiplicity(), this.getMultiplicity(), "multiplicity", "*", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classOperationEClass, ClassOperation.class, "ClassOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperation_Omtclass(), this.getOMTClass(), this.getOMTClass_Operations(), "omtclass", null, 0, 1, ClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAttributeEClass, ClassAttribute.class, "ClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAttribute_Omtclass(), this.getOMTClass(), this.getOMTClass_Attributes(), "omtclass", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_ColumnDefinition(), ecorePackage.getEString(), "columnDefinition", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtConventionalClassEClass, OMTConventionalClass.class, "OMTConventionalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoreferencedClassEClass, OMTGeoreferencedClass.class, "OMTGeoreferencedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoFieldClassEClass, OMTGeoFieldClass.class, "OMTGeoFieldClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoFieldClass_Representation(), this.getOMTGeoFieldClassKind(), "representation", "Triangular Irregular Network", 1, 1, OMTGeoFieldClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectGeometryClassEClass, OMTGeoObjectGeometryClass.class, "OMTGeoObjectGeometryClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectGeometryClass_Representation(), this.getOMTGeoObjectGeometryClassKind(), "representation", null, 0, 1, OMTGeoObjectGeometryClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectTopologyClassEClass, OMTGeoObjectTopologyClass.class, "OMTGeoObjectTopologyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectTopologyClass_Representation(), this.getOMTGeoObjectTopologyClassKind(), "representation", null, 0, 1, OMTGeoObjectTopologyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeneralizationEClass, OMTGeneralization.class, "OMTGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeneralization_Kind(), this.getGeneralizationKind(), "kind", null, 0, 1, OMTGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTGeneralization_Total(), ecorePackage.getEBoolean(), "total", "false", 0, 1, OMTGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtRelationshipEClass, OMTRelationship.class, "OMTRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTRelationship_Diagram(), this.getOMTClassDiagram(), this.getOMTClassDiagram_Relations(), "diagram", null, 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTRelationship_Target(), this.getOMTClass(), this.getOMTClass_IncomingRelations(), "target", null, 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTRelationship_Source(), this.getOMTClass(), this.getOMTClass_OutgoingRelations(), "source", null, 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTRelationship_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTRelationship_Type(), this.getOMTRelationshipType(), "type", "Simple association", 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTRelationship_Rule(), this.getSpatialIntegrityRule(), "rule", "NONE", 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTRelationship_Label(), ecorePackage.getEString(), "label", null, 0, 1, OMTRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtAggregationEClass, OMTAggregation.class, "OMTAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTAggregation_Spatial(), ecorePackage.getEBoolean(), "spatial", null, 0, 1, OMTAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.NONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_MORE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_MORE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_ONE);

		initEEnum(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.class, "OMTGeoFieldClassKind");
		addEEnumLiteral(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.TRIANGULAR_IRREGULAR_NETWORK);
		addEEnumLiteral(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.ISOLINE);
		addEEnumLiteral(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.PLANAR_SUBDIVISION);
		addEEnumLiteral(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.TESSELATION);
		addEEnumLiteral(omtGeoFieldClassKindEEnum, OMTGeoFieldClassKind.SAMPLING);

		initEEnum(omtGeoObjectGeometryClassKindEEnum, OMTGeoObjectGeometryClassKind.class, "OMTGeoObjectGeometryClassKind");
		addEEnumLiteral(omtGeoObjectGeometryClassKindEEnum, OMTGeoObjectGeometryClassKind.POINT);
		addEEnumLiteral(omtGeoObjectGeometryClassKindEEnum, OMTGeoObjectGeometryClassKind.LINE);
		addEEnumLiteral(omtGeoObjectGeometryClassKindEEnum, OMTGeoObjectGeometryClassKind.POLYGON);

		initEEnum(omtGeoObjectTopologyClassKindEEnum, OMTGeoObjectTopologyClassKind.class, "OMTGeoObjectTopologyClassKind");
		addEEnumLiteral(omtGeoObjectTopologyClassKindEEnum, OMTGeoObjectTopologyClassKind.UNIDIRECTIONAL_LINE);
		addEEnumLiteral(omtGeoObjectTopologyClassKindEEnum, OMTGeoObjectTopologyClassKind.BIDIRECTIONAL_LINE);
		addEEnumLiteral(omtGeoObjectTopologyClassKindEEnum, OMTGeoObjectTopologyClassKind.NODE);

		initEEnum(omtRelationshipTypeEEnum, OMTRelationshipType.class, "OMTRelationshipType");
		addEEnumLiteral(omtRelationshipTypeEEnum, OMTRelationshipType.SIMPLE_ASSOCIATION);
		addEEnumLiteral(omtRelationshipTypeEEnum, OMTRelationshipType.SPATIAL);
		addEEnumLiteral(omtRelationshipTypeEEnum, OMTRelationshipType.ARC_NODE_NETWORK);
		addEEnumLiteral(omtRelationshipTypeEEnum, OMTRelationshipType.ARC_ARC_NETWORK);

		initEEnum(spatialIntegrityRuleEEnum, SpatialIntegrityRule.class, "SpatialIntegrityRule");
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.NONE);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.TOUCH);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.IN);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.CROSS);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.OVERLAP);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.DISJOINT);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.ADJACENT_TO);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.COINCIDE);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.CONTAIN);
		addEEnumLiteral(spatialIntegrityRuleEEnum, SpatialIntegrityRule.NEAR);

		initEEnum(generalizationKindEEnum, GeneralizationKind.class, "GeneralizationKind");
		addEEnumLiteral(generalizationKindEEnum, GeneralizationKind.DISJOINT);
		addEEnumLiteral(generalizationKindEEnum, GeneralizationKind.OVERLAP);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CDPackageImpl
