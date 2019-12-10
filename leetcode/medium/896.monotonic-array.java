/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2){
            return true;
        }
        
        int start = 0;
        boolean isDecreasing = false;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] != A[i+1]){
                start = i + 1;
                isDecreasing = (A[i] > A[i+1]) ? false : true;
                break;
            }
        }
        if(start == 0)
            return true;
        for(int i = start; i < A.length-1; i++){
            if(isDecreasing){
                if(A[i] > A[i+1])
                    return false;
            }else{
                if(A[i] < A[i+1])
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end

