class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabetS = new int[26];
        int[] alphabetT = new int[26];
        for(int i = 0; i < s.length(); i++){
            alphabetS[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            alphabetT[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < alphabetS.length; i++){
            if(alphabetS[i] != alphabetT[i])
                return false;
        }
        return true;
    }
}
