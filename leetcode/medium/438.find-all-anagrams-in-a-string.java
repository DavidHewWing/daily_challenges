/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int matching = 0;
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int end = 0; end < s.length(); end++) {
            // System.out.println("for");
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    matching++;
                }
            }
            
            if (end >= p.length() - 1) {
                char startChar = s.charAt(start);
                if (matching == map.size()) {
                    list.add(start);
                }
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) == 0)
                        matching--;
                    map.put(startChar, map.get(startChar) + 1);
                }
                start++;
            }
            
        }
        
        return list;
        
    }
}
// @lc code=end

