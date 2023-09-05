package JavaProgram;
class P{
    public void show(){
        System.out.println("in P show");
    }
}
public class A_Inner
{
    public static void main(String args[]){
        P obj=new P(){
            public void show(){
                System.out.println("in new show");//method of anonymous inner class
            }
        };
        obj.show();
    }
}
