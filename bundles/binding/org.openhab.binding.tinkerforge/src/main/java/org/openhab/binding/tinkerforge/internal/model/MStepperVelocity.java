/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MStepper Velocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.MStepperVelocity#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMStepperVelocity()
 * @model superTypes="org.openhab.binding.tinkerforge.internal.model.MStepperDevice
 *        org.openhab.binding.tinkerforge.internal.model.MSensor
 *        <org.openhab.binding.tinkerforge.internal.model.MDecimalValue>"
 * @generated
 */
public interface MStepperVelocity extends MStepperDevice, MSensor<DecimalValue> {

    /**
     * Returns the value of the '<em><b>Device Type</b></em>' attribute.
     * The default value is <code>"stepper_velocity"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Device Type</em>' attribute.
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMStepperVelocity_DeviceType()
     * @model default="stepper_velocity" unique="false" changeable="false"
     * @generated
     */
    String getDeviceType();
} // MStepperVelocity
