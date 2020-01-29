/*------------------------------------------------------------------------------
  Copyright (c) 2020 Raider Robotics. All Rights Reserved.
  Working within the First Robotics Software Set. This is the Main controller
  class for the QuarterBack Robot for the Raider Robotics Football Team.
------------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
    private Main() {
    }

    /*
     * Main initialization function. Do not perform any initialization here.
     * <p> If you change your main robot class, change the parameter type.
     */
    public static void main(String... args) {
        RobotBase.startRobot(Robot::new);
    }
}
