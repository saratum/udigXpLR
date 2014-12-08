/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTSpecification;
import it.unibz.udig.omtg.pd.model.PDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTSpecificationImpl#getPresentationSpecification <em>Presentation Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTSpecificationImpl extends NameValueElementImpl implements OMTSpecification
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTSpecificationImpl()
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
		return PDPackage.Literals.OMT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationSpecification getPresentationSpecification( )
	{
		if (eContainerFeatureID() != PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION) return null;
		return (OMTPresentationSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationSpecification(
			OMTPresentationSpecification newPresentationSpecification, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newPresentationSpecification, PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationSpecification( OMTPresentationSpecification newPresentationSpecification )
	{
		if (newPresentationSpecification != eInternalContainer() || (eContainerFeatureID() != PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION && newPresentationSpecification != null))
		{
			if (EcoreUtil.isAncestor(this, newPresentationSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPresentationSpecification != null)
				msgs = ((InternalEObject)newPresentationSpecification).eInverseAdd(this, PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION, OMTPresentationSpecification.class, msgs);
			msgs = basicSetPresentationSpecification(newPresentationSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION, newPresentationSpecification, newPresentationSpecification));
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPresentationSpecification((OMTPresentationSpecification)otherEnd, msgs);
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				return basicSetPresentationSpecification(null, msgs);
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION, OMTPresentationSpecification.class, msgs);
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				return getPresentationSpecification();
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				setPresentationSpecification((OMTPresentationSpecification)newValue);
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				setPresentationSpecification((OMTPresentationSpecification)null);
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
			case PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION:
				return getPresentationSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} //OMTSpecificationImpl
