/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

