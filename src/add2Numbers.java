import java.util.*;
public class add2Numbers {
    private static ListNode start;
    public static class ListNode{ 
         int val;    
         ListNode next;    
        public ListNode() {
//            val=0;
//            next = null;
        }  
        public ListNode(int val) {    
            this.val = val;    
                
        }     
}    
    
    int size = 0;
//    ListNode temp = null;
    
    public boolean isEmpty(){
        if(start==null){
            return true;
        } else return false;
    }
    
    public void addNode(ListNode node){
        if(start==null){
            start = node;
            size++;
        } else {
            ListNode temp = start;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
        
    }
    public void printList(ListNode node){
        ListNode temp = node;
        //System.out.println("Entered in printlist");
        while(temp!=null){
            System.out.format("%d  ",temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    public static ListNode reverseLinkedList(ListNode node){
        if(node == null || node.next==null){
            return node;
        }
        
        ListNode remaining = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode total = null;
        int sum = 0;
        int carry = 0;
        int itr=0;
        ListNode Head = null;
        while(l1!=null || l2!= null){
            itr++;
            sum=carry;
            if(l1!=null){
                sum = sum+l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum = sum+l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            sum = sum%10;
            
//            total.val=sum;
//            total=total.next;
            if(itr==1){
                total = new ListNode(sum);
                Head = total;
            } else {
                ListNode temp = new ListNode(sum);
                total.next = temp;
                total = total.next;
            }   
        }
        if(carry!=0){
            ListNode t = new ListNode(carry);
            total.next = t;
        }
        return Head;
    }
   
    public static void main(String[] args){
        
        add2Numbers a = new add2Numbers(); 
        ListNode start1 = new ListNode(5);
        a.addNode(start1);
        a.addNode(new ListNode(3));
        a.addNode(new ListNode(2));
        a.addNode(new ListNode(1));
        start = null;
        ListNode start2 = new ListNode(4);
        a.addNode(start2);
        a.addNode(new ListNode(3));
        a.addNode(new ListNode(2));
        
        if(!a.isEmpty()){
            System.out.println("yoo");
            a.printList(start1);
            start = null;
            a.printList(start2);
            
            start1 = a.reverseLinkedList(start1);
            start2 = a.reverseLinkedList(start2);
            ListNode total = new ListNode();
            total = a.addTwoNumbers(start1, start2);
            total = a.reverseLinkedList(total);
            a.printList(total);
        }else {
            System.out.println("List is empty..");
        }
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     //ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
