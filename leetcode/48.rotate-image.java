/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        // flips vertically
        for(int i = 0; i < matrix.length / 2; i++) {
            for(int j = 0; j < matrix.length; j++) {
                int swapper = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = swapper;
            }
        }
        // flips diagonally
        for(int k = 0; k < matrix.length; k++) {
            for(int l = k; l < matrix.length; l++) {
                if(k != l) {
                    int swapper = matrix[k][l];
                    matrix[k][l] = matrix[l][k];
                    matrix[l][k] = swapper;
                }   
            }
        }
    }
}
// @lc code=end

