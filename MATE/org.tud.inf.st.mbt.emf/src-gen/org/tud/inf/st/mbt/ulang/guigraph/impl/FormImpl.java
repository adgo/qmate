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
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.FormImpl#isProvideAsInterface <em>Provide As Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends WidgetImpl implements Form {
	/**
	 * The default value of the '{@link #getInitialTokens() <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_TOKENS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getInitialTokens() <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTokens()
	 * @generated
	 * @ordered
	 */
	protected int initialTokens = INITIAL_TOKENS_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvideAsInterface() <em>Provide As Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvideAsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDE_AS_INTERFACE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isProvideAsInterface() <em>Provide As Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvideAsInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean provideAsInterface = PROVIDE_AS_INTERFACE_EDEFAULT;

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
	public int getInitialTokens() {
		return initialTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTokens(int newInitialTokens) {
		int oldInitialTokens = initialTokens;
		initialTokens = newInitialTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.FORM__INITIAL_TOKENS, oldInitialTokens, initialTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvideAsInterface() {
		return provideAsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvideAsInterface(boolean newProvideAsInterface) {
		boolean oldProvideAsInterface = provideAsInterface;
		provideAsInterface = newProvideAsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.FORM__PROVIDE_AS_INTERFACE, oldProvideAsInterface, provideAsInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigraphPackage.FORM__INITIAL_TOKENS:
				return getInitialTokens();
			case GuigraphPackage.FORM__PROVIDE_AS_INTERFACE:
				return isProvideAsInterface();
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
			case GuigraphPackage.FORM__INITIAL_TOKENS:
				setInitialTokens((Integer)newValue);
				return;
			case GuigraphPackage.FORM__PROVIDE_AS_INTERFACE:
				setProvideAsInterface((Boolean)newValue);
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
			case GuigraphPackage.FORM__INITIAL_TOKENS:
				setInitialTokens(INITIAL_TOKENS_EDEFAULT);
				return;
			case GuigraphPackage.FORM__PROVIDE_AS_INTERFACE:
				setProvideAsInterface(PROVIDE_AS_INTERFACE_EDEFAULT);
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
			case GuigraphPackage.FORM__INITIAL_TOKENS:
				return initialTokens != INITIAL_TOKENS_EDEFAULT;
			case GuigraphPackage.FORM__PROVIDE_AS_INTERFACE:
				return provideAsInterface != PROVIDE_AS_INTERFACE_EDEFAULT;
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
				case GuigraphPackage.FORM__INITIAL_TOKENS: return GuigraphPackage.PLACE__INITIAL_TOKENS;
				case GuigraphPackage.FORM__PROVIDE_AS_INTERFACE: return GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE;
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
				case GuigraphPackage.PLACE__INITIAL_TOKENS: return GuigraphPackage.FORM__INITIAL_TOKENS;
				case GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE: return GuigraphPackage.FORM__PROVIDE_AS_INTERFACE;
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
		result.append(" (initialTokens: ");
		result.append(initialTokens);
		result.append(", provideAsInterface: ");
		result.append(provideAsInterface);
		result.append(')');
		return result.toString();
	}

} //FormImpl
