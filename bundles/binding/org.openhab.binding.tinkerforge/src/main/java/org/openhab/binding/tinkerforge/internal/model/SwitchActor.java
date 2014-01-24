/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.openhab.binding.tinkerforge.internal.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.SwitchActor#getSwitchState <em>Switch State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSwitchActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SwitchActor extends EObject
{

  /**
   * Returns the value of the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch State</em>' attribute.
   * @see #setSwitchState(OnOffValue)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSwitchActor_SwitchState()
   * @model unique="false" dataType="org.openhab.binding.tinkerforge.internal.model.SwitchState"
   * @generated
   */
  OnOffValue getSwitchState();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.SwitchActor#getSwitchState <em>Switch State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch State</em>' attribute.
   * @see #getSwitchState()
   * @generated
   */
  void setSwitchState(OnOffValue value);
} // SwitchActor
