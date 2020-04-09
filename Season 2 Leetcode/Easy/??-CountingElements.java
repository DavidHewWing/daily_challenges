package Easy;

class Solution {
  public int countElements(int[] arr) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int num : arr) {
          map.put(num, map.getOrDefault(num, 0) + 1);
      }
      int count = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          int key = entry.getKey();
          int value = entry.getValue();
          if (map.containsKey(key + 1)) {
              count += value;
          }
      }
      return count;
  }
}