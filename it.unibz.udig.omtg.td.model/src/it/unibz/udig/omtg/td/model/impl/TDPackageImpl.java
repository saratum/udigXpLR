/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.ClassAttribute;
import it.unibz.udig.omtg.td.model.ClassElement;
import it.unibz.udig.omtg.td.model.ClassOperation;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTConventionalClass;
import it.unibz.udig.omtg.td.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.td.model.OMTGeoFieldClassKind;
import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClassKind;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClassKind;
import it.unibz.udig.omtg.td.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTDConnection;
import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;
import it.unibz.udig.omtg.td.model.TDFactory;
import it.unibz.udig.omtg.td.model.TDPackage;
import it.unibz.udig.omtg.td.model.TROperatorKind;

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
public class TDPackageImpl extends EPackageImpl implements TDPackage
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtTransformationDiagramEClass		= null;

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
	private EClass		omttdConnectionEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtOperationEClass					= null;

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
	private EClass		classOperationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omttrOperationEClass				= null;

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
	private EEnum		trOperatorKindEEnum					= null;

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
	 * @see it.unibz.udig.omtg.td.model.TDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TDPackageImpl()
	{
		super(eNS_URI, TDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TDPackage init( )
	{
		if (isInited) return (TDPackage)EPackage.Registry.INSTANCE.getEPackage(TDPackage.eNS_URI);

		// Obtain or create and register package
		TDPackageImpl theTDPackage = (TDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTDPackage.createPackageContents();

		// Initialize created meta-data
		theTDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TDPackage.eNS_URI, theTDPackage);
		return theTDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTTransformationDiagram( )
	{
		return omtTransformationDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTransformationDiagram_Classes( )
	{
		return (EReference)omtTransformationDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTransformationDiagram_Relations( )
	{
		return (EReference)omtTransformationDiagramEClass.getEStructuralFeatures().get(1);
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
	public EReference getOMTClass_IncomingTrOperation( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_OutgoingTrOperation( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Attributes( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Operations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTClass_Temporary( )
	{
		return (EAttribute)omtClassEClass.getEStructuralFeatures().get(9);
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
	public EClass getOMTTDConnection( )
	{
		return omttdConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTDConnection_Diagram( )
	{
		return (EReference)omttdConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTTDConnection_Bendpoints( )
	{
		return (EAttribute)omttdConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTOperation( )
	{
		return omtOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTOperation_Target( )
	{
		return (EReference)omtOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTOperation_Source( )
	{
		return (EReference)omtOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTOperation_Operator( )
	{
		return (EAttribute)omtOperationEClass.getEStructuralFeatures().get(2);
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
	public EClass getOMTTROperation( )
	{
		return omttrOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTROperation_Target( )
	{
		return (EReference)omttrOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTROperation_Source( )
	{
		return (EReference)omttrOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTTROperation_Operation( )
	{
		return (EAttribute)omttrOperationEClass.getEStructuralFeatures().get(2);
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
	public EEnum getTROperatorKind( )
	{
		return trOperatorKindEEnum;
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
	public TDFactory getTDFactory( )
	{
		return (TDFactory)getEFactoryInstance();
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
		omtTransformationDiagramEClass = createEClass(OMT_TRANSFORMATION_DIAGRAM);
		createEReference(omtTransformationDiagramEClass, OMT_TRANSFORMATION_DIAGRAM__CLASSES);
		createEReference(omtTransformationDiagramEClass, OMT_TRANSFORMATION_DIAGRAM__RELATIONS);

		omtClassEClass = createEClass(OMT_CLASS);
		createEReference(omtClassEClass, OMT_CLASS__DIAGRAM);
		createEAttribute(omtClassEClass, OMT_CLASS__NAME);
		createEAttribute(omtClassEClass, OMT_CLASS__CONSTRAINT);
		createEReference(omtClassEClass, OMT_CLASS__INCOMING_RELATIONS);
		createEReference(omtClassEClass, OMT_CLASS__OUTGOING_RELATIONS);
		createEReference(omtClassEClass, OMT_CLASS__INCOMING_TR_OPERATION);
		createEReference(omtClassEClass, OMT_CLASS__OUTGOING_TR_OPERATION);
		createEReference(omtClassEClass, OMT_CLASS__ATTRIBUTES);
		createEReference(omtClassEClass, OMT_CLASS__OPERATIONS);
		createEAttribute(omtClassEClass, OMT_CLASS__TEMPORARY);

		omtConventionalClassEClass = createEClass(OMT_CONVENTIONAL_CLASS);

		omtGeoreferencedClassEClass = createEClass(OMT_GEOREFERENCED_CLASS);

		omtGeoFieldClassEClass = createEClass(OMT_GEO_FIELD_CLASS);
		createEAttribute(omtGeoFieldClassEClass, OMT_GEO_FIELD_CLASS__REPRESENTATION);

		omtGeoObjectGeometryClassEClass = createEClass(OMT_GEO_OBJECT_GEOMETRY_CLASS);
		createEAttribute(omtGeoObjectGeometryClassEClass, OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION);

		omtGeoObjectTopologyClassEClass = createEClass(OMT_GEO_OBJECT_TOPOLOGY_CLASS);
		createEAttribute(omtGeoObjectTopologyClassEClass, OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION);

		omttdConnectionEClass = createEClass(OMTTD_CONNECTION);
		createEReference(omttdConnectionEClass, OMTTD_CONNECTION__DIAGRAM);
		createEAttribute(omttdConnectionEClass, OMTTD_CONNECTION__BENDPOINTS);

		omtOperationEClass = createEClass(OMT_OPERATION);
		createEReference(omtOperationEClass, OMT_OPERATION__TARGET);
		createEReference(omtOperationEClass, OMT_OPERATION__SOURCE);
		createEAttribute(omtOperationEClass, OMT_OPERATION__OPERATOR);

		omttrOperationEClass = createEClass(OMTTR_OPERATION);
		createEReference(omttrOperationEClass, OMTTR_OPERATION__TARGET);
		createEReference(omttrOperationEClass, OMTTR_OPERATION__SOURCE);
		createEAttribute(omttrOperationEClass, OMTTR_OPERATION__OPERATION);

		classElementEClass = createEClass(CLASS_ELEMENT);
		createEAttribute(classElementEClass, CLASS_ELEMENT__NAME);
		createEAttribute(classElementEClass, CLASS_ELEMENT__TYPE);

		classAttributeEClass = createEClass(CLASS_ATTRIBUTE);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__OMTCLASS);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__KEY);

		classOperationEClass = createEClass(CLASS_OPERATION);
		createEReference(classOperationEClass, CLASS_OPERATION__OMTCLASS);

		// Create enums
		omtGeoFieldClassKindEEnum = createEEnum(OMT_GEO_FIELD_CLASS_KIND);
		omtGeoObjectGeometryClassKindEEnum = createEEnum(OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND);
		omtGeoObjectTopologyClassKindEEnum = createEEnum(OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND);
		trOperatorKindEEnum = createEEnum(TR_OPERATOR_KIND);

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
		omtConventionalClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoreferencedClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoFieldClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectGeometryClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectTopologyClassEClass.getESuperTypes().add(this.getOMTClass());
		omtOperationEClass.getESuperTypes().add(this.getOMTTDConnection());
		omttrOperationEClass.getESuperTypes().add(this.getOMTTDConnection());
		classAttributeEClass.getESuperTypes().add(this.getClassElement());
		classOperationEClass.getESuperTypes().add(this.getClassElement());

		// Initialize classes and features; add operations and parameters
		initEClass(omtTransformationDiagramEClass, OMTTransformationDiagram.class, "OMTTransformationDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTTransformationDiagram_Classes(), this.getOMTClass(), this.getOMTClass_Diagram(), "classes", null, 0, -1, OMTTransformationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTTransformationDiagram_Relations(), this.getOMTTDConnection(), this.getOMTTDConnection_Diagram(), "relations", null, 0, -1, OMTTransformationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtClassEClass, OMTClass.class, "OMTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTClass_Diagram(), this.getOMTTransformationDiagram(), this.getOMTTransformationDiagram_Classes(), "diagram", null, 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Name(), ecorePackage.getEString(), "name", "< ... >", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Constraint(), this.getRectangle(), "constraint", "0,0,50,50", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_IncomingRelations(), this.getOMTOperation(), this.getOMTOperation_Target(), "incomingRelations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_OutgoingRelations(), this.getOMTOperation(), this.getOMTOperation_Source(), "outgoingRelations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_IncomingTrOperation(), this.getOMTTROperation(), this.getOMTTROperation_Target(), "incomingTrOperation", null, 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_OutgoingTrOperation(), this.getOMTTROperation(), this.getOMTTROperation_Source(), "outgoingTrOperation", null, 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Attributes(), this.getClassAttribute(), this.getClassAttribute_Omtclass(), "attributes", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Operations(), this.getClassOperation(), this.getClassOperation_Omtclass(), "operations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTClass_Temporary(), ecorePackage.getEBoolean(), "temporary", "false", 1, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtConventionalClassEClass, OMTConventionalClass.class, "OMTConventionalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoreferencedClassEClass, OMTGeoreferencedClass.class, "OMTGeoreferencedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoFieldClassEClass, OMTGeoFieldClass.class, "OMTGeoFieldClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoFieldClass_Representation(), this.getOMTGeoFieldClassKind(), "representation", "Triangular Irregular Network", 1, 1, OMTGeoFieldClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectGeometryClassEClass, OMTGeoObjectGeometryClass.class, "OMTGeoObjectGeometryClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectGeometryClass_Representation(), this.getOMTGeoObjectGeometryClassKind(), "representation", null, 0, 1, OMTGeoObjectGeometryClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectTopologyClassEClass, OMTGeoObjectTopologyClass.class, "OMTGeoObjectTopologyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectTopologyClass_Representation(), this.getOMTGeoObjectTopologyClassKind(), "representation", null, 0, 1, OMTGeoObjectTopologyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omttdConnectionEClass, OMTTDConnection.class, "OMTTDConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTTDConnection_Diagram(), this.getOMTTransformationDiagram(), this.getOMTTransformationDiagram_Relations(), "diagram", null, 0, 1, OMTTDConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTTDConnection_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OMTTDConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtOperationEClass, OMTOperation.class, "OMTOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTOperation_Target(), this.getOMTClass(), this.getOMTClass_IncomingRelations(), "target", null, 0, 1, OMTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTOperation_Source(), this.getOMTClass(), this.getOMTClass_OutgoingRelations(), "source", null, 0, 1, OMTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTOperation_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, OMTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omttrOperationEClass, OMTTROperation.class, "OMTTROperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTTROperation_Target(), this.getOMTClass(), this.getOMTClass_IncomingTrOperation(), "target", null, 0, 1, OMTTROperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTTROperation_Source(), this.getOMTClass(), this.getOMTClass_OutgoingTrOperation(), "source", null, 0, 1, OMTTROperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTTROperation_Operation(), this.getTROperatorKind(), "operation", "Centroid determination", 0, 1, OMTTROperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAttributeEClass, ClassAttribute.class, "ClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAttribute_Omtclass(), this.getOMTClass(), this.getOMTClass_Attributes(), "omtclass", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classOperationEClass, ClassOperation.class, "ClassOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperation_Omtclass(), this.getOMTClass(), this.getOMTClass_Operations(), "omtclass", null, 0, 1, ClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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

		initEEnum(trOperatorKindEEnum, TROperatorKind.class, "TROperatorKind");
		addEEnumLiteral(trOperatorKindEEnum, TROperatorKind.CENTROID);
		addEEnumLiteral(trOperatorKindEEnum, TROperatorKind.CONVEX_HULL);
		addEEnumLiteral(trOperatorKindEEnum, TROperatorKind.AGGREGATION);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TDPackageImpl
