/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        TreeNode node = null;
        if(root.val > val)
            node = searchBST(root.left, val);
        if(root.val < val)
            node = searchBST(root.right, val);
        if(root.val == val)
            return root;
        return node;
    }
}
// @lc code=end

