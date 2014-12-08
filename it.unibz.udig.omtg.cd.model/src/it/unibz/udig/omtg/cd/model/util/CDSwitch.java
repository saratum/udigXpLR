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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unibz.udig.omtg.cd.model.CDPackage
 * @generated
 */
public class CDSwitch< T > extends Switch<T>
{

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDPackage	modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = CDPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor( EPackage ePackage )
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch( int classifierID, EObject theEObject )
	{
		switch (classifierID)
		{
			case CDPackage.OMT_CLASS_DIAGRAM:
			{
				OMTClassDiagram omtClassDiagram = (OMTClassDiagram)theEObject;
				T result = caseOMTClassDiagram(omtClassDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_CLASS:
			{
				OMTClass omtClass = (OMTClass)theEObject;
				T result = caseOMTClass(omtClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.CLASS_ELEMENT:
			{
				ClassElement classElement = (ClassElement)theEObject;
				T result = caseClassElement(classElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.CLASS_OPERATION:
			{
				ClassOperation classOperation = (ClassOperation)theEObject;
				T result = caseClassOperation(classOperation);
				if (result == null) result = caseClassElement(classOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.CLASS_ATTRIBUTE:
			{
				ClassAttribute classAttribute = (ClassAttribute)theEObject;
				T result = caseClassAttribute(classAttribute);
				if (result == null) result = caseClassElement(classAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_CONVENTIONAL_CLASS:
			{
				OMTConventionalClass omtConventionalClass = (OMTConventionalClass)theEObject;
				T result = caseOMTConventionalClass(omtConventionalClass);
				if (result == null) result = caseOMTClass(omtConventionalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_GEOREFERENCED_CLASS:
			{
				OMTGeoreferencedClass omtGeoreferencedClass = (OMTGeoreferencedClass)theEObject;
				T result = caseOMTGeoreferencedClass(omtGeoreferencedClass);
				if (result == null) result = caseOMTClass(omtGeoreferencedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_GEO_FIELD_CLASS:
			{
				OMTGeoFieldClass omtGeoFieldClass = (OMTGeoFieldClass)theEObject;
				T result = caseOMTGeoFieldClass(omtGeoFieldClass);
				if (result == null) result = caseOMTClass(omtGeoFieldClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS:
			{
				OMTGeoObjectGeometryClass omtGeoObjectGeometryClass = (OMTGeoObjectGeometryClass)theEObject;
				T result = caseOMTGeoObjectGeometryClass(omtGeoObjectGeometryClass);
				if (result == null) result = caseOMTClass(omtGeoObjectGeometryClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS:
			{
				OMTGeoObjectTopologyClass omtGeoObjectTopologyClass = (OMTGeoObjectTopologyClass)theEObject;
				T result = caseOMTGeoObjectTopologyClass(omtGeoObjectTopologyClass);
				if (result == null) result = caseOMTClass(omtGeoObjectTopologyClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_GENERALIZATION:
			{
				OMTGeneralization omtGeneralization = (OMTGeneralization)theEObject;
				T result = caseOMTGeneralization(omtGeneralization);
				if (result == null) result = caseOMTRelationship(omtGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_RELATIONSHIP:
			{
				OMTRelationship omtRelationship = (OMTRelationship)theEObject;
				T result = caseOMTRelationship(omtRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDPackage.OMT_AGGREGATION:
			{
				OMTAggregation omtAggregation = (OMTAggregation)theEObject;
				T result = caseOMTAggregation(omtAggregation);
				if (result == null) result = caseOMTRelationship(omtAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOperation( ClassOperation object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTGeneralization( OMTGeneralization object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Geo Field Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Geo Field Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTGeoFieldClass( OMTGeoFieldClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Geo Object Geometry Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Geo Object Geometry Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTGeoObjectGeometryClass( OMTGeoObjectGeometryClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Geo Object Topology Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Geo Object Topology Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTGeoObjectTopologyClass( OMTGeoObjectTopologyClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTAggregation( OMTAggregation object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTRelationship( OMTRelationship object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassElement( ClassElement object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAttribute( ClassAttribute object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTClassDiagram( OMTClassDiagram object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTClass( OMTClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Conventional Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Conventional Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTConventionalClass( OMTConventionalClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Georeferenced Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Georeferenced Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTGeoreferencedClass( OMTGeoreferencedClass object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase( EObject object )
	{
		return null;
	}

} //CDSwitch
