/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(Node n : node.children){
                stack.push(n);
            }
        }
        Collections.reverse(list);
        return list;
    }
    
    // recursive
//     public List<Integer> postorder(Node root) {
//         List<Integer> list = new ArrayList<>();
//         helper(list, root);
//         return list;
//     }
    
//     public List<Integer> helper(List<Integer> list, Node root){
//         if(root == null)
//             return list;
//         for(Node n : root.children){
//             helper(list, n);
//         }
//         list.add(root.val);
//         return list;
//     }
    
}
// @lc code=end

