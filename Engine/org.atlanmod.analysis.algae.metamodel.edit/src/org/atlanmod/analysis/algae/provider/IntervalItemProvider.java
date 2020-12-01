/**
 */
package org.atlanmod.analysis.algae.provider;


import java.util.Collection;
import java.util.List;

import org.atlanmod.analysis.algae.AlgaeFactory;
import org.atlanmod.analysis.algae.AlgaePackage;
import org.atlanmod.analysis.algae.Interval;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.atlanmod.analysis.algae.Interval} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervalItemProvider extends MeasurementUncertaintyInformationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT);
			childrenFeatures.add(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT);
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
	 * This returns Interval.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interval"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Interval_type");
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

		switch (notification.getFeatureID(Interval.class)) {
			case AlgaePackage.INTERVAL__LOWER_ENDPOINT:
			case AlgaePackage.INTERVAL__UPPER_ENDPOINT:
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
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureBinaryProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureBinarySumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createRealTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSubstractOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundDivisionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createCompositeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createLogisticMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createExponentialMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createIntegrationMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureBinaryProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureBinarySumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createRealTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundSubstractOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createMeasureUnboundDivisionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createCompositeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createLogisticMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createExponentialMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 AlgaeFactory.eINSTANCE.createIntegrationMeasure()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AlgaePackage.Literals.INTERVAL__LOWER_ENDPOINT ||
			childFeature == AlgaePackage.Literals.INTERVAL__UPPER_ENDPOINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
