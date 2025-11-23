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
    public ListNode mergeNodes(ListNode head) {
        int count = 0, sum = 0;
        ListNode res = new ListNode(-1);
        ListNode node = res;
        while (head != null)
        {
            if (head.val == 0)
            count++;
            if (count == 1)
            sum += head.val;
            if (count == 2)
            {
                node.next = new ListNode(sum);
                sum = 0;
                node = node.next;
                count = 1;
            }
            head = head.next;

        }
        return res.next;
    }
}