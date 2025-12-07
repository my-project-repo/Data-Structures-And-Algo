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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        int max;
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            max = Integer.MIN_VALUE;
            while (size --> 0)
            {
                TreeNode curr = q.poll();
                max = Math.max(max,curr.val);
                if (curr.left != null)
                q.add(curr.left);
                if (curr.right != null)
                q.add(curr.right);
            }
            list.add(max);
        }
        return list;
    }
}