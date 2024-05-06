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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the linked list
        head = reverse(head);
        ListNode current = head;
        ListNode prev = null;
        ListNode maxNode = head;
        while (current != null) {
            if (current.val < maxNode.val) {
                // Remove the current node
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                maxNode = current;
                prev = current;
            }
            current = current.next;
        }
        // Reverse the modified linked list back
        return reverse(head);
    }
}