
package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	public void robotInit() {
		
		OI.init();
		RobotMap.init();
		Commands.init();
		Subsystems.init();
		
		//push values to smartdashboard
		SmartDashboard.putNumber("Obstacle", OI.JOYSTICK_throttleLeft.getZ()); // left joystick
		SmartDashboard.putNumber("Position", OI.JOYSTICK_throttleRight.getZ()); // right joystick
	}

	public void disabledInit() {
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		Commands.auton();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		Commands.start();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
	}

	public static void main(String[] args) {
	}
}
