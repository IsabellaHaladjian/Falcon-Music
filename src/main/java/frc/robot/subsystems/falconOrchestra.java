package frc.robot.subsystems;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.music.Orchestra;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falconOrchestra extends SubsystemBase {

    private Orchestra m_orchestra;
    TalonFX[] motors = { new TalonFX(0), new TalonFX(1) };
    ArrayList<TalonFX> m_falcons;

    public falconOrchestra() {

        for(int i = 0; i <= motors.length; i++) {

            m_falcons.add(motors[i]);

        }

        m_orchestra = new Orchestra(m_falcons);

    }

    public void playSong(String song) {

        m_orchestra.loadMusic(song);
        m_orchestra.play();

    }

    public void stopSong() {

        m_orchestra.stop();

    }

}
