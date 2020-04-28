class Solution {
  public boolean checkValidString(String s) {
      int couldBePaired = 0;
      int mustBePaired = 0;
      for (char c : s.toCharArray()) {
          if (c == '(') {
              mustBePaired++;
              couldBePaired++;
          } else if (c == ')') {
              mustBePaired--;
              couldBePaired = Math.max(couldBePaired - 1, 0);
          } else { // star
              mustBePaired++;
              couldBePaired = Math.max(couldBePaired - 1, 0);
          }
          if (mustBePaired < 0) return false; 
      }
      return couldBePaired == 0;
  }
}