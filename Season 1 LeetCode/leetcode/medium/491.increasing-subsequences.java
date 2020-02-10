/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Increasing Subsequences
 */

// @lc code=start
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums, 0);
        return list;
    }
    
    private void helper(List<List<Integer>> list, List<Integer> temp, int[] nums, int start) {
        if(temp.size() > 1) list.add(new ArrayList<>(temp));
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;
            if (temp.size() == 0 || temp.get(temp.size() - 1) <= nums[i]) {
                used.add(nums[i]);
                temp.add(nums[i]);
                helper(list, temp, nums, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
}
// @lc code=end

