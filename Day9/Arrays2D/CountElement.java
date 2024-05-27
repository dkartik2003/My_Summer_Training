package Day9.Arrays2D;

import java.util.Scanner;

public class CountElement {
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

    for (int i = 0; i < rows; i++) {// print
      for (int j = 0; j < columns; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();

    }
    int count = 0;
    for (int i = 0; i < rows; i++) {// logic
      for (int j = 0; j < columns; j++) {
        if (target == arr[i][j])
          count++;

      }
      System.out.println();

    }
    if (count > 0) {
      System.out.println("Element found");

    } else {
      System.out.println("Not Found");
    }
    System.out.println("The number of times " + count + " found is " + target);

  }
}
