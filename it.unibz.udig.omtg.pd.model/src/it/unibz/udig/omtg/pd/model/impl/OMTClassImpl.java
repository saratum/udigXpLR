/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.ClassAttribute;
import it.unibz.udig.omtg.pd.model.ClassOperation;
import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTClassImpl#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTClassImpl extends OMTPDNodeImpl implements OMTClass
{

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String		NAME_EDEFAULT	= "< ... >";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String					name			= NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAttribute>	attributes;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassOperation>	operations;

	/**
	 * The cached value of the '{@link #getOutgoingRelations() <em>Outgoing Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTTPOperation>	outgoingRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTClassImpl()
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
		return PDPackage.Literals.OMT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName( )
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName( String newName )
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAttribute> getAttributes( )
	{
		if (attributes == null)
		{
			attributes = new EObjectContainmentWithInverseEList<ClassAttribute>(ClassAttribute.class, this, PDPackage.OMT_CLASS__ATTRIBUTES, PDPackage.CLASS_ATTRIBUTE__OMTCLASS);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassOperation> getOperations( )
	{
		if (operations == null)
		{
			operations = new EObjectContainmentWithInverseEList<ClassOperation>(ClassOperation.class, this, PDPackage.OMT_CLASS__OPERATIONS, PDPackage.CLASS_OPERATION__OMTCLASS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTTPOperation> getOutgoingRelations( )
	{
		if (outgoingRelations == null)
		{
			outgoingRelations = new EObjectWithInverseResolvingEList<OMTTPOperation>(OMTTPOperation.class, this, PDPackage.OMT_CLASS__OUTGOING_RELATIONS, PDPackage.OMTTP_OPERATION__SOURCE);
		}
		return outgoingRelations;
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
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case PDPackage.OMT_CLASS__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingRelations()).basicAdd(otherEnd, msgs);
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
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PDPackage.OMT_CLASS__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<?>)getOutgoingRelations()).basicRemove(otherEnd, msgs);
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
			case PDPackage.OMT_CLASS__NAME:
				return getName();
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				return getAttributes();
			case PDPackage.OMT_CLASS__OPERATIONS:
				return getOperations();
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return getOutgoingRelations();
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
			case PDPackage.OMT_CLASS__NAME:
				setName((String)newValue);
				return;
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ClassAttribute>)newValue);
				return;
			case PDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ClassOperation>)newValue);
				return;
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				getOutgoingRelations().addAll((Collection<? extends OMTTPOperation>)newValue);
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
			case PDPackage.OMT_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				return;
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
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
			case PDPackage.OMT_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PDPackage.OMT_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PDPackage.OMT_CLASS__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case PDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return outgoingRelations != null && !outgoingRelations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OMTClassImpl
