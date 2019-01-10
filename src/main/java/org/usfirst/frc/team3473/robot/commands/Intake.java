package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command {

	public Intake() {
	}

	protected void initialize() {
	}

	protected void execute() {
		
		// intake/outtake
		if (OI.BUTTON_intake.get()) {
			Subsystems.intake.openOrClose(true);
		} else if (OI.BUTTON_outtake.get()) {
			Subsystems.intake.openOrClose(false);
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
