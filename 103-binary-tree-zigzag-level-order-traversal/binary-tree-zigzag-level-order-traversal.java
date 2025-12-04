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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Deque<TreeNode> deque = new LinkedList<>();
        boolean flag = true;
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> res = new ArrayList<>();
            while (size-- > 0) {
                if (flag) {
                    TreeNode curr = deque.pollFirst();
                    res.add(curr.val);
                    if (curr.left != null)
                        deque.addLast(curr.left);
                    if (curr.right != null)
                        deque.addLast(curr.right);
                } else {
                    TreeNode curr = deque.pollLast();
                    res.add(curr.val);
                    if (curr.right != null)
                        deque.addFirst(curr.right);
                    if (curr.left != null)
                        deque.addFirst(curr.left);
                }
            }
            list.add(res);
            flag = !flag;
        }
        return list;

    }
}