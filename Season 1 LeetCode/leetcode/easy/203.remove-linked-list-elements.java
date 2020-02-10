/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
/*
1. Have to keep pointer and whenever we see the next value to be val, we make the next the 2 infront.
2. Make sure the first couple of values aren't val.

 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }
}
// @lc code=end

