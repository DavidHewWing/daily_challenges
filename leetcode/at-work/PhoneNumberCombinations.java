class Solution {
    public String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits == null){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        helper(digits, "", 0, list);
        return list;
    }
    public void helper(String digits, String current, int len, List<String> list){
        if(len >= digits.length()){
            list.add(current);
            return;
        }
        String letterString = letters[digits.charAt(len) - '0'];
        for(int i = 0; i < letterString.length(); i++){
            helper(digits, current + letterString.charAt(i), len + 1, list);
        }
    }
}
