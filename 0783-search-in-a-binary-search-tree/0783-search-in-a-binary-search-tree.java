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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return dfs(root, val);
    }

    public TreeNode dfs(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (root.val < val) {
            return dfs(root.right, val);
        } else {
            return dfs(root.left, val);
        }
    }
}