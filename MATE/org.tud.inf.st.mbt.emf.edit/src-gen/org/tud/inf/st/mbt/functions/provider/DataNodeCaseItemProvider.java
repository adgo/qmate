/**
 */
package org.tud.inf.st.mbt.functions.provider;


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

import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;

import org.tud.inf.st.mbt.functions.DataNodeCase;
import org.tud.inf.st.mbt.functions.FunctionsFactory;
import org.tud.inf.st.mbt.functions.FunctionsPackage;

import org.tud.inf.st.mbt.rules.RulesFactory;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.functions.DataNodeCase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataNodeCaseItemProvider
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
	public DataNodeCaseItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION);
			childrenFeatures.add(FunctionsPackage.Literals.DATA_NODE_CASE__THEN);
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
	 * This returns DataNodeCase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataNodeCase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataNodeCase_type");
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

		switch (notification.getFeatureID(DataNodeCase.class)) {
			case FunctionsPackage.DATA_NODE_CASE__CONDITION:
			case FunctionsPackage.DATA_NODE_CASE__THEN:
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
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createSubPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__CONDITION,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__THEN,
				 FunctionsFactory.eINSTANCE.createDataNodeReferenceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__THEN,
				 FunctionsFactory.eINSTANCE.createDataNodeFunctionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__THEN,
				 FunctionsFactory.eINSTANCE.createDataNodeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__THEN,
				 FunctionsFactory.eINSTANCE.createBagElementFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionsPackage.Literals.DATA_NODE_CASE__THEN,
				 FunctionsFactory.eINSTANCE.createDataNodeCaseFunction()));
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
