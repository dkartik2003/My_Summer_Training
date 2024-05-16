package Day2.Pattern_Printing;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < r; c++) {//spaces
        System.out.print(" ");
      }
      for (int s = 0; s <n-r; s++) {//stars
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
