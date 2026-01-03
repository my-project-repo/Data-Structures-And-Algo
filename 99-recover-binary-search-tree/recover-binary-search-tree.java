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
    List<TreeNode> list;
    public void recoverTree(TreeNode root) {
        list = new LinkedList<>();
        dfs(root);
        TreeNode idx = null, edx = null;
        int n = list.size();
        for (int i = 1;i<n;i++)
        {
            if (list.get(i).val < list.get(i-1).val){
            idx = list.get(i-1);
            break;
            }
        }
        for (int i = n-1;i>=1;i--)
        {
            if (list.get(i).val < list.get(i-1).val)
            {
                edx = list.get(i);
                break;
            }
        }
        if (idx != null && edx != null)
        {
            int temp = idx.val;
            idx.val = edx.val;
            edx.val = temp;
        }
       
    }
    void dfs (TreeNode root)
    {
        if (root == null) return;
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}