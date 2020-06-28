import java.util.*;
public class merge2SortedList {
    
    private static Node head;
   
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
        
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    
    public static void addElement(Node n){
        if(head==null){
            head = n;
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    
    public void readElement(Node n){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    public Node mergeLists(Node n1, Node n2){
        Node merged = new Node(0);
        Node temp = merged;
        System.out.println("n1: "+n1.data); 
        System.out.println("n2: "+n2.data);
        while(n1!=null && n2!=null) {
            if(n1.data < n2.data){
                System.out.println("1: "+n1.data);
                temp.next=n1;
                n1 = n1.next;
            } else {
                System.out.println("2: "+n2.data);
                temp.next=n2;
                n2 = n2.next;
            }
            temp=temp.next;
        }
        if(n1!=null){
            temp.next=n1;
            n1 = n1.next;
        }
        if(n2!=null){
            temp.next=n2;
            n2=n2.next;
        }
        return merged.next;
    }
    public static void main(String[] heer){
        merge2SortedList m = new merge2SortedList();
        Node list1 = new Node(1);
        m.addElement(list1);
        m.addElement(new Node(2));
        m.addElement(new Node(3));
        m.addElement(new Node(4));
        m.readElement(list1);
        head = null;
        Node list2 = new Node(3);
        m.addElement(list2);
        m.addElement(new Node(4));
        m.addElement(new Node(5));
        m.addElement(new Node(6));
        m.readElement(list2);
        System.out.println("1: "+list1.data);
        System.out.println("2: "+list2.data);
        m.readElement(m.mergeLists(list1, list2));
//        merge2SortedList m = new merge2SortedList();
//        merge2SortedList m1 = new merge2SortedList();
//        merge2SortedList m2 = new merge2SortedList();
//        //Node list1 = new Node(1);
//        m1.addElement(new Node(1));
//        m1.addElement(new Node(2));
//        m1.addElement(new Node(3));
//        m1.addElement(new Node(4));
//        m1.readElement(head);
//        head = null;
//        //Node list2 = new Node(3);
//        m2.addElement(new Node(3));
//        m2.addElement(new Node(4));
//        m2.addElement(new Node(5));
//        m2.addElement(new Node(6));
//        m2.readElement(head);
//        m1.head = m.mergeLists(m1.head, m2.head);
//        m1.readElement(m1.head);
        
    }
}
