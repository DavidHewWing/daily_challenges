/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return buildString(S).equals(buildString(T));
    }
    
    private String buildString(String str) {
        
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        return sb.toString();
    } 

}
// @lc code=end

