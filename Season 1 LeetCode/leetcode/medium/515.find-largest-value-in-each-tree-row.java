/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
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
/*
*
BFS:
1. go through your current size of your queue.
    a. find max
    b. offer to queue
2. add the max at that level
3. update size of queue
4. repeat
*/
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        queue.offer(root);
        int size = (root == null) ? 0 : 1;
        while(size > 0){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                max = Math.max(node.val, max);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            list.add(max);
            size = queue.size();
        }
        return list;
    }
}
// @lc code=end

