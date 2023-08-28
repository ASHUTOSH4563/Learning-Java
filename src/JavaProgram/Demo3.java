package JavaProgram;
abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}
abstract class wagonR extends car{
    public void drive(){
        System.out.println("Driving...");
    }
}
class updatedwagonR extends wagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Demo3
{
    public static void main(String args[]){
        car obj=new updatedwagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
