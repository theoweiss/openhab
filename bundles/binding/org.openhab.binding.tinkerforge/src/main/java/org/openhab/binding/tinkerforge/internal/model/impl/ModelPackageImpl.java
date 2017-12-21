/**
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhab.binding.tinkerforge.internal.model.ModelFactory;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
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
    private EClass mActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchSensorEClass = null;

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
    private EClass programmableSwitchActorEClass = null;

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
    private EClass ioDeviceEClass = null;

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
    private EClass programmableActorEClass = null;

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
    private EClass digitalActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numberActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass programmableColorActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleColorActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moveActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dimmableActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass percentTypeActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setPointActorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletDualButtonEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dualButtonDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletPiezoSpeakerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dualButtonButtonEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletAccelerometerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accelerometerDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accelerometerDirectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accelerometerTemperatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accelerometerLedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletLaserRangeFinderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laserRangeFinderDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laserRangeFinderLaserEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laserRangeFinderDistanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laserRangeFinderVelocityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletLoadCellEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loadCellDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loadCellWeightEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loadCellLedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletColorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass brickletColorDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorColorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorIlluminanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorColorTemperatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorLedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dualButtonLedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletLinearPotiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletRotaryEncoderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rotaryEncoderDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rotaryEncoderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rotaryEncoderButtonEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletJoystickEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass joystickDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass joystickXPositionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass joystickYPositionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass joystickButtonEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletAnalogOutV2EClass = null;

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
    private EClass mServoEClass = null;

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
    private EClass mBrickStepperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfBrickStepperConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperDriveEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperVelocityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperCurrentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperPositionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperStepsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperStackVoltageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperExternalVoltageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperConsumptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperUnderVoltageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperChipTemperatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mStepperStatusLedEClass = null;

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
    private EClass mBrickletIndustrialDigitalOut4EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalActorDigitalOut4EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletSegmentDisplay4x7EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletLEDStripEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ledGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalActorIO16EClass = null;

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
    private EClass digitalSensorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletIO4EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass io4DeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalSensorIO4EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass digitalActorIO4EClass = null;

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
    private EClass mBrickletHallEffectEClass = null;

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
    private EClass mBrickletSolidStateRelayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletIndustrialDual020mAEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dual020mADeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletPTCEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ptcDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ptcTemperatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ptcResistanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ptcConnectedEClass = null;

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
    private EClass mBrickletThermocoupleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletUVLightEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletCO2EClass = null;

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
    private EClass mBrickletTiltEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletVoltageCurrentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voltageCurrentDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vcDeviceVoltageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vcDeviceCurrentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vcDevicePowerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletHumidityV2EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mHumidityV2DeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mHumidityV2TemperatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mHumidityV2HumidityEClass = null;

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
    private EClass mBrickletAmbientLightV2EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletIndustrialDualAnalogInEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass industrialDualAnalogInChannelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletSoundIntensityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletDustDetectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletMoistureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletAnalogInV2EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletAnalogInEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletDistanceUSEClass = null;

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
    private EClass oledBrickletEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletOLED128x64EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mBrickletOLE64x48EClass = null;

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
    private EClass tfNullConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfptcBrickletConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfIndustrialDual020mAConfigurationEClass = null;

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
    private EClass loadCellConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laserRangeFinderConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass humidityV2ConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ambientLightV2ConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass brickletIndustrialDualAnalogInConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfTemperatureConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfThermocoupleConfigurationEClass = null;

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
    private EClass tfMoistureBrickletConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfAnalogInConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfAnalogInV2ConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfDistanceUSBrickletConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tfVoltageCurrentConfigurationEClass = null;

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
    private EClass tfioActorConfigurationEClass = null;

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
    private EClass tfioSensorConfigurationEClass = null;

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
    private EClass dimmableConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass buttonConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dualButtonLEDConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ledStripConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ledGroupConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass brickletColorConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass brickletAccelerometerConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass brickletOLEDConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum accelerometerCoordinateEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum brickStepperSubIdsEEnum = null;

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
    private EEnum industrialDigitalOutSubIDsEEnum = null;

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
    private EEnum io4SubIdsEEnum = null;

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
    private EEnum voltageCurrentSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum configOptsMoveEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum configOptsDimmableEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum configOptsSetPointEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum configOptsSwitchSpeedEEnum = null;

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
    private EEnum configOptsServoEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dualButtonDevicePositionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dualButtonLedSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dualButtonButtonSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum joystickSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ptcSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum industrialDual020mASubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum rotaryEncoderSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum colorBrickletSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum loadCellSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum industrialDualAnalogInSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum laserRangeFinderSubIdsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum accelerometerSubIdsEEnum = null;

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
    private EDataType mTinkerBrickStepperEDataType = null;

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
    private EDataType mTinkerBrickletIndustrialDigitalOut4EDataType = null;

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
    private EDataType hsbValueEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletIO16EDataType = null;

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
    private EDataType mTinkerBrickletHumidityV2EDataType = null;

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
    private EDataType tinkerBrickletSoundIntensityEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletMoistureEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletDistanceUSEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletVoltageCurrentEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletTiltEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletIO4EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletHallEffectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletSegmentDisplay4x7EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletLEDStripEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType brickletJoystickEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletLinearPotiEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletDualButtonEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletPTCEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletIndustrialDual020mAEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletSolidStateRelayEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletPiezoSpeakerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletRotaryEncoderEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletAmbientLightV2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletDustDetectorEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletLoadCellEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletColorEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletIndustrialDualAnalogInEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletAnalogInV2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletAnalogInEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletLaserRangeFinderEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletAccelerometerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletOLED128x64EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletOLED64x48EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletThermocoupleEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletUVLightEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletCO2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tinkerBrickletAnalogOutV2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType hsbTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType upDownTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType percentValueEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType deviceOptionsEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType percentTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType increaseDecreaseTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType directionValueEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType enumEDataType = null;

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
    private ModelPackageImpl() {
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
    public static ModelPackage init() {
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
    public EClass getEcosystem() {
        if (ecosystemEClass == null) {
            ecosystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(69);
        }
        return ecosystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEcosystem_Logger() {
        return (EAttribute)getEcosystem().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEcosystem_Mbrickds() {
        return (EReference)getEcosystem().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getEcosystem__GetBrickd__String_int() {
        return getEcosystem().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getEcosystem__GetDevice__String_String() {
        return getEcosystem().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getEcosystem__GetDevices4GenericId__String_String() {
        return getEcosystem().getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getEcosystem__Disconnect() {
        return getEcosystem().getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickd() {
        if (mBrickdEClass == null) {
            mBrickdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(70);
        }
        return mBrickdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Logger() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_IpConnection() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Host() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Port() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Authkey() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_IsConnected() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_AutoReconnect() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Reconnected() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_ConnectedCounter() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickd_Timeout() {
        return (EAttribute)getMBrickd().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMBrickd_Mdevices() {
        return (EReference)getMBrickd().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMBrickd_Ecosystem() {
        return (EReference)getMBrickd().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickd__Connect() {
        return getMBrickd().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickd__Disconnect() {
        return getMBrickd().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickd__Init() {
        return getMBrickd().getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickd__GetDevice__String() {
        return getMBrickd().getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubDeviceAdmin() {
        if (subDeviceAdminEClass == null) {
            subDeviceAdminEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(71);
        }
        return subDeviceAdminEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSubDeviceAdmin__AddSubDevice__String_String() {
        return getSubDeviceAdmin().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMTFConfigConsumer() {
        if (mtfConfigConsumerEClass == null) {
            mtfConfigConsumerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(72);
        }
        return mtfConfigConsumerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMTFConfigConsumer_TfConfig() {
        return (EReference)getMTFConfigConsumer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBaseDevice() {
        if (mBaseDeviceEClass == null) {
            mBaseDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(73);
        }
        return mBaseDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBaseDevice_Logger() {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBaseDevice_Uid() {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBaseDevice_Poll() {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBaseDevice_EnabledA() {
        return (EAttribute)getMBaseDevice().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBaseDevice__Init() {
        return getMBaseDevice().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBaseDevice__Enable() {
        return getMBaseDevice().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBaseDevice__Disable() {
        return getMBaseDevice().getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMDevice() {
        if (mDeviceEClass == null) {
            mDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(74);
        }
        return mDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_TinkerforgeDevice() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_IpConnection() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_ConnectedUid() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_Position() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_DeviceIdentifier() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDevice_Name() {
        return (EAttribute)getMDevice().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMDevice_Brickd() {
        return (EReference)getMDevice().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMSubDeviceHolder() {
        if (mSubDeviceHolderEClass == null) {
            mSubDeviceHolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(75);
        }
        return mSubDeviceHolderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMSubDeviceHolder_Msubdevices() {
        return (EReference)getMSubDeviceHolder().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMSubDeviceHolder__InitSubDevices() {
        return getMSubDeviceHolder().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMActor() {
        if (mActorEClass == null) {
            mActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(76);
        }
        return mActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSwitchSensor() {
        if (switchSensorEClass == null) {
            switchSensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(77);
        }
        return switchSensorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSwitchSensor_SwitchState() {
        return (EAttribute)getSwitchSensor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSwitchSensor__FetchSwitchState() {
        return getSwitchSensor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMSwitchActor() {
        if (mSwitchActorEClass == null) {
            mSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(78);
        }
        return mSwitchActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMSwitchActor__TurnSwitch__OnOffValue() {
        return getMSwitchActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProgrammableSwitchActor() {
        if (programmableSwitchActorEClass == null) {
            programmableSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(79);
        }
        return programmableSwitchActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getProgrammableSwitchActor__TurnSwitch__OnOffValue_DeviceOptions() {
        return getProgrammableSwitchActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMInSwitchActor() {
        if (mInSwitchActorEClass == null) {
            mInSwitchActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(80);
        }
        return mInSwitchActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGenericDevice() {
        if (genericDeviceEClass == null) {
            genericDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(81);
        }
        return genericDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGenericDevice_GenericDeviceId() {
        return (EAttribute)getGenericDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIODevice() {
        if (ioDeviceEClass == null) {
            ioDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(82);
        }
        return ioDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMSubDevice() {
        if (mSubDeviceEClass == null) {
            mSubDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(83);
        }
        return mSubDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMSubDevice_SubId() {
        return (EAttribute)getMSubDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMSubDevice_Mbrick() {
        return (EReference)getMSubDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallbackListener() {
        if (callbackListenerEClass == null) {
            callbackListenerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(84);
        }
        return callbackListenerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallbackListener_CallbackPeriod() {
        return (EAttribute)getCallbackListener().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterruptListener() {
        if (interruptListenerEClass == null) {
            interruptListenerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(85);
        }
        return interruptListenerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterruptListener_DebouncePeriod() {
        return (EAttribute)getInterruptListener().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMSensor() {
        if (mSensorEClass == null) {
            mSensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(86);
        }
        return mSensorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMSensor_SensorValue() {
        return (EAttribute)getMSensor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMSensor__FetchSensorValue() {
        return getMSensor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProgrammableActor() {
        if (programmableActorEClass == null) {
            programmableActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(87);
        }
        return programmableActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getProgrammableActor__Action__DeviceOptions() {
        return getProgrammableActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMTextActor() {
        if (mTextActorEClass == null) {
            mTextActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(88);
        }
        return mTextActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMTextActor_Text() {
        return (EAttribute)getMTextActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMTextActor__Write__String() {
        return getMTextActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMLCDSubDevice() {
        if (mlcdSubDeviceEClass == null) {
            mlcdSubDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(89);
        }
        return mlcdSubDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalActor() {
        if (digitalActorEClass == null) {
            digitalActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(90);
        }
        return digitalActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActor_DigitalState() {
        return (EAttribute)getDigitalActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActor__TurnDigital__HighLowValue() {
        return getDigitalActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActor__FetchDigitalValue() {
        return getDigitalActor().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumberActor() {
        if (numberActorEClass == null) {
            numberActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(91);
        }
        return numberActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getNumberActor__SetNumber__BigDecimal() {
        return getNumberActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColorActor() {
        if (colorActorEClass == null) {
            colorActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(92);
        }
        return colorActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorActor_Color() {
        return (EAttribute)getColorActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProgrammableColorActor() {
        if (programmableColorActorEClass == null) {
            programmableColorActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(93);
        }
        return programmableColorActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getProgrammableColorActor__SetSelectedColor__HSBType_DeviceOptions() {
        return getProgrammableColorActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleColorActor() {
        if (simpleColorActorEClass == null) {
            simpleColorActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(94);
        }
        return simpleColorActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSimpleColorActor__SetSelectedColor__HSBType() {
        return getSimpleColorActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMoveActor() {
        if (moveActorEClass == null) {
            moveActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(95);
        }
        return moveActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMoveActor_Direction() {
        return (EAttribute)getMoveActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMoveActor__Move__UpDownType_DeviceOptions() {
        return getMoveActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMoveActor__Stop() {
        return getMoveActor().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMoveActor__Moveon__DeviceOptions() {
        return getMoveActor().getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDimmableActor() {
        if (dimmableActorEClass == null) {
            dimmableActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(96);
        }
        return dimmableActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimmableActor_MinValue() {
        return (EAttribute)getDimmableActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimmableActor_MaxValue() {
        return (EAttribute)getDimmableActor().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDimmableActor__Dimm__IncreaseDecreaseType_DeviceOptions() {
        return getDimmableActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPercentTypeActor() {
        if (percentTypeActorEClass == null) {
            percentTypeActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(97);
        }
        return percentTypeActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPercentTypeActor_PercentValue() {
        return (EAttribute)getPercentTypeActor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getPercentTypeActor__SetValue__PercentType_DeviceOptions() {
        return getPercentTypeActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetPointActor() {
        if (setPointActorEClass == null) {
            setPointActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(98);
        }
        return setPointActorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSetPointActor__SetValue__BigDecimal_DeviceOptions() {
        return getSetPointActor().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletDualButton() {
        if (mBrickletDualButtonEClass == null) {
            mBrickletDualButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(99);
        }
        return mBrickletDualButtonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDualButton_DeviceType() {
        return (EAttribute)getMBrickletDualButton().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDualButtonDevice() {
        if (dualButtonDeviceEClass == null) {
            dualButtonDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(100);
        }
        return dualButtonDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletPiezoSpeaker() {
        if (mBrickletPiezoSpeakerEClass == null) {
            mBrickletPiezoSpeakerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(101);
        }
        return mBrickletPiezoSpeakerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletPiezoSpeaker_DeviceType() {
        return (EAttribute)getMBrickletPiezoSpeaker().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDualButtonButton() {
        if (dualButtonButtonEClass == null) {
            dualButtonButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(102);
        }
        return dualButtonButtonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDualButtonButton_DeviceType() {
        return (EAttribute)getDualButtonButton().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDualButtonButton_Position() {
        return (EAttribute)getDualButtonButton().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAccelerometer() {
        if (mBrickletAccelerometerEClass == null) {
            mBrickletAccelerometerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(103);
        }
        return mBrickletAccelerometerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAccelerometer_DeviceType() {
        return (EAttribute)getMBrickletAccelerometer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAccelerometer_DataRate() {
        return (EAttribute)getMBrickletAccelerometer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAccelerometer_FullScale() {
        return (EAttribute)getMBrickletAccelerometer().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAccelerometer_FilterBandwidth() {
        return (EAttribute)getMBrickletAccelerometer().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccelerometerDevice() {
        if (accelerometerDeviceEClass == null) {
            accelerometerDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(104);
        }
        return accelerometerDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccelerometerDirection() {
        if (accelerometerDirectionEClass == null) {
            accelerometerDirectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(106);
        }
        return accelerometerDirectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccelerometerDirection_DeviceType() {
        return (EAttribute)getAccelerometerDirection().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccelerometerDirection_Threshold() {
        return (EAttribute)getAccelerometerDirection().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccelerometerDirection_Direction() {
        return (EAttribute)getAccelerometerDirection().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccelerometerTemperature() {
        if (accelerometerTemperatureEClass == null) {
            accelerometerTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(107);
        }
        return accelerometerTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccelerometerTemperature_DeviceType() {
        return (EAttribute)getAccelerometerTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAccelerometerLed() {
        if (accelerometerLedEClass == null) {
            accelerometerLedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(108);
        }
        return accelerometerLedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAccelerometerLed_DeviceType() {
        return (EAttribute)getAccelerometerLed().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletLaserRangeFinder() {
        if (mBrickletLaserRangeFinderEClass == null) {
            mBrickletLaserRangeFinderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(109);
        }
        return mBrickletLaserRangeFinderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLaserRangeFinder_DeviceType() {
        return (EAttribute)getMBrickletLaserRangeFinder().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLaserRangeFinder_DistanceAverageLength() {
        return (EAttribute)getMBrickletLaserRangeFinder().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLaserRangeFinder_VelocityAverageLength() {
        return (EAttribute)getMBrickletLaserRangeFinder().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLaserRangeFinder_Mode() {
        return (EAttribute)getMBrickletLaserRangeFinder().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLaserRangeFinder_EnableLaserOnStartup() {
        return (EAttribute)getMBrickletLaserRangeFinder().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaserRangeFinderDevice() {
        if (laserRangeFinderDeviceEClass == null) {
            laserRangeFinderDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(110);
        }
        return laserRangeFinderDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaserRangeFinderLaser() {
        if (laserRangeFinderLaserEClass == null) {
            laserRangeFinderLaserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(111);
        }
        return laserRangeFinderLaserEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderLaser_DeviceType() {
        return (EAttribute)getLaserRangeFinderLaser().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaserRangeFinderDistance() {
        if (laserRangeFinderDistanceEClass == null) {
            laserRangeFinderDistanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(112);
        }
        return laserRangeFinderDistanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderDistance_DeviceType() {
        return (EAttribute)getLaserRangeFinderDistance().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderDistance_Threshold() {
        return (EAttribute)getLaserRangeFinderDistance().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaserRangeFinderVelocity() {
        if (laserRangeFinderVelocityEClass == null) {
            laserRangeFinderVelocityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(113);
        }
        return laserRangeFinderVelocityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderVelocity_DeviceType() {
        return (EAttribute)getLaserRangeFinderVelocity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderVelocity_Threshold() {
        return (EAttribute)getLaserRangeFinderVelocity().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletLoadCell() {
        if (mBrickletLoadCellEClass == null) {
            mBrickletLoadCellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(114);
        }
        return mBrickletLoadCellEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLoadCell_DeviceType() {
        return (EAttribute)getMBrickletLoadCell().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoadCellDevice() {
        if (loadCellDeviceEClass == null) {
            loadCellDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(115);
        }
        return loadCellDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoadCellWeight() {
        if (loadCellWeightEClass == null) {
            loadCellWeightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(116);
        }
        return loadCellWeightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoadCellWeight_DeviceType() {
        return (EAttribute)getLoadCellWeight().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoadCellWeight_Threshold() {
        return (EAttribute)getLoadCellWeight().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoadCellWeight_MovingAverage() {
        return (EAttribute)getLoadCellWeight().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getLoadCellWeight__Init() {
        return getLoadCellWeight().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getLoadCellWeight__Tare() {
        return getLoadCellWeight().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoadCellLed() {
        if (loadCellLedEClass == null) {
            loadCellLedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(117);
        }
        return loadCellLedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoadCellLed_DeviceType() {
        return (EAttribute)getLoadCellLed().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletColor() {
        if (mBrickletColorEClass == null) {
            mBrickletColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(118);
        }
        return mBrickletColorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletColor_DeviceType() {
        return (EAttribute)getMBrickletColor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletColor_Gain() {
        return (EAttribute)getMBrickletColor().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletColor_IntegrationTime() {
        return (EAttribute)getMBrickletColor().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletColorDevice() {
        if (brickletColorDeviceEClass == null) {
            brickletColorDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(119);
        }
        return brickletColorDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColorColor() {
        if (colorColorEClass == null) {
            colorColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(120);
        }
        return colorColorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorColor_DeviceType() {
        return (EAttribute)getColorColor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColorIlluminance() {
        if (colorIlluminanceEClass == null) {
            colorIlluminanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(121);
        }
        return colorIlluminanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorIlluminance_DeviceType() {
        return (EAttribute)getColorIlluminance().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorIlluminance_Gain() {
        return (EAttribute)getColorIlluminance().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorIlluminance_IntegrationTime() {
        return (EAttribute)getColorIlluminance().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColorColorTemperature() {
        if (colorColorTemperatureEClass == null) {
            colorColorTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(122);
        }
        return colorColorTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorColorTemperature_DeviceType() {
        return (EAttribute)getColorColorTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColorLed() {
        if (colorLedEClass == null) {
            colorLedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(123);
        }
        return colorLedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColorLed_DeviceType() {
        return (EAttribute)getColorLed().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDualButtonLed() {
        if (dualButtonLedEClass == null) {
            dualButtonLedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(124);
        }
        return dualButtonLedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDualButtonLed_DeviceType() {
        return (EAttribute)getDualButtonLed().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDualButtonLed_Position() {
        return (EAttribute)getDualButtonLed().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletLinearPoti() {
        if (mBrickletLinearPotiEClass == null) {
            mBrickletLinearPotiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(125);
        }
        return mBrickletLinearPotiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLinearPoti_DeviceType() {
        return (EAttribute)getMBrickletLinearPoti().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletRotaryEncoder() {
        if (mBrickletRotaryEncoderEClass == null) {
            mBrickletRotaryEncoderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(126);
        }
        return mBrickletRotaryEncoderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletRotaryEncoder_DeviceType() {
        return (EAttribute)getMBrickletRotaryEncoder().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRotaryEncoderDevice() {
        if (rotaryEncoderDeviceEClass == null) {
            rotaryEncoderDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(127);
        }
        return rotaryEncoderDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRotaryEncoder() {
        if (rotaryEncoderEClass == null) {
            rotaryEncoderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(128);
        }
        return rotaryEncoderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRotaryEncoder_DeviceType() {
        return (EAttribute)getRotaryEncoder().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getRotaryEncoder__Clear() {
        return getRotaryEncoder().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRotaryEncoderButton() {
        if (rotaryEncoderButtonEClass == null) {
            rotaryEncoderButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(129);
        }
        return rotaryEncoderButtonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRotaryEncoderButton_DeviceType() {
        return (EAttribute)getRotaryEncoderButton().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletJoystick() {
        if (mBrickletJoystickEClass == null) {
            mBrickletJoystickEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(130);
        }
        return mBrickletJoystickEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletJoystick_DeviceType() {
        return (EAttribute)getMBrickletJoystick().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoystickDevice() {
        if (joystickDeviceEClass == null) {
            joystickDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(131);
        }
        return joystickDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoystickXPosition() {
        if (joystickXPositionEClass == null) {
            joystickXPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(132);
        }
        return joystickXPositionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJoystickXPosition_DeviceType() {
        return (EAttribute)getJoystickXPosition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoystickYPosition() {
        if (joystickYPositionEClass == null) {
            joystickYPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(133);
        }
        return joystickYPositionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJoystickYPosition_DeviceType() {
        return (EAttribute)getJoystickYPosition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoystickButton() {
        if (joystickButtonEClass == null) {
            joystickButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(134);
        }
        return joystickButtonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getJoystickButton_DeviceType() {
        return (EAttribute)getJoystickButton().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAnalogOutV2() {
        if (mBrickletAnalogOutV2EClass == null) {
            mBrickletAnalogOutV2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(135);
        }
        return mBrickletAnalogOutV2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogOutV2_DeviceType() {
        return (EAttribute)getMBrickletAnalogOutV2().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogOutV2_MinValueDevice() {
        return (EAttribute)getMBrickletAnalogOutV2().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogOutV2_MaxValueDevice() {
        return (EAttribute)getMBrickletAnalogOutV2().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickServo() {
        if (mBrickServoEClass == null) {
            mBrickServoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(136);
        }
        return mBrickServoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickServo_DeviceType() {
        return (EAttribute)getMBrickServo().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickServo__Init() {
        return getMBrickServo().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMServo() {
        if (mServoEClass == null) {
            mServoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(137);
        }
        return mServoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_DeviceType() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_Velocity() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_Acceleration() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_MaxPosition() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_MinPosition() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_PulseWidthMin() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_PulseWidthMax() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_Period() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_OutputVoltage() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMServo_TargetPosition() {
        return (EAttribute)getMServo().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMServo__Init() {
        return getMServo().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMServo__SetPoint__Short_int_int() {
        return getMServo().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickDC() {
        if (mBrickDCEClass == null) {
            mBrickDCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(138);
        }
        return mBrickDCEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_DeviceType() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_Threshold() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_MaxVelocity() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_MinVelocity() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_Velocity() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_Targetvelocity() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_CurrentVelocity() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_Acceleration() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_PwmFrequency() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickDC_DriveMode() {
        return (EAttribute)getMBrickDC().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickDC__Init() {
        return getMBrickDC().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickDC__SetSpeed__Short_int_String() {
        return getMBrickDC().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickStepper() {
        if (mBrickStepperEClass == null) {
            mBrickStepperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(139);
        }
        return mBrickStepperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickStepper_DeviceType() {
        return (EAttribute)getMBrickStepper().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFBrickStepperConfiguration() {
        if (tfBrickStepperConfigurationEClass == null) {
            tfBrickStepperConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(140);
        }
        return tfBrickStepperConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_MaxVelocity() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_Acceleration() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_Deacceleration() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_MotorCurrent() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_StepMode() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_Decay() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_SyncRect() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickStepperConfiguration_TimeBase() {
        return (EAttribute)getTFBrickStepperConfiguration().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperDevice() {
        if (mStepperDeviceEClass == null) {
            mStepperDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(142);
        }
        return mStepperDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperDrive() {
        if (mStepperDriveEClass == null) {
            mStepperDriveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(143);
        }
        return mStepperDriveEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperDrive_DeviceType() {
        return (EAttribute)getMStepperDrive().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperVelocity() {
        if (mStepperVelocityEClass == null) {
            mStepperVelocityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(144);
        }
        return mStepperVelocityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperVelocity_DeviceType() {
        return (EAttribute)getMStepperVelocity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperCurrent() {
        if (mStepperCurrentEClass == null) {
            mStepperCurrentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(145);
        }
        return mStepperCurrentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperCurrent_DeviceType() {
        return (EAttribute)getMStepperCurrent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperPosition() {
        if (mStepperPositionEClass == null) {
            mStepperPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(146);
        }
        return mStepperPositionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperPosition_DeviceType() {
        return (EAttribute)getMStepperPosition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperSteps() {
        if (mStepperStepsEClass == null) {
            mStepperStepsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(147);
        }
        return mStepperStepsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperSteps_DeviceType() {
        return (EAttribute)getMStepperSteps().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperStackVoltage() {
        if (mStepperStackVoltageEClass == null) {
            mStepperStackVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(148);
        }
        return mStepperStackVoltageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperStackVoltage_DeviceType() {
        return (EAttribute)getMStepperStackVoltage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperExternalVoltage() {
        if (mStepperExternalVoltageEClass == null) {
            mStepperExternalVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(149);
        }
        return mStepperExternalVoltageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperExternalVoltage_DeviceType() {
        return (EAttribute)getMStepperExternalVoltage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperConsumption() {
        if (mStepperConsumptionEClass == null) {
            mStepperConsumptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(150);
        }
        return mStepperConsumptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperConsumption_DeviceType() {
        return (EAttribute)getMStepperConsumption().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperUnderVoltage() {
        if (mStepperUnderVoltageEClass == null) {
            mStepperUnderVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(151);
        }
        return mStepperUnderVoltageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperUnderVoltage_DeviceType() {
        return (EAttribute)getMStepperUnderVoltage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperState() {
        if (mStepperStateEClass == null) {
            mStepperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(152);
        }
        return mStepperStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperState_DeviceType() {
        return (EAttribute)getMStepperState().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperChipTemperature() {
        if (mStepperChipTemperatureEClass == null) {
            mStepperChipTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(153);
        }
        return mStepperChipTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperChipTemperature_DeviceType() {
        return (EAttribute)getMStepperChipTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMStepperStatusLed() {
        if (mStepperStatusLedEClass == null) {
            mStepperStatusLedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(154);
        }
        return mStepperStatusLedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMStepperStatusLed_DeviceType() {
        return (EAttribute)getMStepperStatusLed().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMDualRelayBricklet() {
        if (mDualRelayBrickletEClass == null) {
            mDualRelayBrickletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(155);
        }
        return mDualRelayBrickletEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDualRelayBricklet_DeviceType() {
        return (EAttribute)getMDualRelayBricklet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMIndustrialQuadRelayBricklet() {
        if (mIndustrialQuadRelayBrickletEClass == null) {
            mIndustrialQuadRelayBrickletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(156);
        }
        return mIndustrialQuadRelayBrickletEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMIndustrialQuadRelayBricklet_DeviceType() {
        return (EAttribute)getMIndustrialQuadRelayBricklet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMIndustrialQuadRelay() {
        if (mIndustrialQuadRelayEClass == null) {
            mIndustrialQuadRelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(157);
        }
        return mIndustrialQuadRelayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMIndustrialQuadRelay_DeviceType() {
        return (EAttribute)getMIndustrialQuadRelay().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIndustrialDigitalIn4() {
        if (mBrickletIndustrialDigitalIn4EClass == null) {
            mBrickletIndustrialDigitalIn4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(158);
        }
        return mBrickletIndustrialDigitalIn4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIndustrialDigitalIn4_DeviceType() {
        return (EAttribute)getMBrickletIndustrialDigitalIn4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMIndustrialDigitalIn() {
        if (mIndustrialDigitalInEClass == null) {
            mIndustrialDigitalInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(159);
        }
        return mIndustrialDigitalInEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMIndustrialDigitalIn_DeviceType() {
        return (EAttribute)getMIndustrialDigitalIn().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIndustrialDigitalOut4() {
        if (mBrickletIndustrialDigitalOut4EClass == null) {
            mBrickletIndustrialDigitalOut4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(160);
        }
        return mBrickletIndustrialDigitalOut4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIndustrialDigitalOut4_DeviceType() {
        return (EAttribute)getMBrickletIndustrialDigitalOut4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalActorDigitalOut4() {
        if (digitalActorDigitalOut4EClass == null) {
            digitalActorDigitalOut4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(161);
        }
        return digitalActorDigitalOut4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorDigitalOut4_Pin() {
        return (EAttribute)getDigitalActorDigitalOut4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorDigitalOut4_DeviceType() {
        return (EAttribute)getDigitalActorDigitalOut4().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletSegmentDisplay4x7() {
        if (mBrickletSegmentDisplay4x7EClass == null) {
            mBrickletSegmentDisplay4x7EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(162);
        }
        return mBrickletSegmentDisplay4x7EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletSegmentDisplay4x7_DeviceType() {
        return (EAttribute)getMBrickletSegmentDisplay4x7().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletLEDStrip() {
        if (mBrickletLEDStripEClass == null) {
            mBrickletLEDStripEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(163);
        }
        return mBrickletLEDStripEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLEDStrip_DeviceType() {
        return (EAttribute)getMBrickletLEDStrip().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLEDStrip_ColorMapping() {
        return (EAttribute)getMBrickletLEDStrip().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDGroup() {
        if (ledGroupEClass == null) {
            ledGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(164);
        }
        return ledGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDGroup_DeviceType() {
        return (EAttribute)getLEDGroup().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalActorIO16() {
        if (digitalActorIO16EClass == null) {
            digitalActorIO16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(165);
        }
        return digitalActorIO16EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO16_DeviceType() {
        return (EAttribute)getDigitalActorIO16().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO16_Port() {
        return (EAttribute)getDigitalActorIO16().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO16_Pin() {
        return (EAttribute)getDigitalActorIO16().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO16_DefaultState() {
        return (EAttribute)getDigitalActorIO16().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO16_KeepOnReconnect() {
        return (EAttribute)getDigitalActorIO16().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActorIO16__TurnDigital__HighLowValue() {
        return getDigitalActorIO16().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActorIO16__FetchDigitalValue() {
        return getDigitalActorIO16().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIO16() {
        if (mBrickletIO16EClass == null) {
            mBrickletIO16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(166);
        }
        return mBrickletIO16EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIO16_DeviceType() {
        return (EAttribute)getMBrickletIO16().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalSensor() {
        if (digitalSensorEClass == null) {
            digitalSensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(167);
        }
        return digitalSensorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensor_DeviceType() {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensor_PullUpResistorEnabled() {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensor_Port() {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensor_Pin() {
        return (EAttribute)getDigitalSensor().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIO4() {
        if (mBrickletIO4EClass == null) {
            mBrickletIO4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(168);
        }
        return mBrickletIO4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIO4_DeviceType() {
        return (EAttribute)getMBrickletIO4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIO4Device() {
        if (io4DeviceEClass == null) {
            io4DeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(169);
        }
        return io4DeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalSensorIO4() {
        if (digitalSensorIO4EClass == null) {
            digitalSensorIO4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(170);
        }
        return digitalSensorIO4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensorIO4_DeviceType() {
        return (EAttribute)getDigitalSensorIO4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensorIO4_PullUpResistorEnabled() {
        return (EAttribute)getDigitalSensorIO4().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalSensorIO4_Pin() {
        return (EAttribute)getDigitalSensorIO4().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDigitalActorIO4() {
        if (digitalActorIO4EClass == null) {
            digitalActorIO4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(171);
        }
        return digitalActorIO4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO4_DeviceType() {
        return (EAttribute)getDigitalActorIO4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO4_Pin() {
        return (EAttribute)getDigitalActorIO4().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO4_DefaultState() {
        return (EAttribute)getDigitalActorIO4().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDigitalActorIO4_KeepOnReconnect() {
        return (EAttribute)getDigitalActorIO4().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActorIO4__TurnDigital__HighLowValue() {
        return getDigitalActorIO4().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDigitalActorIO4__FetchDigitalValue() {
        return getDigitalActorIO4().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletMultiTouch() {
        if (mBrickletMultiTouchEClass == null) {
            mBrickletMultiTouchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(172);
        }
        return mBrickletMultiTouchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMultiTouch_DeviceType() {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMultiTouch_Recalibrate() {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMultiTouch_Sensitivity() {
        return (EAttribute)getMBrickletMultiTouch().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiTouchDevice() {
        if (multiTouchDeviceEClass == null) {
            multiTouchDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(173);
        }
        return multiTouchDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiTouchDevice_Pin() {
        return (EAttribute)getMultiTouchDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiTouchDevice_DisableElectrode() {
        return (EAttribute)getMultiTouchDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElectrode() {
        if (electrodeEClass == null) {
            electrodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(174);
        }
        return electrodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElectrode_DeviceType() {
        return (EAttribute)getElectrode().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProximity() {
        if (proximityEClass == null) {
            proximityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(175);
        }
        return proximityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProximity_DeviceType() {
        return (EAttribute)getProximity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletMotionDetector() {
        if (mBrickletMotionDetectorEClass == null) {
            mBrickletMotionDetectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(176);
        }
        return mBrickletMotionDetectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMotionDetector_DeviceType() {
        return (EAttribute)getMBrickletMotionDetector().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletMotionDetector__Init() {
        return getMBrickletMotionDetector().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletHallEffect() {
        if (mBrickletHallEffectEClass == null) {
            mBrickletHallEffectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(177);
        }
        return mBrickletHallEffectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletHallEffect_DeviceType() {
        return (EAttribute)getMBrickletHallEffect().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletHallEffect__Init() {
        return getMBrickletHallEffect().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMDualRelay() {
        if (mDualRelayEClass == null) {
            mDualRelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(178);
        }
        return mDualRelayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMDualRelay_DeviceType() {
        return (EAttribute)getMDualRelay().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletRemoteSwitch() {
        if (mBrickletRemoteSwitchEClass == null) {
            mBrickletRemoteSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(179);
        }
        return mBrickletRemoteSwitchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletRemoteSwitch_DeviceType() {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletRemoteSwitch_TypeADevices() {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletRemoteSwitch_TypeBDevices() {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletRemoteSwitch_TypeCDevices() {
        return (EAttribute)getMBrickletRemoteSwitch().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitch() {
        if (remoteSwitchEClass == null) {
            remoteSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(180);
        }
        return remoteSwitchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchA() {
        if (remoteSwitchAEClass == null) {
            remoteSwitchAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(181);
        }
        return remoteSwitchAEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchA_DeviceType() {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchA_HouseCode() {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchA_ReceiverCode() {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchA_Repeats() {
        return (EAttribute)getRemoteSwitchA().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchB() {
        if (remoteSwitchBEClass == null) {
            remoteSwitchBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(182);
        }
        return remoteSwitchBEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchB_DeviceType() {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchB_Address() {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchB_Unit() {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchB_Repeats() {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchB_AbsDimmValue() {
        return (EAttribute)getRemoteSwitchB().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchC() {
        if (remoteSwitchCEClass == null) {
            remoteSwitchCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(183);
        }
        return remoteSwitchCEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchC_DeviceType() {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchC_SystemCode() {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchC_DeviceCode() {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchC_Repeats() {
        return (EAttribute)getRemoteSwitchC().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletHumidity() {
        if (mBrickletHumidityEClass == null) {
            mBrickletHumidityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(184);
        }
        return mBrickletHumidityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletHumidity_DeviceType() {
        return (EAttribute)getMBrickletHumidity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletHumidity_Threshold() {
        return (EAttribute)getMBrickletHumidity().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletHumidity__Init() {
        return getMBrickletHumidity().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletDistanceIR() {
        if (mBrickletDistanceIREClass == null) {
            mBrickletDistanceIREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(185);
        }
        return mBrickletDistanceIREClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDistanceIR_DeviceType() {
        return (EAttribute)getMBrickletDistanceIR().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDistanceIR_Threshold() {
        return (EAttribute)getMBrickletDistanceIR().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletDistanceIR__Init() {
        return getMBrickletDistanceIR().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletSolidStateRelay() {
        if (mBrickletSolidStateRelayEClass == null) {
            mBrickletSolidStateRelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(186);
        }
        return mBrickletSolidStateRelayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletSolidStateRelay_DeviceType() {
        return (EAttribute)getMBrickletSolidStateRelay().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletSolidStateRelay__Init() {
        return getMBrickletSolidStateRelay().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIndustrialDual020mA() {
        if (mBrickletIndustrialDual020mAEClass == null) {
            mBrickletIndustrialDual020mAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(187);
        }
        return mBrickletIndustrialDual020mAEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIndustrialDual020mA_DeviceType() {
        return (EAttribute)getMBrickletIndustrialDual020mA().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletIndustrialDual020mA__Init() {
        return getMBrickletIndustrialDual020mA().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDual020mADevice() {
        if (dual020mADeviceEClass == null) {
            dual020mADeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(188);
        }
        return dual020mADeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDual020mADevice_DeviceType() {
        return (EAttribute)getDual020mADevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDual020mADevice_Threshold() {
        return (EAttribute)getDual020mADevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDual020mADevice_SensorNum() {
        return (EAttribute)getDual020mADevice().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletPTC() {
        if (mBrickletPTCEClass == null) {
            mBrickletPTCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(189);
        }
        return mBrickletPTCEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletPTC_DeviceType() {
        return (EAttribute)getMBrickletPTC().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletPTC__Init() {
        return getMBrickletPTC().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPTCDevice() {
        if (ptcDeviceEClass == null) {
            ptcDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(190);
        }
        return ptcDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPTCTemperature() {
        if (ptcTemperatureEClass == null) {
            ptcTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(191);
        }
        return ptcTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPTCTemperature_DeviceType() {
        return (EAttribute)getPTCTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPTCTemperature_Threshold() {
        return (EAttribute)getPTCTemperature().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPTCResistance() {
        if (ptcResistanceEClass == null) {
            ptcResistanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(192);
        }
        return ptcResistanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPTCResistance_DeviceType() {
        return (EAttribute)getPTCResistance().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPTCResistance_Threshold() {
        return (EAttribute)getPTCResistance().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPTCConnected() {
        if (ptcConnectedEClass == null) {
            ptcConnectedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(193);
        }
        return ptcConnectedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPTCConnected_DeviceType() {
        return (EAttribute)getPTCConnected().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletTemperature() {
        if (mBrickletTemperatureEClass == null) {
            mBrickletTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(194);
        }
        return mBrickletTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletTemperature_DeviceType() {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletTemperature_Threshold() {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletTemperature_SlowI2C() {
        return (EAttribute)getMBrickletTemperature().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletTemperature__Init() {
        return getMBrickletTemperature().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletThermocouple() {
        if (mBrickletThermocoupleEClass == null) {
            mBrickletThermocoupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(195);
        }
        return mBrickletThermocoupleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletThermocouple_DeviceType() {
        return (EAttribute)getMBrickletThermocouple().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletThermocouple_Threshold() {
        return (EAttribute)getMBrickletThermocouple().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletThermocouple__Init() {
        return getMBrickletThermocouple().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletUVLight() {
        if (mBrickletUVLightEClass == null) {
            mBrickletUVLightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(196);
        }
        return mBrickletUVLightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletUVLight_DeviceType() {
        return (EAttribute)getMBrickletUVLight().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletUVLight_Threshold() {
        return (EAttribute)getMBrickletUVLight().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletUVLight__Init() {
        return getMBrickletUVLight().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletCO2() {
        if (mBrickletCO2EClass == null) {
            mBrickletCO2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(197);
        }
        return mBrickletCO2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletCO2_DeviceType() {
        return (EAttribute)getMBrickletCO2().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletCO2_Threshold() {
        return (EAttribute)getMBrickletCO2().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletCO2__Init() {
        return getMBrickletCO2().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletTemperatureIR() {
        if (mBrickletTemperatureIREClass == null) {
            mBrickletTemperatureIREClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(198);
        }
        return mBrickletTemperatureIREClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletTemperatureIR_DeviceType() {
        return (EAttribute)getMBrickletTemperatureIR().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMTemperatureIRDevice() {
        if (mTemperatureIRDeviceEClass == null) {
            mTemperatureIRDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(199);
        }
        return mTemperatureIRDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMTemperatureIRDevice_Threshold() {
        return (EAttribute)getMTemperatureIRDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObjectTemperature() {
        if (objectTemperatureEClass == null) {
            objectTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(200);
        }
        return objectTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectTemperature_DeviceType() {
        return (EAttribute)getObjectTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectTemperature_Emissivity() {
        return (EAttribute)getObjectTemperature().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAmbientTemperature() {
        if (ambientTemperatureEClass == null) {
            ambientTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(201);
        }
        return ambientTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAmbientTemperature_DeviceType() {
        return (EAttribute)getAmbientTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletTilt() {
        if (mBrickletTiltEClass == null) {
            mBrickletTiltEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(202);
        }
        return mBrickletTiltEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletTilt_DeviceType() {
        return (EAttribute)getMBrickletTilt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletVoltageCurrent() {
        if (mBrickletVoltageCurrentEClass == null) {
            mBrickletVoltageCurrentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(203);
        }
        return mBrickletVoltageCurrentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletVoltageCurrent_DeviceType() {
        return (EAttribute)getMBrickletVoltageCurrent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletVoltageCurrent_Averaging() {
        return (EAttribute)getMBrickletVoltageCurrent().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletVoltageCurrent_VoltageConversionTime() {
        return (EAttribute)getMBrickletVoltageCurrent().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletVoltageCurrent_CurrentConversionTime() {
        return (EAttribute)getMBrickletVoltageCurrent().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVoltageCurrentDevice() {
        if (voltageCurrentDeviceEClass == null) {
            voltageCurrentDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(204);
        }
        return voltageCurrentDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVCDeviceVoltage() {
        if (vcDeviceVoltageEClass == null) {
            vcDeviceVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(205);
        }
        return vcDeviceVoltageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDeviceVoltage_DeviceType() {
        return (EAttribute)getVCDeviceVoltage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDeviceVoltage_Threshold() {
        return (EAttribute)getVCDeviceVoltage().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVCDeviceCurrent() {
        if (vcDeviceCurrentEClass == null) {
            vcDeviceCurrentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(206);
        }
        return vcDeviceCurrentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDeviceCurrent_DeviceType() {
        return (EAttribute)getVCDeviceCurrent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDeviceCurrent_Threshold() {
        return (EAttribute)getVCDeviceCurrent().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVCDevicePower() {
        if (vcDevicePowerEClass == null) {
            vcDevicePowerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(207);
        }
        return vcDevicePowerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDevicePower_DeviceType() {
        return (EAttribute)getVCDevicePower().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVCDevicePower_Threshold() {
        return (EAttribute)getVCDevicePower().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletHumidityV2() {
        if (mBrickletHumidityV2EClass == null) {
            mBrickletHumidityV2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(208);
        }
        return mBrickletHumidityV2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMHumidityV2Device() {
        if (mHumidityV2DeviceEClass == null) {
            mHumidityV2DeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(209);
        }
        return mHumidityV2DeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMHumidityV2Temperature() {
        if (mHumidityV2TemperatureEClass == null) {
            mHumidityV2TemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(210);
        }
        return mHumidityV2TemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMHumidityV2Temperature_DeviceType() {
        return (EAttribute)getMHumidityV2Temperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMHumidityV2Temperature__Init() {
        return getMHumidityV2Temperature().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMHumidityV2Humidity() {
        if (mHumidityV2HumidityEClass == null) {
            mHumidityV2HumidityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(211);
        }
        return mHumidityV2HumidityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMHumidityV2Humidity_DeviceType() {
        return (EAttribute)getMHumidityV2Humidity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMHumidityV2Humidity__Init() {
        return getMHumidityV2Humidity().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletBarometer() {
        if (mBrickletBarometerEClass == null) {
            mBrickletBarometerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(212);
        }
        return mBrickletBarometerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletBarometer_DeviceType() {
        return (EAttribute)getMBrickletBarometer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletBarometer_Threshold() {
        return (EAttribute)getMBrickletBarometer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletBarometer__Init() {
        return getMBrickletBarometer().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBarometerTemperature() {
        if (mBarometerTemperatureEClass == null) {
            mBarometerTemperatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(213);
        }
        return mBarometerTemperatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBarometerTemperature_DeviceType() {
        return (EAttribute)getMBarometerTemperature().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBarometerTemperature__Init() {
        return getMBarometerTemperature().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAmbientLight() {
        if (mBrickletAmbientLightEClass == null) {
            mBrickletAmbientLightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(214);
        }
        return mBrickletAmbientLightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLight_DeviceType() {
        return (EAttribute)getMBrickletAmbientLight().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLight_Threshold() {
        return (EAttribute)getMBrickletAmbientLight().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletAmbientLight__Init() {
        return getMBrickletAmbientLight().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAmbientLightV2() {
        if (mBrickletAmbientLightV2EClass == null) {
            mBrickletAmbientLightV2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(215);
        }
        return mBrickletAmbientLightV2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLightV2_DeviceType() {
        return (EAttribute)getMBrickletAmbientLightV2().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLightV2_Threshold() {
        return (EAttribute)getMBrickletAmbientLightV2().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLightV2_IlluminanceRange() {
        return (EAttribute)getMBrickletAmbientLightV2().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAmbientLightV2_IntegrationTime() {
        return (EAttribute)getMBrickletAmbientLightV2().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletAmbientLightV2__Init() {
        return getMBrickletAmbientLightV2().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletIndustrialDualAnalogIn() {
        if (mBrickletIndustrialDualAnalogInEClass == null) {
            mBrickletIndustrialDualAnalogInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(216);
        }
        return mBrickletIndustrialDualAnalogInEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIndustrialDualAnalogIn_DeviceType() {
        return (EAttribute)getMBrickletIndustrialDualAnalogIn().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletIndustrialDualAnalogIn_SampleRate() {
        return (EAttribute)getMBrickletIndustrialDualAnalogIn().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndustrialDualAnalogInChannel() {
        if (industrialDualAnalogInChannelEClass == null) {
            industrialDualAnalogInChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(217);
        }
        return industrialDualAnalogInChannelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIndustrialDualAnalogInChannel_DeviceType() {
        return (EAttribute)getIndustrialDualAnalogInChannel().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIndustrialDualAnalogInChannel_Threshold() {
        return (EAttribute)getIndustrialDualAnalogInChannel().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIndustrialDualAnalogInChannel_ChannelNum() {
        return (EAttribute)getIndustrialDualAnalogInChannel().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletSoundIntensity() {
        if (mBrickletSoundIntensityEClass == null) {
            mBrickletSoundIntensityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(218);
        }
        return mBrickletSoundIntensityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletSoundIntensity_DeviceType() {
        return (EAttribute)getMBrickletSoundIntensity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletSoundIntensity_Threshold() {
        return (EAttribute)getMBrickletSoundIntensity().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletSoundIntensity__Init() {
        return getMBrickletSoundIntensity().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletDustDetector() {
        if (mBrickletDustDetectorEClass == null) {
            mBrickletDustDetectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(219);
        }
        return mBrickletDustDetectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDustDetector_DeviceType() {
        return (EAttribute)getMBrickletDustDetector().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDustDetector_Threshold() {
        return (EAttribute)getMBrickletDustDetector().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletDustDetector__Init() {
        return getMBrickletDustDetector().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletMoisture() {
        if (mBrickletMoistureEClass == null) {
            mBrickletMoistureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(220);
        }
        return mBrickletMoistureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMoisture_DeviceType() {
        return (EAttribute)getMBrickletMoisture().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMoisture_Threshold() {
        return (EAttribute)getMBrickletMoisture().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletMoisture_MovingAverage() {
        return (EAttribute)getMBrickletMoisture().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletMoisture__Init() {
        return getMBrickletMoisture().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAnalogInV2() {
        if (mBrickletAnalogInV2EClass == null) {
            mBrickletAnalogInV2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(221);
        }
        return mBrickletAnalogInV2EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogInV2_DeviceType() {
        return (EAttribute)getMBrickletAnalogInV2().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogInV2_Threshold() {
        return (EAttribute)getMBrickletAnalogInV2().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogInV2_MovingAverage() {
        return (EAttribute)getMBrickletAnalogInV2().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletAnalogIn() {
        if (mBrickletAnalogInEClass == null) {
            mBrickletAnalogInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(222);
        }
        return mBrickletAnalogInEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogIn_DeviceType() {
        return (EAttribute)getMBrickletAnalogIn().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogIn_Threshold() {
        return (EAttribute)getMBrickletAnalogIn().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogIn_MovingAverage() {
        return (EAttribute)getMBrickletAnalogIn().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletAnalogIn_Range() {
        return (EAttribute)getMBrickletAnalogIn().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletDistanceUS() {
        if (mBrickletDistanceUSEClass == null) {
            mBrickletDistanceUSEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(223);
        }
        return mBrickletDistanceUSEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDistanceUS_DeviceType() {
        return (EAttribute)getMBrickletDistanceUS().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDistanceUS_Threshold() {
        return (EAttribute)getMBrickletDistanceUS().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletDistanceUS_MovingAverage() {
        return (EAttribute)getMBrickletDistanceUS().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletDistanceUS__Init() {
        return getMBrickletDistanceUS().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletLCD20x4() {
        if (mBrickletLCD20x4EClass == null) {
            mBrickletLCD20x4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(224);
        }
        return mBrickletLCD20x4EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLCD20x4_DeviceType() {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLCD20x4_PositionPrefix() {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLCD20x4_PositonSuffix() {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLCD20x4_DisplayErrors() {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletLCD20x4_ErrorPrefix() {
        return (EAttribute)getMBrickletLCD20x4().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletLCD20x4__Init() {
        return getMBrickletLCD20x4().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getMBrickletLCD20x4__Clear() {
        return getMBrickletLCD20x4().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOLEDBricklet() {
        if (oledBrickletEClass == null) {
            oledBrickletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(225);
        }
        return oledBrickletEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOLEDBricklet_PositionPrefix() {
        return (EAttribute)getOLEDBricklet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOLEDBricklet_PositionSuffix() {
        return (EAttribute)getOLEDBricklet().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOLEDBricklet_Contrast() {
        return (EAttribute)getOLEDBricklet().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOLEDBricklet_Invert() {
        return (EAttribute)getOLEDBricklet().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOLEDBricklet__Clear() {
        return getOLEDBricklet().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOLEDBricklet__Clear__short_short_short_short() {
        return getOLEDBricklet().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOLEDBricklet__WriteLine__short_short_String() {
        return getOLEDBricklet().getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOLEDBricklet__SimpleGauge__int() {
        return getOLEDBricklet().getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOLEDBricklet__SimpleGauge__int_int_int() {
        return getOLEDBricklet().getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletOLED128x64() {
        if (mBrickletOLED128x64EClass == null) {
            mBrickletOLED128x64EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(226);
        }
        return mBrickletOLED128x64EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletOLED128x64_DeviceType() {
        return (EAttribute)getMBrickletOLED128x64().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMBrickletOLE64x48() {
        if (mBrickletOLE64x48EClass == null) {
            mBrickletOLE64x48EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(227);
        }
        return mBrickletOLE64x48EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMBrickletOLE64x48_DeviceType() {
        return (EAttribute)getMBrickletOLE64x48().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMLCD20x4Backlight() {
        if (mlcd20x4BacklightEClass == null) {
            mlcd20x4BacklightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(228);
        }
        return mlcd20x4BacklightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMLCD20x4Backlight_DeviceType() {
        return (EAttribute)getMLCD20x4Backlight().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMLCD20x4Button() {
        if (mlcd20x4ButtonEClass == null) {
            mlcd20x4ButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(229);
        }
        return mlcd20x4ButtonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMLCD20x4Button_DeviceType() {
        return (EAttribute)getMLCD20x4Button().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMLCD20x4Button_ButtonNum() {
        return (EAttribute)getMLCD20x4Button().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFConfig() {
        if (tfConfigEClass == null) {
            tfConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(230);
        }
        return tfConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOHTFDevice() {
        if (ohtfDeviceEClass == null) {
            ohtfDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(231);
        }
        return ohtfDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOHTFDevice_Uid() {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOHTFDevice_Subid() {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOHTFDevice_Ohid() {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOHTFDevice_SubDeviceIds() {
        return (EAttribute)getOHTFDevice().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOHTFDevice_TfConfig() {
        return (EReference)getOHTFDevice().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOHTFDevice_OhConfig() {
        return (EReference)getOHTFDevice().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOHTFDevice__IsValidSubId__String() {
        return getOHTFDevice().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOHTFSubDeviceAdminDevice() {
        if (ohtfSubDeviceAdminDeviceEClass == null) {
            ohtfSubDeviceAdminDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(232);
        }
        return ohtfSubDeviceAdminDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOHTFSubDeviceAdminDevice__IsValidSubId__String() {
        return getOHTFSubDeviceAdminDevice().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOHConfig() {
        if (ohConfigEClass == null) {
            ohConfigEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(233);
        }
        return ohConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOHConfig_OhTfDevices() {
        return (EReference)getOHConfig().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOHConfig__GetConfigByTFId__String_String() {
        return getOHConfig().getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getOHConfig__GetConfigByOHId__String() {
        return getOHConfig().getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFNullConfiguration() {
        if (tfNullConfigurationEClass == null) {
            tfNullConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(234);
        }
        return tfNullConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFPTCBrickletConfiguration() {
        if (tfptcBrickletConfigurationEClass == null) {
            tfptcBrickletConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(235);
        }
        return tfptcBrickletConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFPTCBrickletConfiguration_NoiseRejectionFilter() {
        return (EAttribute)getTFPTCBrickletConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFPTCBrickletConfiguration_WireMode() {
        return (EAttribute)getTFPTCBrickletConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFIndustrialDual020mAConfiguration() {
        if (tfIndustrialDual020mAConfigurationEClass == null) {
            tfIndustrialDual020mAConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(236);
        }
        return tfIndustrialDual020mAConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFIndustrialDual020mAConfiguration_SampleRate() {
        return (EAttribute)getTFIndustrialDual020mAConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFBaseConfiguration() {
        if (tfBaseConfigurationEClass == null) {
            tfBaseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(237);
        }
        return tfBaseConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBaseConfiguration_Threshold() {
        return (EAttribute)getTFBaseConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBaseConfiguration_CallbackPeriod() {
        return (EAttribute)getTFBaseConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoadCellConfiguration() {
        if (loadCellConfigurationEClass == null) {
            loadCellConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(238);
        }
        return loadCellConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLoadCellConfiguration_MovingAverage() {
        return (EAttribute)getLoadCellConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaserRangeFinderConfiguration() {
        if (laserRangeFinderConfigurationEClass == null) {
            laserRangeFinderConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(239);
        }
        return laserRangeFinderConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderConfiguration_DistanceAverageLength() {
        return (EAttribute)getLaserRangeFinderConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderConfiguration_VelocityAverageLength() {
        return (EAttribute)getLaserRangeFinderConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderConfiguration_Mode() {
        return (EAttribute)getLaserRangeFinderConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLaserRangeFinderConfiguration_EnableLaserOnStartup() {
        return (EAttribute)getLaserRangeFinderConfiguration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHumidityV2Configuration() {
        if (humidityV2ConfigurationEClass == null) {
            humidityV2ConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(240);
        }
        return humidityV2ConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHumidityV2Configuration_StatusLEDConfig() {
        return (EAttribute)getHumidityV2Configuration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHumidityV2Configuration_MovingAverageLengthHumidity() {
        return (EAttribute)getHumidityV2Configuration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHumidityV2Configuration_MovingAverageLengthTemperature() {
        return (EAttribute)getHumidityV2Configuration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAmbientLightV2Configuration() {
        if (ambientLightV2ConfigurationEClass == null) {
            ambientLightV2ConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(241);
        }
        return ambientLightV2ConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAmbientLightV2Configuration_IlluminanceRange() {
        return (EAttribute)getAmbientLightV2Configuration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAmbientLightV2Configuration_IntegrationTime() {
        return (EAttribute)getAmbientLightV2Configuration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletIndustrialDualAnalogInConfiguration() {
        if (brickletIndustrialDualAnalogInConfigurationEClass == null) {
            brickletIndustrialDualAnalogInConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(242);
        }
        return brickletIndustrialDualAnalogInConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletIndustrialDualAnalogInConfiguration_SampleRate() {
        return (EAttribute)getBrickletIndustrialDualAnalogInConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFTemperatureConfiguration() {
        if (tfTemperatureConfigurationEClass == null) {
            tfTemperatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(243);
        }
        return tfTemperatureConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFTemperatureConfiguration_SlowI2C() {
        return (EAttribute)getTFTemperatureConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFThermocoupleConfiguration() {
        if (tfThermocoupleConfigurationEClass == null) {
            tfThermocoupleConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(244);
        }
        return tfThermocoupleConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFThermocoupleConfiguration_Averaging() {
        return (EAttribute)getTFThermocoupleConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFThermocoupleConfiguration_ThermocoupleType() {
        return (EAttribute)getTFThermocoupleConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFThermocoupleConfiguration_Filter() {
        return (EAttribute)getTFThermocoupleConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFObjectTemperatureConfiguration() {
        if (tfObjectTemperatureConfigurationEClass == null) {
            tfObjectTemperatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(245);
        }
        return tfObjectTemperatureConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFObjectTemperatureConfiguration_Emissivity() {
        return (EAttribute)getTFObjectTemperatureConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFMoistureBrickletConfiguration() {
        if (tfMoistureBrickletConfigurationEClass == null) {
            tfMoistureBrickletConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(246);
        }
        return tfMoistureBrickletConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFMoistureBrickletConfiguration_MovingAverage() {
        return (EAttribute)getTFMoistureBrickletConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFAnalogInConfiguration() {
        if (tfAnalogInConfigurationEClass == null) {
            tfAnalogInConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(247);
        }
        return tfAnalogInConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFAnalogInConfiguration_MovingAverage() {
        return (EAttribute)getTFAnalogInConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFAnalogInConfiguration_Range() {
        return (EAttribute)getTFAnalogInConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFAnalogInV2Configuration() {
        if (tfAnalogInV2ConfigurationEClass == null) {
            tfAnalogInV2ConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(248);
        }
        return tfAnalogInV2ConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFAnalogInV2Configuration_MovingAverage() {
        return (EAttribute)getTFAnalogInV2Configuration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFDistanceUSBrickletConfiguration() {
        if (tfDistanceUSBrickletConfigurationEClass == null) {
            tfDistanceUSBrickletConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(249);
        }
        return tfDistanceUSBrickletConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFDistanceUSBrickletConfiguration_MovingAverage() {
        return (EAttribute)getTFDistanceUSBrickletConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFVoltageCurrentConfiguration() {
        if (tfVoltageCurrentConfigurationEClass == null) {
            tfVoltageCurrentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(250);
        }
        return tfVoltageCurrentConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFVoltageCurrentConfiguration_Averaging() {
        return (EAttribute)getTFVoltageCurrentConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFVoltageCurrentConfiguration_VoltageConversionTime() {
        return (EAttribute)getTFVoltageCurrentConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFVoltageCurrentConfiguration_CurrentConversionTime() {
        return (EAttribute)getTFVoltageCurrentConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFBrickDCConfiguration() {
        if (tfBrickDCConfigurationEClass == null) {
            tfBrickDCConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(251);
        }
        return tfBrickDCConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickDCConfiguration_Velocity() {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickDCConfiguration_Acceleration() {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickDCConfiguration_PwmFrequency() {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFBrickDCConfiguration_DriveMode() {
        return (EAttribute)getTFBrickDCConfiguration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFIOActorConfiguration() {
        if (tfioActorConfigurationEClass == null) {
            tfioActorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(252);
        }
        return tfioActorConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFIOActorConfiguration_DefaultState() {
        return (EAttribute)getTFIOActorConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFIOActorConfiguration_KeepOnReconnect() {
        return (EAttribute)getTFIOActorConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFInterruptListenerConfiguration() {
        if (tfInterruptListenerConfigurationEClass == null) {
            tfInterruptListenerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(253);
        }
        return tfInterruptListenerConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFInterruptListenerConfiguration_DebouncePeriod() {
        return (EAttribute)getTFInterruptListenerConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFIOSensorConfiguration() {
        if (tfioSensorConfigurationEClass == null) {
            tfioSensorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(254);
        }
        return tfioSensorConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFIOSensorConfiguration_PullUpResistorEnabled() {
        return (EAttribute)getTFIOSensorConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTFServoConfiguration() {
        if (tfServoConfigurationEClass == null) {
            tfServoConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(255);
        }
        return tfServoConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_Velocity() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_Acceleration() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_ServoVoltage() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_PulseWidthMin() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_PulseWidthMax() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_Period() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTFServoConfiguration_OutputVoltage() {
        return (EAttribute)getTFServoConfiguration().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletRemoteSwitchConfiguration() {
        if (brickletRemoteSwitchConfigurationEClass == null) {
            brickletRemoteSwitchConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(256);
        }
        return brickletRemoteSwitchConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletRemoteSwitchConfiguration_TypeADevices() {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletRemoteSwitchConfiguration_TypeBDevices() {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletRemoteSwitchConfiguration_TypeCDevices() {
        return (EAttribute)getBrickletRemoteSwitchConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchAConfiguration() {
        if (remoteSwitchAConfigurationEClass == null) {
            remoteSwitchAConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(257);
        }
        return remoteSwitchAConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchAConfiguration_HouseCode() {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchAConfiguration_ReceiverCode() {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchAConfiguration_Repeats() {
        return (EAttribute)getRemoteSwitchAConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchBConfiguration() {
        if (remoteSwitchBConfigurationEClass == null) {
            remoteSwitchBConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(258);
        }
        return remoteSwitchBConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchBConfiguration_Address() {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchBConfiguration_Unit() {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchBConfiguration_Repeats() {
        return (EAttribute)getRemoteSwitchBConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRemoteSwitchCConfiguration() {
        if (remoteSwitchCConfigurationEClass == null) {
            remoteSwitchCConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(259);
        }
        return remoteSwitchCConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchCConfiguration_SystemCode() {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchCConfiguration_DeviceCode() {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRemoteSwitchCConfiguration_Repeats() {
        return (EAttribute)getRemoteSwitchCConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiTouchDeviceConfiguration() {
        if (multiTouchDeviceConfigurationEClass == null) {
            multiTouchDeviceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(260);
        }
        return multiTouchDeviceConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiTouchDeviceConfiguration_DisableElectrode() {
        return (EAttribute)getMultiTouchDeviceConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletMultiTouchConfiguration() {
        if (brickletMultiTouchConfigurationEClass == null) {
            brickletMultiTouchConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(261);
        }
        return brickletMultiTouchConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletMultiTouchConfiguration_Recalibrate() {
        return (EAttribute)getBrickletMultiTouchConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletMultiTouchConfiguration_Sensitivity() {
        return (EAttribute)getBrickletMultiTouchConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDimmableConfiguration() {
        if (dimmableConfigurationEClass == null) {
            dimmableConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(262);
        }
        return dimmableConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimmableConfiguration_MinValue() {
        return (EAttribute)getDimmableConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimmableConfiguration_MaxValue() {
        return (EAttribute)getDimmableConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getButtonConfiguration() {
        if (buttonConfigurationEClass == null) {
            buttonConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(263);
        }
        return buttonConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getButtonConfiguration_Tactile() {
        return (EAttribute)getButtonConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDualButtonLEDConfiguration() {
        if (dualButtonLEDConfigurationEClass == null) {
            dualButtonLEDConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(264);
        }
        return dualButtonLEDConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDualButtonLEDConfiguration_Autotoggle() {
        return (EAttribute)getDualButtonLEDConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDStripConfiguration() {
        if (ledStripConfigurationEClass == null) {
            ledStripConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(265);
        }
        return ledStripConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDStripConfiguration_Chiptype() {
        return (EAttribute)getLEDStripConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDStripConfiguration_Frameduration() {
        return (EAttribute)getLEDStripConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDStripConfiguration_Clockfrequency() {
        return (EAttribute)getLEDStripConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDStripConfiguration_ColorMapping() {
        return (EAttribute)getLEDStripConfiguration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDStripConfiguration_SubDevices() {
        return (EAttribute)getLEDStripConfiguration().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLEDGroupConfiguration() {
        if (ledGroupConfigurationEClass == null) {
            ledGroupConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(266);
        }
        return ledGroupConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLEDGroupConfiguration_Leds() {
        return (EAttribute)getLEDGroupConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletColorConfiguration() {
        if (brickletColorConfigurationEClass == null) {
            brickletColorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(267);
        }
        return brickletColorConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletColorConfiguration_Gain() {
        return (EAttribute)getBrickletColorConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletColorConfiguration_IntegrationTime() {
        return (EAttribute)getBrickletColorConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletAccelerometerConfiguration() {
        if (brickletAccelerometerConfigurationEClass == null) {
            brickletAccelerometerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(268);
        }
        return brickletAccelerometerConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletAccelerometerConfiguration_DataRate() {
        return (EAttribute)getBrickletAccelerometerConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletAccelerometerConfiguration_FullScale() {
        return (EAttribute)getBrickletAccelerometerConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletAccelerometerConfiguration_FilterBandwidth() {
        return (EAttribute)getBrickletAccelerometerConfiguration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBrickletOLEDConfiguration() {
        if (brickletOLEDConfigurationEClass == null) {
            brickletOLEDConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(269);
        }
        return brickletOLEDConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletOLEDConfiguration_Contrast() {
        return (EAttribute)getBrickletOLEDConfiguration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBrickletOLEDConfiguration_Invert() {
        return (EAttribute)getBrickletOLEDConfiguration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccelerometerCoordinate() {
        if (accelerometerCoordinateEEnum == null) {
            accelerometerCoordinateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(105);
        }
        return accelerometerCoordinateEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBrickStepperSubIds() {
        if (brickStepperSubIdsEEnum == null) {
            brickStepperSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(141);
        }
        return brickStepperSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNoSubIds() {
        if (noSubIdsEEnum == null) {
            noSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(270);
        }
        return noSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIndustrialDigitalInSubIDs() {
        if (industrialDigitalInSubIDsEEnum == null) {
            industrialDigitalInSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(271);
        }
        return industrialDigitalInSubIDsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIndustrialDigitalOutSubIDs() {
        if (industrialDigitalOutSubIDsEEnum == null) {
            industrialDigitalOutSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(272);
        }
        return industrialDigitalOutSubIDsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIndustrialQuadRelayIDs() {
        if (industrialQuadRelayIDsEEnum == null) {
            industrialQuadRelayIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(273);
        }
        return industrialQuadRelayIDsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getServoSubIDs() {
        if (servoSubIDsEEnum == null) {
            servoSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(274);
        }
        return servoSubIDsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBarometerSubIDs() {
        if (barometerSubIDsEEnum == null) {
            barometerSubIDsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(275);
        }
        return barometerSubIDsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIO16SubIds() {
        if (io16SubIdsEEnum == null) {
            io16SubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(276);
        }
        return io16SubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIO4SubIds() {
        if (io4SubIdsEEnum == null) {
            io4SubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(277);
        }
        return io4SubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDualRelaySubIds() {
        if (dualRelaySubIdsEEnum == null) {
            dualRelaySubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(278);
        }
        return dualRelaySubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLCDButtonSubIds() {
        if (lcdButtonSubIdsEEnum == null) {
            lcdButtonSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(279);
        }
        return lcdButtonSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLCDBacklightSubIds() {
        if (lcdBacklightSubIdsEEnum == null) {
            lcdBacklightSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(280);
        }
        return lcdBacklightSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMultiTouchSubIds() {
        if (multiTouchSubIdsEEnum == null) {
            multiTouchSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(281);
        }
        return multiTouchSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTemperatureIRSubIds() {
        if (temperatureIRSubIdsEEnum == null) {
            temperatureIRSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(282);
        }
        return temperatureIRSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVoltageCurrentSubIds() {
        if (voltageCurrentSubIdsEEnum == null) {
            voltageCurrentSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(283);
        }
        return voltageCurrentSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConfigOptsMove() {
        if (configOptsMoveEEnum == null) {
            configOptsMoveEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(284);
        }
        return configOptsMoveEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConfigOptsDimmable() {
        if (configOptsDimmableEEnum == null) {
            configOptsDimmableEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(285);
        }
        return configOptsDimmableEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConfigOptsSetPoint() {
        if (configOptsSetPointEEnum == null) {
            configOptsSetPointEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(286);
        }
        return configOptsSetPointEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConfigOptsSwitchSpeed() {
        if (configOptsSwitchSpeedEEnum == null) {
            configOptsSwitchSpeedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(287);
        }
        return configOptsSwitchSpeedEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDCDriveMode() {
        if (dcDriveModeEEnum == null) {
            dcDriveModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(288);
        }
        return dcDriveModeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConfigOptsServo() {
        if (configOptsServoEEnum == null) {
            configOptsServoEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(289);
        }
        return configOptsServoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDualButtonDevicePosition() {
        if (dualButtonDevicePositionEEnum == null) {
            dualButtonDevicePositionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(290);
        }
        return dualButtonDevicePositionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDualButtonLedSubIds() {
        if (dualButtonLedSubIdsEEnum == null) {
            dualButtonLedSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(291);
        }
        return dualButtonLedSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDualButtonButtonSubIds() {
        if (dualButtonButtonSubIdsEEnum == null) {
            dualButtonButtonSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(292);
        }
        return dualButtonButtonSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getJoystickSubIds() {
        if (joystickSubIdsEEnum == null) {
            joystickSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(293);
        }
        return joystickSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPTCSubIds() {
        if (ptcSubIdsEEnum == null) {
            ptcSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(294);
        }
        return ptcSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIndustrialDual020mASubIds() {
        if (industrialDual020mASubIdsEEnum == null) {
            industrialDual020mASubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(295);
        }
        return industrialDual020mASubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRotaryEncoderSubIds() {
        if (rotaryEncoderSubIdsEEnum == null) {
            rotaryEncoderSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(296);
        }
        return rotaryEncoderSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getColorBrickletSubIds() {
        if (colorBrickletSubIdsEEnum == null) {
            colorBrickletSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(297);
        }
        return colorBrickletSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLoadCellSubIds() {
        if (loadCellSubIdsEEnum == null) {
            loadCellSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(298);
        }
        return loadCellSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIndustrialDualAnalogInSubIds() {
        if (industrialDualAnalogInSubIdsEEnum == null) {
            industrialDualAnalogInSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(299);
        }
        return industrialDualAnalogInSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLaserRangeFinderSubIds() {
        if (laserRangeFinderSubIdsEEnum == null) {
            laserRangeFinderSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(300);
        }
        return laserRangeFinderSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAccelerometerSubIds() {
        if (accelerometerSubIdsEEnum == null) {
            accelerometerSubIdsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(301);
        }
        return accelerometerSubIdsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMIPConnection() {
        if (mipConnectionEDataType == null) {
            mipConnectionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(0);
        }
        return mipConnectionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerDevice() {
        if (mTinkerDeviceEDataType == null) {
            mTinkerDeviceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(1);
        }
        return mTinkerDeviceEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMLogger() {
        if (mLoggerEDataType == null) {
            mLoggerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(2);
        }
        return mLoggerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMAtomicBoolean() {
        if (mAtomicBooleanEDataType == null) {
            mAtomicBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(3);
        }
        return mAtomicBooleanEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerforgeDevice() {
        if (mTinkerforgeDeviceEDataType == null) {
            mTinkerforgeDeviceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(4);
        }
        return mTinkerforgeDeviceEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickDC() {
        if (mTinkerBrickDCEDataType == null) {
            mTinkerBrickDCEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(5);
        }
        return mTinkerBrickDCEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickStepper() {
        if (mTinkerBrickStepperEDataType == null) {
            mTinkerBrickStepperEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(6);
        }
        return mTinkerBrickStepperEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletDualRelay() {
        if (mTinkerBrickletDualRelayEDataType == null) {
            mTinkerBrickletDualRelayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(7);
        }
        return mTinkerBrickletDualRelayEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletIndustrialQuadRelay() {
        if (mTinkerBrickletIndustrialQuadRelayEDataType == null) {
            mTinkerBrickletIndustrialQuadRelayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(8);
        }
        return mTinkerBrickletIndustrialQuadRelayEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletIndustrialDigitalIn4() {
        if (mTinkerBrickletIndustrialDigitalIn4EDataType == null) {
            mTinkerBrickletIndustrialDigitalIn4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(9);
        }
        return mTinkerBrickletIndustrialDigitalIn4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletIndustrialDigitalOut4() {
        if (mTinkerBrickletIndustrialDigitalOut4EDataType == null) {
            mTinkerBrickletIndustrialDigitalOut4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(10);
        }
        return mTinkerBrickletIndustrialDigitalOut4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSwitchState() {
        if (switchStateEDataType == null) {
            switchStateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(11);
        }
        return switchStateEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDigitalValue() {
        if (digitalValueEDataType == null) {
            digitalValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(12);
        }
        return digitalValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getHSBValue() {
        if (hsbValueEDataType == null) {
            hsbValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(13);
        }
        return hsbValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletIO16() {
        if (tinkerBrickletIO16EDataType == null) {
            tinkerBrickletIO16EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(14);
        }
        return tinkerBrickletIO16EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickServo() {
        if (mTinkerBrickServoEDataType == null) {
            mTinkerBrickServoEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(15);
        }
        return mTinkerBrickServoEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerforgeValue() {
        if (mTinkerforgeValueEDataType == null) {
            mTinkerforgeValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(16);
        }
        return mTinkerforgeValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMDecimalValue() {
        if (mDecimalValueEDataType == null) {
            mDecimalValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(17);
        }
        return mDecimalValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletHumidity() {
        if (mTinkerBrickletHumidityEDataType == null) {
            mTinkerBrickletHumidityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(18);
        }
        return mTinkerBrickletHumidityEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletHumidityV2() {
        if (mTinkerBrickletHumidityV2EDataType == null) {
            mTinkerBrickletHumidityV2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(19);
        }
        return mTinkerBrickletHumidityV2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletDistanceIR() {
        if (mTinkerBrickletDistanceIREDataType == null) {
            mTinkerBrickletDistanceIREDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(20);
        }
        return mTinkerBrickletDistanceIREDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletTemperature() {
        if (mTinkerBrickletTemperatureEDataType == null) {
            mTinkerBrickletTemperatureEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(21);
        }
        return mTinkerBrickletTemperatureEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletBarometer() {
        if (mTinkerBrickletBarometerEDataType == null) {
            mTinkerBrickletBarometerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(22);
        }
        return mTinkerBrickletBarometerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletAmbientLight() {
        if (mTinkerBrickletAmbientLightEDataType == null) {
            mTinkerBrickletAmbientLightEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(23);
        }
        return mTinkerBrickletAmbientLightEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMTinkerBrickletLCD20x4() {
        if (mTinkerBrickletLCD20x4EDataType == null) {
            mTinkerBrickletLCD20x4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(24);
        }
        return mTinkerBrickletLCD20x4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletRemoteSwitch() {
        if (tinkerBrickletRemoteSwitchEDataType == null) {
            tinkerBrickletRemoteSwitchEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(25);
        }
        return tinkerBrickletRemoteSwitchEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletMotionDetector() {
        if (tinkerBrickletMotionDetectorEDataType == null) {
            tinkerBrickletMotionDetectorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(26);
        }
        return tinkerBrickletMotionDetectorEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletMultiTouch() {
        if (tinkerBrickletMultiTouchEDataType == null) {
            tinkerBrickletMultiTouchEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(27);
        }
        return tinkerBrickletMultiTouchEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletTemperatureIR() {
        if (tinkerBrickletTemperatureIREDataType == null) {
            tinkerBrickletTemperatureIREDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(28);
        }
        return tinkerBrickletTemperatureIREDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletSoundIntensity() {
        if (tinkerBrickletSoundIntensityEDataType == null) {
            tinkerBrickletSoundIntensityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(29);
        }
        return tinkerBrickletSoundIntensityEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletMoisture() {
        if (tinkerBrickletMoistureEDataType == null) {
            tinkerBrickletMoistureEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(30);
        }
        return tinkerBrickletMoistureEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletDistanceUS() {
        if (tinkerBrickletDistanceUSEDataType == null) {
            tinkerBrickletDistanceUSEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(31);
        }
        return tinkerBrickletDistanceUSEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletVoltageCurrent() {
        if (tinkerBrickletVoltageCurrentEDataType == null) {
            tinkerBrickletVoltageCurrentEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(32);
        }
        return tinkerBrickletVoltageCurrentEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletTilt() {
        if (tinkerBrickletTiltEDataType == null) {
            tinkerBrickletTiltEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(33);
        }
        return tinkerBrickletTiltEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletIO4() {
        if (tinkerBrickletIO4EDataType == null) {
            tinkerBrickletIO4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(34);
        }
        return tinkerBrickletIO4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletHallEffect() {
        if (tinkerBrickletHallEffectEDataType == null) {
            tinkerBrickletHallEffectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(35);
        }
        return tinkerBrickletHallEffectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletSegmentDisplay4x7() {
        if (tinkerBrickletSegmentDisplay4x7EDataType == null) {
            tinkerBrickletSegmentDisplay4x7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(36);
        }
        return tinkerBrickletSegmentDisplay4x7EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletLEDStrip() {
        if (tinkerBrickletLEDStripEDataType == null) {
            tinkerBrickletLEDStripEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(37);
        }
        return tinkerBrickletLEDStripEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBrickletJoystick() {
        if (brickletJoystickEDataType == null) {
            brickletJoystickEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(38);
        }
        return brickletJoystickEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletLinearPoti() {
        if (tinkerBrickletLinearPotiEDataType == null) {
            tinkerBrickletLinearPotiEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(39);
        }
        return tinkerBrickletLinearPotiEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletDualButton() {
        if (tinkerBrickletDualButtonEDataType == null) {
            tinkerBrickletDualButtonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(40);
        }
        return tinkerBrickletDualButtonEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletPTC() {
        if (tinkerBrickletPTCEDataType == null) {
            tinkerBrickletPTCEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(41);
        }
        return tinkerBrickletPTCEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletIndustrialDual020mA() {
        if (tinkerBrickletIndustrialDual020mAEDataType == null) {
            tinkerBrickletIndustrialDual020mAEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(42);
        }
        return tinkerBrickletIndustrialDual020mAEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletSolidStateRelay() {
        if (tinkerBrickletSolidStateRelayEDataType == null) {
            tinkerBrickletSolidStateRelayEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(43);
        }
        return tinkerBrickletSolidStateRelayEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletPiezoSpeaker() {
        if (tinkerBrickletPiezoSpeakerEDataType == null) {
            tinkerBrickletPiezoSpeakerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(44);
        }
        return tinkerBrickletPiezoSpeakerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletRotaryEncoder() {
        if (tinkerBrickletRotaryEncoderEDataType == null) {
            tinkerBrickletRotaryEncoderEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(45);
        }
        return tinkerBrickletRotaryEncoderEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletAmbientLightV2() {
        if (tinkerBrickletAmbientLightV2EDataType == null) {
            tinkerBrickletAmbientLightV2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(46);
        }
        return tinkerBrickletAmbientLightV2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletDustDetector() {
        if (tinkerBrickletDustDetectorEDataType == null) {
            tinkerBrickletDustDetectorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(47);
        }
        return tinkerBrickletDustDetectorEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletLoadCell() {
        if (tinkerBrickletLoadCellEDataType == null) {
            tinkerBrickletLoadCellEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(48);
        }
        return tinkerBrickletLoadCellEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletColor() {
        if (tinkerBrickletColorEDataType == null) {
            tinkerBrickletColorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(49);
        }
        return tinkerBrickletColorEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletIndustrialDualAnalogIn() {
        if (tinkerBrickletIndustrialDualAnalogInEDataType == null) {
            tinkerBrickletIndustrialDualAnalogInEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(50);
        }
        return tinkerBrickletIndustrialDualAnalogInEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletAnalogInV2() {
        if (tinkerBrickletAnalogInV2EDataType == null) {
            tinkerBrickletAnalogInV2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(51);
        }
        return tinkerBrickletAnalogInV2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletAnalogIn() {
        if (tinkerBrickletAnalogInEDataType == null) {
            tinkerBrickletAnalogInEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(52);
        }
        return tinkerBrickletAnalogInEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletLaserRangeFinder() {
        if (tinkerBrickletLaserRangeFinderEDataType == null) {
            tinkerBrickletLaserRangeFinderEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(53);
        }
        return tinkerBrickletLaserRangeFinderEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletAccelerometer() {
        if (tinkerBrickletAccelerometerEDataType == null) {
            tinkerBrickletAccelerometerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(54);
        }
        return tinkerBrickletAccelerometerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletOLED128x64() {
        if (tinkerBrickletOLED128x64EDataType == null) {
            tinkerBrickletOLED128x64EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(55);
        }
        return tinkerBrickletOLED128x64EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletOLED64x48() {
        if (tinkerBrickletOLED64x48EDataType == null) {
            tinkerBrickletOLED64x48EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(56);
        }
        return tinkerBrickletOLED64x48EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletThermocouple() {
        if (tinkerBrickletThermocoupleEDataType == null) {
            tinkerBrickletThermocoupleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(57);
        }
        return tinkerBrickletThermocoupleEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletUVLight() {
        if (tinkerBrickletUVLightEDataType == null) {
            tinkerBrickletUVLightEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(58);
        }
        return tinkerBrickletUVLightEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletCO2() {
        if (tinkerBrickletCO2EDataType == null) {
            tinkerBrickletCO2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(59);
        }
        return tinkerBrickletCO2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTinkerBrickletAnalogOutV2() {
        if (tinkerBrickletAnalogOutV2EDataType == null) {
            tinkerBrickletAnalogOutV2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(60);
        }
        return tinkerBrickletAnalogOutV2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getHSBType() {
        if (hsbTypeEDataType == null) {
            hsbTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(61);
        }
        return hsbTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUpDownType() {
        if (upDownTypeEDataType == null) {
            upDownTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(62);
        }
        return upDownTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPercentValue() {
        if (percentValueEDataType == null) {
            percentValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(63);
        }
        return percentValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDeviceOptions() {
        if (deviceOptionsEDataType == null) {
            deviceOptionsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(64);
        }
        return deviceOptionsEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPercentType() {
        if (percentTypeEDataType == null) {
            percentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(65);
        }
        return percentTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIncreaseDecreaseType() {
        if (increaseDecreaseTypeEDataType == null) {
            increaseDecreaseTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(66);
        }
        return increaseDecreaseTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDirectionValue() {
        if (directionValueEDataType == null) {
            directionValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(67);
        }
        return directionValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEnum() {
        if (enumEDataType == null) {
            enumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(68);
        }
        return enumEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactory getModelFactory() {
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
    public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
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
    public void fixPackageContents() {
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
    protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("org.openhab.binding.tinkerforge.internal.model." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //ModelPackageImpl
