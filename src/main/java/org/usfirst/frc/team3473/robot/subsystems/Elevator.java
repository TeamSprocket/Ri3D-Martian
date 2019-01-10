package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	public void actuate(double speed) {
		RobotMap.TALON_intakeActuation.set(-speed*.8);
		RobotMap.TALON_hangExtension.set(speed*.8);
	}
	
	public void deployWheels(boolean deploy) {
		RobotMap.SOLENOID_backwheel1.set(deploy);
		RobotMap.SOLENOID_backwheel2.set(!deploy);
	}

	public void initDefaultCommand() {
	}
}
