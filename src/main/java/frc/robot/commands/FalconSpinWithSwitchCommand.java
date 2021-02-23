package frc.robot.commands;

import frc.robot.subsystems.CtreSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class FalconSpinWithSwitchCommand extends CommandBase {
  private final CtreSubsystem m_subsystem;

  public FalconSpinWithSwitchCommand(CtreSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_subsystem.rotateFalcon(0.3);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.rotateFalcon(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_subsystem.isSwitchClosed();
  }

}
