class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        calc(root, ans, new StringBuilder());
        return ans;
    }

    void calc(TreeNode root, List<String> ans, StringBuilder str) {
        if (root == null)
            return;
        int n = str.length();
        str.append(root.val);
        if (root.left == null && root.right == null) // last node
        {
            ans.add(str.toString());
        } else {
            str.append("->");
            calc(root.left, ans, str);
            calc(root.right, ans, str);
        }
        str.setLength(n);
    }
}