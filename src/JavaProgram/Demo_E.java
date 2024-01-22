package JavaProgram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Demo_E
{
    public static void main(String args[]) throws IOException {
        int num=0;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
