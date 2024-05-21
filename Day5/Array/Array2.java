package Day5.Array;

import java.util.*;

public class Array2 {
  public static void main(String[] args) {
    int a =1;
    int b=2;
    System.out.println(a+" "+b);
    // int c=a;
    // a=b;
    // b=c;

    // System.out.println(a+" "+b+" "+c);

    int a1[] = new int[2];
    System.out.println("Please enter the non: ");
    for (int i = 0; i < a1.length; i++) {
      a1[0] = a;
      a1[0] = b;
      b = a1[0];
      a = a1[1];

    }
  }
}
//a=a+b;
//b=a-b;