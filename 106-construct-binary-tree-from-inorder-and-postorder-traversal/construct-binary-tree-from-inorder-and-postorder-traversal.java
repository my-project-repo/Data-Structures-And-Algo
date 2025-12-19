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
    Map<Integer,Integer> map = new HashMap<>();
    int p;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        p = postorder.length-1;
        for (int i = 0;i<inorder.length;i++) map.put(inorder[i],i);
        return helper(0,n-1,postorder);
    }
    TreeNode helper (int start , int end , int [] post)
    {
        if (start > end) return null;
        int curr = post[p--];
        TreeNode node = new TreeNode (curr);
        int pos = map.get(curr);
        node.right = helper(pos+1,end,post);
        node.left = helper(start,pos-1,post);
        return node;

    }
}