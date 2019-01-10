package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeArm extends Subsystem {
	
	public void openOrClose(boolean open) {
		RobotMap.SOLENOID_intake1.set(open);
		RobotMap.SOLENOID_intake2.set(!open);
	}

	public void initDefaultCommand() {
	}
}
