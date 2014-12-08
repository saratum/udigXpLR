/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.*;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDFactoryImpl extends EFactoryImpl implements CDFactory
{

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDFactory init( )
	{
		try
		{
			CDFactory theCDFactory = (CDFactory)EPackage.Registry.INSTANCE.getEFactory(CDPackage.eNS_URI);
			if (theCDFactory != null)
			{
				return theCDFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create( EClass eClass )
	{
		switch (eClass.getClassifierID())
		{
			case CDPackage.OMT_CLASS_DIAGRAM: return createOMTClassDiagram();
			case CDPackage.OMT_CLASS: return createOMTClass();
			case CDPackage.CLASS_ELEMENT: return createClassElement();
			case CDPackage.CLASS_OPERATION: return createClassOperation();
			case CDPackage.CLASS_ATTRIBUTE: return createClassAttribute();
			case CDPackage.OMT_CONVENTIONAL_CLASS: return createOMTConventionalClass();
			case CDPackage.OMT_GEOREFERENCED_CLASS: return createOMTGeoreferencedClass();
			case CDPackage.OMT_GEO_FIELD_CLASS: return createOMTGeoFieldClass();
			case CDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS: return createOMTGeoObjectGeometryClass();
			case CDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS: return createOMTGeoObjectTopologyClass();
			case CDPackage.OMT_GENERALIZATION: return createOMTGeneralization();
			case CDPackage.OMT_RELATIONSHIP: return createOMTRelationship();
			case CDPackage.OMT_AGGREGATION: return createOMTAggregation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString( EDataType eDataType, String initialValue )
	{
		switch (eDataType.getClassifierID())
		{
			case CDPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case CDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return createOMTGeoFieldClassKindFromString(eDataType, initialValue);
			case CDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return createOMTGeoObjectGeometryClassKindFromString(eDataType, initialValue);
			case CDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return createOMTGeoObjectTopologyClassKindFromString(eDataType, initialValue);
			case CDPackage.OMT_RELATIONSHIP_TYPE:
				return createOMTRelationshipTypeFromString(eDataType, initialValue);
			case CDPackage.SPATIAL_INTEGRITY_RULE:
				return createSpatialIntegrityRuleFromString(eDataType, initialValue);
			case CDPackage.GENERALIZATION_KIND:
				return createGeneralizationKindFromString(eDataType, initialValue);
			case CDPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case CDPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString( EDataType eDataType, Object instanceValue )
	{
		switch (eDataType.getClassifierID())
		{
			case CDPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case CDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return convertOMTGeoFieldClassKindToString(eDataType, instanceValue);
			case CDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return convertOMTGeoObjectGeometryClassKindToString(eDataType, instanceValue);
			case CDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return convertOMTGeoObjectTopologyClassKindToString(eDataType, instanceValue);
			case CDPackage.OMT_RELATIONSHIP_TYPE:
				return convertOMTRelationshipTypeToString(eDataType, instanceValue);
			case CDPackage.SPATIAL_INTEGRITY_RULE:
				return convertSpatialIntegrityRuleToString(eDataType, instanceValue);
			case CDPackage.GENERALIZATION_KIND:
				return convertGeneralizationKindToString(eDataType, instanceValue);
			case CDPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case CDPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperation createClassOperation( )
	{
		ClassOperationImpl classOperation = new ClassOperationImpl();
		return classOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeneralization createOMTGeneralization( )
	{
		OMTGeneralizationImpl omtGeneralization = new OMTGeneralizationImpl();
		return omtGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoFieldClass createOMTGeoFieldClass( )
	{
		OMTGeoFieldClassImpl omtGeoFieldClass = new OMTGeoFieldClassImpl();
		return omtGeoFieldClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoObjectGeometryClass createOMTGeoObjectGeometryClass( )
	{
		OMTGeoObjectGeometryClassImpl omtGeoObjectGeometryClass = new OMTGeoObjectGeometryClassImpl();
		return omtGeoObjectGeometryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoObjectTopologyClass createOMTGeoObjectTopologyClass( )
	{
		OMTGeoObjectTopologyClassImpl omtGeoObjectTopologyClass = new OMTGeoObjectTopologyClassImpl();
		return omtGeoObjectTopologyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTAggregation createOMTAggregation( )
	{
		OMTAggregationImpl omtAggregation = new OMTAggregationImpl();
		return omtAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTRelationship createOMTRelationship( )
	{
		OMTRelationshipImpl omtRelationship = new OMTRelationshipImpl();
		return omtRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement createClassElement( )
	{
		ClassElementImpl classElement = new ClassElementImpl();
		return classElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAttribute createClassAttribute( )
	{
		ClassAttributeImpl classAttribute = new ClassAttributeImpl();
		return classAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClassDiagram createOMTClassDiagram( )
	{
		OMTClassDiagramImpl omtClassDiagram = new OMTClassDiagramImpl();
		return omtClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass createOMTClass( )
	{
		OMTClassImpl omtClass = new OMTClassImpl();
		return omtClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTConventionalClass createOMTConventionalClass( )
	{
		OMTConventionalClassImpl omtConventionalClass = new OMTConventionalClassImpl();
		return omtConventionalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoreferencedClass createOMTGeoreferencedClass( )
	{
		OMTGeoreferencedClassImpl omtGeoreferencedClass = new OMTGeoreferencedClassImpl();
		return omtGeoreferencedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString( EDataType eDataType, String initialValue )
	{
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoFieldClassKind createOMTGeoFieldClassKindFromString( EDataType eDataType, String initialValue )
	{
		OMTGeoFieldClassKind result = OMTGeoFieldClassKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTGeoFieldClassKindToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoObjectGeometryClassKind createOMTGeoObjectGeometryClassKindFromString( EDataType eDataType,
			String initialValue )
	{
		OMTGeoObjectGeometryClassKind result = OMTGeoObjectGeometryClassKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTGeoObjectGeometryClassKindToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTGeoObjectTopologyClassKind createOMTGeoObjectTopologyClassKindFromString( EDataType eDataType,
			String initialValue )
	{
		OMTGeoObjectTopologyClassKind result = OMTGeoObjectTopologyClassKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTGeoObjectTopologyClassKindToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTRelationshipType createOMTRelationshipTypeFromString( EDataType eDataType, String initialValue )
	{
		OMTRelationshipType result = OMTRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTRelationshipTypeToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialIntegrityRule createSpatialIntegrityRuleFromString( EDataType eDataType, String initialValue )
	{
		SpatialIntegrityRule result = SpatialIntegrityRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialIntegrityRuleToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationKind createGeneralizationKindFromString( EDataType eDataType, String initialValue )
	{
		GeneralizationKind result = GeneralizationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneralizationKindToString( EDataType eDataType, Object instanceValue )
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString( EDataType eDataType, String initialValue )
	{
		if ( initialValue == null )
		{
			return null;
		}
		initialValue.replaceAll( "\\s", "" );
		String[ ] values = initialValue.split( "," );
		if ( values.length != 4 )
		{
			return null;
		}

		Rectangle rect = new Rectangle();
		try
		{
			rect.setLocation( Integer.parseInt( values[ 0 ] ), Integer.parseInt( values[ 1 ] ) );
			rect.setSize( Integer.parseInt( values[ 2 ] ), Integer.parseInt( values[ 3 ] ) );
		}
		catch ( NumberFormatException e )
		{
			EcorePlugin.INSTANCE.log( e );
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertRectangleToString( EDataType eDataType, Object instanceValue )
	{
		if ( instanceValue == null )
		{
			return null;
		}
		Rectangle rect = (Rectangle)instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString( EDataType eDataType, String initialValue )
	{
		if ( initialValue == null )
		{
			return null;
		}
		initialValue.replaceAll( "\\s", "" );
		String[ ] values = initialValue.split( "," );
		if ( values.length != 2 )
		{
			return null;
		}

		Point point = new Point();
		try
		{
			point.setLocation( Integer.parseInt( values[ 0 ] ), Integer.parseInt( values[ 1 ] ) );
		}
		catch ( NumberFormatException e )
		{
			EcorePlugin.INSTANCE.log( e );
			point = null;
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString( EDataType eDataType, Object instanceValue )
	{
		if ( instanceValue == null )
		{
			return null;
		}
		Point p = (Point)instanceValue;
		return p.x + "," + p.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPackage getCDPackage( )
	{
		return (CDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDPackage getPackage( )
	{
		return CDPackage.eINSTANCE;
	}

} //CDFactoryImpl
