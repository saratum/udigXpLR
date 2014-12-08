/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.util;

import it.unibz.udig.omtg.cd.model.*;
import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.ClassElement;
import it.unibz.udig.omtg.cd.model.ClassOperation;
import it.unibz.udig.omtg.cd.model.OMTAggregation;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTConventionalClass;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;
import it.unibz.udig.omtg.cd.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.cd.model.CDPackage
 * @generated
 */
public class CDAdapterFactory extends AdapterFactoryImpl
{

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDPackage	modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = CDPackage.eINSTANCE;
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
	protected CDSwitch<Adapter>	modelSwitch	= new CDSwitch<Adapter>()
		{
			@Override
			public Adapter caseOMTClassDiagram(OMTClassDiagram object)
			{
				return createOMTClassDiagramAdapter();
			}
			@Override
			public Adapter caseOMTClass(OMTClass object)
			{
				return createOMTClassAdapter();
			}
			@Override
			public Adapter caseClassElement(ClassElement object)
			{
				return createClassElementAdapter();
			}
			@Override
			public Adapter caseClassOperation(ClassOperation object)
			{
				return createClassOperationAdapter();
			}
			@Override
			public Adapter caseClassAttribute(ClassAttribute object)
			{
				return createClassAttributeAdapter();
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
			public Adapter caseOMTGeoObjectGeometryClass(OMTGeoObjectGeometryClass object)
			{
				return createOMTGeoObjectGeometryClassAdapter();
			}
			@Override
			public Adapter caseOMTGeoObjectTopologyClass(OMTGeoObjectTopologyClass object)
			{
				return createOMTGeoObjectTopologyClassAdapter();
			}
			@Override
			public Adapter caseOMTGeneralization(OMTGeneralization object)
			{
				return createOMTGeneralizationAdapter();
			}
			@Override
			public Adapter caseOMTRelationship(OMTRelationship object)
			{
				return createOMTRelationshipAdapter();
			}
			@Override
			public Adapter caseOMTAggregation(OMTAggregation object)
			{
				return createOMTAggregationAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.ClassOperation
	 * @generated
	 */
	public Adapter createClassOperationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTGeneralization <em>OMT Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeneralization
	 * @generated
	 */
	public Adapter createOMTGeneralizationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTGeoFieldClass <em>OMT Geo Field Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoFieldClass
	 * @generated
	 */
	public Adapter createOMTGeoFieldClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass <em>OMT Geo Object Geometry Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectGeometryClass
	 * @generated
	 */
	public Adapter createOMTGeoObjectGeometryClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass <em>OMT Geo Object Topology Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoObjectTopologyClass
	 * @generated
	 */
	public Adapter createOMTGeoObjectTopologyClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTAggregation <em>OMT Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTAggregation
	 * @generated
	 */
	public Adapter createOMTAggregationAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTRelationship <em>OMT Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTRelationship
	 * @generated
	 */
	public Adapter createOMTRelationshipAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.ClassElement
	 * @generated
	 */
	public Adapter createClassElementAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.ClassAttribute
	 * @generated
	 */
	public Adapter createClassAttributeAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTClassDiagram <em>OMT Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTClassDiagram
	 * @generated
	 */
	public Adapter createOMTClassDiagramAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTClass <em>OMT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTClass
	 * @generated
	 */
	public Adapter createOMTClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTConventionalClass <em>OMT Conventional Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTConventionalClass
	 * @generated
	 */
	public Adapter createOMTConventionalClassAdapter( )
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass <em>OMT Georeferenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.udig.omtg.cd.model.OMTGeoreferencedClass
	 * @generated
	 */
	public Adapter createOMTGeoreferencedClassAdapter( )
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

} //CDAdapterFactory
