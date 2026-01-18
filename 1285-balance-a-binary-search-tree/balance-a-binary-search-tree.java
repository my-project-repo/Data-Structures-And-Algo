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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list,root);
        return build (list,0,list.size()-1);
        
    }
    void dfs (List<Integer> list, TreeNode root)
    {
        if (root == null) return;
        dfs(list,root.left);
        list.add(root.val);
        dfs(list,root.right);
    }
    TreeNode build (List<Integer> list , int start , int end)
    {
        if (start > end) return null;
        int mid = (end + start) /  2;
        TreeNode curr = new TreeNode(list.get(mid));
        curr.left = build(list,start,mid-1);
        curr.right = build(list,mid+1,end);
        return curr;
    }
}