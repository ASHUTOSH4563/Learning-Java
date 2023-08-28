package JavaProgram;
class Human
{
     private String name="Ashu";                          //here we can initialise the value
     private int age=21;                              //here we can initialise the value
     public String getName() {                      //we can access the data from another class by creating a method in the same class
         return name;
     }
     public void setName(String n){                //we can also set the values of the instance variable
         name=n;
     }
     public int getAge()
     {
         return age;
     }
     public void setAge(int age,Human obj){
         Human h1=obj;
        h1.age=age;
     }
}
public class Demo1 {
    public static void main(String[] args) {
        Human h1=new Human();
//        h1.name="Ashutosh";
//        h1.age=21;
        h1.setName("Ashutosh");
        h1.setAge(22,h1);
        System.out.println(h1.getName()+" : "+h1.getAge());
    }
}
