package frc.robot.commands;

import frc.robot.subsystems.SparkSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class SparkSpinCommand extends CommandBase {
  private final SparkSubsystem m_subsystem;

  public SparkSpinCommand(SparkSubsystem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.rotateMotor(0.3);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.stopMotor();
  }
}
