package org.usfirst.frc.team687.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team687.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick leftDrivestick; 
	public static Joystick rightDrivestick;
	
	public OI() {
		
		leftDrivestick = new Joystick(RobotMap.leftStick); 
		rightDrivestick = new Joystick(RobotMap.rightStick);
		
	}
	
}
