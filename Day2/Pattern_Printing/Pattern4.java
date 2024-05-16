package Day2.Pattern_Printing;
import java.util.*;
public class Pattern4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int r=0;r<n;r++){
      for(int c=0;c<n-r;c++){
        System.out.print("*");
      }
      for(int s=0;s<r;s++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
