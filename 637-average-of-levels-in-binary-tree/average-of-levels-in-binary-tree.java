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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            int div = size;
            double avg = 0.0;
            while (size --> 0)
            {
                TreeNode curr = queue.poll();
                avg += curr.val;
                if (curr.left != null)
                queue.add(curr.left);
                if (curr.right != null)
                queue.add(curr.right);
            }
            res.add(avg/div);
        }
        return res;
    }
}