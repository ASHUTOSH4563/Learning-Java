package JavaProgram;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audio
{
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException,LineUnavailableException {
        Scanner scanner=new Scanner(System.in);
         File file=new File("Maa.wav");
         AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
         Clip clip=AudioSystem.getClip();
         clip.open(audioStream);
         String response="";
         long pausedPosition=0;

         while(!response.equals("Q")){
             System.out.println("P=play, S=Stop, Q=Quit");
             System.out.println("Enter your choice: ");
             response=scanner.next();
             response=response.toUpperCase();
             switch (response){
                 case "P":
                     if(!clip.isRunning()){
                         if(pausedPosition>0){
                             clip.setMicrosecondPosition(pausedPosition);
                         }
                         clip.start();
                         System.out.println("Audio is playing");
                     }else{
                         System.out.println("Audio is already playing");
                     }
                     break;
                 case "S":
                     if(clip.isRunning()){
                         clip.stop();
                         pausedPosition=clip.getMicrosecondPosition();
                         System.out.println("Audio is stopped");
                     }else{
                         System.out.println("Audio is not playing");
                     }
                     break;
                 case "PA":
                     if(clip.isRunning()){
                         clip.stop();
                         pausedPosition=clip.getMicrosecondPosition();
                         System.out.println("Audio is paused");
                     }else{
                         System.out.println("Audio is not playing");
                     }
                     break;
                 case "R":
                     if(!clip.isRunning() && pausedPosition >0)
                     {
                         clip.setMicrosecondPosition(pausedPosition);
                         clip.start();
                         System.out.println("Audio is resumed");
                     }else
                     {
                         System.out.println("Audio is already playing or not paused");
                     }
                     break;
                 case "Q":
                     break;

                 default:
                     System.out.println("Not a valid response");
             }
         }
         clip.close();
         audioStream.close();
         scanner.close();
    }
}
