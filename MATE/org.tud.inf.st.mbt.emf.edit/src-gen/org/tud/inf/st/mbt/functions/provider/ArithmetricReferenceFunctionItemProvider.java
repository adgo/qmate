/**
 */
package org.tud.inf.st.mbt.functions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;

import org.tud.inf.st.mbt.core.CoreFactory;
import org.tud.inf.st.mbt.data.DataFactory;
import org.tud.inf.st.mbt.features.FeaturesFactory;
import org.tud.inf.st.mbt.featuretree.FeaturetreeFactory;
import org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.functions.FunctionsPackage;
import org.tud.inf.st.mbt.ocm.OcmFactory;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.scenario.ScenarioFactory;
import org.tud.inf.st.mbt.terms.TermsFactory;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.functions.ArithmetricReferenceFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmetricReferenceFunctionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetricReferenceFunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArithmetricReferenceFunction_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArithmetricReferenceFunction_function_feature", "_UI_ArithmetricReferenceFunction_type"),
				 FunctionsPackage.Literals.ARITHMETRIC_REFERENCE_FUNCTION__FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ArithmetricReferenceFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArithmetricReferenceFunction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ArithmetricReferenceFunction_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArithmetricReferenceFunction.class)) {
			case FunctionsPackage.ARITHMETRIC_REFERENCE_FUNCTION__PARAMETERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createArithmetricStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createValueStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createValueReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createValueFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLogicStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createBagElementFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createArithmetricCase()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createValueCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createValueCase()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FunctionsFactory.eINSTANCE.createDataNodeCase()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createStandAloneAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createTimedConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createPreGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createPostGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createThrowAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createTermAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createSetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createGetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createRemoveBagAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createActivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createDeactivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createSetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createFailAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createGetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createGetRealTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ActionsFactory.eINSTANCE.createGetFeatureStateAction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturetreeFactory.eINSTANCE.createFeatureTree()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturetreeFactory.eINSTANCE.createTreeFeature()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createGuiGraph()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createNoWidgetNode()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createConditionActionTransition()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createTimerTransition()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createStandardArc()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 GuigraphFactory.eINSTANCE.createInhibitorArc()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 CoreFactory.eINSTANCE.createGenericModelContainer()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestReport()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestRun()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createTestStepRun()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TestFactory.eINSTANCE.createVerdict()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createSubPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 RulesFactory.eINSTANCE.createContextEntry()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createExplicitSet()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createWithout()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createSetReference()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createStandaloneFeatureSet()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createSubSet()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createFeatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 FeaturesFactory.eINSTANCE.createFeatureVersion()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataStructure()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createStepDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataScenario()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataRange()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createDataBag()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createTypedDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createIntDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createSubstitutableIntRange()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createLongDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createBoolDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 DataFactory.eINSTANCE.createFloatDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 OcmFactory.eINSTANCE.createOperationalConfigurationModel()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 OcmFactory.eINSTANCE.createStandardConfigurationNode()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 OcmFactory.eINSTANCE.createReconfigurationActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 OcmFactory.eINSTANCE.createTimedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 OcmFactory.eINSTANCE.createEventGuardedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ScenarioFactory.eINSTANCE.createScenarioModel()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ScenarioFactory.eINSTANCE.createScenarioEntity()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ScenarioFactory.eINSTANCE.createSpatialBase()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ScenarioFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 ScenarioFactory.eINSTANCE.createPlacement()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createFunctorTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createStringTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createFloatTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createIntegerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createLongTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createListTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createFunctionTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createReferenceTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createContainerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createBoolTerm()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.REFERENCE_FUNCTION__PARAMETERS,
				 TermsFactory.eINSTANCE.createTermVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AllEditPlugin.INSTANCE;
	}

}
