/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.util;

import it.unibz.udig.omtg.td.model.*;
import it.unibz.udig.omtg.td.model.ClassAttribute;
import it.unibz.udig.omtg.td.model.ClassElement;
import it.unibz.udig.omtg.td.model.ClassOperation;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTConventionalClass;
import it.unibz.udig.omtg.td.model.OMTGeoFieldClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectGeometryClass;
import it.unibz.udig.omtg.td.model.OMTGeoObjectTopologyClass;
import it.unibz.udig.omtg.td.model.OMTGeoreferencedClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTDConnection;
import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;
import it.unibz.udig.omtg.td.model.TDPackage;

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
 * @see it.unibz.udig.omtg.td.model.TDPackage
 * @generated
 */
public class TDSwitch< T > extends Switch<T>
{

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TDPackage	modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = TDPackage.eINSTANCE;
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM:
			{
				OMTTransformationDiagram omtTransformationDiagram = (OMTTransformationDiagram)theEObject;
				T result = caseOMTTransformationDiagram(omtTransformationDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_CLASS:
			{
				OMTClass omtClass = (OMTClass)theEObject;
				T result = caseOMTClass(omtClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_CONVENTIONAL_CLASS:
			{
				OMTConventionalClass omtConventionalClass = (OMTConventionalClass)theEObject;
				T result = caseOMTConventionalClass(omtConventionalClass);
				if (result == null) result = caseOMTClass(omtConventionalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_GEOREFERENCED_CLASS:
			{
				OMTGeoreferencedClass omtGeoreferencedClass = (OMTGeoreferencedClass)theEObject;
				T result = caseOMTGeoreferencedClass(omtGeoreferencedClass);
				if (result == null) result = caseOMTClass(omtGeoreferencedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_GEO_FIELD_CLASS:
			{
				OMTGeoFieldClass omtGeoFieldClass = (OMTGeoFieldClass)theEObject;
				T result = caseOMTGeoFieldClass(omtGeoFieldClass);
				if (result == null) result = caseOMTClass(omtGeoFieldClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS:
			{
				OMTGeoObjectGeometryClass omtGeoObjectGeometryClass = (OMTGeoObjectGeometryClass)theEObject;
				T result = caseOMTGeoObjectGeometryClass(omtGeoObjectGeometryClass);
				if (result == null) result = caseOMTClass(omtGeoObjectGeometryClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS:
			{
				OMTGeoObjectTopologyClass omtGeoObjectTopologyClass = (OMTGeoObjectTopologyClass)theEObject;
				T result = caseOMTGeoObjectTopologyClass(omtGeoObjectTopologyClass);
				if (result == null) result = caseOMTClass(omtGeoObjectTopologyClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMTTD_CONNECTION:
			{
				OMTTDConnection omttdConnection = (OMTTDConnection)theEObject;
				T result = caseOMTTDConnection(omttdConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMT_OPERATION:
			{
				OMTOperation omtOperation = (OMTOperation)theEObject;
				T result = caseOMTOperation(omtOperation);
				if (result == null) result = caseOMTTDConnection(omtOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.OMTTR_OPERATION:
			{
				OMTTROperation omttrOperation = (OMTTROperation)theEObject;
				T result = caseOMTTROperation(omttrOperation);
				if (result == null) result = caseOMTTDConnection(omttrOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.CLASS_ELEMENT:
			{
				ClassElement classElement = (ClassElement)theEObject;
				T result = caseClassElement(classElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.CLASS_ATTRIBUTE:
			{
				ClassAttribute classAttribute = (ClassAttribute)theEObject;
				T result = caseClassAttribute(classAttribute);
				if (result == null) result = caseClassElement(classAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TDPackage.CLASS_OPERATION:
			{
				ClassOperation classOperation = (ClassOperation)theEObject;
				T result = caseClassOperation(classOperation);
				if (result == null) result = caseClassElement(classOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Transformation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Transformation Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTTransformationDiagram( OMTTransformationDiagram object )
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
	 * Returns the result of interpreting the object as an instance of '<em>OMTTD Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMTTD Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTTDConnection( OMTTDConnection object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTOperation( OMTOperation object )
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
	 * Returns the result of interpreting the object as an instance of '<em>OMTTR Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMTTR Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTTROperation( OMTTROperation object )
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

} //TDSwitch
