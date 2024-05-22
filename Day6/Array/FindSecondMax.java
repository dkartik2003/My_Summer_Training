package Day6.Array;

import java.util.*;

public class FindSecondMax {
  public static void main(String[] args) {
    int max1 = 0;
    int max2= -1;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
  if(max1<a[i]){
    max2=max1;
    max1=a[i];
  }
  else if(max2<a[i]&&max1!=a[i]){
    max2=a[i];
  }

      }
    
    System.out.println("Max1: " + max1);
    System.out.println("Max2: " + max2);

  }
}
