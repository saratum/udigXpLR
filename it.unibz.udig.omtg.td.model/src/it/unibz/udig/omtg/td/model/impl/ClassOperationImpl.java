/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.ClassOperation;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.TDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.ClassOperationImpl#getOmtclass <em>Omtclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOperationImpl extends ClassElementImpl implements ClassOperation
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOperationImpl()
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
		return TDPackage.Literals.CLASS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass getOmtclass( )
	{
		if (eContainerFeatureID() != TDPackage.CLASS_OPERATION__OMTCLASS) return null;
		return (OMTClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOmtclass( OMTClass newOmtclass, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newOmtclass, TDPackage.CLASS_OPERATION__OMTCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmtclass( OMTClass newOmtclass )
	{
		if (newOmtclass != eInternalContainer() || (eContainerFeatureID() != TDPackage.CLASS_OPERATION__OMTCLASS && newOmtclass != null))
		{
			if (EcoreUtil.isAncestor(this, newOmtclass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOmtclass != null)
				msgs = ((InternalEObject)newOmtclass).eInverseAdd(this, TDPackage.OMT_CLASS__OPERATIONS, OMTClass.class, msgs);
			msgs = basicSetOmtclass(newOmtclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.CLASS_OPERATION__OMTCLASS, newOmtclass, newOmtclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs )
	{
		switch (featureID)
		{
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOmtclass((OMTClass)otherEnd, msgs);
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
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				return basicSetOmtclass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs )
	{
		switch (eContainerFeatureID())
		{
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				return eInternalContainer().eInverseRemove(this, TDPackage.OMT_CLASS__OPERATIONS, OMTClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				return getOmtclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet( int featureID, Object newValue )
	{
		switch (featureID)
		{
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				setOmtclass((OMTClass)newValue);
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
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				setOmtclass((OMTClass)null);
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
			case TDPackage.CLASS_OPERATION__OMTCLASS:
				return getOmtclass() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassOperationImpl
