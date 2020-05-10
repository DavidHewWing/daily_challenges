class Solution {
  public int findJudge(int N, int[][] trust) {
      HashMap<Integer, List<Integer>> map = new HashMap<>();
      for (int i = 0; i < trust.length; i++) {
          int x = trust[i][0];
          int y = trust[i][1];
          if (!map.containsKey(x)) {
              List<Integer> list = new ArrayList<>();
              list.add(y);
              map.put(x, list);
          } else {
              map.get(x).add(y);
          }
      }
      
      if (map.size() < N - 1) return -1;
      
      for (int i = 1; i <= N; i++) {
          boolean isJudge = true;
          if (!map.containsKey(i)) {
              System.out.println(i);
              for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                  if (!entry.getValue().contains(i)) {
                      isJudge = false;
                      break;
                  }
              }
              if (isJudge) return i;
          }
      } 
      return -1;
  }
}