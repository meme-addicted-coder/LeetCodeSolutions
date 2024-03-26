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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
    ListNode reversed = reverseList(head);
    ListNode current = head;
    
    while (reversed != null && current != null) {
        if (reversed.val != current.val) {
            return false;
        }
        reversed = reversed.next;
        current = current.next;
    }
    return true;
}

}
/*ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast=!null || fast.next!=null){
            ListNode curr=slow;
            slow=slow.next;


        }
}*/