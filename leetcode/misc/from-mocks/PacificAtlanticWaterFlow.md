Public List<Integer[]> pacific_atlantic(int[][] grid) {
	List<Integer[]> list = new ArrayList<>();
int n = grid.length;
	Int m = grid[0].length;
	Queue<Integer[]> queue = new LinkedList<>();
	For (int i = 0; i < n; i++) {
		For (int j = 0; j < m; j++) {
			Boolean visited[][] = new boolean[n][m];
			Visited[i][j] = true;
			queue.offer(new int[]{i, j});
			Boolean bool = explore(queue, visited, grid);
			if(bool) list.add(new int[]{i, j});
		}
	}
	Return list;
}

Public int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0, -1}};
Public void explore(Queue<Integer> queue, boolean[][] visited, int[][] grid) {
	int n = grid.length;
	Int m = grid[0].length;
	Boolean topReached = false;
	Boolean leftReached = false;
	Boolean rightReached = false;
	Boolean bottomReached = false;
	While (!queue.isEmpty()) {
		Int[] exploring = queue.poll();
		Int currx = exploring[0];
		Int curry = exploring[1];
		if(currx == m - 1)
rightReached = true;
if(currx == 0)
leftBoundary = true;
if(curry == n - 1)
bottomBoundary = true;
if(curry == 0)
topBoundary = true;
		For(int[] dir : dirs) {
			Int x = currx + dir[0];
Int y = curry + dir[1];
// out of bounds check
if(tempy >= n || tempy < 0 || tempx >= m || tempx < 0 || visited[tempx][tempy])
Continue;
// next value you are explore if bigger (can’t trickle)
if(grid[x][y] > grid[currx][curry])
	Continue;
visited[tempx][tempy];
queue.offer(new int[]{tempx, tempy});
		}
	}
	if((bottomReached || rightReached) && (topReached || leftReached)) {
		Return true;
	}
	Return false;
}
