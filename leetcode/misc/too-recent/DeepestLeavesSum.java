class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int queueSize = root == null ? 0 : 1;
        queue.offer(root);
        int sum = 0;
        while (queueSize > 0) {
            sum = 0;
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            queueSize = queue.size();
        }
        return sum;
    }
}