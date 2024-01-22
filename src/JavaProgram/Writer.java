package JavaProgram;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String args[]){
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty pooty potty \nFuck off");
            writer.append("\nWhat are you doing mate just go nd sleep");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
