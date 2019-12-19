class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
      int start = 0;
      int sum = 0;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        while (sum >= S) {
          min = Math.min(min, i - start + 1);
          sum -= arr[start];
          start++;
        }
      }
      return min;
    }
  }
  