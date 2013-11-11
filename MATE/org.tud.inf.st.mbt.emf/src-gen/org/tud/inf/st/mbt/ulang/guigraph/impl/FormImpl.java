/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl#isMapToPage <em>Map To Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends WidgetImpl implements Form {
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
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuigraphPackage.Literals.FORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.FORM__MAP_TO_PAGE, oldMapToPage, mapToPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigraphPackage.FORM__MAP_TO_PAGE:
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
			case GuigraphPackage.FORM__MAP_TO_PAGE:
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
			case GuigraphPackage.FORM__MAP_TO_PAGE:
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
			case GuigraphPackage.FORM__MAP_TO_PAGE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GuiGraphNode.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Place.class) {
			switch (derivedFeatureID) {
				case GuigraphPackage.FORM__MAP_TO_PAGE: return GuigraphPackage.PLACE__MAP_TO_PAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GuiGraphNode.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Place.class) {
			switch (baseFeatureID) {
				case GuigraphPackage.PLACE__MAP_TO_PAGE: return GuigraphPackage.FORM__MAP_TO_PAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //FormImpl
