/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int hi = S.length();
        int lo = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'I'){
                res[i] = lo;
                lo++;
            }else{
                res[i] = hi;
                hi--;
            }
        }
        res[S.length()] = (S.charAt(S.length() - 1) == 'I') ? lo : hi;
        return res;
    }
}
// @lc code=end

