package Day2.Pattern_Printing;
import java.util.*;

public class Pattern8 {
  public static void main(String[] args) {
    int n=5;
    for(int r =0;r<n;r++){
    for(int stars=0;stars<r;stars++){//stars
        if(r==stars||(r+stars)==n-1){
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
    }

    
    System.out.println();
  }
}
}
