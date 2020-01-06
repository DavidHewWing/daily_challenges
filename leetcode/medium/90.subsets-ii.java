/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), 0, nums);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> temp, int start, int[] nums) {
        list.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            helper(list, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end

