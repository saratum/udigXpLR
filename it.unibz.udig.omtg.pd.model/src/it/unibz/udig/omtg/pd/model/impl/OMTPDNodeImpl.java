/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.OMTPDNode;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.PDFactory;
import it.unibz.udig.omtg.pd.model.PDPackage;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMTPD Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPDNodeImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTPDNodeImpl extends EObjectImpl implements OMTPDNode
{

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle	CONSTRAINT_EDEFAULT	= (Rectangle)PDFactory.eINSTANCE.createFromString(PDPackage.eINSTANCE.getRectangle(), "0,0,100,100");
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Rectangle					constraint			= CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTPDNodeImpl()
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
		return PDPackage.Literals.OMTPD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationDiagram getDiagram( )
	{
		if (eContainerFeatureID() != PDPackage.OMTPD_NODE__DIAGRAM) return null;
		return (OMTPresentationDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTPresentationDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, PDPackage.OMTPD_NODE__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTPresentationDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != PDPackage.OMTPD_NODE__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS, OMTPresentationDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTPD_NODE__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraint( )
	{
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint( Rectangle newConstraint )
	{
		Rectangle oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTPD_NODE__CONSTRAINT, oldConstraint, constraint));
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTPresentationDiagram)otherEnd, msgs);
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				return basicSetDiagram(null, msgs);
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, PDPackage.OMT_PRESENTATION_DIAGRAM__OBJECTS, OMTPresentationDiagram.class, msgs);
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				return getDiagram();
			case PDPackage.OMTPD_NODE__CONSTRAINT:
				return getConstraint();
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				setDiagram((OMTPresentationDiagram)newValue);
				return;
			case PDPackage.OMTPD_NODE__CONSTRAINT:
				setConstraint((Rectangle)newValue);
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				setDiagram((OMTPresentationDiagram)null);
				return;
			case PDPackage.OMTPD_NODE__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
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
			case PDPackage.OMTPD_NODE__DIAGRAM:
				return getDiagram() != null;
			case PDPackage.OMTPD_NODE__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //OMTPDNodeImpl
