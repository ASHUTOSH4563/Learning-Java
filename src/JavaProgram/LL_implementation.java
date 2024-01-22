package JavaProgram;
class Node
{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class LL_implementation
{
    Node head;
    int sz;
    LL_implementation(){
        head=null;
        sz=0;
    }
    int size()
    {
        return sz;
    }
    boolean isEmpty(){
        return(head==null) ;
    }
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }
    int pop(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        int res=head.data;
        head=head.next;
        sz--;
        return res;
    }
    int peek(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}
class Test2{
    public static void main(String args[]){
        LL_implementation ll=new LL_implementation();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.pop();
        ll.pop();
        ll.pop();
        System.out.println(ll.size());
        System.out.println(ll.peek());
    }
}

