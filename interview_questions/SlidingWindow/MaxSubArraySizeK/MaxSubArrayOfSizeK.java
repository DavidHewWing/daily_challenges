/*
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 * Example:
 * Input: [2,1,4,1,3,2], k = 3
 * Output: 9
 * [5,1,3]
 */

class Solution {
  public static void main(String args[]) {
      System.out.println(solution(new int[]{2, 1, 5, 1, 3, 2}, 3));
  }

  public static int solution(int[] arr, int k) {
    int start = 0;
    int sum = 0;
    int max = 0;


    // i-start == windowSize
    for (int i = 0; i < arr.length; i++) {
      if (i - start >= k) {
        sum -= arr[start];
        start++;
      }
      sum += arr[i];
      max = Math.max(sum, max);
    }

    return max;

  }

}