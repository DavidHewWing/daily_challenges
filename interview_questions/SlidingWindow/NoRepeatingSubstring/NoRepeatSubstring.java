import java.util.HashMap;

class Solution {
  public static void main(String args[]) {
    System.out.println(solution("abccde"));
  }

  // why Math.max(start, map.get(endChar) + 1)?
  // this is because the start window could already be further along the last occurence fot endchar.
  public static int solution(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int start = 0;
    int max = Integer.MIN_VALUE;
    for (int end = 0; end < s.length(); end++) {
      char endChar = s.charAt(end);
      if (map.containsKey(endChar)) {
        start = Math.max(start, map.get(endChar) + 1);
      }
      max = Math.max(max, end - start + 1);
      map.put(endChar, end);
    }
    return max;
  }
}