class Solution {
    
    // here I needed to use a list to keep track of the number of closed
    // this is because using a global variable messed up my output
    // primitives aren't contained in parameter, but references are.
    // maybe I use a Integer class

    private static int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    
    public int closedIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        ArrayList<Integer> numClosed = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    queue.offer(new int[]{i,j});
                    explore(queue, grid, visited, numClosed);
                }
            }
        }
        return numClosed.size();
    }
    
    private static void explore(Queue<int[]> queue, int[][] grid, boolean[][] visited, ArrayList<Integer> numClosed) {
        int m = grid.length;
        int n = grid[0].length;
        boolean onBoundary = false;
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            if(temp[0] == 0 || temp[1] == 0 || temp[0] == m - 1 || temp[1] == n -1)
                onBoundary = true;
            for(int[] dir : dirs) {
                int tempx = dir[0] + temp[0];
                int tempy = dir[1] + temp[1];
                if(tempx < 0 || tempx >= m || tempy < 0 || tempy >= n || visited[tempx][tempy] || grid[tempx][tempy] == 1)
                    continue;
                
                if(tempx == 0 || tempy == 0 || tempx == m - 1 || tempy == n -1)
                    onBoundary = true;
                
                visited[tempx][tempy] = true;
                queue.offer(new int[]{tempx, tempy});
            }
        }
        if(!onBoundary) numClosed.add(0);
    }
}