package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.falconOrchestra;

public class playSong extends CommandBase {

    private falconOrchestra m_orchestra;
    private String m_song;
    
    public playSong(falconOrchestra orchestra, String song) {

        m_orchestra = orchestra;
        m_song = song;

        addRequirements(orchestra);

    }

    @Override
    public void execute() {

        m_orchestra.playSong(m_song);

    }

    @Override
    public void end(boolean isInterrupted) {

        m_orchestra.stopSong();

    }


}
