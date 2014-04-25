/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MTemperature IR Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMTemperatureIRDevice()
 * @model interface="true" abstract="true" superTypes="org.openhab.binding.tinkerforge.internal.model.MSensor<org.openhab.binding.tinkerforge.internal.model.MDecimalValue> org.openhab.binding.tinkerforge.internal.model.MSubDevice<org.openhab.binding.tinkerforge.internal.model.MBrickletTemperatureIR> org.openhab.binding.tinkerforge.internal.model.CallbackListener"
 * @generated
 */
public interface MTemperatureIRDevice extends MSensor<DecimalValue>, MSubDevice<MBrickletTemperatureIR>, CallbackListener
{
  /**
   * Returns the value of the '<em><b>Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temperature</em>' attribute.
   * @see #setTemperature(short)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMTemperatureIRDevice_Temperature()
   * @model unique="false"
   * @generated
   */
  short getTemperature();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getTemperature <em>Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temperature</em>' attribute.
   * @see #getTemperature()
   * @generated
   */
  void setTemperature(short value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(int)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMTemperatureIRDevice_Threshold()
   * @model default="0" unique="false"
   * @generated
   */
  int getThreshold();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(int value);

} // MTemperatureIRDevice
