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
    Map<Integer, Integer> map = new HashMap<>();
    int p = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }
        return dfs(0, postorder.length - 1, preorder);
    }

    TreeNode dfs(int start, int end, int[] preorder) {
        if (start > end || p >= preorder.length)
            return null;
        TreeNode root = new TreeNode(preorder[p++]);
        if (start == end) return root;
        int leftNodeIndex = map.get(preorder[p]);
        root.left = dfs(start, leftNodeIndex, preorder);
        root.right = dfs(leftNodeIndex + 1, end - 1, preorder);

        return root;
    }
}