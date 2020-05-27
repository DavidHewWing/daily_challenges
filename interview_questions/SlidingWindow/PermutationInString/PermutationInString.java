import java.util.HashMap;

class Solution {
  
  public static void main (String args[]) {
    System.out.println(solution("odicf", "dc"));
  }

  public static boolean solution(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    int start = 0;
    int matching = 0;

    for (char c : t.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (int end = 0; end < s.length(); end++) {
      char endChar = s.charAt(end);
      if (map.containsKey(endChar)) {
        map.put(endChar, map.get(endChar) - 1);
        if (map.get(endChar) == 0) {
          matching++;
        }
      }

      if (matching == map.size()) return true;

      if (end - start + 1 >= t.length()) {
        char startChar = s.charAt(start);
        if (map.containsKey(startChar)) {
          map.put(startChar, map.get(startChar) + 1);
          if (map.get(startChar) == 1) {
            matching--;
          }
        }
        start++;
      }
    }
    return false;
  }

}