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
    public void reorderList(ListNode head) {
        //if list is empty,has one or two ele..reorder not possible
        if(head==null||head.next==null||head.next.next==null){
            return;
        }
        //iterate till middle element O(N/2)
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse the elements after mid element of list O(N/2)
        ListNode curr=slow.next;
        //detach
        slow.next=null;
        //1->2->3
        //curr=prev

        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //insert second list to 1st in middle O(N/2)
        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null){
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;
            t2=m2;
            t1=m1;
        }

        
    }
}