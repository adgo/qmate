/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;
import org.tud.inf.st.mbt.ulang.guigraph.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl#isMapToPage <em>Map To Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PlaceImpl extends AbstractModelElementImpl implements Place {
	/**
	 * The default value of the '{@link #isMapToPage() <em>Map To Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMapToPage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAP_TO_PAGE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMapToPage() <em>Map To Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMapToPage()
	 * @generated
	 * @ordered
	 */
	protected boolean mapToPage = MAP_TO_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigraphPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMapToPage() {
		return mapToPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapToPage(boolean newMapToPage) {
		boolean oldMapToPage = mapToPage;
		mapToPage = newMapToPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.PLACE__MAP_TO_PAGE, oldMapToPage, mapToPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigraphPackage.PLACE__MAP_TO_PAGE:
				return isMapToPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuigraphPackage.PLACE__MAP_TO_PAGE:
				setMapToPage((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuigraphPackage.PLACE__MAP_TO_PAGE:
				setMapToPage(MAP_TO_PAGE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuigraphPackage.PLACE__MAP_TO_PAGE:
				return mapToPage != MAP_TO_PAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mapToPage: ");
		result.append(mapToPage);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
