class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
      Arrays.sort(coordinates, new Comparator<int[]>() {
          public int compare(int[] o1, int[] o2) {
              if (o1[0] == o2[0]) {
                  return Integer.compare(o1[1], o2[1]);
              } else {
                  return Integer.compare(o1[0], o2[0]);
              }
          }
      });
      
      int slope = 0;
      
      if (coordinates[1][0] - coordinates[0][0] == 0) {
          slope = Integer.MIN_VALUE;
      } else {
          slope = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
      }
      
      for (int i = 1; i < coordinates.length -1; i++) {
          int x = coordinates[i+1][0] - coordinates[i][0];
          int y = coordinates[i+1][1] - coordinates[i][1];
          
          int tempSlope = 0;
          if (x == 0) {
              tempSlope = Integer.MIN_VALUE;
          } else {
              tempSlope = y / x;
          }
          if (tempSlope != slope) return false;
      }
      
      return true;
  }
}