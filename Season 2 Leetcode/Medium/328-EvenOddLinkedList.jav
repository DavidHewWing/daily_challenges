/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // NOT O(1) SPACE

class SolutionBad {
  public ListNode oddEvenList(ListNode head) {
      ListNode oddList = new ListNode(0);
      ListNode evenList = new ListNode(0);
      ListNode oddDummy = oddList;
      ListNode evenDummy = evenList;
      int count = 1;
      while (head != null) {
          if (count % 2 == 0) {
              evenList.next = new ListNode(head.val);
              evenList = evenList.next;
              head = head.next;
          } else {
              oddList.next = new ListNode(head.val);
              oddList = oddList.next;
              head = ahead.next;
          }
          count++;
      }
      oddList.next = evenDummy.next;
      return oddDummy.next;
  }
}

// O(1) Space
public class SolutionGood {
  public ListNode oddEvenList(ListNode head) {
      if (head != null) {
      
          ListNode odd = head, even = head.next, evenHead = even; 
      
          while (even != null && even.next != null) {
              odd.next = odd.next.next; 
              even.next = even.next.next; 
              odd = odd.next;
              even = even.next;
          }
          odd.next = evenHead; 
      }
      return head;
  }
}
