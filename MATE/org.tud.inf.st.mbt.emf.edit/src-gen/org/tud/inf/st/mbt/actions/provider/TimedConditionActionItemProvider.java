/**
 */
package org.tud.inf.st.mbt.actions.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.ActionsPackage;
import org.tud.inf.st.mbt.actions.TimedConditionAction;

import org.tud.inf.st.mbt.core.provider.AbstractModelElementItemProvider;

import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.rules.RulesFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.actions.TimedConditionAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedConditionActionItemProvider
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
	public TimedConditionActionItemProvider(AdapterFactory adapterFactory) {
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

			addFrequencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedConditionAction_frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedConditionAction_frequency_feature", "_UI_TimedConditionAction_type"),
				 ActionsPackage.Literals.TIMED_CONDITION_ACTION__FREQUENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION);
			childrenFeatures.add(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION);
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
	 * This returns TimedConditionAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimedConditionAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimedConditionAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimedConditionAction_type") :
			getString("_UI_TimedConditionAction_type") + " " + label;
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

		switch (notification.getFeatureID(TimedConditionAction.class)) {
			case ActionsPackage.TIMED_CONDITION_ACTION__FREQUENCY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ActionsPackage.TIMED_CONDITION_ACTION__ACTION:
			case ActionsPackage.TIMED_CONDITION_ACTION__CONDITION:
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
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createPreGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createThrowAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createTermAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createSetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createGetDataAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createRemoveBagAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createActivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createDeactivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createFailAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createGetRealTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__ACTION,
				 ActionsFactory.eINSTANCE.createGetFeatureStateAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createLogicReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createLogicFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createSubClassFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createPredicateFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createFeatureTreeValidFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createEqualFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createLargerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createLowerThanFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createDataNodeValueFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ActionsPackage.Literals.TIMED_CONDITION_ACTION__CONDITION,
				 FunctionsFactory.eINSTANCE.createDataValueFunction()));
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
