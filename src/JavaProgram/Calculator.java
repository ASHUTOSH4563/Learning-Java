package JavaProgram;

public class Calculator {
    public int add(int n1,int n2){    //Every method have separate stack memory in jvm
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        int result=cal.add(4,3);
    }
}
