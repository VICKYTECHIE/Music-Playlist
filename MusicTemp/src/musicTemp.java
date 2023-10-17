import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class musicTemp extends JFrame{
     musicTemp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
         // ImageIcon is a Instance class to add icon frame;
         ImageIcon icon = new ImageIcon("mu.png");
         ImageIcon lableIcon = new ImageIcon("ear.jpg");

         //Border for outline ;
         // Border border = BorderFactory.createLineBorder(new Color(143,0,255));

         //lable is a Instance class to add picture on frame;
         JLabel pic = new JLabel();
         pic.setVerticalAlignment(JLabel.CENTER);
         pic.setIcon(lableIcon);

         //frame to the playlist;
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(553,510);
         this.setResizable(false);
         this.setVisible(true);
         this.setTitle("Music Playlist");
         this.add(pic);
         this.setIconImage(icon.getImage());

         // Adding audio to temp using class (File,AudioInputStream,Clip)
         File file = new File("Attitude Bgm.wav");
         AudioInputStream audio = AudioSystem.getAudioInputStream(file);
         Clip clip =AudioSystem.getClip();
         clip.open(audio);
         clip.start();
     }
}
