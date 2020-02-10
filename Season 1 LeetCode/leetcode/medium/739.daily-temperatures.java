import java.util.Stack;

/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] T) {
        //stack implementation
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T.length; i++){
            while(!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;

        //array Implementation
        // int[] res = new int[T.length];
        // int[] tracker = new int[T.length];
        // int j = -1;
        // for(int i = 0; i < T.length; i++) {
        //     while(tracker[0] != 0 && T[i] > T[tracker[j]] ){
        //         int index = tracker[--j];
        //         res[index] = i - index;
        //     }
        //     tracker[++j] = i;
        // }
        // return res;
    }
}
// @lc code=end

