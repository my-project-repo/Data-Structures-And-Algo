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
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        head = reverse(head);
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while (head != null) {

            if (queue.isEmpty() || queue.peek() <= head.val) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            queue.offer(head.val);
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