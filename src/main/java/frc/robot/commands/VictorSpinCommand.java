package frc.robot.commands;

import frc.robot.subsystems.CtreSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class VictorSpinCommand extends CommandBase {
  private final CtreSubsystem m_subsystem;

  public VictorSpinCommand(CtreSubsystem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.rotateVictor(0.3);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.rotateVictor(0);
  }

}
