import java.util.HashMap;

/*
 * @lc app=leetcode id=1048 lang=java
 *
 * [1048] Longest String Chain
 */

// @lc code=start
class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        int max = 0;
        for(String word : words){
            int hi = 0;
            for(int i = 0; i < word.length(); i++){
                String s = word.substring(0,i) + word.substring(i+1);
                hi = Math.max(hi, map.getOrDefault(s, 0) + 1);
            }
            map.put(word, hi);
            max = Math.max(max, hi);
        }
        return max;
    }
}
// @lc code=end

