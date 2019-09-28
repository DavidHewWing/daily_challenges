class MaximumSubArray {

  public static void main(String args[]) {
    System.out.println(Integer.toString(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})));
  }

  public static int maxSubArray(int nums[]) {

    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      if(sum < 0) {
          sum = nums[i];
      } else {
        sum += nums[i];
      }
      if(sum > max) {
        max = sum;
      }
    }
    return max;
  }

}
