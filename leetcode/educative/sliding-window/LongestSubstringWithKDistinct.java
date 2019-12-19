import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int max = Integer.MIN_VALUE;
    int start = 0;
    for(int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
      while (map.size() > k) {
        map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
        if (map.get(str.charAt(start)) == 0) {
          map.remove(str.charAt(start));
        }
        start++; // shrink the window
      }
      max = Math.max(max, i - start + 1);
    }
    return max;
  }
}
