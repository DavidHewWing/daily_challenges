/*
 * @lc app=leetcode id=951 lang=java
 *
 * [951] Flip Equivalent Binary Trees
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
Flip Equivalent.
Tree1 -> left = 2, right = 3
Tree2 -> left = 3, right = 2
Every traversal keep track of children.
First we check root1.left.val = root2.left.val && root2.right.val == root1.right.val
Then we check root2.right.val == root1.val.left etc.
If we have the second case. (root2.left == root1.right && root1.left == root2.right)
we must enqueue a certain way. root1 queue = [right, left], root2 queue = [left, right]
If first case: (root1.left.val = root2.left.val && root2.right.val == root1.right.val)
we must enqueue a certain way. root1 queue = [left, right], root2 queue = [left, right]
*/
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> queue1 = new LinkedList<>(); // for root1
        Queue<TreeNode> queue2 = new LinkedList<>(); // for root2
        queue1.offer(root1);
        queue2.offer(root2);
        
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (queue1.isEmpty() || queue2.isEmpty())
                return false;
            
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            
            if (node1 == null && node2 == null)
                continue;
            if (!equalNodes(node1, node2)) 
                return false;
            if (equalNodes(node1.left, node2.left) && equalNodes(node2.right, node2.right)) {
                queue1.offer(node1.left);
                queue2.offer(node2.left);
                queue1.offer(node1.right);
                queue2.offer(node2.right);
            } else if (equalNodes(node1.left, node2.right) && equalNodes(node1.right, node2.left)) {
                queue1.offer(node1.left);
                queue2.offer(node2.right);
                queue1.offer(node1.right);
                queue2.offer(node2.left);
            } else {
                return false;
            }
        }
        
        return queue1.isEmpty() && queue2.isEmpty();
    }
    
    private boolean equalNodes(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        else if (node1 != null && node2 != null && node1.val == node2.val)
            return true;
        else 
            return false;
    }
}
// @lc code=end

