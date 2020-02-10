/*
Given the following details of a matrix with n columns and 2 rows :

The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
The sum of elements of the 0-th(upper) row is given as upper.
The sum of elements of the 1-st(lower) row is given as lower.
The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
Your task is to reconstruct the matrix with upper, lower and colsum.

Return it as a 2-D integer array.

If there are more than one valid solution, any of them will be accepted.

If no valid solution exists, return an empty 2-D array.
*/

class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        List<Integer> upList = new ArrayList<>();
        List<Integer> loList = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            int sum = colsum[i];
            if(sum == 2){
                upList.add(1);
                loList.add(1);
                lower--;
                upper--;
            }else if(sum == 1){
                if(lower > upper){
                    loList.add(1);
                    upList.add(0);
                    lower--;
                }else{
                    upList.add(1);
                    loList.add(0);
                    upper--;
                }
            }else{
                upList.add(0);
                loList.add(0);
            }
        }
        if(upper != 0 || lower != 0){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(upList);
        res.add(loList);
        return res;
    }
}