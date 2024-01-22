package JavaProgram;
 class Car5
 {
    private String make;
    private String model;
    private int year;
    Car5(String make,String model,int year){
        this.SetMake(make);
        this.SetModel(model);
        this.SetYear(year);
        //this.make=make;
        //this.model=model;
       // this.year=year;
    }
    Car5(Car5 x){
        this.Copy(x);
    }
    public String getMake(){
        return make;
    }
     public String getModel(){
         return model;
     }
     public int getYear(){
         return year;
     }
     public void SetMake(String make){
        this.make=make;
     }
     public void SetModel(String model){
         this.model=model;
     }
     public void SetYear(int year){
         this.year=year;
     }
     public void Copy(Car5 x){
        this.SetMake(x.getMake());
        this.SetModel(x.getModel());
        this.SetYear(x.getYear());
     }

 }
public class Encap {
    public static void main(String args[]){
        Car5 car1=new Car5("Mercedes","Benz",2019);
       Car5 car2=new Car5("Ford","Mustang",2022);
       // Car5 car2=new Car5(car1);

//        car1.SetMake("BMW");
//        car1.SetYear(2022);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
