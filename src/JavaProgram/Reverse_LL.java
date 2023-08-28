package JavaProgram;
class Node1
{
    public Node prev;
    int data;
    Node next;
    Node1(int x)
    {
        data=x;
        next=null;

    }
}

public class Reverse_LL {
    public static void main(String args[]){
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head=InsertAtBegin(head,5 );
        head=InsertAtEnd(head,40);
        head=DeleteAtBegin(head);
        head=DeleteAtEnd(head);
        head=ReverseLL(head);
        printList(head);
    }
    public static Node InsertAtBegin(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        temp.next=head;
        return temp;
    }
    public static Node InsertAtEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static Node DeleteAtBegin(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
    public static Node DeleteAtEnd(Node head){
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static Node ReverseLL(Node head){
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
}
