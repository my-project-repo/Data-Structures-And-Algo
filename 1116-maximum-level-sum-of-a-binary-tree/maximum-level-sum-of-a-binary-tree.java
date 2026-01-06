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
    public int maxLevelSum(TreeNode root) {
        if (root == null) return -1;
        int res = Integer.MIN_VALUE, level = 0,maxLevel = 0;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            int max = 0;
            level++;
            while (size --> 0)
            {
                TreeNode curr = q.poll();
                max += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (max > res)
            {
                res = max;
                maxLevel = level;
            }
            
        }
        return maxLevel;
    }
}