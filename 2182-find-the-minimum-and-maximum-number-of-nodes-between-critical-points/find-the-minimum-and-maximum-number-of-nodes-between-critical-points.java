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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // edge case size = 2
        if (head.next.next == null)
            return new int[] { -1, -1 };
        ListNode prev = head, curr = head.next;
        int index = 1, cp = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minima = Integer.MAX_VALUE;
        while (curr.next != null) {
            index++;
            if ((prev.val < curr.val && curr.val > curr.next.val) || (prev.val > curr.val && curr.val < curr.next.val)) 
            {
                cp++;
                if (cp == 1) {
                    min = index;
                    max = index;
                } else {
                    minima = Math.min(minima, index - max);
                    max = index;
                }

            }

            prev = curr;
            curr = curr.next;
        }

        if (cp < 2)
            return new int[] { -1, -1 };
        return new int[] { minima, max - min };
    }
}