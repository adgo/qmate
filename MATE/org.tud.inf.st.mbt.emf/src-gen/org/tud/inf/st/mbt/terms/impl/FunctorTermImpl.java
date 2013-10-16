/**
 */
package org.tud.inf.st.mbt.terms.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.tud.inf.st.mbt.terms.FunctorTerm;
import org.tud.inf.st.mbt.terms.Term;
import org.tud.inf.st.mbt.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functor Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.terms.impl.FunctorTermImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.terms.impl.FunctorTermImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctorTermImpl extends EObjectImpl implements FunctorTerm {
	/**
	 * The default value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
	protected String functor = FUNCTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctorTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.FUNCTOR_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctor() {
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctor(String newFunctor) {
		String oldFunctor = functor;
		functor = newFunctor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.FUNCTOR_TERM__FUNCTOR, oldFunctor, functor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Term>(Term.class, this, TermsPackage.FUNCTOR_TERM__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.FUNCTOR_TERM__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case TermsPackage.FUNCTOR_TERM__FUNCTOR:
				return getFunctor();
			case TermsPackage.FUNCTOR_TERM__ARGUMENTS:
				return getArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermsPackage.FUNCTOR_TERM__FUNCTOR:
				setFunctor((String)newValue);
				return;
			case TermsPackage.FUNCTOR_TERM__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Term>)newValue);
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
			case TermsPackage.FUNCTOR_TERM__FUNCTOR:
				setFunctor(FUNCTOR_EDEFAULT);
				return;
			case TermsPackage.FUNCTOR_TERM__ARGUMENTS:
				getArguments().clear();
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
			case TermsPackage.FUNCTOR_TERM__FUNCTOR:
				return FUNCTOR_EDEFAULT == null ? functor != null : !FUNCTOR_EDEFAULT.equals(functor);
			case TermsPackage.FUNCTOR_TERM__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		String out = functor;
		if(!getArguments().isEmpty()){
			out+="(";
			Iterator<Term> i = getArguments().iterator();
			while(i.hasNext()){
				out+=i.next()+"";
				if(i.hasNext())out+=", ";
			}
			out+=")";
		}
		return out;
	}

} //FunctorTermImpl
