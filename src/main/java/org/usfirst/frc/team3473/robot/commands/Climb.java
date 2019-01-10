package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {

	private boolean wheelDeployed = false;
	
	public Climb() {
		wheelDeployed = false;
	}

	protected void initialize() {
		wheelDeployed = false;
	}

	protected void execute() {
		int axis = 1;
		if (OI.BUTTON_deploy.get()) {
			Subsystems.elevator.deployWheels(true);
		} else if (OI.BUTTON_counterdeploy.get()) {
			Subsystems.elevator.deployWheels(false);
		}
		
		if (Math.abs(OI.JOYSTICK_gamepad.getRawAxis(axis)) > .1) { // arm should go up (+) (hanging arm actuation)
			Subsystems.elevator.actuate(OI.JOYSTICK_gamepad.getRawAxis(axis));
		} else {
			Subsystems.elevator.actuate(0);
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
