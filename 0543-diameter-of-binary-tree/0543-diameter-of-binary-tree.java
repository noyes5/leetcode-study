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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);

        return max;

    }
    // dfs는 depth만 관리
    public int dfs(TreeNode cur) {
        if (cur == null) {
            return -1;
        }

        int left = dfs(cur.left);
        int right = dfs(cur.right);

        max = Math.max(max, left + right + 2);

        return Math.max(left, right) + 1;
    }
}