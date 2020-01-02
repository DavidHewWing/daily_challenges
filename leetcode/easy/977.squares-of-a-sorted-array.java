/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int lo = 0;
        int hi = A.length - 1;
        int i = A.length - 1;
        while (hi >= lo) {
            int hiValue = (A[hi] < 0) ? -1 * A[hi] : A[hi];
            int loValue = (A[lo] < 0) ? -1 * A[lo] : A[lo];
            int squareHi = hiValue * hiValue;
            int squareLo = loValue * loValue;
            if (squareHi >= squareLo) {
                res[i] = squareHi;
                hi--;
            } else {
                res[i] = squareLo;
                lo++;
            }
            i--;
        }
        return res;
    }
}
// @lc code=end

