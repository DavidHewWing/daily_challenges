class Solution {
    /*
    check what index the zero is at.
    run a bfs adding to queue (i + arr[i], and i - arr[i])
    the bfs doesn't work i think you have to memoize. (pick what is better i+arr[i] or i-arr[i])
    but how can you tell which is better?
    find the thing closest to the nearest zero. (use a greedy algorithm);
    1. All indicies where value of zero exists into a list.
    2. We iterate through the list and run the index seeking algorithm (Basically a DFS but we choose the optimal choice at each step)
        2a. init a visited set and a queue.
        2b. pick which is closer (i + arr[i] or i - arr[i]), add the closer value to set and offer into it into queue.
        2c. if we find the same index in the queue we get out of the algorithm
        2d. else we find a zero and return true
        2e. continue for all indicies of zero in the list.
    3. at the end return false.
    */
    public boolean canReach(int[] arr, int start) {
        // this is a working brute force solution 
        // runtime is 2^n, space O(1)
        int numZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) numZeros++;
        }
        if (numZeros == 0) return false;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        int reachedStart = 0;
        while (!queue.isEmpty()) {
            int polledIndex = queue.poll();
            
            if (polledIndex == start) {
                reachedStart++;
                if (reachedStart > 1) {
                    return false;
                }
            }
            
            int polledValue = arr[polledIndex];
            if (polledValue == 0) return true;
            int upIndex = polledIndex + polledValue;
            int downIndex = polledIndex - polledValue;
            if (upIndex >= 0 && upIndex < arr.length) queue.offer(upIndex);
            if (downIndex >= 0 && downIndex < arr.length) queue.offer(downIndex);
        }
        return false;
       
    }
}