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
    List<Integer> list;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        dfs(root1);
        dfs(root2);
        Collections.sort(list);
        return list;
    }
    void dfs (TreeNode p)
    {
        if (p == null) return;
        dfs(p.left);
        list.add(p.val);
        dfs(p.right);
    }
}