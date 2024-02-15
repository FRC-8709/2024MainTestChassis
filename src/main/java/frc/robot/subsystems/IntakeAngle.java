package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeAngle extends SubsystemBase {
    public final CANSparkMax IndexMotor;

    public IntakeAngle(CANSparkMax IndexMotor) {
        this.IndexMotor = IndexMotor;
        IndexMotor.setIdleMode(IdleMode.kBrake);
    }

    public void setMotors(double speed) {
        // for setting the speed in the command file
        IndexMotor.setVoltage(speed);
        
    }
}