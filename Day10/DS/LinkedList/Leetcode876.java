package Day10.DS.LinkedList;

public class Leetcode876 {

      
    public static void main(String[] args) {
      Linkedlist ls = new Linkedlist();

      
    }
    class LL_Node{
      int val;
      LL_Node next;
      LL_Node(int val){
        this.val=val;
    }
    class Linkedlist{
      LL_Node head;
      LL_Node tail;
      int size;
       Linkedlist(){
        this.head=this.tail=null;
        this.size=0;
       }
       public void push(int val){
        LL_Node node=new LL_Node(val);
        if(this.head==null){
          this.head=node;
          this.tail=node;
          }else{
            this.tail.next=node;
            this.tail=node;
            }
       }

    }
  }
}
  

