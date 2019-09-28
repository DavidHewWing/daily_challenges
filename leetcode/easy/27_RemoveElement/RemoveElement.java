import java.util.Arrays;

class RemoveElement {

  public static void main(String args[]) {
    removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
  }

  public static int removeElement(int nums[], int val){

    int x = nums.length;
   int i = 0;

   while(i < x) {
     if(val != nums[i]) {
       i++;
     } else {
       int temp = nums[i];
       nums[i] = nums[x - 1];
       nums[x - 1] = temp;
       x--;
     }
   }
   System.out.println(Array.toString(nums));
   System.out.println(Integer.toString(val))
   return x;
   }
  }

}
