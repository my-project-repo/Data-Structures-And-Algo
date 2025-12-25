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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root,new ArrayList<>(),res,0,targetSum);
        return res;
    }
    void dfs (TreeNode root,List<Integer> list , List<List<Integer>> res, int sum , int target)
    {
        if (root == null) return;
        sum += root.val;
        list.add(root.val);
        if (root.left == null && root.right == null)
        {
            if (sum == target)
            res.add(new ArrayList<>(list));
        }
        dfs(root.left,list,res,sum,target);
        dfs(root.right,list,res,sum,target);
        list.remove(list.size()-1);
    }
}