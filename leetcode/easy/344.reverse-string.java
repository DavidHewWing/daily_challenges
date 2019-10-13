/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        if(s.length % 2 == 0) {
            for(int i = 0; i < s.length / 2; i++) {
                char c = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = c;
            }   
        } else {
            for(int i = 0; i < s.length / 2; i++) {
                char c = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = c;
            }
        }
    }
}
// @lc code=end

