/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        helper(root1, list1);
        helper(root2, list2);
        return list1.equals(list2);
    }
    
    public void helper(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        helper(root.left, list);
        helper(root.right, list);
    }
    
    // DFS Solution
//     public boolean leafSimilar(TreeNode root1, TreeNode root2){
//         List<Integer> list1 = getLeafNodes(root1);
//         List<Integer> list2 = getLeafNodes(root2);
//         System.out.println(list1);
//         System.out.println(list2);
//         return list1.equals(list2);
//     }
    
//     public List<Integer> getLeafNodes(TreeNode root){
//         Stack<TreeNode> stack = new Stack<>();
//         List<Integer> listy = new ArrayList<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             TreeNode node = stack.pop();
//             if(node == null)
//                 continue;
//             if(node.right == null && node.left != null)
//                 stack.push(node.left);
//             else if(node.left == null && node.right != null)
//                 stack.push(node.right);
//             else if(node.left != null && node.right != null){
//                 stack.push(node.left);
//                 stack.push(node.right);
//             }else if(node.left == null && node.right == null){
//                 listy.add(node.val);
//             }
//         }
//         return listy;
//     }
    
    // BFS SOLUTION WORKS BUT LEETCODE IS LAME IDK HOW TO EQUATE.
    // public boolean leafSimilar(TreeNode root1, TreeNode root2){
    //     Queue<TreeNode> queue1 = new LinkedList<>();
    //     Queue<TreeNode> queue2 = new LinkedList<>();
    //     List<Integer> list1 = new ArrayList<>();
    //     List<Integer> list2 = new ArrayList<>();
    //     queue1.offer(root1);
    //     queue2.offer(root2);
    //     while(!queue1.isEmpty()){
    //         TreeNode node = queue1.poll();
    //         if(node == null)
    //             continue;
    //         if(node.left == null && node.right != null)
    //             queue1.offer(node.left);
    //         else if(node.right == null && node.left != null)
    //             queue1.offer(node.right);
    //         else if(node.right != null && node.left != null){
    //             queue1.offer(node.left);   
    //             queue1.offer(node.right);
    //         }else{
    //             list1.add(node.val);
    //         }
    //     }
    //     while(!queue2.isEmpty()){
    //         TreeNode node = queue2.poll();
    //         if(node == null)
    //             continue;
    //         if(node.left == null && node.right != null)
    //             queue2.offer(node.left);
    //         else if(node.right == null && node.left != null)
    //             queue2.offer(node.right);
    //         else if(node.right != null && node.left != null){
    //             queue2.offer(node.left);   
    //             queue2.offer(node.right);
    //         }else{
    //             list2.add(node.val);
    //         }
    //     }
    //     Collections.sort(list1);
    //     Collections.sort(list2);
    //     return list1.retainAll(list2) || list1.equals(list2);
    // }
}
// @lc code=end

