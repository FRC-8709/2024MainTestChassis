// package frc.robot.commands;

// import java.io.IOException;
// import java.nio.file.Path;

// import edu.wpi.first.math.trajectory.Trajectory;
// import edu.wpi.first.math.trajectory.TrajectoryConfig;
// import edu.wpi.first.math.trajectory.TrajectoryUtil;
// import edu.wpi.first.wpilibj.DriverStation;
// import edu.wpi.first.wpilibj.Filesystem;
// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import frc.robot.Constants;
// import frc.robot.generated.TunerConstants;

// public class TeleopAuto extends SequentialCommandGroup{
//     // String trajectoryJSON = "AutoPaths/test.wpilib.json";
//     // Trajectory trajectory = new Trajectory();

// public TeleopAuto() {
//     TrajectoryConfig config =
//             new TrajectoryConfig(
//                     Constants.AutoConstants.kMaxSpeedMetersPerSecond,
//                     Constants.AutoConstants.kMaxAccelerationMetersPerSecondSquared)
//                 .setKinematics(TunerConstants.class);

// //    try {
// //       Path trajectoryPath = Filesystem.getDeployDirectory().toPath().resolve(trajectoryJSON);
// //       trajectory = TrajectoryUtil.fromPathweaverJson(trajectoryPath);
// //     } catch (IOException ex) {
// //         DriverStation.reportError("Unable to open trajectory: " + trajectoryJSON, ex.getStackTrace());
// //     }
// //     }
// }
