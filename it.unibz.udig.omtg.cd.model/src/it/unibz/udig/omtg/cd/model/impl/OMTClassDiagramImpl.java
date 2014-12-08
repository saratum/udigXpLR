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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMT Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.cd.model.impl.OMTClassDiagramImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTClassDiagramImpl extends EObjectImpl implements OMTClassDiagram
{

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTClass>			classes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OMTRelationship>	relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTClassDiagramImpl()
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
		return CDPackage.Literals.OMT_CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTClass> getClasses( )
	{
		if (classes == null)
		{
			classes = new EObjectContainmentWithInverseEList<OMTClass>(OMTClass.class, this, CDPackage.OMT_CLASS_DIAGRAM__CLASSES, CDPackage.OMT_CLASS__DIAGRAM);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTRelationship> getRelations( )
	{
		if (relations == null)
		{
			relations = new EObjectContainmentWithInverseEList<OMTRelationship>(OMTRelationship.class, this, CDPackage.OMT_CLASS_DIAGRAM__RELATIONS, CDPackage.OMT_RELATIONSHIP__DIAGRAM);
		}
		return relations;
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				return getClasses();
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				return getRelations();
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends OMTClass>)newValue);
				return;
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends OMTRelationship>)newValue);
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				getClasses().clear();
				return;
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				getRelations().clear();
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
			case CDPackage.OMT_CLASS_DIAGRAM__CLASSES:
				return classes != null && !classes.isEmpty();
			case CDPackage.OMT_CLASS_DIAGRAM__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OMTClassDiagramImpl
