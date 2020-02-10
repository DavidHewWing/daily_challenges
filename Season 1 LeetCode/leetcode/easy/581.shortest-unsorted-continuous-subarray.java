/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
                // keep iterating from right,
        // until you reach a value
        // that is smaller than the previous value
        if(nums[0] > nums[nums.length - 1]){
            return nums.length;
        }
        
        // nums[i] = 9
        // max = 10
        // end = 5
        int max = Integer.MIN_VALUE;
        int end = -1;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if(nums[i] < max){
                end = i;
            }
        }
        
        // nums[i] = 6
        // min = 4
        // begin = 1
        int min = Integer.MAX_VALUE;
        int begin = -1;
        for(int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            if(nums[i] > min){
                begin = i;
            }
        }
        if(end == -1 && begin == -1){
            return 0;
        }
        return end - begin + 1;
    }
}
// @lc code=end

