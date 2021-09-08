package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.ButtonReader;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "")
public class OneClass extends LinearOpMode {

    private Motor frontLeft ;
    private Motor backLeft ;
    private Motor frontRight ;
    private Motor backRight ;

    private SimpleServo servo ;

    private GamepadEx gamePad1 ;
    private GamepadEx gamePad2 ;

    private MecanumDrive mecanumDrive ;

    private ToggleButtonReader  yButton, xButton, aButton, bButton, dPadLeft, dPadRight, dPadUp, dPadDown ;
    private ButtonReader leftTrigger, rightTrigger




    @Override
    public void runOpMode() throws InterruptedException {

    }
}
