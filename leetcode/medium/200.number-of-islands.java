/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    queue.offer(new int[]{i,j});
                    explore(queue, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    private static int[][] dirs = {{0,1}, {0, -1}, {1,0}, {-1,0}};
    private static void explore(Queue<int[]> queue, char[][] grid, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            for(int[] dir : dirs) {
                int tempx = dir[0] + temp[0];
                int tempy = dir[1] + temp[1];
                if(tempx < 0 || tempx >= m || tempy < 0 || tempy >= n || visited[tempx][tempy] || grid[tempx][tempy] == '0')
                continue;
                
                visited[tempx][tempy] = true;
                queue.offer(new int[]{tempx, tempy});
            }
        }
    }
    
}

// @lc code=end

