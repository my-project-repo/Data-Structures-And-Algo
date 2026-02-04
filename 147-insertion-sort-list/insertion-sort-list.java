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
    public ListNode insertionSortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null)
        {
            list.add(head);
            head = head.next;
        }
        Collections.sort(list,(a,b)->Integer.compare(a.val,b.val));
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        for (int i = 0;i<list.size();i++)
        {
            ListNode curr = list.get(i);
            curr.next = null;
            temp.next = curr;
            temp = temp.next;

        }
        return res.next;
    }
}