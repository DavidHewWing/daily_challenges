class Solution {
  public int minSubArrayLen(int s, int[] nums) {
      int start = 0;
      int min = Integer.MAX_VALUE;
      int sum = 0;
      for (int end = 0; end < nums.length; end++) {
          sum += nums[end];
          while (sum >= s) {
              min = Math.min(end - start + 1, min);
              sum -= nums[start];
              start++;
          }
      }
      return min == Integer.MAX_VALUE ? 0 : min;
  }
}