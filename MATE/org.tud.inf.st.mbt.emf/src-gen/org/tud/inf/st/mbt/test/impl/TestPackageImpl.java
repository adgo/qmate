/**
 */
package org.tud.inf.st.mbt.test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.inf.st.mbt.actions.ActionsPackage;

import org.tud.inf.st.mbt.actions.impl.ActionsPackageImpl;

import org.tud.inf.st.mbt.core.CorePackage;

import org.tud.inf.st.mbt.core.impl.CorePackageImpl;

import org.tud.inf.st.mbt.data.DataPackage;

import org.tud.inf.st.mbt.data.impl.DataPackageImpl;

import org.tud.inf.st.mbt.features.FeaturesPackage;

import org.tud.inf.st.mbt.features.impl.FeaturesPackageImpl;

import org.tud.inf.st.mbt.featuretree.FeaturetreePackage;

import org.tud.inf.st.mbt.featuretree.impl.FeaturetreePackageImpl;

import org.tud.inf.st.mbt.functions.FunctionsPackage;

import org.tud.inf.st.mbt.functions.impl.FunctionsPackageImpl;

import org.tud.inf.st.mbt.ocm.OcmPackage;

import org.tud.inf.st.mbt.ocm.impl.OcmPackageImpl;

import org.tud.inf.st.mbt.rules.RulesPackage;

import org.tud.inf.st.mbt.rules.impl.RulesPackageImpl;

import org.tud.inf.st.mbt.scenario.ScenarioPackage;

import org.tud.inf.st.mbt.scenario.impl.ScenarioPackageImpl;

import org.tud.inf.st.mbt.terms.TermsPackage;

import org.tud.inf.st.mbt.terms.impl.TermsPackageImpl;

import org.tud.inf.st.mbt.test.TestCase;
import org.tud.inf.st.mbt.test.TestExecutable;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestReport;
import org.tud.inf.st.mbt.test.TestRun;
import org.tud.inf.st.mbt.test.TestStep;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.TestSuite;
import org.tud.inf.st.mbt.test.Verdict;

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

import org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testStepRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verdictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testExecutableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tud.inf.st.mbt.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) : GuigraphPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) instanceof FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) : FeaturesPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		OcmPackageImpl theOcmPackage = (OcmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) instanceof OcmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) : OcmPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theGuigraphPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theFeaturesPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theOcmPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theGuigraphPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theFeaturesPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theOcmPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_Cases() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_Configuration() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Steps() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestStep() {
		return testStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestStep_Action() {
		return (EReference)testStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReport() {
		return testReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Runs() {
		return (EReference)testReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Suite() {
		return (EReference)testReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRun() {
		return testRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRun_StepRuns() {
		return (EReference)testRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRun__case() {
		return (EReference)testRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestStepRun() {
		return testStepRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestStepRun_Step() {
		return (EReference)testStepRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestStepRun_State() {
		return (EReference)testStepRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestStepRun_Verdict() {
		return (EReference)testStepRunEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestStepRun_Action() {
		return (EReference)testStepRunEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerdict() {
		return verdictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerdict_Name() {
		return (EAttribute)verdictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestExecutable() {
		return testExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestExecutable_RiskReduction() {
		return (EAttribute)testExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testSuiteEClass = createEClass(TEST_SUITE);
		createEReference(testSuiteEClass, TEST_SUITE__CASES);
		createEReference(testSuiteEClass, TEST_SUITE__CONFIGURATION);

		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__STEPS);

		testStepEClass = createEClass(TEST_STEP);
		createEReference(testStepEClass, TEST_STEP__ACTION);

		testReportEClass = createEClass(TEST_REPORT);
		createEReference(testReportEClass, TEST_REPORT__RUNS);
		createEReference(testReportEClass, TEST_REPORT__SUITE);

		testRunEClass = createEClass(TEST_RUN);
		createEReference(testRunEClass, TEST_RUN__STEP_RUNS);
		createEReference(testRunEClass, TEST_RUN__CASE);

		testStepRunEClass = createEClass(TEST_STEP_RUN);
		createEReference(testStepRunEClass, TEST_STEP_RUN__STEP);
		createEReference(testStepRunEClass, TEST_STEP_RUN__STATE);
		createEReference(testStepRunEClass, TEST_STEP_RUN__VERDICT);
		createEReference(testStepRunEClass, TEST_STEP_RUN__ACTION);

		verdictEClass = createEClass(VERDICT);
		createEAttribute(verdictEClass, VERDICT__NAME);

		testExecutableEClass = createEClass(TEST_EXECUTABLE);
		createEAttribute(testExecutableEClass, TEST_EXECUTABLE__RISK_REDUCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		FeaturesPackage theFeaturesPackage = (FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testSuiteEClass.getESuperTypes().add(theCorePackage.getITopLevelElement());
		testSuiteEClass.getESuperTypes().add(this.getTestExecutable());
		testCaseEClass.getESuperTypes().add(this.getTestExecutable());
		testStepEClass.getESuperTypes().add(this.getTestExecutable());
		testReportEClass.getESuperTypes().add(theCorePackage.getITopLevelElement());
		testReportEClass.getESuperTypes().add(this.getTestExecutable());
		testRunEClass.getESuperTypes().add(this.getTestExecutable());
		testStepRunEClass.getESuperTypes().add(this.getTestExecutable());
		testExecutableEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuite_Cases(), this.getTestCase(), null, "cases", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSuite_Configuration(), theFeaturesPackage.getConfiguration(), null, "configuration", null, 1, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCase_Steps(), this.getTestStep(), null, "steps", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testStepEClass, TestStep.class, "TestStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestStep_Action(), theActionsPackage.getPostGenerationAction(), null, "action", null, 1, 1, TestStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testReportEClass, TestReport.class, "TestReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestReport_Runs(), this.getTestRun(), null, "runs", null, 0, -1, TestReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestReport_Suite(), this.getTestSuite(), null, "suite", null, 0, 1, TestReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunEClass, TestRun.class, "TestRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRun_StepRuns(), this.getTestStepRun(), null, "stepRuns", null, 0, -1, TestRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestRun__case(), this.getTestCase(), null, "_case", null, 0, 1, TestRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testStepRunEClass, TestStepRun.class, "TestStepRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestStepRun_Step(), this.getTestStep(), null, "step", null, 1, 1, TestStepRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestStepRun_State(), theRulesPackage.getAtom(), null, "state", null, 0, -1, TestStepRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestStepRun_Verdict(), this.getVerdict(), null, "verdict", null, 0, 1, TestStepRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestStepRun_Action(), theActionsPackage.getPostGenerationAction(), null, "action", null, 0, 1, TestStepRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verdictEClass, Verdict.class, "Verdict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerdict_Name(), ecorePackage.getEString(), "name", null, 1, 1, Verdict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testExecutableEClass, TestExecutable.class, "TestExecutable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestExecutable_RiskReduction(), ecorePackage.getEDouble(), "riskReduction", null, 1, 1, TestExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TestPackageImpl
