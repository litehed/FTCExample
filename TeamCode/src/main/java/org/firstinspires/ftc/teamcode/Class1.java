// LIBRARIES
package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.ButtonReader;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "ur_mom")
public class Class1 extends LinearOpMode{
    //  VARIABLES
    //  Motors
    private Motor frontLeft;
    private Motor backLeft;
    private Motor frontRight;
    private Motor backRight;

    //  Servo
    private SimpleServo servo;

    //  Game Pad
    private GamepadEx gamePad_1;
    private GamepadEx gamePad_2;

    //  Drives
    private MecanumDrive mechDrive;

    //  Controller
    private ToggleButtonReader yButton, xButton, aButton, bButton, dpUp, dpDown, dpLeft, dpRight, rb, lb;
    private ButtonReader lTrigger, rightTrigger;



    //  OP MODE
    @Override
    public void runOpMode() throws InterruptedException {

    }
}
