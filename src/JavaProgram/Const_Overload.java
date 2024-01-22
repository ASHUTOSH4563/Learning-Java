package JavaProgram;
class Pizza{
    String bread;
    String sauce;
    String cheese;
    String Toping;
    Pizza(String bread,String sauce,String cheese){
        this .bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
    }
    Pizza(String bread,String sauce,String cheese,String Toping)
    {
        this .bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.Toping=Toping;
    }
}

public class Const_Overload
{
    public static void main(String args[])
    {
        //Pizza pizza =new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        Pizza pizza1=new Pizza("thicc crust","tomato","mozzerella");
        System.out.println("Here are the ingredient of piZZa: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.Toping);
    }
}
