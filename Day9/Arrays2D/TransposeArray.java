package Day9.Arrays2D;

import java.util.*;

public class TransposeArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size r and c same: ");
    int r = sc.nextInt();

    int arr[][] = new int[r][r];
    for (int i = 0; i < r; i++) {// input
      for (int j = 0; j < r; j++) {
        arr[i][j] = sc.nextInt();
      }
      System.out.println();

    }
    for (int j = 0; j < r; j++) {
      for (int i = 0; j < r; j++) {
        System.out.println(arr[i][j] + "\t");
      }
      System.out.println();
    }

  }
}
