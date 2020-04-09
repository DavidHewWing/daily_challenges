package Easy;

class Solution {
  public boolean isHappy(int n) {
      HashSet<Integer> seen = new HashSet<>();
      int sum = 0;
      while (n != 0) {
          int num = n % 10;
          sum += num * num;
          n /= 10;
          if (n == 0) {
              if (sum == 1) return true;
              if (seen.contains(sum)) return false;
              seen.add(sum);
              n = sum;
              sum = 0;
          }
      }
      return false;
  }
}