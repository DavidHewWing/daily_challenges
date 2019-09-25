class ReverseInteger {

  public static void main (String args[]) {

    int solution = solution(123);
    int solution1 = solution(-123);
    int solution2 = solution(120);
    System.out.println(Integer.toString(solution));
    System.out.println(Integer.toString(solution1));
    System.out.println(Integer.toString(solution2));

  }

  public static int solution(int input) {

    int result = 0;

    while(input != 0) {
      int lastDigit = input % 10;
      input /= 10;
      result = result * 10 + lastDigit;
    }

    return result;

  }

}
