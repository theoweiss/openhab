/**
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhab.binding.tinkerforge.internal.model.HumidityV2Configuration;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Humidity V2 Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.HumidityV2ConfigurationImpl#getStatusLEDConfig <em>Status LED Config</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.HumidityV2ConfigurationImpl#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.HumidityV2ConfigurationImpl#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumidityV2ConfigurationImpl extends TFBaseConfigurationImpl implements HumidityV2Configuration {
    /**
     * The default value of the '{@link #getStatusLEDConfig() <em>Status LED Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusLEDConfig()
     * @generated
     * @ordered
     */
    protected static final int STATUS_LED_CONFIG_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStatusLEDConfig() <em>Status LED Config</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusLEDConfig()
     * @generated
     * @ordered
     */
    protected int statusLEDConfig = STATUS_LED_CONFIG_EDEFAULT;

    /**
     * The default value of the '{@link #getMovingAverageLengthHumidity() <em>Moving Average Length Humidity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMovingAverageLengthHumidity()
     * @generated
     * @ordered
     */
    protected static final int MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMovingAverageLengthHumidity() <em>Moving Average Length Humidity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMovingAverageLengthHumidity()
     * @generated
     * @ordered
     */
    protected int movingAverageLengthHumidity = MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT;

    /**
     * The default value of the '{@link #getMovingAverageLengthTemperature() <em>Moving Average Length Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMovingAverageLengthTemperature()
     * @generated
     * @ordered
     */
    protected static final int MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMovingAverageLengthTemperature() <em>Moving Average Length Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMovingAverageLengthTemperature()
     * @generated
     * @ordered
     */
    protected int movingAverageLengthTemperature = MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HumidityV2ConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.eINSTANCE.getHumidityV2Configuration();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStatusLEDConfig() {
        return statusLEDConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatusLEDConfig(int newStatusLEDConfig) {
        int oldStatusLEDConfig = statusLEDConfig;
        statusLEDConfig = newStatusLEDConfig;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__STATUS_LED_CONFIG, oldStatusLEDConfig, statusLEDConfig));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMovingAverageLengthHumidity() {
        return movingAverageLengthHumidity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMovingAverageLengthHumidity(int newMovingAverageLengthHumidity) {
        int oldMovingAverageLengthHumidity = movingAverageLengthHumidity;
        movingAverageLengthHumidity = newMovingAverageLengthHumidity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY, oldMovingAverageLengthHumidity, movingAverageLengthHumidity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMovingAverageLengthTemperature() {
        return movingAverageLengthTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMovingAverageLengthTemperature(int newMovingAverageLengthTemperature) {
        int oldMovingAverageLengthTemperature = movingAverageLengthTemperature;
        movingAverageLengthTemperature = newMovingAverageLengthTemperature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE, oldMovingAverageLengthTemperature, movingAverageLengthTemperature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__STATUS_LED_CONFIG:
                return getStatusLEDConfig();
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
                return getMovingAverageLengthHumidity();
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
                return getMovingAverageLengthTemperature();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__STATUS_LED_CONFIG:
                setStatusLEDConfig((Integer)newValue);
                return;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
                setMovingAverageLengthHumidity((Integer)newValue);
                return;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
                setMovingAverageLengthTemperature((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__STATUS_LED_CONFIG:
                setStatusLEDConfig(STATUS_LED_CONFIG_EDEFAULT);
                return;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
                setMovingAverageLengthHumidity(MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT);
                return;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
                setMovingAverageLengthTemperature(MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__STATUS_LED_CONFIG:
                return statusLEDConfig != STATUS_LED_CONFIG_EDEFAULT;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
                return movingAverageLengthHumidity != MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT;
            case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
                return movingAverageLengthTemperature != MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (statusLEDConfig: ");
        result.append(statusLEDConfig);
        result.append(", movingAverageLengthHumidity: ");
        result.append(movingAverageLengthHumidity);
        result.append(", movingAverageLengthTemperature: ");
        result.append(movingAverageLengthTemperature);
        result.append(')');
        return result.toString();
    }

} //HumidityV2ConfigurationImpl
