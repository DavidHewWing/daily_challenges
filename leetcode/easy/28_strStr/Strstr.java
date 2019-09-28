class StrStr {

  public static void main (String args[]) {

    strStr("hello", "ll");

  }

  public static int strStr(String haystack, String needle) {

    int x = haystack.indexOf(needle);
    System.out.println(Integer.toString(x));
    return x;

  }

}
