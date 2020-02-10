/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        search(list, new ArrayList<>(), 1, k, n);
        return list;
    }
    
    private void search(List<List<Integer>> list, List<Integer> temp, int start, int k, int n){
        if(temp.size() == k){
            if(n == 0){
                List<Integer> comb = new ArrayList<>(temp);
                list.add(comb);
            }
            return;
        }
        
        for(int i = start; i <= 9; i++){
            temp.add(i);
            search(list, temp, i+1, k, n-i);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end

