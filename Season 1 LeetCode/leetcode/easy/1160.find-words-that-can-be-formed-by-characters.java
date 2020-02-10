/*
 * @lc app=leetcode id=1160 lang=java
 *
 * [1160] Find Words That Can Be Formed by Characters
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] alphabet = new int[26];
        char[] arr = chars.toCharArray();
        boolean add = true;
        //add to alphabet array;
        for(int i = 0; i < arr.length; i++){
            alphabet[arr[i]-'a']++;
        }
        
        for(int i = 0; i < words.length; i++){
            add = true;
            int[] temp = Arrays.copyOf(alphabet, 26);
            for(char c : words[i].toCharArray()){
                temp[c - 'a']--;
                if(temp[c - 'a'] < 0){
                    add = false;
                    break;
                }
            }
            if(add)
                sum += words[i].length();
        }
        return sum;
    }
}
// @lc code=end

