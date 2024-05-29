package Day10.DS.Stack;

import java.util.*;

public class Stack1 {
 
    public static void main(String[] args) {
      
      Stack<Integer> sc = new Stack<>();
      System.out.println(sc.isEmpty());
      sc.push(55);
      sc.push(55);
      sc.push(55);
      sc.push(57);
      sc.push(905);
      sc.push(55);
      System.out.println(sc);
      System.out.println(sc.size());
      System.out.println(sc.pop());
      System.out.println(sc.size());
      System.out.println(sc.push(34));
      System.out.println(sc.isEmpty());
      System.out.println(sc);
    }
}
