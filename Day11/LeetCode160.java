package Day11;

public class LeetCode160 {
  
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
    }
 }
 

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode i=headA;
      ListNode j=headB;
      while(i!=j){
          if(i==null){
              i=headA;

          }else{
              i=i.next;


          }
          if(j==null){
              j=headB;

          }
          else{
              j=j.next;
          }
      }
  return i;//here we can also return j if we want
  }
}