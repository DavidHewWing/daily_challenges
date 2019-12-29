class HappyNumber {

    public static boolean find(int num) {
      int slow, fast;
      slow = fast = num;
      do {
          slow = digitSquareSum(slow);
          fast = digitSquareSum(fast);
          fast = digitSquareSum(fast);
      } while(slow != fast);
      return slow == 1;
    }
  
    public static int digitSquareSum(int n) {
      int sum = 0, tmp;
      while (n > 0) {
          tmp = n % 10;
          sum += tmp * tmp;
          n /= 10;
      }
      return sum;
  }
  
    public static void main(String[] args) {
      System.out.println(HappyNumber.find(23));
      System.out.println(HappyNumber.find(12));
    }
  }