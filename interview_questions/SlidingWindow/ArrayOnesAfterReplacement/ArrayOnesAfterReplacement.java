import java.util.HashMap;

class Solution {
  
  public static void main (String args[]) {
    System.out.println(solution(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
  }

  public static int solution(int[] arr, int k) {
    int maxOnes = 0;
    int start = 0;
    int max = Integer.MIN_VALUE;
    for (int end = 0; end < arr.length; end++) {
      if (arr[end] == 1) maxOnes++;
      if (end - start + 1 - maxOnes > k) {
        if (arr[start] == 1) maxOnes--;
        start++;
      }
      max = Math.max(max, end - start + 1);
    }
    return max;
  }

}