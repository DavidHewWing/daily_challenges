/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> tempList = new LinkedList<>();
        helper(list, tempList, root, sum);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> temp, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.val == sum && root.right == null && root.left == null) {
            list.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        } else {
            helper(list, temp, root.left, sum - root.val);
            helper(list, temp, root.right, sum - root.val);   
        }
        temp.remove(temp.size() - 1);
    }
    
}
// @lc code=end

