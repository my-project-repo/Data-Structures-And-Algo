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
    TreeNode res;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        res = dummy;
        helper(root);
        return dummy.right;
    }

    void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        res.right = new TreeNode(root.val);
        res = res.right;
        helper(root.right);
    }
}