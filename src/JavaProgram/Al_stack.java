package JavaProgram;

import java.util.ArrayList;

public class Al_stack {
    ArrayList<Integer>al=new ArrayList<>();
    void push(int x){
        al.add(x);
    }
    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size(){
        return al.size();
    }
}
class Test1{
    public static void main(String args[]){
         Al_stack al=new Al_stack();
         al.push(10);
         al.push(20);
        System.out.println(al.size());
    }
}
