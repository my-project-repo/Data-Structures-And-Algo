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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun (root,0,targetSum);
        
    }
    boolean fun (TreeNode root , int sum , int target)
    {
        if (root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null)
        {
            if (sum == target) return true;
        }
        return fun (root.left,sum,target) || fun (root.right,sum,target);
    }
}