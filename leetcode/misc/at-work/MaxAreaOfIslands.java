class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int max = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                    int x = explore(visited, queue, grid);
                    max = Math.max(max, x);
                }
            }
        }
        return max;
    }
    
    private static int[][] dirs = {{1,0}, {-1,0}, {0,-1}, {0,1}};
    private static int explore(boolean[][] visited, Queue<int[]> queue, int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            max++;
            for(int[] dir : dirs){
                int tempx = dir[0] + temp[0];
                int tempy = dir[1] + temp[1];
                if(tempx < 0 || tempx >= m || tempy < 0 || tempy >= n || grid[tempx][tempy] == 0 || visited[tempx][tempy])
                    continue;
                queue.offer(new int[]{tempx, tempy});
                visited[tempx][tempy] = true;
            }
        }
        return max;
    }
}
