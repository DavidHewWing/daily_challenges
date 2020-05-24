import java.util.HashMap;

class Solution {
  public static void main (String args[]) {
    System.out.println(solution("araaci", 2));
  }

  public static int solution(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int start = 0;
    int max = Integer.MIN_VALUE;
    for (int end = 0; end < s.length(); end++) {
      char endChar = s.charAt(end);
      map.put(endChar, map.getOrDefault(endChar, 0) + 1);
      while (map.size() > k) {
        char startChar = s.charAt(start);
        map.put(startChar, map.get(startChar) - 1);
        if (map.get(startChar) == 0) {
          map.remove(startChar);
        }
        start++;
      }
      max = Math.max((end - start) + 1, max);
    }
    return max;
  }

}