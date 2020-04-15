package Medium

class Solution {
  // This problem follows the prefix sum pattern.
  //  If we treat 1 as a +1 and 0 as -1
  // we can keep track of how many 0 and 1 there are via a sum
  // we can find where the last one or zero is which keeps the subarray valid
  public int findMaxLength(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0,-1);
      int max = 0;
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
          int num = nums[i];
          if (num == 0) sum += -1;
          else sum += 1;
          if (map.containsKey(sum)) {
              max = Math.max(max, i - map.get(sum));
          } else {
              map.put(sum, i);
          }
      }
      return max;
  }
}