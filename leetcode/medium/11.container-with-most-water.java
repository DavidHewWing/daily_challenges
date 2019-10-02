/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start

/*
Brute-Force:
You loop through each value in the array and calculate the area.
Keep track of max area.
*/

import java.lang.Math;

class Solution {
    public int maxArea(int[] height) {
        // if(height.length == 2) {
        //     return Math.min(height[0], height[1]) * 1;
        // }
        // int indexFront = height.length / 2; // indexes
        // int indexBack = height.length / 2;
        // int max = Math.min(height[indexFront], height[indexBack]) * (indexBack - indexFront);
        // boolean towardsBack = true;

        // while(true) {
        //     if(towardsBack && indexBack < height.length - 1){
        //         indexBack++;
        //         int area = Math.min(height[indexFront], height[indexBack]) * (indexBack - indexFront);
        //         System.out.println(Integer.toString(area));
        //         if(area > max || indexBack == height.length - 1) {
        //             if(indexFront != 0) towardsBack = false;
        //             max = area;
        //         }
        //     }else if(!towardsBack && indexFront > 0){
        //         indexFront--;
        //         int area = Math.min(height[indexFront], height[indexBack]) * (indexBack - indexFront);
        //         if(area > max && indexFront > -1 ) {
        //             if(indexBack != height.length -1) 
        //             towardsBack = true;
        //             max = area;
        //         }
        //     }else{
        //         break;
        //     }
        // }
        int front = 0;
        int back = height.length -1;
        int max = 0;
        while (front < back) {
            int area = Math.min(height[front], height[back]) * (back - front);
            if (height[front] > height[back]) {
                back--;
            }else{
                front++;
            }
            if(area > max) {
                max = area;
            }
        }
        return max;
    }
}
// @lc code=end

