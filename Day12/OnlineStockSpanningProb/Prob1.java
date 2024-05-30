package Day12.OnlineStockSpanningProb;

import java.util.*;

public class Prob1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] ans = new int[n];
    Stack<Integer> ls = new Stack<>();
    
    for (int i = 0; i < n; i++) {
      // Pop elements from the stack while stack is not empty and stack top is less than or equal to current price
      while (!ls.isEmpty() && a[ls.peek()] <= a[i]) {
        ls.pop();
      }
      
      // If stack is empty, span is i+1 (all previous days)
      if (ls.isEmpty()) {
        ans[i] = i + 1;
      } else {
        // Otherwise, span is the difference between current index and index of last higher price
        ans[i] = i - ls.peek();
      }
      
      // Push this element index onto the stack
      ls.push(i);
    }
    
    // Print the span array
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
