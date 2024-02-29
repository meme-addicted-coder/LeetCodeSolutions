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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null || l2!=null)
        {
            int val1=(l1==null)?0:l1.val;
            int val2=(l2==null)?0:l2.val;
            int val=val1+val2+carry;
            ListNode newNode =new ListNode();
            newNode.val=val%10;
            carry=val/10;
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=tail.next;
            }
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
            
        }
        if (carry > 0) 
        {
            tail.next = new ListNode(carry); 
        }
        return head;

    }
}