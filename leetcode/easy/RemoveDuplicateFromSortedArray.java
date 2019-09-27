import java.util.Arrays;

class RemoveDuplicatesSortedArray {

  public static void main(String args[]) {

    removeDuplicates(new int[]{1,1,2});

  }

  public static int removeDuplicates(int nums[]) {

    if (nums.length == 0) return 0;
    int x = 0;
    // you keep iterating until you reach a number that is larger
    for(int i = 1; i < nums.length; i++) {
      if(nums[i] != nums[x]) {
        x++;
        nums[x] = nums[i];
      }
    }
    System.out.println(Arrays.toString(nums));
    return x;
  }

}
