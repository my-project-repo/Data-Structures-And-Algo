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
        int size = 1, n = 0;
        ListNode tail = head;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        n = k % size;
        if (n == 0) return head;
        ListNode temp = head;
        for (int i = 0; i < size - n - 1; i++) {
            temp = temp.next;
        }

        ListNode head_2 = temp.next;
        temp.next = null;
        tail.next = head;
        return head_2;

    }
}