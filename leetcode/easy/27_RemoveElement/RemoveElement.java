import java.util.Arrays;

class RemoveElement {

  public static void main(String args[]) {
    removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
  }

  public static int removeElement(int nums[], int val){

    int x = nums.length - 1;
    int i = 0;

    while(i < x) {
      if(val != nums[i]) {
        i++;
      } else {
        int temp = nums[i];
        nums[i] = nums[x];
        nums[x] = temp;
        x--;
      }
    }
    System.out.println(Arrays.toString(nums));
    System.out.println(Integer.toString(x + 1));
    return x + 1;
  }

}
