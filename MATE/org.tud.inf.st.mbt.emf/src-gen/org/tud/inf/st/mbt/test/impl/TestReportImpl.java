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
import org.tud.inf.st.mbt.core.impl.AbstractModelElementImpl;

import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestSuite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getRiskReduction <em>Risk Reduction</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link org.tud.inf.st.mbt.test.impl.TestReportImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestReportImpl extends TestExecutableImpl implements TestReport {
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
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected EList<TestRun> runs;

	/**
	 * The cached value of the '{@link #getSuite() <em>Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuite()
	 * @generated
	 * @ordered
	 */
	protected TestSuite suite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_REPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_REPORT__NOTE, oldNote, note));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_REPORT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModelElement> getTraceableTo() {
		if (traceableTo == null) {
			traceableTo = new EObjectResolvingEList<AbstractModelElement>(AbstractModelElement.class, this, TestPackage.TEST_REPORT__TRACEABLE_TO);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_REPORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_REPORT__RISK_REDUCTION, oldRiskReduction, riskReduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestRun> getRuns() {
		if (runs == null) {
			runs = new EObjectContainmentEList<TestRun>(TestRun.class, this, TestPackage.TEST_REPORT__RUNS);
		}
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite getSuite() {
		if (suite != null && suite.eIsProxy()) {
			InternalEObject oldSuite = (InternalEObject)suite;
			suite = (TestSuite)eResolveProxy(oldSuite);
			if (suite != oldSuite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TEST_REPORT__SUITE, oldSuite, suite));
			}
		}
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite basicGetSuite() {
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuite(TestSuite newSuite) {
		TestSuite oldSuite = suite;
		suite = newSuite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_REPORT__SUITE, oldSuite, suite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_REPORT__RUNS:
				return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
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
			case TestPackage.TEST_REPORT__NOTE:
				return getNote();
			case TestPackage.TEST_REPORT__ID:
				return getId();
			case TestPackage.TEST_REPORT__TRACEABLE_TO:
				return getTraceableTo();
			case TestPackage.TEST_REPORT__NAME:
				return getName();
			case TestPackage.TEST_REPORT__RISK_REDUCTION:
				return getRiskReduction();
			case TestPackage.TEST_REPORT__RUNS:
				return getRuns();
			case TestPackage.TEST_REPORT__SUITE:
				if (resolve) return getSuite();
				return basicGetSuite();
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
			case TestPackage.TEST_REPORT__NOTE:
				setNote((String)newValue);
				return;
			case TestPackage.TEST_REPORT__ID:
				setId((String)newValue);
				return;
			case TestPackage.TEST_REPORT__TRACEABLE_TO:
				getTraceableTo().clear();
				getTraceableTo().addAll((Collection<? extends AbstractModelElement>)newValue);
				return;
			case TestPackage.TEST_REPORT__NAME:
				setName((String)newValue);
				return;
			case TestPackage.TEST_REPORT__RISK_REDUCTION:
				setRiskReduction((Double)newValue);
				return;
			case TestPackage.TEST_REPORT__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends TestRun>)newValue);
				return;
			case TestPackage.TEST_REPORT__SUITE:
				setSuite((TestSuite)newValue);
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
			case TestPackage.TEST_REPORT__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case TestPackage.TEST_REPORT__ID:
				setId(ID_EDEFAULT);
				return;
			case TestPackage.TEST_REPORT__TRACEABLE_TO:
				getTraceableTo().clear();
				return;
			case TestPackage.TEST_REPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.TEST_REPORT__RISK_REDUCTION:
				setRiskReduction(RISK_REDUCTION_EDEFAULT);
				return;
			case TestPackage.TEST_REPORT__RUNS:
				getRuns().clear();
				return;
			case TestPackage.TEST_REPORT__SUITE:
				setSuite((TestSuite)null);
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
			case TestPackage.TEST_REPORT__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case TestPackage.TEST_REPORT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TestPackage.TEST_REPORT__TRACEABLE_TO:
				return traceableTo != null && !traceableTo.isEmpty();
			case TestPackage.TEST_REPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.TEST_REPORT__RISK_REDUCTION:
				return riskReduction != RISK_REDUCTION_EDEFAULT;
			case TestPackage.TEST_REPORT__RUNS:
				return runs != null && !runs.isEmpty();
			case TestPackage.TEST_REPORT__SUITE:
				return suite != null;
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
				case TestPackage.TEST_REPORT__NOTE: return CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE;
				case TestPackage.TEST_REPORT__ID: return CorePackage.ABSTRACT_MODEL_ELEMENT__ID;
				case TestPackage.TEST_REPORT__TRACEABLE_TO: return CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO;
				case TestPackage.TEST_REPORT__NAME: return CorePackage.ABSTRACT_MODEL_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TestExecutable.class) {
			switch (derivedFeatureID) {
				case TestPackage.TEST_REPORT__RISK_REDUCTION: return TestPackage.TEST_EXECUTABLE__RISK_REDUCTION;
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
				case CorePackage.ABSTRACT_MODEL_ELEMENT__NOTE: return TestPackage.TEST_REPORT__NOTE;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__ID: return TestPackage.TEST_REPORT__ID;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__TRACEABLE_TO: return TestPackage.TEST_REPORT__TRACEABLE_TO;
				case CorePackage.ABSTRACT_MODEL_ELEMENT__NAME: return TestPackage.TEST_REPORT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TestExecutable.class) {
			switch (baseFeatureID) {
				case TestPackage.TEST_EXECUTABLE__RISK_REDUCTION: return TestPackage.TEST_REPORT__RISK_REDUCTION;
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

} //TestReportImpl
