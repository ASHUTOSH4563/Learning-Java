package JavaProgram;
abstract class Computer
 {
    public abstract void code();
}
class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code,compile and run");
    }
}
class Desktop extends Computer
{
    public void code(){
        System.out.println("code,compile and run:Faster");
    }
}
class developer{
    public void devapp(Computer lap){
        lap.code();
    }
}

public class Demo5 {
    public static void main(String args[]){
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        developer ashutosh=new developer();
        ashutosh.devapp(desk );
    }
}
