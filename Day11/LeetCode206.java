package Day11;

import Day11.LeetCode160.ListNode;

public class LeetCode206 {

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }
}

