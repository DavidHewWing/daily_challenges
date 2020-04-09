package Easy;

class Solution {
  public boolean backspaceCompare(String S, String T) {
      StringBuilder sb1 = new StringBuilder();
      int count = 0;
      for (int i = S.length() - 1; i >= 0; i--) {
          if (S.charAt(i) == '#') {
              count++;
          } else if (count == 0) {
              sb1.append(S.charAt(i));
          } else {
              count--;
          }
      }
      count = 0;
      StringBuilder sb2 = new StringBuilder();
      for (int i = T.length() - 1; i >= 0; i--) {
          if (T.charAt(i) == '#') {
              count++;
          } else if (count == 0) {
              sb2.append(T.charAt(i));
          } else {
              count--;   
          }
      }
      return sb1.toString().equals(sb2.toString());
  }
}