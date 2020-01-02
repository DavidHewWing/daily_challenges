/*
 * @lc app=leetcode id=1190 lang=java
 *
 * [1190] Reverse Substrings Between Each Pair of Parentheses
 */

// @lc code=start
/*
1. What to do when we see open bracket? - Add to stack the index.
2. What to do when we see close bracket? - Reverse the String Builder (from popped value and i);
3. What to do when we see letter? - Add to StringBuilder

Steps:
1. Init stack for the indexes of the open brackets, and stack for characters.
2. Init StringBuilder
3. Iterate through string.
    3a. if Open bracket add to stack.
    3b. if Close bracket add to result and reverse.
    3c. if letter add to stringbuilder.
4. remove all parentheses to string builder
5. O(n^2) = because we also have to reverse take O(n)
*/

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int start = stack.pop();
                int end = i;
                reverseCopy(sb, start, end);
            }
        }
        System.out.println(sb.toString());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char cur = sb.charAt(i);
            if (cur != '(' && cur != ')') {
                res.append(cur);
            }
        }
        return res.toString();
    }
    public void reverseCopy(StringBuilder sb, int start, int end) {
        if (start+1 == end) {
            return;
        }
        while (start < end) {
            char left = sb.charAt(start);
            char right = sb.charAt(end);
            sb.setCharAt(start, right);
            sb.setCharAt(end, left);
            start++;
            end--;
        }
        return;
    }
}
// @lc code=end

