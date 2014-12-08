/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.*;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDFactoryImpl extends EFactoryImpl implements PDFactory
{

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PDFactory init( )
	{
		try
		{
			PDFactory thePDFactory = (PDFactory)EPackage.Registry.INSTANCE.getEFactory(PDPackage.eNS_URI);
			if (thePDFactory != null)
			{
				return thePDFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDFactoryImpl()
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
			case PDPackage.OMT_PRESENTATION_DIAGRAM: return createOMTPresentationDiagram();
			case PDPackage.OMTPD_NODE: return createOMTPDNode();
			case PDPackage.OMT_CLASS: return createOMTClass();
			case PDPackage.OMT_CONVENTIONAL_CLASS: return createOMTConventionalClass();
			case PDPackage.OMT_GEOREFERENCED_CLASS: return createOMTGeoreferencedClass();
			case PDPackage.OMT_GEO_FIELD_CLASS: return createOMTGeoFieldClass();
			case PDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS: return createOMTGeoObjectTopologyClass();
			case PDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS: return createOMTGeoObjectGeometryClass();
			case PDPackage.NAME_VALUE_ELEMENT: return createNameValueElement();
			case PDPackage.CLASS_ATTRIBUTE: return createClassAttribute();
			case PDPackage.CLASS_OPERATION: return createClassOperation();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION: return createOMTPresentationSpecification();
			case PDPackage.OMT_SPECIFICATION: return createOMTSpecification();
			case PDPackage.PICTOGRAM: return createPictogram();
			case PDPackage.OMTTP_OPERATION: return createOMTTPOperation();
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
			case PDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return createOMTGeoFieldClassKindFromString(eDataType, initialValue);
			case PDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return createOMTGeoObjectGeometryClassKindFromString(eDataType, initialValue);
			case PDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return createOMTGeoObjectTopologyClassKindFromString(eDataType, initialValue);
			case PDPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case PDPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case PDPackage.IMAGE:
				return createImageFromString(eDataType, initialValue);
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
			case PDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return convertOMTGeoFieldClassKindToString(eDataType, instanceValue);
			case PDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return convertOMTGeoObjectGeometryClassKindToString(eDataType, instanceValue);
			case PDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return convertOMTGeoObjectTopologyClassKindToString(eDataType, instanceValue);
			case PDPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case PDPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case PDPackage.IMAGE:
				return convertImageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPDNode createOMTPDNode( )
	{
		OMTPDNodeImpl omtpdNode = new OMTPDNodeImpl();
		return omtpdNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationDiagram createOMTPresentationDiagram( )
	{
		OMTPresentationDiagramImpl omtPresentationDiagram = new OMTPresentationDiagramImpl();
		return omtPresentationDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTPOperation createOMTTPOperation( )
	{
		OMTTPOperationImpl omttpOperation = new OMTTPOperationImpl();
		return omttpOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationSpecification createOMTPresentationSpecification( )
	{
		OMTPresentationSpecificationImpl omtPresentationSpecification = new OMTPresentationSpecificationImpl();
		return omtPresentationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTSpecification createOMTSpecification( )
	{
		OMTSpecificationImpl omtSpecification = new OMTSpecificationImpl();
		return omtSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pictogram createPictogram( )
	{
		PictogramImpl pictogram = new PictogramImpl();
		return pictogram;
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
	public NameValueElement createNameValueElement( )
	{
		NameValueElementImpl nameValueElement = new NameValueElementImpl();
		return nameValueElement;
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
	public Image createImageFromString( EDataType eDataType, String initialValue )
	{
		return (Image)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageToString( EDataType eDataType, Object instanceValue )
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDPackage getPDPackage( )
	{
		return (PDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PDPackage getPackage( )
	{
		return PDPackage.eINSTANCE;
	}

} //PDFactoryImpl
