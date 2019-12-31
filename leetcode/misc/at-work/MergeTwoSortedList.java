/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode dummy = node;
        while(l1 != null || l2 != null){
            int l1val = (l1 == null) ? Integer.MAX_VALUE : l1.val;
            int l2val = (l2 == null) ? Integer.MAX_VALUE : l2.val;
            int next = 0;
            if(l1val <= l2val){
                next = l1val;
                l1 = l1.next;
            }else{
                next = l2val;
                l2 = l2.next;
            }
            dummy.next = new ListNode(next);
            dummy = dummy.next;
        }
        return node.next;
    }
}
