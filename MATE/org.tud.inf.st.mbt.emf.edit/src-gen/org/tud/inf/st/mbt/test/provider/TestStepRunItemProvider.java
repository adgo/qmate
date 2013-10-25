/**
 */
package org.tud.inf.st.mbt.test.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.tud.inf.st.mbt.actions.ActionsFactory;
import org.tud.inf.st.mbt.actions.provider.AllEditPlugin;
import org.tud.inf.st.mbt.core.provider.AbstractModelElementItemProvider;
import org.tud.inf.st.mbt.emf.util.ReportUtil;
import org.tud.inf.st.mbt.rules.RulesFactory;
import org.tud.inf.st.mbt.test.TestFactory;
import org.tud.inf.st.mbt.test.TestPackage;
import org.tud.inf.st.mbt.test.TestStepRun;
import org.tud.inf.st.mbt.test.Verdict;

/**
 * This is the item provider adapter for a {@link org.tud.inf.st.mbt.test.TestStepRun} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestStepRunItemProvider
	extends TestExecutableItemProvider
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
	public TestStepRunItemProvider(AdapterFactory adapterFactory) {
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

			addStepPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TestStepRun_step_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TestStepRun_step_feature", "_UI_TestStepRun_type"),
				 TestPackage.Literals.TEST_STEP_RUN__STEP,
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
			childrenFeatures.add(TestPackage.Literals.TEST_STEP_RUN__STATE);
			childrenFeatures.add(TestPackage.Literals.TEST_STEP_RUN__VERDICT);
			childrenFeatures.add(TestPackage.Literals.TEST_STEP_RUN__ACTION);
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
	 * This returns TestStepRun.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		if(object instanceof TestStepRun){
			if(ReportUtil.passed((TestStepRun) object)){
				return overlayImage(object, getResourceLocator().getImage("pass.png"));
			} else {
				return overlayImage(object, getResourceLocator().getImage("fail.png"));
			}
		}
		
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TestStepRun"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TestStepRun)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TestStepRun_type") :
			getString("_UI_TestStepRun_type") + " " + label;
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

		switch (notification.getFeatureID(TestStepRun.class)) {
			case TestPackage.TEST_STEP_RUN__STATE:
			case TestPackage.TEST_STEP_RUN__VERDICT:
			case TestPackage.TEST_STEP_RUN__ACTION:
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
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createReasonableAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createFeatureAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createDataAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createLogicFunctionAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createTokenAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createInstructionPointerAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createConfigurationAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createBagElementAssignedAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__STATE,
				 RulesFactory.eINSTANCE.createRealTimeAtom()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__VERDICT,
				 TestFactory.eINSTANCE.createVerdict()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createPostGenerationSequence()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createTermAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createActivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createDeactivateFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createSetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createFailAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createGetPropertyAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createGetRealTimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(TestPackage.Literals.TEST_STEP_RUN__ACTION,
				 ActionsFactory.eINSTANCE.createGetFeatureStateAction()));
	}

}
