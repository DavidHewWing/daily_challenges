class Solution {
  public boolean checkInclusion(String s1, String s2) {
      int[] map = new int[26];
      for (char c : s1.toCharArray()) {
          map[c - 'a']++;
      }
      
      int end = 0;
      int start = 0;
      while (end < s2.length()) {
          char endChar = s2.charAt(end);
          char startChar = s2.charAt(start);
          if (map[endChar - 'a'] > 0) {
              map[endChar - 'a']--;
              end++;
              if (end - start == s1.length()) return true;
          } else if (end == start) {
              end++;
              start++;
          } else {
              map[startChar - 'a']++;
              start++;
          }
      }
      return false;
  }
}