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
 * @see it.unibz.udig.omtg.pd.model.PDPackage
 * @generated
 */
public class PDSwitch< T > extends Switch<T>
{

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PDPackage	modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PDPackage.eINSTANCE;
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
			case PDPackage.OMT_PRESENTATION_DIAGRAM:
			{
				OMTPresentationDiagram omtPresentationDiagram = (OMTPresentationDiagram)theEObject;
				T result = caseOMTPresentationDiagram(omtPresentationDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMTPD_NODE:
			{
				OMTPDNode omtpdNode = (OMTPDNode)theEObject;
				T result = caseOMTPDNode(omtpdNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_CLASS:
			{
				OMTClass omtClass = (OMTClass)theEObject;
				T result = caseOMTClass(omtClass);
				if (result == null) result = caseOMTPDNode(omtClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_CONVENTIONAL_CLASS:
			{
				OMTConventionalClass omtConventionalClass = (OMTConventionalClass)theEObject;
				T result = caseOMTConventionalClass(omtConventionalClass);
				if (result == null) result = caseOMTClass(omtConventionalClass);
				if (result == null) result = caseOMTPDNode(omtConventionalClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_GEOREFERENCED_CLASS:
			{
				OMTGeoreferencedClass omtGeoreferencedClass = (OMTGeoreferencedClass)theEObject;
				T result = caseOMTGeoreferencedClass(omtGeoreferencedClass);
				if (result == null) result = caseOMTClass(omtGeoreferencedClass);
				if (result == null) result = caseOMTPDNode(omtGeoreferencedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_GEO_FIELD_CLASS:
			{
				OMTGeoFieldClass omtGeoFieldClass = (OMTGeoFieldClass)theEObject;
				T result = caseOMTGeoFieldClass(omtGeoFieldClass);
				if (result == null) result = caseOMTClass(omtGeoFieldClass);
				if (result == null) result = caseOMTPDNode(omtGeoFieldClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_GEO_OBJECT_TOPOLOGY_CLASS:
			{
				OMTGeoObjectTopologyClass omtGeoObjectTopologyClass = (OMTGeoObjectTopologyClass)theEObject;
				T result = caseOMTGeoObjectTopologyClass(omtGeoObjectTopologyClass);
				if (result == null) result = caseOMTClass(omtGeoObjectTopologyClass);
				if (result == null) result = caseOMTPDNode(omtGeoObjectTopologyClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_GEO_OBJECT_GEOMETRY_CLASS:
			{
				OMTGeoObjectGeometryClass omtGeoObjectGeometryClass = (OMTGeoObjectGeometryClass)theEObject;
				T result = caseOMTGeoObjectGeometryClass(omtGeoObjectGeometryClass);
				if (result == null) result = caseOMTClass(omtGeoObjectGeometryClass);
				if (result == null) result = caseOMTPDNode(omtGeoObjectGeometryClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.NAME_VALUE_ELEMENT:
			{
				NameValueElement nameValueElement = (NameValueElement)theEObject;
				T result = caseNameValueElement(nameValueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.CLASS_ATTRIBUTE:
			{
				ClassAttribute classAttribute = (ClassAttribute)theEObject;
				T result = caseClassAttribute(classAttribute);
				if (result == null) result = caseNameValueElement(classAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.CLASS_OPERATION:
			{
				ClassOperation classOperation = (ClassOperation)theEObject;
				T result = caseClassOperation(classOperation);
				if (result == null) result = caseNameValueElement(classOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_PRESENTATION_SPECIFICATION:
			{
				OMTPresentationSpecification omtPresentationSpecification = (OMTPresentationSpecification)theEObject;
				T result = caseOMTPresentationSpecification(omtPresentationSpecification);
				if (result == null) result = caseOMTPDNode(omtPresentationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMT_SPECIFICATION:
			{
				OMTSpecification omtSpecification = (OMTSpecification)theEObject;
				T result = caseOMTSpecification(omtSpecification);
				if (result == null) result = caseNameValueElement(omtSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.PICTOGRAM:
			{
				Pictogram pictogram = (Pictogram)theEObject;
				T result = casePictogram(pictogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PDPackage.OMTTP_OPERATION:
			{
				OMTTPOperation omttpOperation = (OMTTPOperation)theEObject;
				T result = caseOMTTPOperation(omttpOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMTPD Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMTPD Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTPDNode( OMTPDNode object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Presentation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Presentation Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTPresentationDiagram( OMTPresentationDiagram object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMTTP Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMTTP Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTTPOperation( OMTTPOperation object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Presentation Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Presentation Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTPresentationSpecification( OMTPresentationSpecification object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMT Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMT Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMTSpecification( OMTSpecification object )
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pictogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pictogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePictogram( Pictogram object )
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
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValueElement( NameValueElement object )
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

} //PDSwitch
