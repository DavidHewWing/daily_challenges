/*
 * @lc app=leetcode id=373 lang=java
 *
 * [373] Find K Pairs with Smallest Sums
 */

// @lc code=start
// two points: one at nums1, one at nums2
// [1*,7,11] [2,4,6*,7,8]
// 
// [(1,2), (1,4), (1,6)]

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) {
            return list;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->(a[0]+a[1])-(b[0]+b[1]));
        for (int i = 0; i < Math.min(nums1.length, k); i++) pq.offer(new int[]{nums1[i], nums2[0], 0});
        for (int i = 0; i < Math.min(nums1.length * nums2.length, k); i++) {
            int[] current = pq.poll();
            List<Integer> temp = new ArrayList<>();
            temp.add(current[0]);
            temp.add(current[1]);
            list.add(temp);
            if (current[2] < nums2.length - 1 ) {
                int idx = current[2] + 1;
                pq.offer(new int[]{current[0], nums2[idx], idx});
            }
        }
        return list;
    }
}
// @lc code=end

