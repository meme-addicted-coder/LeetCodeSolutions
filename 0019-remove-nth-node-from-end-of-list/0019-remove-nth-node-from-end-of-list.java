/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head;
        ListNode second=head;
        ListNode prev=null;
        //maintaining the gap 
        while( second!=null && n>0)
        {
            second=second.next;
            n--;
        }
        
        
       //deletion at head
        if(second==null)
        {
            if(n>0)
            {
                return head;
            }
            else
            {
                ListNode temp=head;
                head=head.next;
                temp.next=null;
                return head;
            }
        }
        //deletion at middle any...handling the location
        while(second!=null)
        {
            prev=first;
            first=first.next;
            second=second.next;
        }
        //simple deletion
        prev.next=first.next;
        first.next=null;
        return head;
    
    }
}