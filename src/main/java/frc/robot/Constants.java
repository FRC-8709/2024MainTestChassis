// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.signals.NeutralModeValue;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class LauncherConstants{
    public static final VoltageOut kLauncherVoltageOut = new VoltageOut(0);
    // setting up the motors for the launcher to ID 24 and ID 23
    public static final int leftGripper = 24;
    public static final int rightGripper = 23;


  }
  public static final class AngleConstants{
    public static final VoltageOut kLauncherVoltageOut = new VoltageOut(0);
    // setting up the motors for the launcher angle to ID 19 and ID 18
    public static final int LeftAngle = 19;
    public static final int RightAngle = 18;
  }
  public static final class IndexerConstants{
    public static final VoltageOut kLauncherVoltageOut = new VoltageOut(0);
    // setting up the motors for the indexer to ID 22
    public static final int Indexer = 22;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
