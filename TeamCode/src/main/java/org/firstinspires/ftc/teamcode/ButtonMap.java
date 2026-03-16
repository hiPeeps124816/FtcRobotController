package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ButtonMap {
    public void loop(Robot r, OpMode opMode) {
        if (opMode.gamepad1.left_stick_x > 0.1) {
            r.setAll(0.5);
        } else if (opMode.gamepad1.left_stick_x < -0.1) {
            r.setAll(-0.5);
        } else {
            r.setAll(0);
        }
    }
}
