package org.firstinspires.ftc.teamcode; // adds in all the methods/features from the FTC SDK already created

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode; // this means we are using some code from the FTC Package, specifically, the code for OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Vivienne");
    }

    @Override
    public void loop() {

    }
}
