class LongestCommonPrefix {

  public static void main (String args[]) {
    System.out.println(longestCommonPrefix(new String[]{"david", "dave"}));
  }

  
  public static String longestCommonPrefix(String str[]) {

    for(int i = 0; i < str[0].length(); i++) {
      char c = str[0].charAt(i);
      for(int j = 1; j < str.length; j++) {
        if(i == str[j].length() || str[j].charAt(i) != c) {
          return str[0].substring(0, i);
        }
      }
    }
    return "";
  }

}
