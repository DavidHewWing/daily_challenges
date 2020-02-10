import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.equals("")) {
            return new ArrayList<>();
        }
        String[] combos = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> queue = new LinkedList<String>();
        char[] digs = digits.toCharArray();
        queue.add("");
        for(int i = 0; i < digs.length; i++) {
            int x = Character.getNumericValue(digs[i]);
            while(queue.peek().length() == i) {
                String s = queue.remove();
                for(char c : combos[x].toCharArray()) {
                    queue.add(s + c);
                }
            }
        }
        return queue;
    }
}
// @lc code=end

