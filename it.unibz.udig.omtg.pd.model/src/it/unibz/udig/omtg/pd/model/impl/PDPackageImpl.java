/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.ClassAttribute;
import it.unibz.udig.omtg.pd.model.ClassOperation;
import it.unibz.udig.omtg.pd.model.NameValueElement;
import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTConventionalClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClassKind;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClassKind;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClassKind;
import it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDFactory;
import it.unibz.udig.omtg.pd.model.PDPackage;
import it.unibz.udig.omtg.pd.model.Pictogram;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDPackageImpl extends EPackageImpl implements PDPackage
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtpdNodeEClass						= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtPresentationDiagramEClass		= null;

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
	private EClass		omtGeoObjectTopologyClassEClass		= null;

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
	private EClass		nameValueElementEClass				= null;

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
	private EClass		omttpOperationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtPresentationSpecificationEClass	= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		omtSpecificationEClass				= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass		pictogramEClass						= null;

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
	private EDataType	rectangleEDataType					= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType	pointEDataType						= null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType	imageEDataType						= null;

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
	 * @see it.unibz.udig.omtg.pd.model.PDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PDPackageImpl()
	{
		super(eNS_URI, PDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PDPackage init( )
	{
		if (isInited) return (PDPackage)EPackage.Registry.INSTANCE.getEPackage(PDPackage.eNS_URI);

		// Obtain or create and register package
		PDPackageImpl thePDPackage = (PDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePDPackage.createPackageContents();

		// Initialize created meta-data
		thePDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePDPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PDPackage.eNS_URI, thePDPackage);
		return thePDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTPDNode( )
	{
		return omtpdNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPDNode_Diagram( )
	{
		return (EReference)omtpdNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTPDNode_Constraint( )
	{
		return (EAttribute)omtpdNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTPresentationDiagram( )
	{
		return omtPresentationDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPresentationDiagram_Objects( )
	{
		return (EReference)omtPresentationDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPresentationDiagram_Operations( )
	{
		return (EReference)omtPresentationDiagramEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getOMTClass_Name( )
	{
		return (EAttribute)omtClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Attributes( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_Operations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTClass_OutgoingRelations( )
	{
		return (EReference)omtClassEClass.getEStructuralFeatures().get(3);
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
	public EClass getNameValueElement( )
	{
		return nameValueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValueElement_Name( )
	{
		return (EAttribute)nameValueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValueElement_Type( )
	{
		return (EAttribute)nameValueElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getOMTTPOperation( )
	{
		return omttpOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTPOperation_Diagram( )
	{
		return (EReference)omttpOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTPOperation_Target( )
	{
		return (EReference)omttpOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTTPOperation_Source( )
	{
		return (EReference)omttpOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTTPOperation_Expression( )
	{
		return (EAttribute)omttpOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTTPOperation_Bendpoints( )
	{
		return (EAttribute)omttpOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTPresentationSpecification( )
	{
		return omtPresentationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTPresentationSpecification_ClassName( )
	{
		return (EAttribute)omtPresentationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTPresentationSpecification_PresentationName( )
	{
		return (EAttribute)omtPresentationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMTPresentationSpecification_ApplicationName( )
	{
		return (EAttribute)omtPresentationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPresentationSpecification_PictogramList( )
	{
		return (EReference)omtPresentationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPresentationSpecification_IncomingOperation( )
	{
		return (EReference)omtPresentationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTPresentationSpecification_Specification( )
	{
		return (EReference)omtPresentationSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMTSpecification( )
	{
		return omtSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMTSpecification_PresentationSpecification( )
	{
		return (EReference)omtSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPictogram( )
	{
		return pictogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictogram_Meaning( )
	{
		return (EAttribute)pictogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPictogram_ImageFileLocation( )
	{
		return (EAttribute)pictogramEClass.getEStructuralFeatures().get(1);
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
	public EDataType getImage( )
	{
		return imageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDFactory getPDFactory( )
	{
		return (PDFactory)getEFactoryInstance();
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
		omtPresentationDiagramEClass = createEClass(OMT_PRESENTATION_DIAGRAM);
		createEReference(omtPresentationDiagramEClass, OMT_PRESENTATION_DIAGRAM__OBJECTS);
		createEReference(omtPresentationDiagramEClass, OMT_PRESENTATION_DIAGRAM__OPERATIONS);

		omtpdNodeEClass = createEClass(OMTPD_NODE);
		createEReference(omtpdNodeEClass, OMTPD_NODE__DIAGRAM);
		createEAttribute(omtpdNodeEClass, OMTPD_NODE__CONSTRAINT);

		omtClassEClass = createEClass(OMT_CLASS);
		createEAttribute(omtClassEClass, OMT_CLASS__NAME);
		createEReference(omtClassEClass, OMT_CLASS__ATTRIBUTES);
		createEReference(omtClassEClass, OMT_CLASS__OPERATIONS);
		createEReference(omtClassEClass, OMT_CLASS__OUTGOING_RELATIONS);

		omtConventionalClassEClass = createEClass(OMT_CONVENTIONAL_CLASS);

		omtGeoreferencedClassEClass = createEClass(OMT_GEOREFERENCED_CLASS);

		omtGeoFieldClassEClass = createEClass(OMT_GEO_FIELD_CLASS);
		createEAttribute(omtGeoFieldClassEClass, OMT_GEO_FIELD_CLASS__REPRESENTATION);

		omtGeoObjectTopologyClassEClass = createEClass(OMT_GEO_OBJECT_TOPOLOGY_CLASS);
		createEAttribute(omtGeoObjectTopologyClassEClass, OMT_GEO_OBJECT_TOPOLOGY_CLASS__REPRESENTATION);

		omtGeoObjectGeometryClassEClass = createEClass(OMT_GEO_OBJECT_GEOMETRY_CLASS);
		createEAttribute(omtGeoObjectGeometryClassEClass, OMT_GEO_OBJECT_GEOMETRY_CLASS__REPRESENTATION);

		nameValueElementEClass = createEClass(NAME_VALUE_ELEMENT);
		createEAttribute(nameValueElementEClass, NAME_VALUE_ELEMENT__NAME);
		createEAttribute(nameValueElementEClass, NAME_VALUE_ELEMENT__TYPE);

		classAttributeEClass = createEClass(CLASS_ATTRIBUTE);
		createEReference(classAttributeEClass, CLASS_ATTRIBUTE__OMTCLASS);
		createEAttribute(classAttributeEClass, CLASS_ATTRIBUTE__KEY);

		classOperationEClass = createEClass(CLASS_OPERATION);
		createEReference(classOperationEClass, CLASS_OPERATION__OMTCLASS);

		omtPresentationSpecificationEClass = createEClass(OMT_PRESENTATION_SPECIFICATION);
		createEAttribute(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__CLASS_NAME);
		createEAttribute(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME);
		createEAttribute(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME);
		createEReference(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST);
		createEReference(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION);
		createEReference(omtPresentationSpecificationEClass, OMT_PRESENTATION_SPECIFICATION__SPECIFICATION);

		omtSpecificationEClass = createEClass(OMT_SPECIFICATION);
		createEReference(omtSpecificationEClass, OMT_SPECIFICATION__PRESENTATION_SPECIFICATION);

		pictogramEClass = createEClass(PICTOGRAM);
		createEAttribute(pictogramEClass, PICTOGRAM__MEANING);
		createEAttribute(pictogramEClass, PICTOGRAM__IMAGE_FILE_LOCATION);

		omttpOperationEClass = createEClass(OMTTP_OPERATION);
		createEReference(omttpOperationEClass, OMTTP_OPERATION__DIAGRAM);
		createEReference(omttpOperationEClass, OMTTP_OPERATION__TARGET);
		createEReference(omttpOperationEClass, OMTTP_OPERATION__SOURCE);
		createEAttribute(omttpOperationEClass, OMTTP_OPERATION__EXPRESSION);
		createEAttribute(omttpOperationEClass, OMTTP_OPERATION__BENDPOINTS);

		// Create enums
		omtGeoFieldClassKindEEnum = createEEnum(OMT_GEO_FIELD_CLASS_KIND);
		omtGeoObjectGeometryClassKindEEnum = createEEnum(OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND);
		omtGeoObjectTopologyClassKindEEnum = createEEnum(OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		imageEDataType = createEDataType(IMAGE);
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
		omtClassEClass.getESuperTypes().add(this.getOMTPDNode());
		omtConventionalClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoreferencedClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoFieldClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectTopologyClassEClass.getESuperTypes().add(this.getOMTClass());
		omtGeoObjectGeometryClassEClass.getESuperTypes().add(this.getOMTClass());
		classAttributeEClass.getESuperTypes().add(this.getNameValueElement());
		classOperationEClass.getESuperTypes().add(this.getNameValueElement());
		omtPresentationSpecificationEClass.getESuperTypes().add(this.getOMTPDNode());
		omtSpecificationEClass.getESuperTypes().add(this.getNameValueElement());

		// Initialize classes and features; add operations and parameters
		initEClass(omtPresentationDiagramEClass, OMTPresentationDiagram.class, "OMTPresentationDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTPresentationDiagram_Objects(), this.getOMTPDNode(), this.getOMTPDNode_Diagram(), "objects", null, 0, -1, OMTPresentationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTPresentationDiagram_Operations(), this.getOMTTPOperation(), this.getOMTTPOperation_Diagram(), "operations", null, 0, -1, OMTPresentationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtpdNodeEClass, OMTPDNode.class, "OMTPDNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTPDNode_Diagram(), this.getOMTPresentationDiagram(), this.getOMTPresentationDiagram_Objects(), "diagram", null, 0, 1, OMTPDNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTPDNode_Constraint(), this.getRectangle(), "constraint", "0,0,100,100", 0, 1, OMTPDNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtClassEClass, OMTClass.class, "OMTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTClass_Name(), ecorePackage.getEString(), "name", "< ... >", 0, 1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Attributes(), this.getClassAttribute(), this.getClassAttribute_Omtclass(), "attributes", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_Operations(), this.getClassOperation(), this.getClassOperation_Omtclass(), "operations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTClass_OutgoingRelations(), this.getOMTTPOperation(), this.getOMTTPOperation_Source(), "outgoingRelations", null, 0, -1, OMTClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtConventionalClassEClass, OMTConventionalClass.class, "OMTConventionalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoreferencedClassEClass, OMTGeoreferencedClass.class, "OMTGeoreferencedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(omtGeoFieldClassEClass, OMTGeoFieldClass.class, "OMTGeoFieldClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoFieldClass_Representation(), this.getOMTGeoFieldClassKind(), "representation", "Triangular Irregular Network", 1, 1, OMTGeoFieldClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectTopologyClassEClass, OMTGeoObjectTopologyClass.class, "OMTGeoObjectTopologyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectTopologyClass_Representation(), this.getOMTGeoObjectTopologyClassKind(), "representation", null, 0, 1, OMTGeoObjectTopologyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtGeoObjectGeometryClassEClass, OMTGeoObjectGeometryClass.class, "OMTGeoObjectGeometryClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTGeoObjectGeometryClass_Representation(), this.getOMTGeoObjectGeometryClassKind(), "representation", null, 0, 1, OMTGeoObjectGeometryClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameValueElementEClass, NameValueElement.class, "NameValueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameValueElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameValueElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, NameValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAttributeEClass, ClassAttribute.class, "ClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAttribute_Omtclass(), this.getOMTClass(), this.getOMTClass_Attributes(), "omtclass", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, ClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classOperationEClass, ClassOperation.class, "ClassOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperation_Omtclass(), this.getOMTClass(), this.getOMTClass_Operations(), "omtclass", null, 0, 1, ClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtPresentationSpecificationEClass, OMTPresentationSpecification.class, "OMTPresentationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMTPresentationSpecification_ClassName(), ecorePackage.getEString(), "className", "< ... >", 0, 1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTPresentationSpecification_PresentationName(), ecorePackage.getEString(), "presentationName", null, 0, 1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTPresentationSpecification_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTPresentationSpecification_PictogramList(), this.getPictogram(), null, "pictogramList", null, 1, -1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTPresentationSpecification_IncomingOperation(), this.getOMTTPOperation(), this.getOMTTPOperation_Target(), "incomingOperation", null, 0, 1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTPresentationSpecification_Specification(), this.getOMTSpecification(), this.getOMTSpecification_PresentationSpecification(), "specification", null, 0, -1, OMTPresentationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omtSpecificationEClass, OMTSpecification.class, "OMTSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTSpecification_PresentationSpecification(), this.getOMTPresentationSpecification(), this.getOMTPresentationSpecification_Specification(), "presentationSpecification", null, 0, 1, OMTSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pictogramEClass, Pictogram.class, "Pictogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPictogram_Meaning(), ecorePackage.getEString(), "meaning", null, 0, 1, Pictogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPictogram_ImageFileLocation(), ecorePackage.getEString(), "imageFileLocation", null, 0, 1, Pictogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omttpOperationEClass, OMTTPOperation.class, "OMTTPOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMTTPOperation_Diagram(), this.getOMTPresentationDiagram(), this.getOMTPresentationDiagram_Operations(), "diagram", null, 0, 1, OMTTPOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTTPOperation_Target(), this.getOMTPresentationSpecification(), this.getOMTPresentationSpecification_IncomingOperation(), "target", null, 0, 1, OMTTPOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMTTPOperation_Source(), this.getOMTClass(), this.getOMTClass_OutgoingRelations(), "source", null, 0, 1, OMTTPOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTTPOperation_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, OMTTPOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMTTPOperation_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OMTTPOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(imageEDataType, Image.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PDPackageImpl
