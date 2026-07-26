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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preOrder(l, root);
        return l;
    }

    static void preOrder(List<Integer> l, TreeNode root)
    {
        if(root == null)
        return;

        l.add(root.val);
        preOrder(l, root.left);
        preOrder(l, root.right);
    }
}