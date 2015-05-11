/**
 */
package org.openhab.binding.tinkerforge.internal.model;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brickd Sub Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.BrickdSubDevice#getBrickd <em>Brickd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getBrickdSubDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BrickdSubDevice extends MSubDevice<MBrickd>
{

  /**
   * Returns the value of the '<em><b>Brickd</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getBrickdSubdevices <em>Brickd Subdevices</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Brickd</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brickd</em>' container reference.
   * @see #setBrickd(MBrickd)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getBrickdSubDevice_Brickd()
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getBrickdSubdevices
   * @model opposite="brickdSubdevices" transient="false"
   * @generated
   */
  MBrickd getBrickd();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.BrickdSubDevice#getBrickd <em>Brickd</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brickd</em>' container reference.
   * @see #getBrickd()
   * @generated
   */
  void setBrickd(MBrickd value);

} // BrickdSubDevice
