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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if (root1 != null) inOrder(list, root1);
        if (root2 != null) inOrder(list, root2);
        Collections.sort(list);
        return list;
    }

    public void inOrder(List<Integer> list, TreeNode root) {
        if (root.left != null) inOrder(list, root.left);
        list.add(root.val);
        if (root.right != null) inOrder(list, root.right);
    }
}