/**
 */
package org.tud.inf.st.mbt.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tud.inf.st.mbt.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataPackage.DATA_STRUCTURE: return createDataStructure();
			case DataPackage.DATA_LEAF: return createDataLeaf();
			case DataPackage.DATA_CLASS: return createDataClass();
			case DataPackage.DATA_VALUE: return createDataValue();
			case DataPackage.DATA_BINDING: return createDataBinding();
			case DataPackage.STEP_DATA_BINDING: return createStepDataBinding();
			case DataPackage.DATA_SCENARIO: return createDataScenario();
			case DataPackage.DATA_RANGE: return createDataRange();
			case DataPackage.DATA_BAG: return createDataBag();
			case DataPackage.TYPED_DATA_CLASS: return createTypedDataClass();
			case DataPackage.INT_DATA_VALUE: return createIntDataValue();
			case DataPackage.SUBSTITUTABLE_INT_RANGE: return createSubstitutableIntRange();
			case DataPackage.LONG_DATA_VALUE: return createLongDataValue();
			case DataPackage.BOOL_DATA_VALUE: return createBoolDataValue();
			case DataPackage.FLOAT_DATA_VALUE: return createFloatDataValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure createDataStructure() {
		DataStructureImpl dataStructure = new DataStructureImpl();
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLeaf createDataLeaf() {
		DataLeafImpl dataLeaf = new DataLeafImpl();
		return dataLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass createDataClass() {
		DataClassImpl dataClass = new DataClassImpl();
		return dataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBinding createDataBinding() {
		DataBindingImpl dataBinding = new DataBindingImpl();
		return dataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDataBinding createStepDataBinding() {
		StepDataBindingImpl stepDataBinding = new StepDataBindingImpl();
		return stepDataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataScenario createDataScenario() {
		DataScenarioImpl dataScenario = new DataScenarioImpl();
		return dataScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange createDataRange() {
		DataRangeImpl dataRange = new DataRangeImpl();
		return dataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag createDataBag() {
		DataBagImpl dataBag = new DataBagImpl();
		return dataBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedDataClass createTypedDataClass() {
		TypedDataClassImpl typedDataClass = new TypedDataClassImpl();
		return typedDataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntDataValue createIntDataValue() {
		IntDataValueImpl intDataValue = new IntDataValueImpl();
		return intDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutableIntRange createSubstitutableIntRange() {
		SubstitutableIntRangeImpl substitutableIntRange = new SubstitutableIntRangeImpl();
		return substitutableIntRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongDataValue createLongDataValue() {
		LongDataValueImpl longDataValue = new LongDataValueImpl();
		return longDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolDataValue createBoolDataValue() {
		BoolDataValueImpl boolDataValue = new BoolDataValueImpl();
		return boolDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatDataValue createFloatDataValue() {
		FloatDataValueImpl floatDataValue = new FloatDataValueImpl();
		return floatDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
