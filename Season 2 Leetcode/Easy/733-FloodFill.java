class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      //bfs
      if (image[sr][sc] == newColor) return image;
      Queue<int[]> qu = new LinkedList<>();
      qu.offer(new int[]{sr, sc});
      
      int[] gx = {1,-1,0,0};
      int[] gy = {0,0,1,-1};
      
      int oldColor = image[sr][sc];
      
      while (!qu.isEmpty()) {
          int size = qu.size();
          for (int i = 0; i < size; i++) {
              int[] cur = qu.poll();
              int x = cur[0];
              int y = cur[1];
              image[x][y] = newColor;
              for (int k = 0; k < 4; k++) {
                  int nx = gx[k] + x;
                  int ny = gy[k] + y;
                  if (nx < 0 || ny < 0 || nx >= image.length || ny >= image[0].length ||
                     image[nx][ny] != oldColor) continue;
                  qu.offer(new int[]{nx, ny});
              }
              
          }
      }
      return image;
  }
}