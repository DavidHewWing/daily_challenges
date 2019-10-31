/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String add = new String(cs);
            if(map.containsKey(add)){
                List<Integer> list = map.get(add);
                list.add(i);
                map.put(add, list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(add, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String str : map.keySet()){
            List<Integer> list = map.get(str);
            List<String> temp = new ArrayList<>();
            for(int x : list){
                temp.add(strs[x]);
            }
            result.add(temp);
        }
        return result;
    }
}
// @lc code=end

