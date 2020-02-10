class Solution {
    public String freqAlphabets(String s) {
        // go from back, add to string builder 
        // check for hashtag
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                i--;
                int num2 = Character.getNumericValue(s.charAt(i));
                i--;
                int num1 = Character.getNumericValue(s.charAt(i));
                int num = num2 + num1 * 10 + 96;
                char acsii = (char) num;
                sb.insert(0, acsii);
                i--;
            }else{
                int num = Character.getNumericValue(s.charAt(i)) + 96;
                char acsii = (char) num;
                sb.insert(0, acsii);
                i--;
            }
        }
        return sb.toString();
    }
}