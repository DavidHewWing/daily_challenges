import java.lang.Math;

class PalindromeNumber {

    public static void main (String args[]) {
        boolean solution = palindromeNumber(12221);
        System.out.println(solution);
        boolean sol1 = palindromeString("ABBA");
        System.out.println(sol1);
    }



    public static boolean palindromeNumber(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int number = 0;
        while(x > number) {
            number = number * 10 + x % 10;
            x /= 10;
        }

        return x == number || x == number/10;

    }

    //for a string
    public static boolean palindromeString(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
