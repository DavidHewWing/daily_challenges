import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {
    int matching = 0;
    int start = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : pattern.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    System.out.println(map.size());
    for (int end = 0; end < str.length(); end++) {
      char endChar = str.charAt(end);
      if (map.containsKey(endChar)) {
        map.put(endChar, map.get(endChar) - 1);
        if (map.get(endChar) == 0) {
          matching++;
        }
      }
      if (matching == map.size()) {
        return true;
      }

      if (end >= pattern.length() - 1) {
        char startChar = str.charAt(start);
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
