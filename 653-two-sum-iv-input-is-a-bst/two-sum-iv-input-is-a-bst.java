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
   int [] arr = new int[10001];
   int p = 0;

    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int idx = 0, edx = p - 1;
        while (idx < edx) {
            int sum = arr[idx] + arr[edx];
            if (sum == k)
                return true;
            else if (sum > k)
                edx--;
            else
                idx++;
        }
        return false;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        arr[p++] = root.val;
        dfs(root.right);
    }
}