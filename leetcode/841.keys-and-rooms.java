/*
 * @lc app=leetcode id=841 lang=java
 *
 * [841] Keys and Rooms
 */

// @lc code=start
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        seen.add(0);
        stack.push(0);
        while(!stack.isEmpty()){
            List<Integer> list = rooms.get(stack.pop());
            for(int x : list){
                if(!seen.contains(x)){
                    stack.push(x);
                    seen.add(x);
                }
            }
        }
        return seen.size() == rooms.size();
    }
}
// @lc code=end

