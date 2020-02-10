/*
 * @lc app=leetcode id=406 lang=java
 *
 * [406] Queue Reconstruction by Height
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        // HashMap<Integer, List<Integer>> map = new HashMap<>();
        // for(int i = 0; i < people.length; i++) {
        //     int h = people[i][0];
        //     int k = people[i][1];
        //     if(!map.containsKey(h)){
        //         map.put(h, new ArrayList<>(Arrays.asList(k)));
        //         heap.offer(h);
        //     }else{
        //         List<Integer> list = map.get(h);
        //         list.add(k);
        //         map.put(h, list);
        //     }
        // }
        // List<int[]> result = new LinkedList<>();
        // while(!heap.isEmpty()){
        //     int h = heap.poll();
        //     List<Integer> list = map.get(h);
        //     for(int k : list){
        //         int[] arr = {h, k};
        //         result.add(k, arr);
        //     }
        // }
        // return result.toArray(new int[people.length][]);
        Arrays.sort(people,new Comparator<int[]>(){
           @Override
           public int compare(int[] o1, int[] o2){
               return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
           }
        });
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);       
        }
        return res.toArray(new int[people.length][]);
        }
}
// @lc code=end

