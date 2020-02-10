/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++){
            int[] nums = A[i];
            int lo = 0;
            int hi = nums.length - 1;
            while(lo < hi){
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
                lo++;
                hi--;
            }
            A[i] = nums;
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }
        return A;
    }
}
// @lc code=end

