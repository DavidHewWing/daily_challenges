class Solution {

    public static void main(String args[]){
        System.out.println(max("??:??"));
    }

    private static char[] max(String input) {
        char[] arr = input.toCharArray();
        char[] res = new char[5];

        if(arr[1] == '?'){
            res[1] = (arr[0] == '?' || arr[0] == '2') ? '3' : '9';
        }

        if(arr[0] == '?'){
            res[0] = (arr[1] <= '3' || arr[1] == '?') ? '2' : '1';
        }

        if(arr[3] == '?'){
           res[3] = '5';
        }
        if(arr[4] == '?'){
            res[4] = '9';
        }
        res[2] = ':';
        return res;
    }

}