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
        List<TreeNode> list = new ArrayList<>();
        add(root,list);
        return build(0,list.size()-1,list);
    }
    void add (TreeNode root , List<TreeNode> list)
    {
        if (root == null) return;
        add(root.left,list);
        list.add(root);
        add(root.right,list);
    }
    TreeNode build (int start , int end , List<TreeNode> list)
    {
        if (start > end) return null;
        int mid = (end + start) / 2;
        TreeNode m = list.get(mid);
        m.left = build(start,mid-1,list);
        m.right = build(mid+1,end,list);
        return m;
    }
}