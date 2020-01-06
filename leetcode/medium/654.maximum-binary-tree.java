/*
 * @lc app=leetcode id=654 lang=java
 *
 * [654] Maximum Binary Tree
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }
    
    private TreeNode helper(int startIndex, int endIndex, int[] nums) {
        if (startIndex > endIndex) return null;
        int maxIndex = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = helper(startIndex, maxIndex - 1, nums);
        root.right = helper(maxIndex + 1, endIndex, nums);
        return root;
    }
}
// @lc code=end

