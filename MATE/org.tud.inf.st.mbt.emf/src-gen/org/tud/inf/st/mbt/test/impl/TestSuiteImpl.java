/**
 */
package org.tud.inf.st.mbt.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.tud.inf.st.mbt.core.AbstractModelElement;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.features.Configuration;
import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestSuite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getRiskReduction <em>Risk Reduction</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestSuiteImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends TestExecutableImpl implements TestSuite {
	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceableTo() <em>Traceable To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceableTo()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractModelElement> traceableTo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskReduction() <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskReduction()
	 * @generated
	 * @ordered
	 */
	protected static final double RISK_REDUCTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRiskReduction() <em>Risk Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskReduction()
	 * @generated
	 * @ordered
	 */
	protected double riskReduction = RISK_REDUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> cases;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModelElement> getTraceableTo() {
		if (traceableTo == null) {
			traceableTo = new EObjectResolvingEList<AbstractModelElement>(AbstractModelElement.class, this, TestPackage.TEST_SUITE__TRACEABLE_TO);
		}
		return traceableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<TestCase>(TestCase.class, this, TestPackage.TEST_SUITE__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TEST_SUITE__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRiskReduction() {
		return riskReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskReduction(double newRiskReduction) {
		double oldRiskReduction = riskReduction;
		riskReduction = newRiskReduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__RISK_REDUCTION, oldRiskReduction, riskReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_SUITE__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case TestPackage.TEST_SUITE__NOTE:
				return getNote();
			case TestPackage.TEST_SUITE__ID:
				return getId();
			case TestPackage.TEST_SUITE__TRACEABLE_TO:
				return getTraceableTo();
			case TestPackage.TEST_SUITE__NAME:
				return getName();
			case TestPackage.TEST_SUITE__RISK_REDUCTION:
				return getRiskReduction();
			case TestPackage.TEST_SUITE__CASES:
				return getCases();
			case TestPackage.TEST_SUITE__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
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
			case TestPackage.TEST_SUITE__NOTE:
				setNote((String)newValue);
				return;
			case TestPackage.TEST_SUITE__ID:
				setId((String)newValue);
				return;
			case TestPackage.TEST_SUITE__TRACEABLE_TO:
				getTraceableTo().clear();
				getTraceableTo().addAll((Collection<? extends AbstractModelElement>)newValue);
				return;
			case TestPackage.TEST_SUITE__NAME:
				setName((String)newValue);
				return;
			case TestPackage.TEST_SUITE__RISK_REDUCTION:
				setRiskReduction((Double)newValue);
				return;
			case TestPackage.TEST_SUITE__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends TestCase>)newValue);
				return;
			case TestPackage.TEST_SUITE__CONFIGURATION:
				setConfiguration((Configuration)newValue);
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
			case TestPackage.TEST_SUITE__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__ID:
				setId(ID_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__TRACEABLE_TO:
				getTraceableTo().clear();
				return;
			case TestPackage.TEST_SUITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__RISK_REDUCTION:
				setRiskReduction(RISK_REDUCTION_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__CASES:
				getCases().clear();
				return;
			case TestPackage.TEST_SUITE__CONFIGURATION:
				setConfiguration((Configuration)null);
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
			case TestPackage.TEST_SUITE__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case TestPackage.TEST_SUITE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TestPackage.TEST_SUITE__TRACEABLE_TO:
				return traceableTo != null && !traceableTo.isEmpty();
			case TestPackage.TEST_SUITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.TEST_SUITE__RISK_REDUCTION:
				return riskReduction != RISK_REDUCTION_EDEFAULT;
			case TestPackage.TEST_SUITE__CASES:
				return cases != null && !cases.isEmpty();
			case TestPackage.TEST_SUITE__CONFIGURATION:
				return configuration != null;
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
		if (baseClass == AbstractModelElement.class) {
			switch (derivedFeatureID) {
				case TestPackage.TEST_SUITE__NOTE: return CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;
				case TestPackage.TEST_SUITE__ID: return CorePackage.ABSTRACT_MODEL_ELEMENT__ID;
				case TestPackage.TEST_SUITE__TRACEABLE_TO: return CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;
				case TestPackage.TEST_SUITE__NAME: return CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TestExecutable.class) {
			switch (derivedFeatureID) {
				case TestPackage.TEST_SUITE__RISK_REDUCTION: return TestPackage.TEST_EXECUTABLE__RISK_REDUCTION;
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
		if (baseClass == AbstractModelElement.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE: return TestPackage.TEST_SUITE__NOTE;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__ID: return TestPackage.TEST_SUITE__ID;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO: return TestPackage.TEST_SUITE__TRACEABLE_TO;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME: return TestPackage.TEST_SUITE__NAME;
				default: return -1;
			}
		}
		if (baseClass == TestExecutable.class) {
			switch (baseFeatureID) {
				case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION: return TestPackage.TEST_SUITE__RISK_REDUCTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		return super.toString();
	}

} //TestSuiteImpl
