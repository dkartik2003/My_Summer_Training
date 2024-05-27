package Day9.Arrays2D;

import java.util.Scanner;

public class SearchElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns resp: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int arr[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {// input
      for (int j = 0; j < columns; j++) {
        arr[i][j] = sc.nextInt();
      }
      System.out.println();

    }
    System.out.println("Enter the element which is required: ");
    int target = sc.nextInt();

    for (int i = 0; i < rows; i++) {// searching
      for (int j = 0; j < columns; j++) {
        if (target == arr[i][j])
          System.out.println("Elment is found " + arr[i][j]);
        return;
      }

    }
    System.out.println("Not Found");

    for (int i = 0; i < rows; i++) {// print
      for (int j = 0; j < columns; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();

    }

  }
}
