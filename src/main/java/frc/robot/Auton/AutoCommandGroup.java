package frc.robot.Auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.CommandSwerveDrivetrain;
import frc.robot.subsystems.Launcher;

/**
 * A complex auto command that drives forward, releases a hatch, and then drives backward.
 */
public class AutoCommandGroup extends SequentialCommandGroup {
  /**
   * Creates a new ComplexAuto.
   *
   * @param drive The drive subsystem this command will run on
   * @param launcher The hatch subsystem this command will run on
   */
  public AutoCommandGroup(CommandSwerveDrivetrain drive, Launcher launcher) {
    addCommands(
        // Drive forward the specified distance
        //new DriveDistance(AutoConstants.kAutoDriveDistanceInches, AutoConstants.kAutoDriveSpeed,
                          //drive),

        // Release the hatch
        //new ReleaseHatch(hatch),

        // Drive backward the specified distance
        //new DriveDistance(AutoConstants.kAutoBackupDistanceInches, -AutoConstants.kAutoDriveSpeed,
                          //drive)
                          );
  }

}