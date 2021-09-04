package org.firstinspires.ftc.teamcode;

        import com.arcrobotics.ftclib.drivebase.MecanumDrive;
        import com.arcrobotics.ftclib.gamepad.ButtonReader;
        import com.arcrobotics.ftclib.gamepad.GamepadEx;
        import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;
        import com.arcrobotics.ftclib.hardware.SimpleServo;
        import com.arcrobotics.ftclib.hardware.motors.Motor;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Basics")
public class MainTeleOp extends LinearOpMode {

    private Motor frontLeft;
    private Motor frontRight;
    private Motor backLeft;
    private Motor backRight;
    private SimpleServo servo;
    private GamepadEx gPad1;
    private GamepadEx gPad2;
    private MecanumDrive drivetrain;
    private ToggleButtonReader buttonReaderY1, buttonReaderA1, buttonReaderX1, buttonReaderB1, buttonReaderdPadUp1, buttonReaderdPadDown1, buttonReaderdPadRight1, buttonReaderdPadLeft1; // Toggle Buttons on Gamepad 1
    private ToggleButtonReader buttonReaderY2, buttonReaderA2, buttonReaderX2, buttonReaderB2, buttonReaderdPadUp2, buttonReaderdPadDown2, buttonReaderdPadRight2, buttonReaderdPadLeft2; // Toggle Buttons on Gamepad 2
    private ButtonReader rightBumper1, leftBumper1; // Bumpers of controller
    private ButtonReader rightBumper2, leftBumper2; // Bumpers of controller

    @Override
    public void runOpMode() throws InterruptedException {

        frontLeft = new Motor(hardwareMap, "frontLeft");
        frontRight = new Motor(hardwareMap, "frontRight");
        backLeft = new Motor(hardwareMap, "backLeft");
        backRight = new Motor(hardwareMap, "backRight");
        servo = new SimpleServo();
    }
}
