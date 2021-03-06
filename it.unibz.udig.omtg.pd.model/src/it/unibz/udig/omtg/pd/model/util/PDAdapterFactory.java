/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.util;

import it.unibz.udig.omtg.pd.model.*;
import it.unibz.udig.omtg.pd.model.ClassAttribute;
import it.unibz.udig.omtg.pd.model.ClassOperation;
import it.unibz.udig.omtg.pd.model.NameValueElement;
import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTConventionalClass;
import it.unibz.udig.omtg.pd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDPackage;
import it.unibz.udig.omtg.pd.model.Pictogram;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.pd.model.PDPackage
 * @generated
 */
public class PDAdapterFactory extends AdapterFactoryImpl
{

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PDPackage	modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = PDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType( Object object )
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDSwitch<Adapter>	modelSwitch	= new PDSwitch<Adapter>()
		{
			@Override
			public Adapter caseOMTPresentationDiagram(OMTPresentationDiagram object)
			{
				return createOMTPresentationDiagramAdapter();
			}
			@Override
			public Adapter caseOMTPDNode(OMTPDNode object)
			{
				return createOMTPDNodeAdapter();
			}
			@Override
			public Adapter caseOMTClass(OMTClass object)
			{
				return createOMTClassAdapter();
			}
			@Override
			public Adapter caseOMTConventionalClass(OMTConventionalClass object)
			{
				return createOMTConventionalClassAdapter();
			}
			@Override
			public Adapter caseOMTGeoreferencedClass(OMTGeoreferencedClass object)
			{
				return createOMTGeoreferencedClassAdapter();
			}
			@Override
			public Adapter caseOMTGeoFieldClass(OMTGeoFieldClass object)
			{
				return createOMTGeoFieldClassAdapter();
			}
			@Override
			public Adapter caseOMTGeoObjectTopologyClass(OMTGeoObjectTopologyClass object)
			{
				return createOMTGeoObjectTopologyClassAdapter();
			}
			@Override
			public Adapter caseOMTGeoObjectGeometryClass(OMTGeoObjectGeometryClass object)
			{
				return createOMTGeoObjectGeometryClassAdapter();
			}
			@Override
			public Adapter caseNameValueElement(NameValueElement object)
			{
				return createNameValueElementAdapter();
			}
			@Override
			public Adapter caseClassAttribute(ClassAttribute object)
			{
				return createClassAttributeAdapter();
			}
			@Override
			public Adapter caseClassOperation(ClassOperation object)
			{
				return createClassOperationAdapter();
			}
			@Override
			public Adapter caseOMTPresentationSpecification(OMTPresentationSpecification object)
			{
				return createOMTPresentationSpecificationAdapter();
			}
			@Override
			public Adapter caseOMTSpecification(OMTSpecification object)
			{
				return createOMTSpecificationAdapter();
			}
			@Override
			public Adapter casePictogram(Pictogram object)
			{
				return createPictogramAdapter();
			}
			@Override
			public Adapter caseOMTTPOperation(OMTTPOperation object)
			{
				return createOMTTPOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter( Notifier target )
	{
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTPDNode <em>OMTPD Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTPDNode
	 * @generated
	 */
	public Adapter createOMTPDNodeAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTPresentationDiagram <em>OMT Presentation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationDiagram
	 * @generated
	 */
	public Adapter createOMTPresentationDiagramAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTTPOperation <em>OMTTP Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTTPOperation
	 * @generated
	 */
	public Adapter createOMTTPOperationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTPresentationSpecification <em>OMT Presentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTPresentationSpecification
	 * @generated
	 */
	public Adapter createOMTPresentationSpecificationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTSpecification <em>OMT Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTSpecification
	 * @generated
	 */
	public Adapter createOMTSpecificationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.Pictogram <em>Pictogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.Pictogram
	 * @generated
	 */
	public Adapter createPictogramAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTClass <em>OMT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTClass
	 * @generated
	 */
	public Adapter createOMTClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTConventionalClass <em>OMT Conventional Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTConventionalClass
	 * @generated
	 */
	public Adapter createOMTConventionalClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass <em>OMT Georeferenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoreferencedClass
	 * @generated
	 */
	public Adapter createOMTGeoreferencedClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTGeoFieldClass <em>OMT Geo Field Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoFieldClass
	 * @generated
	 */
	public Adapter createOMTGeoFieldClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass <em>OMT Geo Object Topology Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectTopologyClass
	 * @generated
	 */
	public Adapter createOMTGeoObjectTopologyClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass <em>OMT Geo Object Geometry Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.OMTGeoObjectGeometryClass
	 * @generated
	 */
	public Adapter createOMTGeoObjectGeometryClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.NameValueElement <em>Name Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.NameValueElement
	 * @generated
	 */
	public Adapter createNameValueElementAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.ClassAttribute
	 * @generated
	 */
	public Adapter createClassAttributeAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.pd.model.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.pd.model.ClassOperation
	 * @generated
	 */
	public Adapter createClassOperationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter( )
	{
		return null;
	}

} //PDAdapterFactory
