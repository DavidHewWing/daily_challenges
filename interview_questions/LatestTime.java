public class Main
{
	public static void main(String[] args) {
		System.out.println(solution("??:1?"));
	}
	
	public static String solution(String T) {
	    
	    char[] chars = T.toCharArray();
	    
	    // check the first hour
        if(chars[0] == '?') {
            if(chars[1] == '?') {
                chars[0] = '2';
                chars[1] = '3';
            }else if(chars[1] - '0' > 3){
                chars[0] = '1';
            }else{
                chars[0] = '2';
            }
        }
        
        if(chars[1] == '?'){
            if(chars[0] == '?'){
                chars[0] = '2';
                chars[1] = '3';
            } else if(chars[0] - '0' == 2) {
                chars[1] = '3';
            } else {
                chars[1] = '9';
            }
        }
        
        if(chars[3] == '?') {
            chars[3] = '5';
        }
        
        if(chars[4] == '?'){
            chars[4] = '9';
        }
        
        
	    return String.valueOf(chars);
	}
	
}
