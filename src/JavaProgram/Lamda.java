package JavaProgram;
@FunctionalInterface
interface L_fun
{
    void show();
}
public class Lamda{
    public static void main(String args[]){
//        L_fun obj=new L_fun ()
//        {
//            public void show(){
//                System.out.println("in Show");
//            }
//        };
//        obj.show();

        //-------------------------->
        //Using Lamba Expression
//        L_fun obj=()->
//        {
//            System.out.println("in show");
//        };
        L_fun obj=()-> System.out.println("in show");
        obj.show();
    }
}
