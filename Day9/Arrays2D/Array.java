package Day9.Arrays2D;

import java.util.*;

public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns resp: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int arr[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {//input
      for (int j = 0; j < columns; j++) {
        arr[i][j]=sc.nextInt();
      }
      System.out.println();

    }
    for (int i = 0; i < rows; i++) {//print
      for (int j = 0; j < columns; j++) {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();

    }

  }

}
