package Day6.Array;

import java.util.*;

public class SubArraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s = sc.nextInt();
    System.out.println();
    int a[] = new int[s];
    for (int i = 0; i < a.length; i++) {// input
      a[i] = sc.nextInt();

    }
    System.out.println("Enter the point k : ");
    int k = sc.nextInt();
    // int first = a[0];
    // int second = a[k];
    int sum = 0;
    for (int i = 0; i <s-k+1; i++) {
      for(int j=i;j<i+k;j++){
        sum+=a[i];
       
        // first++;
        // second++;
      }
      System.out.println("("+i+","+i+k+1+"-->"+sum);

    }

  }
}
//This particular program is of n*k time complexity
//This particular program is of O(n) space complexity