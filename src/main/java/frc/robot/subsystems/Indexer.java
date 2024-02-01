package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LauncherConstants;

public class Indexer extends SubsystemBase {
    private final TalonFX IndexMotor;

    public Indexer(TalonFX IndexMotor) {
        this.IndexMotor = IndexMotor;
    }

    public void setMotors(double speed) {
        // for setting the speed in the command file
        IndexMotor.setControl(LauncherConstants.kLauncherVoltageOut.withOutput(speed));
        IndexMotor.setNeutralMode(NeutralModeValue.Coast);
    }
}