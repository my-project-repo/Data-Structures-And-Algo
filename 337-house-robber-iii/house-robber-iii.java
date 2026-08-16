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
    public int rob(TreeNode root) {
        int [] ans = solve(root);
        return Math.max(ans[0],ans[1]);
    }

    int[] solve(TreeNode root) {
        if (root == null)
            return new int[] { 0, 0 };

        int[] left = solve(root.left); // left[0] = sumInclusiveOfRoot , left[1] = sumExclusiveOfRoot
        int[] right = solve(root.right); // right[0] = sumInclusiveOfRoot , right[1] = sumExclusiveOfRoot

        int include = root.val + left[1] + right[1];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int []{include,exclude};
    }
}