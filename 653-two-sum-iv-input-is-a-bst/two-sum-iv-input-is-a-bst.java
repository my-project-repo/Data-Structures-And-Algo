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
    List<Integer> l = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int idx = 0 , edx = l.size()-1;
        while (idx < edx)
        {
            int sum = l.get(idx) + l.get(edx);
            if (sum == k) return true;
            else if (sum > k)
            edx--;
            else idx++;
        }
        return false;
    }
    void dfs (TreeNode root)
    {
        if (root == null) return;
        dfs(root.left);
        l.add(root.val);
        dfs(root.right);
    }
}