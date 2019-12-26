
class BackspaceCompare {

    public static boolean compare(String str1, String str2) {
      int p1 = str1.length() - 1;
      int p2 = str2.length() - 1;
      int count1 = 0;
      int count2 = 0;
      while (p1 >= 0 || p2 >= 0) {
        // count '#' and skip
        while (p1 >= 0 && (count1 > 0 || str1.charAt(p1) == '#')) {
          if (str1.charAt(p1) == '#') count1++;
          else count1--;
          p1--;
        }
        
        // count '#' and skip
        while (p2 >= 0 && (count2 > 0 || str2.charAt(p2) == '#')) {
          if (str2.charAt(p2) == '#') count2++;
          else count2--;
          p2--;
        }
  
        // this means we have done the skipping.
        // we check if they are the same.
        char char1 = p1 < 0 ? '@' : str1.charAt(p1);
        char char2 = p2 < 0 ? '@' : str2.charAt(p2);
        if (char1 != char2) return false;
        p1--;
        p2--;
      }
      return true;
    }
  
    
  }
  