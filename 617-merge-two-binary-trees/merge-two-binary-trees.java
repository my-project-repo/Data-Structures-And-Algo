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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1,root2);
    }
    TreeNode dfs (TreeNode p , TreeNode q)
    {
        if (p == null && q == null) return null;
        if (p == null) return q;
        if (q == null) return p;
        p.val += q.val;
        p.left = dfs(p.left,q.left);
        p.right = dfs(p.right,q.right);
        return p;
    }
}