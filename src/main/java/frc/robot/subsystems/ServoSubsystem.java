package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

/**
 * This is just an example and a real subsystem would not have just a servo
 */
public class ServoSubsystem extends SubsystemBase {

  Servo servo;

  public ServoSubsystem() {
    servo = new Servo(Constants.SERVO_PWM_ID);
  }

  public void setAngle(double angle) {
    servo.setAngle(angle);
  }

  public double getAngle() {
    return servo.getAngle();
  }
}
