package JavaProgram;

import java.util.Scanner;

public class Main_m {
    public static void main(String args[]){
        //for the explanation of use of Inteface
//        Rabbit r1=new Rabbit();
//        r1.flee();
//        Hawk hawk=new Hawk();
//        hawk.Hunt();
//        Fish fish =new Fish();
//        fish.flee();
//        fish.Hunt();

        //for the explanation of use of polymerphism
//        Car4 car=new Car4();
//        Bicycle bicycle=new Bicycle();
//        Boat boat=new Boat();
//        Vehicle [] racers={car,bicycle,boat};
//        for(Vehicle x:racers){
//            x.Go();
//        }

        //for the explanation of use of Dynamic polymerphism
        Animal animal;
        Scanner sc=new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice=sc.nextInt();
        if(choice==1){
            animal=new Dog();
            animal.Speaks();
        }else if(choice==2){
            animal=new Cat();
            animal.Speaks();
        }else{
            animal=new Animal();
            animal.Speaks();
        }
    }
}
