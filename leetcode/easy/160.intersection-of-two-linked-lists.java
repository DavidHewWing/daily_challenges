/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        
        // find lengths
        ListNode dummy = headA;
        while (dummy != null) {
            lenA++;
            dummy = dummy.next;
        }
        dummy = headB;
        while (dummy != null) {
            lenB++;
            dummy = dummy.next;
        }
        
        
        // align starting points
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }
        
        // iterates to check intersection
        while (headA != null || headB != null) {
            if (headA == headB) 
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
// @lc code=end

