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
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        int val = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            TreeNode [] arr = new TreeNode[size];
            int p = 0;
            while (size --> 0)
            {
                TreeNode curr = q.poll();
                arr[p++] = curr;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (val % 2 == 0)
            reverse(arr);
            val++;
        }
        return root;
    }
    void reverse (TreeNode [] arr)
    {
        int idx = 0 , edx = arr.length-1;
        while (idx < edx)
        {
            int temp = arr[idx].val;
            arr[idx].val = arr[edx].val;
            arr[edx].val = temp;
            idx++;
            edx--;

        }
    }
}