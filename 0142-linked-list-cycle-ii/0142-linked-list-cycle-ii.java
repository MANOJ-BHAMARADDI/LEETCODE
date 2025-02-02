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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null; 

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                ListNode start = head;
                // int index = 0;

                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                    // index++;
                }
                return start; // index where the cycle starts
            }
        }
        return null;
    }
}