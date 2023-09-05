package JavaProgram;

import java.util.Stack;

public class  StockSpan_Stack {
    static void printSpan(int arr[],int n)
    {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++)
         {
             while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                  s.pop();
             }
             int span=s.isEmpty()?i+1:i-s.peek();
             System.out.print(span+" ");
             s.push(i);
         }
    }
    public static void main(String args[])
    {
        int arr[]={60,10,20,15,35,50};
        printSpan(arr,arr.length);
    }
}
