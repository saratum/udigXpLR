/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.*;
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
public class TDFactoryImpl extends EFactoryImpl implements TDFactory
{

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDFactory init( )
	{
		try
		{
			TDFactory theTDFactory = (TDFactory)EPackage.Registry.INSTANCE.getEFactory(TDPackage.eNS_URI);
			if (theTDFactory != null)
			{
				return theTDFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDFactoryImpl()
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM: return createOMTTransformationDiagram();
			case TDPackage.OMT_CLASS: return createOMTClass();
			case TDPackage.OMT_CONVENTIONAL_CLASS: return createOMTConventionalClass();
			case TDPackage.OMT_GEOREFERENCED_CLASS: return createOMTGeoreferencedClass();
			case TDPackage.OMT_GEO_FIELD_CLASS: return createOMTGeoFieldClass();
			case TDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS: return createOMTGeoObjectGeometryClass();
			case TDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS: return createOMTGeoObjectTopologyClass();
			case TDPackage.OMTTD_CONNECTION: return createOMTTDConnection();
			case TDPackage.OMT_OPERATION: return createOMTOperation();
			case TDPackage.OMTTR_OPERATION: return createOMTTROperation();
			case TDPackage.CLASS_ELEMENT: return createClassElement();
			case TDPackage.CLASS_ATTRIBUTE: return createClassAttribute();
			case TDPackage.CLASS_OPERATION: return createClassOperation();
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
			case TDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return createOMTGeoFieldClassKindFromString(eDataType, initialValue);
			case TDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return createOMTGeoObjectGeometryClassKindFromString(eDataType, initialValue);
			case TDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return createOMTGeoObjectTopologyClassKindFromString(eDataType, initialValue);
			case TDPackage.TR_OPERATOR_KIND:
				return createTROperatorKindFromString(eDataType, initialValue);
			case TDPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case TDPackage.POINT:
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
			case TDPackage.OMT_GEO_FIELD_CLASS_KIND:
				return convertOMTGeoFieldClassKindToString(eDataType, instanceValue);
			case TDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS_KIND:
				return convertOMTGeoObjectGeometryClassKindToString(eDataType, instanceValue);
			case TDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS_KIND:
				return convertOMTGeoObjectTopologyClassKindToString(eDataType, instanceValue);
			case TDPackage.TR_OPERATOR_KIND:
				return convertTROperatorKindToString(eDataType, instanceValue);
			case TDPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case TDPackage.POINT:
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
	public OMTTransformationDiagram createOMTTransformationDiagram( )
	{
		OMTTransformationDiagramImpl omtTransformationDiagram = new OMTTransformationDiagramImpl();
		return omtTransformationDiagram;
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
	public OMTTDConnection createOMTTDConnection( )
	{
		OMTTDConnectionImpl omttdConnection = new OMTTDConnectionImpl();
		return omttdConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTOperation createOMTOperation( )
	{
		OMTOperationImpl omtOperation = new OMTOperationImpl();
		return omtOperation;
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
	public OMTTROperation createOMTTROperation( )
	{
		OMTTROperationImpl omttrOperation = new OMTTROperationImpl();
		return omttrOperation;
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
	public TROperatorKind createTROperatorKindFromString( EDataType eDataType, String initialValue )
	{
		TROperatorKind result = TROperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTROperatorKindToString( EDataType eDataType, Object instanceValue )
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
	public TDPackage getTDPackage( )
	{
		return (TDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TDPackage getPackage( )
	{
		return TDPackage.eINSTANCE;
	}

} //TDFactoryImpl
