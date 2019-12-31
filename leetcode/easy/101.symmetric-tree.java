/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
        
    }
    
    public boolean helper(TreeNode leftChild, TreeNode rightChild) {
        if(leftChild==null || rightChild==null)
            return leftChild==rightChild;
        if(leftChild.val != rightChild.val)
            return false;
        return helper(leftChild.left, rightChild.right) && helper(leftChild.right, rightChild.left);
    }
}
// @lc code=end

