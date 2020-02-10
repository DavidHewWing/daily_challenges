/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        // State transitions
        //  0 : dead to dead
        //  1 : live to live
        //  2 : live to dead
        //  3 : dead to live
        int[][] dir ={{1,-1},{1,0},{1,1},{0,-1},{0,1},{-1,-1},{-1,0},{-1,1}};
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int alive = 0;
                for(int[] d : dir){
                    int x = d[0] + i;
                    int y = d[1] + j;
                    if(x >= board.length || x < 0 || y >= board[0].length || y < 0){
                        continue;
                    }
                    if(board[x][y] == 1 || board[x][y] == 2){
                        alive++;
                    }  
                }
                if(board[i][j] == 1 && (alive < 2 || alive > 3)) board[i][j] = 2;
                if(board[i][j] == 0 && alive == 3) board[i][j] = 3;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] %=2;
            }
        }
    }
}
// @lc code=end

