package JavaProgram;

public class TwoStacks {
    int size;
    int arr[];
    int top1,top2;
    TwoStacks(int size){
        this.size=size;
        this.arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }
    boolean isFull(){
       return top1+1==top2;
    }
    boolean isEmpty1(){
        return top1==-1;
    }
    boolean isEmpty2(){
        return top2==size;
    }
    public void push1(int x)
    {
        if(isFull()){
            System.out.println("Stack overflows");
        }else{
            top1++;
            arr[top1]=x;
        }
    }
    public void push2(int x)
    {
        if(isFull()){
            System.out.println("Stack overflows");
        }else{
            top2--;
            arr[top2]=x;
        }
    }
    int pop1(){
        if(isEmpty1()){
            System.out.println("Stack 1 is empty");
            return -1;
        }else{
            int res=arr[top1];
            top1--;
            return res;
        }
    }
    int pop2(){
        if(isEmpty2()){
            System.out.println("Stack 2 is empty");
            return -1;
        }else{
            int res=arr[top2];
            top2++;
            return res;
        }
    }
    public static void main (String args[]){
        TwoStacks stacks = new TwoStacks(5);
        stacks.push1(1);
        stacks.push1(2);
        stacks.push2(3);
        stacks.push2(4);

        System.out.println(stacks.pop1());  // Output: 2
        System.out.println(stacks.pop2());  // Output: 4
        System.out.println(stacks.pop1());  // Output: 1
        System.out.println(stacks.pop2());  // Output: 3
        System.out.println(stacks.pop1());  // Output: Stack 1 is empty
    }
}
