/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.OMTClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl#getOmtclass <em>Omtclass</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl#isKey <em>Key</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.ClassAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAttributeImpl extends ClassElementImpl implements ClassAttribute
{

	/**
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean	KEY_EDEFAULT			= false;
	/**
	 * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected boolean				key						= KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String	DEFAULT_VALUE_EDEFAULT	= null;
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String				defaultValue			= DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassAttributeImpl()
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
		return CDPackage.Literals.CLASS_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass getOmtclass( )
	{
		if (eContainerFeatureID() != CDPackage.CLASS_ATTRIBUTE__OMTCLASS) return null;
		return (OMTClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOmtclass( OMTClass newOmtclass, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newOmtclass, CDPackage.CLASS_ATTRIBUTE__OMTCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmtclass( OMTClass newOmtclass )
	{
		if (newOmtclass != eInternalContainer() || (eContainerFeatureID() != CDPackage.CLASS_ATTRIBUTE__OMTCLASS && newOmtclass != null))
		{
			if (EcoreUtil.isAncestor(this, newOmtclass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOmtclass != null)
				msgs = ((InternalEObject)newOmtclass).eInverseAdd(this, CDPackage.OMT_CLASS__ATTRIBUTES, OMTClass.class, msgs);
			msgs = basicSetOmtclass(newOmtclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.CLASS_ATTRIBUTE__OMTCLASS, newOmtclass, newOmtclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKey( )
	{
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey( boolean newKey )
	{
		boolean oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.CLASS_ATTRIBUTE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue( )
	{
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue( String newDefaultValue )
	{
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.CLASS_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
				return eInternalContainer().eInverseRemove(this, CDPackage.OMT_CLASS__ATTRIBUTES, OMTClass.class, msgs);
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
				return getOmtclass();
			case CDPackage.CLASS_ATTRIBUTE__KEY:
				return isKey();
			case CDPackage.CLASS_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
				setOmtclass((OMTClass)newValue);
				return;
			case CDPackage.CLASS_ATTRIBUTE__KEY:
				setKey((Boolean)newValue);
				return;
			case CDPackage.CLASS_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
				setOmtclass((OMTClass)null);
				return;
			case CDPackage.CLASS_ATTRIBUTE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CDPackage.CLASS_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case CDPackage.CLASS_ATTRIBUTE__OMTCLASS:
				return getOmtclass() != null;
			case CDPackage.CLASS_ATTRIBUTE__KEY:
				return key != KEY_EDEFAULT;
			case CDPackage.CLASS_ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString( )
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ClassAttributeImpl
