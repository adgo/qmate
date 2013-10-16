/**
 */
package org.tud.inf.st.mbt.data.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.tud.inf.st.mbt.core.AbstractModelElement;

import org.tud.inf.st.mbt.core.ITopLevelElement;
import org.tud.inf.st.mbt.data.*;
import org.tud.inf.st.mbt.rules.ITimeConsumer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tud.inf.st.mbt.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataPackage.DATA_STRUCTURE: {
				DataStructure dataStructure = (DataStructure)theEObject;
				T result = caseDataStructure(dataStructure);
				if (result == null) result = caseDataStructureNode(dataStructure);
				if (result == null) result = caseAbstractModelElement(dataStructure);
				if (result == null) result = caseITopLevelElement(dataStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_LEAF: {
				DataLeaf dataLeaf = (DataLeaf)theEObject;
				T result = caseDataLeaf(dataLeaf);
				if (result == null) result = caseDataStructureNode(dataLeaf);
				if (result == null) result = caseAbstractModelElement(dataLeaf);
				if (result == null) result = caseITopLevelElement(dataLeaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_CLASS: {
				DataClass dataClass = (DataClass)theEObject;
				T result = caseDataClass(dataClass);
				if (result == null) result = caseDataElement(dataClass);
				if (result == null) result = caseITopLevelElement(dataClass);
				if (result == null) result = caseAbstractModelElement(dataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_STRUCTURE_NODE: {
				DataStructureNode dataStructureNode = (DataStructureNode)theEObject;
				T result = caseDataStructureNode(dataStructureNode);
				if (result == null) result = caseAbstractModelElement(dataStructureNode);
				if (result == null) result = caseITopLevelElement(dataStructureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseAbstractModelElement(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = caseDataElement(dataValue);
				if (result == null) result = caseAbstractModelElement(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_BINDING: {
				DataBinding dataBinding = (DataBinding)theEObject;
				T result = caseDataBinding(dataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.STEP_DATA_BINDING: {
				StepDataBinding stepDataBinding = (StepDataBinding)theEObject;
				T result = caseStepDataBinding(stepDataBinding);
				if (result == null) result = caseDataBinding(stepDataBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SCENARIO: {
				DataScenario dataScenario = (DataScenario)theEObject;
				T result = caseDataScenario(dataScenario);
				if (result == null) result = caseAbstractModelElement(dataScenario);
				if (result == null) result = caseITimeConsumer(dataScenario);
				if (result == null) result = caseITopLevelElement(dataScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseAbstractModelElement(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_BAG: {
				DataBag dataBag = (DataBag)theEObject;
				T result = caseDataBag(dataBag);
				if (result == null) result = caseDataStructureNode(dataBag);
				if (result == null) result = caseAbstractModelElement(dataBag);
				if (result == null) result = caseITopLevelElement(dataBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TYPED_DATA_ELEMENT: {
				TypedDataElement typedDataElement = (TypedDataElement)theEObject;
				T result = caseTypedDataElement(typedDataElement);
				if (result == null) result = caseDataElement(typedDataElement);
				if (result == null) result = caseAbstractModelElement(typedDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TYPED_DATA_CLASS: {
				TypedDataClass typedDataClass = (TypedDataClass)theEObject;
				T result = caseTypedDataClass(typedDataClass);
				if (result == null) result = caseTypedDataElement(typedDataClass);
				if (result == null) result = caseITopLevelElement(typedDataClass);
				if (result == null) result = caseDataElement(typedDataClass);
				if (result == null) result = caseAbstractModelElement(typedDataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INT_DATA_VALUE: {
				IntDataValue intDataValue = (IntDataValue)theEObject;
				T result = caseIntDataValue(intDataValue);
				if (result == null) result = caseTypedDataElement(intDataValue);
				if (result == null) result = caseDataElement(intDataValue);
				if (result == null) result = caseAbstractModelElement(intDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SUBSTITUTABLE_INT_RANGE: {
				SubstitutableIntRange substitutableIntRange = (SubstitutableIntRange)theEObject;
				T result = caseSubstitutableIntRange(substitutableIntRange);
				if (result == null) result = caseTypedDataElement(substitutableIntRange);
				if (result == null) result = caseDataElement(substitutableIntRange);
				if (result == null) result = caseAbstractModelElement(substitutableIntRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.LONG_DATA_VALUE: {
				LongDataValue longDataValue = (LongDataValue)theEObject;
				T result = caseLongDataValue(longDataValue);
				if (result == null) result = caseTypedDataElement(longDataValue);
				if (result == null) result = caseDataElement(longDataValue);
				if (result == null) result = caseAbstractModelElement(longDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.BOOL_DATA_VALUE: {
				BoolDataValue boolDataValue = (BoolDataValue)theEObject;
				T result = caseBoolDataValue(boolDataValue);
				if (result == null) result = caseTypedDataElement(boolDataValue);
				if (result == null) result = caseDataElement(boolDataValue);
				if (result == null) result = caseAbstractModelElement(boolDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.FLOAT_DATA_VALUE: {
				FloatDataValue floatDataValue = (FloatDataValue)theEObject;
				T result = caseFloatDataValue(floatDataValue);
				if (result == null) result = caseTypedDataElement(floatDataValue);
				if (result == null) result = caseDataElement(floatDataValue);
				if (result == null) result = caseAbstractModelElement(floatDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStructure(DataStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLeaf(DataLeaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataClass(DataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStructureNode(DataStructureNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBinding(DataBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Data Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Data Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepDataBinding(StepDataBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataScenario(DataScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBag(DataBag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedDataElement(TypedDataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Data Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedDataClass(TypedDataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntDataValue(IntDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitutable Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitutable Int Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutableIntRange(SubstitutableIntRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongDataValue(LongDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolDataValue(BoolDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatDataValue(FloatDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelElement(AbstractModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITop Level Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITopLevelElement(ITopLevelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITime Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITimeConsumer(ITimeConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataSwitch
