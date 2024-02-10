// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class storageConstants {
    public static final int BEAM_BREAK_RECEIVER_DIO = 0;
  }

  public static class intakeConstants {
    public static final int INTAKE_MOTOR_CAN_ID = 0;
    public static final double INTAKE_MOTOR_SPIN_SPEED = 0;
  }

  public static class cannonConstants {

    public static final int RIGHT_MOTOR_CAN_ID = 0;
    public static final int LEFT_MOTOR_CAN_ID = 0;
    public static final double AMP_FIRING_POWER = 0.5;
    public static final double CANNON_FIRING_POWER = 1;
  }

  public static final class DriveConstants {
    public static final int kLeftFrontMotorPort = 6;
    public static final int kRightFrontMotorPort = 5;
    public static final int kLeftBackMotorPort = 3;
    public static final int kRightBackMotorPort = 2;

    public static final int kLeftEncoderChannelA = 0;
    public static final int kLeftEncoderChannelB = 1;
    public static final int kRightEncoderChannelA = 2;
    public static final int kRightEncoderChannelB = 3;
    public static final double kEncoderTick2Feet = 1.0 / 2048.0 * Math.PI * 9 / 17.8;

    public static final double kAutoDriveForwardSpeed = 0.75;
    public static final double kAutoDriveForwardDistance = -7;

    public static final double returnLimit = 0.6;
    
    public static final double forwardMaxSpeed = 0.75;
  }


  public static class cameraConstants {
    public static final String TAG_CAMERA = "Arducam_OV9281_USB_Camera";
    public static final String NOTE_CAMERA = "Microsoft_LifeCam_HD-3000";
  }

  public static final class Joystick {
    public static final int kButtonY = 4;
    public static final int kButtonX = 3;
    public static final int kButtonB = 2;
    public static final int kButtonA = 1;

    public static final int kLeftJoy = 1;
    public static final int kRightJoy = 5;

    public static final int leftBtn = 5;
    public static final int rightBtn = 6;
  }
}
