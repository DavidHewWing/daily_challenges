package Easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode middleNode(ListNode head) {
      ListNode dummy = head;
      ListNode current = head;
      int count = 0;
      while (current != null) {
          count++;
          current = current.next;
      }
      count = count / 2;
      while (count > 0) {
          dummy = dummy.next;
          count--;
      }
      return dummy;
  }
}