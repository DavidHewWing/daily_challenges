class Solution {
  public int singleNonDuplicate(int[] nums) {
      if(nums.length == 1) return nums[0];
      
      int len = nums.length;
      int left = 0;
      int right = len - 1;
      
      while(left <= right && left < len && right >= 0){
          int mid = left + (right - left)/2;
          
          if((mid-1 >= 0 && nums[mid-1] == nums[mid]) || (mid + 1 < len && nums[mid+1] == nums[mid])){
              int currLen = right - left;        
              if((currLen/2) % 2 == 0){
                  if(nums[mid-1] == nums[mid]){
                      right = mid - 2;
                  }
                  else{
                      left = mid + 2;
                  }
              }
              else{
                  if(nums[mid-1] == nums[mid]){
                      left = mid + 1;
                  }
                  else{
                      right = mid - 1;
                  }
              }
          }
          else return nums[mid];
      }
      
      return nums[left];
  }
}