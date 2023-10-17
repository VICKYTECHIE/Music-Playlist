import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       //Using GUI creating an Music template:)
       String name = JOptionPane.showInputDialog("May I known your name :)");
       JOptionPane.showMessageDialog(null,"Hello"+" "+ name+" welcome to playlist :):) \nClick ok to Enjoy your Music!!!");
       new musicTemp();


    }
}