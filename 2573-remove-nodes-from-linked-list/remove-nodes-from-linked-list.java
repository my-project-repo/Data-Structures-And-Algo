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
    public ListNode removeNodes(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode h = reverse(head);
        ListNode temp = null;
        while (h != null)
        {
            ListNode next = h.next;
            if (max <= h.val)
            {
                h.next = temp;
                temp = h;
                max = h.val;
            }
            h = next;
        }
        return temp;
    }
    ListNode reverse (ListNode head)
    {
        ListNode next , prev = null , curr = head;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}