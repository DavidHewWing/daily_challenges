import java.util.HashMap;

class Solution {
  public static void main(String args[]) {
      System.out.println(solution(new int[]{2, 1, 5, 1, 3, 2}, 3));
  }

  public static int solution(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int repeating = 0; // we permenantly increase window size, because this needs to be max repeated
    int start = 0;
    int max = Integer.MIN_VALUE;
    for (int end = 0; end < s.length(); end++) {
      char endChar = s.charAt(end);
      map.put(endChar, map.getOrDefault(endChar, 0) + 1);
      repeating = Math.max(repeated, map.get(endChar));
      if (end - start - repeated + 1 > k) {
        char startChar = s.charAt(start);
        map.put(startChar, map.get(startChar) - 1);
        start++;
      }
      max = Math.max(end - start + 1, max);
    }
    return max;
  }

}