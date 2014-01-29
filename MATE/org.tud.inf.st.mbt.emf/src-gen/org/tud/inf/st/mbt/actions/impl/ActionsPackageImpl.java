/**
 */
package org.tud.inf.st.mbt.actions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tud.inf.st.mbt.actions.Action;
import org.tud.inf.st.mbt.actions.ActionReference;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.ActivateFeatureAction;
import org.tud.inf.st.mbt.actions.DeactivateFeatureAction;
import org.tud.inf.st.mbt.actions.DependentAction;
import org.tud.inf.st.mbt.actions.FailAction;
import org.tud.inf.st.mbt.actions.GetDataAction;
import org.tud.inf.st.mbt.actions.GetFeatureStateAction;
import org.tud.inf.st.mbt.actions.GetPropertyAction;
import org.tud.inf.st.mbt.actions.GetRealTimeAction;
import org.tud.inf.st.mbt.actions.PostGenerationAction;
import org.tud.inf.st.mbt.actions.PostGenerationSequence;
import org.tud.inf.st.mbt.actions.PreGenerationAction;
import org.tud.inf.st.mbt.actions.PreGenerationSequence;
import org.tud.inf.st.mbt.actions.ReconfigurationAction;
import org.tud.inf.st.mbt.actions.RemoveBagAction;
import org.tud.inf.st.mbt.actions.SetDataAction;
import org.tud.inf.st.mbt.actions.SetPropertyAction;
import org.tud.inf.st.mbt.actions.StandAloneAction;
import org.tud.inf.st.mbt.actions.TermAction;
import org.tud.inf.st.mbt.actions.ThrowAction;
import org.tud.inf.st.mbt.actions.TimeAction;
import org.tud.inf.st.mbt.actions.TimedConditionAction;

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

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphPackage;

