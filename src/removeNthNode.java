import java.util.*;
public class removeNthNode {
    private static ListNode start;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
        ListNode(int val){
            this.val = val;
        }
        
    }
    int size = 0;
    public void addNode(ListNode node){
        if(start==null){
            start = node;
            size++;
        } else {
            ListNode temp = start;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
            size++;
        }
    }
    public void printList(ListNode node){
        ListNode temp = node;
        while(temp!=null){
            System.out.format("%d ",temp.val);
            temp=temp.next;
        }
        //System.out.println("size: "+size);
        System.out.println();
    }
    //using time complaxity: 2L-n --> O(L)
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        int l = 0;
        ListNode temp = head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        temp = ans;
        for(int i=0;i<(l-n);i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        //System.out.println((l));
        return ans.next;
    }*/
    //using one pass -- time complaxity: O(L)
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode first = head;
        ListNode second = ans;
        for(int i=1;i<n+1;i++){
            first=first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return ans.next;
    }
    
    public static void main(String[] args){
        removeNthNode r = new removeNthNode();
        ListNode head = new ListNode(2);
        r.addNode(head);
        r.addNode(new ListNode(3));
        r.addNode(new ListNode(6));
        r.addNode(new ListNode(8));
        r.printList(head);
        ListNode ans = r.removeNthFromEnd(head, 2);
        r.printList(ans);
    }
    
}
