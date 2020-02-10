class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + num);
        }
        // keep track of current max, and max before
        int before = 0;
        int current = 0;
        for(int x : map.keySet()){
            if(!map.containsKey(x - 1)){
                before = current;
                current += map.get(x);
            }else{
                int temp = Math.max(before + map.get(x), current);
                before = current;
                current = temp;
            }
        }
        return current;
    }
}
