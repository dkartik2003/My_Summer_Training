package Day10.DS.Stack;

public class Stack2 {// Stack with help of array

  protected int a[];
  int index = -1;

  Stack2() {
    a = new int[5];
  }

  Stack2(int n) {
    a = new int[n];
  }

  public void display() {
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");
    }
  }

  public boolean isEmpty() {
    return index == -1;

  }

  public void push(int element) throws Exception {
    if (isFull()) {
      throw new Exception("The Stack is full");
    }

    index++;
    a[index] = element;
  }

  public int pop(int element) throws Exception {
    if (isEmpty()) {
      throw new Exception("The Stack is in underflow condition/no values are presents atall");
    }
    int rv = a[index];
    index--;
    return rv;
  }

  public int size() {

    return index + 1;
  }

  public int pick() {
    int rv = a[index];
    return rv;
  }

  public boolean isFull() {

    return index + 1 == a.length - 1;

  }

  public static void main(String[] args) throws Exception {
    Stack2 sc = new Stack2();
    sc.push(3);
    sc.push(98);

    sc.push(4);
    sc.display();

  }

}
