import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //value -> occurence;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0));
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue(n1, n2 -> map.get(n1) - map.get(n2));
        for(int key : map.keySet()) {
            queue.offer(key);
            if(queue.size() > k) {
                queue.poll();
            }
        }
    
        ArrayList<Integer> result = new ArrayList<>(queue);
        Collections.reverse(result);
        return result;
    }
}
// @lc code=end
