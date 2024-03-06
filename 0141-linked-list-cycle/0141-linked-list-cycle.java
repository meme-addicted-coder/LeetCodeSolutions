/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//1.Marker approach..but the list is need to tweek or copied
//2.DUPLICATE-HASHING,HASHSET ...again extra space , O(N)
//3.Floyd's  cycling Algo O(N)+K (N=total no of nodes, K=cycle length)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow= head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;



    }
}
