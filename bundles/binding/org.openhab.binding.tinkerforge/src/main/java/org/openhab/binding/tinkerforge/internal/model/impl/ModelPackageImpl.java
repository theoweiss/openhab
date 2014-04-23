/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs;
import org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration;
import org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration;
import org.openhab.binding.tinkerforge.internal.model.CallbackListener;
import org.openhab.binding.tinkerforge.internal.model.DCDriveMode;
import org.openhab.binding.tinkerforge.internal.model.DigitalActor;
import org.openhab.binding.tinkerforge.internal.model.DigitalSensor;
import org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds;
import org.openhab.binding.tinkerforge.internal.model.Ecosystem;
import org.openhab.binding.tinkerforge.internal.model.Electrode;
import org.openhab.binding.tinkerforge.internal.model.GenericDevice;
import org.openhab.binding.tinkerforge.internal.model.IO16SubIds;
import org.openhab.binding.tinkerforge.internal.model.IODevice;
import org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs;
import org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs;
import org.openhab.binding.tinkerforge.internal.model.InterruptListener;
import org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds;
import org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds;
import org.openhab.binding.tinkerforge.internal.model.MActor;
import org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature;
import org.openhab.binding.tinkerforge.internal.model.MBaseDevice;
import org.openhab.binding.tinkerforge.internal.model.MBrickDC;
import org.openhab.binding.tinkerforge.internal.model.MBrickServo;
import org.openhab.binding.tinkerforge.internal.model.MBrickd;
import org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight;
import org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer;
import org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR;
import org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity;
import org.openhab.binding.tinkerforge.internal.model.MBrickletIO16;
import org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalIn4;
import org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4;
import org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector;
import org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch;
import org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch;
import org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature;
import org.openhab.binding.tinkerforge.internal.model.MDevice;
import org.openhab.binding.tinkerforge.internal.model.MDualRelay;
import org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet;
import org.openhab.binding.tinkerforge.internal.model.MInSwitchActor;
import org.openhab.binding.tinkerforge.internal.model.MIndustrialDigitalIn;
import org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay;
import org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet;
import org.openhab.binding.tinkerforge.internal.model.MLCD20x4Backlight;
import org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button;
import org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MOutSwitchActor;
import org.openhab.binding.tinkerforge.internal.model.MSensor;
import org.openhab.binding.tinkerforge.internal.model.MServo;
import org.openhab.binding.tinkerforge.internal.model.MSubDevice;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.MSwitchActor;
import org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer;
import org.openhab.binding.tinkerforge.internal.model.MTextActor;
import org.openhab.binding.tinkerforge.internal.model.ModelFactory;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice;
import org.openhab.binding.tinkerforge.internal.model.MultiTouchDeviceConfiguration;
import org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds;
import org.openhab.binding.tinkerforge.internal.model.NoSubIds;
import org.openhab.binding.tinkerforge.internal.model.OHConfig;
import org.openhab.binding.tinkerforge.internal.model.OHTFDevice;
import org.openhab.binding.tinkerforge.internal.model.OHTFSubDeviceAdminDevice;
import org.openhab.binding.tinkerforge.internal.model.Proximity;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitch;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC;
import org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration;
import org.openhab.binding.tinkerforge.internal.model.ServoSubIDs;
import org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin;
import org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFConfig;
import org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFIOSensorConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFInterruptListenerConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFNullConfiguration;
import org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration;
import org.openhab.binding.tinkerforge.internal.types.DecimalValue;
import org.openhab.binding.tinkerforge.internal.types.HighLowValue;
import org.openhab.binding.tinkerforge.internal.types.OnOffValue;
import org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue;
import org.slf4j.Logger;

