/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.ClassAttribute;
import it.unibz.udig.omtg.td.model.ClassOperation;
import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTOperation;
import it.unibz.udig.omtg.td.model.OMTTROperation;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;
import it.unibz.udig.omtg.td.model.TDFactory;
import it.unibz.udig.omtg.td.model.TDPackage;

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
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getIncomingTrOperation <em>Incoming Tr Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getOutgoingTrOperation <em>Outgoing Tr Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTClassImpl#isTemporary <em>Temporary</em>}</li>
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
	protected static final String		NAME_EDEFAULT		= "< ... >";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String					name				= NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle	CONSTRAINT_EDEFAULT	= (Rectangle)TDFactory.eINSTANCE.createFromString(TDPackage.eINSTANCE.getRectangle(), "0,0,50,50");

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
	 * The cached value of the '{@link #getIncomingRelations() <em>Incoming Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTOperation>		incomingRelations;

	/**
	 * The cached value of the '{@link #getOutgoingRelations() <em>Outgoing Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTOperation>		outgoingRelations;

	/**
	 * The cached value of the '{@link #getIncomingTrOperation() <em>Incoming Tr Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTrOperation()
	 * @generated
	 * @ordered
	 */
	protected OMTTROperation			incomingTrOperation;

	/**
	 * The cached value of the '{@link #getOutgoingTrOperation() <em>Outgoing Tr Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTrOperation()
	 * @generated
	 * @ordered
	 */
	protected OMTTROperation			outgoingTrOperation;

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
	 * The default value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean		TEMPORARY_EDEFAULT	= false;

	/**
	 * The cached value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporary()
	 * @generated
	 * @ordered
	 */
	protected boolean					temporary			= TEMPORARY_EDEFAULT;

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
		return TDPackage.Literals.OMT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTransformationDiagram getDiagram( )
	{
		if (eContainerFeatureID() != TDPackage.OMT_CLASS__DIAGRAM) return null;
		return (OMTTransformationDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram( OMTTransformationDiagram newDiagram, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject)newDiagram, TDPackage.OMT_CLASS__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram( OMTTransformationDiagram newDiagram )
	{
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != TDPackage.OMT_CLASS__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES, OMTTransformationDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__DIAGRAM, newDiagram, newDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTOperation> getIncomingRelations( )
	{
		if (incomingRelations == null)
		{
			incomingRelations = new EObjectWithInverseResolvingEList<OMTOperation>(OMTOperation.class, this, TDPackage.OMT_CLASS__INCOMING_RELATIONS, TDPackage.OMT_OPERATION__TARGET);
		}
		return incomingRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTOperation> getOutgoingRelations( )
	{
		if (outgoingRelations == null)
		{
			outgoingRelations = new EObjectWithInverseResolvingEList<OMTOperation>(OMTOperation.class, this, TDPackage.OMT_CLASS__OUTGOING_RELATIONS, TDPackage.OMT_OPERATION__SOURCE);
		}
		return outgoingRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTROperation getIncomingTrOperation( )
	{
		if (incomingTrOperation != null && incomingTrOperation.eIsProxy())
		{
			InternalEObject oldIncomingTrOperation = (InternalEObject)incomingTrOperation;
			incomingTrOperation = (OMTTROperation)eResolveProxy(oldIncomingTrOperation);
			if (incomingTrOperation != oldIncomingTrOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TDPackage.OMT_CLASS__INCOMING_TR_OPERATION, oldIncomingTrOperation, incomingTrOperation));
			}
		}
		return incomingTrOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTROperation basicGetIncomingTrOperation( )
	{
		return incomingTrOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingTrOperation( OMTTROperation newIncomingTrOperation,
			NotificationChain msgs )
	{
		OMTTROperation oldIncomingTrOperation = incomingTrOperation;
		incomingTrOperation = newIncomingTrOperation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__INCOMING_TR_OPERATION, oldIncomingTrOperation, newIncomingTrOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingTrOperation( OMTTROperation newIncomingTrOperation )
	{
		if (newIncomingTrOperation != incomingTrOperation)
		{
			NotificationChain msgs = null;
			if (incomingTrOperation != null)
				msgs = ((InternalEObject)incomingTrOperation).eInverseRemove(this, TDPackage.OMTTR_OPERATION__TARGET, OMTTROperation.class, msgs);
			if (newIncomingTrOperation != null)
				msgs = ((InternalEObject)newIncomingTrOperation).eInverseAdd(this, TDPackage.OMTTR_OPERATION__TARGET, OMTTROperation.class, msgs);
			msgs = basicSetIncomingTrOperation(newIncomingTrOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__INCOMING_TR_OPERATION, newIncomingTrOperation, newIncomingTrOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTROperation getOutgoingTrOperation( )
	{
		if (outgoingTrOperation != null && outgoingTrOperation.eIsProxy())
		{
			InternalEObject oldOutgoingTrOperation = (InternalEObject)outgoingTrOperation;
			outgoingTrOperation = (OMTTROperation)eResolveProxy(oldOutgoingTrOperation);
			if (outgoingTrOperation != oldOutgoingTrOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION, oldOutgoingTrOperation, outgoingTrOperation));
			}
		}
		return outgoingTrOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTROperation basicGetOutgoingTrOperation( )
	{
		return outgoingTrOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingTrOperation( OMTTROperation newOutgoingTrOperation,
			NotificationChain msgs )
	{
		OMTTROperation oldOutgoingTrOperation = outgoingTrOperation;
		outgoingTrOperation = newOutgoingTrOperation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION, oldOutgoingTrOperation, newOutgoingTrOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingTrOperation( OMTTROperation newOutgoingTrOperation )
	{
		if (newOutgoingTrOperation != outgoingTrOperation)
		{
			NotificationChain msgs = null;
			if (outgoingTrOperation != null)
				msgs = ((InternalEObject)outgoingTrOperation).eInverseRemove(this, TDPackage.OMTTR_OPERATION__SOURCE, OMTTROperation.class, msgs);
			if (newOutgoingTrOperation != null)
				msgs = ((InternalEObject)newOutgoingTrOperation).eInverseAdd(this, TDPackage.OMTTR_OPERATION__SOURCE, OMTTROperation.class, msgs);
			msgs = basicSetOutgoingTrOperation(newOutgoingTrOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION, newOutgoingTrOperation, newOutgoingTrOperation));
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
			attributes = new EObjectContainmentWithInverseEList<ClassAttribute>(ClassAttribute.class, this, TDPackage.OMT_CLASS__ATTRIBUTES, TDPackage.CLASS_ATTRIBUTE__OMTCLASS);
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
			operations = new EObjectContainmentWithInverseEList<ClassOperation>(ClassOperation.class, this, TDPackage.OMT_CLASS__OPERATIONS, TDPackage.CLASS_OPERATION__OMTCLASS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemporary( )
	{
		return temporary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporary( boolean newTemporary )
	{
		boolean oldTemporary = temporary;
		temporary = newTemporary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDPackage.OMT_CLASS__TEMPORARY, oldTemporary, temporary));
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((OMTTransformationDiagram)otherEnd, msgs);
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRelations()).basicAdd(otherEnd, msgs);
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingRelations()).basicAdd(otherEnd, msgs);
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				if (incomingTrOperation != null)
					msgs = ((InternalEObject)incomingTrOperation).eInverseRemove(this, TDPackage.OMTTR_OPERATION__TARGET, OMTTROperation.class, msgs);
				return basicSetIncomingTrOperation((OMTTROperation)otherEnd, msgs);
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				if (outgoingTrOperation != null)
					msgs = ((InternalEObject)outgoingTrOperation).eInverseRemove(this, TDPackage.OMTTR_OPERATION__SOURCE, OMTTROperation.class, msgs);
				return basicSetOutgoingTrOperation((OMTTROperation)otherEnd, msgs);
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case TDPackage.OMT_CLASS__OPERATIONS:
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<?>)getIncomingRelations()).basicRemove(otherEnd, msgs);
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<?>)getOutgoingRelations()).basicRemove(otherEnd, msgs);
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				return basicSetIncomingTrOperation(null, msgs);
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				return basicSetOutgoingTrOperation(null, msgs);
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TDPackage.OMT_CLASS__OPERATIONS:
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES, OMTTransformationDiagram.class, msgs);
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				return getDiagram();
			case TDPackage.OMT_CLASS__NAME:
				return getName();
			case TDPackage.OMT_CLASS__CONSTRAINT:
				return getConstraint();
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return getIncomingRelations();
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return getOutgoingRelations();
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				if (resolve) return getIncomingTrOperation();
				return basicGetIncomingTrOperation();
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				if (resolve) return getOutgoingTrOperation();
				return basicGetOutgoingTrOperation();
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				return getAttributes();
			case TDPackage.OMT_CLASS__OPERATIONS:
				return getOperations();
			case TDPackage.OMT_CLASS__TEMPORARY:
				return isTemporary();
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				setDiagram((OMTTransformationDiagram)newValue);
				return;
			case TDPackage.OMT_CLASS__NAME:
				setName((String)newValue);
				return;
			case TDPackage.OMT_CLASS__CONSTRAINT:
				setConstraint((Rectangle)newValue);
				return;
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
				getIncomingRelations().addAll((Collection<? extends OMTOperation>)newValue);
				return;
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				getOutgoingRelations().addAll((Collection<? extends OMTOperation>)newValue);
				return;
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				setIncomingTrOperation((OMTTROperation)newValue);
				return;
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				setOutgoingTrOperation((OMTTROperation)newValue);
				return;
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ClassAttribute>)newValue);
				return;
			case TDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ClassOperation>)newValue);
				return;
			case TDPackage.OMT_CLASS__TEMPORARY:
				setTemporary((Boolean)newValue);
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				setDiagram((OMTTransformationDiagram)null);
				return;
			case TDPackage.OMT_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TDPackage.OMT_CLASS__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
				return;
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				return;
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				setIncomingTrOperation((OMTTROperation)null);
				return;
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				setOutgoingTrOperation((OMTTROperation)null);
				return;
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TDPackage.OMT_CLASS__OPERATIONS:
				getOperations().clear();
				return;
			case TDPackage.OMT_CLASS__TEMPORARY:
				setTemporary(TEMPORARY_EDEFAULT);
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
			case TDPackage.OMT_CLASS__DIAGRAM:
				return getDiagram() != null;
			case TDPackage.OMT_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TDPackage.OMT_CLASS__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case TDPackage.OMT_CLASS__INCOMING_RELATIONS:
				return incomingRelations != null && !incomingRelations.isEmpty();
			case TDPackage.OMT_CLASS__OUTGOING_RELATIONS:
				return outgoingRelations != null && !outgoingRelations.isEmpty();
			case TDPackage.OMT_CLASS__INCOMING_TR_OPERATION:
				return incomingTrOperation != null;
			case TDPackage.OMT_CLASS__OUTGOING_TR_OPERATION:
				return outgoingTrOperation != null;
			case TDPackage.OMT_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TDPackage.OMT_CLASS__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case TDPackage.OMT_CLASS__TEMPORARY:
				return temporary != TEMPORARY_EDEFAULT;
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
		result.append(", temporary: ");
		result.append(temporary);
		result.append(')');
		return result.toString();
	}

} //OMTClassImpl
