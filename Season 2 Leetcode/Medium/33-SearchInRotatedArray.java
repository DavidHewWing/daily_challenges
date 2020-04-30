class Solution {
  public int search(int[] nums, int target) {
      int n = nums.length;
      int high = n - 1;
      int low = 0;
      while (low <= high) {
          int mid = (high + low) / 2;
          if (nums[mid] == target)
              return mid;
          else if (nums[mid] <= nums[high]) {
              if (target > nums[mid] && target <= nums[high])
                  low = mid + 1;
              else
                  high = mid - 1;
          }
          else { // target < mi
              if (nums[low] <= target && target < nums[mid])
                  high = mid - 1;
              else
                  low = mid + 1;
          }
      }
      return -1;
  }
}