class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];
        int odds = 0;
        for(int i = 0; i < indices.length; i++){
            int[] pair = indices[i];
            for(int j = 0; j < m; j++){
                result[pair[0]][j] += 1;
                if(result[pair[0]][j] % 2 != 0) odds++;
                else odds--;
            }
            for(int k = 0; k < n; k++){
                result[k][pair[1]] += 1;
                if(result[k][pair[1]] % 2 != 0) odds++;
                else odds--;
            }
        }
        
        return odds;
    }
}