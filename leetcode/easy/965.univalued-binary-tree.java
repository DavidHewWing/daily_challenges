/*
 * @lc app=leetcode id=965 lang=java
 *
 * [965] Univalued Binary Tree
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
    public boolean isUnivalTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int value = root.val;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val != value)
                return false;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
        return true;
    }
//     public boolean isUnivalTree(TreeNode root) {
//         HashSet<Integer> set = new HashSet<>();
//         helper(root, set);
//         return set.size() == 1;
//     }
    
//     public void helper(TreeNode root, HashSet<Integer> set){
//         if(root == null)
//             return;
//         set.add(root.val);
//         helper(root.left, set);
//         helper(root.right, set);
//     }
}
// @lc code=end

