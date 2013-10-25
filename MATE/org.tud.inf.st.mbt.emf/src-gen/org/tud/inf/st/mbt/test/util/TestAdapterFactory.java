/**
 */
package org.tud.inf.st.mbt.test.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.test.TestPackage
 * @generated
 */
public class TestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSwitch<Adapter> modelSwitch =
		new TestSwitch<Adapter>() {
			@Override
			public Adapter caseTestSuite(TestSuite object) {
				return createTestSuiteAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseTestStep(TestStep object) {
				return createTestStepAdapter();
			}
			@Override
			public Adapter caseTestReport(TestReport object) {
				return createTestReportAdapter();
			}
			@Override
			public Adapter caseTestRun(TestRun object) {
				return createTestRunAdapter();
			}
			@Override
			public Adapter caseTestStepRun(TestStepRun object) {
				return createTestStepRunAdapter();
			}
			@Override
			public Adapter caseVerdict(Verdict object) {
				return createVerdictAdapter();
			}
			@Override
			public Adapter caseTestExecutable(TestExecutable object) {
				return createTestExecutableAdapter();
			}
			@Override
			public Adapter caseITopLevelElement(ITopLevelElement object) {
				return createITopLevelElementAdapter();
			}
			@Override
			public Adapter caseAbstractModelElement(AbstractModelElement object) {
				return createAbstractModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestSuite
	 * @generated
	 */
	public Adapter createTestSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestStep
	 * @generated
	 */
	public Adapter createTestStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestReport
	 * @generated
	 */
	public Adapter createTestReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.Verdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.Verdict
	 * @generated
	 */
	public Adapter createVerdictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestExecutable
	 * @generated
	 */
	public Adapter createTestExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestRun
	 * @generated
	 */
	public Adapter createTestRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.test.TestStepRun <em>Step Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.test.TestStepRun
	 * @generated
	 */
	public Adapter createTestStepRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.AbstractModelElement <em>Abstract Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.AbstractModelElement
	 * @generated
	 */
	public Adapter createAbstractModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tud.inf.st.mbt.core.ITopLevelElement <em>ITop Level Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tud.inf.st.mbt.core.ITopLevelElement
	 * @generated
	 */
	public Adapter createITopLevelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TestAdapterFactory
