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
        // calculate the size first 
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        // if the removable node is first
        if(n == size){
            head = head.next;
            return head;
        }
        
        // size-n
        int i = 1;
        int iToFind = size-n;
        ListNode prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        
        prev.next = prev.next.next;
        return head;
    }
}