/*
 * @lc app=leetcode id=646 lang=java
 *
 * [646] Maximum Length of Pair Chain
 */

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int[] pair : pairs) {
            if (pair[0] > max) {
                count++;
                max = pair[1];
            }
        }
        return count;
    }
}
// @lc code=end

