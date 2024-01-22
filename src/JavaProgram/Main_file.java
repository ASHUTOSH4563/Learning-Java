package JavaProgram;
import java.io.File;
public class Main_file {
    public static void main(String args[]){
        File file=new File("C:/Users/91845/Downloads/exp 6.pdf");
        if(file.exists()){
            System.out.println("That file exists ! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("That file doesn't exist :(");
            System.out.println(file.isFile());
        }
    }
}
