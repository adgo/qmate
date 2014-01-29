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
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.ulang.guigraph.impl.PlaceImpl#isProvideAsInterface <em>Provide As Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PlaceImpl extends AbstractModelElementImpl implements Place {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.PLACE__INITIAL_TOKENS, oldInitialTokens, initialTokens));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE, oldProvideAsInterface, provideAsInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuigraphPackage.PLACE__INITIAL_TOKENS:
				return getInitialTokens();
			case GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE:
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
			case GuigraphPackage.PLACE__INITIAL_TOKENS:
				setInitialTokens((Integer)newValue);
				return;
			case GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE:
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
			case GuigraphPackage.PLACE__INITIAL_TOKENS:
				setInitialTokens(INITIAL_TOKENS_EDEFAULT);
				return;
			case GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE:
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
			case GuigraphPackage.PLACE__INITIAL_TOKENS:
				return initialTokens != INITIAL_TOKENS_EDEFAULT;
			case GuigraphPackage.PLACE__PROVIDE_AS_INTERFACE:
				return provideAsInterface != PROVIDE_AS_INTERFACE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return super.toString();
	}

} //PlaceImpl
