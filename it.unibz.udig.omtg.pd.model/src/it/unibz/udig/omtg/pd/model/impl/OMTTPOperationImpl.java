/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.OMTClass;
import it.unibz.udig.omtg.pd.model.OMTPresentationDiagram;
import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDPackage;

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
 * An implementation of the model object '<em><b>OMTTP Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTTPOperationImpl#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTTPOperationImpl extends EObjectImpl implements OMTTPOperation
{

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OMTPresentationSpecification	target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OMTClass						source;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String			EXPRESSION_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String						expression			= EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point>				bendpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTTPOperationImpl()
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
		return PDPackage.Literals.OMTTP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationDiagram getDiagram( )
	{
		if (eContainerFeatureID() != PDPackage.OMTTP_OPERATION__DIAGRAM) return null;
		return (OMTPresentationDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTPresentationDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, PDPackage.OMTTP_OPERATION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTPresentationDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != PDPackage.OMTTP_OPERATION__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS, OMTPresentationDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationSpecification getTarget( )
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OMTPresentationSpecification)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDPackage.OMTTP_OPERATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTPresentationSpecification basicGetTarget( )
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget( OMTPresentationSpecification newTarget, NotificationChain msgs )
	{
		OMTPresentationSpecification oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget( OMTPresentationSpecification newTarget )
	{
		if (newTarget != target)
		{
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, OMTPresentationSpecification.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, OMTPresentationSpecification.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__TARGET, newTarget, newTarget));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDPackage.OMTTP_OPERATION__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, PDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, PDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression( )
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression( String newExpression )
	{
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMTTP_OPERATION__EXPRESSION, oldExpression, expression));
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
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, PDPackage.OMTTP_OPERATION__BENDPOINTS);
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTPresentationDiagram)otherEnd, msgs);
			case PDPackage.OMTTP_OPERATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, OMTPresentationSpecification.class, msgs);
				return basicSetTarget((OMTPresentationSpecification)otherEnd, msgs);
			case PDPackage.OMTTP_OPERATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, PDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case PDPackage.OMTTP_OPERATION__TARGET:
				return basicSetTarget(null, msgs);
			case PDPackage.OMTTP_OPERATION__SOURCE:
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
	public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs )
	{
		switch (eContainerFeatureID())
		{
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, PDPackage.OMT_PRESENTATION_DIAGRAM__OPERATIONS, OMTPresentationDiagram.class, msgs);
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				return getDiagram();
			case PDPackage.OMTTP_OPERATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PDPackage.OMTTP_OPERATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PDPackage.OMTTP_OPERATION__EXPRESSION:
				return getExpression();
			case PDPackage.OMTTP_OPERATION__BENDPOINTS:
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				setDiagram((OMTPresentationDiagram)newValue);
				return;
			case PDPackage.OMTTP_OPERATION__TARGET:
				setTarget((OMTPresentationSpecification)newValue);
				return;
			case PDPackage.OMTTP_OPERATION__SOURCE:
				setSource((OMTClass)newValue);
				return;
			case PDPackage.OMTTP_OPERATION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case PDPackage.OMTTP_OPERATION__BENDPOINTS:
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				setDiagram((OMTPresentationDiagram)null);
				return;
			case PDPackage.OMTTP_OPERATION__TARGET:
				setTarget((OMTPresentationSpecification)null);
				return;
			case PDPackage.OMTTP_OPERATION__SOURCE:
				setSource((OMTClass)null);
				return;
			case PDPackage.OMTTP_OPERATION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case PDPackage.OMTTP_OPERATION__BENDPOINTS:
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
			case PDPackage.OMTTP_OPERATION__DIAGRAM:
				return getDiagram() != null;
			case PDPackage.OMTTP_OPERATION__TARGET:
				return target != null;
			case PDPackage.OMTTP_OPERATION__SOURCE:
				return source != null;
			case PDPackage.OMTTP_OPERATION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case PDPackage.OMTTP_OPERATION__BENDPOINTS:
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", bendpoints: ");
		result.append(bendpoints);
		result.append(')');
		return result.toString();
	}

} //OMTTPOperationImpl
