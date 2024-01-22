package JavaProgram;
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String args[]){
        String name=JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"You are of "+age +" Years of Old");
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"You are "+height +"cm tall.");
    }
}
