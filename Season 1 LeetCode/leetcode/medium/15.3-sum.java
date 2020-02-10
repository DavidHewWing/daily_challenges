/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++) {
            int sum = 0 - nums[i];
            int lo = i+1;
            int hi = nums.length - 1;
            if(i == 0 || i > 0 && nums[i] != nums[i-1]){
                while (lo < hi) {
                    if(nums[lo] + nums[hi] == sum) {
                        list.add(Arrays.asList(nums[lo], nums[hi], nums[i]));
                        while(lo < hi && nums[hi] == nums[hi - 1])hi--;
                        while(lo < hi && nums[lo] == nums[lo + 1])lo++;
                        hi--;
                        lo++;
                    }else if(nums[lo] + nums[hi] < sum) {
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return list;
    }
}
// @lc code=end

