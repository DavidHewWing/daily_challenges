/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        [1,2,3,4]
        */
        
        //get the values for the left
        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftArr[i] = leftArr[i - 1] * nums[i - 1];
        }
        
        //get the values for the right
        int[] rightArr = new int[nums.length];
        rightArr[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rightArr[i] = rightArr[i + 1] * nums[i + 1];
        }
        
        //get the result
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = rightArr[i] * leftArr[i];
        }
        return result;
    }
}
// @lc code=end

