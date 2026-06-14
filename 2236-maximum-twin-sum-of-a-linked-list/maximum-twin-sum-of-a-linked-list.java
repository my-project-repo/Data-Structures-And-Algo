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
    int size = 0;

    public int pairSum(ListNode head) {
        // idx -> 5 4 2 1
        // edx -> 1 2 4 5
        int max = 0;
        ListNode idx = head, slow = head, fast = head;
        // find mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode edx = reverse(slow);
        while (idx != null && edx != null) {
            max = Math.max(max, idx.val + edx.val);
            idx = idx.next;
            edx = edx.next;
        }

        return max;
    }

    ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            size++;
        }

        return prev;
    }
}