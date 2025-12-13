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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    TreeNode builder (int [] pre , int [] in , int idx1 , int edx1 , int idx2, int edx2)
    {
        if (idx1 > edx1) return null;
        TreeNode root = new TreeNode(pre[idx1]);
        int i = idx2;
        while (in[i] != pre[idx1]) i++; // finding the inorder root
        int size = i - idx2;
        root.left = builder(pre,in,idx1+1,idx1+size,idx2,i-1);
        root.right = builder(pre,in,idx1+size+1,edx1,i+1,edx2);
        return root;
    }
}