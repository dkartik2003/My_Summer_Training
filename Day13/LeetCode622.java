public class LeetCode622 {

  int arr[];
  int front = 0;
  int rear = -1;
  int size = 0;

  public LeetCode622(int k) {
      arr = new int[k];
  }

  public boolean enQueue(int value) {
      if (isFull()) {
          return false;
      }
      rear = (rear + 1) % arr.length;
      arr[rear] = value;
      size++;
      return true;
  }

  public boolean deQueue() {
      if (isEmpty()) {
          return false;
      }
      front = (front + 1) % arr.length;
      size--;
      return true;
  }

  public int Front() {
      if (isEmpty()) {
          return -1;
      }
      return arr[front];
  }

  public int Rear() {
      if (isEmpty()) {
          return -1;
      }
      return arr[rear];
  }

  public boolean isEmpty() {
      return size == 0;
  }

  public boolean isFull() {
      return size == arr.length;
  }

  public static void main(String[] args) {
      LeetCode622 circularQueue = new LeetCode622(5); // Initialize queue with size 5

      System.out.println(circularQueue.enQueue(10));  // Returns true
      System.out.println(circularQueue.enQueue(20));  // Returns true
      System.out.println(circularQueue.enQueue(30));  // Returns true
      System.out.println(circularQueue.enQueue(40));  // Returns true
      System.out.println(circularQueue.Rear());       // Returns 40
      System.out.println(circularQueue.isFull());     // Returns false
      System.out.println(circularQueue.deQueue());    // Returns true
      System.out.println(circularQueue.enQueue(50));  // Returns true
      System.out.println(circularQueue.Rear());       // Returns 50
  }
}
