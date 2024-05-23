package Day7.Sliding_Window;

import java.util.Scanner;

public class FindSumBySubarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s = sc.nextInt();
    int a[] = new int[s];
    for (int i = 0; i < s; i++) {// Input
      a[i] = sc.nextInt();

    }
    System.out.println();

    System.out.println("Enter the sum needed to find ");
    int ts = sc.nextInt();// ts=targetSum
    int sum = 0;// sum=currentSum

    int i = 0;
    int j = 0;
    while (i >= j) {
      if (sum < ts) {
        sum += a[i];
        i++;

      } else if (sum > ts) {
        sum -= a[j];
        j++;

      } else {
        System.out.println((j) + "    " + (i-1));
        break;
      }
    }
    

    

  }

}
