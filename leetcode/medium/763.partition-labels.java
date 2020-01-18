/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>(); // result list
        if (S == null || S.length() == 0) return res; 
    
        Map<Character, Integer> map = new HashMap<>(); // frequency map
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> currMap = new HashMap<>(); // map to track window size
        int start = 0, end = start;
        while (end < S.length()) {
            char c = S.charAt(end);
            if (!currMap.containsKey(c)) {
                currMap.put(c, map.get(c));
            }
            currMap.put(c, currMap.get(c) - 1);
            if (currMap.get(c) == 0) {
                currMap.remove(c);
            }
            if (currMap.keySet().size() == 0) {
                res.add(end - start + 1);
                start = end + 1;
            }
            
            end++;
        }
        return res;
    }
}
// @lc code=end

