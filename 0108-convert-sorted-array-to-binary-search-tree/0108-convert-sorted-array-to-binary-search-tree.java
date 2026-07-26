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
    public TreeNode sortedArrayToBST(int[] a) {
        int n=a.length;
        return insert(a, 0, n-1);
    }

    static TreeNode insert(int a[], int low, int high)
    {
        if(low > high)
        return null;

        int mid = low + (high - low)/2;
        
        TreeNode root = new TreeNode(a[mid]);

        root.left = insert(a, low, mid-1);
        root.right = insert(a, mid+1, high);

        return root;
    }
}