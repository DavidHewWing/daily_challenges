/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int remain = 0;
        while(set.add(n)){
            while(n > 0){
                sum += (n%10) * (n%10);
                n /= 10;
            }
            if(sum == 1){
                return true;
            }
            n = sum;
            sum = 0;
        }
        return false;
    }
}
// @lc code=end

