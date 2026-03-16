package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name=":)")
public class ChrisTeleOp extends OpMode {
    public Robot robot;
    public ButtonMap bm;
    @Override
    public void init() {
        robot = new Robot(hardwareMap);
        bm = new ButtonMap();
    }

    @Override
    public void loop() {
        bm.loop(robot, this);
    }
}
