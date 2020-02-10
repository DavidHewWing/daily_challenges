/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);
        return max;
    }
}
// @lc code=end
