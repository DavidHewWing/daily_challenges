class Solution {
  public boolean isPerfectSquare(int num) {
      for (int i = 0; i < Integer.MAX_VALUE; i++) {
          int square = i * i;
          if (square == num) return true;
          else if (square > num) return false;
      }
      return false;
  }
}