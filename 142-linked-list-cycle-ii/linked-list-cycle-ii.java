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
        ListNode slow = head , fast = head , dummy = null;
        while (fast != null && fast.next != null && slow != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                dummy = slow;
                break;
            }
        }
        if (dummy == null) return null;
        while (dummy != head)
        {
            dummy = dummy.next;
            head = head.next;
        }
        return dummy;
    }
}