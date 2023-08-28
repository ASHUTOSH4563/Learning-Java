package JavaProgram;

class Parent
{
    final int finalValue = 100;

    public void displayValue() {
        System.out.println( finalValue);
    }
}

class Child extends Parent {


    @Override
    public void displayValue() {
        System.out.println( finalValue);
    }
}

    public class Main2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.displayValue();

        Child child = new Child();
        child.displayValue();

    }
}

