/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int i = 0; //iterative pointer
        int left = 0;
        int right = nums.length - 1;

        while(i <= right) {
            if(nums[i] == 2) {
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
            }else if(nums[i] == 0) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
                i++;
            }else{
                i++;
            }
        }
    }
}
// @lc code=end

