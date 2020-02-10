/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list, new StringBuilder());
        return list;
    }
    
    public void helper(TreeNode root, List<String> list, StringBuilder sb) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            list.add(new String(sb));
            return;
        }
        sb.append(root.val + "->");
        helper(root.left, list, new StringBuilder(sb));
        helper(root.right, list, new StringBuilder(sb));
    }
}
// @lc code=end

