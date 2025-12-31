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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;
        Queue <TreeNode> q  = new LinkedList<>();
        List<Long> list = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            long sum = 0;
            while (size --> 0)
            {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            list.add(sum);
        }
        if (list.size() < k) return -1;
        list.sort(Collections.reverseOrder());
        return list.get(k-1);

    }
}