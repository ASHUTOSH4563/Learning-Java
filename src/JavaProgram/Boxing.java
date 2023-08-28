package JavaProgram;

public class Boxing
{
    public static void main(String args[]){
        int num=7;
        Integer num1=num; //autoboxing
        int num2=num1.intValue();//unboxing
        System.out.println(num2);
        //how to get a integer from string
        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
