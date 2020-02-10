/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        dfs(list, "", n, 0, 0);
        return list;
    }

    public void dfs(List<String> list, String str, int n, int noClose, int noOpen) {
        
        if(str.length() == n*2){
            list.add(str);
            return;
        }
        
        if(noOpen < n)
            dfs(list, str+"(", n, noClose, noOpen + 1);
        if(noOpen > noClose)
            dfs(list, str+")", n, noClose+1, noOpen);
    }
}
// @lc code=end

