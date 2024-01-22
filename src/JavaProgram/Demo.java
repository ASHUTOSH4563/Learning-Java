package JavaProgram;

import java.sql.SQLOutput;
class Mobile{
    static String name;
    int price;
    String brand;

    static{
        String name="phone";
        System.out.println("static block called");
    }
    public Mobile(){
        int price=200;
        String brand="";
        System.out.println("constructor called");
    }
    void show(){
        System.out.println(name+": "+brand+":- "+price);
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
      //  Class.forName("Mobile");
        String str=new String("Navin");
        str=str+" reddy";
        System.out.println(str.charAt(0));
        System.out.println(str);
        StringBuffer sb=new StringBuffer("Navin ");
        System.out.println(sb.length());
        sb.append(" Reddy");
        sb.setLength(30);
        sb.insert(7,'k');
        System.out.println(sb.capacity());
        System.out.println(sb);
        Mobile obj1=new Mobile();
        Mobile.name="smartphone";//obj1.name="smartphone";
        obj1.brand="Apple";
        obj1.price=80000;
        Mobile obj2=new Mobile();
        Mobile.name="smartphone";//obj2.name="smartphone";
        obj2.brand="Oneplus";
        obj2.price=35000;
        obj1.name="phone";
        obj1.show();
        obj2.show();

    }
}
