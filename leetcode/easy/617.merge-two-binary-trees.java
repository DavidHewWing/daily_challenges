/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null && t2 == null){
            return null;
        }
        
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(val);
        
        TreeNode t1Left = t1 == null ? null : t1.left;
        TreeNode t1Right = t1 == null ? null : t1.right;
        TreeNode t2Left = t2 == null ? null : t2.left;
        TreeNode t2Right = t2 == null ? null : t2.right;
        
        newNode.left = mergeTrees(t1Left, t2Left);
        newNode.right = mergeTrees(t1Right, t2Right);
        
        return newNode;
        
    }
}
// @lc code=end

