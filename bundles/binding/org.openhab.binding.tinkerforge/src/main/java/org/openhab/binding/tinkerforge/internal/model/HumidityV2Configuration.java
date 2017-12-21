/**
 */
package org.openhab.binding.tinkerforge.internal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Humidity V2 Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getStatusLEDConfig <em>Status LED Config</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getHumidityV2Configuration()
 * @model
 * @generated
 */
public interface HumidityV2Configuration extends TFBaseConfiguration {
    /**
     * Returns the value of the '<em><b>Status LED Config</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status LED Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status LED Config</em>' attribute.
     * @see #setStatusLEDConfig(int)
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getHumidityV2Configuration_StatusLEDConfig()
     * @model unique="false"
     * @generated
     */
    int getStatusLEDConfig();

    /**
     * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getStatusLEDConfig <em>Status LED Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status LED Config</em>' attribute.
     * @see #getStatusLEDConfig()
     * @generated
     */
    void setStatusLEDConfig(int value);

    /**
     * Returns the value of the '<em><b>Moving Average Length Humidity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Moving Average Length Humidity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Moving Average Length Humidity</em>' attribute.
     * @see #setMovingAverageLengthHumidity(int)
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getHumidityV2Configuration_MovingAverageLengthHumidity()
     * @model unique="false"
     * @generated
     */
    int getMovingAverageLengthHumidity();

    /**
     * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Moving Average Length Humidity</em>' attribute.
     * @see #getMovingAverageLengthHumidity()
     * @generated
     */
    void setMovingAverageLengthHumidity(int value);

    /**
     * Returns the value of the '<em><b>Moving Average Length Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Moving Average Length Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Moving Average Length Temperature</em>' attribute.
     * @see #setMovingAverageLengthTemperature(int)
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getHumidityV2Configuration_MovingAverageLengthTemperature()
     * @model unique="false"
     * @generated
     */
    int getMovingAverageLengthTemperature();

    /**
     * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Moving Average Length Temperature</em>' attribute.
     * @see #getMovingAverageLengthTemperature()
     * @generated
     */
    void setMovingAverageLengthTemperature(int value);

} // HumidityV2Configuration
