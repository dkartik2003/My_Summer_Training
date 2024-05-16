package Day2.Pattern_Printing;

import java.util.*;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int r = 0; r <n; r++) {

      for (int c = 0; c <n-1-r; c++) {
        System.out.print("_");
        
      }
      for (int star = 0; star <r + 1; star++) {
        System.out.print("*");

      }
      System.out.println();
    }
  }
}
