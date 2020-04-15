package Medium;

class Solution {
  // add all elements in String to a LinkedList
  // follow algorithm
  // if 0 -> left -> removeFirst, add(s.length() - 1, value);
  // if 1 -> right -> removeLast, add(0, value);
  public String stringShift(String s, int[][] shift) {
      LinkedList<Character> list = new LinkedList<>();
      for (char c : s.toCharArray()) {
          list.add(c);
      }
      int size = list.size();
      for (int[] arr : shift) {
          int dir = arr[0];
          int times = arr[1];
          if (dir == 1) {
              for (int i = 0; i < times; i++) {
                  char c = list.removeLast();
                  list.add(0, c);
              }
          } else {
              for (int i = 0; i < times; i++) {
                  char c = list.removeFirst();
                  list.add(size - 1, c);
              }
          }
      }
      StringBuilder sb = new StringBuilder();
      for (char c : list) {
          sb.append(c);
      }
      return sb.toString();
  }
}