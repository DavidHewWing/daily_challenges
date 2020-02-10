class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int i = 0;
        for (int[] nums : queries) {
            int x = 0;
            for (int j = nums[0]; j <= nums[1]; j++) {
                if (j == nums[0]) {
                    x = arr[j];
                    continue;
                }
                x ^= arr[j];
            }
            result[i] = x;
            i++;
        }
        return result;
    }
}