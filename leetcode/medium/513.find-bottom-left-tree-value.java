/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int queueSize = root == null ? 0 : 1;
        queue.offer(root);
        int bottomLeft = 0;
        while (queueSize > 0) {
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (i == 0)
                    bottomLeft = node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            queueSize = queue.size();
        }
        return bottomLeft;
    }
}
// @lc code=end

