class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int count = 1;
        for (int i = 0; i < n - 1; i+=2) {
            res[i] = count;
            res[i + 1] = count * -1;
            count++;
        }
        return res;
    }
}