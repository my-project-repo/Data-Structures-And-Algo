class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        calc(root,ans,"");
        return ans;
    }
    void calc (TreeNode root, List<String> ans, String str)
    {
        if (root == null) return;
        if (root.left == null && root.right == null) // last node
        {
            str += root.val;
            ans.add(str);
            return;
        }
        calc(root.left,ans,str+root.val+"->");
        calc(root.right,ans,str+root.val+"->");
    }
}