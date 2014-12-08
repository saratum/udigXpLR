/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTRelationship;
import it.unibz.udig.omtg.cd.model.OMTRelationshipType;
import it.unibz.udig.omtg.cd.model.SpatialIntegrityRule;

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
 * An implementation of the model object '<em><b>OMT Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTRelationshipImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTRelationshipImpl extends EObjectImpl implements OMTRelationship
{

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OMTClass							target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OMTClass							source;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point>					bendpoints;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OMTRelationshipType	TYPE_EDEFAULT	= OMTRelationshipType.SIMPLE_ASSOCIATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OMTRelationshipType				type			= TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected static final SpatialIntegrityRule	RULE_EDEFAULT	= SpatialIntegrityRule.NONE;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected SpatialIntegrityRule				rule			= RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String				LABEL_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String							label			= LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTRelationshipImpl()
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
		return CDPackage.Literals.OMT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClassDiagram getDiagram( )
	{
		if (eContainerFeatureID() != CDPackage.OMT_RELATIONSHIP__DIAGRAM) return null;
		return (OMTClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTClassDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, CDPackage.OMT_RELATIONSHIP__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTClassDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != CDPackage.OMT_RELATIONSHIP__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, CDPackage.OMT_CLASS_DIAGRAM__RELATIONS, OMTClassDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__DIAGRAM, newDiagram, newDiagram));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDPackage.OMT_RELATIONSHIP__TARGET, oldTarget, target));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, CDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, CDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__TARGET, newTarget, newTarget));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDPackage.OMT_RELATIONSHIP__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, CDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, CDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__SOURCE, newSource, newSource));
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
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, CDPackage.OMT_RELATIONSHIP__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTRelationshipType getType( )
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType( OMTRelationshipType newType )
	{
		OMTRelationshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialIntegrityRule getRule( )
	{
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRule( SpatialIntegrityRule newRule )
	{
		SpatialIntegrityRule oldRule = rule;
		rule = newRule == null ? RULE_EDEFAULT : newRule;
		if ( eNotificationRequired() )
			eNotify( new ENotificationImpl( this, Notification.SET, CDPackage.OMT_RELATIONSHIP__RULE,
					oldRule, rule ) );

		if ( rule != RULE_EDEFAULT ) setType( OMTRelationshipType.SPATIAL );

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel( )
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel( String newLabel )
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_RELATIONSHIP__LABEL, oldLabel, label));
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTClassDiagram)otherEnd, msgs);
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, CDPackage.OMT_CLASS__INCOMING_RELATIONS, OMTClass.class, msgs);
				return basicSetTarget((OMTClass)otherEnd, msgs);
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, CDPackage.OMT_CLASS__OUTGOING_RELATIONS, OMTClass.class, msgs);
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				return basicSetTarget(null, msgs);
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CDPackage.OMT_CLASS_DIAGRAM__RELATIONS, OMTClassDiagram.class, msgs);
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				return getDiagram();
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CDPackage.OMT_RELATIONSHIP__BENDPOINTS:
				return getBendpoints();
			case CDPackage.OMT_RELATIONSHIP__TYPE:
				return getType();
			case CDPackage.OMT_RELATIONSHIP__RULE:
				return getRule();
			case CDPackage.OMT_RELATIONSHIP__LABEL:
				return getLabel();
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				setDiagram((OMTClassDiagram)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				setTarget((OMTClass)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
				setSource((OMTClass)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__TYPE:
				setType((OMTRelationshipType)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__RULE:
				setRule((SpatialIntegrityRule)newValue);
				return;
			case CDPackage.OMT_RELATIONSHIP__LABEL:
				setLabel((String)newValue);
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				setDiagram((OMTClassDiagram)null);
				return;
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				setTarget((OMTClass)null);
				return;
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
				setSource((OMTClass)null);
				return;
			case CDPackage.OMT_RELATIONSHIP__BENDPOINTS:
				getBendpoints().clear();
				return;
			case CDPackage.OMT_RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CDPackage.OMT_RELATIONSHIP__RULE:
				setRule(RULE_EDEFAULT);
				return;
			case CDPackage.OMT_RELATIONSHIP__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case CDPackage.OMT_RELATIONSHIP__DIAGRAM:
				return getDiagram() != null;
			case CDPackage.OMT_RELATIONSHIP__TARGET:
				return target != null;
			case CDPackage.OMT_RELATIONSHIP__SOURCE:
				return source != null;
			case CDPackage.OMT_RELATIONSHIP__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case CDPackage.OMT_RELATIONSHIP__TYPE:
				return type != TYPE_EDEFAULT;
			case CDPackage.OMT_RELATIONSHIP__RULE:
				return rule != RULE_EDEFAULT;
			case CDPackage.OMT_RELATIONSHIP__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(", type: ");
		result.append(type);
		result.append(", rule: ");
		result.append(rule);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //OMTRelationshipImpl
