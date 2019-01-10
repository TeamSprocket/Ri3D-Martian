package org.usfirst.frc.team3473.robot;

import org.usfirst.frc.team3473.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3473.robot.subsystems.Elevator;
import org.usfirst.frc.team3473.robot.subsystems.IntakeArm;

import edu.wpi.first.wpilibj.CameraServer;

public class Subsystems {
	public static Drivetrain drive;
	public static IntakeArm intake;
	public static Elevator elevator;
	public static CameraServer server;
	
	
	public static void init(){
		drive = new Drivetrain();
		intake = new IntakeArm();
		elevator = new Elevator();
		
		//camera init code
		server = CameraServer.getInstance();
	}
	
	
}
