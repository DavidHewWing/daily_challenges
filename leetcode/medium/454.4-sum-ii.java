/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < B.length; j++){
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                if(map.containsKey(-1 * (C[i] + D[j]))){
                    res += map.get(-1 * (C[i] + D[j]));
                }
            }
        }
        return res;
    }
}
// @lc code=end

