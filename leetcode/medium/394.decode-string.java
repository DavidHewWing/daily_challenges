import java.util.Stack;

/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Stack<String> charStack = new Stack();
        Stack<Integer> countStack = new Stack();
        String str = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[') {
                charStack.push(str);
                str = "";
            } else if (s.charAt(i) == ']') {
                StringBuilder sBuilder = new StringBuilder(charStack.pop());
                int counter = countStack.pop();
                for(int j = 0; j < counter; j++) {
                    sBuilder.append(str);
                }
                str = sBuilder.toString();
            } else if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                    num = num * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                countStack.push(num);
            } else {
                str += s.charAt(i);
            }
    }
    return str;
}
}
// @lc code=end

