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
 //brute force: each element is traversed to check sum 0 
 //O(n^2)
 //optimized way : dummy node first, add ele if the added val again gets to the same val previously got,sum is 0 btwn
 //O(n)
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> mymap=new HashMap<>();
        ListNode dummyhead=new ListNode(0,head);
        int sum=0;
        ListNode temp=dummyhead;
        ListNode end=head;
        while(temp!=null){
            sum+=temp.val;
            mymap.put(sum,temp);
            temp=temp.next;
        }
        sum=0;
        temp=dummyhead;
        while(temp!=null)
        {
            sum+= temp.val;
            temp.next=mymap.get(sum).next;
            temp=temp.next;   
        }
        
        return dummyhead.next;
    }
}