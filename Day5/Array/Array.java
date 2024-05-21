package Day5.Array;

import java.util.*;

public class Array {
  public static void main(String[] args) {
    int a[] = new int[3];
    // System.out.println(a[0]);
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");

    }

    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");

    }
    int b[] = new int[12];
    b = a;
    System.out.println();
    for(int i =0;i<b.length;i++){
System.out.println(b[i]+" ");
    }
    System.out.println(b);

  }
}
