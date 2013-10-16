/**
 */
package org.tud.inf.st.mbt.terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tud.inf.st.mbt.terms.ContainerTerm;
import org.tud.inf.st.mbt.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.impl.ContainerTermImpl#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerTermImpl extends EObjectImpl implements ContainerTerm {
	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected EObject containment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.CONTAINER_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainment(EObject newContainment, NotificationChain msgs) {
		EObject oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.CONTAINER_TERM__CONTAINMENT, oldContainment, newContainment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(EObject newContainment) {
		if (newContainment != containment) {
			NotificationChain msgs = null;
			if (containment != null)
				msgs = ((InternalEObject)containment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.CONTAINER_TERM__CONTAINMENT, null, msgs);
			if (newContainment != null)
				msgs = ((InternalEObject)newContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.CONTAINER_TERM__CONTAINMENT, null, msgs);
			msgs = basicSetContainment(newContainment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.CONTAINER_TERM__CONTAINMENT, newContainment, newContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
				return basicSetContainment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
				return getContainment();
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
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
				setContainment((EObject)newValue);
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
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
				setContainment((EObject)null);
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
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
				return containment != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return ""+getContainment();
	}

} //ContainerTermImpl
