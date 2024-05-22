//




package Day6.Array;

import java.util.Scanner;

public class RotationOfArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s = sc.nextInt();
    System.out.println();
    int a[] = new int[s];
    int aux[] = new int[s * 2];
    for (int i = 0; i < a.length; i++) {// input
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the point k : ");
    int k = sc.nextInt();
   
    for (int i = 0; i < 2 * s; i++) {
      aux[i] = a[i % s];//here we had a possiblity that we get arraysoutofbound exception we are using % s for this this is the mainlogic to store the elements in the array
    }
    for (int i = 0 + k; i < k + s; i++) {
      System.out.print(aux[i]+"  ");

    }

   

  }
}
