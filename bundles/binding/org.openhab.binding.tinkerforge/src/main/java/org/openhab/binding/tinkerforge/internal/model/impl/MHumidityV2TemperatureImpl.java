/**
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.openhab.binding.tinkerforge.internal.model.CallbackListener;
import org.openhab.binding.tinkerforge.internal.model.MBaseDevice;
import org.openhab.binding.tinkerforge.internal.model.MBrickletHumidityV2;
import org.openhab.binding.tinkerforge.internal.model.MHumidityV2Temperature;
import org.openhab.binding.tinkerforge.internal.model.MSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;

import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

import org.slf4j.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MHumidity V2 Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getSensorValue <em>Sensor Value</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getMbrick <em>Mbrick</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getCallbackPeriod <em>Callback Period</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.MHumidityV2TemperatureImpl#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MHumidityV2TemperatureImpl extends MinimalEObjectImpl.Container implements MHumidityV2Temperature {
    /**
     * The cached value of the '{@link #getSensorValue() <em>Sensor Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorValue()
     * @generated
     * @ordered
     */
    protected DecimalValue sensorValue;

    /**
     * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected static final Logger LOGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected Logger logger = LOGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected static final String UID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected String uid = UID_EDEFAULT;

    /**
     * The default value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected static final boolean POLL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected boolean poll = POLL_EDEFAULT;

    /**
     * The default value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected static final AtomicBoolean ENABLED_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected AtomicBoolean enabledA = ENABLED_A_EDEFAULT;

    /**
     * The default value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected static final String SUB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected String subId = SUB_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getCallbackPeriod() <em>Callback Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallbackPeriod()
     * @generated
     * @ordered
     */
    protected static final long CALLBACK_PERIOD_EDEFAULT = 1000L;

    /**
     * The cached value of the '{@link #getCallbackPeriod() <em>Callback Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallbackPeriod()
     * @generated
     * @ordered
     */
    protected long callbackPeriod = CALLBACK_PERIOD_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected static final String DEVICE_TYPE_EDEFAULT = "humidityV2_temperature";

    /**
     * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected String deviceType = DEVICE_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MHumidityV2TemperatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.eINSTANCE.getMHumidityV2Temperature();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalValue getSensorValue() {
        return sensorValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSensorValue(DecimalValue newSensorValue) {
        DecimalValue oldSensorValue = sensorValue;
        sensorValue = newSensorValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__SENSOR_VALUE, oldSensorValue, sensorValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogger(Logger newLogger) {
        Logger oldLogger = logger;
        logger = newLogger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER, oldLogger, logger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUid(String newUid) {
        String oldUid = uid;
        uid = newUid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID, oldUid, uid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPoll() {
        return poll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPoll(boolean newPoll) {
        boolean oldPoll = poll;
        poll = newPoll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL, oldPoll, poll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtomicBoolean getEnabledA() {
        return enabledA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabledA(AtomicBoolean newEnabledA) {
        AtomicBoolean oldEnabledA = enabledA;
        enabledA = newEnabledA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A, oldEnabledA, enabledA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubId() {
        return subId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubId(String newSubId) {
        String oldSubId = subId;
        subId = newSubId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID, oldSubId, subId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MBrickletHumidityV2 getMbrick() {
        if (eContainerFeatureID() != ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK) return null;
        return (MBrickletHumidityV2)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MBrickletHumidityV2 basicGetMbrick() {
        if (eContainerFeatureID() != ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK) return null;
        return (MBrickletHumidityV2)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMbrick(MBrickletHumidityV2 newMbrick, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newMbrick, ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMbrick(MBrickletHumidityV2 newMbrick) {
        if (newMbrick != eInternalContainer() || (eContainerFeatureID() != ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK && newMbrick != null)) {
            if (EcoreUtil.isAncestor(this, newMbrick))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMbrick != null)
                msgs = ((InternalEObject)newMbrick).eInverseAdd(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES, MSubDeviceHolder.class, msgs);
            msgs = basicSetMbrick(newMbrick, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK, newMbrick, newMbrick));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getCallbackPeriod() {
        return callbackPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallbackPeriod(long newCallbackPeriod) {
        long oldCallbackPeriod = callbackPeriod;
        callbackPeriod = newCallbackPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD, oldCallbackPeriod, callbackPeriod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void init() {
        
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void enable() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void disable() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fetchSensorValue() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMbrick((MBrickletHumidityV2)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                return basicSetMbrick(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                return eInternalContainer().eInverseRemove(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES, MSubDeviceHolder.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SENSOR_VALUE:
                return getSensorValue();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER:
                return getLogger();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID:
                return getUid();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL:
                return isPoll();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A:
                return getEnabledA();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID:
                return getSubId();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                if (resolve) return getMbrick();
                return basicGetMbrick();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD:
                return getCallbackPeriod();
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__DEVICE_TYPE:
                return getDeviceType();
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
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SENSOR_VALUE:
                setSensorValue((DecimalValue)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER:
                setLogger((Logger)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID:
                setUid((String)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL:
                setPoll((Boolean)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A:
                setEnabledA((AtomicBoolean)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID:
                setSubId((String)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                setMbrick((MBrickletHumidityV2)newValue);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD:
                setCallbackPeriod((Long)newValue);
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
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SENSOR_VALUE:
                setSensorValue((DecimalValue)null);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER:
                setLogger(LOGGER_EDEFAULT);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID:
                setUid(UID_EDEFAULT);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL:
                setPoll(POLL_EDEFAULT);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A:
                setEnabledA(ENABLED_A_EDEFAULT);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID:
                setSubId(SUB_ID_EDEFAULT);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                setMbrick((MBrickletHumidityV2)null);
                return;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD:
                setCallbackPeriod(CALLBACK_PERIOD_EDEFAULT);
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
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SENSOR_VALUE:
                return sensorValue != null;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER:
                return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID:
                return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL:
                return poll != POLL_EDEFAULT;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A:
                return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID:
                return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK:
                return basicGetMbrick() != null;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD:
                return callbackPeriod != CALLBACK_PERIOD_EDEFAULT;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE__DEVICE_TYPE:
                return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER: return ModelPackage.MBASE_DEVICE__LOGGER;
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID: return ModelPackage.MBASE_DEVICE__UID;
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL: return ModelPackage.MBASE_DEVICE__POLL;
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A: return ModelPackage.MBASE_DEVICE__ENABLED_A;
                default: return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID: return ModelPackage.MSUB_DEVICE__SUB_ID;
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK: return ModelPackage.MSUB_DEVICE__MBRICK;
                default: return -1;
            }
        }
        if (baseClass == CallbackListener.class) {
            switch (derivedFeatureID) {
                case ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD: return ModelPackage.CALLBACK_LISTENER__CALLBACK_PERIOD;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (baseFeatureID) {
                case ModelPackage.MBASE_DEVICE__LOGGER: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__LOGGER;
                case ModelPackage.MBASE_DEVICE__UID: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__UID;
                case ModelPackage.MBASE_DEVICE__POLL: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__POLL;
                case ModelPackage.MBASE_DEVICE__ENABLED_A: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__ENABLED_A;
                default: return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (baseFeatureID) {
                case ModelPackage.MSUB_DEVICE__SUB_ID: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__SUB_ID;
                case ModelPackage.MSUB_DEVICE__MBRICK: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__MBRICK;
                default: return -1;
            }
        }
        if (baseClass == CallbackListener.class) {
            switch (baseFeatureID) {
                case ModelPackage.CALLBACK_LISTENER__CALLBACK_PERIOD: return ModelPackage.MHUMIDITY_V2_TEMPERATURE__CALLBACK_PERIOD;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == MBaseDevice.class) {
            switch (baseOperationID) {
                case ModelPackage.MBASE_DEVICE___INIT: return ModelPackage.MHUMIDITY_V2_TEMPERATURE___INIT;
                case ModelPackage.MBASE_DEVICE___ENABLE: return ModelPackage.MHUMIDITY_V2_TEMPERATURE___ENABLE;
                case ModelPackage.MBASE_DEVICE___DISABLE: return ModelPackage.MHUMIDITY_V2_TEMPERATURE___DISABLE;
                default: return -1;
            }
        }
        if (baseClass == MSubDevice.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == CallbackListener.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE___INIT:
                init();
                return null;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE___ENABLE:
                enable();
                return null;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE___DISABLE:
                disable();
                return null;
            case ModelPackage.MHUMIDITY_V2_TEMPERATURE___FETCH_SENSOR_VALUE:
                fetchSensorValue();
                return null;
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (sensorValue: ");
        result.append(sensorValue);
        result.append(", logger: ");
        result.append(logger);
        result.append(", uid: ");
        result.append(uid);
        result.append(", poll: ");
        result.append(poll);
        result.append(", enabledA: ");
        result.append(enabledA);
        result.append(", subId: ");
        result.append(subId);
        result.append(", callbackPeriod: ");
        result.append(callbackPeriod);
        result.append(", deviceType: ");
        result.append(deviceType);
        result.append(')');
        return result.toString();
    }

} //MHumidityV2TemperatureImpl
