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
        List<Integer> list = new ArrayList<>();
        ListNode ans = new ListNode(-1);
        ListNode iterate = ans;
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            int val = list.get(i) * 2 + carry;
            carry = val / 10;
            iterate.next = new ListNode(val % 10);
            iterate = iterate.next;
        }

        if (carry != 0) iterate.next = new ListNode(carry);
        return reverse(ans.next);
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