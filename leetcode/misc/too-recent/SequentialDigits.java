class Solution {
    /*
    Only care about the first digit, we want to increment the first digit only.
    
    */
    public List<Integer> sequentialDigits(int low, int high) {
        // retrieve digits of low and high digits
        int len1 = String.valueOf(low).length();
        int len2 = String.valueOf(high).length();
        
        List<Integer> res = new ArrayList<>();
        for(int l = len1; l <= len2; l++) {
            for(int i = 1; i + l <= 10; i++) {
                StringBuilder sb = new StringBuilder();
                int len = l, s = i;
                while(len-- > 0) sb.append(s++);
                int t = Integer.valueOf(sb.toString());
                if(t >= low && t <= high) res.add(t);
            }
        }
        return res;
    }
}