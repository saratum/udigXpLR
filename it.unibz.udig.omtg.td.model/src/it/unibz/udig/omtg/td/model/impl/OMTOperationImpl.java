/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.TDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTOperationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTOperationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTOperationImpl extends OMTTDConnectionImpl implements OMTOperation
{

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OMTClass				target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OMTClass				source;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String	OPERATOR_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String				operator			= OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTOperationImpl()
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
		return TDPackage.Literals.OMT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass getTarget( )
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OMTClass)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TDPackage.OMT_OPERATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass basicGetTarget( )
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget( OMTClass newTarget, NotificationChain msgs )
	{
		OMTClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TDPackage.OMT_OPERATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget( OMTClass newTarget )
	{
		if (newTarget != target)
		{
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, TDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, TDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_OPERATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass getSource( )
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (OMTClass)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TDPackage.OMT_OPERATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClass basicGetSource( )
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource( OMTClass newSource, NotificationChain msgs )
	{
		OMTClass oldSource = source;
		source = newSource;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TDPackage.OMT_OPERATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource( OMTClass newSource )
	{
		if (newSource != source)
		{
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, TDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, TDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_OPERATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator( )
	{
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator( String newOperator )
	{
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_OPERATION__OPERATOR, oldOperator, operator));
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
			case TDPackage.OMT_OPERATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, TDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
				return basicSetTarget((OMTClass)otherEnd, msgs);
			case TDPackage.OMT_OPERATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, TDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
				return basicSetSource((OMTClass)otherEnd, msgs);
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
			case TDPackage.OMT_OPERATION__TARGET:
				return basicSetTarget(null, msgs);
			case TDPackage.OMT_OPERATION__SOURCE:
				return basicSetSource(null, msgs);
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
			case TDPackage.OMT_OPERATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TDPackage.OMT_OPERATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TDPackage.OMT_OPERATION__OPERATOR:
				return getOperator();
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
			case TDPackage.OMT_OPERATION__TARGET:
				setTarget((OMTClass)newValue);
				return;
			case TDPackage.OMT_OPERATION__SOURCE:
				setSource((OMTClass)newValue);
				return;
			case TDPackage.OMT_OPERATION__OPERATOR:
				setOperator((String)newValue);
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
			case TDPackage.OMT_OPERATION__TARGET:
				setTarget((OMTClass)null);
				return;
			case TDPackage.OMT_OPERATION__SOURCE:
				setSource((OMTClass)null);
				return;
			case TDPackage.OMT_OPERATION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case TDPackage.OMT_OPERATION__TARGET:
				return target != null;
			case TDPackage.OMT_OPERATION__SOURCE:
				return source != null;
			case TDPackage.OMT_OPERATION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //OMTOperationImpl
