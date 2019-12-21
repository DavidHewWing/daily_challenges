import java.util.*;

class StringAnagrams {
  public static List<Integer> findStringAnagrams(String str, String pattern) {
    List<Integer> resultIndices = new ArrayList<Integer>();
    HashMap<Character, Integer> map = new HashMap<>();
    int start = 0;
    int matching = 0;
    for (char c : pattern.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (int end = 0; end < str.length(); end++) {
      char endChar = str.charAt(end);
      if (map.containsKey(endChar)) {
        map.put(endChar, map.get(endChar) - 1);
        if (map.get(endChar) == 0) {
          matching++;
        }
      }

      if(matching == pattern.length()) {
        resultIndices.add(start);
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
    return resultIndices;
  }
}
