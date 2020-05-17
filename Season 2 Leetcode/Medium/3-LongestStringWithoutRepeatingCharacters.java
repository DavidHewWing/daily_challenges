class Solution {
  public int lengthOfLongestSubstring(String s) {
      HashMap<Character, Integer> map = new HashMap<>();
      int max = 0;
      int start = 0;
      for (int end = 0; end < s.length(); end++) {
          char endChar = s.charAt(end);
          if (map.containsKey(endChar)) {
              start = Math.max(start, map.get(endChar) + 1);
          }
          map.put(endChar, end);
          max = Math.max(max, end - start + 1);
      }
      return max;
  }
}