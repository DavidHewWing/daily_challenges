/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean leftToRight = true;
        queue.offer(root);
        int queueSize = queue.size();
        while (queueSize > 0) {
            List<Integer> tempList = new ArrayList<>();
            System.out.println(leftToRight);
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (leftToRight) 
                    tempList.add(0, node.val);
                else
                    tempList.add(node.val);
                
                if (node.right != null) queue.offer(node.right);
                if (node.left != null) queue.offer(node.left);
            }
            list.add(tempList);
            queueSize = queue.size();
            leftToRight = !leftToRight;
        }
        return list;
    }
}
// @lc code=end

