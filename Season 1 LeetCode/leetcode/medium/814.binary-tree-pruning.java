/*
 * @lc app=leetcode id=814 lang=java
 *
 * [814] Binary Tree Pruning
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
/*
return null if it is a leaf and a zero.
then when you bubble up there will be a new leaf and repeat.

*/
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        if (root.right == null && root.left == null) {
            if (root.val == 0) return null;
            else return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.right == null && root.left == null) {
            if (root.val == 0) return null;
            else return root;
        }
        return root;
    }
}
// @lc code=end

