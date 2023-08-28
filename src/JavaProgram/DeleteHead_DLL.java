package JavaProgram;
//class Node{
//    int data;
//    Node next;
//    Node prev;
//    Node(int d){
//        data=d;
//        next=prev=null;
//    }
//}
//
//public class DeleteHead_DLL
//{
//    public static void main(String args[])
//    {
//        Node head=new Node(3);
//        head=InsertAtbegin(head,2);
//        head=InsertAtbegin(head,1);
//        head=DeleteAtFront(head);
//        PrintList(head);
//    }
//    public static Node InsertAtbegin(Node head,int data){
//        Node temp=new Node(data);
//        temp.next=head;
//        if(head!=null){
//            head.prev=temp;
//        }
//        return temp;
//    }
//    public static void PrintList(Node head)
//    {
//        Node curr=head;
//
//        while(curr!=null){
//            System.out.print(curr.data+"->");
//            curr=curr.next;
//        }
//        System.out.println("null");
//        curr = head;
//        while (curr.next != null) {
//            curr = curr.next;
//        }
//        while (curr != head) {
//            System.out.print(curr.data + "<-");
//            curr = curr.prev;
//        }
//        System.out.print(curr.data+"<-null" );
//    }
//    public static Node DeleteAtFront(Node head)
//    {
//       if(head==null){
//           return null;
//       }
//       if(head.next==null){
//           return null;
//       }
//       else{
//           head=head.next;
//           head.prev=null;
//       }
//       return head;
//    }
//    public static Node DeleteFromEnd(Node head){
//        if(head==null || head.next==null){
//            return null;
//        }
//        Node curr=head;
//        while(curr.next!=null){
//
//        }
//        return head;
//    }
//}
