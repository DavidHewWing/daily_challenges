/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode current = dummy;
        int carry = 0;
        
        while (node1 != null || node2 != null) {
            int num1 = (node1 != null) ? node1.val : 0;
            int num2 = (node2 != null) ? node2.val : 0;
            int sum = carry + num1 + num2;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            node1 = (node1 != null) ? node1.next : null;
            node2 = (node2 != null) ? node2.next : null;
        }
        
        if(carry > 0) {
            current.next = new ListNode(1);
        }
        
        return dummy.next;
    }
}
// @lc code=end

