package JavaProgram;

public class Circular_LL {
    public static void PrintCLL(Node head)
    {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        Node r=head.next;
        while(r!=head){
            System.out.print(r.data+" ");
            r=r.next;
        }
//        for(Node r=head.next;r!=head;r=r.next){
//            System.out.print(r.data+" ");
//        }
    }
    public static Node InsertAtBegin(Node head,int x)
    {
       Node temp=new Node(x);
       if(head==null){
           temp.next=temp;
       }
       else{
           Node curr=head;
           while(curr.next!=head){
               curr=curr.next;
           }
           curr.next=temp;
           temp.next=head;
       }
       return temp;
    }
    public static Node DeleteHead(Node head)
    {
        if (head == null ||head.next==head)
        {
            return null;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        return curr.next;

    }
    public static void main(String args[])
    {
         Node head=new Node(10);
         head.next=new Node(20);
         head.next.next=new Node(30);
         head.next.next.next=head;
         head=InsertAtBegin(head,5);
         head=DeleteHead(head);
         PrintCLL(head);
    }
}
