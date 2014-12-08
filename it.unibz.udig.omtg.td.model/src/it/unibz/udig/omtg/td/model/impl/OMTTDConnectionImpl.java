/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.OMTTDConnection;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;
import it.unibz.udig.omtg.td.model.TDPackage;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMTTD Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTTDConnectionImpl#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTTDConnectionImpl extends EObjectImpl implements OMTTDConnection
{

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point>	bendpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTTDConnectionImpl()
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
		return TDPackage.Literals.OMTTD_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTransformationDiagram getDiagram( )
	{
		if (eContainerFeatureID() != TDPackage.OMTTD_CONNECTION__DIAGRAM) return null;
		return (OMTTransformationDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTTransformationDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, TDPackage.OMTTD_CONNECTION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTTransformationDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != TDPackage.OMTTD_CONNECTION__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS, OMTTransformationDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMTTD_CONNECTION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints( )
	{
		if (bendpoints == null)
		{
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, TDPackage.OMTTD_CONNECTION__BENDPOINTS);
		}
		return bendpoints;
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTTransformationDiagram)otherEnd, msgs);
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS, OMTTransformationDiagram.class, msgs);
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				return getDiagram();
			case TDPackage.OMTTD_CONNECTION__BENDPOINTS:
				return getBendpoints();
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				setDiagram((OMTTransformationDiagram)newValue);
				return;
			case TDPackage.OMTTD_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				setDiagram((OMTTransformationDiagram)null);
				return;
			case TDPackage.OMTTD_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
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
			case TDPackage.OMTTD_CONNECTION__DIAGRAM:
				return getDiagram() != null;
			case TDPackage.OMTTD_CONNECTION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
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
		result.append(" (bendpoints: ");
		result.append(bendpoints);
		result.append(')');
		return result.toString();
	}

} //OMTTDConnectionImpl
