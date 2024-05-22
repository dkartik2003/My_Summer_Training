package Day6.Array;

import java.util.Scanner;

public class MaxLimit100000 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println();
    // if(n<10^5){
    // System.out.println("Yes valid size");

    // }else{
    // System.out.print("Enter a valid size");
    // }
    int a[] = new int[n];
    int aux[] = new int[100000+ 1];

    for (int i = 0; i < n; i++) {// input and print
      a[i] = sc.nextInt();
    }
   
    for (int i = 0; i <n; i++) {
      int val = a[i];
      aux[val] = aux[val] + 1;

    }
    for (int i = 0; i < aux.length; i++) {
      if (aux[i] > 0) {
        System.out.println(i + " - " + aux[i]);
      }
    }

  }
}
