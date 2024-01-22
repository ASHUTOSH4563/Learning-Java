package JavaProgram;

public class Demo_Excep
{
    public static void main(String args[]){
        try
        {
            Class.forName("JavaProgram.Demo_Excep");
        }catch(ClassNotFoundException e){
            System.out.println("Not able to find the class");
        }
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
            throw new ArithmeticException("I don't want zero");
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("thats the default output "+e);
        }
        catch(Exception e){
            System.out.println("sometimes went wrong"+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
