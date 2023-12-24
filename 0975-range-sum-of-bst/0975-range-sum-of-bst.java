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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] count = new int[1];
        BST(root, count, low, high);
        return count[0];
    }

    public void BST(TreeNode node, int[] count, int low, int high) {
        if (node == null) {
            return;
        }

        if (node.val >= low && node.val <= high) {
            count[0] += node.val;
        }
        BST(node.left, count, low, high);
        BST(node.right, count, low, high);
    }
}