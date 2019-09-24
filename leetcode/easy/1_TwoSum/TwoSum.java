import java.util.HashMap;
import java.lang.Math;
import java.util.Arrays;

class TwoSum {

  public static void main(String args[]) {
    String result = "";
    int solution[] = twoSum(new int[]{2, 9, 7, 15}, 9);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      if(map.containsKey(nums[i])) {
        int index = map.get(nums[i]);
        return new int[]{index, i};
      }
      map.put(difference, i);
    }
    return null;
  }

}
