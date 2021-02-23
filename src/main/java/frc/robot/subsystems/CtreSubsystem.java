package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class CtreSubsystem extends SubsystemBase {

  WPI_VictorSPX victor;
  WPI_TalonSRX talon1;
  WPI_TalonSRX talon2;
  WPI_TalonSRX falcon;

  DigitalInput limitSwitch;

  /** Creates a new ExampleSubsystem. */
  public CtreSubsystem() {
    victor = new WPI_VictorSPX(Constants.VICTOR_ID);
    talon1 = new WPI_TalonSRX(Constants.TALON_1_ID);
    talon2 = new WPI_TalonSRX(Constants.TALON_2_ID);
    falcon = new WPI_TalonSRX(Constants.FALCON_ID);

    limitSwitch = new DigitalInput(Constants.SWITCH_DIO);
  }

  public void rotateVictor(double speed) {
    victor.set(ControlMode.PercentOutput, speed);
  }

  public void rotateTalon1(double speed) {
    talon1.set(ControlMode.PercentOutput, speed);
  }

  public void rotateTalon2(double speed) {
    talon2.set(ControlMode.PercentOutput, speed);
  }

  public void rotateFalcon(double speed) {
    falcon.set(ControlMode.PercentOutput, speed);
  }

  public boolean isSwitchClosed() {
    return !limitSwitch.get();
  }
}
