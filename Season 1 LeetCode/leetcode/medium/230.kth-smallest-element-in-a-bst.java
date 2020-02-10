/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            for(TreeNode node : stack){
                if(node == null) System.out.println("null ");
                else System.out.print(Integer.toString(node.val) + " ");
            }
            System.out.println();
            root = stack.removeLast();
            if (--k == 0)
                return root.val;
            root = root.right;
        }
    }
}
// @lc code=end
