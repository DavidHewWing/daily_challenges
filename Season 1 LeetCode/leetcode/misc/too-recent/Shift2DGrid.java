class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // Element at grid[i][j] becomes at grid[i][j + 1].
        // Element at grid[i][m - 1] becomes at grid[i + 1][0].
        // Element at grid[n - 1][m - 1] becomes at grid[0][0].
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < m; j++){
                temp.add(grid[i][j]);
            }
            list.add(temp);
        }
        
        while (k > 0){
            List<List<Integer>> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                List<Integer> temp1 = new ArrayList<>();
                for(int j = 0; j < m; j++){
                    if(j == 0 && i == 0) {
                        int value = list.get(n-1).get(m-1);
                        temp1.add(value);
                    } else if(j == 0 && i != 0){
                        int value = list.get(i-1).get(m-1);
                        temp1.add(value);
                    } else {
                        int value = list.get(i).get(j-1);
                        temp1.add(value);
                    }
                }
                temp.add(temp1);
            }
            k--;
            list.clear();
            list = temp;
        }
        
        return list;
    }
}