class Solution {
    /*
     * check what index the zero is at. run a bfs adding to queue (i + arr[i], and i
     * - arr[i]) the bfs doesn't work i think you have to memoize. (pick what is
     * better i+arr[i] or i-arr[i]) but how can you tell which is better? find the
     * thing closest to the nearest zero. (use a greedy algorithm); 1. All indicies
     * where value of zero exists into a list. 2. We iterate through the list and
     * run the index seeking algorithm (Basically a DFS but we choose the optimal
     * choice at each step) 2a. init a visited set and a queue. 2b. pick which is
     * closer (i + arr[i] or i - arr[i]), add the closer value to set and offer into
     * it into queue. 2c. if we find the same index in the queue we get out of the
     * algorithm 2d. else we find a zero and return true 2e. continue for all
     * indicies of zero in the list. 3. at the end return false. THIS IS ACTUALLY
     * JUST A BFS forgot the visited set before
     */
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> seen = new HashSet<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int polledIndex = queue.poll();
            int polledValue = arr[polledIndex];

            if (polledValue == 0)
                return true;

            int upIndex = polledIndex + polledValue;
            int downIndex = polledIndex - polledValue;

            if (!seen.contains(upIndex) && upIndex >= 0 && upIndex < arr.length) {
                seen.add(upIndex);
                queue.offer(upIndex);
            }
            if (!seen.contains(downIndex) && downIndex >= 0 && downIndex < arr.length) {
                seen.add(downIndex);
                queue.offer(downIndex);
            }
        }
        return false;
    }
}