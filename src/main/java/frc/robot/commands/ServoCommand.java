package frc.robot.commands;

import frc.robot.subsystems.CtreSubsystem;
import frc.robot.subsystems.ServoSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ServoCommand extends CommandBase {
  private final ServoSubsystem m_subsystem;

  private double angle;

  public ServoCommand(ServoSubsystem subsystem, double newAngle) {
    m_subsystem = subsystem;
    angle = newAngle;
    addRequirements(subsystem);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.setAngle(this.angle);
  }

}
