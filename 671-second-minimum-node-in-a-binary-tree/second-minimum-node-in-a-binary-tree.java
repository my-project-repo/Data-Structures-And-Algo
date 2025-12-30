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
    Set<Integer> set = new HashSet<>();
    Queue<Integer> queue = new PriorityQueue<>();

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        if (queue.isEmpty())
            return -1;
        else
            queue.poll();
        return queue.isEmpty() ? -1 : queue.peek();
    }

    void dfs (TreeNode root)
    {
        if (root == null) return ;
        if (!set.contains(root.val)){
        queue.add(root.val);
        set.add(root.val);
        }
        dfs(root.left);
        dfs(root.right);
    }
}