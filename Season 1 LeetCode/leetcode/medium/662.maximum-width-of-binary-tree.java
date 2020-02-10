/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
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
Use bfs -> count max nodes on each level
Can we just use the queueSize max?

*/
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        HashMap<TreeNode, Integer> map = new HashMap();
        map.put(root, 0);
        int max = 1;
        
        while (!queue.isEmpty()) {
            int level = queue.size();
            max = Math.max(max, map.get(queue.peekLast()) - map.get(queue.peekFirst()) + 1);
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    map.put(node.left, map.get(node) * 2);
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    map.put(node.right, map.get(node) * 2 + 1);
                    queue.offer(node.right);
                }
            }
        }
        
        return max;
    }
}
        // valid but takes too long
         
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // int max = Integer.MIN_VALUE;
        // int i = 1;
        // while (!queue.isEmpty()) {
        //     int left = 0;
        //     int right = 0;
        //     for (int j = 1; j <= i; j++) {
        //         TreeNode node = queue.poll();
        //         if (node == null) {
        //             queue.offer(null);
        //             queue.offer(null);
        //             continue;
        //         }
        //         if (left == 0 && node != null) left = j;
        //         if (node != null) right = j;
        //         queue.offer(node.left);
        //         queue.offer(node.right);
        //     }
        //     max = Math.max(max, right - left + 1);
        //     if (left == 0 && right == 0) break;
        //     i *= 2;
        // }
// @lc code=end

