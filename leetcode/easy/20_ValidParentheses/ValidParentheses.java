import java.util.Stack;

class ValidParentheses {

  public static void main(String args[]) {
    System.out.println(validParentheses("(){}()[}"));
  }

  public static boolean validParentheses(String str) {

    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if(c == '[' || c == '(' || c == '{') {
        stack.push(c);
      } else if(c == ']') {
        if(stack.pop() != '[') return false;
      } else if(c == '}') {
        if(stack.pop() != '{') return false;
      } else if (c == ')') {
        if (stack.pop() != '(') return false;
      }
    }
    return true;
  }


}
