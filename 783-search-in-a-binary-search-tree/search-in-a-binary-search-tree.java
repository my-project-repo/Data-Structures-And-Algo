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
    TreeNode res = null;

    public TreeNode searchBST(TreeNode root, int val) {
        helper(root,val);
        return res;
    }

    void helper(TreeNode root, int val) {
        if (root == null)
            return;
        if (root.val == val) {
            res = root;
            return;
        }
        helper(root.left, val);
        helper(root.right, val);
    }
}