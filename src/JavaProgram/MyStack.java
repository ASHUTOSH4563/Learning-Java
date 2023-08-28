package JavaProgram;

public class MyStack {
    int arr[];
    int cap;
    int top;
    MyStack(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }
    void push(int x){
        if(top==cap-1){
            System.out.println("stack is full");
        }
        top++;
        arr[top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        int res=arr[top];
        top--;
        return res;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty() {
        return (top == -1);
    }
}
class Test{
    public static void main(String args[]){
        MyStack s=new MyStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        s.push(40);
        s.push(50);
      //  s.push(60);
        System.out.println(s.size());
    }
}
