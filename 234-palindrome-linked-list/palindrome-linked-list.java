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
    public boolean isPalindrome(ListNode head) {
        int size = 0, p = 0;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            size++;
        }

        int arr[] = new int[size];
        for (ListNode curr = head; curr != null; curr = curr.next) {
            arr[p++] = curr.val;
        }

        int idx = 0, edx = size - 1;
        while (idx < edx) {
            if (arr[idx] != arr[edx])
                return false;
            idx++;
            edx--;
        }
        return true;
    }

}