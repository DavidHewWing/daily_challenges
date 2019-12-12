class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 1; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i); // odd
            int len2 = expandAroundCenter(s, i - 1, i); // even
            if(len1 > max){
                max = len1;
                start = i - len1 /2;
                end = i + len1 / 2;
            }
            if(len2 > max){
                max = len2;
                start = i - len2 / 2;
                end = i - 1 + len2 / 2;
            }   
        }
        return s.substring(start, end + 1);
    }
    
    /*
    * return the longest string
    */
    private int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
