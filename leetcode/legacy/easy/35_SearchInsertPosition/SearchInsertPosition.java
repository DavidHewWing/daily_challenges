class SearchInsertPosition {

  public static void main (String args[]) {

    System.out.println(searchInsertPosition(new int[]{1,3,5,6}, 7));

  }

  public static int searchInsertPosition(int nums[], int target) {

    for (int i = 0; i < nums.length; i++) {
     if(nums[i] == target) {
       return i;
     }
     if(nums[i] > target) {
       return i;
     }
   }
   return nums.length;
   }

}
