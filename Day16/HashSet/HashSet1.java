package Day16.HashSet;

import java.util.HashSet;

public class HashSet1 {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    hs.add(4);
    hs.add(7);
    hs.add(5);
    System.out.println(hs);
    for(Integer i:hs){
      System.out.print(i);
    }
    System.out.println();
  }
}
