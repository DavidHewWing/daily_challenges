/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.offer(root);
        int queueSize = queue.size();
        while (queueSize > 0) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                tempList.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            queueSize = queue.size();
            list.add(tempList);
        }
        return list;
    }
}
// @lc code=end

