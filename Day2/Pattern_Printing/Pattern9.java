package Day2.Pattern_Printing;
import java.util.*;
public class Pattern9 {
  public static void main(String[] args) {
    int n=5;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Size");
    // int n = sc.nextInt();
    for(int row=0;row<n;row++){
      for(int space=0;space<n-row-1;space++){
System.out.print("  ");
      }
      for(int star=0;star<2*row+1;star++){
        System.out.print("* ");
      }
     
      System.out.println();
    }
  }
}
