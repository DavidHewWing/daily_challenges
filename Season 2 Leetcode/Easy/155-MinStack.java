package Easy;

class MinStack {

  private ArrayList<Integer> list;
  private Stack<Integer> stack;
  
  public MinStack() {
      stack = new Stack<>();
      list = new ArrayList<>();
  }
  
  public void push(int x) {
      stack.push(x);
      list.add(x);
  }
  
  public void pop() {
      int x = stack.pop();
      list.remove(Integer.valueOf(x));
  }
  
  public int top() {
      return stack.peek();
  }
  
  public int getMin() {
      Collections.sort(list);
      return list.get(0);
  }
}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/