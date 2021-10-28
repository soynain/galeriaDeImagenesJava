package newpackage;

import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebel
 */
public class NewClass {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("test/newpackage/audioProf.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
        try{
            sleep(30000);
        }catch(Exception e){
            
        }
       
    }

}
