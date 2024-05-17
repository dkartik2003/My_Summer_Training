package Day3.Pattern_Printing;
import java.util.*;
public class Pattern1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
for(int row=1;row<=n;row++){
  for(int spaces=1;spaces<=row;spaces++){
    System.out.print("  ");

  }
  for(int stars=1;stars<=2*(n-row)-1;stars++){
System.out.print("* ");
  }
  System.out.println();
  }
}
}