import org.tud.inf.st.mbt.ulang.guigraph.impl.GuigraphPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionsPackageImpl extends EPackageImpl implements ActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standAloneActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedConditionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preGenerationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postGenerationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preGenerationSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postGenerationSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setDataActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeBagActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activateFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deactivateFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDataActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPropertyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPropertyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getRealTimeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getFeatureStateActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentActionEClass = null;

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
	 * @see org.tud.inf.st.mbt.actions.ActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionsPackageImpl() {
		super(eNS_URI, ActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionsPackage init() {
		if (isInited) return (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Obtain or create and register package
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) : GuigraphPackage.eINSTANCE);
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
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theGuigraphPackage.createPackageContents();
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
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theGuigraphPackage.initializePackageContents();
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
		theActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionsPackage.eNS_URI, theActionsPackage);
		return theActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandAloneAction() {
		return standAloneActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandAloneAction_Action() {
		return (EReference)standAloneActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandAloneAction_Parameters() {
		return (EReference)standAloneActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedConditionAction() {
		return timedConditionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedConditionAction_Action() {
		return (EReference)timedConditionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedConditionAction_Frequency() {
		return (EAttribute)timedConditionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedConditionAction_Condition() {
		return (EReference)timedConditionActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreGenerationAction() {
		return preGenerationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostGenerationAction() {
		return postGenerationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreGenerationSequence() {
		return preGenerationSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreGenerationSequence_Actions() {
		return (EReference)preGenerationSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostGenerationSequence() {
		return postGenerationSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostGenerationSequence_Actions() {
		return (EReference)postGenerationSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowAction() {
		return throwActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrowAction_EventID() {
		return (EAttribute)throwActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermAction() {
		return termActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermAction_Term() {
		return (EReference)termActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationAction() {
		return reconfigurationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetDataAction() {
		return setDataActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetDataAction_Values() {
		return (EReference)setDataActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetDataAction_Node() {
		return (EReference)setDataActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveBagAction() {
		return removeBagActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveBagAction_Bag() {
		return (EReference)removeBagActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveBagAction_Index() {
		return (EReference)removeBagActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivateFeatureAction() {
		return activateFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateFeatureAction_Feature() {
		return (EReference)activateFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivateFeatureAction_Version() {
		return (EReference)activateFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeactivateFeatureAction() {
		return deactivateFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeactivateFeatureAction_Feature() {
		return (EReference)deactivateFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDataAction() {
		return getDataActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetDataAction_Node() {
		return (EReference)getDataActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetPropertyAction() {
		return setPropertyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPropertyAction_Property() {
		return (EReference)setPropertyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetPropertyAction_Value() {
		return (EReference)setPropertyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPropertyAction() {
		return getPropertyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetPropertyAction_Property() {
		return (EReference)getPropertyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetRealTimeAction() {
		return getRealTimeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRealTimeAction_TimeHint() {
		return (EAttribute)getRealTimeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetFeatureStateAction() {
		return getFeatureStateActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetFeatureStateAction_Feature() {
		return (EReference)getFeatureStateActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailAction() {
		return failActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionReference() {
		return actionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionReference_Action() {
		return (EReference)actionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionReference_Parameters() {
		return (EReference)actionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAction() {
		return timeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAction_Time() {
		return (EAttribute)timeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeAction_Consumer() {
		return (EReference)timeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentAction() {
		return dependentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactory getActionsFactory() {
		return (ActionsFactory)getEFactoryInstance();
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
		actionEClass = createEClass(ACTION);

		actionReferenceEClass = createEClass(ACTION_REFERENCE);
		createEReference(actionReferenceEClass, ACTION_REFERENCE__ACTION);
		createEReference(actionReferenceEClass, ACTION_REFERENCE__PARAMETERS);

		standAloneActionEClass = createEClass(STAND_ALONE_ACTION);
		createEReference(standAloneActionEClass, STAND_ALONE_ACTION__ACTION);
		createEReference(standAloneActionEClass, STAND_ALONE_ACTION__PARAMETERS);

		timedConditionActionEClass = createEClass(TIMED_CONDITION_ACTION);
		createEReference(timedConditionActionEClass, TIMED_CONDITION_ACTION__ACTION);
		createEAttribute(timedConditionActionEClass, TIMED_CONDITION_ACTION__FREQUENCY);
		createEReference(timedConditionActionEClass, TIMED_CONDITION_ACTION__CONDITION);

		preGenerationActionEClass = createEClass(PRE_GENERATION_ACTION);

		postGenerationActionEClass = createEClass(POST_GENERATION_ACTION);

		preGenerationSequenceEClass = createEClass(PRE_GENERATION_SEQUENCE);
		createEReference(preGenerationSequenceEClass, PRE_GENERATION_SEQUENCE__ACTIONS);

		postGenerationSequenceEClass = createEClass(POST_GENERATION_SEQUENCE);
		createEReference(postGenerationSequenceEClass, POST_GENERATION_SEQUENCE__ACTIONS);

		throwActionEClass = createEClass(THROW_ACTION);
		createEAttribute(throwActionEClass, THROW_ACTION__EVENT_ID);

		termActionEClass = createEClass(TERM_ACTION);
		createEReference(termActionEClass, TERM_ACTION__TERM);

		reconfigurationActionEClass = createEClass(RECONFIGURATION_ACTION);

		setDataActionEClass = createEClass(SET_DATA_ACTION);
		createEReference(setDataActionEClass, SET_DATA_ACTION__VALUES);
		createEReference(setDataActionEClass, SET_DATA_ACTION__NODE);

		getDataActionEClass = createEClass(GET_DATA_ACTION);
		createEReference(getDataActionEClass, GET_DATA_ACTION__NODE);

		removeBagActionEClass = createEClass(REMOVE_BAG_ACTION);
		createEReference(removeBagActionEClass, REMOVE_BAG_ACTION__BAG);
		createEReference(removeBagActionEClass, REMOVE_BAG_ACTION__INDEX);

		activateFeatureActionEClass = createEClass(ACTIVATE_FEATURE_ACTION);
		createEReference(activateFeatureActionEClass, ACTIVATE_FEATURE_ACTION__FEATURE);
		createEReference(activateFeatureActionEClass, ACTIVATE_FEATURE_ACTION__VERSION);

		deactivateFeatureActionEClass = createEClass(DEACTIVATE_FEATURE_ACTION);
		createEReference(deactivateFeatureActionEClass, DEACTIVATE_FEATURE_ACTION__FEATURE);

		setPropertyActionEClass = createEClass(SET_PROPERTY_ACTION);
		createEReference(setPropertyActionEClass, SET_PROPERTY_ACTION__PROPERTY);
		createEReference(setPropertyActionEClass, SET_PROPERTY_ACTION__VALUE);

		failActionEClass = createEClass(FAIL_ACTION);

		timeActionEClass = createEClass(TIME_ACTION);
		createEAttribute(timeActionEClass, TIME_ACTION__TIME);
		createEReference(timeActionEClass, TIME_ACTION__CONSUMER);

		dependentActionEClass = createEClass(DEPENDENT_ACTION);

		getPropertyActionEClass = createEClass(GET_PROPERTY_ACTION);
		createEReference(getPropertyActionEClass, GET_PROPERTY_ACTION__PROPERTY);

		getRealTimeActionEClass = createEClass(GET_REAL_TIME_ACTION);
		createEAttribute(getRealTimeActionEClass, GET_REAL_TIME_ACTION__TIME_HINT);

		getFeatureStateActionEClass = createEClass(GET_FEATURE_STATE_ACTION);
		createEReference(getFeatureStateActionEClass, GET_FEATURE_STATE_ACTION__FEATURE);
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
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		FeaturesPackage theFeaturesPackage = (FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionReferenceEClass.getESuperTypes().add(this.getPreGenerationAction());
		standAloneActionEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		standAloneActionEClass.getESuperTypes().add(theCorePackage.getITopLevelElement());
		timedConditionActionEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		timedConditionActionEClass.getESuperTypes().add(theCorePackage.getITopLevelElement());
		timedConditionActionEClass.getESuperTypes().add(theRulesPackage.getIRealTimeConsumer());
		preGenerationActionEClass.getESuperTypes().add(this.getAction());
		postGenerationActionEClass.getESuperTypes().add(this.getAction());
		preGenerationSequenceEClass.getESuperTypes().add(this.getPreGenerationAction());
		postGenerationSequenceEClass.getESuperTypes().add(this.getPostGenerationAction());
		throwActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		termActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		termActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		termActionEClass.getESuperTypes().add(this.getReconfigurationAction());
		reconfigurationActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		setDataActionEClass.getESuperTypes().add(this.getReconfigurationAction());
		getDataActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		removeBagActionEClass.getESuperTypes().add(this.getReconfigurationAction());
		activateFeatureActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		activateFeatureActionEClass.getESuperTypes().add(this.getReconfigurationAction());
		deactivateFeatureActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		deactivateFeatureActionEClass.getESuperTypes().add(this.getReconfigurationAction());
		setPropertyActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		failActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		failActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		timeActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		dependentActionEClass.getESuperTypes().add(this.getPostGenerationAction());
		getPropertyActionEClass.getESuperTypes().add(this.getDependentAction());
		getRealTimeActionEClass.getESuperTypes().add(this.getDependentAction());
		getRealTimeActionEClass.getESuperTypes().add(this.getPreGenerationAction());
		getFeatureStateActionEClass.getESuperTypes().add(this.getDependentAction());
		getFeatureStateActionEClass.getESuperTypes().add(this.getPreGenerationAction());

		// Initialize classes and features; add operations and parameters
		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionReferenceEClass, ActionReference.class, "ActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionReference_Action(), this.getStandAloneAction(), null, "action", null, 1, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionReference_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standAloneActionEClass, StandAloneAction.class, "StandAloneAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandAloneAction_Action(), this.getPreGenerationAction(), null, "action", null, 1, 1, StandAloneAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandAloneAction_Parameters(), theCorePackage.getIContextVariable(), null, "parameters", null, 0, -1, StandAloneAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedConditionActionEClass, TimedConditionAction.class, "TimedConditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedConditionAction_Action(), this.getPreGenerationAction(), null, "action", null, 1, 1, TimedConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedConditionAction_Frequency(), ecorePackage.getEInt(), "frequency", null, 1, 1, TimedConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedConditionAction_Condition(), theFunctionsPackage.getILogicFunction(), null, "condition", null, 1, 1, TimedConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preGenerationActionEClass, PreGenerationAction.class, "PreGenerationAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postGenerationActionEClass, PostGenerationAction.class, "PostGenerationAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preGenerationSequenceEClass, PreGenerationSequence.class, "PreGenerationSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreGenerationSequence_Actions(), this.getPreGenerationAction(), null, "actions", null, 0, -1, PreGenerationSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postGenerationSequenceEClass, PostGenerationSequence.class, "PostGenerationSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostGenerationSequence_Actions(), this.getPostGenerationAction(), null, "actions", null, 0, -1, PostGenerationSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throwActionEClass, ThrowAction.class, "ThrowAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrowAction_EventID(), ecorePackage.getEString(), "eventID", null, 1, 1, ThrowAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termActionEClass, TermAction.class, "TermAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermAction_Term(), theTermsPackage.getTerm(), null, "term", null, 1, 1, TermAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationActionEClass, ReconfigurationAction.class, "ReconfigurationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setDataActionEClass, SetDataAction.class, "SetDataAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetDataAction_Values(), theFunctionsPackage.getIValueFunction(), null, "values", null, 1, 1, SetDataAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetDataAction_Node(), theFunctionsPackage.getIDataNodeFunction(), null, "node", null, 1, 1, SetDataAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDataActionEClass, GetDataAction.class, "GetDataAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetDataAction_Node(), theFunctionsPackage.getIDataNodeFunction(), null, "node", null, 1, 1, GetDataAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeBagActionEClass, RemoveBagAction.class, "RemoveBagAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveBagAction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, RemoveBagAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoveBagAction_Index(), theFunctionsPackage.getIArithmetricFunction(), null, "index", null, 1, 1, RemoveBagAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activateFeatureActionEClass, ActivateFeatureAction.class, "ActivateFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivateFeatureAction_Feature(), theFeaturesPackage.getIFeature(), null, "feature", null, 1, 1, ActivateFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivateFeatureAction_Version(), theFeaturesPackage.getFeatureVersion(), null, "version", null, 0, 1, ActivateFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deactivateFeatureActionEClass, DeactivateFeatureAction.class, "DeactivateFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeactivateFeatureAction_Feature(), theFeaturesPackage.getIFeature(), null, "feature", null, 1, 1, DeactivateFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setPropertyActionEClass, SetPropertyAction.class, "SetPropertyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetPropertyAction_Property(), theDataPackage.getDataLeaf(), null, "property", null, 1, 1, SetPropertyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetPropertyAction_Value(), theDataPackage.getDataElement(), null, "value", null, 1, 1, SetPropertyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failActionEClass, FailAction.class, "FailAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeActionEClass, TimeAction.class, "TimeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeAction_Time(), ecorePackage.getEInt(), "time", null, 1, 1, TimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeAction_Consumer(), theRulesPackage.getITimeConsumer(), null, "consumer", null, 0, 1, TimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentActionEClass, DependentAction.class, "DependentAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getPropertyActionEClass, GetPropertyAction.class, "GetPropertyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPropertyAction_Property(), theDataPackage.getDataLeaf(), null, "property", null, 1, 1, GetPropertyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getRealTimeActionEClass, GetRealTimeAction.class, "GetRealTimeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetRealTimeAction_TimeHint(), ecorePackage.getELong(), "timeHint", "0", 1, 1, GetRealTimeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getFeatureStateActionEClass, GetFeatureStateAction.class, "GetFeatureStateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetFeatureStateAction_Feature(), theFeaturesPackage.getIFeature(), null, "feature", null, 1, 1, GetFeatureStateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActionsPackageImpl
