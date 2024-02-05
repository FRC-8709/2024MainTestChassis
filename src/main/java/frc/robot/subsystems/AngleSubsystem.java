package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AngleConstants;

public class AngleSubsystem extends SubsystemBase {
    public final TalonFX masterMotor;
    public final TalonFX followerMotor;

    public AngleSubsystem(TalonFX masterMotor, TalonFX followerMotor) {
        this.masterMotor = masterMotor;
        this.followerMotor = followerMotor;
        // motors going opposite directions, change to false if they need to go the same direction for any reason
        followerMotor.setControl(new Follower(masterMotor.getDeviceID(), true));
        //set the mode to brake. make motor hard stop
        masterMotor.setNeutralMode(NeutralModeValue.Brake);
        followerMotor.setNeutralMode(NeutralModeValue.Brake);

    }

    public void setMotors(double speed) {
        // for setting the speed in the command file
        masterMotor.setControl(AngleConstants.kLauncherVoltageOut.withOutput(speed));

    }
}