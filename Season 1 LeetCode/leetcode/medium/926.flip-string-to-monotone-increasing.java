/*
 * @lc app=leetcode id=926 lang=java
 *
 * [926] Flip String to Monotone Increasing
 */

// @lc code=start
class Solution {
    public int minFlipsMonoIncr(String S) {
        char[] sChars = S.toCharArray();
	    int flipCount = 0;
	    int onesCount = 0;
        for(int i = 0; i < sChars.length; i++){
            if(sChars[i] == '0'){
                if(onesCount == 0) continue;
                else flipCount++;
            }else{
                onesCount++;
            }
            if(flipCount > onesCount){
                flipCount = onesCount;
            }
        }
        return flipCount;
        /*
            int ones = 0;
            chars[] chars = S.toCharArray();
            int count = 0;
            for(int i = 0; i < chars.length; i++){
                if(chars[i] == '1'){
                    ones++;
                }
                if(chars[i] > chars[i+1]){
                    int j = i+1;
                    int zeroes = 0;
                    while(j < chars.length){
                        if(chars[j] == '0')
                            zeroes++;
                        else{
                            j++;
                            break;
                        }
                        j++
                    }
                    count += Math.min(zeroes, one);
                    ones = 0;
                    i+= j;
                }
                return count;
            }
        */
    }
}
// @lc code=end

