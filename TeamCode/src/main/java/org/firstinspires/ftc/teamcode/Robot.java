package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {
    DcMotor lf;
    DcMotor lb;
    DcMotor rf;
    DcMotor rb;
    public Robot(HardwareMap hmap) {
        lf = hmap.get(DcMotor.class, "leftFront");
        lb = hmap.get(DcMotor.class, "leftBack");
        rf = hmap.get(DcMotor.class, "rightFront");
        rb = hmap.get(DcMotor.class, "rightBack");
    }
    public void setPowers(MotorPowers m) {
        lf.setPower(m.lf);
        lb.setPower(m.lb);
        rf.setPower(m.rf);
        rb.setPower(m.rb);
    }
    public void setAll(double p) {
        lf.setPower(p);
        lb.setPower(p);
        rf.setPower(p);
        rb.setPower(p);
    }
}
