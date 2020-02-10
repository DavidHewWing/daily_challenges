class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(true){
            int sum = 0;
            while(n > 0){
                int temp = n % 10;
                n /= 10;
                sum += temp * temp;
            }
            n = sum;
            if(seen.contains(sum))
                return false;
            if(sum == 1)
                return true;
            seen.add(n);
        }
    }
}