import com.tinkerforge.BrickDC;
import com.tinkerforge.BrickServo;
import com.tinkerforge.BrickletAmbientLight;
import com.tinkerforge.BrickletBarometer;
import com.tinkerforge.BrickletDistanceIR;
import com.tinkerforge.BrickletDualRelay;
import com.tinkerforge.BrickletHumidity;
import com.tinkerforge.BrickletIO16;
import com.tinkerforge.BrickletIndustrialDigitalIn4;
import com.tinkerforge.BrickletIndustrialQuadRelay;
import com.tinkerforge.BrickletLCD20x4;
import com.tinkerforge.BrickletMotionDetector;
import com.tinkerforge.BrickletMultiTouch;
import com.tinkerforge.BrickletRemoteSwitch;
import com.tinkerforge.BrickletTemperature;
import com.tinkerforge.Device;
import com.tinkerforge.IPConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "model.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ohtfDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ohtfSubDeviceAdminDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ohConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecosystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subDeviceAdminEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mtfConfigConsumerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBaseDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mSubDeviceHolderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickServoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfBrickDCConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickDCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mDualRelayBrickletEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mIndustrialQuadRelayBrickletEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mIndustrialQuadRelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletIndustrialDigitalIn4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mIndustrialDigitalInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mSwitchActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mOutSwitchActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mInSwitchActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfioActorConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitalActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfInterruptListenerConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletIO16EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ioDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfioSensorConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digitalSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletMultiTouchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiTouchDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass electrodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass proximityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletMotionDetectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mSubDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mDualRelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletRemoteSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchBEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfNullConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfServoConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brickletRemoteSwitchConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchAConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchBConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteSwitchCConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiTouchDeviceConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brickletMultiTouchConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mServoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackListenerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interruptListenerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletHumidityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletDistanceIREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletTemperatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletTemperatureIREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mTemperatureIRDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectTemperatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ambientTemperatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfBaseConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tfObjectTemperatureConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletBarometerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBarometerTemperatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletAmbientLightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBrickletLCD20x4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mTextActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mlcdSubDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mlcd20x4BacklightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mlcd20x4ButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dcDriveModeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum noSubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum industrialDigitalInSubIDsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum industrialQuadRelayIDsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum servoSubIDsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum barometerSubIDsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum io16SubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dualRelaySubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lcdButtonSubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lcdBacklightSubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiTouchSubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum temperatureIRSubIdsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mipConnectionEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerDeviceEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mLoggerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mAtomicBooleanEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerforgeDeviceEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickDCEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickServoEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerforgeValueEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mDecimalValueEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletHumidityEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletDistanceIREDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletTemperatureEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletBarometerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletAmbientLightEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletLCD20x4EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType tinkerBrickletRemoteSwitchEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType tinkerBrickletMotionDetectorEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType tinkerBrickletMultiTouchEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType tinkerBrickletTemperatureIREDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType enumEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletDualRelayEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletIndustrialQuadRelayEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mTinkerBrickletIndustrialDigitalIn4EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType switchStateEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType digitalValueEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType tinkerBrickletIO16EDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModelPackageImpl()
  {
    super(eNS_URI, ModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static ModelPackage init()
  {
    if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

    // Obtain or create and register package
    ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Load packages
    theModelPackage.loadPackage();

    // Fix loaded packages
    theModelPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
    return theModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFConfig()
  {
    if (tfConfigEClass == null)
    {
      tfConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(81);
    }
    return tfConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOHTFDevice()
  {
    if (ohtfDeviceEClass == null)
    {
      ohtfDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(82);
    }
    return ohtfDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOHTFDevice_Uid()
  {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOHTFDevice_Subid()
  {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOHTFDevice_Ohid()
  {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOHTFDevice_SubDeviceIds()
  {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOHTFDevice_TfConfig()
  {
        return (EReference)getOHTFDevice().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOHTFDevice_OhConfig()
  {
        return (EReference)getOHTFDevice().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getOHTFDevice__IsValidSubId__String()
  {
        return getOHTFDevice().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOHTFSubDeviceAdminDevice()
  {
    if (ohtfSubDeviceAdminDeviceEClass == null)
    {
      ohtfSubDeviceAdminDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(83);
    }
    return ohtfSubDeviceAdminDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getOHTFSubDeviceAdminDevice__IsValidSubId__String()
  {
        return getOHTFSubDeviceAdminDevice().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOHConfig()
  {
    if (ohConfigEClass == null)
    {
      ohConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(84);
    }
    return ohConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOHConfig_OhTfDevices()
  {
        return (EReference)getOHConfig().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getOHConfig__GetConfigByTFId__String_String()
  {
        return getOHConfig().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getOHConfig__GetConfigByOHId__String()
  {
        return getOHConfig().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEcosystem()
  {
    if (ecosystemEClass == null)
    {
      ecosystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(26);
    }
    return ecosystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEcosystem_Logger()
  {
        return (EAttribute)getEcosystem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEcosystem_Mbrickds()
  {
        return (EReference)getEcosystem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getEcosystem__GetBrickd__String_int()
  {
        return getEcosystem().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getEcosystem__GetDevice__String_String()
  {
        return getEcosystem().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getEcosystem__GetDevices4GenericId__String_String()
  {
        return getEcosystem().getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getEcosystem__Disconnect()
  {
        return getEcosystem().getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickd()
  {
    if (mBrickdEClass == null)
    {
      mBrickdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(27);
    }
    return mBrickdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_Logger()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_IpConnection()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_Host()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_Port()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_IsConnected()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_AutoReconnect()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_Reconnected()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickd_Timeout()
  {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBrickd_Mdevices()
  {
        return (EReference)getMBrickd().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBrickd_Ecosystem()
  {
        return (EReference)getMBrickd().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickd__Connect()
  {
        return getMBrickd().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickd__Disconnect()
  {
        return getMBrickd().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickd__Init()
  {
        return getMBrickd().getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickd__GetDevice__String()
  {
        return getMBrickd().getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubDeviceAdmin()
  {
    if (subDeviceAdminEClass == null)
    {
      subDeviceAdminEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(28);
    }
    return subDeviceAdminEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSubDeviceAdmin__AddSubDevice__String_String()
  {
        return getSubDeviceAdmin().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMTFConfigConsumer()
  {
    if (mtfConfigConsumerEClass == null)
    {
      mtfConfigConsumerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(29);
    }
    return mtfConfigConsumerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMTFConfigConsumer_TfConfig()
  {
        return (EReference)getMTFConfigConsumer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBaseDevice()
  {
    if (mBaseDeviceEClass == null)
    {
      mBaseDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(30);
    }
    return mBaseDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBaseDevice_Logger()
  {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBaseDevice_Uid()
  {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBaseDevice_EnabledA()
  {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBaseDevice__Init()
  {
        return getMBaseDevice().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBaseDevice__Enable()
  {
        return getMBaseDevice().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBaseDevice__Disable()
  {
        return getMBaseDevice().getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDevice()
  {
    if (mDeviceEClass == null)
    {
      mDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(31);
    }
    return mDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_TinkerforgeDevice()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_IpConnection()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_ConnectedUid()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_Position()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_DeviceIdentifier()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDevice_Name()
  {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMDevice_Brickd()
  {
        return (EReference)getMDevice().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMSubDeviceHolder()
  {
    if (mSubDeviceHolderEClass == null)
    {
      mSubDeviceHolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(32);
    }
    return mSubDeviceHolderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSubDeviceHolder_Msubdevices()
  {
        return (EReference)getMSubDeviceHolder().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMSubDeviceHolder__InitSubDevices()
  {
        return getMSubDeviceHolder().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickServo()
  {
    if (mBrickServoEClass == null)
    {
      mBrickServoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(45);
    }
    return mBrickServoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickServo_DeviceType()
  {
        return (EAttribute)getMBrickServo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickServo__Init()
  {
        return getMBrickServo().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFBrickDCConfiguration()
  {
    if (tfBrickDCConfigurationEClass == null)
    {
      tfBrickDCConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(88);
    }
    return tfBrickDCConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBrickDCConfiguration_Velocity()
  {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBrickDCConfiguration_Acceleration()
  {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBrickDCConfiguration_PwmFrequency()
  {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBrickDCConfiguration_DriveMode()
  {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBrickDCConfiguration_SwitchOnVelocity()
  {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickDC()
  {
    if (mBrickDCEClass == null)
    {
      mBrickDCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(48);
    }
    return mBrickDCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_DeviceType()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_Velocity()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_CurrentVelocity()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_Acceleration()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_PwmFrequency()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_DriveMode()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickDC_SwitchOnVelocity()
  {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickDC__Init()
  {
        return getMBrickDC().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDualRelayBricklet()
  {
    if (mDualRelayBrickletEClass == null)
    {
      mDualRelayBrickletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(49);
    }
    return mDualRelayBrickletEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDualRelayBricklet_DeviceType()
  {
        return (EAttribute)getMDualRelayBricklet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMIndustrialQuadRelayBricklet()
  {
    if (mIndustrialQuadRelayBrickletEClass == null)
    {
      mIndustrialQuadRelayBrickletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(50);
    }
    return mIndustrialQuadRelayBrickletEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMIndustrialQuadRelay()
  {
    if (mIndustrialQuadRelayEClass == null)
    {
      mIndustrialQuadRelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(51);
    }
    return mIndustrialQuadRelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMIndustrialQuadRelay_DeviceType()
  {
        return (EAttribute)getMIndustrialQuadRelay().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletIndustrialDigitalIn4()
  {
    if (mBrickletIndustrialDigitalIn4EClass == null)
    {
      mBrickletIndustrialDigitalIn4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(52);
    }
    return mBrickletIndustrialDigitalIn4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletIndustrialDigitalIn4_DeviceType()
  {
        return (EAttribute)getMBrickletIndustrialDigitalIn4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMIndustrialDigitalIn()
  {
    if (mIndustrialDigitalInEClass == null)
    {
      mIndustrialDigitalInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(53);
    }
    return mIndustrialDigitalInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMActor()
  {
    if (mActorEClass == null)
    {
      mActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(33);
    }
    return mActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMSwitchActor()
  {
    if (mSwitchActorEClass == null)
    {
      mSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(34);
    }
    return mSwitchActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMSwitchActor_SwitchState()
  {
        return (EAttribute)getMSwitchActor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMSwitchActor__TurnSwitch__OnOffValue()
  {
        return getMSwitchActor().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMSwitchActor__FetchSwitchState()
  {
        return getMSwitchActor().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOutSwitchActor()
  {
    if (mOutSwitchActorEClass == null)
    {
      mOutSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(35);
    }
    return mOutSwitchActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMInSwitchActor()
  {
    if (mInSwitchActorEClass == null)
    {
      mInSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(36);
    }
    return mInSwitchActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericDevice()
  {
    if (genericDeviceEClass == null)
    {
      genericDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(37);
    }
    return genericDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericDevice_GenericDeviceId()
  {
        return (EAttribute)getGenericDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFIOActorConfiguration()
  {
    if (tfioActorConfigurationEClass == null)
    {
      tfioActorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(89);
    }
    return tfioActorConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFIOActorConfiguration_DefaultState()
  {
        return (EAttribute)getTFIOActorConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFIOActorConfiguration_KeepOnReconnect()
  {
        return (EAttribute)getTFIOActorConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitalActor()
  {
    if (digitalActorEClass == null)
    {
      digitalActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(54);
    }
    return digitalActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_DeviceType()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_DigitalState()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_Port()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_Pin()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_DefaultState()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalActor_KeepOnReconnect()
  {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDigitalActor__TurnDigital__HighLowValue()
  {
        return getDigitalActor().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDigitalActor__FetchDigitalValue()
  {
        return getDigitalActor().getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFInterruptListenerConfiguration()
  {
    if (tfInterruptListenerConfigurationEClass == null)
    {
      tfInterruptListenerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(90);
    }
    return tfInterruptListenerConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFInterruptListenerConfiguration_DebouncePeriod()
  {
        return (EAttribute)getTFInterruptListenerConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletIO16()
  {
    if (mBrickletIO16EClass == null)
    {
      mBrickletIO16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(55);
    }
    return mBrickletIO16EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletIO16_DeviceType()
  {
        return (EAttribute)getMBrickletIO16().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIODevice()
  {
    if (ioDeviceEClass == null)
    {
      ioDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(38);
    }
    return ioDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFIOSensorConfiguration()
  {
    if (tfioSensorConfigurationEClass == null)
    {
      tfioSensorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(91);
    }
    return tfioSensorConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFIOSensorConfiguration_PullUpResistorEnabled()
  {
        return (EAttribute)getTFIOSensorConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDigitalSensor()
  {
    if (digitalSensorEClass == null)
    {
      digitalSensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(56);
    }
    return digitalSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalSensor_DeviceType()
  {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalSensor_PullUpResistorEnabled()
  {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalSensor_Port()
  {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDigitalSensor_Pin()
  {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletMultiTouch()
  {
    if (mBrickletMultiTouchEClass == null)
    {
      mBrickletMultiTouchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(57);
    }
    return mBrickletMultiTouchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletMultiTouch_DeviceType()
  {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletMultiTouch_Recalibrate()
  {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletMultiTouch_Sensitivity()
  {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiTouchDevice()
  {
    if (multiTouchDeviceEClass == null)
    {
      multiTouchDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(58);
    }
    return multiTouchDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiTouchDevice_Pin()
  {
        return (EAttribute)getMultiTouchDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiTouchDevice_DisableElectrode()
  {
        return (EAttribute)getMultiTouchDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElectrode()
  {
    if (electrodeEClass == null)
    {
      electrodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(59);
    }
    return electrodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElectrode_DeviceType()
  {
        return (EAttribute)getElectrode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProximity()
  {
    if (proximityEClass == null)
    {
      proximityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(60);
    }
    return proximityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProximity_DeviceType()
  {
        return (EAttribute)getProximity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletMotionDetector()
  {
    if (mBrickletMotionDetectorEClass == null)
    {
      mBrickletMotionDetectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(61);
    }
    return mBrickletMotionDetectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletMotionDetector_DeviceType()
  {
        return (EAttribute)getMBrickletMotionDetector().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletMotionDetector__Init()
  {
        return getMBrickletMotionDetector().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMSubDevice()
  {
    if (mSubDeviceEClass == null)
    {
      mSubDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(39);
    }
    return mSubDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMSubDevice_SubId()
  {
        return (EAttribute)getMSubDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSubDevice_Mbrick()
  {
        return (EReference)getMSubDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMDualRelay()
  {
    if (mDualRelayEClass == null)
    {
      mDualRelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(62);
    }
    return mDualRelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMDualRelay_DeviceType()
  {
        return (EAttribute)getMDualRelay().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletRemoteSwitch()
  {
    if (mBrickletRemoteSwitchEClass == null)
    {
      mBrickletRemoteSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(63);
    }
    return mBrickletRemoteSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletRemoteSwitch_DeviceType()
  {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletRemoteSwitch_TypeADevices()
  {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletRemoteSwitch_TypeBDevices()
  {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletRemoteSwitch_TypeCDevices()
  {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitch()
  {
    if (remoteSwitchEClass == null)
    {
      remoteSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(64);
    }
    return remoteSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchA()
  {
    if (remoteSwitchAEClass == null)
    {
      remoteSwitchAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(65);
    }
    return remoteSwitchAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchA_DeviceType()
  {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchA_HouseCode()
  {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchA_ReceiverCode()
  {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchA_Repeats()
  {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchB()
  {
    if (remoteSwitchBEClass == null)
    {
      remoteSwitchBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(66);
    }
    return remoteSwitchBEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchB_DeviceType()
  {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchB_Address()
  {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchB_Unit()
  {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchB_Repeats()
  {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchC()
  {
    if (remoteSwitchCEClass == null)
    {
      remoteSwitchCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(67);
    }
    return remoteSwitchCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchC_DeviceType()
  {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchC_SystemCode()
  {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchC_DeviceCode()
  {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchC_Repeats()
  {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFNullConfiguration()
  {
    if (tfNullConfigurationEClass == null)
    {
      tfNullConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(85);
    }
    return tfNullConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFServoConfiguration()
  {
    if (tfServoConfigurationEClass == null)
    {
      tfServoConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(92);
    }
    return tfServoConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_Velocity()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_Acceleration()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_ServoVoltage()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_PulseWidthMin()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_PulseWidthMax()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_Period()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFServoConfiguration_OutputVoltage()
  {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrickletRemoteSwitchConfiguration()
  {
    if (brickletRemoteSwitchConfigurationEClass == null)
    {
      brickletRemoteSwitchConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(93);
    }
    return brickletRemoteSwitchConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBrickletRemoteSwitchConfiguration_TypeADevices()
  {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBrickletRemoteSwitchConfiguration_TypeBDevices()
  {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBrickletRemoteSwitchConfiguration_TypeCDevices()
  {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchAConfiguration()
  {
    if (remoteSwitchAConfigurationEClass == null)
    {
      remoteSwitchAConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(94);
    }
    return remoteSwitchAConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchAConfiguration_HouseCode()
  {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchAConfiguration_ReceiverCode()
  {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchAConfiguration_Repeats()
  {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchBConfiguration()
  {
    if (remoteSwitchBConfigurationEClass == null)
    {
      remoteSwitchBConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(95);
    }
    return remoteSwitchBConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchBConfiguration_Address()
  {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchBConfiguration_Unit()
  {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchBConfiguration_Repeats()
  {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteSwitchCConfiguration()
  {
    if (remoteSwitchCConfigurationEClass == null)
    {
      remoteSwitchCConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(96);
    }
    return remoteSwitchCConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchCConfiguration_SystemCode()
  {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchCConfiguration_DeviceCode()
  {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteSwitchCConfiguration_Repeats()
  {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiTouchDeviceConfiguration()
  {
    if (multiTouchDeviceConfigurationEClass == null)
    {
      multiTouchDeviceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(97);
    }
    return multiTouchDeviceConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiTouchDeviceConfiguration_DisableElectrode()
  {
        return (EAttribute)getMultiTouchDeviceConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrickletMultiTouchConfiguration()
  {
    if (brickletMultiTouchConfigurationEClass == null)
    {
      brickletMultiTouchConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(98);
    }
    return brickletMultiTouchConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBrickletMultiTouchConfiguration_Recalibrate()
  {
        return (EAttribute)getBrickletMultiTouchConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBrickletMultiTouchConfiguration_Sensitivity()
  {
        return (EAttribute)getBrickletMultiTouchConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMServo()
  {
    if (mServoEClass == null)
    {
      mServoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(46);
    }
    return mServoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_DeviceType()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_Velocity()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_Acceleration()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_PulseWidthMin()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_PulseWidthMax()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_Period()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_OutputVoltage()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_ServoCurrentPosition()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMServo_ServoDestinationPosition()
  {
        return (EAttribute)getMServo().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMServo__Init()
  {
        return getMServo().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackListener()
  {
    if (callbackListenerEClass == null)
    {
      callbackListenerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(40);
    }
    return callbackListenerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallbackListener_CallbackPeriod()
  {
        return (EAttribute)getCallbackListener().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterruptListener()
  {
    if (interruptListenerEClass == null)
    {
      interruptListenerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(41);
    }
    return interruptListenerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterruptListener_DebouncePeriod()
  {
        return (EAttribute)getInterruptListener().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMSensor()
  {
    if (mSensorEClass == null)
    {
      mSensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(42);
    }
    return mSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMSensor_SensorValue()
  {
        return (EAttribute)getMSensor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMSensor__FetchSensorValue()
  {
        return getMSensor().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletHumidity()
  {
    if (mBrickletHumidityEClass == null)
    {
      mBrickletHumidityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(68);
    }
    return mBrickletHumidityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletHumidity_DeviceType()
  {
        return (EAttribute)getMBrickletHumidity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletHumidity_Humiditiy()
  {
        return (EAttribute)getMBrickletHumidity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletHumidity_Threshold()
  {
        return (EAttribute)getMBrickletHumidity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletHumidity__Init()
  {
        return getMBrickletHumidity().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletDistanceIR()
  {
    if (mBrickletDistanceIREClass == null)
    {
      mBrickletDistanceIREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(69);
    }
    return mBrickletDistanceIREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletDistanceIR_DeviceType()
  {
        return (EAttribute)getMBrickletDistanceIR().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletDistanceIR_Distance()
  {
        return (EAttribute)getMBrickletDistanceIR().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletDistanceIR_Threshold()
  {
        return (EAttribute)getMBrickletDistanceIR().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletDistanceIR__Init()
  {
        return getMBrickletDistanceIR().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletTemperature()
  {
    if (mBrickletTemperatureEClass == null)
    {
      mBrickletTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(70);
    }
    return mBrickletTemperatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletTemperature_DeviceType()
  {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletTemperature_Temperature()
  {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletTemperature_Threshold()
  {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletTemperature__Init()
  {
        return getMBrickletTemperature().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletTemperatureIR()
  {
    if (mBrickletTemperatureIREClass == null)
    {
      mBrickletTemperatureIREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(71);
    }
    return mBrickletTemperatureIREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletTemperatureIR_DeviceType()
  {
        return (EAttribute)getMBrickletTemperatureIR().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMTemperatureIRDevice()
  {
    if (mTemperatureIRDeviceEClass == null)
    {
      mTemperatureIRDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(72);
    }
    return mTemperatureIRDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMTemperatureIRDevice_Temperature()
  {
        return (EAttribute)getMTemperatureIRDevice().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMTemperatureIRDevice_Threshold()
  {
        return (EAttribute)getMTemperatureIRDevice().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMTemperatureIRDevice__Init()
  {
        return getMTemperatureIRDevice().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectTemperature()
  {
    if (objectTemperatureEClass == null)
    {
      objectTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(73);
    }
    return objectTemperatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectTemperature_DeviceType()
  {
        return (EAttribute)getObjectTemperature().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectTemperature_Emissivity()
  {
        return (EAttribute)getObjectTemperature().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAmbientTemperature()
  {
    if (ambientTemperatureEClass == null)
    {
      ambientTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(74);
    }
    return ambientTemperatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAmbientTemperature_DeviceType()
  {
        return (EAttribute)getAmbientTemperature().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFBaseConfiguration()
  {
    if (tfBaseConfigurationEClass == null)
    {
      tfBaseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(86);
    }
    return tfBaseConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBaseConfiguration_Threshold()
  {
        return (EAttribute)getTFBaseConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFBaseConfiguration_CallbackPeriod()
  {
        return (EAttribute)getTFBaseConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTFObjectTemperatureConfiguration()
  {
    if (tfObjectTemperatureConfigurationEClass == null)
    {
      tfObjectTemperatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(87);
    }
    return tfObjectTemperatureConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTFObjectTemperatureConfiguration_Emissivity()
  {
        return (EAttribute)getTFObjectTemperatureConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletBarometer()
  {
    if (mBrickletBarometerEClass == null)
    {
      mBrickletBarometerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(75);
    }
    return mBrickletBarometerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletBarometer_DeviceType()
  {
        return (EAttribute)getMBrickletBarometer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletBarometer_AirPressure()
  {
        return (EAttribute)getMBrickletBarometer().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletBarometer_Threshold()
  {
        return (EAttribute)getMBrickletBarometer().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletBarometer__Init()
  {
        return getMBrickletBarometer().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBarometerTemperature()
  {
    if (mBarometerTemperatureEClass == null)
    {
      mBarometerTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(76);
    }
    return mBarometerTemperatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBarometerTemperature_DeviceType()
  {
        return (EAttribute)getMBarometerTemperature().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBarometerTemperature_Temperature()
  {
        return (EAttribute)getMBarometerTemperature().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBarometerTemperature__Init()
  {
        return getMBarometerTemperature().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletAmbientLight()
  {
    if (mBrickletAmbientLightEClass == null)
    {
      mBrickletAmbientLightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(77);
    }
    return mBrickletAmbientLightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletAmbientLight_DeviceType()
  {
        return (EAttribute)getMBrickletAmbientLight().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletAmbientLight_Illuminance()
  {
        return (EAttribute)getMBrickletAmbientLight().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletAmbientLight_Threshold()
  {
        return (EAttribute)getMBrickletAmbientLight().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletAmbientLight__Init()
  {
        return getMBrickletAmbientLight().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBrickletLCD20x4()
  {
    if (mBrickletLCD20x4EClass == null)
    {
      mBrickletLCD20x4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(78);
    }
    return mBrickletLCD20x4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletLCD20x4_DeviceType()
  {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletLCD20x4_PositionPrefix()
  {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletLCD20x4_PositonSuffix()
  {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletLCD20x4_DisplayErrors()
  {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBrickletLCD20x4_ErrorPrefix()
  {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getMBrickletLCD20x4__Init()
  {
        return getMBrickletLCD20x4().getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMTextActor()
  {
    if (mTextActorEClass == null)
    {
      mTextActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(43);
    }
    return mTextActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMTextActor_Text()
  {
        return (EAttribute)getMTextActor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMLCDSubDevice()
  {
    if (mlcdSubDeviceEClass == null)
    {
      mlcdSubDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(44);
    }
    return mlcdSubDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMLCD20x4Backlight()
  {
    if (mlcd20x4BacklightEClass == null)
    {
      mlcd20x4BacklightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(79);
    }
    return mlcd20x4BacklightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMLCD20x4Backlight_DeviceType()
  {
        return (EAttribute)getMLCD20x4Backlight().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMLCD20x4Button()
  {
    if (mlcd20x4ButtonEClass == null)
    {
      mlcd20x4ButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(80);
    }
    return mlcd20x4ButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMLCD20x4Button_DeviceType()
  {
        return (EAttribute)getMLCD20x4Button().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMLCD20x4Button_ButtonNum()
  {
        return (EAttribute)getMLCD20x4Button().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMLCD20x4Button_CallbackPeriod()
  {
        return (EAttribute)getMLCD20x4Button().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSwitchState()
  {
    if (switchStateEDataType == null)
    {
      switchStateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(9);
    }
    return switchStateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDigitalValue()
  {
    if (digitalValueEDataType == null)
    {
      digitalValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(10);
    }
    return digitalValueEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTinkerBrickletIO16()
  {
    if (tinkerBrickletIO16EDataType == null)
    {
      tinkerBrickletIO16EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(11);
    }
    return tinkerBrickletIO16EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDCDriveMode()
  {
    if (dcDriveModeEEnum == null)
    {
      dcDriveModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(47);
    }
    return dcDriveModeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNoSubIds()
  {
    if (noSubIdsEEnum == null)
    {
      noSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(99);
    }
    return noSubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIndustrialDigitalInSubIDs()
  {
    if (industrialDigitalInSubIDsEEnum == null)
    {
      industrialDigitalInSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(100);
    }
    return industrialDigitalInSubIDsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIndustrialQuadRelayIDs()
  {
    if (industrialQuadRelayIDsEEnum == null)
    {
      industrialQuadRelayIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(101);
    }
    return industrialQuadRelayIDsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getServoSubIDs()
  {
    if (servoSubIDsEEnum == null)
    {
      servoSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(102);
    }
    return servoSubIDsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBarometerSubIDs()
  {
    if (barometerSubIDsEEnum == null)
    {
      barometerSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(103);
    }
    return barometerSubIDsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIO16SubIds()
  {
    if (io16SubIdsEEnum == null)
    {
      io16SubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(104);
    }
    return io16SubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDualRelaySubIds()
  {
    if (dualRelaySubIdsEEnum == null)
    {
      dualRelaySubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(105);
    }
    return dualRelaySubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLCDButtonSubIds()
  {
    if (lcdButtonSubIdsEEnum == null)
    {
      lcdButtonSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(106);
    }
    return lcdButtonSubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLCDBacklightSubIds()
  {
    if (lcdBacklightSubIdsEEnum == null)
    {
      lcdBacklightSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(107);
    }
    return lcdBacklightSubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiTouchSubIds()
  {
    if (multiTouchSubIdsEEnum == null)
    {
      multiTouchSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(108);
    }
    return multiTouchSubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTemperatureIRSubIds()
  {
    if (temperatureIRSubIdsEEnum == null)
    {
      temperatureIRSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(109);
    }
    return temperatureIRSubIdsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMIPConnection()
  {
    if (mipConnectionEDataType == null)
    {
      mipConnectionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(0);
    }
    return mipConnectionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerDevice()
  {
    if (mTinkerDeviceEDataType == null)
    {
      mTinkerDeviceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(1);
    }
    return mTinkerDeviceEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMLogger()
  {
    if (mLoggerEDataType == null)
    {
      mLoggerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(2);
    }
    return mLoggerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMAtomicBoolean()
  {
    if (mAtomicBooleanEDataType == null)
    {
      mAtomicBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(3);
    }
    return mAtomicBooleanEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerforgeDevice()
  {
    if (mTinkerforgeDeviceEDataType == null)
    {
      mTinkerforgeDeviceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(4);
    }
    return mTinkerforgeDeviceEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickDC()
  {
    if (mTinkerBrickDCEDataType == null)
    {
      mTinkerBrickDCEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(5);
    }
    return mTinkerBrickDCEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickServo()
  {
    if (mTinkerBrickServoEDataType == null)
    {
      mTinkerBrickServoEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(12);
    }
    return mTinkerBrickServoEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerforgeValue()
  {
    if (mTinkerforgeValueEDataType == null)
    {
      mTinkerforgeValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(13);
    }
    return mTinkerforgeValueEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMDecimalValue()
  {
    if (mDecimalValueEDataType == null)
    {
      mDecimalValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(14);
    }
    return mDecimalValueEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletHumidity()
  {
    if (mTinkerBrickletHumidityEDataType == null)
    {
      mTinkerBrickletHumidityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(15);
    }
    return mTinkerBrickletHumidityEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletDistanceIR()
  {
    if (mTinkerBrickletDistanceIREDataType == null)
    {
      mTinkerBrickletDistanceIREDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(16);
    }
    return mTinkerBrickletDistanceIREDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletTemperature()
  {
    if (mTinkerBrickletTemperatureEDataType == null)
    {
      mTinkerBrickletTemperatureEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(17);
    }
    return mTinkerBrickletTemperatureEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletBarometer()
  {
    if (mTinkerBrickletBarometerEDataType == null)
    {
      mTinkerBrickletBarometerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(18);
    }
    return mTinkerBrickletBarometerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletAmbientLight()
  {
    if (mTinkerBrickletAmbientLightEDataType == null)
    {
      mTinkerBrickletAmbientLightEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(19);
    }
    return mTinkerBrickletAmbientLightEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletLCD20x4()
  {
    if (mTinkerBrickletLCD20x4EDataType == null)
    {
      mTinkerBrickletLCD20x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(20);
    }
    return mTinkerBrickletLCD20x4EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTinkerBrickletRemoteSwitch()
  {
    if (tinkerBrickletRemoteSwitchEDataType == null)
    {
      tinkerBrickletRemoteSwitchEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(21);
    }
    return tinkerBrickletRemoteSwitchEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTinkerBrickletMotionDetector()
  {
    if (tinkerBrickletMotionDetectorEDataType == null)
    {
      tinkerBrickletMotionDetectorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(22);
    }
    return tinkerBrickletMotionDetectorEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTinkerBrickletMultiTouch()
  {
    if (tinkerBrickletMultiTouchEDataType == null)
    {
      tinkerBrickletMultiTouchEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(23);
    }
    return tinkerBrickletMultiTouchEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTinkerBrickletTemperatureIR()
  {
    if (tinkerBrickletTemperatureIREDataType == null)
    {
      tinkerBrickletTemperatureIREDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(24);
    }
    return tinkerBrickletTemperatureIREDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEnum()
  {
    if (enumEDataType == null)
    {
      enumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(25);
    }
    return enumEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletDualRelay()
  {
    if (mTinkerBrickletDualRelayEDataType == null)
    {
      mTinkerBrickletDualRelayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(6);
    }
    return mTinkerBrickletDualRelayEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletIndustrialQuadRelay()
  {
    if (mTinkerBrickletIndustrialQuadRelayEDataType == null)
    {
      mTinkerBrickletIndustrialQuadRelayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(7);
    }
    return mTinkerBrickletIndustrialQuadRelayEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMTinkerBrickletIndustrialDigitalIn4()
  {
    if (mTinkerBrickletIndustrialDigitalIn4EDataType == null)
    {
      mTinkerBrickletIndustrialDigitalIn4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(8);
    }
    return mTinkerBrickletIndustrialDigitalIn4EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactory getModelFactory()
  {
    return (ModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.openhab.binding.tinkerforge.internal.model." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //ModelPackageImpl
