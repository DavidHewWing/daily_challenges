class PairWithTargetSum {
    // [1, 2, 3, 4, 6], 6
    //  ^
    //              ^
    public static int[] search(int[] arr, int targetSum) {
      int left = 0;
      int right = arr.length - 1;
      while(right > left) {
        int leftVal = arr[left];
        int rightVal = arr[right];
        if (leftVal + rightVal > targetSum) {
          right--;
        } else if (leftVal + rightVal < targetSum) {
          left++;
        } else if (leftVal + rightVal == targetSum) {
          return new int[] {left, right};
        }
      }
      return new int[] { -1, -1 };
    }
  }