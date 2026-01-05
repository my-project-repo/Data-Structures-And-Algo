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
    public boolean evaluateTree(TreeNode root) {
      return dfs(root) == 1;
    }
    int dfs (TreeNode root)
    {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
        return root.val;
        if (root.val == 2)
        return dfs(root.left) | dfs(root.right);
        if (root.val == 3)
        return dfs(root.left) & dfs(root.right);
        return 1;
    }
}