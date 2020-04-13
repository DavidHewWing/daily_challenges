package Easy;

class Solution {
  public int lastStoneWeight(int[] stones) {
      Queue<Integer> queue = new PriorityQueue<Integer>((a,b) -> b - a);
      for (int i : stones) queue.offer(i);
      while (queue.size() > 1) {
          int first = queue.poll();
          int second = queue.poll();
          if (first > second) {
              queue.offer(first - second);
          } else if (second > first) {
              queue.offer(second - first);
          }
      }
      return (queue.isEmpty()) ? 0 : queue.poll();
  }
}g