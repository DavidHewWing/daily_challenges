class SortedArraySquares {
    // [-2, -1, 0, 2, 3]
    // [0, 0, 0, 0, 9]
    // left = -2, right = 3
    public static int[] makeSquares(int[] arr) {
      int[] squares = new int[arr.length];
      int left = 0;
      int right = arr.length - 1;
      int hi = arr.length - 1;
      while (right > left) {
        int squareleft = arr[left] * arr[left];
        int squareright = arr[right] * arr[right];
        if (squareright > squareleft) {
          squares[hi] = squareright;
          right--;
          hi--;
        } else {
          squares[hi] = squareleft;
          left++;
          hi--;
        }
      }
      return squares;
    }
  }
  