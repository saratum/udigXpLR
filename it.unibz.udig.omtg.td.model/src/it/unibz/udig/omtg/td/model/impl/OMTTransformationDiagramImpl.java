/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.td.model.impl;

import it.unibz.udig.omtg.td.model.OMTClass;
import it.unibz.udig.omtg.td.model.OMTTDConnection;
import it.unibz.udig.omtg.td.model.OMTTransformationDiagram;
import it.unibz.udig.omtg.td.model.TDPackage;

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
 * An implementation of the model object '<em><b>OMT Transformation Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.td.model.impl.OMTTransformationDiagramImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMTTransformationDiagramImpl extends EObjectImpl implements OMTTransformationDiagram
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
	protected EList<OMTTDConnection>	relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMTTransformationDiagramImpl()
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
		return TDPackage.Literals.OMT_TRANSFORMATION_DIAGRAM;
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
			classes = new EObjectContainmentWithInverseEList<OMTClass>(OMTClass.class, this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES, TDPackage.OMT_CLASS__DIAGRAM);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMTTDConnection> getRelations( )
	{
		if (relations == null)
		{
			relations = new EObjectContainmentWithInverseEList<OMTTDConnection>(OMTTDConnection.class, this, TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS, TDPackage.OMTTD_CONNECTION__DIAGRAM);
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				return getClasses();
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends OMTClass>)newValue);
				return;
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends OMTTDConnection>)newValue);
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				getClasses().clear();
				return;
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
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
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__CLASSES:
				return classes != null && !classes.isEmpty();
			case TDPackage.OMT_TRANSFORMATION_DIAGRAM__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OMTTransformationDiagramImpl
