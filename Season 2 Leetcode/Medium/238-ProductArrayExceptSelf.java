package Medium;

/**
 * Check DropBox PARA for explanation.
 */

class Solution {
  public int[] productExceptSelf(int[] nums) {
      
      int n = nums.length;
      int[] left = new int[n];
      int[] right = new int[n];
      
      int x = 1;
      for (int i = 0; i < n; i++) {
          left[i] = x * nums[i];
          x *= nums[i];
      }
      
      x = 1;
      for (int i = n - 1; i >= 0; i--) {
          if (i == n - 1) right[i] = 1;
          else right[i] = x;
          x *= nums[i];
      }

      int res[] = new int[n];
      res[0] = right[0];
      for (int i = 1; i < n; i++) {
          res[i] = right[i] * left[i-1];
      }
      
      return res;
  }
}