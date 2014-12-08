/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.OMTPresentationSpecification;
import it.unibz.udig.omtg.pd.model.OMTSpecification;
import it.unibz.udig.omtg.pd.model.OMTTPOperation;
import it.unibz.udig.omtg.pd.model.PDPackage;
import it.unibz.udig.omtg.pd.model.Pictogram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Presentation Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getPictogramList <em>Pictogram List</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getIncomingOperation <em>Incoming Operation</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.OMTPresentationSpecificationImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTPresentationSpecificationImpl extends OMTPDNodeImpl implements OMTPresentationSpecification
{

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String		CLASS_NAME_EDEFAULT			= "< ... >";

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String					className					= CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String		PRESENTATION_NAME_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected String					presentationName			= PRESENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String		APPLICATION_NAME_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String					applicationName				= APPLICATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPictogramList() <em>Pictogram List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictogramList()
	 * @generated
	 * @ordered
	 */
	protected EList<Pictogram>		pictogramList;

	/**
	 * The cached value of the '{@link #getIncomingOperation() <em>Incoming Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingOperation()
	 * @generated
	 * @ordered
	 */
	protected OMTTPOperation			incomingOperation;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTSpecification>	specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTPresentationSpecificationImpl()
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
		return PDPackage.Literals.OMT_PRESENTATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName( )
	{
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName( String newClassName )
	{
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_PRESENTATION_SPECIFICATION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationName( )
	{
		return presentationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationName( String newPresentationName )
	{
		String oldPresentationName = presentationName;
		presentationName = newPresentationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME, oldPresentationName, presentationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName( )
	{
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName( String newApplicationName )
	{
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pictogram> getPictogramList( )
	{
		if (pictogramList == null)
		{
			pictogramList = new EObjectContainmentEList<Pictogram>(Pictogram.class, this, PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST);
		}
		return pictogramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTPOperation getIncomingOperation( )
	{
		if (incomingOperation != null && incomingOperation.eIsProxy())
		{
			InternalEObject oldIncomingOperation = (InternalEObject)incomingOperation;
			incomingOperation = (OMTTPOperation)eResolveProxy(oldIncomingOperation);
			if (incomingOperation != oldIncomingOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, oldIncomingOperation, incomingOperation));
			}
		}
		return incomingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTTPOperation basicGetIncomingOperation( )
	{
		return incomingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingOperation( OMTTPOperation newIncomingOperation,
			NotificationChain msgs )
	{
		OMTTPOperation oldIncomingOperation = incomingOperation;
		incomingOperation = newIncomingOperation;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, oldIncomingOperation, newIncomingOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingOperation( OMTTPOperation newIncomingOperation )
	{
		if (newIncomingOperation != incomingOperation)
		{
			NotificationChain msgs = null;
			if (incomingOperation != null)
				msgs = ((InternalEObject)incomingOperation).eInverseRemove(this, PDPackage.OMTTP_OPERATION__TARGET, OMTTPOperation.class, msgs);
			if (newIncomingOperation != null)
				msgs = ((InternalEObject)newIncomingOperation).eInverseAdd(this, PDPackage.OMTTP_OPERATION__TARGET, OMTTPOperation.class, msgs);
			msgs = basicSetIncomingOperation(newIncomingOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION, newIncomingOperation, newIncomingOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTSpecification> getSpecification( )
	{
		if (specification == null)
		{
			specification = new EObjectContainmentWithInverseEList<OMTSpecification>(OMTSpecification.class, this, PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION, PDPackage.OMT_SPECIFICATION__PRESENTATION_SPECIFICATION);
		}
		return specification;
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				if (incomingOperation != null)
					msgs = ((InternalEObject)incomingOperation).eInverseRemove(this, PDPackage.OMTTP_OPERATION__TARGET, OMTTPOperation.class, msgs);
				return basicSetIncomingOperation((OMTTPOperation)otherEnd, msgs);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecification()).basicAdd(otherEnd, msgs);
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST:
				return ((InternalEList<?>)getPictogramList()).basicRemove(otherEnd, msgs);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				return basicSetIncomingOperation(null, msgs);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				return ((InternalEList<?>)getSpecification()).basicRemove(otherEnd, msgs);
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__CLASS_NAME:
				return getClassName();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME:
				return getPresentationName();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME:
				return getApplicationName();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST:
				return getPictogramList();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				if (resolve) return getIncomingOperation();
				return basicGetIncomingOperation();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				return getSpecification();
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME:
				setApplicationName((String)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST:
				getPictogramList().clear();
				getPictogramList().addAll((Collection<? extends Pictogram>)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				setIncomingOperation((OMTTPOperation)newValue);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection<? extends OMTSpecification>)newValue);
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST:
				getPictogramList().clear();
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				setIncomingOperation((OMTTPOperation)null);
				return;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				getSpecification().clear();
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
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__PICTOGRAM_LIST:
				return pictogramList != null && !pictogramList.isEmpty();
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__INCOMING_OPERATION:
				return incomingOperation != null;
			case PDPackage.OMT_PRESENTATION_SPECIFICATION__SPECIFICATION:
				return specification != null && !specification.isEmpty();
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
		result.append(" (className: ");
		result.append(className);
		result.append(", presentationName: ");
		result.append(presentationName);
		result.append(", applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //OMTPresentationSpecificationImpl
