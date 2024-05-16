package Day2.Pattern_Printing;
import java.util.*;
public class Pattern {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int r = 1; r <= n; r++) {
      for (int c = 1; c <= n; c++) {
        System.out.print("(row"+r+",col"+c+")");

      }
      System.out.print("\n");
    }
  }

  


}
