class Solution {
  public List<Integer> findAnagrams(String s, String p) {
      List<Integer> list = new ArrayList<>();
      int[] map = new int[26];
      for (char c : p.toCharArray()) {
          map[c - 'a']++;
      }
      int start = 0;
      int end = 0;
      while (end < s.length()) {
          if (map[s.charAt(end) - 'a'] > 0) {
              map[s.charAt(end) - 'a']--;
              end++;
              if (end - start == p.length()) {
                  list.add(start);
              }
          } else if (start == end) {
              end++;
              start++;
          } else {
              map[s.charAt(start) - 'a']++;
              start++;
          }
      }
      return list;
  }
}