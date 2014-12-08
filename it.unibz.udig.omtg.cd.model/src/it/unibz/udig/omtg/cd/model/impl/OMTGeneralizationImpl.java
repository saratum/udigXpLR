/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.GeneralizationKind;
import it.unibz.udig.omtg.cd.model.OMTGeneralization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTGeneralizationImpl#isTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTGeneralizationImpl extends OMTRelationshipImpl implements OMTGeneralization
{

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final GeneralizationKind	KIND_EDEFAULT	= GeneralizationKind.DISJOINT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GeneralizationKind				kind			= KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTotal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean				TOTAL_EDEFAULT	= false;

	/**
	 * The cached value of the '{@link #isTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTotal()
	 * @generated
	 * @ordered
	 */
	protected boolean							total			= TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTGeneralizationImpl()
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
		return CDPackage.Literals.OMT_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationKind getKind( )
	{
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind( GeneralizationKind newKind )
	{
		GeneralizationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_GENERALIZATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTotal( )
	{
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal( boolean newTotal )
	{
		boolean oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_GENERALIZATION__TOTAL, oldTotal, total));
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
			case CDPackage.OMT_GENERALIZATION__KIND:
				return getKind();
			case CDPackage.OMT_GENERALIZATION__TOTAL:
				return isTotal();
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
			case CDPackage.OMT_GENERALIZATION__KIND:
				setKind((GeneralizationKind)newValue);
				return;
			case CDPackage.OMT_GENERALIZATION__TOTAL:
				setTotal((Boolean)newValue);
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
			case CDPackage.OMT_GENERALIZATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CDPackage.OMT_GENERALIZATION__TOTAL:
				setTotal(TOTAL_EDEFAULT);
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
			case CDPackage.OMT_GENERALIZATION__KIND:
				return kind != KIND_EDEFAULT;
			case CDPackage.OMT_GENERALIZATION__TOTAL:
				return total != TOTAL_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //OMTGeneralizationImpl
