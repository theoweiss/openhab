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
import org.openhab.binding.tinkerforge.internal.model.BrickdConnectedCounter;
import org.openhab.binding.tinkerforge.internal.model.BrickdSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MBaseDevice;
import org.openhab.binding.tinkerforge.internal.model.MBrickd;
import org.openhab.binding.tinkerforge.internal.model.MSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.openhab.binding.tinkerforge.internal.tools.ChangedPropertyListener;
import org.openhab.binding.tinkerforge.internal.types.DecimalValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brickd Connected Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getSensorValue <em>Sensor Value</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getMbrick <em>Mbrick</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getBrickd <em>Brickd</em>}</li>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickdConnectedCounterImpl#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickdConnectedCounterImpl extends MinimalEObjectImpl.Container implements BrickdConnectedCounter
{
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
   * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
  protected static final String DEVICE_TYPE_EDEFAULT = "brickd_connected_counter";

  /**
   * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
  protected String deviceType = DEVICE_TYPE_EDEFAULT;

  private ConnectedCounterListener listener;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BrickdConnectedCounterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.BRICKD_CONNECTED_COUNTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalValue getSensorValue()
  {
    return sensorValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorValue(DecimalValue newSensorValue)
  {
    DecimalValue oldSensorValue = sensorValue;
    sensorValue = newSensorValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__SENSOR_VALUE, oldSensorValue, sensorValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logger getLogger()
  {
    return logger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogger(Logger newLogger)
  {
    Logger oldLogger = logger;
    logger = newLogger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER, oldLogger, logger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUid()
  {
    return uid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUid(String newUid)
  {
    String oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__UID, oldUid, uid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoll()
  {
    return poll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoll(boolean newPoll)
  {
    boolean oldPoll = poll;
    poll = newPoll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__POLL, oldPoll, poll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicBoolean getEnabledA()
  {
    return enabledA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabledA(AtomicBoolean newEnabledA)
  {
    AtomicBoolean oldEnabledA = enabledA;
    enabledA = newEnabledA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A, oldEnabledA, enabledA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubId()
  {
    return subId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubId(String newSubId)
  {
    String oldSubId = subId;
    subId = newSubId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID, oldSubId, subId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBrickd getMbrick()
  {
    if (eContainerFeatureID() != ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK) return null;
    return (MBrickd)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMbrick(MBrickd newMbrick, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMbrick, ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMbrick(MBrickd newMbrick)
  {
    if (newMbrick != eInternalContainer() || (eContainerFeatureID() != ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK && newMbrick != null))
    {
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK, newMbrick, newMbrick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBrickd getBrickd()
  {
    if (eContainerFeatureID() != ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD) return null;
    return (MBrickd)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBrickd(MBrickd newBrickd, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBrickd, ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrickd(MBrickd newBrickd)
  {
    if (newBrickd != eInternalContainer() || (eContainerFeatureID() != ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD && newBrickd != null))
    {
      if (EcoreUtil.isAncestor(this, newBrickd))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBrickd != null)
        msgs = ((InternalEObject)newBrickd).eInverseAdd(this, ModelPackage.MBRICKD__BRICKD_SUBDEVICES, MBrickd.class, msgs);
      msgs = basicSetBrickd(newBrickd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD, newBrickd, newBrickd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeviceType()
  {
    return deviceType;
  }

  private class ConnectedCounterListener implements ChangedPropertyListener<Short> {

    @Override
    public void changed(Short oldValue, Short newValue) {
      logger.debug("updated to: " + newValue);
      setSensorValue(new DecimalValue(newValue));
    }

  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void init()
  {
    setEnabledA(new AtomicBoolean());
    logger = LoggerFactory.getLogger(BrickdConnectedCounterImpl.class);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void enable()
  {
    listener = new ConnectedCounterListener();
    getBrickd().addConnectedCountListener(listener);
    fetchSensorValue();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void disable()
  {
    if (listener != null) {
      getBrickd().removeConnectedCountListener(listener);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public void fetchSensorValue()
  {
    getSensorValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMbrick((MBrickd)otherEnd, msgs);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBrickd((MBrickd)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        return basicSetMbrick(null, msgs);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        return basicSetBrickd(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        return eInternalContainer().eInverseRemove(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES, MSubDeviceHolder.class, msgs);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        return eInternalContainer().eInverseRemove(this, ModelPackage.MBRICKD__BRICKD_SUBDEVICES, MBrickd.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SENSOR_VALUE:
        return getSensorValue();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER:
        return getLogger();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__UID:
        return getUid();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__POLL:
        return isPoll();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A:
        return getEnabledA();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID:
        return getSubId();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        return getMbrick();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        return getBrickd();
      case ModelPackage.BRICKD_CONNECTED_COUNTER__DEVICE_TYPE:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SENSOR_VALUE:
        setSensorValue((DecimalValue)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER:
        setLogger((Logger)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__UID:
        setUid((String)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__POLL:
        setPoll((Boolean)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A:
        setEnabledA((AtomicBoolean)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID:
        setSubId((String)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        setMbrick((MBrickd)newValue);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        setBrickd((MBrickd)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SENSOR_VALUE:
        setSensorValue((DecimalValue)null);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER:
        setLogger(LOGGER_EDEFAULT);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__UID:
        setUid(UID_EDEFAULT);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__POLL:
        setPoll(POLL_EDEFAULT);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A:
        setEnabledA(ENABLED_A_EDEFAULT);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID:
        setSubId(SUB_ID_EDEFAULT);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        setMbrick((MBrickd)null);
        return;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        setBrickd((MBrickd)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SENSOR_VALUE:
        return sensorValue != null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER:
        return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__POLL:
        return poll != POLL_EDEFAULT;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A:
        return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID:
        return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
      case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK:
        return getMbrick() != null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD:
        return getBrickd() != null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER__DEVICE_TYPE:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == MBaseDevice.class)
    {
      switch (derivedFeatureID)
      {
        case ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER: return ModelPackage.MBASE_DEVICE__LOGGER;
        case ModelPackage.BRICKD_CONNECTED_COUNTER__UID: return ModelPackage.MBASE_DEVICE__UID;
        case ModelPackage.BRICKD_CONNECTED_COUNTER__POLL: return ModelPackage.MBASE_DEVICE__POLL;
        case ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A: return ModelPackage.MBASE_DEVICE__ENABLED_A;
        default: return -1;
      }
    }
    if (baseClass == MSubDevice.class)
    {
      switch (derivedFeatureID)
      {
        case ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID: return ModelPackage.MSUB_DEVICE__SUB_ID;
        case ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK: return ModelPackage.MSUB_DEVICE__MBRICK;
        default: return -1;
      }
    }
    if (baseClass == BrickdSubDevice.class)
    {
      switch (derivedFeatureID)
      {
        case ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD: return ModelPackage.BRICKD_SUB_DEVICE__BRICKD;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == MBaseDevice.class)
    {
      switch (baseFeatureID)
      {
        case ModelPackage.MBASE_DEVICE__LOGGER: return ModelPackage.BRICKD_CONNECTED_COUNTER__LOGGER;
        case ModelPackage.MBASE_DEVICE__UID: return ModelPackage.BRICKD_CONNECTED_COUNTER__UID;
        case ModelPackage.MBASE_DEVICE__POLL: return ModelPackage.BRICKD_CONNECTED_COUNTER__POLL;
        case ModelPackage.MBASE_DEVICE__ENABLED_A: return ModelPackage.BRICKD_CONNECTED_COUNTER__ENABLED_A;
        default: return -1;
      }
    }
    if (baseClass == MSubDevice.class)
    {
      switch (baseFeatureID)
      {
        case ModelPackage.MSUB_DEVICE__SUB_ID: return ModelPackage.BRICKD_CONNECTED_COUNTER__SUB_ID;
        case ModelPackage.MSUB_DEVICE__MBRICK: return ModelPackage.BRICKD_CONNECTED_COUNTER__MBRICK;
        default: return -1;
      }
    }
    if (baseClass == BrickdSubDevice.class)
    {
      switch (baseFeatureID)
      {
        case ModelPackage.BRICKD_SUB_DEVICE__BRICKD: return ModelPackage.BRICKD_CONNECTED_COUNTER__BRICKD;
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
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
    if (baseClass == MBaseDevice.class)
    {
      switch (baseOperationID)
      {
        case ModelPackage.MBASE_DEVICE___INIT: return ModelPackage.BRICKD_CONNECTED_COUNTER___INIT;
        case ModelPackage.MBASE_DEVICE___ENABLE: return ModelPackage.BRICKD_CONNECTED_COUNTER___ENABLE;
        case ModelPackage.MBASE_DEVICE___DISABLE: return ModelPackage.BRICKD_CONNECTED_COUNTER___DISABLE;
        default: return -1;
      }
    }
    if (baseClass == MSubDevice.class)
    {
      switch (baseOperationID)
      {
        default: return -1;
      }
    }
    if (baseClass == BrickdSubDevice.class)
    {
      switch (baseOperationID)
      {
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ModelPackage.BRICKD_CONNECTED_COUNTER___INIT:
        init();
        return null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER___ENABLE:
        enable();
        return null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER___DISABLE:
        disable();
        return null;
      case ModelPackage.BRICKD_CONNECTED_COUNTER___FETCH_SENSOR_VALUE:
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
  public String toString()
  {
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
    result.append(", deviceType: ");
    result.append(deviceType);
    result.append(')');
    return result.toString();
  }

} //BrickdConnectedCounterImpl
