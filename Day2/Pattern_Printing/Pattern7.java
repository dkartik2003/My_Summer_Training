package Day2.Pattern_Printing;
import java.util.*;

public class Pattern7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int r=0;r<n;r++){
      for(int star=0;star<n;star++){//star
        if(r==0||star==0||r==n-1||star==n-1){
          System.out.print("*");

        }else{
          System.out.print(" ");
        }

      }
    
      System.out.println();
  }
    
  }
}
