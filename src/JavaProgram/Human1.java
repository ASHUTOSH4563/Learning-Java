package JavaProgram;

public class Human1 {
    int age;
    String name;
    public Human1(){
        System.out.println("default Constructor called");
        age=21;
        name="Mahesh";
        System.out.println(age+":"+name);
    }
    public Human1(int a,String n){
        age=a;
        name=n;
        System.out.println(age+":"+name);
    }
    public static void main(String[] args)
    {
        Human1 h1=new Human1();
        Human1 h2=new Human1(56,"Nandi");
    }
}
