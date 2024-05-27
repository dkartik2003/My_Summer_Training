package Day9.Arrays2D;

import java.util.Scanner;

public class SnakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns respectively: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print array elements in the required order
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Print row in normal order
                for (int j = 0; j < columns; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Print row in reverse order
                for (int j = columns - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
