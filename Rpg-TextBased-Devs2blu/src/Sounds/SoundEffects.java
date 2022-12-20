package Sounds;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class SoundEffects {
	Clip clip;
	public void setFile(String soundFileName) {
		try {
			File file = new File(soundFileName);
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(sound);
		} 
		catch(Exception e) {
			
		}
	}
	
	public void play() {
			clip.setFramePosition(0);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		clip.setFramePosition(0);
		clip.stop();
	}

	public void playEffectButton() {
		clip.setFramePosition(0);
		clip.start();
	}
}
