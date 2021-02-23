package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class SparkSubsystem extends SubsystemBase {

  CANSparkMax motor;

  public SparkSubsystem() {
    motor = new CANSparkMax(Constants.SPARK_ID, MotorType.kBrushless);
  }

  public void rotateMotor(double speed) {
    motor.set(speed);
  }

  public double getEncoderValue() {
    return motor.getEncoder().getVelocity();
  }
  public void stopMotor() {
    motor.set(0);
  }
}
