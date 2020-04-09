package Easy;

class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          if (map.containsKey(nums[i]))
              return new int[]{i, map.get(nums[i])};
          map.put(target-nums[i], i);
      }
      return new int[]{0,0};
  }
}

/**
 * Easy question - Getting back into things.
 * Basically all you do is put the complement into a HashMap.
 * This way when you see the complement in the map, you know you have already seen the addiditive as well.
 * Thus you can now return the value.
 */