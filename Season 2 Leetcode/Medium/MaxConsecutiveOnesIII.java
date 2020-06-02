class Solution {
  /*
  1. What do we do when we increment the window end? check if we need to increment window start, get max value of window.
  2. What do we do when we increment the window start? move start pointer, if we have a 0 at start pointer do nothing, 1 decrement repeated
  3. When do we increment window start? Whenever we have more 0s than K inside window.
  4. When do we increment window end? Every access.
  */
  public int longestOnes(int[] A, int K) {
      int start = 0;
      int max = Integer.MIN_VALUE;
      int repeated = 0;
      for (int end = 0; end < A.length; end++) {
          if (A[end] == 1) repeated++;
          
          if (end - start + 1 - repeated > K) {
              if (A[start] == 1) repeated--;
              start++;
          }
          
          max = Math.max(max, end - start + 1);
      }
      return max;
  }
}