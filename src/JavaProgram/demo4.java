package JavaProgram;
class C
{
    int age;
    public void show(){
        System.out.println("in C show");
    }
    static class D{       //inner class
        public void config(){
            System.out.println("in config");
        }
    }
}

public class demo4 {
    public static void main(String args[]){
        C obj=new C();
        obj.show();
      // C.D obj1=obj.new D();//non-static class
      C.D obj1=new C.D();  //if i will make the innerclass static
       obj1.config();
    }
}
