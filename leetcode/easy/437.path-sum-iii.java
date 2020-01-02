/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int sum) {
      if(root == null) return 0;    
      int count = 0;
      count += pathSum(root.left, sum);
      count += pathSum(root.right, sum);
      count += sum(root, sum);
      return count;
    }
    
    int sum(TreeNode node, int sum){
      if(node == null) return 0;
      sum = sum - node.val;
      int count = 0;
      if(sum == 0) count++;
      count += sum(node.left, sum);
      count += sum(node.right, sum);
      return count;
    }
    
}
// @lc code=end

