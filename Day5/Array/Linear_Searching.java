//Here we are searching an array in linear way and printing the index of the array where that element is found

package Day5.Array;

import java.util.*;

public class Linear_Searching {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    System.out.println();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {// Input
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the no to search: ");
    int s = sc.nextInt();

    int flag = 0;
    //int f = 0;
    for (int i = 0; i < a.length; i++) {// Logic
      if (a[i] == s) {
        
        flag++;
        System.out.println("This is the index where elemnt is found: " + i);
      }
 
    }
    if (flag > 0) {
      System.out.println("The element is found "+flag+" times");
    } else {
      System.out.println("Not Found");
    }
  }
}
