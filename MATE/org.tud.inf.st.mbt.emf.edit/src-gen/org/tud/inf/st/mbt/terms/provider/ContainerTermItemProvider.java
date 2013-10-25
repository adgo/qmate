/**
 */
package org.tud.inf.st.mbt.terms.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.tud.inf.st.mbt.functions.FunctionsFactory;

import org.tud.inf.st.mbt.ocm.OcmFactory;

import org.tud.inf.st.mbt.rules.RulesFactory;

import org.tud.inf.st.mbt.scenario.ScenarioFactory;

import org.tud.inf.st.mbt.terms.ContainerTerm;
import org.tud.inf.st.mbt.terms.TermsFactory;
import org.tud.inf.st.mbt.terms.TermsPackage;

import org.tud.inf.st.mbt.test.TestFactory;

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.terms.ContainerTerm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerTermItemProvider
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
	public ContainerTermItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT);
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
	 * This returns ContainerTerm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContainerTerm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContainerTerm_type");
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

		switch (notification.getFeatureID(ContainerTerm.class)) {
			case TermsPackage.CONTAINER_TERM__CONTAINMENT:
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
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createFunctorTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createStringTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createFloatTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createIntegerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createLongTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createListTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createFunctionTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createReferenceTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createContainerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createBoolTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TermsFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createStandAloneAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createTimedConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createPreGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createPostGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createThrowAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createTermAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createSetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createGetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createRemoveBagAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createActivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createDeactivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createSetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createFailAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createGetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createGetRealTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ActionsFactory.eINSTANCE.createGetFeatureStateAction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturetreeFactory.eINSTANCE.createFeatureTree()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturetreeFactory.eINSTANCE.createTreeFeature()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createGuiGraph()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createNoWidgetNode()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createConditionActionTransition()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createTimerTransition()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createStandardArc()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 GuigraphFactory.eINSTANCE.createInhibitorArc()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 CoreFactory.eINSTANCE.createGenericModelContainer()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestReport()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestRun()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createTestStepRun()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 TestFactory.eINSTANCE.createVerdict()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createSubPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 RulesFactory.eINSTANCE.createContextEntry()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createExplicitSet()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createWithout()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createSetReference()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createStandaloneFeatureSet()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createSubSet()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createFeatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FeaturesFactory.eINSTANCE.createFeatureVersion()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataStructure()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createStepDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataScenario()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataRange()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createDataBag()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createTypedDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createIntDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createSubstitutableIntRange()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createLongDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createBoolDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 DataFactory.eINSTANCE.createFloatDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createArithmetricStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createValueStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createValueReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createValueFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLogicStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createBagElementFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createArithmetricCase()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createValueCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createValueCase()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 FunctionsFactory.eINSTANCE.createDataNodeCase()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 OcmFactory.eINSTANCE.createOperationalConfigurationModel()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 OcmFactory.eINSTANCE.createStandardConfigurationNode()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 OcmFactory.eINSTANCE.createReconfigurationActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 OcmFactory.eINSTANCE.createTimedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 OcmFactory.eINSTANCE.createEventGuardedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ScenarioFactory.eINSTANCE.createScenarioModel()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ScenarioFactory.eINSTANCE.createScenarioEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ScenarioFactory.eINSTANCE.createSpatialBase()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ScenarioFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.CONTAINER_TERM__CONTAINMENT,
				 ScenarioFactory.eINSTANCE.createPlacement()));
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
