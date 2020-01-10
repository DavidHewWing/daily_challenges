/*
 * @lc app=leetcode id=986 lang=java
 *
 * [986] Interval List Intersections
 */

// @lc code=start
class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> result = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < A.length && j < B.length) {
            int[] aVal = A[i];
            int[] bVal = B[j];
            int maxX = Math.max(aVal[0], bVal[0]);
            int minY = Math.min(aVal[1], bVal[1]);
            if (maxX <= minY) {
                result.add(new int[]{maxX, minY});
            }
            if (aVal[1] == minY) i++;
            else if (bVal[1] == minY) j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
// @lc code=end

