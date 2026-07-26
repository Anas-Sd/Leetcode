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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inOrder(l, root);
        return l;
    }

    static void inOrder(List<Integer> l, TreeNode root)
    {
        if(root == null)
        return;

        inOrder(l, root.left);
        l.add(root.val);
        inOrder(l, root.right);
    }
}