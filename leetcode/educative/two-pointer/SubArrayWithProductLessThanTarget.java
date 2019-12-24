import java.util.*;

class SubarrayProductLessThanK {

  public static List<List<Integer>> findSubarrays(int[] arr, int target) {
    List<List<Integer>> subarrays = new ArrayList<>();
    int start = 0;
    int product = 1;
    for (int end = 0; end < arr.length; end++) {
      product *= arr[end];
      while (product >= target && start < arr.length) {
        product /= arr[start];
        start++;
      }
      List<Integer> list = new LinkedList<>();
      for (int i = end; i >= start; i--) {
        list.add(0, arr[i]);
        subarrays.add(new ArrayList<>(list));
      }
    }
    return subarrays;
  }
}
