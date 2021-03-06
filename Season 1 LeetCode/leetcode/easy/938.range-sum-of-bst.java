/*
 * @lc app=leetcode id=938 lang=java
 *
 * [938] Range Sum of BST
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        int sum = 0;
        if(root.val >= L)
            sum += rangeSumBST(root.left, L, R);
        if(root.val <= R)
            sum += rangeSumBST(root.right, L, R);
        if(root.val <= R && root.val >= L)
            sum += root.val;
        return sum;
    }
}
// @lc code=end

