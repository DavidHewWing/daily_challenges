import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(solution(new int[]{1,4,3,2,5}, 4)));
    }

    public static int[] solution(int[] A, int K) {

        if(K > A.length || A.length == 0) {
            return null;
        }

        if(K == A.length) {
            return A;
        }

        // partition
        ArrayList<Integer[]> subArrays = new ArrayList<>();
        for(int i = 0; i <= A.length - K; i++) {
            System.out.println(Integer.toString(i));
            Integer[] temp = new Integer[K];
            int k = 0;
            int s = i;
            for(int j = 0; j < K; j++) {
                temp[k] = A[s];
                k++;
                s++;
            }
            subArrays.add(temp);
        }

        // for(int i=0;i<subArrays.size();i++){
        //     System.out.println(Arrays.toString(subArrays.get(i)));
        // }

        Integer[] max = subArrays.get(0);
        for(int i = 1; i < subArrays.size(); i++) {
            Integer[] temp = subArrays.get(i);
            System.out.println(Arrays.toString(temp));
            for(int j = 0; j < max.length; j++){
                Integer value = max[j];
                Integer compareWith = temp[j];
                if(compareWith != value) {
                    if(compareWith < value) {
                        break;
                    } else {
                        max = temp;
                    }
                }
            }
        }

        return Arrays.stream(max).mapToInt(Integer::intValue).toArray();
    } 

}