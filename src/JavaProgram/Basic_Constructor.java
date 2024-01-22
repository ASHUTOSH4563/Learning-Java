package JavaProgram;

import java.util.Random;

class DiceRoller{
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }
    void roll(Random random,int number){
        number= random.nextInt(6)+1;
        System.out.println(number);
    }
}

public class Basic_Constructor
{
    public static void main(String args[]){
        DiceRoller dice=new DiceRoller();
    }
}
