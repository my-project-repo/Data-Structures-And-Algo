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
    public ListNode doubleIt(ListNode head) {
        int carry = 0;
        ListNode ans = null;
        ListNode iterate = ans;
        head = reverse(head);

        while (head != null) {
            int val = head.val * 2 + carry;
            carry = val / 10;
            ListNode newNode = new ListNode(val % 10);
            newNode.next = ans;
            ans = newNode;
            head = head.next;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;
        }
        return ans;
    }

    ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}