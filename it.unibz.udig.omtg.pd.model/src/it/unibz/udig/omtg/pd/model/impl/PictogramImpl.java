/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unibz.udig.omtg.pd.model.impl;

import it.unibz.udig.omtg.pd.model.PDPackage;
import it.unibz.udig.omtg.pd.model.Pictogram;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pictogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.PictogramImpl#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link it.unibz.udig.omtg.pd.model.impl.PictogramImpl#getImageFileLocation <em>Image File Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PictogramImpl extends EObjectImpl implements Pictogram
{

	/**
	 * The default value of the '{@link #getMeaning() <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected static final String	MEANING_EDEFAULT				= null;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected String				meaning							= MEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageFileLocation() <em>Image File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String	IMAGE_FILE_LOCATION_EDEFAULT	= null;

	/**
	 * The cached value of the '{@link #getImageFileLocation() <em>Image File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String				imageFileLocation				= IMAGE_FILE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PictogramImpl()
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
		return PDPackage.Literals.PICTOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaning( )
	{
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning( String newMeaning )
	{
		String oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.PICTOGRAM__MEANING, oldMeaning, meaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageFileLocation( )
	{
		return imageFileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageFileLocation( String newImageFileLocation )
	{
		String oldImageFileLocation = imageFileLocation;
		imageFileLocation = newImageFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PDPackage.PICTOGRAM__IMAGE_FILE_LOCATION, oldImageFileLocation, imageFileLocation));
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
			case PDPackage.PICTOGRAM__MEANING:
				return getMeaning();
			case PDPackage.PICTOGRAM__IMAGE_FILE_LOCATION:
				return getImageFileLocation();
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
			case PDPackage.PICTOGRAM__MEANING:
				setMeaning((String)newValue);
				return;
			case PDPackage.PICTOGRAM__IMAGE_FILE_LOCATION:
				setImageFileLocation((String)newValue);
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
			case PDPackage.PICTOGRAM__MEANING:
				setMeaning(MEANING_EDEFAULT);
				return;
			case PDPackage.PICTOGRAM__IMAGE_FILE_LOCATION:
				setImageFileLocation(IMAGE_FILE_LOCATION_EDEFAULT);
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
			case PDPackage.PICTOGRAM__MEANING:
				return MEANING_EDEFAULT == null ? meaning != null : !MEANING_EDEFAULT.equals(meaning);
			case PDPackage.PICTOGRAM__IMAGE_FILE_LOCATION:
				return IMAGE_FILE_LOCATION_EDEFAULT == null ? imageFileLocation != null : !IMAGE_FILE_LOCATION_EDEFAULT.equals(imageFileLocation);
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
		result.append(" (meaning: ");
		result.append(meaning);
		result.append(", imageFileLocation: ");
		result.append(imageFileLocation);
		result.append(')');
		return result.toString();
	}

} //PictogramImpl
