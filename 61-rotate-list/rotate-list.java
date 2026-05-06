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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int size = 0, n = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        n = k % size;
        if (n == 0)
            return head;
        temp = head;
        for (int i = 0; i < size - n - 1; i++) {
            temp = temp.next;
        }

        ListNode head_2 = temp.next;
        ListNode dummy = head_2;
        temp.next = null;
        while (dummy.next != null)
            dummy = dummy.next;
        dummy.next = head;
        return head_2;

    }
}