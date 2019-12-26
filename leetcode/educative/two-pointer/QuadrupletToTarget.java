import java.util.*;

class QuadrupleSumToTarget {

  public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    Arrays.sort(arr);
    List<List<Integer>> quadruplets = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (i > 0 && arr[i] == arr[i - 1]) continue;
      for (int j = i + 1; j < arr.length; j++) {
        if (j > 0 && arr[j] == arr[j-1]) continue;
        int lo = j + 1;
        int hi = arr.length - 1;
        while (hi > lo) {
          int sum = arr[i] + arr[j] + arr[hi] + arr[lo];
          if (sum == target) {
            quadruplets.add(Arrays.asList(arr[i], arr[j], arr[hi], arr[lo]));
            lo++;
            hi--;
          }
          if (sum > target) {
            hi--;
          }
          if (sum < target) {
            lo++;
          }
        }
      }
    }
    return quadruplets;
  }
}