import java.util.*;

class Solution {

    //Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
    
    //Example 1:
    
    //Input: [2, 1, 5, 1, 3, 2], k=3 
    //Output: 9
    //Explanation: Subarray with maximum sum is [5, 1, 3].

    public static int findMaxSumSubArray(int k, int[] arr) {
        int start = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
          sum += arr[i];
          if(i >= k - 1) {
            max = Math.max(sum, max);
            sum -= arr[start];
            start++;
          }
        }
        return max;
      }
    public static void main (String args[]) {

    }
}