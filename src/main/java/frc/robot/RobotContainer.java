// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.playSong;
import frc.robot.subsystems.falconOrchestra;

public class RobotContainer {

  private SendableChooser<String> m_chooser = new SendableChooser<String>();
  private XboxController m_xbox = new XboxController(0);
  private falconOrchestra m_orchestra = new falconOrchestra();

  public RobotContainer() {

    configureButtonBindings();

  }

  public void putSongSelector() {

    m_chooser.setDefaultOption("Example song", "song-name.chrp");
    SmartDashboard.putData("Song Chooser", m_chooser);

}

  private void configureButtonBindings() {

    new JoystickButton(m_xbox, Button.kY.value).whenPressed(new playSong(m_orchestra, m_chooser.getSelected()));

  }


  public Command getAutonomousCommand() {
    
    return null;
    
  }
}
