package JavaProgram;
@FunctionalInterface
interface S
{
    void show();
}
class R implements S
{
    public void show(){
        System.out.println("In R show");
    }
}

public class Demo6
{
    public static void main(String args[])
    {
        S obj=new R();
        obj.show();
    }
}
