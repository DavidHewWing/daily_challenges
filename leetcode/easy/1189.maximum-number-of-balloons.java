/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = 0;
        int[] alpha = new int[26];
        for(int i = 0; i < text.length(); i++){
            alpha[text.charAt(i) - 'a']++;
        }
        int l = alpha['l' - 'a'];
        int b = alpha['b' - 'a'];
        int o = alpha['o' - 'a'];
        int a = alpha['a' - 'a'];
        int n = alpha['n' - 'a'];
        
        int min2 = Math.min(o, l) / 2;
        int min1 = Math.min(n, (Math.min(b, a)));
        
        return Math.min(min2, min1);
        
    }
}
// @lc code=end

