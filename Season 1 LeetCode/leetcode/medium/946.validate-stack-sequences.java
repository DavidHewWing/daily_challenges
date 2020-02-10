/*
 * @lc app=leetcode id=946 lang=java
 *
 * [946] Validate Stack Sequences
 */

// @lc code=start
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int poppedPointer = 0;
        int pushedPointer = 0;
        while(poppedPointer < popped.length){
            if(!stack.isEmpty() && stack.peek() == popped[poppedPointer]){
                stack.pop();
                poppedPointer++;
            }else if(stack.isEmpty() || popped[poppedPointer] != stack.peek()){
                if(pushedPointer >= pushed.length){
                    return false;
                }
                stack.push(pushed[pushedPointer]);
                pushedPointer++;
            }
        }
        
        return stack.isEmpty();
    }
}
// @lc code=end

