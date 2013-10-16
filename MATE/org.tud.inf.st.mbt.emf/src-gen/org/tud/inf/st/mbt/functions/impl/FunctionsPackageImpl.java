/**
 */
package org.tud.inf.st.mbt.functions.impl;

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

import org.tud.inf.st.mbt.functions.ArithmetricCase;
import org.tud.inf.st.mbt.functions.ArithmetricCaseFunction;
import org.tud.inf.st.mbt.functions.ArithmetricFunctionVariable;
import org.tud.inf.st.mbt.functions.ArithmetricLogicBinaryFunction;
import org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction;
import org.tud.inf.st.mbt.functions.ArithmetricStandAloneFunction;
import org.tud.inf.st.mbt.functions.BagCountFunction;
import org.tud.inf.st.mbt.functions.BagElementFunction;
import org.tud.inf.st.mbt.functions.BagFirstFreeFunction;
import org.tud.inf.st.mbt.functions.BagIdxFunction;
import org.tud.inf.st.mbt.functions.BagNextFunction;
import org.tud.inf.st.mbt.functions.BagSizeFunction;
import org.tud.inf.st.mbt.functions.BinaryFunction;
import org.tud.inf.st.mbt.functions.DataNodeCase;
import org.tud.inf.st.mbt.functions.DataNodeCaseFunction;
import org.tud.inf.st.mbt.functions.DataNodeFunction;
import org.tud.inf.st.mbt.functions.DataNodeFunctionVariable;
import org.tud.inf.st.mbt.functions.DataNodeReferenceFunction;
import org.tud.inf.st.mbt.functions.DataNodeStandAloneFunction;
import org.tud.inf.st.mbt.functions.DataNodeValueFunction;
import org.tud.inf.st.mbt.functions.DataValueFunction;
import org.tud.inf.st.mbt.functions.DivisionFunction;
import org.tud.inf.st.mbt.functions.EqualFunction;
import org.tud.inf.st.mbt.functions.FeatureTreeValidFunction;
import org.tud.inf.st.mbt.functions.FloatFunction;
import org.tud.inf.st.mbt.functions.FunctionVariable;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.functions.IArithmetricFunction;
import org.tud.inf.st.mbt.functions.IDataNodeFunction;
import org.tud.inf.st.mbt.functions.IFunction;
import org.tud.inf.st.mbt.functions.ILogicFunction;
import org.tud.inf.st.mbt.functions.IValueFunction;
import org.tud.inf.st.mbt.functions.IntFunction;
import org.tud.inf.st.mbt.functions.LargerThanFunction;
import org.tud.inf.st.mbt.functions.LogicFunctionVariable;
import org.tud.inf.st.mbt.functions.LogicReferenceFunction;
import org.tud.inf.st.mbt.functions.LogicStandAloneFunction;
import org.tud.inf.st.mbt.functions.LongFunction;
import org.tud.inf.st.mbt.functions.LowerThanFunction;
import org.tud.inf.st.mbt.functions.MinusFunction;
import org.tud.inf.st.mbt.functions.MultiplyFunction;
import org.tud.inf.st.mbt.functions.PlusFunction;
import org.tud.inf.st.mbt.functions.PredicateFunction;
import org.tud.inf.st.mbt.functions.ReferenceFunction;
import org.tud.inf.st.mbt.functions.StandAloneFunction;
import org.tud.inf.st.mbt.functions.SubClassFunction;
import org.tud.inf.st.mbt.functions.SubFunction;
import org.tud.inf.st.mbt.functions.TimeFunction;
import org.tud.inf.st.mbt.functions.TokenFunction;
import org.tud.inf.st.mbt.functions.UnaryFunction;

