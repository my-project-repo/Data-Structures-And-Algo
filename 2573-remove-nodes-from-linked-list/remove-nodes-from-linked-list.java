/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int max = -99;
        while (head != null) {

            if (max <= head.val) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            max = Math.max(max,head.val);
            head = head.next;
        }
        return reverse(ans.next);

    }

    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}