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
class SolutionInOrder {
    
  private static int number = 0;
  private static int num = 0;
  
  public int kthSmallest(TreeNode root, int k) {
      num = k;
      traverse(root);
      return number;
  }
  
  public void traverse(TreeNode root) {
      if (root.left != null) traverse(root.left);
      num--;
      if (num == 0) {
          number = root.val;
          return;
      }
      if (root.right != null) traverse(root.right);
  }     
}

class SolutionShiityNSquared {
  PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
  public int kthSmallest(TreeNode root, int k) {
      traverse(root);
      while (k > 1) {
          pq.poll();
          k--;
      }
      return pq.poll();
  }
  
  public void traverse(TreeNode root) {
      if (root.left != null) traverse(root.left);
      pq.offer(root.val);
      if (root.right != null) traverse(root.right);
  }     
}

