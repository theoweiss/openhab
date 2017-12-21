/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MHumidity V2 Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMHumidityV2Device()
 * @model interface="true" abstract="true" superTypes="org.openhab.binding.tinkerforge.internal.model.MSensor&lt;org.openhab.binding.tinkerforge.internal.model.MDecimalValue&gt; org.openhab.binding.tinkerforge.internal.model.MSubDevice&lt;org.openhab.binding.tinkerforge.internal.model.MBrickletHumidityV2&gt; org.openhab.binding.tinkerforge.internal.model.CallbackListener"
 * @generated
 */
public interface MHumidityV2Device extends MSensor<DecimalValue>, MSubDevice<MBrickletHumidityV2>, CallbackListener {
} // MHumidityV2Device
