package Easy;

class Solution {
  public void moveZeroes(int[] nums) {
      int count = 0;
      for (int num : nums) {
          if (num == 0) count++;
      }
      int index = 0;
      for (int num : nums) {
          if (num != 0) {
              nums[index] = num;
              index++;
          }
      }
      
      for (int i = index; i < nums.length; i++) {
          nums[i] = 0;
      }
  }
}