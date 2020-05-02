class Solution {
  public int numJewelsInStones(String J, String S) {
      HashMap<Character, Integer> map = new HashMap<>();
      for (char c : S.toCharArray()) {
          map.put(c, map.getOrDefault(c, 0) + 1);
      }
      int count = 0;
      for (char c : J.toCharArray()) {
          count += map.getOrDefault(c, 0);
      }
      return count;
  }
}