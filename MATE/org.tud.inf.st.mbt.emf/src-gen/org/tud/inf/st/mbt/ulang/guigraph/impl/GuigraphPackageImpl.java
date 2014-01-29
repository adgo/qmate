/**
 */
package org.tud.inf.st.mbt.ulang.guigraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.tud.inf.st.mbt.test.TestPackage;

import org.tud.inf.st.mbt.test.impl.TestPackageImpl;

import org.tud.inf.st.mbt.ulang.guigraph.Arc;
import org.tud.inf.st.mbt.ulang.guigraph.ConditionActionTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Form;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraph;
import org.tud.inf.st.mbt.ulang.guigraph.GuiGraphNode;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;
import org.tud.inf.st.mbt.ulang.guigraph.InhibitorArc;
import org.tud.inf.st.mbt.ulang.guigraph.NoWidgetNode;
import org.tud.inf.st.mbt.ulang.guigraph.PageMappingArc;
import org.tud.inf.st.mbt.ulang.guigraph.PageTransition;
import org.tud.inf.st.mbt.ulang.guigraph.Place;
import org.tud.inf.st.mbt.ulang.guigraph.StandardArc;
import org.tud.inf.st.mbt.ulang.guigraph.TimerTransition;
import org.tud.inf.st.mbt.ulang.guigraph.TimingType;
import org.tud.inf.st.mbt.ulang.guigraph.Transition;
import org.tud.inf.st.mbt.ulang.guigraph.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuigraphPackageImpl extends EPackageImpl implements GuigraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiGraphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noWidgetNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionActionTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inhibitorArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageMappingArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingTypeEEnum = null;

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
	 * @see org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuigraphPackageImpl() {
		super(eNS_URI, GuigraphFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GuigraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuigraphPackage init() {
		if (isInited) return (GuigraphPackage)EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI);

		// Obtain or create and register package
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuigraphPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) instanceof FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) : FeaturesPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		OcmPackageImpl theOcmPackage = (OcmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) instanceof OcmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) : OcmPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theGuigraphPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTestPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theFeaturesPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theOcmPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theGuigraphPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theFeaturesPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theOcmPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuigraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuigraphPackage.eNS_URI, theGuigraphPackage);
		return theGuigraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiGraph() {
		return guiGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiGraph_Arcs() {
		return (EReference)guiGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiGraph_Nodes() {
		return (EReference)guiGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiGraph_Invariant() {
		return (EReference)guiGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiGraph_InvariantText() {
		return (EAttribute)guiGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Children() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Image() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Risk() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Terminates() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_TimeMin() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_TimeMax() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_TimingType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiGraphNode() {
		return guiGraphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoWidgetNode() {
		return noWidgetNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_InitialTokens() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_ProvideAsInterface() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionActionTransition() {
		return conditionActionTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionActionTransition_ApplicationCondition() {
		return (EReference)conditionActionTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionActionTransition_Actions() {
		return (EReference)conditionActionTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionActionTransition_ApplicationConditionText() {
		return (EAttribute)conditionActionTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionActionTransition_ActionsText() {
		return (EAttribute)conditionActionTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerTransition() {
		return timerTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimerTransition_Duration() {
		return (EAttribute)timerTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerTransition_Consumer() {
		return (EReference)timerTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Source() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Target() {
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardArc() {
		return standardArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardArc_Weight() {
		return (EAttribute)standardArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInhibitorArc() {
		return inhibitorArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageTransition() {
		return pageTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageTransition_Page() {
		return (EReference)pageTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageMappingArc() {
		return pageMappingArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageMappingArc_Mapping() {
		return (EReference)pageMappingArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingType() {
		return timingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuigraphFactory getGuigraphFactory() {
		return (GuigraphFactory)getEFactoryInstance();
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
		guiGraphEClass = createEClass(GUI_GRAPH);
		createEReference(guiGraphEClass, GUI_GRAPH__ARCS);
		createEReference(guiGraphEClass, GUI_GRAPH__NODES);
		createEReference(guiGraphEClass, GUI_GRAPH__INVARIANT);
		createEAttribute(guiGraphEClass, GUI_GRAPH__INVARIANT_TEXT);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__CHILDREN);
		createEAttribute(widgetEClass, WIDGET__IMAGE);

		formEClass = createEClass(FORM);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__RISK);
		createEAttribute(transitionEClass, TRANSITION__TERMINATES);
		createEAttribute(transitionEClass, TRANSITION__TIME_MIN);
		createEAttribute(transitionEClass, TRANSITION__TIME_MAX);
		createEAttribute(transitionEClass, TRANSITION__TIMING_TYPE);

		guiGraphNodeEClass = createEClass(GUI_GRAPH_NODE);

		noWidgetNodeEClass = createEClass(NO_WIDGET_NODE);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__INITIAL_TOKENS);
		createEAttribute(placeEClass, PLACE__PROVIDE_AS_INTERFACE);

		conditionActionTransitionEClass = createEClass(CONDITION_ACTION_TRANSITION);
		createEReference(conditionActionTransitionEClass, CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION);
		createEReference(conditionActionTransitionEClass, CONDITION_ACTION_TRANSITION__ACTIONS);
		createEAttribute(conditionActionTransitionEClass, CONDITION_ACTION_TRANSITION__APPLICATION_CONDITION_TEXT);
		createEAttribute(conditionActionTransitionEClass, CONDITION_ACTION_TRANSITION__ACTIONS_TEXT);

		timerTransitionEClass = createEClass(TIMER_TRANSITION);
		createEAttribute(timerTransitionEClass, TIMER_TRANSITION__DURATION);
		createEReference(timerTransitionEClass, TIMER_TRANSITION__CONSUMER);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__SOURCE);
		createEReference(arcEClass, ARC__TARGET);

		standardArcEClass = createEClass(STANDARD_ARC);
		createEAttribute(standardArcEClass, STANDARD_ARC__WEIGHT);

		inhibitorArcEClass = createEClass(INHIBITOR_ARC);

		pageTransitionEClass = createEClass(PAGE_TRANSITION);
		createEReference(pageTransitionEClass, PAGE_TRANSITION__PAGE);

		pageMappingArcEClass = createEClass(PAGE_MAPPING_ARC);
		createEReference(pageMappingArcEClass, PAGE_MAPPING_ARC__MAPPING);

		// Create enums
		timingTypeEEnum = createEEnum(TIMING_TYPE);
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
		RulesPackage theRulesPackage = (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guiGraphEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		widgetEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		formEClass.getESuperTypes().add(this.getWidget());
		formEClass.getESuperTypes().add(this.getPlace());
		transitionEClass.getESuperTypes().add(this.getGuiGraphNode());
		transitionEClass.getESuperTypes().add(theRulesPackage.getIRealTimeConsumer());
		guiGraphNodeEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		noWidgetNodeEClass.getESuperTypes().add(this.getPlace());
		placeEClass.getESuperTypes().add(this.getGuiGraphNode());
		conditionActionTransitionEClass.getESuperTypes().add(this.getTransition());
		timerTransitionEClass.getESuperTypes().add(this.getTransition());
		arcEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		standardArcEClass.getESuperTypes().add(this.getArc());
		inhibitorArcEClass.getESuperTypes().add(this.getArc());
		pageTransitionEClass.getESuperTypes().add(this.getGuiGraphNode());
		pageMappingArcEClass.getESuperTypes().add(this.getArc());

		// Initialize classes and features; add operations and parameters
		initEClass(guiGraphEClass, GuiGraph.class, "GuiGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiGraph_Arcs(), this.getArc(), null, "arcs", null, 0, -1, GuiGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiGraph_Nodes(), this.getGuiGraphNode(), null, "nodes", null, 0, -1, GuiGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiGraph_Invariant(), theRulesPackage.getPredicate(), null, "invariant", null, 0, 1, GuiGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiGraph_InvariantText(), ecorePackage.getEString(), "invariantText", "true", 0, 1, GuiGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_Children(), this.getWidget(), null, "children", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Image(), ecorePackage.getEString(), "image", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Risk(), ecorePackage.getEDouble(), "risk", "1", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Terminates(), ecorePackage.getEBoolean(), "terminates", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TimeMin(), ecorePackage.getELong(), "timeMin", "0", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TimeMax(), ecorePackage.getELong(), "timeMax", "-1", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_TimingType(), this.getTimingType(), "timingType", "DelayUntilStart", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiGraphNodeEClass, GuiGraphNode.class, "GuiGraphNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noWidgetNodeEClass, NoWidgetNode.class, "NoWidgetNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_InitialTokens(), ecorePackage.getEInt(), "initialTokens", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_ProvideAsInterface(), ecorePackage.getEBoolean(), "provideAsInterface", "false", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionActionTransitionEClass, ConditionActionTransition.class, "ConditionActionTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionActionTransition_ApplicationCondition(), theRulesPackage.getPredicate(), null, "applicationCondition", null, 1, 1, ConditionActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionActionTransition_Actions(), theActionsPackage.getPreGenerationSequence(), null, "actions", null, 0, 1, ConditionActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionActionTransition_ApplicationConditionText(), ecorePackage.getEString(), "applicationConditionText", null, 1, 1, ConditionActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionActionTransition_ActionsText(), ecorePackage.getEString(), "actionsText", null, 1, 1, ConditionActionTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerTransitionEClass, TimerTransition.class, "TimerTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimerTransition_Duration(), ecorePackage.getEInt(), "duration", "1", 1, 1, TimerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimerTransition_Consumer(), theRulesPackage.getITimeConsumer(), null, "consumer", null, 1, 1, TimerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Source(), this.getGuiGraphNode(), null, "source", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Target(), this.getGuiGraphNode(), null, "target", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardArcEClass, StandardArc.class, "StandardArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardArc_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, StandardArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inhibitorArcEClass, InhibitorArc.class, "InhibitorArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageTransitionEClass, PageTransition.class, "PageTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageTransition_Page(), this.getGuiGraph(), null, "page", null, 1, 1, PageTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageMappingArcEClass, PageMappingArc.class, "PageMappingArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageMappingArc_Mapping(), this.getPlace(), null, "mapping", null, 0, 1, PageMappingArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timingTypeEEnum, TimingType.class, "TimingType");
		addEEnumLiteral(timingTypeEEnum, TimingType.DELAY_UNTIL_START);
		addEEnumLiteral(timingTypeEEnum, TimingType.INTERVAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.compartment
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.compartment";		
		addAnnotation
		  (getWidget_Children(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

} //GuigraphPackageImpl
