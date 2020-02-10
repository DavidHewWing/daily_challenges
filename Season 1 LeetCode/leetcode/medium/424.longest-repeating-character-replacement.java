/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
      int len = s.length();
      int[] count = new int[26];
      int start = 0, maxCount = 0, maxLength = 0;
      for (int end = 0; end < len; end++) {
          maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
          while (end - start + 1 - maxCount > k) {
              count[s.charAt(start) - 'A']--;
              start++;
          }
          maxLength = Math.max(maxLength, end - start + 1);
      }
      return maxLength;
  }
  /*
    public int characterReplacement(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxRepeating = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); ++i) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            maxRepeating = Math.max(maxRepeating, map.get(str.charAt(i)));
            if (i - start - maxRepeating + 1 > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                start++;
            }
            max = Math.max(i - start + 1, max);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
  */
}
// @lc code=end

