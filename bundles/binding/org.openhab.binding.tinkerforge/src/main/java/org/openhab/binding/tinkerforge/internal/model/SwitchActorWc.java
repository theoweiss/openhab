/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.DeviceOptions;

import org.openhab.binding.tinkerforge.internal.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Actor Wc</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSwitchActorWc()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SwitchActorWc extends SwitchActor
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model stateDataType="org.openhab.binding.tinkerforge.internal.model.SwitchState" stateUnique="false" optsDataType="org.openhab.binding.tinkerforge.internal.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void turnSwitch(OnOffValue state, DeviceOptions opts);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.openhab.binding.tinkerforge.internal.model.SwitchState" unique="false" optsDataType="org.openhab.binding.tinkerforge.internal.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  OnOffValue fetchSwitchState(DeviceOptions opts);

} // SwitchActorWc
