import java.util.*;

class TripletSumToZero {
  // this is correct. i just don't sort the values at the end.
  // O (nlogn + O(n) * O(n));
  // O(n^2 + nlogn)
  // O(n^2)
  public static List<List<Integer>> searchTriplets(int[] arr) {
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(arr); // nlogn
    for (int i = 0; i < arr.length; i++) { // O(n)
      int firstValue = arr[i];
      int left = i + 1;
      int right = arr.length - 1;
      while (right > left) { // O(n);
        if (firstValue + arr[right] + arr[left] == 0) {
          triplets.add(new ArrayList<>(Arrays.asList(firstValue, arr[right], arr[left])));
          left++;
          right--;
        } else if (arr[right] + arr[left] + firstValue > 0) {
          right--;
        } else if(arr[right] + arr[left] + firstValue < 0) {
          left++;
        }
      }
    }
    return triplets;
  }
}