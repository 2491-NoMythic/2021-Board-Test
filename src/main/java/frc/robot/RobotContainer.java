// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.VictorSpinCommand;
import frc.robot.commands.FalconSpinWithSwitchCommand;
import frc.robot.commands.ServoCommand;
import frc.robot.commands.SparkSpinCommand;
import frc.robot.subsystems.CtreSubsystem;
import frc.robot.subsystems.ServoSubsystem;
import frc.robot.subsystems.SparkSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final CtreSubsystem m_ctreSubsystem = new CtreSubsystem();
  private final SparkSubsystem m_sparkSubsystem = new SparkSubsystem();
  private final ServoSubsystem m_servoSubsystem = new ServoSubsystem();

  private final VictorSpinCommand m_victorSpinCommand = new VictorSpinCommand(m_ctreSubsystem);
  private final FalconSpinWithSwitchCommand m_falconCommand = new FalconSpinWithSwitchCommand(m_ctreSubsystem);
  private final SparkSpinCommand m_sparkSpinCommand = new SparkSpinCommand(m_sparkSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    // m_ctreSubsystem.setDefaultCommand(m_motor1Command);

    Shuffleboard.getTab("Control").add("CTRE Motors", m_ctreSubsystem);
    Shuffleboard.getTab("Control").add("Spark Motors", m_sparkSubsystem);
    Shuffleboard.getTab("Control").add("Servo", m_servoSubsystem);
    Shuffleboard.getTab("Control").add("Spin Victor", m_victorSpinCommand);
    Shuffleboard.getTab("Control").add("Spin Falcon", m_falconCommand);
    Shuffleboard.getTab("Control").add("Spin Spark", m_sparkSpinCommand);
    Shuffleboard.getTab("Control").add("Servo POS 1", new ServoCommand(m_servoSubsystem, Constants.SERVO_POS_1));
    Shuffleboard.getTab("Control").add("Servo POS 2", new ServoCommand(m_servoSubsystem, Constants.SERVO_POS_2));
    Shuffleboard.getTab("Control").add("Servo POS 3", new ServoCommand(m_servoSubsystem, Constants.SERVO_POS_3));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  public Command getTestCommand() {
    return m_victorSpinCommand;
  }

}
