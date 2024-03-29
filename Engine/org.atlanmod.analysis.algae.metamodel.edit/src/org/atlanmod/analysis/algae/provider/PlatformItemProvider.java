/**
 */
package org.atlanmod.analysis.algae.provider;


import java.util.Collection;
import java.util.List;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Platform;

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

/**
 * This is the item provider adapter for a {@link org.atlanmod.analysis.algae.Platform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformItemProvider 
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
	public PlatformItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Platform_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Platform_name_feature", "_UI_Platform_type"),
				 AlgaePackage.Literals.PLATFORM__NAME,
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
			childrenFeatures.add(AlgaePackage.Literals.PLATFORM__VARIABLES);
			childrenFeatures.add(AlgaePackage.Literals.PLATFORM__MEASURES);
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
	 * This returns Platform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Platform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Platform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Platform_type") :
			getString("_UI_Platform_type") + " " + label;
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

		switch (notification.getFeatureID(Platform.class)) {
			case AlgaePackage.PLATFORM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AlgaePackage.PLATFORM__VARIABLES:
			case AlgaePackage.PLATFORM__MEASURES:
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
				(AlgaePackage.Literals.PLATFORM__VARIABLES,
				 AlgaeFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createRealTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSubstractOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundDivisionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createLogisticMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createExponentialMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.PLATFORM__MEASURES,
				 AlgaeFactory.eINSTANCE.createIntegrationMeasure()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AlgaeEditPlugin.INSTANCE;
	}

}
