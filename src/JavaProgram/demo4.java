package JavaProgram;
class C
{
    int age;
    public void show(){
        System.out.println("in C show");
    }
    class D{       //inner class
        public void config(){
            System.out.println("in config");
        }
    }
}

public class demo4 {
    public static void main(String args[]){
        C obj=new C();
        obj.show();
       C.D obj1=obj.new D();
       obj1.config();
    }
}
