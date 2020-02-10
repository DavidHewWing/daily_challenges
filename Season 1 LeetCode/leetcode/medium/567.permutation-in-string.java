/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int matching = 0;
        
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int end = 0; end < s2.length(); end++) {
            char endChar = s2.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    matching++;
                }
            }
            // System.out.println(end);
            //  map.entrySet().forEach(entry->{
            //     System.out.println(entry.getKey() + " " + entry.getValue());  
            // });
            if (matching == map.size()) {
                return true;
            }
            if(end + 1 >= s1.length()) {
                char startChar = s2.charAt(start);
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) == 0) {
                        matching--;
                    }
                    map.put(startChar, map.get(startChar) + 1);
                }
                start++;
            }
        }
        return false;
    }
}
// @lc code=end

