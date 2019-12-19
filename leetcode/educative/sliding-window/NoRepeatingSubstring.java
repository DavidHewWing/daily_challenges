import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    Map<Character, Integer> map = new HashMap<>();
    int start = 0;
    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.containsKey(c)) {
        int tempIndex = map.get(c);
        start = Math.max(start, tempIndex + 1);
      }
      map.put(c, i);
      max = Math.max(max, i - start + 1);
    }
    return max;
  }
}
