class ListNode {
    int value = 0;
    ListNode next;
  
    ListNode(int value) {
      this.value = value;
    }
  }
  
  class LinkedListCycleStart {
  
    public static ListNode findCycleStart(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      int k = 0;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
          k = cycleLength(slow);
          break;
        }
      }
  
      ListNode p1 = head;
      ListNode p2 = head;
      for (int i = 0; i < k; i++) {
        p2 = p2.next;
      }
      while (p1 != p2) {
        p1 = p1.next;
        p2 = p2.next;
      }
      return p1;
    }
  
    public static int cycleLength(ListNode slow) {
      ListNode current = slow;
      int cycleLength = 0;
      do {
        current = current.next;
        cycleLength++;
      } while (current != slow);
      return cycleLength;
    }
  
    public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(6);
  
      head.next.next.next.next.next.next = head.next.next;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
  
      head.next.next.next.next.next.next = head.next.next.next;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
  
      head.next.next.next.next.next.next = head;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
    }
  }