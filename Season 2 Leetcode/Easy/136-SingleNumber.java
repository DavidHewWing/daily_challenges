package Easy;

class Solution {
    public int singleNumber(int[] nums) {
        // Here we use XOR (Bitwise)
        // This is because when you have let's say [2,2,1]
        // 1st pass:
        // result = 0
        // 0 XOR 2 = 2
        // result -> 2
        // 2nd pass:
        // result = 2
        // 2 XOR 2 = 0
        // result -> 0
        // 3rd pass:
        // result = 0
        // 0 XOR 1 = 0
        // result -> 1
        int result = 0;
        for (int num : nums ) {
         	result ^= num;   
        }
	    return result;
    }
}