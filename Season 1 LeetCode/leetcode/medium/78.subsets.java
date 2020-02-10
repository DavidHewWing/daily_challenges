/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    
    public void helper(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int s){
        list.add(new ArrayList<>(temp));
        for(int i = s; i < nums.length; i++){
            temp.add(nums[i]);
            helper(list, temp, nums, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end

