package Day10.DS.LinkedList;

import Day10.DS.LinkedList.SingleLLImp;

public class SingleLLImp {

  public static void main(String args[]) throws Exception{
    Linkedlist ls = new Linkedlist();
    ls.addAtEnd(1);
    ls.addAtEnd(2);
    ls.addAtEnd(3);
    System.out.println(ls.size);
    ls.display();
    ls.atAtBegining(0);
    ls.display();
    ls.addAtIndex(2, 41);
    ls.display();
    ls.deleteAtbeginning();
    ls.display();
    ls.deleteAtIndex(2);
    ls.display();
    ls.findElementOfIndex();

  }
}

class LL_node {
  int val;
  LL_node next;

  public LL_node(int val) {
    this.val = val;
  }
}

class Linkedlist {
  LL_node head;
  LL_node tail;
  int size;

  public Linkedlist() {
    this.head = this.tail = null;
    this.size = 0;
  }

  public void addAtEnd(int val) {
    LL_node node = new LL_node(val);
    if (this.head == null) {// if no node is present
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
    size++;
  }

  public void atAtBegining(int val) {
    LL_node node = new LL_node(val);
    if (this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      node.next = this.head;
      this.head = node;
    }
    size++;
  }

  public void addAtIndex(int ind, int val) {
    size++;
    LL_node node = new LL_node(val);
    int count = 0;
    LL_node temp = this.head;
    LL_node prev = null;
    while (count < (ind - 1)) {
      temp = temp.next;
      count++;
    }
    prev = temp;
    node.next = prev.next;
    prev.next = node;

  }

  public void deleteAtbeginning() {
    if (this.head == null)
      return;
    this.size--;
    this.head = this.head.next;
  }

  public void deleteAtIndex(int ind) {
    LL_node temp = this.head;
    int count = 0;
    while (count < (ind - 1)) {
      temp = temp.next;
      count++;
    }
    LL_node prev = temp;
    prev.next = prev.next.next;
    size--;
  }

  public int findElementOfIndex(int ind) throws Exception{
    LL_node temp = this.head;
    int count = 0;
    while (temp != null && count < ind) {
        temp = temp.next;
        count++;
    }
    if (temp == null) {
        throw new IndexOutOfBoundsException("Index " + ind + " is out of bounds");
    }
    return temp.val; // Assuming the node has a value field
}


  public int findMidElements(int ind){
    LL_node sp=this.head;
    LL_node temp=this.head;
    LL_node fp=this.head;
    int count=0;
    while(fp.next!=null&&fp!=null){
      sp=this.head.next;
      fp=this.head.next.next;
    }
return sp.next;
  }

  public void display() {
    LL_node temp = this.head;
    while (temp != null) {
      System.out.print(temp.val + "->");
      temp = temp.next;
    }
    System.out.println();

  }
}
/*
 * 1. Adding Node at end
 * 2. Adding at Beginning
 * 3. Adding at an index
 */
