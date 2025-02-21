/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class FindElements {
    TreeNode root;
    Set<Integer> set;

    public FindElements(TreeNode root) {
        this.root = root;
        set = new HashSet<>();
        finder(root, 0);

    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void finder(TreeNode root, int val) {
        if (root == null)
            return;
        set.add(val);
        finder(root.left, 2 * val + 1);
        finder(root.right, 2 * val + 2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */