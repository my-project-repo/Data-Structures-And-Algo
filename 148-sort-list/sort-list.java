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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int size = 0, p = 0;
        while (temp != null) 
        {
            size++;
            temp = temp.next;
        }
        int [] arr = new int[size];
        temp = head;
        while (temp != null) 
        {
            arr[p++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        p = 0;
        while (temp != null)
        {
            temp.val = arr[p++];
            temp = temp.next;
        }
        return head;
    }
}