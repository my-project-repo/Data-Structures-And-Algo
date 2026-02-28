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
    public int[] nextLargerNodes(ListNode head) {
        Stack <Integer> st = new Stack <>();
        ListNode prev = null , curr = head , next;
        int size = 0;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            size++;
        }
        int [] res = new int [size];
        int p = size-1;
        while (prev != null)
        {
            int val = prev.val;
            while (!st.isEmpty() && st.peek() <= val)
            {
                st.pop();
            }
            res[p--] = st.isEmpty() ? 0 : st.peek();
            st.push(val);
            prev = prev.next;
        }
        return res;
    }
}