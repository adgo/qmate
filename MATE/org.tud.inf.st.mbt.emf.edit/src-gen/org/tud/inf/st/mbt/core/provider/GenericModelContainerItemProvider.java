/**
 */
package org.tud.inf.st.mbt.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.ActionsFactory;

import org.tud.inf.st.mbt.core.CoreFactory;
import org.tud.inf.st.mbt.core.CorePackage;
import org.tud.inf.st.mbt.core.GenericModelContainer;

import org.tud.inf.st.mbt.data.DataFactory;

import org.tud.inf.st.mbt.features.FeaturesFactory;

import org.tud.inf.st.mbt.featuretree.FeaturetreeFactory;

import org.tud.inf.st.mbt.functions.FunctionsFactory;


import org.tud.inf.st.mbt.rules.RulesFactory;

import org.tud.inf.st.mbt.test.TestFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.core.GenericModelContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericModelContainerItemProvider
	extends AbstractModelElementItemProvider
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
	public GenericModelContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS);
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
	 * This returns GenericModelContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenericModelContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenericModelContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenericModelContainer_type") :
			getString("_UI_GenericModelContainer_type") + " " + label;
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

		switch (notification.getFeatureID(GenericModelContainer.class)) {
			case CorePackage.GENERIC_MODEL_CONTAINER__ELEMENTS:
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
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 CoreFactory.eINSTANCE.createGenericModelContainer()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 ActionsFactory.eINSTANCE.createStandAloneAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 ActionsFactory.eINSTANCE.createTimedConditionAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FeaturetreeFactory.eINSTANCE.createFeatureTree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 TestFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 TestFactory.eINSTANCE.createTestReport()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FeaturesFactory.eINSTANCE.createStandaloneFeatureSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FeaturesFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createDataStructure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createDataLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createDataScenario()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createDataBag()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 DataFactory.eINSTANCE.createTypedDataClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FunctionsFactory.eINSTANCE.createArithmetricStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FunctionsFactory.eINSTANCE.createDataNodeStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FunctionsFactory.eINSTANCE.createValueStandAloneFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.GENERIC_MODEL_CONTAINER__ELEMENTS,
				 FunctionsFactory.eINSTANCE.createLogicStandAloneFunction()));
	}

}
