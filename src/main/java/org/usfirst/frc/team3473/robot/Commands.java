package org.usfirst.frc.team3473.robot;

import org.usfirst.frc.team3473.robot.commands.Climb;
import org.usfirst.frc.team3473.robot.commands.Drive;
import org.usfirst.frc.team3473.robot.commands.Intake;
import org.usfirst.frc.team3473.robot.commands.TurnAnglePID;

public class Commands {
	
	public static Drive drive;
	public static Climb hang;
	public static Intake intake;
	
	
	public static void init(){
		drive = new Drive();
		hang = new Climb();
		intake = new Intake();
	}
	
	public static void start(){
		drive.start();
		hang.start();
		intake.start();
	}
	
	public static void auton(){
		// TurnAnglePID turnAngle = new TurnAnglePID(90);
		// turnAngle.start();
	}
	
}