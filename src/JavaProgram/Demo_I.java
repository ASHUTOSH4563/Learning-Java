package JavaProgram;
interface O {
    int age=21;
    String  name="Ashutosh";
    void show();
    void config();
}
interface x{
    void run();
}
interface y extends x{
    //void run() will be inherited to this interface
}
class Ram implements O,y{
    public void show(){
        System.out.println("showing...");
    }
    public void config(){
        System.out.println("configing...");
    }
    public void run(){
        System.out.println("Running....");
    }
}
public class Demo_I {
    public static void main(String args[]){
        O obj=new Ram();
        obj.show();
        obj.config();
        System.out.println(O.name);
    }
}
