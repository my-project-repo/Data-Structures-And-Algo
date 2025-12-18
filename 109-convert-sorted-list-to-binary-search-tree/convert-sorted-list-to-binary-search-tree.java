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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        int size = 0, p = 0;
        while (temp != null)
        {
            size++;
            temp = temp.next;
        }
        int [] arr = new int[size];
        while (head != null)
        {
            arr[p++] = head.val;
            head = head.next;
        }
        return dfs(arr,0,size-1);
    }
    TreeNode dfs (int [] arr , int start , int end)
    {
        if (start > end) return null;
        int mid = (end + start) / 2;
        TreeNode node = new TreeNode (arr[mid]);
        node.left = dfs(arr,start,mid-1);
        node.right = dfs(arr,mid+1,end);
        return node;
    }
}