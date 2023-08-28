package JavaProgram;
class Atul
{
    public void show1(){
        System.out.println("In Atul Show");
    }
}
class Papul extends Atul{
    public void show2(){
        System.out.println("In papul Show ");
    }

}
public class DownCast {
    public static void main(String args[]){
        //Atul obj=new Atul();
        Atul obj=new Papul();//we have an object of subclass we are assigning it to parent class(upCasting)
      //  obj.show1();
        Papul obj1=(Papul) obj;//Down Casting
        obj1.show2();
    }
}
