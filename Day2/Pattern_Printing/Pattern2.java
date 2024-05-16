package Day2.Pattern_Printing;
import java.util.*;
public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int c =1;c<=r;c++){
        System.out.print("*");

      }
      System.out.println();
    }
  }
  
}
