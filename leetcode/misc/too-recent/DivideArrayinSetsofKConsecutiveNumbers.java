class Solution {
    /*
    We know if we have nums[i] and k. 
    We have to look for nums[i] nums[i+1]... -> until k.
    1. Add to hashmap with frequencies
    2. keep looking for the number until it hits k.
    3. if freq is 0 then return false.
    4. minus from freq
    */
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        // map.entrySet().forEach(entry->{
        //     System.out.println(entry.getKey() + " " + entry.getValue());  
        // });
        
        // while (map.size() > 0) {
        //     Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
        //     int key = entry.getKey();
        //     int value = map.get(key);
        //     for (int i = 0; i < k; i++) {
        //         if (!map.containsKey(key)) {
        //             return false;
        //         } else {
        //             map.put(key, map.get(key) - 1);
        //             if (map.get(key) == 0) {
        //                 map.remove(key);
        //             }
        //         }
        //         key++;
        //     }
        //     map.entrySet().forEach(entry1->{
        //         System.out.println(entry1.getKey() + " " + entry1.getValue());  
        //     });
        // }
        
        for (int a : nums) {
            if (map.get(a) > 0) {
                for (int i = 0; i < k; i++) {
                    if (!map.containsKey(a + i) || map.get(a + i) == 0) {
                        return false;
                    } else {
                        map.put(a + i, map.get(a + i) - 1);
                    }
                }
            }
        }
        
        return true;
        
    }
}
