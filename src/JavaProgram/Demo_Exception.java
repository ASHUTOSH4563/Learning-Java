package JavaProgram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_Exception
{
    public static void main(String args[])throws IOException{
//        System.out.println("Enter a number");
//        //int num=System.in.read();
//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader bf=new BufferedReader( in);
//      //  int num=Integer.parseInt(bf.readLine());
//        String num=bf.readLine();
//        System.out.println(num);
        int i=0;
        int j=0;
        try
        {
            j=18/i;
            System.out.println("Bye");
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
           // System.out.println("Bye");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
