package Day11.Arrays.Prefix_Sum_1D;

import java.util.*;

public class Array {
  public static void main(String[] BANDAAo) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int s = sc.nextInt();
    int a[] = new int[s];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int prefix[] = new int[s];
    prefix[0] = a[0];
    int sum = 0;
    for (int i = 0; i < s; i++) {
      // sum+=a[i];
      // prefix[sum];
      prefix[i] = prefix[i - 1] + a[i];
    }

    for (int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      if (l != 0) {
        System.out.println(prefix[r] - prefix[l - 1]);

      } else {// here if our
        System.out.println(prefix[r]);

      }

    }
  }
}
