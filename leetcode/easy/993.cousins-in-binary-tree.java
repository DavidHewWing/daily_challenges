/*
 * @lc app=leetcode id=993 lang=java
 *
 * [993] Cousins in Binary Tree
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
Ideas:
Cousin == same depth but different parents.
When we look for depth, I think -> BFS because we can traverse the levels and therefore each depth
Do BFS and keep looking for the child x or y. If we find x we mark a boolean true, same with y.
If either xboolean or yboolean is true. we break and return xboolean %% yboolean;
*/
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xParent = null;
        TreeNode yParent = null;
        int xDepth = -1;
        int yDepth = -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int queueSize = root == null ? 0 : 1;
        int depth = 0;
        while (queueSize > 0) {
            for (int i = 0; i < queueSize; i++) {
                TreeNode parent = queue.poll();
                if (parent.left != null) {
                    TreeNode left = parent.left;
                    if (left.val == x) {
                        xDepth = depth;
                        xParent = parent;
                    }
                    if (left.val == y) {
                        yDepth = depth;
                        yParent = parent;
                    }
                    queue.offer(left);
                }
                if(parent.right != null) {
                    TreeNode right = parent.right;
                    if (right.val == x) {
                        xDepth = depth;
                        xParent = parent;
                    }
                    if (right.val == y) {
                        yDepth = depth;
                        yParent = parent;
                    }
                    queue.offer(right);
                }
            }
            if (xParent != null || yParent != null)
                break;
            queueSize = queue.size();
            depth++;
        }
        return xParent != yParent && xDepth == yDepth;
    }
}
// @lc code=end

