/**
 */
package org.tud.inf.st.mbt.rules.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
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

import org.tud.inf.st.mbt.rules.ContextEntry;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.rules.RulesPackage;

import org.tud.inf.st.mbt.scenario.ScenarioFactory;

import org.tud.inf.st.mbt.terms.TermsFactory;

import org.tud.inf.st.mbt.test.TestFactory;

import org.tud.inf.st.mbt.ulang.guigraph.GuigraphFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.rules.ContextEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextEntryItemProvider
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
	public ContextEntryItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextEntry_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextEntry_id_feature", "_UI_ContextEntry_type"),
				 RulesPackage.Literals.CONTEXT_ENTRY__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(RulesPackage.Literals.CONTEXT_ENTRY__VALUE);
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
	 * This returns ContextEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContextEntry)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ContextEntry_type") :
			getString("_UI_ContextEntry_type") + " " + label;
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

		switch (notification.getFeatureID(ContextEntry.class)) {
			case RulesPackage.CONTEXT_ENTRY__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RulesPackage.CONTEXT_ENTRY__VALUE:
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
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createSubPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 RulesFactory.eINSTANCE.createContextEntry()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createStandAloneAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createTimedConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createPreGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createPostGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createThrowAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createTermAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createSetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createGetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createRemoveBagAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createActivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createDeactivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createSetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createFailAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createGetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createGetRealTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ActionsFactory.eINSTANCE.createGetFeatureStateAction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturetreeFactory.eINSTANCE.createFeatureTree()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturetreeFactory.eINSTANCE.createTreeFeature()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createGuiGraph()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createNoWidgetNode()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createConditionActionTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createTimerTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createStandardArc()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createInhibitorArc()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 GuigraphFactory.eINSTANCE.createPageTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 CoreFactory.eINSTANCE.createGenericModelContainer()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestReport()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestRun()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createTestStepRun()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TestFactory.eINSTANCE.createVerdict()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createExplicitSet()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createWithout()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createSetReference()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createStandaloneFeatureSet()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createSubSet()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createFeatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FeaturesFactory.eINSTANCE.createFeatureVersion()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataStructure()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createStepDataBinding()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataScenario()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataRange()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createDataBag()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createTypedDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createIntDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createSubstitutableIntRange()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createLongDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createBoolDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 DataFactory.eINSTANCE.createFloatDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createArithmetricStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createArithmetricReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createArithmetricFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createValueStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createValueReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createValueFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLogicStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createPlusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createSubFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createMinusFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createMultiplyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDivisionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createFloatFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createIntFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createLongFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagCountFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagIdxFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagNextFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagFirstFreeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createTimeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createTokenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createBagElementFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createArithmetricCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createArithmetricCase()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createValueCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createValueCase()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeCaseFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 FunctionsFactory.eINSTANCE.createDataNodeCase()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 OcmFactory.eINSTANCE.createOperationalConfigurationModel()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 OcmFactory.eINSTANCE.createStandardConfigurationNode()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 OcmFactory.eINSTANCE.createReconfigurationActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 OcmFactory.eINSTANCE.createTimedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 OcmFactory.eINSTANCE.createEventGuardedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ScenarioFactory.eINSTANCE.createScenarioModel()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ScenarioFactory.eINSTANCE.createScenarioEntity()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ScenarioFactory.eINSTANCE.createSpatialBase()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ScenarioFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 ScenarioFactory.eINSTANCE.createPlacement()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createFunctorTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createStringTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createFloatTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createIntegerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createLongTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createListTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createFunctionTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createReferenceTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createContainerTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
				 TermsFactory.eINSTANCE.createBoolTerm()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.CONTEXT_ENTRY__VALUE,
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
