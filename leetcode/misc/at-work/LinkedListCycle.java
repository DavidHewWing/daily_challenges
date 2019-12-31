/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // fast and slow
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
    // set
//     public boolean hasCycle(ListNode head) {
        
//         if(head == null)
//             return false;
        
//         HashSet<ListNode> seen = new HashSet<>();
//         while(head.next != null){
//             if(seen.contains(head)){
//                 return true;
//             }else{
//                 seen.add(head);
//                 head = head.next;
//             }   
//         }
//         return false;
//     }
}
