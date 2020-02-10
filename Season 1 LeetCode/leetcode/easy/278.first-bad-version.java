/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1, end = n;
            while (start < end) {
                int mid = start + (end-start) / 2;
                if (!isBadVersion(mid)) start = mid + 1;
                else end = mid;
                System.out.println(start);
            }        
        return start;
        }
    }
// @lc code=end

