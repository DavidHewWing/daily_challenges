/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length + 1][2];
        for (int i = 0; i < intervals.length; i++) {
            result[i] = intervals[i];
        }
        result[result.length - 1] = newInterval;
        Arrays.sort(result, (i1, i2) -> Integer.compare(i1[0], i2[0])); // sort by ascending x
        
        List<int[]> list = new ArrayList<>();
		int[] newBoy = result[0];
		list.add(newBoy);
		for (int[] interval : result) {
			if (interval[0] <= newBoy[1])
				newBoy[1] = Math.max(newBoy[1], interval[1]);
			else {
				newBoy = interval;
				list.add(newBoy);
			}
		}

		return list.toArray(new int[list.size()][]);
    }
}
// @lc code=end

