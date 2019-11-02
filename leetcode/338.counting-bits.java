/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int num) {
        // slow and bad but still a DP.
        // IMO will still give good impression in interview if I did this.
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            double logValue = Math.log(i) / Math.log(2);
            if(logValue % 1 == 0){
                dp[i] = 1;
            }else{
                int floored = (int) Math.pow(2, Math.floor(logValue));
                int index = i - floored;
                dp[i] = dp[index] + 1;
            }
        }
        return dp;
    }
}
// @lc code=end

