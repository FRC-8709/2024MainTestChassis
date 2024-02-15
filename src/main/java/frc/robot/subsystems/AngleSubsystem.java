package frc.robot.subsystems;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AngleConstants;


public class AngleSubsystem extends SubsystemBase {
    public final TalonFX masterMotor;
    public final TalonFX followerMotor;
    private Encoder armEncoder;
    

    //private double temp = masterMotor.getEncoder;
    

    public AngleSubsystem(TalonFX masterMotor, TalonFX followerMotor, int channelA, int channelB) {
        this.masterMotor = masterMotor;
        this.followerMotor = followerMotor;   
        followerMotor.setControl(new Follower(masterMotor.getDeviceID(), true));
        //set the mode to brake. make motor hard stop
        this.armEncoder = new Encoder(channelA, channelB);
        
        masterMotor.setNeutralMode(NeutralModeValue.Brake);
        followerMotor.setNeutralMode(NeutralModeValue.Brake);
    }

    public void setMotors(double speed) {
        // for setting the speed in the command file
        // motors going opposite directions, change to false if they need to go the same direction for any reason
        masterMotor.setControl(AngleConstants.kLauncherVoltageOut.withOutput(speed));
        //SmartDashboard.putNumber("ArmEncoder", armEncoder.get());     

    }
    @Override
    public void periodic(){
       var temp = masterMotor.getRotorPosition();
       //SmartDashboard.putNumber("ArmEncoder", armEncoder.get());  
       SmartDashboard.putNumber("armMotorTicks", temp.getValueAsDouble());
    }

}