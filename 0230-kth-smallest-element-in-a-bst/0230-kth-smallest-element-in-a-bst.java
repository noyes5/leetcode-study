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
    private int min = Integer.MAX_VALUE;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        sortAscending(root,k);
        return min;
    }

    private void sortAscending(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        sortAscending(node.left, k);

        count++;

        if (count == k) {
            min = node.val;
            return;
        }

        sortAscending(node.right, k);
    }
}