import org.tud.inf.st.mbt.functions.ValueCase;
import org.tud.inf.st.mbt.functions.ValueCaseFunction;
import org.tud.inf.st.mbt.functions.ValueFunctionVariable;
import org.tud.inf.st.mbt.functions.ValueReferenceFunction;
import org.tud.inf.st.mbt.functions.ValueStandAloneFunction;
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
public class FunctionsPackageImpl extends EPackageImpl implements FunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricFunctionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeFunctionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueFunctionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicStandAloneFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicReferenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicFunctionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standAloneFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iValueFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLogicFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricLogicBinaryFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTreeValidFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largerThanFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerThanFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArithmetricFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricStandAloneFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagCountFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagIdxFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagSizeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagNextFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagFirstFreeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricCaseFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueCaseFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeCaseFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmetricReferenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeStandAloneFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeReferenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueStandAloneFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueReferenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDataNodeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagElementFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeValueFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueFunctionEClass = null;

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
	 * @see org.tud.inf.st.mbt.functions.FunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionsPackageImpl() {
		super(eNS_URI, FunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionsPackage init() {
		if (isInited) return (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Obtain or create and register package
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		FeaturetreePackageImpl theFeaturetreePackage = (FeaturetreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) instanceof FeaturetreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI) : FeaturetreePackage.eINSTANCE);
		GuigraphPackageImpl theGuigraphPackage = (GuigraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) instanceof GuigraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI) : GuigraphPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		FeaturesPackageImpl theFeaturesPackage = (FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) instanceof FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturesPackage.eNS_URI) : FeaturesPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		OcmPackageImpl theOcmPackage = (OcmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) instanceof OcmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OcmPackage.eNS_URI) : OcmPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);

		// Create package meta-data objects
		theFunctionsPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theFeaturetreePackage.createPackageContents();
		theGuigraphPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theTestPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theFeaturesPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theOcmPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionsPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theFeaturetreePackage.initializePackageContents();
		theGuigraphPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theFeaturesPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theOcmPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionsPackage.eNS_URI, theFunctionsPackage);
		return theFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFunction() {
		return iFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionVariable() {
		return functionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionVariable_Id() {
		return (EAttribute)functionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceFunction() {
		return referenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceFunction_Parameters() {
		return (EReference)referenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricFunctionVariable() {
		return arithmetricFunctionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeFunctionVariable() {
		return dataNodeFunctionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueFunctionVariable() {
		return valueFunctionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicStandAloneFunction() {
		return logicStandAloneFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicStandAloneFunction_Function() {
		return (EReference)logicStandAloneFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicReferenceFunction() {
		return logicReferenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicReferenceFunction_Function() {
		return (EReference)logicReferenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicFunctionVariable() {
		return logicFunctionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandAloneFunction() {
		return standAloneFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandAloneFunction_Parameters() {
		return (EReference)standAloneFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIValueFunction() {
		return iValueFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILogicFunction() {
		return iLogicFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubClassFunction() {
		return subClassFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassFunction_Sub() {
		return (EReference)subClassFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassFunction_In() {
		return (EReference)subClassFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricLogicBinaryFunction() {
		return arithmetricLogicBinaryFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricLogicBinaryFunction_Left() {
		return (EReference)arithmetricLogicBinaryFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricLogicBinaryFunction_Right() {
		return (EReference)arithmetricLogicBinaryFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateFunction() {
		return predicateFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateFunction_Predicate() {
		return (EReference)predicateFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureTreeValidFunction() {
		return featureTreeValidFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureTreeValidFunction_Tree() {
		return (EReference)featureTreeValidFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualFunction() {
		return equalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargerThanFunction() {
		return largerThanFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerThanFunction() {
		return lowerThanFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIArithmetricFunction() {
		return iArithmetricFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricStandAloneFunction() {
		return arithmetricStandAloneFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricStandAloneFunction_Function() {
		return (EReference)arithmetricStandAloneFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryFunction() {
		return unaryFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryFunction_Operand() {
		return (EReference)unaryFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFunction() {
		return binaryFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryFunction_Left() {
		return (EReference)binaryFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryFunction_Right() {
		return (EReference)binaryFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusFunction() {
		return plusFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubFunction() {
		return subFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinusFunction() {
		return minusFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplyFunction() {
		return multiplyFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionFunction() {
		return divisionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatFunction() {
		return floatFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatFunction_Value() {
		return (EAttribute)floatFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntFunction() {
		return intFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntFunction_Value() {
		return (EAttribute)intFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongFunction() {
		return longFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongFunction_Value() {
		return (EAttribute)longFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagCountFunction() {
		return bagCountFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagCountFunction_Bag() {
		return (EReference)bagCountFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagCountFunction_Needle() {
		return (EReference)bagCountFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagIdxFunction() {
		return bagIdxFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagIdxFunction_Bag() {
		return (EReference)bagIdxFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagIdxFunction_Needle() {
		return (EReference)bagIdxFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagSizeFunction() {
		return bagSizeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagSizeFunction_Bag() {
		return (EReference)bagSizeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagNextFunction() {
		return bagNextFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagNextFunction_Bag() {
		return (EReference)bagNextFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagFirstFreeFunction() {
		return bagFirstFreeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagFirstFreeFunction_Bag() {
		return (EReference)bagFirstFreeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeFunction() {
		return timeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeFunction_Consumer() {
		return (EReference)timeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenFunction() {
		return tokenFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenFunction_Place() {
		return (EReference)tokenFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricCaseFunction() {
		return arithmetricCaseFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricCaseFunction_Cases() {
		return (EReference)arithmetricCaseFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricCase() {
		return arithmetricCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricCase_Condition() {
		return (EReference)arithmetricCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricCase_Then() {
		return (EReference)arithmetricCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueCaseFunction() {
		return valueCaseFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCaseFunction_Cases() {
		return (EReference)valueCaseFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueCase() {
		return valueCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCase_Condition() {
		return (EReference)valueCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueCase_Then() {
		return (EReference)valueCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeCaseFunction() {
		return dataNodeCaseFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeCaseFunction_Cases() {
		return (EReference)dataNodeCaseFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeCase() {
		return dataNodeCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeCase_Condition() {
		return (EReference)dataNodeCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeCase_Then() {
		return (EReference)dataNodeCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetricReferenceFunction() {
		return arithmetricReferenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmetricReferenceFunction_Function() {
		return (EReference)arithmetricReferenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeStandAloneFunction() {
		return dataNodeStandAloneFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeStandAloneFunction_Function() {
		return (EReference)dataNodeStandAloneFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeReferenceFunction() {
		return dataNodeReferenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeReferenceFunction_Function() {
		return (EReference)dataNodeReferenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueStandAloneFunction() {
		return valueStandAloneFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueStandAloneFunction_Function() {
		return (EReference)valueStandAloneFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueReferenceFunction() {
		return valueReferenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueReferenceFunction_Function() {
		return (EReference)valueReferenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDataNodeFunction() {
		return iDataNodeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeFunction() {
		return dataNodeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeFunction_Data() {
		return (EReference)dataNodeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagElementFunction() {
		return bagElementFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagElementFunction_Data() {
		return (EReference)bagElementFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagElementFunction_Idx() {
		return (EReference)bagElementFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNodeValueFunction() {
		return dataNodeValueFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNodeValueFunction_Node() {
		return (EReference)dataNodeValueFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValueFunction() {
		return dataValueFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValueFunction_Value() {
		return (EReference)dataValueFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactory getFunctionsFactory() {
		return (FunctionsFactory)getEFactoryInstance();
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
		iFunctionEClass = createEClass(IFUNCTION);

		functionVariableEClass = createEClass(FUNCTION_VARIABLE);
		createEAttribute(functionVariableEClass, FUNCTION_VARIABLE__ID);

		referenceFunctionEClass = createEClass(REFERENCE_FUNCTION);
		createEReference(referenceFunctionEClass, REFERENCE_FUNCTION__PARAMETERS);

		standAloneFunctionEClass = createEClass(STAND_ALONE_FUNCTION);
		createEReference(standAloneFunctionEClass, STAND_ALONE_FUNCTION__PARAMETERS);

		arithmetricStandAloneFunctionEClass = createEClass(ARITHMETRIC_STAND_ALONE_FUNCTION);
		createEReference(arithmetricStandAloneFunctionEClass, ARITHMETRIC_STAND_ALONE_FUNCTION__FUNCTION);

		arithmetricReferenceFunctionEClass = createEClass(ARITHMETRIC_REFERENCE_FUNCTION);
		createEReference(arithmetricReferenceFunctionEClass, ARITHMETRIC_REFERENCE_FUNCTION__FUNCTION);

		arithmetricFunctionVariableEClass = createEClass(ARITHMETRIC_FUNCTION_VARIABLE);

		dataNodeStandAloneFunctionEClass = createEClass(DATA_NODE_STAND_ALONE_FUNCTION);
		createEReference(dataNodeStandAloneFunctionEClass, DATA_NODE_STAND_ALONE_FUNCTION__FUNCTION);

		dataNodeReferenceFunctionEClass = createEClass(DATA_NODE_REFERENCE_FUNCTION);
		createEReference(dataNodeReferenceFunctionEClass, DATA_NODE_REFERENCE_FUNCTION__FUNCTION);

		dataNodeFunctionVariableEClass = createEClass(DATA_NODE_FUNCTION_VARIABLE);

		valueStandAloneFunctionEClass = createEClass(VALUE_STAND_ALONE_FUNCTION);
		createEReference(valueStandAloneFunctionEClass, VALUE_STAND_ALONE_FUNCTION__FUNCTION);

		valueReferenceFunctionEClass = createEClass(VALUE_REFERENCE_FUNCTION);
		createEReference(valueReferenceFunctionEClass, VALUE_REFERENCE_FUNCTION__FUNCTION);

		valueFunctionVariableEClass = createEClass(VALUE_FUNCTION_VARIABLE);

		logicStandAloneFunctionEClass = createEClass(LOGIC_STAND_ALONE_FUNCTION);
		createEReference(logicStandAloneFunctionEClass, LOGIC_STAND_ALONE_FUNCTION__FUNCTION);

		logicReferenceFunctionEClass = createEClass(LOGIC_REFERENCE_FUNCTION);
		createEReference(logicReferenceFunctionEClass, LOGIC_REFERENCE_FUNCTION__FUNCTION);

		logicFunctionVariableEClass = createEClass(LOGIC_FUNCTION_VARIABLE);

		iValueFunctionEClass = createEClass(IVALUE_FUNCTION);

		iLogicFunctionEClass = createEClass(ILOGIC_FUNCTION);

		arithmetricLogicBinaryFunctionEClass = createEClass(ARITHMETRIC_LOGIC_BINARY_FUNCTION);
		createEReference(arithmetricLogicBinaryFunctionEClass, ARITHMETRIC_LOGIC_BINARY_FUNCTION__LEFT);
		createEReference(arithmetricLogicBinaryFunctionEClass, ARITHMETRIC_LOGIC_BINARY_FUNCTION__RIGHT);

		subClassFunctionEClass = createEClass(SUB_CLASS_FUNCTION);
		createEReference(subClassFunctionEClass, SUB_CLASS_FUNCTION__SUB);
		createEReference(subClassFunctionEClass, SUB_CLASS_FUNCTION__IN);

		predicateFunctionEClass = createEClass(PREDICATE_FUNCTION);
		createEReference(predicateFunctionEClass, PREDICATE_FUNCTION__PREDICATE);

		featureTreeValidFunctionEClass = createEClass(FEATURE_TREE_VALID_FUNCTION);
		createEReference(featureTreeValidFunctionEClass, FEATURE_TREE_VALID_FUNCTION__TREE);

		equalFunctionEClass = createEClass(EQUAL_FUNCTION);

		largerThanFunctionEClass = createEClass(LARGER_THAN_FUNCTION);

		lowerThanFunctionEClass = createEClass(LOWER_THAN_FUNCTION);

		iArithmetricFunctionEClass = createEClass(IARITHMETRIC_FUNCTION);

		unaryFunctionEClass = createEClass(UNARY_FUNCTION);
		createEReference(unaryFunctionEClass, UNARY_FUNCTION__OPERAND);

		binaryFunctionEClass = createEClass(BINARY_FUNCTION);
		createEReference(binaryFunctionEClass, BINARY_FUNCTION__LEFT);
		createEReference(binaryFunctionEClass, BINARY_FUNCTION__RIGHT);

		plusFunctionEClass = createEClass(PLUS_FUNCTION);

		subFunctionEClass = createEClass(SUB_FUNCTION);

		minusFunctionEClass = createEClass(MINUS_FUNCTION);

		multiplyFunctionEClass = createEClass(MULTIPLY_FUNCTION);

		divisionFunctionEClass = createEClass(DIVISION_FUNCTION);

		floatFunctionEClass = createEClass(FLOAT_FUNCTION);
		createEAttribute(floatFunctionEClass, FLOAT_FUNCTION__VALUE);

		intFunctionEClass = createEClass(INT_FUNCTION);
		createEAttribute(intFunctionEClass, INT_FUNCTION__VALUE);

		longFunctionEClass = createEClass(LONG_FUNCTION);
		createEAttribute(longFunctionEClass, LONG_FUNCTION__VALUE);

		bagCountFunctionEClass = createEClass(BAG_COUNT_FUNCTION);
		createEReference(bagCountFunctionEClass, BAG_COUNT_FUNCTION__BAG);
		createEReference(bagCountFunctionEClass, BAG_COUNT_FUNCTION__NEEDLE);

		bagIdxFunctionEClass = createEClass(BAG_IDX_FUNCTION);
		createEReference(bagIdxFunctionEClass, BAG_IDX_FUNCTION__BAG);
		createEReference(bagIdxFunctionEClass, BAG_IDX_FUNCTION__NEEDLE);

		bagSizeFunctionEClass = createEClass(BAG_SIZE_FUNCTION);
		createEReference(bagSizeFunctionEClass, BAG_SIZE_FUNCTION__BAG);

		bagNextFunctionEClass = createEClass(BAG_NEXT_FUNCTION);
		createEReference(bagNextFunctionEClass, BAG_NEXT_FUNCTION__BAG);

		bagFirstFreeFunctionEClass = createEClass(BAG_FIRST_FREE_FUNCTION);
		createEReference(bagFirstFreeFunctionEClass, BAG_FIRST_FREE_FUNCTION__BAG);

		timeFunctionEClass = createEClass(TIME_FUNCTION);
		createEReference(timeFunctionEClass, TIME_FUNCTION__CONSUMER);

		tokenFunctionEClass = createEClass(TOKEN_FUNCTION);
		createEReference(tokenFunctionEClass, TOKEN_FUNCTION__PLACE);

		iDataNodeFunctionEClass = createEClass(IDATA_NODE_FUNCTION);

		dataNodeFunctionEClass = createEClass(DATA_NODE_FUNCTION);
		createEReference(dataNodeFunctionEClass, DATA_NODE_FUNCTION__DATA);

		bagElementFunctionEClass = createEClass(BAG_ELEMENT_FUNCTION);
		createEReference(bagElementFunctionEClass, BAG_ELEMENT_FUNCTION__DATA);
		createEReference(bagElementFunctionEClass, BAG_ELEMENT_FUNCTION__IDX);

		dataNodeValueFunctionEClass = createEClass(DATA_NODE_VALUE_FUNCTION);
		createEReference(dataNodeValueFunctionEClass, DATA_NODE_VALUE_FUNCTION__NODE);

		dataValueFunctionEClass = createEClass(DATA_VALUE_FUNCTION);
		createEReference(dataValueFunctionEClass, DATA_VALUE_FUNCTION__VALUE);

		arithmetricCaseFunctionEClass = createEClass(ARITHMETRIC_CASE_FUNCTION);
		createEReference(arithmetricCaseFunctionEClass, ARITHMETRIC_CASE_FUNCTION__CASES);

		arithmetricCaseEClass = createEClass(ARITHMETRIC_CASE);
		createEReference(arithmetricCaseEClass, ARITHMETRIC_CASE__CONDITION);
		createEReference(arithmetricCaseEClass, ARITHMETRIC_CASE__THEN);

		valueCaseFunctionEClass = createEClass(VALUE_CASE_FUNCTION);
		createEReference(valueCaseFunctionEClass, VALUE_CASE_FUNCTION__CASES);

		valueCaseEClass = createEClass(VALUE_CASE);
		createEReference(valueCaseEClass, VALUE_CASE__CONDITION);
		createEReference(valueCaseEClass, VALUE_CASE__THEN);

		dataNodeCaseFunctionEClass = createEClass(DATA_NODE_CASE_FUNCTION);
		createEReference(dataNodeCaseFunctionEClass, DATA_NODE_CASE_FUNCTION__CASES);

		dataNodeCaseEClass = createEClass(DATA_NODE_CASE);
		createEReference(dataNodeCaseEClass, DATA_NODE_CASE__CONDITION);
		createEReference(dataNodeCaseEClass, DATA_NODE_CASE__THEN);
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
		FeaturetreePackage theFeaturetreePackage = (FeaturetreePackage)EPackage.Registry.INSTANCE.getEPackage(FeaturetreePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		GuigraphPackage theGuigraphPackage = (GuigraphPackage)EPackage.Registry.INSTANCE.getEPackage(GuigraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionVariableEClass.getESuperTypes().add(this.getIFunction());
		functionVariableEClass.getESuperTypes().add(theCorePackage.getIContextVariable());
		referenceFunctionEClass.getESuperTypes().add(this.getIFunction());
		standAloneFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractModelElement());
		standAloneFunctionEClass.getESuperTypes().add(theCorePackage.getITopLevelElement());
		arithmetricStandAloneFunctionEClass.getESuperTypes().add(this.getStandAloneFunction());
		arithmetricReferenceFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		arithmetricReferenceFunctionEClass.getESuperTypes().add(this.getReferenceFunction());
		arithmetricFunctionVariableEClass.getESuperTypes().add(this.getFunctionVariable());
		arithmetricFunctionVariableEClass.getESuperTypes().add(this.getIArithmetricFunction());
		dataNodeStandAloneFunctionEClass.getESuperTypes().add(this.getStandAloneFunction());
		dataNodeReferenceFunctionEClass.getESuperTypes().add(this.getReferenceFunction());
		dataNodeReferenceFunctionEClass.getESuperTypes().add(this.getIDataNodeFunction());
		dataNodeFunctionVariableEClass.getESuperTypes().add(this.getFunctionVariable());
		dataNodeFunctionVariableEClass.getESuperTypes().add(this.getIDataNodeFunction());
		valueStandAloneFunctionEClass.getESuperTypes().add(this.getStandAloneFunction());
		valueReferenceFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		valueReferenceFunctionEClass.getESuperTypes().add(this.getReferenceFunction());
		valueFunctionVariableEClass.getESuperTypes().add(this.getFunctionVariable());
		valueFunctionVariableEClass.getESuperTypes().add(this.getIValueFunction());
		logicStandAloneFunctionEClass.getESuperTypes().add(this.getStandAloneFunction());
		logicReferenceFunctionEClass.getESuperTypes().add(this.getReferenceFunction());
		logicReferenceFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		logicFunctionVariableEClass.getESuperTypes().add(this.getFunctionVariable());
		logicFunctionVariableEClass.getESuperTypes().add(this.getILogicFunction());
		iValueFunctionEClass.getESuperTypes().add(this.getIFunction());
		iLogicFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		arithmetricLogicBinaryFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		subClassFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		predicateFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		featureTreeValidFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		equalFunctionEClass.getESuperTypes().add(this.getArithmetricLogicBinaryFunction());
		largerThanFunctionEClass.getESuperTypes().add(this.getArithmetricLogicBinaryFunction());
		lowerThanFunctionEClass.getESuperTypes().add(this.getArithmetricLogicBinaryFunction());
		iArithmetricFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		unaryFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		binaryFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		plusFunctionEClass.getESuperTypes().add(this.getBinaryFunction());
		subFunctionEClass.getESuperTypes().add(this.getUnaryFunction());
		minusFunctionEClass.getESuperTypes().add(this.getBinaryFunction());
		multiplyFunctionEClass.getESuperTypes().add(this.getBinaryFunction());
		divisionFunctionEClass.getESuperTypes().add(this.getBinaryFunction());
		floatFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		intFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		longFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		bagCountFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		bagIdxFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		bagSizeFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		bagNextFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		bagFirstFreeFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		timeFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		tokenFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		iDataNodeFunctionEClass.getESuperTypes().add(this.getIFunction());
		dataNodeFunctionEClass.getESuperTypes().add(this.getIDataNodeFunction());
		bagElementFunctionEClass.getESuperTypes().add(this.getIDataNodeFunction());
		dataNodeValueFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		dataNodeValueFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		dataNodeValueFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		dataValueFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		dataValueFunctionEClass.getESuperTypes().add(this.getILogicFunction());
		dataValueFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		arithmetricCaseFunctionEClass.getESuperTypes().add(this.getIArithmetricFunction());
		valueCaseFunctionEClass.getESuperTypes().add(this.getIValueFunction());
		dataNodeCaseFunctionEClass.getESuperTypes().add(this.getIDataNodeFunction());

		// Initialize classes and features; add operations and parameters
		initEClass(iFunctionEClass, IFunction.class, "IFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionVariableEClass, FunctionVariable.class, "FunctionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionVariable_Id(), ecorePackage.getEString(), "id", null, 1, 1, FunctionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceFunctionEClass, ReferenceFunction.class, "ReferenceFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceFunction_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1, ReferenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standAloneFunctionEClass, StandAloneFunction.class, "StandAloneFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandAloneFunction_Parameters(), theCorePackage.getIContextVariable(), null, "parameters", null, 0, -1, StandAloneFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmetricStandAloneFunctionEClass, ArithmetricStandAloneFunction.class, "ArithmetricStandAloneFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmetricStandAloneFunction_Function(), this.getIArithmetricFunction(), null, "function", null, 1, 1, ArithmetricStandAloneFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmetricReferenceFunctionEClass, ArithmetricReferenceFunction.class, "ArithmetricReferenceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmetricReferenceFunction_Function(), this.getArithmetricStandAloneFunction(), null, "function", null, 1, 1, ArithmetricReferenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmetricFunctionVariableEClass, ArithmetricFunctionVariable.class, "ArithmetricFunctionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataNodeStandAloneFunctionEClass, DataNodeStandAloneFunction.class, "DataNodeStandAloneFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeStandAloneFunction_Function(), this.getIDataNodeFunction(), null, "function", null, 1, 1, DataNodeStandAloneFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeReferenceFunctionEClass, DataNodeReferenceFunction.class, "DataNodeReferenceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeReferenceFunction_Function(), this.getDataNodeStandAloneFunction(), null, "function", null, 1, 1, DataNodeReferenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeFunctionVariableEClass, DataNodeFunctionVariable.class, "DataNodeFunctionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueStandAloneFunctionEClass, ValueStandAloneFunction.class, "ValueStandAloneFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueStandAloneFunction_Function(), this.getIValueFunction(), null, "function", null, 1, 1, ValueStandAloneFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueReferenceFunctionEClass, ValueReferenceFunction.class, "ValueReferenceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueReferenceFunction_Function(), this.getValueStandAloneFunction(), null, "function", null, 1, 1, ValueReferenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueFunctionVariableEClass, ValueFunctionVariable.class, "ValueFunctionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicStandAloneFunctionEClass, LogicStandAloneFunction.class, "LogicStandAloneFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicStandAloneFunction_Function(), this.getILogicFunction(), null, "function", null, 1, 1, LogicStandAloneFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicReferenceFunctionEClass, LogicReferenceFunction.class, "LogicReferenceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicReferenceFunction_Function(), this.getLogicStandAloneFunction(), null, "function", null, 1, 1, LogicReferenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicFunctionVariableEClass, LogicFunctionVariable.class, "LogicFunctionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iValueFunctionEClass, IValueFunction.class, "IValueFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLogicFunctionEClass, ILogicFunction.class, "ILogicFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmetricLogicBinaryFunctionEClass, ArithmetricLogicBinaryFunction.class, "ArithmetricLogicBinaryFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmetricLogicBinaryFunction_Left(), this.getIArithmetricFunction(), null, "left", null, 1, 1, ArithmetricLogicBinaryFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmetricLogicBinaryFunction_Right(), this.getIArithmetricFunction(), null, "right", null, 1, 1, ArithmetricLogicBinaryFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subClassFunctionEClass, SubClassFunction.class, "SubClassFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubClassFunction_Sub(), this.getIValueFunction(), null, "sub", null, 1, 1, SubClassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubClassFunction_In(), this.getIValueFunction(), null, "in", null, 1, 1, SubClassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateFunctionEClass, PredicateFunction.class, "PredicateFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateFunction_Predicate(), theRulesPackage.getPredicate(), null, "predicate", null, 1, 1, PredicateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureTreeValidFunctionEClass, FeatureTreeValidFunction.class, "FeatureTreeValidFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureTreeValidFunction_Tree(), theFeaturetreePackage.getFeatureTree(), null, "tree", null, 1, 1, FeatureTreeValidFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalFunctionEClass, EqualFunction.class, "EqualFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(largerThanFunctionEClass, LargerThanFunction.class, "LargerThanFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerThanFunctionEClass, LowerThanFunction.class, "LowerThanFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iArithmetricFunctionEClass, IArithmetricFunction.class, "IArithmetricFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryFunctionEClass, UnaryFunction.class, "UnaryFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryFunction_Operand(), this.getIArithmetricFunction(), null, "operand", null, 1, 1, UnaryFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryFunctionEClass, BinaryFunction.class, "BinaryFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryFunction_Left(), this.getIArithmetricFunction(), null, "left", null, 1, 1, BinaryFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryFunction_Right(), this.getIArithmetricFunction(), null, "right", null, 1, 1, BinaryFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusFunctionEClass, PlusFunction.class, "PlusFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subFunctionEClass, SubFunction.class, "SubFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusFunctionEClass, MinusFunction.class, "MinusFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyFunctionEClass, MultiplyFunction.class, "MultiplyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionFunctionEClass, DivisionFunction.class, "DivisionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatFunctionEClass, FloatFunction.class, "FloatFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatFunction_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intFunctionEClass, IntFunction.class, "IntFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntFunction_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longFunctionEClass, LongFunction.class, "LongFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongFunction_Value(), ecorePackage.getELong(), "value", null, 1, 1, LongFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagCountFunctionEClass, BagCountFunction.class, "BagCountFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagCountFunction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagCountFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagCountFunction_Needle(), this.getIValueFunction(), null, "needle", null, 1, 1, BagCountFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagIdxFunctionEClass, BagIdxFunction.class, "BagIdxFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagIdxFunction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagIdxFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagIdxFunction_Needle(), this.getIValueFunction(), null, "needle", null, 1, 1, BagIdxFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagSizeFunctionEClass, BagSizeFunction.class, "BagSizeFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagSizeFunction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagSizeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagNextFunctionEClass, BagNextFunction.class, "BagNextFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagNextFunction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagNextFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagFirstFreeFunctionEClass, BagFirstFreeFunction.class, "BagFirstFreeFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagFirstFreeFunction_Bag(), theDataPackage.getDataBag(), null, "bag", null, 1, 1, BagFirstFreeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeFunctionEClass, TimeFunction.class, "TimeFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeFunction_Consumer(), theRulesPackage.getITimeConsumer(), null, "consumer", null, 1, 1, TimeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenFunctionEClass, TokenFunction.class, "TokenFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenFunction_Place(), theGuigraphPackage.getPlace(), null, "place", null, 1, 1, TokenFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iDataNodeFunctionEClass, IDataNodeFunction.class, "IDataNodeFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataNodeFunctionEClass, DataNodeFunction.class, "DataNodeFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeFunction_Data(), theDataPackage.getDataStructureNode(), null, "data", null, 1, 1, DataNodeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagElementFunctionEClass, BagElementFunction.class, "BagElementFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagElementFunction_Data(), theDataPackage.getDataBag(), null, "data", null, 1, 1, BagElementFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagElementFunction_Idx(), this.getIArithmetricFunction(), null, "idx", null, 1, 1, BagElementFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeValueFunctionEClass, DataNodeValueFunction.class, "DataNodeValueFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeValueFunction_Node(), this.getDataNodeFunction(), null, "node", null, 1, 1, DataNodeValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueFunctionEClass, DataValueFunction.class, "DataValueFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataValueFunction_Value(), theDataPackage.getDataElement(), null, "value", null, 1, 1, DataValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmetricCaseFunctionEClass, ArithmetricCaseFunction.class, "ArithmetricCaseFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmetricCaseFunction_Cases(), this.getArithmetricCase(), null, "cases", null, 0, -1, ArithmetricCaseFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmetricCaseEClass, ArithmetricCase.class, "ArithmetricCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmetricCase_Condition(), theRulesPackage.getPredicate(), null, "condition", null, 1, 1, ArithmetricCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmetricCase_Then(), this.getIArithmetricFunction(), null, "then", null, 1, 1, ArithmetricCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueCaseFunctionEClass, ValueCaseFunction.class, "ValueCaseFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueCaseFunction_Cases(), this.getValueCase(), null, "cases", null, 0, -1, ValueCaseFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueCaseEClass, ValueCase.class, "ValueCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueCase_Condition(), theRulesPackage.getPredicate(), null, "condition", null, 1, 1, ValueCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueCase_Then(), this.getIValueFunction(), null, "then", null, 1, 1, ValueCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeCaseFunctionEClass, DataNodeCaseFunction.class, "DataNodeCaseFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeCaseFunction_Cases(), this.getDataNodeCase(), null, "cases", null, 0, -1, DataNodeCaseFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeCaseEClass, DataNodeCase.class, "DataNodeCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNodeCase_Condition(), theRulesPackage.getPredicate(), null, "condition", null, 1, 1, DataNodeCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNodeCase_Then(), this.getIDataNodeFunction(), null, "then", null, 1, 1, DataNodeCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FunctionsPackageImpl
