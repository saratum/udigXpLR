/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Presentation Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationDiagramImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTPresentationDiagramImpl extends EObjectImpl implements OMTPresentationDiagram
{

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTPDNode>		objects;
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTTPOperation>	operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTPresentationDiagramImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass( )
	{
		return PDPackage.Literals.OMT_PRESENTATION_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTPDNode> getObjects( )
	{
		if (objects == null)
		{
			objects = new EObjectContainmentWithInverseEList<OMTPDNode>(OMTPDNode.class, this, PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS, PDPackage.OMTPD_NODE__DIAGRAM);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTTPOperation> getOperations( )
	{
		if (operations == null)
		{
			operations = new EObjectContainmentWithInverseEList<OMTTPOperation>(OMTTPOperation.class, this, PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS, PDPackage.OMTTP_OPERATION__DIAGRAM);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings( "unchecked" )
	@Override
	public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjects()).basicAdd(otherEnd, msgs);
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet( int featureID, boolean resolve, boolean coreType )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				return getObjects();
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings( "unchecked" )
	@Override
	public void eSet( int featureID, Object newValue )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends OMTPDNode>)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OMTTPOperation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset( int featureID )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				getObjects().clear();
				return;
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				getOperations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet( int featureID )
	{
		switch (featureID)
		{
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS:
				return objects != null && !objects.isEmpty();
			case PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OMTPresentationDiagramImpl
