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
    int idx = 0;
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return builder(preorder,0,inorder.length-1);
    }
    TreeNode builder (int [] pre , int idxIn , int edxIn)
    {
        if (idxIn > edxIn) return null;
        TreeNode root = new TreeNode (pre[idx++]);
        int inIndex = map.get(root.val);
        root.left = builder(pre,idxIn,inIndex-1);
        root.right = builder(pre,inIndex+1,edxIn);
        return root;
    }
}