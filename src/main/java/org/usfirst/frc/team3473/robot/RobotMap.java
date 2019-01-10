package org.usfirst.frc.team3473.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Solenoid;

public class RobotMap {

	/**
	 *  Sensors
	 */
	public static ADXRS450_Gyro gyro;
	
	/** 
	 *  Talons
	 */
	
	public static WPI_TalonSRX  TALON_frontRIGHT,
				TALON_backRIGHT,
				TALON_frontLEFT,
				TALON_backLEFT,
				TALON_intakeActuation,          
				TALON_hangExtension;

	public static Solenoid SOLENOID_intake1,
				SOLENOID_intake2,
				SOLENOID_backwheel1,
				SOLENOID_backwheel2;
	/**
	 *  Initialize every sensor and talon
	 */
	public static void init() {

		TALON_frontRIGHT = new WPI_TalonSRX(Phannels.PORT_drivebaseFrontRIGHT);
		TALON_backRIGHT = new WPI_TalonSRX(Phannels.PORT_drivebaseBackRIGHT);
		TALON_backLEFT = new WPI_TalonSRX(Phannels.PORT_drivebaseBackLEFT);
		TALON_frontLEFT = new WPI_TalonSRX(Phannels.PORT_drivebaseFrontLEFT);
		TALON_intakeActuation = new WPI_TalonSRX(Phannels.PORT_intakeActuation);
		TALON_hangExtension = new WPI_TalonSRX(Phannels.PORT_hangExtension);
		
		
		SOLENOID_intake1 = new Solenoid(Phannels.CHANNEL_intake1);
		SOLENOID_intake2 = new Solenoid(Phannels.CHANNEL_intake2);
		SOLENOID_backwheel1 = new Solenoid(Phannels.CHANNEL_backwheel1);
		SOLENOID_backwheel2 = new Solenoid(Phannels.CHANNEL_backwheel2);

		gyro = new ADXRS450_Gyro();
	}

}
