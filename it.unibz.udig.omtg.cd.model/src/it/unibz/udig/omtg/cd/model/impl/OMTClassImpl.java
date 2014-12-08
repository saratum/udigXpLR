/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.cd.model.impl;

import it.unibz.udig.omtg.cd.model.CDFactory;
import it.unibz.udig.omtg.cd.model.CDPackage;
import it.unibz.udig.omtg.cd.model.ClassAttribute;
import it.unibz.udig.omtg.cd.model.ClassOperation;
import it.unibz.udig.omtg.cd.model.Multiplicity;
import it.unibz.udig.omtg.cd.model.OMTClass;
import it.unibz.udig.omtg.cd.model.OMTClassDiagram;
import it.unibz.udig.omtg.cd.model.OMTRelationship;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTClassImpl extends EObjectImpl implements OMTClass
{

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String		NAME_EDEFAULT			= "< ... >";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String					name					= NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle	CONSTRAINT_EDEFAULT		= (Rectangle)CDFactory.eINSTANCE.createFromString(CDPackage.eINSTANCE.getRectangle(), "0,0,50,50");

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Rectangle					constraint				= CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingRelations() <em>Incoming Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTRelationship>	incomingRelations;

	/**
	 * The cached value of the '{@link #getOutgoingRelations() <em>Outgoing Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTRelationship>	outgoingRelations;

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
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity	MULTIPLICITY_EDEFAULT	= Multiplicity.NONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity				multiplicity			= MULTIPLICITY_EDEFAULT;

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
		return CDPackage.Literals.OMT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTClassDiagram getDiagram( )
	{
		if (eContainerFeatureID() != CDPackage.OMT_CLASS__DIAGRAM) return null;
		return (OMTClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTClassDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, CDPackage.OMT_CLASS__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTClassDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != CDPackage.OMT_CLASS__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, CDPackage.OMT_CLASS_DIAGRAM__CLASSES, OMTClassDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_CLASS__DIAGRAM, newDiagram, newDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_CLASS__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTRelationship> getIncomingRelations( )
	{
		if (incomingRelations == null)
		{
			incomingRelations = new EObjectWithInverseResolvingEList<OMTRelationship>(OMTRelationship.class, this, CDPackage.OMT_CLASS__INCOMING_RELATIONS, CDPackage.OMT_RELATIONSHIP__TARGET);
		}
		return incomingRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTRelationship> getOutgoingRelations( )
	{
		if (outgoingRelations == null)
		{
			outgoingRelations = new EObjectWithInverseResolvingEList<OMTRelationship>(OMTRelationship.class, this, CDPackage.OMT_CLASS__OUTGOING_RELATIONS, CDPackage.OMT_RELATIONSHIP__SOURCE);
		}
		return outgoingRelations;
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
			attributes = new EObjectContainmentWithInverseEList<ClassAttribute>(ClassAttribute.class, this, CDPackage.OMT_CLASS__ATTRIBUTES, CDPackage.CLASS_ATTRIBUTE__OMTCLASS);
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
			operations = new EObjectContainmentWithInverseEList<ClassOperation>(ClassOperation.class, this, CDPackage.OMT_CLASS__OPERATIONS, CDPackage.CLASS_OPERATION__OMTCLASS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity( )
	{
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity( Multiplicity newMultiplicity )
	{
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDPackage.OMT_CLASS__MULTIPLICITY, oldMultiplicity, multiplicity));
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTClassDiagram)otherEnd, msgs);
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRelations()).basicAdd(otherEnd, msgs);
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingRelations()).basicAdd(otherEnd, msgs);
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case CDPackage.OMT_CLASS__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<?>)getIncomingRelations()).basicRemove(otherEnd, msgs);
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<?>)getOutgoingRelations()).basicRemove(otherEnd, msgs);
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case CDPackage.OMT_CLASS__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, CDPackage.OMT_CLASS_DIAGRAM__CLASSES, OMTClassDiagram.class, msgs);
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				return getDiagram();
			case CDPackage.OMT_CLASS__NAME:
				return getName();
			case CDPackage.OMT_CLASS__CONSTRAINT:
				return getConstraint();
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return getIncomingRelations();
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return getOutgoingRelations();
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				return getAttributes();
			case CDPackage.OMT_CLASS__OPERATIONS:
				return getOperations();
			case CDPackage.OMT_CLASS__MULTIPLICITY:
				return getMultiplicity();
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				setDiagram((OMTClassDiagram)newValue);
				return;
			case CDPackage.OMT_CLASS__NAME:
				setName((String)newValue);
				return;
			case CDPackage.OMT_CLASS__CONSTRAINT:
				setConstraint((Rectangle)newValue);
				return;
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
				getIncomingRelations().addAll((Collection<? extends OMTRelationship>)newValue);
				return;
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				getOutgoingRelations().addAll((Collection<? extends OMTRelationship>)newValue);
				return;
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ClassAttribute>)newValue);
				return;
			case CDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ClassOperation>)newValue);
				return;
			case CDPackage.OMT_CLASS__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				setDiagram((OMTClassDiagram)null);
				return;
			case CDPackage.OMT_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CDPackage.OMT_CLASS__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
				return;
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				return;
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				return;
			case CDPackage.OMT_CLASS__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case CDPackage.OMT_CLASS__DIAGRAM:
				return getDiagram() != null;
			case CDPackage.OMT_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CDPackage.OMT_CLASS__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case CDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return incomingRelations != null && !incomingRelations.isEmpty();
			case CDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return outgoingRelations != null && !outgoingRelations.isEmpty();
			case CDPackage.OMT_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case CDPackage.OMT_CLASS__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case CDPackage.OMT_CLASS__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(", constraint: ");
		result.append(constraint);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //OMTClassImpl
