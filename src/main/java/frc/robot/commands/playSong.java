package frc.robot.commands;

import com.ctre.phoenix.music.Orchestra;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class playSong extends CommandBase {

    private Orchestra m_orchestra;
    private String m_song;
    
    public playSong(Orchestra orchestra, String song) {

        m_orchestra = orchestra;
        m_song = song;

        addRequirements(orchestra);

    }


}
