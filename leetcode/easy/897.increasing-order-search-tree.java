/*
 * @lc app=leetcode id=897 lang=java
 *
 * [897] Increasing Order Search Tree
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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        TreeNode starter = new TreeNode(0);
        TreeNode dummy = starter;
        for (int n : list) {
            starter.right = new TreeNode(n);
            starter = starter.right;
        }
        return dummy.right;
    }
    
    public void helper (TreeNode root, List<Integer> list) {
        if (root == null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
// @lc code=end

