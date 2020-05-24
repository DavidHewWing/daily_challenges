import java.util.HashMap;

class Solution {
  
  public static void main (String args[]) {
    System.out.println(solution(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
  }

  public static int solution(char[] arr) {
    HashMap<Character, Integer> map = new HashMap<>();
    int k = 2;
    int start = 0;
    int max = Integer.MIN_VALUE;
    for (int end = 0; end < arr.length; end++) {
      char endChar = arr[end];
      map.put(endChar, map.getOrDefault(endChar, 0) + 1);
      while (map.size() > k) {
        char startChar = arr[start];
        map.put(startChar, map.get(startChar) - 1);
        if (map.get(startChar) == 0) {
          map.remove(startChar);
        }
        start++;
      }
      max = Math.max(max, end - start + 1);
    }
    return max;
  }

}