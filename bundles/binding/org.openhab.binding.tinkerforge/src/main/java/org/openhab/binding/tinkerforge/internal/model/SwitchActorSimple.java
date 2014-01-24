/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Actor Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSwitchActorSimple()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SwitchActorSimple extends SwitchActor
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model stateDataType="org.openhab.binding.tinkerforge.internal.model.SwitchState" stateUnique="false"
   * @generated
   */
  void turnSwitch(OnOffValue state);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.openhab.binding.tinkerforge.internal.model.SwitchState" unique="false"
   * @generated
   */
  OnOffValue fetchSwitchState();

} // SwitchActorSimple
