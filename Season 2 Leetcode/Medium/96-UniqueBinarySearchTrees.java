class Solution {
  public int numTrees(int n) {
      int[] dp = new int[n + 1];
      dp[0] = 1;
      dp[1] = 1;
      for (int i = 2; i <= n; i++) { // where it is height wise
          dp[i] = 0;
          for (int j = 1; j <= i; j++) { // the value of the root
            dp[i] += dp[j-1] * dp[i-j];  
          }
      }
      return dp[n];
  }
}