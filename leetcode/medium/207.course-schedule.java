/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Init Graph
        HashMap<Integer, Integer> degrees = new HashMap<>();
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            degrees.put(i, 0);
            graph.put(i, new ArrayList<Integer>());
        }
        
        // Build Graph
        for (int i = 0; i < prerequisites.length; i++) {
            int parent = prerequisites[i][0];
            int child = prerequisites[i][1];
            degrees.put(child, degrees.get(child) + 1);
            graph.get(parent).add(child);
        }
        
        // Find Sources
        Queue<Integer> queue = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : degrees.entrySet()) {
            if (entry.getValue() == 0) {
                queue.add(entry.getKey());
            }
        }
        
        
        // Build Sequence
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int value = queue.poll();
            list.add(value);
            List<Integer> temp = graph.get(value);
            for (int child : temp) {
                degrees.put(child, degrees.get(child) - 1);
                if (degrees.get(child) == 0)
                    queue.add(child);
            }
        }
        System.out.println(list);
        return list.size() == numCourses;
    }
}
// @lc code=end

