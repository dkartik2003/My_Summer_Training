import java.util.*;

public class QueueExample {

  public static void main(String[] args) throws new Exception{
    Queue<Integer> sc = new LinkedList<>();
    
    // Adding elements to the queue
    sc.add(10);
    sc.add(90);
    sc.add(10);
    sc.add(40);
    sc.add(45);
    sc.add(10);
    sc.add(67);
    
    // Printing the queue
    System.out.println(sc);
    
    // Removing the head of the queue
    System.out.println(sc.remove());
    
    // Polling (removing) the head of the queue and returning it
    System.out.println(sc.poll());
    
    // Viewing the head of the queue without removing it
    System.out.println(sc.peek());
  }
}
