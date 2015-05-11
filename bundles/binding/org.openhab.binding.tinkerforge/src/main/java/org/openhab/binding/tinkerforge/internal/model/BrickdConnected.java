/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.HighLowValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brickd Connected</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.BrickdConnected#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getBrickdConnected()
 * @model superTypes="org.openhab.binding.tinkerforge.internal.model.MSensor<org.openhab.binding.tinkerforge.internal.model.DigitalValue> org.openhab.binding.tinkerforge.internal.model.BrickdSubDevice"
 * @generated
 */
public interface BrickdConnected extends MSensor<HighLowValue>, BrickdSubDevice
{
  /**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"brickd_connected"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getBrickdConnected_DeviceType()
   * @model default="brickd_connected" unique="false" changeable="false"
   * @generated
   */
  String getDeviceType();

} // BrickdConnected
