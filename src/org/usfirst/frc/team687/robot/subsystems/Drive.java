package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.OI;
import org.usfirst.frc.team687.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
	@Override
	protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}
	
	Victor leftF = new Victor(RobotMap.leftFront); 
	Victor rightF = new Victor(RobotMap.rightFront); 
	Victor leftB = new Victor(RobotMap.leftBack);
	Victor rightB = new Victor(RobotMap.rightBack);

    public void Driving() {
        
    	leftF.set(-OI.leftDrivestick.getY());
    	rightF.set(OI.rightDrivestick.getY());
    	leftB.set(-OI.leftDrivestick.getY());
    	rightB.set(OI.rightDrivestick.getY());
    	
    }

}

