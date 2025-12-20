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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return max(nums,0,nums.length-1);
    }
    TreeNode max (int [] nums , int start , int end)
    {
        if (start > end) return null;
        int pos = maxFun (nums , start , end);
        TreeNode val = new TreeNode (nums[pos]);
        val.left = max(nums,start,pos-1);
        val.right = max(nums,pos+1,end);
        return val;
    }
    int maxFun (int [] nums , int start , int end)
    {
        int max = Integer.MIN_VALUE,idx = 0;
        for (;start<=end;start++)
        {
            if (max < nums[start])
            {
                max = nums[start];
                idx = start;
            }
        }
        return idx;
    }
}