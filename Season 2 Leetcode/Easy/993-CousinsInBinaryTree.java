/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public boolean isCousins(TreeNode root, int x, int y) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      int size = (root == null) ? 0 : 1;
      boolean xFound = false;
      boolean yFound = false;
      TreeNode xParent = null;
      TreeNode yParent = null;
      while (size > 0) {
          
          // one level in the tree
          for (int i = 0; i < size; i++) {
              TreeNode node = queue.poll();
              // check for left node
              if (node.left != null) {
                  queue.offer(node.left);
                  if (node.left.val == x) {
                      xParent = node;
                      xFound = true;
                  } else if (node.left.val == y) {
                      yParent = node;
                      yFound = true;
                  }
              }
              
              // check for right node
              if (node.right != null) {
                  queue.offer(node.right);
                  if (node.right.val == x) {
                      xParent = node;
                      xFound = true;
                  } else if (node.right.val == y) {
                      yParent = node;
                      yFound = true;
                  }
              }
              
              // check if same parent
              
          }
                    
          if (yParent != null && xParent != null)
              if (yParent == xParent) return false;
          if ((xFound && !yFound) || (!xFound && yFound)) return false;
          if (xFound && yFound) return true;
          size = queue.size();
          
      }
      // x and y not in tree
      return false;
  }
}