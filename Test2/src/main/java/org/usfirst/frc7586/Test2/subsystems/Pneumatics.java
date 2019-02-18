/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7586.Test2.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7586.Test2.commands.PneumaticsTest;


// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Pneumatics extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    private static final double kMaxPressure = 2.55;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DoubleSolenoid doubleSolenoid1;
    private Solenoid solenoid1;
    private Solenoid solenoid2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Pneumatics() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        doubleSolenoid1 = new DoubleSolenoid(10, 0, 1);
        addChild("Double Solenoid 1", doubleSolenoid1);

        solenoid1 = new Solenoid(10, 6);
        addChild("Solenoid 1", solenoid1);

        solenoid2 = new Solenoid(10, 7);
        addChild("Solenoid 2", solenoid2);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new PneumaticsTest());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public void setSolenoid1(XboxController x) {
        if (x.getAButton())
            this.solenoid1.set(true);
        if (x.getBButton())
            this.solenoid1.set(false);
    }

    public void setSolenoid2(XboxController x) {
        if (x.getAButton())
            this.solenoid2.set(true);
        if (x.getBButton())
            this.solenoid2.set(false);
    }

    public void setDoubleSolenoid1(XboxController x) {
        if (x.getAButton())
            this.doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
        if (x.getBButton())
            this.doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }
    

    public void stop() {
        this.solenoid1.set(false);
        this.solenoid2.set(false);
        this.doubleSolenoid1.set(Value.kOff);

    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

  
}