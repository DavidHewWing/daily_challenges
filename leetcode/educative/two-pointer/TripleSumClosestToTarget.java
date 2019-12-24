import java.util.*;

class TripletSumCloseToTarget {

  public static int searchTriplet(int[] nums, int targetSum) {
    int minDifference = Integer.MAX_VALUE;
    int minSum = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (right > left) {
        int sum = nums[i] + nums[left] + nums[right];
        int diff = Math.abs(targetSum - sum);
        if (diff < minDifference) {
          minDifference = targetSum - sum;
          minSum = sum;
        }
        
        if (sum > targetSum) {
          right--;
        } else if (sum < targetSum) {
          left++;
        } else if (sum == targetSum) {
          return sum;
        }

      }
    }
    return minSum;
  }
}